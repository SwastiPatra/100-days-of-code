ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);   //set all elements of B which is double the size of A to zero.

        //According to example {5,10,2,1} has a size of 4
        for (int i = 0; i < A.size(); i++) {  
         //B.set(0,get(0)) i.e. B.set(0,5)
                B.set(i, A.get(i));
         //B.set(0+4,A.get(4%6) = 4
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
}
