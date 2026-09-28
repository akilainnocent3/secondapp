package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.CpfData;
import com.sporty.android.core.model.account.telegram.BindTelegramBody;
import com.sporty.android.core.model.account.telegram.TelegramBindingActionType;
import com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckResponse;
import com.sporty.android.core.model.account.telegram.TelegramBotInfo;
import com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifyMainOTPBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifyNameMatchResult;
import com.sporty.android.core.model.kyc.phonemigration.VerifySubsidiaryOTPBody;
import com.sporty.android.core.model.nin.SubmitNINBody;
import com.sporty.android.core.model.patron.Country;
import com.sporty.android.core.model.patron.DefaultGift;
import com.sporty.android.core.model.patron.FeedbackDescription;
import com.sporty.android.core.model.patron.GooglePlayAvailableData;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.patron.NINConfigResponse;
import com.sporty.android.core.model.patron.NINInfoResponse;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.NicknameAvailabilityResponse;
import com.sporty.android.core.model.patron.PersonalInfo;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import com.sporty.android.core.model.patron.UserCertInfo;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.patron.VerifyOtpRequest;
import com.sporty.android.core.model.patron.VerifyPersonalInfoResult;
import com.sporty.android.core.model.primaryphone.GetReviewedPrimaryPhoneResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneBindOTPSessionForNewPhoneBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPResult;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberBody;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberResult;
import com.sporty.android.core.model.primaryphone.VerifyIdentityBody;
import com.sporty.android.core.model.primaryphone.VerifyIdentityResult;
import com.sporty.android.core.model.profile.UserInfoProperty;
import com.sporty.android.core.model.security.otp.BindNewPhoneOTPSessionData;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.ReactivateAccountResult;
import com.sporty.android.core.model.security.otp.RegisterBrVerifyCode;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.core.model.security.otp.SportyPinSessionToken;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.security.twofa.GetTwoFAHintStatusResponse;
import com.sporty.android.core.model.security.twofa.TwoFAIndicatorPage;
import com.sporty.android.core.model.timecontrol.SelfExclusionRequest;
import com.sporty.android.core.model.timecontrol.SelfExclusionResponse;
import com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public interface lyz {
    lyh<BaseResponse<Unit>> A(ljy ljyVar);

    Object A0(String str, String str2, x1b x1bVar);

    lyh<BaseResponse<OTPGeneralResult>> B(String str, String str2);

    lyh<BaseResponse<WithdrawalPinStatusInfo>> B0();

    lyh<BaseResponse<Unit>> C();

    lyh C0(Boolean bool, String str, String str2, String str3);

    lyh<BaseResponse<ResetSportyPINResult>> D(String str, String str2, boolean z, boolean z2);

    lyh<BaseResponse<KYCReminder>> D0();

    lyh<lk50<GetTwoFAHintStatusResponse>> E();

    lyh<PrimaryPhoneConfig> E0();

    or60 F(String str);

    lyh<BaseResponse<TelegramBotInfo>> F0();

    lyh<BaseResponse<OTPGeneralResult>> G0(VerifySubsidiaryOTPBody verifySubsidiaryOTPBody);

    lyh<BaseResponse<Unit>> H(DefaultGift defaultGift);

    Object H0(x1b x1bVar);

    lyh<BaseResponse<Void>> I();

    lyh<BaseResponse<OTPGeneralResult>> J();

    lyh<BaseResponse<VerifyIdentityResult>> K(VerifyIdentityBody verifyIdentityBody);

    lyh L(String str);

    lyh<BaseResponse<Unit>> M(FeedbackDescription feedbackDescription);

    lyh<BaseResponse<UpdatePrimaryPhoneNumberResult>> N(UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody);

    lyh<BaseResponse<DefaultGift>> O();

    lyh<BaseResponse<OTPGeneralResult>> P(String str, String str2, String str3);

    lyh<BaseResponse<VerifyPersonalInfoResult>> Q(String str, String str2);

    lyh<Unit> R(SubmitNINBody submitNINBody);

    lyh<BaseResponse<GetReviewedPrimaryPhoneResult>> S();

    lyh<NINConfigResponse> T();

    lyh<String> U(PrimaryPhoneBindOTPSessionForNewPhoneBody primaryPhoneBindOTPSessionForNewPhoneBody);

    lyh<BaseResponse<VerifyNameMatchResult>> V(String str);

    lyh<BaseResponse<OTPUpdateNameResult>> W(OTPVerificationRequest oTPVerificationRequest);

    lyh<Unit> X();

    lyh<BaseResponse<PrimaryPhoneVerifyOTPResult>> Y(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody);

    lyh<BaseResponse<SportyPinSessionToken>> Z();

    lyh<lk50<AccountInfo>> a(pu0 pu0Var);

    lyh<BaseResponse<OTPGeneralResult>> a0(String str);

    lyh<BaseResponse<List<KYCBannerItem>>> b();

    Object b0(TwoFAIndicatorPage twoFAIndicatorPage, x1b x1bVar);

    lyh<BaseResponse<PersonalInfo>> c(String str);

    lyh<BaseResponse<OTPGeneralResult>> c0(VerifyMainOTPBody verifyMainOTPBody, boolean z);

    lyh<BaseResponse<SelfExclusionResponse>> d();

    lyh<BaseResponse<UserCertInfo>> d0();

    lyh<BaseResponse<PrimaryPhoneVerifyOTPResult>> e(PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, boolean z, boolean z2);

    lyh<String> e0();

    lyh<BaseResponse<OTPGeneralResult>> f(BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData);

    Object f0(String str, String str2, fk fkVar);

    lyh<BaseResponse<OTPGeneralResult>> g();

    lyh<BaseResponse<SelfExclusionResponse>> g0(SelfExclusionRequest selfExclusionRequest);

    lyh<BaseResponse<String>> getNickName();

    lyh<BaseResponse<LoginResponse>> h(String str, String str2);

    lyh<BaseResponse<UpdateNicknameResponse>> h0(String str);

    lyh<BaseResponse<OTPCompleteResult>> i(RegisterCompleteBody registerCompleteBody);

    lyh<lk50<WithdrawalPinStatusInfo>> i0(pu0 pu0Var);

    lyh<BaseResponse<CpfData>> j(String str);

    lyh<lk50<NameConfirmationStatus>> j0(pu0 pu0Var);

    Object k(String str, String str2, String str3, tje0 tje0Var);

    Object k0(String str, String str2, String str3, String str4, String str5, fk fkVar);

    lyh<NINInfoResponse> l();

    lyh<BaseResponse<Unit>> l0(String str);

    lyh<BaseResponse<Void>> m(String str);

    lyh<BaseResponse<TelegramBindingPreCheckResponse>> m0(TelegramBindingActionType telegramBindingActionType, String str);

    lyh<BaseResponse<SelfExclusionResponse>> n0(TimeSelfExclusionRequest timeSelfExclusionRequest);

    lyh<BaseResponse<Unit>> o(MigratePhoneBody migratePhoneBody);

    Object o0(String str, String str2, String str3, Map map, x1b x1bVar);

    Object p0(upj0 upj0Var);

    lyh<BaseResponse<Unit>> q(BindTelegramBody bindTelegramBody);

    lyh<BaseResponse<OTPGeneralResult>> q0(VerifyOtpRequest verifyOtpRequest, boolean z, boolean z2);

    lyh<BaseResponse<NicknameAvailabilityResponse>> r(String str);

    lyh<BaseResponse<ReactivateAccountResult>> r0(String str);

    lyh<BaseResponse<Unit>> s(String str);

    lyh<BaseResponse<PrimaryPhoneVerifyNameResult>> s0(PrimaryPhoneVerifyNameBody primaryPhoneVerifyNameBody);

    Object t(String str, String str2, x1b x1bVar);

    lyh<BaseResponse<Void>> t0(String str);

    lyh<BaseResponse<OTPGeneralResult>> u(String str, String str2);

    lyh u0(UserInfoProperty userInfoProperty, String str);

    lyh<BaseResponse<CheckIsTrustedDeviceResponse>> v(j6c j6cVar);

    lyh<UserCertInfo> v0(UserCertInfo userCertInfo);

    Object w(String str, String str2, String str3, String str4, x1b x1bVar);

    lyh<lk50<List<Country>>> w0();

    or60 x(RegisterBrVerifyCode registerBrVerifyCode);

    lyh<BaseResponse<OTPGeneralResult>> x0(String str, String str2);

    lyh<lk50<List<UserPhone>>> y(pu0 pu0Var);

    Object y0(h7n h7nVar);

    lyh<bi50<BaseResponse<GooglePlayAvailableData>>> z();

    Object z0(String str, String str2, x1b x1bVar);
}
