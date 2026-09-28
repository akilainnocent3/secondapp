package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.account.CpfData;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.account.PasswordResetStatusResponse;
import com.sporty.android.core.model.account.telegram.BindTelegramBody;
import com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckBody;
import com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckResponse;
import com.sporty.android.core.model.account.telegram.TelegramBotInfo;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeBindOtpSessionDTO;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeConfigResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeOtpVerificationRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePasswordCheckResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckRequest;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePinCheckResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailChangePreCheckResponse;
import com.sporty.android.core.model.account.verifiedemailchange.EmailUpdateRequest;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.dateofbirth.DobVerificationInfoResponse;
import com.sporty.android.core.model.dateofbirth.DobVerificationRequest;
import com.sporty.android.core.model.dateofbirth.DobVerificationResponse;
import com.sporty.android.core.model.dateofbirth.DobVerificationStatus;
import com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody;
import com.sporty.android.core.model.kyc.phonemigration.PasswordVerifyToken;
import com.sporty.android.core.model.kyc.phonemigration.VerifyMainOTPBody;
import com.sporty.android.core.model.kyc.phonemigration.VerifyNameMatchResult;
import com.sporty.android.core.model.kyc.phonemigration.VerifySubsidiaryOTPBody;
import com.sporty.android.core.model.nin.SubmitNINBody;
import com.sporty.android.core.model.oddsformat.OddsFormatRequest;
import com.sporty.android.core.model.patron.AccountInfoModel;
import com.sporty.android.core.model.patron.BindNewPhoneRequest;
import com.sporty.android.core.model.patron.BirthdayVerifyData;
import com.sporty.android.core.model.patron.Country;
import com.sporty.android.core.model.patron.DefaultGift;
import com.sporty.android.core.model.patron.DevicesFeatureConfigResponse;
import com.sporty.android.core.model.patron.DevicesResponse;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.core.model.patron.FeedbackDescription;
import com.sporty.android.core.model.patron.Get2FAInfoResponse;
import com.sporty.android.core.model.patron.GooglePlayAvailableData;
import com.sporty.android.core.model.patron.InitSmsVerificationResponse;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.Location;
import com.sporty.android.core.model.patron.LoginResponse;
import com.sporty.android.core.model.patron.LogoutDeviceRequest;
import com.sporty.android.core.model.patron.MyFavoriteOddRange;
import com.sporty.android.core.model.patron.NINConfigResponse;
import com.sporty.android.core.model.patron.NINInfoResponse;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sporty.android.core.model.patron.NicknameAvailabilityResponse;
import com.sporty.android.core.model.patron.PersonalInfo;
import com.sporty.android.core.model.patron.Preference;
import com.sporty.android.core.model.patron.RefreshDeviceResponse;
import com.sporty.android.core.model.patron.Send2FACodeResponse;
import com.sporty.android.core.model.patron.TooltipVisibilityResponse;
import com.sporty.android.core.model.patron.UpdateNicknameRequest;
import com.sporty.android.core.model.patron.UpdateNicknameResponse;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.patron.UserCertInfo;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.patron.VerifiedInfoResponse;
import com.sporty.android.core.model.patron.VerifyCodeStatus;
import com.sporty.android.core.model.patron.VerifyOtpRequest;
import com.sporty.android.core.model.patron.VerifyPersonalInfoBody;
import com.sporty.android.core.model.patron.VerifyPersonalInfoResult;
import com.sporty.android.core.model.patron.WithdrawalPinVerifyResponse;
import com.sporty.android.core.model.primaryphone.GetReviewedPrimaryPhoneResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneBindOTPSessionForNewPhoneBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfigResponse;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameResult;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPResult;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberBody;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberResult;
import com.sporty.android.core.model.primaryphone.VerifyIdentityBody;
import com.sporty.android.core.model.primaryphone.VerifyIdentityResult;
import com.sporty.android.core.model.security.otp.BindNewPhoneOTPSessionData;
import com.sporty.android.core.model.security.otp.CheckIsTrustedDeviceResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.core.model.security.otp.PhoneOTPSessionData;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sporty.android.core.model.security.otp.ReactivateAccountResult;
import com.sporty.android.core.model.security.otp.RegisterBrSessionData;
import com.sporty.android.core.model.security.otp.RegisterBrVerifyCode;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.core.model.security.otp.SportyPinRequestBody;
import com.sporty.android.core.model.security.otp.SportyPinSessionToken;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sporty.android.core.model.security.twofa.GetTwoFAHintStatusResponse;
import com.sporty.android.core.model.security.twofa.UpdateTwoFAIndicatorStatusBody;
import com.sporty.android.core.model.timecontrol.SelfExclusionRequest;
import com.sporty.android.core.model.timecontrol.SelfExclusionResponse;
import com.sporty.android.core.model.timecontrol.TimeSelfExclusionRequest;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005H§@¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00052\b\b\u0001\u0010\u0015\u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 H§@¢\u0006\u0004\b$\u0010%J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010\bJ\"\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b(\u0010\fJ \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00052\b\b\u0001\u0010*\u001a\u00020)H§@¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b.\u0010\u001eJ4\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00052\b\b\u0001\u0010\u0015\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 H§@¢\u0006\u0004\b2\u00103J \u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0015\u001a\u000204H§@¢\u0006\u0004\b5\u00106J \u00107\u001a\b\u0012\u0004\u0012\u0002010\u00052\b\b\u0001\u0010\u0015\u001a\u00020/H§@¢\u0006\u0004\b7\u00108J \u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010*\u001a\u000209H§@¢\u0006\u0004\b;\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0005H§@¢\u0006\u0004\b>\u0010\u001eJ \u0010@\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010\u0015\u001a\u00020?H§@¢\u0006\u0004\b@\u0010AJ\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00020:0\u0005H§@¢\u0006\u0004\bB\u0010\u001eJ \u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00052\b\b\u0001\u0010\u0015\u001a\u00020CH§@¢\u0006\u0004\bE\u0010FJ \u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0015\u001a\u00020CH§@¢\u0006\u0004\bG\u0010FJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0015\u001a\u00020H2\b\b\u0001\u0010\"\u001a\u00020 H§@¢\u0006\u0004\bI\u0010JJ\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bK\u0010\u001eJ \u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0015\u001a\u00020LH§@¢\u0006\u0004\bM\u0010NJ \u0010P\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010\u0015\u001a\u00020OH§@¢\u0006\u0004\bP\u0010QJ:\u0010U\u001a\b\u0012\u0004\u0012\u00020:0\u00052\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010S\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bU\u0010VJ\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\bW\u0010\u001eJ4\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010*\u001a\u00020X2\b\b\u0001\u00100\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 H§@¢\u0006\u0004\bY\u0010ZJ \u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u000e\u001a\u00020[H§@¢\u0006\u0004\b\\\u0010]J\"\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u00052\n\b\u0003\u0010^\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b`\u0010\fJ\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0005H§@¢\u0006\u0004\bb\u0010\u001eJ:\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u00052\u000e\b\u0001\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020c2\b\b\u0001\u0010f\u001a\u00020e2\b\b\u0001\u0010g\u001a\u00020eH§@¢\u0006\u0004\bi\u0010jJ \u0010l\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010*\u001a\u00020kH§@¢\u0006\u0004\bl\u0010mJ\u0016\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u0005H§@¢\u0006\u0004\bo\u0010\u001eJ \u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u00052\b\b\u0001\u0010p\u001a\u00020eH§@¢\u0006\u0004\br\u0010sJ\u001c\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0\u00050tH§@¢\u0006\u0004\bv\u0010\u001eJ*\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u00052\b\b\u0001\u0010w\u001a\u00020\u00022\b\b\u0001\u0010x\u001a\u00020\u0002H§@¢\u0006\u0004\bz\u0010\bJ\u0016\u0010|\u001a\b\u0012\u0004\u0012\u00020{0\u0005H§@¢\u0006\u0004\b|\u0010\u001eJ\u001b\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020{0\u00050}H'¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0005H§@¢\u0006\u0005\b\u0081\u0001\u0010\u001eJK\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J%\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000b\b\u0001\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\b\u0089\u0001\u0010\fJ\u001f\u0010\u008b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010c0\u0005H§@¢\u0006\u0005\b\u008b\u0001\u0010\u001eJ,\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008c\u0001\u0010\bJ,\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b\u008d\u0001\u0010\bJ$\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\t\b\u0001\u0010*\u001a\u00030\u008e\u0001H§@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u0005H§@¢\u0006\u0005\b\u0092\u0001\u0010\u001eJ$\u0010\u0095\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u00052\t\b\u0001\u0010\u0093\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u0095\u0001\u0010\fJ\u0019\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\u0005H§@¢\u0006\u0005\b\u0097\u0001\u0010\u001eJ%\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\u00052\t\b\u0001\u0010\u0015\u001a\u00030\u0096\u0001H§@¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\"\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010\u0015\u001a\u00020?H§@¢\u0006\u0005\b\u009a\u0001\u0010AJ\u0019\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u0005H§@¢\u0006\u0005\b\u009c\u0001\u0010\u001eJ\u0019\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u0005H§@¢\u0006\u0005\b\u009e\u0001\u0010\u001eJ%\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00052\n\b\u0001\u0010 \u0001\u001a\u00030\u009f\u0001H§@¢\u0006\u0006\b¡\u0001\u0010¢\u0001J4\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u00052\u000b\b\u0001\u0010£\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010¤\u0001\u001a\u0004\u0018\u00010 H§@¢\u0006\u0006\b¦\u0001\u0010§\u0001J%\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u00052\t\b\u0001\u0010\u0015\u001a\u00030¨\u0001H§@¢\u0006\u0006\b©\u0001\u0010ª\u0001J$\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010\u00052\t\b\u0001\u0010«\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\b\u00ad\u0001\u0010\fJ+\u0010®\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050}2\u000b\b\u0001\u0010£\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001a\u0010°\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H§@¢\u0006\u0005\b°\u0001\u0010\u001eJ%\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\u00052\t\b\u0001\u0010\u0015\u001a\u00030±\u0001H§@¢\u0006\u0006\b³\u0001\u0010´\u0001J%\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030¶\u00010\u00052\t\b\u0001\u0010\u0015\u001a\u00030µ\u0001H§@¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0019\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010\u0005H§@¢\u0006\u0005\bº\u0001\u0010\u001eJ\"\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0005\b»\u0001\u0010\fJ\u0019\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010\u0005H§@¢\u0006\u0005\b½\u0001\u0010\u001eJ%\u0010À\u0001\u001a\t\u0012\u0005\u0012\u00030¿\u00010\u00052\t\b\u0001\u0010\u0015\u001a\u00030¾\u0001H§@¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J$\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\u00052\t\b\u0001\u0010Â\u0001\u001a\u00020\u0002H§@¢\u0006\u0005\bÄ\u0001\u0010\fJ0\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\u00052\t\b\u0001\u0010Â\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0015\u001a\u00030Å\u0001H§@¢\u0006\u0006\bÇ\u0001\u0010È\u0001J]\u0010Í\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ì\u00010\u00050Ë\u00012\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010É\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J<\u0010Ð\u0001\u001a\u0011\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ï\u00010c\u0018\u00010\u00052\b\b\u0001\u0010^\u001a\u00020\u00022\u000e\b\u0003\u0010d\u001a\b\u0012\u0004\u0012\u00020e0cH§@¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J?\u0010Ó\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u000b\b\u0001\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010É\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0005\bÓ\u0001\u0010VJ]\u0010Õ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050Ë\u00012\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010É\u0001\u001a\u00020\u00022\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\bÕ\u0001\u0010Î\u0001J\"\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010*\u001a\u00020\rH§@¢\u0006\u0005\bÖ\u0001\u0010\u0010J7\u0010×\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 H§@¢\u0006\u0006\b×\u0001\u0010Ø\u0001J,\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0001\u0010^\u001a\u00020\u00022\b\b\u0001\u0010x\u001a\u00020\u0002H§@¢\u0006\u0005\bÙ\u0001\u0010\bJ\"\u0010Ú\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010w\u001a\u00020\u0002H§@¢\u0006\u0005\bÚ\u0001\u0010\fJV\u0010Þ\u0001\u001a\t\u0012\u0005\u0012\u00030Ý\u00010\u00052\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010x\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010Ü\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Û\u0001H§@¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J7\u0010â\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010à\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010á\u0001\u001a\u00020eH'¢\u0006\u0006\bâ\u0001\u0010ã\u0001J,\u0010å\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ä\u00010\u00050}2\u000b\b\u0001\u0010à\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\bå\u0001\u0010¯\u0001JD\u0010ç\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010æ\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010à\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010á\u0001\u001a\u00020eH'¢\u0006\u0006\bç\u0001\u0010è\u0001J7\u0010é\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010æ\u0001\u001a\u0004\u0018\u00010\u00022\t\b\u0001\u0010á\u0001\u001a\u00020eH'¢\u0006\u0006\bé\u0001\u0010ã\u0001J\u001e\u0010ê\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0080\u00010\u00050}H'¢\u0006\u0005\bê\u0001\u0010\u007fJ*\u0010ì\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\t\b\u0001\u0010ë\u0001\u001a\u00020eH'¢\u0006\u0006\bì\u0001\u0010í\u0001J\u001e\u0010î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}H'¢\u0006\u0005\bî\u0001\u0010\u007fJ2\u0010ñ\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ð\u00010c0\u00050}2\u000b\b\u0001\u0010ï\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\bñ\u0001\u0010¯\u0001JR\u0010ô\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050}2\u000b\b\u0001\u0010ò\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010£\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010ï\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010ó\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\bô\u0001\u0010õ\u0001JM\u0010ö\u0001\u001a\b\u0012\u0004\u0012\u00020:0\u00052\u000b\b\u0001\u0010ò\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010£\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010ï\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010ó\u0001\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0006\bö\u0001\u0010\u0087\u0001J+\u0010÷\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b÷\u0001\u0010¯\u0001J\u001e\u0010ù\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ø\u00010\u00050}H'¢\u0006\u0005\bù\u0001\u0010\u007fJ\u0019\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\u0005H§@¢\u0006\u0005\bú\u0001\u0010\u001eJ\u001f\u0010û\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050Ë\u0001H'¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u0018\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u0005H§@¢\u0006\u0005\bý\u0001\u0010\u001eJ\u001f\u0010ÿ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030þ\u00010c0\u0005H§@¢\u0006\u0005\bÿ\u0001\u0010\u001eJG\u0010\u0080\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050Ë\u00012\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010É\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J,\u0010\u0082\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0082\u0002\u0010¯\u0001J+\u0010\u0083\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0083\u0002\u0010¯\u0001J%\u0010\u0086\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0001\u0010\u0085\u0002\u001a\u00030\u0084\u0002H§@¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002JF\u0010\u0089\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u00020\u00050Ë\u00012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010É\u0001\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0089\u0002\u0010\u0081\u0002J+\u0010\u008a\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050Ë\u00012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u0019\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00020\u0005H§@¢\u0006\u0005\b\u008d\u0002\u0010\u001eJ6\u0010\u008e\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050}2\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010x\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J0\u0010\u0090\u0002\u001a\u0015\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u0018\u00010Ë\u00012\t\b\u0001\u0010£\u0001\u001a\u00020\u0002H'¢\u0006\u0006\b\u0090\u0002\u0010\u008b\u0002J\u001e\u0010\u0092\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00020\u00050}H'¢\u0006\u0005\b\u0092\u0002\u0010\u007fJ\u001d\u0010\u0093\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050}H'¢\u0006\u0005\b\u0093\u0002\u0010\u007fJ\u001e\u0010\u0095\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0094\u00020\u00050}H'¢\u0006\u0005\b\u0095\u0002\u0010\u007fJ?\u0010\u0099\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020}2\u000b\b\u0001\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u00022\u000b\b\u0001\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u001e\u0010\u009b\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0091\u00010\u00050}H'¢\u0006\u0005\b\u009b\u0002\u0010\u007fJ\u001e\u0010\u009d\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u00020\u00050}H'¢\u0006\u0005\b\u009d\u0002\u0010\u007fJ#\u0010\u009e\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020c0\u00050}H'¢\u0006\u0005\b\u009e\u0002\u0010\u007fJ\u001e\u0010\u009f\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}H'¢\u0006\u0005\b\u009f\u0002\u0010\u007fJ-\u0010 \u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050Ë\u00012\u000b\b\u0001\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b \u0002\u0010\u008b\u0002J\u001d\u0010¡\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050}H'¢\u0006\u0005\b¡\u0002\u0010\u007fJ,\u0010£\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010\u000e\u001a\u0005\u0018\u00010¢\u0002H'¢\u0006\u0006\b£\u0002\u0010¤\u0002J,\u0010¦\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010¥\u0002\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b¦\u0002\u0010¯\u0001J+\u0010§\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b§\u0002\u0010¯\u0001J,\u0010©\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Ô\u00010\u00050}2\u000b\b\u0001\u0010¨\u0002\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b©\u0002\u0010¯\u0001J$\u0010¬\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\u00052\t\b\u0001\u0010ª\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\b¬\u0002\u0010\fJ#\u0010®\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\t\b\u0001\u0010\u00ad\u0002\u001a\u00020\u0002H§@¢\u0006\u0005\b®\u0002\u0010\fJ\u0018\u0010¯\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H§@¢\u0006\u0005\b¯\u0002\u0010\u001eJ\u0019\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030°\u00020\u0005H§@¢\u0006\u0005\b±\u0002\u0010\u001eJ%\u0010´\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0001\u0010³\u0002\u001a\u00030²\u0002H§@¢\u0006\u0006\b´\u0002\u0010µ\u0002J%\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030·\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030¶\u0002H§@¢\u0006\u0006\b¸\u0002\u0010¹\u0002J$\u0010»\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u00052\t\b\u0001\u0010\u0015\u001a\u00030º\u0002H§@¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u0018\u0010½\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u0005H§@¢\u0006\u0005\b½\u0002\u0010\u001eJ\u0019\u0010¿\u0002\u001a\t\u0012\u0005\u0012\u00030¾\u00020\u0005H§@¢\u0006\u0005\b¿\u0002\u0010\u001eJ\u0019\u0010Á\u0002\u001a\t\u0012\u0005\u0012\u00030À\u00020\u0005H§@¢\u0006\u0005\bÁ\u0002\u0010\u001eJ%\u0010Ã\u0002\u001a\t\u0012\u0005\u0012\u00030À\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030Â\u0002H§@¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J%\u0010Æ\u0002\u001a\t\u0012\u0005\u0012\u00030À\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030Å\u0002H§@¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\u0018\u0010È\u0002\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H§@¢\u0006\u0005\bÈ\u0002\u0010\u001eJ\u0019\u0010Ê\u0002\u001a\t\u0012\u0005\u0012\u00030É\u00020\u0005H§@¢\u0006\u0005\bÊ\u0002\u0010\u001eJ\u0019\u0010Ì\u0002\u001a\t\u0012\u0005\u0012\u00030Ë\u00020\u0005H§@¢\u0006\u0005\bÌ\u0002\u0010\u001eJ%\u0010Ï\u0002\u001a\t\u0012\u0005\u0012\u00030Î\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030Í\u0002H§@¢\u0006\u0006\bÏ\u0002\u0010Ð\u0002J%\u0010Ó\u0002\u001a\t\u0012\u0005\u0012\u00030Ò\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030Ñ\u0002H§@¢\u0006\u0006\bÓ\u0002\u0010Ô\u0002J%\u0010Ö\u0002\u001a\t\u0012\u0005\u0012\u00030Õ\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030Õ\u0002H§@¢\u0006\u0006\bÖ\u0002\u0010×\u0002J$\u0010Ù\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\t\b\u0001\u0010\u0015\u001a\u00030Ø\u0002H§@¢\u0006\u0006\bÙ\u0002\u0010Ú\u0002J$\u0010Ü\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u00052\t\b\u0001\u0010\u0015\u001a\u00030Û\u0002H§@¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\u0018\u0010Þ\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u0005H§@¢\u0006\u0005\bÞ\u0002\u0010\u001eJ%\u0010á\u0002\u001a\t\u0012\u0005\u0012\u00030à\u00020\u00052\t\b\u0001\u0010\u0015\u001a\u00030ß\u0002H§@¢\u0006\u0006\bá\u0002\u0010â\u0002J\u0019\u0010ä\u0002\u001a\t\u0012\u0005\u0012\u00030ã\u00020\u0005H§@¢\u0006\u0005\bä\u0002\u0010\u001eJ\u0019\u0010æ\u0002\u001a\t\u0012\u0005\u0012\u00030å\u00020\u0005H§@¢\u0006\u0005\bæ\u0002\u0010\u001eJ\u001f\u0010è\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ç\u00020c0\u0005H§@¢\u0006\u0005\bè\u0002\u0010\u001eJ\u0019\u0010ê\u0002\u001a\t\u0012\u0005\u0012\u00030é\u00020\u0005H§@¢\u0006\u0005\bê\u0002\u0010\u001eJ\u0019\u0010ì\u0002\u001a\t\u0012\u0005\u0012\u00030ë\u00020\u0005H§@¢\u0006\u0005\bì\u0002\u0010\u001eJ\u0018\u0010í\u0002\u001a\b\u0012\u0004\u0012\u00020 0\u0005H§@¢\u0006\u0005\bí\u0002\u0010\u001eJ\u0019\u0010ï\u0002\u001a\t\u0012\u0005\u0012\u00030î\u00020\u0005H§@¢\u0006\u0005\bï\u0002\u0010\u001eJ%\u0010ñ\u0002\u001a\b\u0012\u0004\u0012\u00020:0\u00052\n\b\u0001\u0010ð\u0002\u001a\u00030î\u0002H§@¢\u0006\u0006\bñ\u0002\u0010ò\u0002¨\u0006ó\u0002À\u0006\u0003"}, d2 = {"Lxxz;", "", "", "phoneCountryCode", "phone", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sporty/android/core/model/security/otp/OTPGeneralResult;", "N0", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "jsonString", "Ljava/lang/Void;", "Q0", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/PhoneOTPSessionData;", "data", "m", "(Lcom/sporty/android/core/model/security/otp/PhoneOTPSessionData;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/RegisterBrSessionData;", "w0", "(Lcom/sporty/android/core/model/security/otp/RegisterBrSessionData;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/RegisterBrVerifyCode;", "body", "Lcom/sporty/android/core/model/security/otp/OTPCompleteResult;", "q1", "(Lcom/sporty/android/core/model/security/otp/RegisterBrVerifyCode;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/RegisterCompleteBody;", "q", "(Lcom/sporty/android/core/model/security/otp/RegisterCompleteBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/SportyPinSessionToken;", "F1", "(Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/SportyPinRequestBody;", "", "isTrusted", "isBioVerify", "Lcom/sporty/android/core/model/security/otp/ResetSportyPINResult;", "M0", "(Lcom/sporty/android/core/model/security/otp/SportyPinRequestBody;ZZLv1b;)Ljava/lang/Object;", "L1", "Lcom/sporty/android/core/model/security/otp/ReactivateAccountResult;", "c", "Lcom/sporty/android/core/model/security/otp/OTPVerificationRequest;", "request", "Lcom/sporty/android/core/model/security/otp/OTPUpdateNameResult;", "k", "(Lcom/sporty/android/core/model/security/otp/OTPVerificationRequest;Lv1b;)Ljava/lang/Object;", "D1", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyOTPBody;", "isTrustedDevice", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyOTPResult;", "e1", "(Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyOTPBody;ZZLv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneBindOTPSessionForNewPhoneBody;", "B1", "(Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneBindOTPSessionForNewPhoneBody;Lv1b;)Ljava/lang/Object;", "Z", "(Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyOTPBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/oddsformat/OddsFormatRequest;", "", "y0", "(Lcom/sporty/android/core/model/oddsformat/OddsFormatRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/MyFavoriteStake;", "p", "Lcom/sporty/android/core/model/nin/SubmitNINBody;", "S", "(Lcom/sporty/android/core/model/nin/SubmitNINBody;Lv1b;)Ljava/lang/Object;", "Z0", "Lcom/sporty/android/core/model/kyc/phonemigration/PasswordVerifyToken;", "Lcom/sporty/android/core/model/kyc/phonemigration/VerifyNameMatchResult;", "y", "(Lcom/sporty/android/core/model/kyc/phonemigration/PasswordVerifyToken;Lv1b;)Ljava/lang/Object;", "K", "Lcom/sporty/android/core/model/kyc/phonemigration/VerifyMainOTPBody;", "T0", "(Lcom/sporty/android/core/model/kyc/phonemigration/VerifyMainOTPBody;ZLv1b;)Ljava/lang/Object;", "P0", "Lcom/sporty/android/core/model/kyc/phonemigration/VerifySubsidiaryOTPBody;", "z", "(Lcom/sporty/android/core/model/kyc/phonemigration/VerifySubsidiaryOTPBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/kyc/phonemigration/MigratePhoneBody;", "m1", "(Lcom/sporty/android/core/model/kyc/phonemigration/MigratePhoneBody;Lv1b;)Ljava/lang/Object;", "inviteCode", "creativeId", "source", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "t0", "Lcom/sporty/android/core/model/patron/VerifyOtpRequest;", "u0", "(Lcom/sporty/android/core/model/patron/VerifyOtpRequest;ZZLv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/security/otp/BindNewPhoneOTPSessionData;", "n", "(Lcom/sporty/android/core/model/security/otp/BindNewPhoneOTPSessionData;Lv1b;)Ljava/lang/Object;", "token", "Lcom/sporty/android/core/model/account/CpfData;", "k1", "Lcom/sporty/android/core/model/patron/DevicesFeatureConfigResponse;", "J", "", "statuses", "", "pageSize", "pageNumber", "Lcom/sporty/android/core/model/patron/DevicesResponse;", "V", "(Ljava/util/List;IILv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/patron/LogoutDeviceRequest;", "h1", "(Lcom/sporty/android/core/model/patron/LogoutDeviceRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/patron/RefreshDeviceResponse;", "u1", "toolTipType", "Lcom/sporty/android/core/model/patron/TooltipVisibilityResponse;", "Y", "(ILv1b;)Ljava/lang/Object;", "Lbi50;", "Lcom/sporty/android/core/model/patron/GooglePlayAvailableData;", "W0", "mobile", "password", "Lcom/sporty/android/core/model/patron/LoginResponse;", "B", "Lcom/sporty/android/core/model/patron/NameConfirmationStatus;", "O0", "Lsu5;", "p1", "()Lsu5;", "Lcom/sporty/android/core/model/security/sportypin/WithdrawalPinStatusInfo;", "b", "avatarUrl", "largeAvatarFrameUrl", "smallAvatarFrameUrl", "frameApplied", "I1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "theme", "C0", "Lcom/sporty/android/core/model/patron/UserPhone;", "z1", "a1", "G", "Lcom/sporty/android/core/model/patron/BindNewPhoneRequest;", "s1", "(Lcom/sporty/android/core/model/patron/BindNewPhoneRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/AccountInfo;", "G0", "bizType", "Lcom/sporty/android/core/model/patron/VerifyCodeStatus;", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "Lcom/sporty/android/core/model/patron/UserCertInfo;", "a0", "L0", "(Lcom/sporty/android/core/model/patron/UserCertInfo;Lv1b;)Ljava/lang/Object;", "D0", "Lcom/sporty/android/core/model/patron/NINConfigResponse;", "D", "Lcom/sporty/android/core/model/patron/NINInfoResponse;", "U", "Lcom/sporty/android/core/model/patron/FeedbackDescription;", "description", "t", "(Lcom/sporty/android/core/model/patron/FeedbackDescription;Lv1b;)Ljava/lang/Object;", "value", "verified", "Lcom/sporty/android/core/model/patron/UpdateNicknameResponse;", "e0", "(Ljava/lang/String;Ljava/lang/Boolean;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/patron/UpdateNicknameRequest;", "r", "(Lcom/sporty/android/core/model/patron/UpdateNicknameRequest;Lv1b;)Ljava/lang/Object;", "nickname", "Lcom/sporty/android/core/model/patron/NicknameAvailabilityResponse;", "I0", "d1", "(Ljava/lang/String;)Lsu5;", "h", "Lcom/sporty/android/core/model/primaryphone/VerifyIdentityBody;", "Lcom/sporty/android/core/model/primaryphone/VerifyIdentityResult;", "N", "(Lcom/sporty/android/core/model/primaryphone/VerifyIdentityBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/primaryphone/UpdatePrimaryPhoneNumberBody;", "Lcom/sporty/android/core/model/primaryphone/UpdatePrimaryPhoneNumberResult;", "K0", "(Lcom/sporty/android/core/model/primaryphone/UpdatePrimaryPhoneNumberBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/primaryphone/GetReviewedPrimaryPhoneResult;", "f0", "A0", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneConfigResponse;", "P", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyNameBody;", "Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyNameResult;", "q0", "(Lcom/sporty/android/core/model/primaryphone/PrimaryPhoneVerifyNameBody;Lv1b;)Ljava/lang/Object;", "uid", "Lcom/sporty/android/core/model/patron/PersonalInfo;", "C1", "Lcom/sporty/android/core/model/patron/VerifyPersonalInfoBody;", "Lcom/sporty/android/core/model/patron/VerifyPersonalInfoResult;", "o0", "(Ljava/lang/String;Lcom/sporty/android/core/model/patron/VerifyPersonalInfoBody;Lv1b;)Ljava/lang/Object;", "uuid", "captchaToken", "Lct90;", "Lcom/sporty/android/core/model/patron/InitSmsVerificationResponse;", "B0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lct90;", "Lcom/sporty/android/core/model/patron/VerifiedInfoResponse;", "K1", "(Ljava/lang/String;Ljava/util/List;Lv1b;)Ljava/lang/Object;", "mailString", "s0", "Lxdp;", "o", "e", "d", "(Lcom/sporty/android/core/model/security/otp/OTPVerificationRequest;ZZLv1b;)Ljava/lang/Object;", "p0", "b0", "", "kycParams", "Lcom/sporty/android/core/model/security/otp/PreRegisterResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lv1b;)Ljava/lang/Object;", "key", UserCertConstants.CONFIRM_NAME_USAGE, "f", "(Ljava/lang/String;I)Lsu5;", "Lcom/sporty/android/core/model/patron/WithdrawalPinVerifyResponse;", "O", "pinToken", "W", "(Ljava/lang/String;Ljava/lang/String;I)Lsu5;", "H1", "y1", AnalyticsParam.EVENT_STATUS, "Q", "(I)Lsu5;", "r0", "state", "Lcom/sporty/android/core/model/patron/Location;", "d0", "property", "area", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsu5;", "b1", "a", "Lcom/sporty/android/core/model/patron/KYCReminder;", "s", "C", "f1", "()Lct90;", "i1", "Lcom/sporty/android/core/model/patron/KYCBannerItem;", "Y0", "v1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lct90;", "c1", "H0", "Lcom/sporty/android/core/model/patron/Preference;", "model", "T", "(Lcom/sporty/android/core/model/patron/Preference;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/patron/Send2FACodeResponse;", "j1", "l", "(Ljava/lang/String;)Lct90;", "Lcom/sporty/android/core/model/patron/Get2FAInfoResponse;", "E0", "V0", "(Ljava/lang/String;Ljava/lang/String;)Lsu5;", "setLanguage", "Lcom/sporty/android/core/model/patron/MyFavoriteOddRange;", "w1", "U0", "Lcom/sporty/android/core/model/patron/AccountInfoModel;", "m0", LastLoginDeviceInfo.KEY_LOCATION, "refreshToken", "accessToken", "o1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lsu5;", "c0", "Lcom/sporty/android/core/model/patron/FavoriteSummary;", "j0", "t1", "A1", "refreshAccessToken", "logout", "Lcom/sporty/android/core/model/patron/BirthdayVerifyData;", "h0", "(Lcom/sporty/android/core/model/patron/BirthdayVerifyData;)Lsu5;", "deviceId", "E1", "R", "oldPassword", "k0", "captchaAction", "Lcom/sporty/android/core/model/security/otp/CheckIsTrustedDeviceResponse;", "x", "clientEventId", "G1", "w", "Lcom/sporty/android/core/model/security/twofa/GetTwoFAHintStatusResponse;", "g0", "Lcom/sporty/android/core/model/security/twofa/UpdateTwoFAIndicatorStatusBody;", "updateTwoFAIndicatorStatusBody", "J0", "(Lcom/sporty/android/core/model/security/twofa/UpdateTwoFAIndicatorStatusBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckBody;", "Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckResponse;", "F0", "(Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckBody;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/telegram/BindTelegramBody;", "g1", "(Lcom/sporty/android/core/model/account/telegram/BindTelegramBody;Lv1b;)Ljava/lang/Object;", "M", "Lcom/sporty/android/core/model/account/telegram/TelegramBotInfo;", "S0", "Lcom/sporty/android/core/model/timecontrol/SelfExclusionResponse;", "n1", "Lcom/sporty/android/core/model/timecontrol/TimeSelfExclusionRequest;", "n0", "(Lcom/sporty/android/core/model/timecontrol/TimeSelfExclusionRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/timecontrol/SelfExclusionRequest;", "x0", "(Lcom/sporty/android/core/model/timecontrol/SelfExclusionRequest;Lv1b;)Ljava/lang/Object;", "x1", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeConfigResponse;", "J1", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePreCheckResponse;", "r1", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePinCheckRequest;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePinCheckResponse;", "l1", "(Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePinCheckRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePasswordCheckRequest;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePasswordCheckResponse;", "i0", "(Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangePasswordCheckRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeBindOtpSessionDTO;", "z0", "(Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeBindOtpSessionDTO;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeOtpVerificationRequest;", "i", "(Lcom/sporty/android/core/model/account/verifiedemailchange/EmailChangeOtpVerificationRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/account/verifiedemailchange/EmailUpdateRequest;", "A", "(Lcom/sporty/android/core/model/account/verifiedemailchange/EmailUpdateRequest;Lv1b;)Ljava/lang/Object;", "v", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationResponse;", "H", "(Lcom/sporty/android/core/model/dateofbirth/DobVerificationRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationInfoResponse;", "I", "Lcom/sporty/android/core/model/dateofbirth/DobVerificationStatus;", "l0", "Lcom/sporty/android/core/model/patron/Country;", "F", "Lcom/sporty/android/core/model/welcomereward/NonFtdEngagement;", "X0", "Lcom/sporty/android/core/model/account/PasswordResetStatusResponse;", "E", "v0", "Lcom/sporty/android/core/model/patron/DefaultGift;", "R0", "defaultGift", "u", "(Lcom/sporty/android/core/model/patron/DefaultGift;Lv1b;)Ljava/lang/Object;", "common-network"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface xxz {
    @flz("patron/account/verified-email/update")
    Object A(@jh4 EmailUpdateRequest emailUpdateRequest, v1b<? super BaseResponse<Unit>> v1bVar);

    @amc("patron/account/primary-phone/review")
    Object A0(@db30("phone") String str, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/dob/status")
    su5<BaseResponse<xdp>> A1();

    @flz("patron/accessToken")
    @tti
    Object B(@gjh("username") String str, @gjh("password") String str2, v1b<? super BaseResponse<LoginResponse>> v1bVar);

    @flz("patron/verifyCode/sms")
    @tti
    ct90<BaseResponse<InitSmsVerificationResponse>> B0(@gjh("phone") String mobile, @gjh("bizType") String bizType, @gjh("token") String token, @rhl("captcha-uuid") String uuid, @rhl("captcha-token") String captchaToken);

    @flz("patron/account/primary-phone/bind/otp/session/new")
    @gil({"Content-Type: application/json"})
    Object B1(@jh4 PrimaryPhoneBindOTPSessionForNewPhoneBody primaryPhoneBindOTPSessionForNewPhoneBody, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/kyc/user/reminder")
    Object C(v1b<? super BaseResponse<KYCReminder>> v1bVar);

    @gmz("patron/account/info/theme")
    @gil({"Content-Type: application/json"})
    Object C0(@jh4 String str, v1b<? super BaseResponse<Void>> v1bVar);

    @sbj("patron/account/cert/personal/info")
    Object C1(@rhl("uid") String str, v1b<? super BaseResponse<PersonalInfo>> v1bVar);

    @sbj("patron/nin/config")
    Object D(v1b<? super BaseResponse<NINConfigResponse>> v1bVar);

    @flz("patron/nin/submit")
    Object D0(@jh4 SubmitNINBody submitNINBody, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/primary-phone/bind/otp/session/old")
    Object D1(v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/verify-identity/isPasswordResetForced")
    Object E(v1b<? super BaseResponse<PasswordResetStatusResponse>> v1bVar);

    @sbj("patron/two-factor-auth")
    @gil({"Content-Type: application/json"})
    Object E0(v1b<? super BaseResponse<Get2FAInfoResponse>> v1bVar);

    @flz("patron/cipher")
    @tti
    su5<BaseResponse<xdp>> E1(@gjh("deviceId") String deviceId);

    @sbj("patron/country/list/all")
    Object F(v1b<? super BaseResponse<List<Country>>> v1bVar);

    @flz("patron/telegram/bind/preCheck")
    Object F0(@jh4 TelegramBindingPreCheckBody telegramBindingPreCheckBody, v1b<? super BaseResponse<TelegramBindingPreCheckResponse>> v1bVar);

    @flz("patron/account/info/sportypin/reset/otp/session")
    Object F1(v1b<? super BaseResponse<SportyPinSessionToken>> v1bVar);

    @sbj("patron/account/phone/verify-can-be-bound")
    Object G(@db30("phoneCountryCode") String str, @db30("phone") String str2, v1b<? super BaseResponse<Object>> v1bVar);

    @sbj("patron/account/info")
    Object G0(v1b<? super BaseResponse<AccountInfo>> v1bVar);

    @flz("patron/register/start")
    Object G1(@rhl("Client-Event-Id") String str, v1b<? super BaseResponse<Object>> v1bVar);

    @flz("patron/nin/submit/dob-verification")
    Object H(@jh4 DobVerificationRequest dobVerificationRequest, v1b<? super BaseResponse<DobVerificationResponse>> v1bVar);

    @flz("patron/account/info/withdrawpin/otp/validate")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<xdp>> H0(@jh4 String jsonString);

    @flz("patron/account/info/withdrawpin/usage")
    @tti
    su5<BaseResponse<xdp>> H1(@gjh("pinToken") String pinToken, @gjh(UserCertConstants.CONFIRM_NAME_USAGE) int usage);

    @sbj("patron/nin/dob-verification/info")
    Object I(v1b<? super BaseResponse<DobVerificationInfoResponse>> v1bVar);

    @sbj("patron/account/nickname/availability")
    Object I0(@db30("nickname") String str, v1b<? super BaseResponse<NicknameAvailabilityResponse>> v1bVar);

    @gmz("patron/account/info/avatar")
    @tti
    Object I1(@gjh("avatarUrl") String str, @gjh("largeAvatarFrameUrl") String str2, @gjh("smallAvatarFrameUrl") String str3, @gjh("frameApplied") String str4, v1b<? super BaseResponse<Void>> v1bVar);

    @sbj("patron/user/devices/config")
    Object J(v1b<? super BaseResponse<DevicesFeatureConfigResponse>> v1bVar);

    @flz("patron/two-factor-auth/indicator")
    Object J0(@jh4 UpdateTwoFAIndicatorStatusBody updateTwoFAIndicatorStatusBody, v1b<? super BaseResponse<String>> v1bVar);

    @sbj("patron/account/verified-email/config")
    Object J1(v1b<? super BaseResponse<EmailChangeConfigResponse>> v1bVar);

    @flz("patron/account/phone/migrate/otp/get-main-session")
    Object K(@jh4 PasswordVerifyToken passwordVerifyToken, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/primary-phone/verify")
    @gil({"Content-Type: application/json"})
    Object K0(@jh4 UpdatePrimaryPhoneNumberBody updatePrimaryPhoneNumberBody, v1b<? super BaseResponse<UpdatePrimaryPhoneNumberResult>> v1bVar);

    @sbj("patron/kyc/user/submission/list/user")
    Object K1(@db30("token") String str, @db30("statuses") List<Integer> list, v1b<? super BaseResponse<List<VerifiedInfoResponse>>> v1bVar);

    @gmz("patron/account/info/{property}")
    @tti
    su5<BaseResponse<String>> L(@dxz("property") String property, @gjh("value") String value, @gjh("state") String state, @gjh("area") String area);

    @flz("patron/account/cert/confirm")
    @gil({"Content-Type: application/json"})
    Object L0(@jh4 UserCertInfo userCertInfo, v1b<? super BaseResponse<UserCertInfo>> v1bVar);

    @flz("patron/activity/reactivate/otp/token")
    @tti
    Object L1(@gjh("phoneCountryCode") String str, @gjh("phone") String str2, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/telegram/unbind")
    Object M(v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/info/sportypin/reset/otp/validate")
    @gil({"Content-Type: application/json"})
    Object M0(@jh4 SportyPinRequestBody sportyPinRequestBody, @db30("trusted-device") boolean z, @db30("bio-verify") boolean z2, v1b<? super BaseResponse<ResetSportyPINResult>> v1bVar);

    @flz("patron/activity/identity/verify")
    @gil({"Content-Type: application/json"})
    Object N(@jh4 VerifyIdentityBody verifyIdentityBody, v1b<? super BaseResponse<VerifyIdentityResult>> v1bVar);

    @flz("patron/activity/deactivate/otp/token")
    Object N0(@db30("phoneCountryCode") String str, @db30("phone") String str2, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/info/withdrawpin/verify")
    @tti
    su5<BaseResponse<WithdrawalPinVerifyResponse>> O(@gjh("key") String key);

    @sbj("patron/account/cert/status")
    Object O0(v1b<? super BaseResponse<NameConfirmationStatus>> v1bVar);

    @sbj("patron/account/primary-phone/config")
    Object P(v1b<? super BaseResponse<PrimaryPhoneConfigResponse>> v1bVar);

    @flz("patron/account/phone/migrate/otp/get-subsidiary-session")
    Object P0(v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/info/withdraw/fingerprint/status")
    @tti
    su5<BaseResponse<xdp>> Q(@gjh(AnalyticsParam.EVENT_STATUS) int status);

    @flz("patron/activity/deactivate/verify")
    @gil({"Content-Type: application/json"})
    Object Q0(@jh4 String str, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("patron/account/info/selfExclusion")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<xdp>> R(@jh4 String jsonString);

    @sbj("/patron/preferences/betting")
    Object R0(v1b<? super BaseResponse<DefaultGift>> v1bVar);

    @flz("patron/nin/submit/greylist/large-deposit")
    Object S(@jh4 SubmitNINBody submitNINBody, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/telegram/bind/botInfo")
    Object S0(v1b<? super BaseResponse<TelegramBotInfo>> v1bVar);

    @gmz("patron/preferences")
    Object T(@jh4 Preference preference, v1b<? super BaseResponse<Void>> v1bVar);

    @flz("patron/account/phone/migrate/otp/verify-main")
    Object T0(@jh4 VerifyMainOTPBody verifyMainOTPBody, @db30("bio-verify") boolean z, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/nin/info")
    Object U(v1b<? super BaseResponse<NINInfoResponse>> v1bVar);

    @sbj("patron/check")
    su5<BaseResponse<Boolean>> U0();

    @sbj("patron/user/devices")
    Object V(@db30("statuses") List<String> list, @db30("pageSize") int i, @db30("pageNo") int i2, v1b<? super BaseResponse<DevicesResponse>> v1bVar);

    @gmz("patron/password/changeWithToken")
    @tti
    su5<BaseResponse<String>> V0(@gjh("token") String token, @gjh("password") String password);

    @flz("patron/account/info/withdrawpin/reset")
    @tti
    su5<BaseResponse<xdp>> W(@gjh("pinToken") String pinToken, @gjh("key") String key, @gjh(UserCertConstants.CONFIRM_NAME_USAGE) int usage);

    @sbj("patron/locations/androidGooglePlayAvailable")
    Object W0(v1b<? super bi50<BaseResponse<GooglePlayAvailableData>>> v1bVar);

    @sbj("patron/verifyCode/status")
    @gil({"Content-Type: application/json"})
    Object X(@db30("bizType") String str, v1b<? super BaseResponse<VerifyCodeStatus>> v1bVar);

    @sbj("patron/user/engagement/non-ftd")
    Object X0(v1b<? super BaseResponse<NonFtdEngagement>> v1bVar);

    @sbj("patron/account/tool-tip")
    Object Y(@db30("toolTipType") int i, v1b<? super BaseResponse<TooltipVisibilityResponse>> v1bVar);

    @sbj("patron/kyc/user/tiers")
    Object Y0(v1b<? super BaseResponse<List<KYCBannerItem>>> v1bVar);

    @flz("patron/account/primary-phone/bind/otp/verify/new")
    @gil({"Content-Type: application/json"})
    Object Z(@jh4 PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, v1b<? super BaseResponse<PrimaryPhoneVerifyOTPResult>> v1bVar);

    @flz("patron/force/logout/all")
    Object Z0(v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/phone/checkStatus")
    su5<BaseResponse<xdp>> a(@db30("phone") String mobile);

    @sbj("patron/account/cert/info")
    Object a0(v1b<? super BaseResponse<UserCertInfo>> v1bVar);

    @gmz("patron/account/phone/default")
    Object a1(@db30("phoneCountryCode") String str, @db30("phone") String str2, v1b<? super BaseResponse<Object>> v1bVar);

    @sbj("patron/account/info/withdrawpin")
    Object b(v1b<? super BaseResponse<WithdrawalPinStatusInfo>> v1bVar);

    @sbj("patron/phone/checkStatus")
    Object b0(@db30("phone") String str, v1b<? super BaseResponse<Void>> v1bVar);

    @gmz("patron/account/info/{property}")
    @tti
    Object b1(@dxz("property") String str, @gjh("value") String str2, @gjh("state") String str3, @gjh("area") String str4, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/activity/reactivate/verify")
    @gil({"Content-Type: application/json"})
    Object c(@jh4 String str, v1b<? super BaseResponse<ReactivateAccountResult>> v1bVar);

    @sbj("patron/account/info")
    su5<BaseResponse<AccountInfo>> c0();

    @sbj("patron/account/info/withdrawpin/otp/status")
    su5<BaseResponse<xdp>> c1(@db30("bizType") String bizType);

    @flz("patron/phone/reset-password/otp-verification")
    @gil({"Content-Type: application/json"})
    Object d(@jh4 OTPVerificationRequest oTPVerificationRequest, @db30("trusted-device") boolean z, @db30("bio-verify") boolean z2, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/locations")
    su5<BaseResponse<List<Location>>> d0(@db30("state") String state);

    @gmz("patron/account/info/nickname")
    @fae
    @tti
    su5<BaseResponse<String>> d1(@gjh("value") String value);

    @flz("patron/phone/reset-password/otp-session")
    @gil({"Content-Type: application/json"})
    Object e(@jh4 PhoneOTPSessionData phoneOTPSessionData, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @gmz("patron/account/info/nickname")
    @tti
    Object e0(@gjh("value") String str, @gjh("verified") Boolean bool, v1b<? super BaseResponse<UpdateNicknameResponse>> v1bVar);

    @flz("patron/account/primary-phone/bind/otp/verify/old")
    @gil({"Content-Type: application/json"})
    Object e1(@jh4 PrimaryPhoneVerifyOTPBody primaryPhoneVerifyOTPBody, @db30("trusted-device") boolean z, @db30("bio-verify") boolean z2, v1b<? super BaseResponse<PrimaryPhoneVerifyOTPResult>> v1bVar);

    @flz("patron/account/info/withdrawpin")
    @tti
    su5<BaseResponse<xdp>> f(@gjh("key") String key, @gjh(UserCertConstants.CONFIRM_NAME_USAGE) int usage);

    @sbj("patron/account/primary-phone/review")
    Object f0(v1b<? super BaseResponse<GetReviewedPrimaryPhoneResult>> v1bVar);

    @sbj("patron/mail/verify/check")
    ct90<BaseResponse<Boolean>> f1();

    @flz("patron/register/preRegister")
    @tti
    Object g(@gjh("phoneCountryCode") String str, @gjh("phone") String str2, @gjh("password") String str3, @ijh Map<String, String> map, v1b<? super BaseResponse<PreRegisterResponse>> v1bVar);

    @sbj("patron/two-factor-auth/indicator")
    Object g0(v1b<? super BaseResponse<GetTwoFAHintStatusResponse>> v1bVar);

    @flz("patron/telegram/bind")
    Object g1(@jh4 BindTelegramBody bindTelegramBody, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/user/info/nickname")
    Object h(v1b<? super BaseResponse<String>> v1bVar);

    @flz("patron/dob/verify")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<xdp>> h0(@jh4 BirthdayVerifyData data);

    @flz("patron/user/devices/logout")
    Object h1(@jh4 LogoutDeviceRequest logoutDeviceRequest, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/verified-email/bind/otp/verify")
    Object i(@jh4 EmailChangeOtpVerificationRequest emailChangeOtpVerificationRequest, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/verified-email/password/check")
    Object i0(@jh4 EmailChangePasswordCheckRequest emailChangePasswordCheckRequest, v1b<? super BaseResponse<EmailChangePasswordCheckResponse>> v1bVar);

    @sbj("patron/mail/verify/check")
    Object i1(v1b<? super BaseResponse<Boolean>> v1bVar);

    @flz("patron/account/inviteCode")
    @tti
    Object j(@gjh("inviteCode") String str, @gjh("creativeId") String str2, @gjh("source") String str3, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/preferences/selectedSummary")
    su5<BaseResponse<FavoriteSummary>> j0();

    @flz("patron/two-factor-auth/code/send")
    @gil({"Content-Type: application/json"})
    ct90<BaseResponse<Send2FACodeResponse>> j1(@jh4 String jsonString, @rhl("captcha-uuid") String uuid, @rhl("captcha-token") String captchaToken);

    @flz("patron/name-update/verify")
    @gil({"Content-Type: application/json"})
    Object k(@jh4 OTPVerificationRequest oTPVerificationRequest, v1b<? super BaseResponse<OTPUpdateNameResult>> v1bVar);

    @sbj("patron/password/check")
    su5<BaseResponse<xdp>> k0(@db30("oldPassword") String oldPassword);

    @sbj("patron/user/cpf")
    Object k1(@rhl("X-TOKEN") String str, v1b<? super BaseResponse<CpfData>> v1bVar);

    @flz("patron/two-factor-auth/code/verify")
    @gil({"Content-Type: application/json"})
    ct90<BaseResponse<Void>> l(@jh4 String jsonString);

    @sbj("patron/nin/dob-verification/status")
    Object l0(v1b<? super BaseResponse<DobVerificationStatus>> v1bVar);

    @flz("patron/account/verified-email/pin/check")
    Object l1(@jh4 EmailChangePinCheckRequest emailChangePinCheckRequest, v1b<? super BaseResponse<EmailChangePinCheckResponse>> v1bVar);

    @amc("patron/accessToken/delete")
    su5<BaseResponse<Void>> logout();

    @flz("patron/register/otp/session")
    @gil({"Content-Type: application/json"})
    Object m(@jh4 PhoneOTPSessionData phoneOTPSessionData, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/account/cert/info")
    su5<BaseResponse<AccountInfoModel>> m0();

    @flz("patron/account/phone/migrate/migrate-phone")
    Object m1(@jh4 MigratePhoneBody migratePhoneBody, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/phone/bind/otp/session/new-phone")
    Object n(@jh4 BindNewPhoneOTPSessionData bindNewPhoneOTPSessionData, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/info/selfPeriodTimeExclusion")
    Object n0(@jh4 TimeSelfExclusionRequest timeSelfExclusionRequest, v1b<? super BaseResponse<SelfExclusionResponse>> v1bVar);

    @sbj("patron/account/info/selfExclusionStatus")
    Object n1(v1b<? super BaseResponse<SelfExclusionResponse>> v1bVar);

    @flz("patron/verifyCode/sms")
    @tti
    ct90<BaseResponse<xdp>> o(@gjh("phone") String mobile, @gjh("bizType") String bizType, @gjh("token") String token, @rhl("captcha-uuid") String uuid, @rhl("captcha-token") String captchaToken);

    @flz("patron/account/cert/personal/info/verify")
    Object o0(@rhl("uid") String str, @jh4 VerifyPersonalInfoBody verifyPersonalInfoBody, v1b<? super BaseResponse<VerifyPersonalInfoResult>> v1bVar);

    @sbj("patron/accessToken/extend")
    @gil({"Platform: wap", "Content-Type: application/json"})
    @fae
    su5<String> o1(@db30(LastLoginDeviceInfo.KEY_LOCATION) String location, @rhl("RefreshToken") String refreshToken, @rhl("Authorization") String accessToken);

    @sbj("patron/preferences/defaultStake")
    @gil({"Content-Type: application/json"})
    Object p(v1b<? super BaseResponse<MyFavoriteStake>> v1bVar);

    @flz("patron/phone/reset-password")
    @tti
    Object p0(@gjh("token") String str, @gjh("password") String str2, v1b<? super BaseResponse<OTPCompleteResult>> v1bVar);

    @sbj("patron/account/cert/status")
    su5<BaseResponse<NameConfirmationStatus>> p1();

    @flz("patron/register/complete")
    @gil({"Content-Type: application/json"})
    Object q(@jh4 RegisterCompleteBody registerCompleteBody, v1b<? super BaseResponse<OTPCompleteResult>> v1bVar);

    @flz("patron/account/primary-phone/name/verify")
    @gil({"Content-Type: application/json"})
    Object q0(@jh4 PrimaryPhoneVerifyNameBody primaryPhoneVerifyNameBody, v1b<? super BaseResponse<PrimaryPhoneVerifyNameResult>> v1bVar);

    @gmz("patron/register/br/otp/verify")
    @gil({"Content-Type: application/json"})
    Object q1(@jh4 RegisterBrVerifyCode registerBrVerifyCode, v1b<? super BaseResponse<OTPCompleteResult>> v1bVar);

    @gmz("patron/account/nickname")
    @gil({"Content-Type: application/json"})
    Object r(@jh4 UpdateNicknameRequest updateNicknameRequest, v1b<? super BaseResponse<UpdateNicknameResponse>> v1bVar);

    @sbj("patron/account/info/withdraw/fingerprint/token")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<xdp>> r0();

    @sbj("patron/account/verified-email/pre-check")
    Object r1(v1b<? super BaseResponse<EmailChangePreCheckResponse>> v1bVar);

    @gmz("patron/refreshToken")
    @tti
    ct90<BaseResponse<xdp>> refreshAccessToken(@gjh("refreshToken") String refreshToken);

    @sbj("patron/kyc/user/reminder")
    @fae
    su5<BaseResponse<KYCReminder>> s();

    @gmz("patron/mail/verify/send")
    @gil({"Content-Type: application/json"})
    Object s0(@jh4 String str, @rhl("captcha-uuid") String str2, @rhl("captcha-token") String str3, v1b<? super BaseResponse<String>> v1bVar);

    @flz("patron/account/phone/bind")
    @gil({"Content-Type: application/json"})
    Object s1(@jh4 BindNewPhoneRequest bindNewPhoneRequest, v1b<? super BaseResponse<Object>> v1bVar);

    @gmz("patron/account/info/language")
    @tti
    ct90<BaseResponse<String>> setLanguage(@gjh("value") String value);

    @flz("patron/pleased/feedback")
    @gil({"Content-Type: application/json"})
    Object t(@jh4 FeedbackDescription feedbackDescription, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/phone/bind/otp/session/primary-phone")
    Object t0(v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/preferences/selectedSports")
    su5<BaseResponse<List<String>>> t1();

    @gmz("/patron/preferences/betting")
    Object u(@jh4 DefaultGift defaultGift, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/account/phone/bind/otp/verify/primary-phone")
    @gil({"Content-Type: application/json"})
    Object u0(@jh4 VerifyOtpRequest verifyOtpRequest, @db30("trusted-device") boolean z, @db30("bio-verify") boolean z2, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/user/devices/refresh")
    Object u1(v1b<? super BaseResponse<RefreshDeviceResponse>> v1bVar);

    @flz("patron/account/verified-email/resend")
    Object v(v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/isLoggedIn")
    Object v0(v1b<? super BaseResponse<Boolean>> v1bVar);

    @sbj("patron/account/info/withdrawpin/otp/acquire")
    ct90<BaseResponse<xdp>> v1(@db30("bizType") String bizType, @rhl("captcha-uuid") String uuid, @rhl("captcha-token") String captchaToken);

    @flz("patron/verify-identity/reject")
    Object w(v1b<? super BaseResponse<Object>> v1bVar);

    @flz("patron/register/br/otp/session")
    @gil({"Content-Type: application/json"})
    Object w0(@jh4 RegisterBrSessionData registerBrSessionData, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @sbj("patron/preferences/oddsRange")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<MyFavoriteOddRange>> w1();

    @sbj("patron/trusted/devices")
    Object x(@db30("action") String str, v1b<? super BaseResponse<CheckIsTrustedDeviceResponse>> v1bVar);

    @flz("patron/account/info/selfExclusion")
    Object x0(@jh4 SelfExclusionRequest selfExclusionRequest, v1b<? super BaseResponse<SelfExclusionResponse>> v1bVar);

    @flz("patron/account/info/selfExclusion/cancel")
    Object x1(v1b<? super BaseResponse<Void>> v1bVar);

    @flz("patron/account/phone/migrate/verify-name-match")
    Object y(@jh4 PasswordVerifyToken passwordVerifyToken, v1b<? super BaseResponse<VerifyNameMatchResult>> v1bVar);

    @gmz("patron/account/info/odds/format")
    Object y0(@jh4 OddsFormatRequest oddsFormatRequest, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("patron/account/info/withdrawpin")
    su5<BaseResponse<WithdrawalPinStatusInfo>> y1();

    @flz("patron/account/phone/migrate/otp/verify-subsidiary")
    Object z(@jh4 VerifySubsidiaryOTPBody verifySubsidiaryOTPBody, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/account/verified-email/bind/otp/session")
    Object z0(@jh4 EmailChangeBindOtpSessionDTO emailChangeBindOtpSessionDTO, v1b<? super BaseResponse<EmailChangeBindOtpSessionDTO>> v1bVar);

    @sbj("patron/account/phones")
    Object z1(v1b<? super BaseResponse<List<UserPhone>>> v1bVar);
}
