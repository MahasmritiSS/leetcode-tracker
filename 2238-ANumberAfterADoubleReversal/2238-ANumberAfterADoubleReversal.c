// Last updated: 9/2/2026, 10:20:21 AM
bool isSameAfterReversals(int num) {
    if(num==0){
        return true;
    }
    if(num%10!=0){
        return true;
    }
    else{
        return false;
    }
}