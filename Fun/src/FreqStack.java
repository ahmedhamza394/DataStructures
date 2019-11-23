import java.util.HashMap;
import java.util.Stack;




public class FreqStack {
    
    Stack<Integer> s1; 
    HashMap<Integer, Integer> map;
    
    public FreqStack() {
        this.s1 = new Stack<>();
        this.map = new HashMap<>();
    }
    
    public void push(int x) {
        if(!map.containsKey(x))
        {
            map.put(x, 1);
        }else
        {
            map.put(x, map.get(x) +1);
        }
        if(s1.isEmpty())
        {
            s1.push(x);
        }
        else
        {
            if(map.get(x) >= map.get(s1.peek()))
            {
                s1.push(x);
            }
            else
            {
                Stack<Integer> temp = new Stack<>();
                while(map.get(x) < map.get(s1.peek()))
                {
                    temp.push(s1.pop());
                }
                s1.push(x);
                while(!temp.isEmpty())
                {
                    s1.push(temp.pop());
                }
            }
        }
        System.out.print("I was called");
    }
    
    public int pop() {
        return s1.pop();
    }
}
