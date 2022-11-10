Console.WriteLine("Endrekursive Lösung:");

Console.WriteLine(TotalSum(4));



static int TotalSum(int n)

{

    return AddSum(0, n);

}



static int AddSum(int m, int n)

{

    if (n == 1 || n == m)

    {

        return m;

    }

    else

    {

        return AddSum(m + n, n - 1);

    }

}

