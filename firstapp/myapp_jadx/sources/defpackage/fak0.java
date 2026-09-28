package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fak0 {
    public final String a;
    public final String b;
    public final int c;
    public final c430 d;
    public final ijf0 e;
    public final uxs f;
    public final sx40 g;
    public final UiText h;
    public final boolean i;

    public /* synthetic */ fak0(String str, int i) {
        this((i & 1) != 0 ? "" : str, "", 3, new c430.b(1, p780.f), new ijf0((String) null, 0L, 7), uxs.DISABLE, sx40.b.a, null, false);
    }

    public static fak0 a(fak0 fak0Var, String str, uxs uxsVar, sx40 sx40Var, ResourceUiText resourceUiText, int i) {
        String str2 = fak0Var.a;
        if ((i & 2) != 0) {
            str = fak0Var.b;
        }
        String str3 = str;
        int i2 = fak0Var.c;
        c430 c430Var = fak0Var.d;
        ijf0 ijf0Var = fak0Var.e;
        if ((i & 32) != 0) {
            uxsVar = fak0Var.f;
        }
        uxs uxsVar2 = uxsVar;
        if ((i & 64) != 0) {
            sx40Var = fak0Var.g;
        }
        sx40 sx40Var2 = sx40Var;
        UiText uiText = resourceUiText;
        if ((i & 128) != 0) {
            uiText = fak0Var.h;
        }
        UiText uiText2 = uiText;
        boolean z = (i & 256) != 0 ? fak0Var.i : true;
        fak0Var.getClass();
        str2.getClass();
        str3.getClass();
        c430Var.getClass();
        ijf0Var.getClass();
        uxsVar2.getClass();
        sx40Var2.getClass();
        return new fak0(str2, str3, i2, c430Var, ijf0Var, uxsVar2, sx40Var2, uiText2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fak0)) {
            return false;
        }
        fak0 fak0Var = (fak0) obj;
        return Intrinsics.g(this.a, fak0Var.a) && Intrinsics.g(this.b, fak0Var.b) && this.c == fak0Var.c && Intrinsics.g(this.d, fak0Var.d) && Intrinsics.g(this.e, fak0Var.e) && this.f == fak0Var.f && Intrinsics.g(this.g, fak0Var.g) && Intrinsics.g(this.h, fak0Var.h) && this.i == fak0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + y45.a(this.f, ey1.b(this.e, (this.d.hashCode() + gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31), 31)) * 31;
        UiText uiText = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ZAOTPState(phoneCode=", this.a, ", phoneNumber=", this.b, ", stepsCount=");
        sbA.append(this.c);
        sbA.append(", progressPositionState=");
        sbA.append(this.d);
        sbA.append(", otpTextField=");
        sbA.append(this.e);
        sbA.append(", submitButtonStatus=");
        sbA.append(this.f);
        sbA.append(", submitData=");
        sbA.append(this.g);
        sbA.append(", resendTiming=");
        sbA.append(this.h);
        sbA.append(", showSupportOption=");
        return mq0.a(sbA, this.i, ")");
    }

    public fak0() {
        this(null, 511);
    }

    public fak0(String str, String str2, int i, c430 c430Var, ijf0 ijf0Var, uxs uxsVar, sx40 sx40Var, UiText uiText, boolean z) {
        str.getClass();
        sx40Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = c430Var;
        this.e = ijf0Var;
        this.f = uxsVar;
        this.g = sx40Var;
        this.h = uiText;
        this.i = z;
        uxs uxsVar2 = uxs.ENABLE;
    }
}
