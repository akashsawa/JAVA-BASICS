package tester;

import static com.app.core.BankAccount.sdf;
import static utils.CollectionUtils.populateMap;
import static utils.CollectionUtils.populateSampleData;
import static utils.ValidationUtils.convertType;
import static utils.ValidationUtils.validateBalance;
import static java.util.Map.Entry.comparingByValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.BankAccount;

import custom_exception.AccountHandlingException;

public class TestBankAccountMap {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init DS
			HashMap<Integer, BankAccount> acctMap = populateMap(populateSampleData());
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Create A/C 2. Display All 3.Fetch A/C Summary 4.Transfer Funds "
						+ "5 : Close A/C  6 : Sort as per asc acct no 7.Sort as per desc acct no 8. Sort as per creation date 100. Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // create a/c
						System.out.println(
								"Enter A/C details : acctNo, customerName,  type,  creationDate,  balance 	 ifsc) ");
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						// chk if dup key ???
						if (acctMap.containsKey(acctNo)) // work perfectly!!!!! int ->Integer (Integer's hashCode --->
															// derives BID --> in case of non empty bucket : Integer's
															// equals method
							throw new AccountHandlingException("Dup acct no!!!!!");
						// new key
						System.out
								.println(acctMap.put(acctNo, new BankAccount(acctNo, sc.next(), convertType(sc.next()),
										sdf.parse(sc.next()), validateBalance(sc.nextDouble()), sc.next())));

						break;
					case 2:// display all acct details
//						System.out.println(acctMap);// Map's toString {k1:v1,k2:v2....}
						// rets instance of the class that imple. Collection i/f
						// HashMap$Values has imple. Collection i/f
						System.out.println(acctMap.values().getClass().getName());
						for (BankAccount a : acctMap.values())// Collection<BankAccount>

							System.out.println(a);
						break;
					case 3:// Fetch A/C Summary
						System.out.println("Enter acct no , to fetch the summary");
						BankAccount bankAccount = acctMap.get(sc.nextInt());
						if (bankAccount == null)
							throw new AccountHandlingException("Invalid a/c no !!!!!!");
						System.out.println("A/C summary " + bankAccount);
						break;

					case 4: // transfer funds
						System.out.println("Enter src dest a/c no n transfer amount");
						BankAccount src = acctMap.get(sc.nextInt());
						if (src == null)
							throw new AccountHandlingException("Invalid src a/c no !!!!!!");
						BankAccount dest = acctMap.get(sc.nextInt());
						if (dest == null)
							throw new AccountHandlingException("Invalid dest a/c no !!!!!!");
						// src n dest a/c : valid
						src.transferFunds(dest, sc.nextDouble());

						break;
					case 5:
						System.out.println("Enter a/c no to close account");
						// remove by key : remove(key)
						bankAccount = acctMap.remove(sc.nextInt());// auto boxing : O(1)
						if (bankAccount == null)
							throw new AccountHandlingException("Invalid  a/c no !!!!!!");
						System.out.println("Closed A/c " + bankAccount);
						break;

					case 6: // Display bank account details sorted as per asc order of acct nos.
						//sorting criteria : key based ---map based soln ---TreeMap
						//natural order : Comparable based
						//TreeMap() 
						// TreeMap(Map<? extends K,? extends V> srcMap) : copies all entries from specified map ,
						//by invoking Key(Integer)'s compareTo 
						//TreeMap(Comparator<? super K> comp)
						TreeMap<Integer, BankAccount> treeMap1 = new TreeMap<>(acctMap);
						System.out.println("Accounts sorted as per asc acct no");
//						for (BankAccount a : treeMap1.values())
//							System.out.println(a);
						//replace this imperative style code by func prog (WHAT)
						//display sorted acct details on separate lines
						//Func method : void accept​(T t, U u)
						treeMap1.forEach((k,v) -> System.out.println(v));
						
						break;
					case 7: // Display bank account details sorted as per desc order of acct nos.
						// sorting : key based => TreeMap
						//Natural or custom order : desc
						// TreeMap(Comparator<? super K> comp)
//						TreeMap<Integer, BankAccount> treeMap2 = new TreeMap<>(new Comparator<Integer>() {
//
//							@Override
//							public int compare(Integer o1, Integer o2) {
//								System.out.println("in compare : desc acct no");
//								return o2.compareTo(o1);
//							}
//
//						});
//						System.out.println(treeMap2);// {}
//						treeMap2.putAll(acctMap);// copies entries from HM , ano inner's compare 
//						for (BankAccount a : treeMap2.values())
//							System.out.println(a);
						//Comparator : int compare​(T o1, T o2)
						//1. TreeMap : comp 
						//function literal
						Comparator<Integer> intComp=(i1,i2) -> i2.compareTo(i1);
						TreeMap<Integer,BankAccount> treeMap2=new TreeMap<>(intComp);
						treeMap2.putAll(acctMap);						
						//2. display map : forEach
						treeMap2.forEach((k,v) -> System.out.println(v));

						break;
					case 8: // sorting based upon value based criteria : date
						// HM ---> Collection (values)
						Collection<BankAccount> acctCollection=acctMap.values();
						//Copy coll of refs into ANY List : ctor
						ArrayList<BankAccount> list=new ArrayList<>(acctCollection);
						//Collections.sort(List<T> list,Comparator<? super T> comp)
//						Collections.sort(list,new Comparator<BankAccount>() {
//
//							@Override
//							public int compare(BankAccount o1, BankAccount o2) {
//								System.out.println("in comp : date based");
//								return o1.getCreationDate().compareTo(o2.getCreationDate());
//							}
//							
//						});
//						System.out.println("Bank Accts as per date");
//						for(BankAccount a : list)
//							System.out.println(a);
						
						Comparator<BankAccount> acctComp=(acct1,acct2) -> acct1.getCreationDate().
								compareTo(acct2.getCreationDate());
						Collections.sort(list,acctComp);
						list.forEach((acct) -> System.out.println(acct));					
						
						
//						//Functional style code (little complex !!!!!!)
//						Comparator<BankAccount> acctComp = (a1, a2) -> a1.getCreationDate()
//								.compareTo(a2.getCreationDate());
//						acctMap.entrySet().stream().sorted(comparingByValue(acctComp))
//								.forEach(entry  -> System.out.println(entry.getValue()));
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();

			}

		}

	}

}
