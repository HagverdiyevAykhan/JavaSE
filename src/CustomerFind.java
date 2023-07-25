import java.util.List;

public class CustomerFind {
    public List<Customer> customersfindall() {

        return Customerdata.customers;
    }

    public Customer findbyFincode(String finCode) {
        for (int i = 0; i < Customerdata.customers.size(); i++) {
            if (Customerdata.customers.get(i).getFinCode().equals(finCode)) {
                return Customerdata.customers.get(i);
            }
        }
        return null;
    }

    public Customer deleteFincode(String fincode) {
        for (int i = 0; i < customersfindall().size(); i++) {
            if (Customerdata.customers.get(i).getFinCode().equals(fincode)) {
                Customerdata.customers.remove(i);
            }

        }
        return null;

    }
    public void  saveCustomer(Customer customer){
        Customerdata.customers.add(customer);
    }
}

