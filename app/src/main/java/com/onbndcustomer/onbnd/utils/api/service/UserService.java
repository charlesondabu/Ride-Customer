package com.onbndcustomer.onbnd.utils.api.service;

import com.onbndcustomer.onbnd.json.AllMerchantByNearResponseJson;
import com.onbndcustomer.onbnd.json.AllMerchantbyCatRequestJson;
import com.onbndcustomer.onbnd.json.AllTransResponseJson;
import com.onbndcustomer.onbnd.json.BankResponseJson;
import com.onbndcustomer.onbnd.json.NewsDetailRequestJson;
import com.onbndcustomer.onbnd.json.NewsDetailResponseJson;
import com.onbndcustomer.onbnd.json.ChangePassRequestJson;
import com.onbndcustomer.onbnd.json.DetailRequestJson;
import com.onbndcustomer.onbnd.json.EditprofileRequestJson;
import com.onbndcustomer.onbnd.json.GetAllMerchantbyCatRequestJson;
import com.onbndcustomer.onbnd.json.GetServiceResponseJson;
import com.onbndcustomer.onbnd.json.GetHomeRequestJson;
import com.onbndcustomer.onbnd.json.GetHomeResponseJson;
import com.onbndcustomer.onbnd.json.GetMerchantbyCatRequestJson;
import com.onbndcustomer.onbnd.json.LoginRequestJson;
import com.onbndcustomer.onbnd.json.LoginResponseJson;
import com.onbndcustomer.onbnd.json.MerchantByCatResponseJson;
import com.onbndcustomer.onbnd.json.MerchantByIdResponseJson;
import com.onbndcustomer.onbnd.json.MerchantByNearResponseJson;
import com.onbndcustomer.onbnd.json.MerchantbyIdRequestJson;
import com.onbndcustomer.onbnd.json.PrivacyRequestJson;
import com.onbndcustomer.onbnd.json.PrivacyResponseJson;
import com.onbndcustomer.onbnd.json.PromoRequestJson;
import com.onbndcustomer.onbnd.json.PromoResponseJson;
import com.onbndcustomer.onbnd.json.RateRequestJson;
import com.onbndcustomer.onbnd.json.RateResponseJson;
import com.onbndcustomer.onbnd.json.RegisterRequestJson;
import com.onbndcustomer.onbnd.json.RegisterResponseJson;
import com.onbndcustomer.onbnd.json.ResponseJson;
import com.onbndcustomer.onbnd.json.SearchMerchantbyCatRequestJson;
import com.onbndcustomer.onbnd.json.StripeRequestJson;
import com.onbndcustomer.onbnd.json.TopupRequestJson;
import com.onbndcustomer.onbnd.json.TopupResponseJson;
import com.onbndcustomer.onbnd.json.WalletRequestJson;
import com.onbndcustomer.onbnd.json.WalletResponseJson;
import com.onbndcustomer.onbnd.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("customerapi/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("customerapi/kodepromo")
    Call<PromoResponseJson> promocode(@Body PromoRequestJson param);

    @POST("customerapi/listkodepromo")
    Call<PromoResponseJson> listpromocode(@Body PromoRequestJson param);

    @POST("customerapi/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("customerapi/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("customerapi/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("customerapi/detail_fitur")
    Call<GetServiceResponseJson> getFitur();

    @POST("customerapi/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("customerapi/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("customerapi/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("customerapi/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("customerapi/stripeaction")
    Call<ResponseJson> actionstripe(@Body StripeRequestJson param);

    @POST("customerapi/intentstripe")
    Call<ResponseJson> intentstripe(@Body StripeRequestJson param);

    @POST("customerapi/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("customerapi/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("customerapi/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("customerapi/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("customerapi/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("customerapi/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("customerapi/detail_berita")
    Call<NewsDetailResponseJson> beritadetail(@Body NewsDetailRequestJson param);

    @POST("customerapi/all_berita")
    Call<NewsDetailResponseJson> allberita(@Body NewsDetailRequestJson param);

    @POST("customerapi/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("customerapi/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("customerapi/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("customerapi/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
