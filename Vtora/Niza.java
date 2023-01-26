public class Niza {
    public class Array<E> {
        private E data[];
        private int size;

        public E[] getData() {
            return data;
        }

        public Array(int size) {
            data=(E[])new Object[size];
            this.size = size;
        }

        public void setData(E[] data) {
            this.data = data;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
