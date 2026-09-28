package com.sporty.android.platform.features.newotp.otpselector;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.gp.tz.R;
import defpackage.uag;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.sporty.android.platform.features.newotp.otpselector.OtpSelection[], still in use, count: 1, list:
  (r0v1 com.sporty.android.platform.features.newotp.otpselector.OtpSelection[]) from 0x00a0: CONSTRUCTOR (r0v1 com.sporty.android.platform.features.newotp.otpselector.OtpSelection[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:161) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/otpselector/OtpSelection;", "Landroid/os/Parcelable;", "", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OtpSelection implements Parcelable {
    EMAIL("email", "email", R.drawable.icon_email, R.string.common_otp_verify__email_otp, R.string.common_otp_verify__switch_to_email_otp, R.string.common_otp_verify__email_otp_short),
    SMS("sms", "sms", R.drawable.message_icon, R.string.common_otp_verify__sms_otp, R.string.common_otp_verify__switch_to_sms_otp, R.string.common_otp_verify__sms_otp_short),
    VOICE("voice", "voice", R.drawable.voice_icon, R.string.common_otp_verify__voice_otp, R.string.common_otp_verify__switch_to_voice_otp, R.string.common_otp_verify__voice_otp_short),
    REVERSED_SMS("reverse_sms", "reverse_sms", R.drawable.ic_reversed_sms, R.string.common_otp_verify__reversed_sms, R.string.common_otp_verify__switch_to_reversed_otp, R.string.common_otp_verify__reversed_sms),
    TELEGRAM("telegram_gateway", "telegram_gateway", R.drawable.ic_telegram_2, R.string.common_otp_verify__telegram_otp, R.string.common_otp_verify__switch_to_telegram_otp, R.string.common_otp_verify__telegram_otp_short),
    Bio("", "biometric", R.drawable.ic__feature__finger_print, R.string.common_otp_verify__android_fingerprint_face, R.string.common_otp_verify__android_verify_with_fingerprint_face, R.string.common_otp_verify__android_fingerprint_face);

    public static final /* synthetic */ uag C;
    public static final Parcelable.Creator<OtpSelection> CREATOR = new a();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public static final class a implements Parcelable.Creator<OtpSelection> {
        @Override // android.os.Parcelable.Creator
        public final OtpSelection createFromParcel(Parcel parcel) {
            parcel.getClass();
            return OtpSelection.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OtpSelection[] newArray(int i) {
            return new OtpSelection[i];
        }
    }

    static {
        C = new uag(new OtpSelection[]{r0, r1, r2, r3, r4, r5});
    }

    public OtpSelection(String str, String str2, int i, int i2, int i3, int i4) {
        super(str, i);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static OtpSelection valueOf(String str) {
        return (OtpSelection) Enum.valueOf(OtpSelection.class, str);
    }

    public static OtpSelection[] values() {
        return (OtpSelection[]) B.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
