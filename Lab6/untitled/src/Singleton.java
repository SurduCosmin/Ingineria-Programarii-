class Singleton {
        private static final Application INSTANCE = new Application();

        public static Application getInstance() {
            return Singleton.INSTANCE;
        }
        public static void main(String[] args)
        {
            Application app=getInstance();
        }
}