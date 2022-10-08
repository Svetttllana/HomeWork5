    public class Transport implements  Itransp {
        @Override
        public void motor() {
        }
    }

    abstract class Transport2 {
        public abstract void drive();
        public abstract void deep();

    }
    class Car extends Transport2 implements Itransp{

        @Override
        public void drive() {

        }

        @Override
        public void deep() {

        }

        @Override
        public void motor() {

        }
    }
    class Velosiped extends Transport2{

        @Override
        public void drive() {

        }

        @Override
        public void deep() {

        }
    }

    class Traktor extends Transport2 implements Itransp{
        @Override
        public void drive() {

        }

        @Override
        public void deep() {

        }

        @Override
        public void motor() {

        }
    }

    interface Itransp{
        void motor();
    }

