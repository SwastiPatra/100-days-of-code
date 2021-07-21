ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        //A.size() is 3
        for (int i = 0; i < 3; i++) {
            B.add(new ArrayList<Integer>());

            //First Loop i = 0; A.get(0).size() = 4; Four elements in first index of array list
            for (int j = 0; j < 4; j++) {
                B.get(0).add(0); //Setting all elements to zeros
            }

            for (int j = 0; j < 4; j++) {
                B.get(0).set(4 - 1 - j, A.get(0).get(j));
                //For j = 0
                // B.get(0).set(3, 1); //A.get(0).get(0) = 1

                //For j = 1
                B.get(0).set(2, 2); //A.get(0).get(1) = 2

                //For j = 2
                B.get(0).set(1, 3); // A.get(0).get(2) = 3


                //For j = 3
                B.get(0).set(0, 4); //A.get(0).get(3) = 4
            }

            //At the end of above loop B=[[4, 3, 2 ,1]]
        }
        return B;
}
