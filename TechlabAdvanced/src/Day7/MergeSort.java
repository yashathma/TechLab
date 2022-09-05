package Day7;

public class MergeSort {

	public static void main(String[] args) {
		int array[]= {1234,123,41,341,234,123,412,34,123,412,34,123,423,6,467,56,86780,7890,678,657,456,345,234,52,34};
		System.out.println("Before Sorting:");
		System.out.println();
		print(array);
		MergeSort s=new MergeSort();
		s.mergeSort(array, 0, array.length-1);
		System.out.println();
		System.out.println();
		System.out.println("After Sorting:");
		System.out.println();
		print(array);

	}

	private void mergeSort(int[] array,int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			mergeSort(array,l,m);
			mergeSort(array,m+1,r);
			merge(array,l,m,r);
		}
	}

	private void merge(int[] array, int l, int m, int r) {
		int n1=m-l+1;
		int n2=r-m;
		int L[]= new int [n1];
		int R[]= new int [n2];
		for(int i=0;i<n1;i++) {
			L[i]=array[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=array[m+1+j];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(L[i]<=R[j]) {
				array[k]=L[i];
				i++;
			}else {
				array[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			array[k]=L[i];
			k++;
			i++;
		}
		while(j<n2) {
			array[k]=R[j];
			j++;
			k++;
		}
	}

	private static void print(int[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
