import java.util.Arrays;

public class ARR {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,4,53,32,25,52,56}, n = 11,d=4;

        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        efficirotate(arr,n,d);

        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }

    public static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return (i);
            }
        }
        return -1;
    }

    static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap)
            return n;

        int idx = pos - 1;

        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return n + 1;
    }

    public static int delete(int arr[], int n, int x) {
        int i = 0;
        for (i = 0; i <= n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }
        for (int j = i; j < n - 1; j++) {
            arr[i] = arr[j + 1];

        }
        return n - 1;


    }

    public static int larger(int arr[], int n) {
        int larg = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }

        }
        return larg;
    }

    public static void dupli(int arr[], int n) {
        int temp[] = new int[100];
        temp[0] = arr[0];
        int tindex = 0;
        int dupIndc = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= tindex; j++) {
                if (temp[j] == arr[i]) {
                    dupIndc = 1;
                }
            }
            if (dupIndc == 0) {
                tindex++;
                temp[tindex] = arr[i];
            }
            dupIndc = 0;
        }
        for (int i = 0; i <= tindex; i++) {
            System.out.print("   ");
            System.out.print(temp[i]);
            System.out.print("   ");
        }
    }


    public static void move(int arr[], int n) {
        int nt = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = nt;

    }
    public static void lmove(int arr[],int n,int d)
    {
        for (int i=0;i<d;i++)
        {
            move(arr,n);
        }
    }
    public static void ints(int arr[], int n) {
        int curr_ldr = arr[n - 1];
        System.out.print(curr_ldr + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > curr_ldr) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    public static int binary(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void rev(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static int dup(int arr[], int n) {
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr[res-1] != arr[i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void feq(int arr[],int n) {
        boolean vare[] = new boolean[n];
        Arrays.fill(vare, false);
        for(int i=0;i<n;i++)
        {
            if(vare[i]==true)
            {
                continue;
            }
            int count=1;
            for (int j=i+1;j<n;j++)
            {

                if(arr[i]==arr[j])
                {
                    vare[j]=true;
                    count++;

                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
    public static void frequ(int arr[],int n)
    {
        int freq=1;
        int i = 1;
        while(i<n)
        {
            while(i<n&&arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;

        }
    }
    public static int maxi(int arr[],int n)
    {
        int res=arr[1]-arr[0];
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
    public static void efficirotate(int arr[],int n,int d)
    {
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];

        }
        for(int i=0;i<d;i++)
        {
            arr[n-d+i]=temp[i];
        }
    }


}





