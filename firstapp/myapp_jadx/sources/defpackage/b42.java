package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b42<T extends OtpData> extends j8i0 {
    public final rdd0 a;
    public T b;
    public OTPInternalData c;
    public OtpSelection d;

    public b42(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
    }

    public static j7z.b A1(b42 b42Var, lk50.a aVar, Function1 function1) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_functions__error);
        b42Var.getClass();
        aVar.getClass();
        Throwable th = aVar.a;
        if (!(th instanceof SprThrowable)) {
            th = null;
        }
        SprThrowable sprThrowable = (SprThrowable) th;
        String e = sprThrowable != null ? sprThrowable.getE() : null;
        Integer numValueOf = sprThrowable != null ? Integer.valueOf(sprThrowable.getD()) : null;
        if (numValueOf != null && numValueOf.intValue() == 11003) {
            J1(b42Var, new hbf0(0));
            return new j7z.b(new ResourceUiText(R.string.common_otp_verify__no_valid_telegram_account_title), new ResourceUiText(R.string.common_otp_verify__no_valid_telegram_account_content, ay0.S(new Object[]{b42Var.B1().getA(), b42Var.B1().getB()})), function1.invoke(numValueOf), "otp__no_valid_tg_popup", 16);
        }
        if ((numValueOf != null && numValueOf.intValue() == 11005) || (numValueOf != null && numValueOf.intValue() == 11006)) {
            if (numValueOf != null && numValueOf.intValue() == 11005) {
                J1(b42Var, new rbf0(0));
            } else {
                J1(b42Var, new sbf0(0));
            }
            return new j7z.b(new ResourceUiText(R.string.common_otp_verify__please_try_telegram_otp_later), new StringUiText(String.valueOf(e)), function1.invoke(numValueOf), "otp__no_valid_tg_popup", 16);
        }
        gay gayVar = gay.a;
        if (numValueOf != null && numValueOf.intValue() == 11709) {
            J1(b42Var, new fbf0(0));
        }
        String str = "register__verify_fail_popup";
        if ((numValueOf == null || numValueOf.intValue() != 11700) && numValueOf != null && numValueOf.intValue() == 11707) {
            str = "otp__limit_popup";
        }
        return new j7z.b(resourceUiText, aVar.b, function1.invoke(numValueOf), b42Var.B1().getC() == j6c.REGISTER ? str : null, 16);
    }

    public static wl50 D1(lyh lyhVar, Function1 function1) {
        lyhVar.getClass();
        return F1(bm50.a(new z32(lyhVar)), function1);
    }

    public static wl50 F1(lyh lyhVar, Function1 function1) {
        lyhVar.getClass();
        return new wl50(new g1i(lyhVar, new a42(function1, null)), new y32());
    }

    public static /* synthetic */ void J1(b42 b42Var, pdd0 pdd0Var) {
        b42Var.I1(pdd0Var, k00.d, k00.c);
    }

    public final T B1() {
        T t = this.b;
        if (t != null) {
            return t;
        }
        Intrinsics.n("otpData");
        throw null;
    }

    public final ubf0 C1() {
        List<OtpSelection> list = z1().a;
        OtpSelection otpSelection = OtpSelection.TELEGRAM;
        return (!list.contains(otpSelection) || CollectionsKt.d0(list) == otpSelection) ? ubf0.NonTgUser : ubf0.TgUser;
    }

    public abstract void E1();

    public final void G1(T t, OTPInternalData oTPInternalData, OtpSelection otpSelection) {
        t.getClass();
        this.b = t;
        this.c = oTPInternalData;
        if (otpSelection != null) {
            this.d = otpSelection;
        }
        E1();
    }

    public final void I1(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        this.a.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final d5z x1() {
        boolean z = this instanceof d5z;
        ?? r1 = this;
        if (!z) {
            r1 = (b42<T>) null;
        }
        return (d5z) r1;
    }

    public final OtpSelection y1() {
        OtpSelection otpSelection = this.d;
        if (otpSelection != null) {
            return otpSelection;
        }
        Intrinsics.n("currentOtpSelection");
        throw null;
    }

    public final OTPInternalData z1() {
        OTPInternalData oTPInternalData = this.c;
        if (oTPInternalData != null) {
            return oTPInternalData;
        }
        Intrinsics.n("internalData");
        throw null;
    }

    public void H1() {
    }
}
