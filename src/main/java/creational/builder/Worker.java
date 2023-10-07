package creational.builder;

public class Worker {
    String name;
    Role role;
    int age;
    int salary;

    private Worker() {}

    static class Builder {
        private static final int DEFAULT_SALARY = 90000;
        private static final Role DEFAULT_ROLE = Role.ASSISTANT;

        private Worker worker = new Worker();

        Builder() {
            worker.salary = DEFAULT_SALARY;
            worker.role = DEFAULT_ROLE;
        }
        
        public Builder name(String name) {
            worker.name = name;
            return this;
        }

        public Builder age(int age) {
            worker.age = age;
            return this;
        }

        public Builder salary(int salary) {
            worker.salary = salary;
            return this;
        }

        public Builder role(Role role) {
            worker.role = role;
            return this;
        }

        public Worker build() {
            return worker;
        }
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', role='%s' age=%d, salary=%d}", name, role.toString(), age, salary);
    }
}
