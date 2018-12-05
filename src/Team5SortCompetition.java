public class Team5SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length - 1; j++)
            {
                if (arr[i] > arr[j])
                {
                    a = arr[i];
                    b = arr[j];
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
        if(arr.length % 2 > 0)
            return (arr[arr.length / 2] + arr[(arr.length / 2) + 1]) / 2;
        return arr[arr.length / 2];
    }

    public int challengeTwo(String[] arr, String query)
    {
        /**
         * We're doing a generic insertion sort, for correctness. May go back with new sorts later. arr is 10,000 elements long.
         * arr[] string lengths are 5.
         * @param arr
         * @param query
         * @return -1 if query is not an element in arr.
         */
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length-1; j++)
            {
                if (arr[i].compareTo(arr[j])>0)
                {
                    String a = arr[i];
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }



        //This part needs to come after the sort, since the sort is just a system out statement.
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i].contains(query))
            {
                return i;
            }
        }
        return -1;
    }


    public int challengeThree(int[] arr)
    {
        int a = 0;
        int b = 0;
        for(int i = 0; i <= arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length - 1; j++)
            {
                if (arr[i] > arr[j])
                {
                    a = arr[i];
                    b = arr[j];
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
        if(arr.length % 2 > 0)
            return (arr[arr.length / 2] + arr[(arr.length / 2) + 1]) / 2;
        return arr[arr.length / 2];
    }

    public int challengeFour(int[][] arr)
    {
        int a;
        int b;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j <= arr[i].length - 1; j++)
            {
                for(int k = j; k <= arr[i].length - 1; k++)
                {
                    if (arr[i][j] > arr[i][k])
                    {
                        a = arr[i][k];
                        b = arr[i][j];
                        arr[i][k] = b;
                        arr[i][j] = a;
                    }
                }
            }
        }

        int[] med = new int[arr.length];
        for(int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i].length % 2 > 0)
                med[i] = (arr[i][arr[i].length / 2] + arr[i][(arr[i].length / 2) + 1]) / 2;
            else
                med[i] = arr[i][arr[i].length / 2];
        }

        int[] c;
        int[] d;
        for(int i = 0; i < med.length; i++)
        {
            for(int j = i; j < med.length; j++)
            {
                if (med[i] > med[j])
                {
                    c = arr[i];
                    d = arr[j];
                    arr[i] = d;
                    arr[j] = c;

                    a = med[i];
                    b = med[j];
                    med[i] = b;
                    med[j] = a;
                }
            }
        }

        if(med.length % 2 > 0)
            return (med[med.length / 2] + med[(med.length / 2) + 1]) / 2;
        return med[med.length / 2];
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {

        //Maybe these specific instances of objects that implement compareTo, aren't the ones that will be tested.
        //It will probably be a set of related (ancestor/descendant) classes that will return an int based on their
        //own compareTo method.
        //Maybe just test this with ints or something, and organize them into a list.

        //This for loop is meant for allocating a static position to an element in the unsorted arr.
       // for (int i=0; i<arr.length)
        /*
        Comparable[][] array= new Comparable[10000][];
        Comparable[] sample= new Comparable[10000];
        for (int i=0; i< sample.length-1; i++)
        {
            sample[i]=i;
        }
        int staticidx=0;
        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=0; j<sample.length-1; j++)
            {
                if (arr[i]==sample[j])
                {
                   // array[i][staticidx]
                }
            }

        }*/
       for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j <= arr.length-1; j++)
            {
                if (arr[i].compareTo(arr[j])>0)
                {
                    Comparable a=arr[i];
                    arr[i] = arr[j];
                    arr[j]=a;
                }
            }
        }

        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i].equals(query))
            {
                return i;
            }
        }

       return 0;
    }

    public String greeting()
    {
        System.out.println("Welcome! Our sorting program (courtesy of Johan Avila and Matthew Moore) will now complete all 5 challenges " +
                "using [INSERTION] sort! Hope you have a nice flight!");
        System.out.println("Sort will begin in 5...");
        System.out.println("4...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1!");
        return "Begin!";
    }
}