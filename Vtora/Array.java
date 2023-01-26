public class Array <E>{
    private E data[];
    private int size;

    public Array(int size) {
        data=(E[])new Object[size];
        this.size = size;
    }

    public void set(int position,E obj) {
        if(position >=0 && position<size)
        data[position]=obj;
    }
    public E get(int position)
    {
        if(position >=0 && position<size) {
            return data[position];
        }
        else return null;
    }
    public int find(E o)
    {
        for(int i=0;i<size;i++)
        {
            if(o.equals(data[i]))
                return i;
        }
        return -1;
    }
    public int getSize()
    {
        return size;
    }
    public void delete(int position)
    {
        if(position>=0 && position<size)
        {
            E[] newdata=(E[]) new Object[size-1];
            for(int i=0;i<position;i++)
            {
                newdata[i]=data[i];
            }
            for(int i=position+1;i<size;i++)
            {
                newdata[i-1]=data[i];
            }
            data=newdata;
            size--;
        }
    }
    public void resize()
    {
        E[] newData= (E[]) new Object[size*2];
        for(int i=0;i<size;i++)
        {
            newData[i]=data[i];
        }
        this.data=newData;
    }
    public void insertLast(E o)
    {
        if(size+1>data.length)
        {
            this.resize();
        }
        data[size++]=o;
    }
    public void insert(int position,E o)
    {
        if(position>=0 && position<=size)
        {
            if(size+1>data.length)
                this.resize();
            for(int i=size;i>position;i--)
            {
                data[i]=data[i-1];
            }
            data[position]=o;
            size++;
        }
    }
    public static void main(String[] args) {
        Array<Integer> niza=new Array<Integer>(4);

        niza.insertLast(4);
        System.out.println(niza.toString());

        niza.insert(3,7);
        System.out.println(niza.toString());

    }

}
