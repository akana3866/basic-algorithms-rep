//Lecture 2 Class Code
class Fac1{
	static int fac1(int n){ //static allows methods to be run within a class
		if(n<2) return n;
		return n*fac1(n-1);
	}
	//prints factorial method
	public static void main(String[] blah){
		int ss = Integer.valueOf(blah[0]);
		int nn = Integer.valueOf(blah[1]);
		System.out.printf("" + fac1(nn)); //"" + any variable type automatically makes it a string
	}

}
class Max{
	static int max(int[]A){
		int m=A[0];
		for(int i=1; i < A.length; i++)
			if(m< A[i]) m=A[i];
		return m;
	}
	public stat void main(String[] argv){
		int ss = (argv.length>0) ? Integer.parseInt(argv[0]) : 0;
		int nn = (argv.length>1) ? Integer.parseInt(argv[1]) : 10;

		//get a random number generator "rg"
		Random rg = (ss==0) ? new Random() : new Random(ss):

		//generate a random array A
		int[] A = new int[nn];
		for(int i=0; i < nn; i++)
			A[i] = rg.nextInt(99);

		//show A
		System.out.print("\n A = [" + A[0]);
		for(int i = 0; i < nn; i++)
			System.out.printf("," + A[i]);
		System.out.printf("Max(A) = " + max(A));
	}
}

//Lecture 3 Class Code (Trees)
//code layout for trees
class Node {
KeyType guide;
// guide points to max key in subtree rooted at node
}
class InternalNode extends Node {
Node child0, child1, child2;
// child0 and child1 are always non-null
// child2 is null iff node has only 2 children
}
class LeafNode extends Node {
// guide points to the key
ValueType value;
}