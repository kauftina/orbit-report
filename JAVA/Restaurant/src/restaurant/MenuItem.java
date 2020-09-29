package restaurant;

    public class MenuItem {
        private double price;
        private String description;
        private String category;
        private boolean isNew;
        private boolean isVegan;
        public MenuItem(String name, double price, String description, String category, boolean isVegan) {
            this.price = price;
            this.description = description;
            this.category = category;
            this.isNew = true;
            this.isVegan = isVegan;

        }
        public boolean isNew() {
            return isNew;

        }


        @Override
        public String toString() {
            return "MenuItem{" +
                    "price=" + price +
                    ", description='" + description + '\'' +
                    ", category='" + category + '\'' +
                    ", isNew=" + isNew +
                    ", isVegan=" + isVegan +
                    '}';
        }
    }

