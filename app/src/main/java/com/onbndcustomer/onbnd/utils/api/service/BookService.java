package com.onbndcustomer.onbnd.utils.api.service;

import com.onbndcustomer.onbnd.json.CheckStatusTransRequest;
import com.onbndcustomer.onbnd.json.CheckStatusTransResponse;
import com.onbndcustomer.onbnd.json.DetailRequestJson;
import com.onbndcustomer.onbnd.json.DetailTransResponseJson;
import com.onbndcustomer.onbnd.json.GetNearRideCarRequestJson;
import com.onbndcustomer.onbnd.json.GetNearRideCarResponseJson;
import com.onbndcustomer.onbnd.json.ItemRequestJson;
import com.onbndcustomer.onbnd.json.LocationDriverRequest;
import com.onbndcustomer.onbnd.json.LocationDriverResponse;
import com.onbndcustomer.onbnd.json.RideCarRequestJson;
import com.onbndcustomer.onbnd.json.RideCarResponseJson;
import com.onbndcustomer.onbnd.json.SendRequestJson;
import com.onbndcustomer.onbnd.json.SendResponseJson;
import com.onbndcustomer.onbnd.json.fcm.CancelBookRequestJson;
import com.onbndcustomer.onbnd.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("customerapi/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("customerapi/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("customerapi/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("customerapi/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("customerapi/check_status_transaksi")
    Call<CheckStatusTransResponse> checkStatusTransaksi(@Body CheckStatusTransRequest param);

    @POST("customerapi/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("customerapi/liat_lokasi_driver")
    Call<LocationDriverResponse> liatLokasiDriver(@Body LocationDriverRequest param);

    @POST("customerapi/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
