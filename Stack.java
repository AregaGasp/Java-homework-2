import java.util.Arrays;
	
public class Stack {
	int[] StackArray = new int[10];
	int index = 0;	
	boolean isFull (int index){
	 if (index + 1 > StackArray.length - 1){
		return true;
	};
	return false;
	};
	boolean isEmpty (int index){
         if (index - 1 < StackArray.length){
                return true;
        };
        return false;
        };
	 void push (int el) {
		if(isFull(index)){
			return;
		};
		StackArray[index]=el;
		index = index + 1;	
	};
	int pop (){
		if(isEmpty(index)){
        return 0;
		};
		index = index -1;
		return StackArray[index];
	};
	int peek (){
		return StackArray[index-1];
	}
	@Override
	public String toString() {
		return Arrays.toString(StackArray);
	}
};
