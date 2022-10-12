import java.util.Scanner;
    class itemType {
        private String name;
        private double costPerDay;
        private double deposit;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCostPerDay() {
            return costPerDay;
        }

        public void setCostPerDay(double costPerDay) {
            this.costPerDay = costPerDay;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        @Override
        public String toString() {
            return "itemType{" +
                    "name='" + name + '\'' +
                    ", costPerDay=" + costPerDay +
                    ", deposit=" + deposit +
                    '}';
        }

        static class Test {
            public static void main(String[] args) {
                Test test = new Test();
                itemType IT = new itemType();
                test.fun(IT);
            }

            void fun(itemType IT) {
                setItem(IT);
                display(IT);
            }

            void setItem(itemType IT) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the item type name - ");
                String name = sc.next();
                System.out.println("Enter the cost per day - ");
                Double de = Double.valueOf(sc.next());
                System.out.println("Enter the deposit - ");
                Double cpd = Double.valueOf(sc.next());
                IT.setName(name);
                IT.setDeposit(de);
                IT.setCostPerDay(cpd);
            }

            void display(itemType IT) {
                System.out.println("item type details are ");
                System.out.println("Name : " + IT.getName() + "\n" + "Cost per day : " + IT.getCostPerDay() + "\n" + "Deposit : " + IT.getDeposit());
            }
        }
    }



