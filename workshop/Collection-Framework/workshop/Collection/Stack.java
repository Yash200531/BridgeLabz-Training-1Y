package workshop.Collection;

public class Stack {
    static void main() {
        Stack<Integer> st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println(st);
        st.size();
        System.out.println(st);
        st.isEmpty();
        System.out.println(st);
    }
}
