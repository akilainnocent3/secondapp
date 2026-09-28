package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sportybet.android.account.international.data.model.AccountActivationRequest;
import com.sportybet.android.account.international.data.model.AccountActivationResponse;
import com.sportybet.android.account.international.data.model.FacialRecognitionSessionRequest;
import com.sportybet.android.account.international.data.model.FacialRecognitionSessionResponse;
import com.sportybet.android.account.international.data.model.FacialRecognitionStatusResponse;
import com.sportybet.android.account.international.data.model.INTRegisterResendResponse;
import com.sportybet.android.account.international.data.model.INTRegisterResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCheckResponse;
import com.sportybet.android.account.international.data.model.INTResetPwdCompleteResponse;
import com.sportybet.android.account.international.data.model.PostalCodeResponse;
import com.sportybet.android.account.international.data.model.RegistrationStatusRequest;
import com.sportybet.android.account.international.data.model.RegistrationStatusResponse;
import com.sportybet.android.globalpay.data.CPFValidateRequest;
import com.sportybet.android.globalpay.data.CPFValidateResult;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JF\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0007j\u0004\u0018\u0001`\u000f2\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007j\u0004\u0018\u0001`\u00182\b\b\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0019\u0010\u0011J>\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0007j\u0004\u0018\u0001`\u001b2\b\b\u0001\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003H§@¢\u0006\u0004\b\u001c\u0010\u0015J2\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0007j\u0004\u0018\u0001`\u001b2\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001d\u0010\u0011J2\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0007j\u0004\u0018\u0001`\u001f2\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0003H§@¢\u0006\u0004\b \u0010\u0011J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00072\b\b\u0001\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00072\b\b\u0001\u0010\"\u001a\u00020&H§@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00072\b\b\u0001\u0010\f\u001a\u00020\u0003H§@¢\u0006\u0004\b+\u0010,J \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00072\b\b\u0001\u0010-\u001a\u00020\u0003H§@¢\u0006\u0004\b/\u0010,J \u00102\u001a\b\u0012\u0004\u0012\u0002010\u00072\b\b\u0001\u0010\"\u001a\u000200H§@¢\u0006\u0004\b2\u00103J,\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00072\n\b\u0001\u00104\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\"\u001a\u000205H§@¢\u0006\u0004\b7\u00108¨\u00069À\u0006\u0003"}, d2 = {"Lwum;", "", "", "", "registerParams", "uuid", "captchaToken", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/account/international/data/model/INTRegisterResponse;", "Lcom/sportybet/android/account/international/data/network/INTRegisterRes;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "token", "userCode", "Lcom/sporty/android/core/model/patron/LoginResponse;", "Lcom/sportybet/android/account/international/data/network/INTRegisterVerifyRes;", "h", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "email", "Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "password", "Lxdp;", "Lcom/sportybet/android/account/international/data/network/INTLoginRes;", "e", "Lcom/sportybet/android/account/international/data/model/INTResetPwdCheckResponse;", "Lcom/sportybet/android/account/international/data/network/INTResetPwdCheckRes;", "m", "k", "Lcom/sportybet/android/account/international/data/model/INTResetPwdCompleteResponse;", "Lcom/sportybet/android/account/international/data/network/INTResetPwdRes;", "c", "Lcom/sportybet/android/account/international/data/model/RegistrationStatusRequest;", "body", "Lcom/sportybet/android/account/international/data/model/RegistrationStatusResponse;", "l", "(Lcom/sportybet/android/account/international/data/model/RegistrationStatusRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/account/international/data/model/FacialRecognitionSessionRequest;", "Lcom/sportybet/android/account/international/data/model/FacialRecognitionSessionResponse;", "d", "(Lcom/sportybet/android/account/international/data/model/FacialRecognitionSessionRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/account/international/data/model/FacialRecognitionStatusResponse;", "g", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "postalCode", "Lcom/sportybet/android/account/international/data/model/PostalCodeResponse;", "i", "Lcom/sportybet/android/account/international/data/model/AccountActivationRequest;", "Lcom/sportybet/android/account/international/data/model/AccountActivationResponse;", "j", "(Lcom/sportybet/android/account/international/data/model/AccountActivationRequest;Lv1b;)Ljava/lang/Object;", "clientEventId", "Lcom/sportybet/android/globalpay/data/CPFValidateRequest;", "Lcom/sportybet/android/globalpay/data/CPFValidateResult;", "f", "(Ljava/lang/String;Lcom/sportybet/android/globalpay/data/CPFValidateRequest;Lv1b;)Ljava/lang/Object;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public interface wum {
    @flz("patron/email/auth/register")
    @tti
    Object a(@ijh Map<String, String> map, @rhl("captcha-uuid") String str, @rhl("captcha-token") String str2, v1b<? super BaseResponse<INTRegisterResponse>> v1bVar);

    @flz("patron/email/auth/registerCode")
    @tti
    Object b(@gjh("email") String str, @rhl("captcha-uuid") String str2, @rhl("captcha-token") String str3, v1b<? super BaseResponse<INTRegisterResendResponse>> v1bVar);

    @gmz("patron/email/auth/password/update")
    @tti
    Object c(@gjh("token") String str, @gjh("password") String str2, v1b<? super BaseResponse<INTResetPwdCompleteResponse>> v1bVar);

    @flz("patron/facial-recognition/session")
    Object d(@jh4 FacialRecognitionSessionRequest facialRecognitionSessionRequest, v1b<? super BaseResponse<FacialRecognitionSessionResponse>> v1bVar);

    @flz("patron/email/auth/token")
    @tti
    Object e(@gjh("email") String str, @gjh("password") String str2, v1b<? super BaseResponse<xdp>> v1bVar);

    @flz("patron/register/validate-cpf")
    Object f(@rhl("Client-Event-Id") String str, @jh4 CPFValidateRequest cPFValidateRequest, v1b<? super BaseResponse<CPFValidateResult>> v1bVar);

    @sbj("patron/facial-recognition/status/{token}")
    Object g(@dxz("token") String str, v1b<? super BaseResponse<FacialRecognitionStatusResponse>> v1bVar);

    @gmz("patron/email/auth/verify")
    @tti
    Object h(@gjh("token") String str, @gjh("userCode") String str2, v1b<? super BaseResponse<LoginResponse>> v1bVar);

    @sbj("patron/address/lookup/{postalCode}")
    Object i(@dxz("postalCode") String str, v1b<? super BaseResponse<PostalCodeResponse>> v1bVar);

    @gmz("patron/register/br/activate")
    Object j(@jh4 AccountActivationRequest accountActivationRequest, v1b<? super BaseResponse<AccountActivationResponse>> v1bVar);

    @gmz("patron/email/auth/password/verify")
    Object k(@db30("token") String str, @db30("userCode") String str2, v1b<? super BaseResponse<INTResetPwdCheckResponse>> v1bVar);

    @flz("patron/register/br/registrationStatus")
    Object l(@jh4 RegistrationStatusRequest registrationStatusRequest, v1b<? super BaseResponse<RegistrationStatusResponse>> v1bVar);

    @gmz("patron/email/auth/password/reset")
    Object m(@db30("email") String str, @rhl("captcha-uuid") String str2, @rhl("captcha-token") String str3, v1b<? super BaseResponse<INTResetPwdCheckResponse>> v1bVar);
}
