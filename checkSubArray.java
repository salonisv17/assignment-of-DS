/*to find the subaray
arr1[]={4,7,256,72,17}
arr2[]={7,72,18}// arr2 is subaaray of arr1
arr3[]={4,7,18}//arr3 is not subRRAY of arr1
*/
//brute force
class checkSubArray
{
boolean fun(int arr1[],int arr2[])
{
for()int i=0;i<arr2.length;i++)
{
for(int j=0;j<arr1.length;j++)
{
if(arr[i]==arr[j])
{
break;
}
if(j==arr1.length)
return 0;
}

}
return 1;
}
public static void main(String args[])
{
checkSubArray cc=new checkSubArray();
int arr1[]={4,7,256,72,17};
int arr2[]={7,72,18};
boolean c=cc.fun(arr1,arr2);
}
}

// using hash table

