package Arrays;

import java.util.Scanner;

public class Arrays077 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				int[] a = new int[5];
				for (int i = 0; i < a.length; i++) {
					a[i] = scan.nextInt();
				}
				for (int i = a.length - 1; i >= 0; i--) {
					System.out.println(a[i]);
				}
			}
		}