public abstract class User{
    protected final int id;
    protected String name;
    protected String email;
    protected String passwordHash;
    protected boolean active = true;

    public User(int id, String name, String email, String passwordHash){
        this.id =  id;
        this.name = name;
        this.email = email;
        this.passwordHash = passwordHash;

    }

        public int getId(){
            return id;
        }

        public boolean isActive(){
            return active;
        }
        public void deactivate(){
            this.active = false;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }

        public String passwordHash(){
            return passwordHash;
        }
        public void setPasswordHash(){
            this.passwordHash = passwordHash;
        }

        public abstract String getRole();

}