package FunctionalInterfaceAndLambda;


interface ArrayProcessor{
	double apply(double[] array);
	
}





public class ArrayService {
	
	public static final ArrayProcessor counter(double value) {
		return array->{
			int count=0;
			for(int i=0;i<array.length;i++) {
				if(array[i]==value)
					count+=1;
			}
			return count;
		};
	}
	
	public static final ArrayProcessor maxer=array->{
		double max = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		return max;
	};
	
	public static final ArrayProcessor miner=array->{
		double min = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min=array[i];
		}
		return min;
	};
	
	public static final ArrayProcessor summer=array->{
		double sum = 0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	};
	
	
	public static final ArrayProcessor averager=array->{
		double total=0;
		double result=0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
			result = total/array.length;
		}
		return result;
	};
	
	public static void main(String args[]) {
		double[] firstList = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double[] secondList = { 17.0, 3.14, 17.0, -3.4, 17.0, 42.0, 29.2, 3.14 };
        
        System.out.println("Sum of first list: " 
                                                 + summer.apply(firstList) );
        System.out.println("Average of first list: " 
                                                 + averager.apply(firstList) );
        System.out.println("Minimum of second list: " 
                                                 + miner.apply(secondList) );
        System.out.println("Maximum of second list: " 
                                                 + maxer.apply(secondList) );
        
        System.out.println();
        
        System.out.println("Count of 17.0 in second list is: " 
                                                 + counter(17.0).apply(secondList) );
        System.out.println("Count of 20.0 in second list is: " 
                                                 + counter(20.0).apply(secondList) );
        System.out.println("Count of 5.0 in first list is: " 
                                                 + counter(5.0).apply(firstList) );
        
	}

}
