package project.com.maktab.onlinemarket.network.webservices.add_customer;

import project.com.maktab.onlinemarket.network.base.Api;
import project.com.maktab.onlinemarket.network.base.RetrofitClientInstance;
import retrofit2.Call;
import retrofit2.Callback;

public class CustomerProcess {
    private Customer mCustomer;

    public CustomerProcess(Customer customer) {
        mCustomer = customer;
    }

    public void send(Callback callback) {
        Call<CustomerResponse> call = RetrofitClientInstance.getRetrofitInstance().create(Api.class)
                .addCustomer(mCustomer);
        call.enqueue(callback);

    }
}