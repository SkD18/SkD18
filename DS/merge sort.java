class Solution {

    void mergeSort(int arr[], int l, int r) {
// Recursively splits array into halves, sorts each half,
// then merges them back in sorted order.        

    //base case
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        //merge two sorted arrays
        merge(arr,l,r);
    }
void merge(int[] arr,int l, int r){
    int mid=(l+r)/2;
    int n1=mid-l+1;
    int n2=r-mid;

    int[] left=new int[n1];
    int[] right=new int[n2];

    // adding values of each array
    int mainIndex = l;
    for(int i=0;i<n1;i++){
        left[i]= arr[mainIndex++];
    }

    mainIndex=mid+1;
    for(int j=0; j<n2;j++){
        right[j]=arr[mainIndex++];
    }

    int i,j=0;
    mainIndex=l;
    while(i<n1 && j<n2){
        if(left[i]<right[j]){
            arr[mainIndex++]=left[i++];
        }
        else{
            arr[mainIndex++]=right[j++];
        }
    }

    while(i<n1){
        arr[mainIndex++]=left[i++];
    }
    while(j<n2){
        arr[mainIndex++]=right[j++];
    }
}
}