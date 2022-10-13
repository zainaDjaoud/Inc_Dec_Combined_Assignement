package automation_code_9th_October_2022;

public class Inc_Dec_combined {

	public static void main(String[] args) {
		int i = 1;
		int j = ++i - --i;
	// i=        2      1
	// j=     1+1   -  1
	// i=1     j = 1 
		int k = j-- - --i +  i-- - --j;
	// i=             0      -1
	// j=       0                 -1
	// k=       -1  -  -2 +  -1 - -2
	// i=-1   j=-1    k=2
		
		int l = --k - k-- + i-- - --i + j++ - --j;
	// i=                  -2     -3
	// j=                               0     -1
	// k=       1     0 
	// l=      -1  -  0   + -3 -  -4  + 0  -  -2
	// i= -3   j=-1   k=0   l=2
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
