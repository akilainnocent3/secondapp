package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class skh0 {
    public final String a;
    public final String b;
    public final int c;
    public final ijf0 d;
    public final UiText e;
    public final UiText f;
    public final uxs g;

    public /* synthetic */ skh0(String str, String str2, int i, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 9 : i, new ijf0("", 0L, 6), null, null, uxs.DISABLE);
    }

    public static skh0 a(skh0 skh0Var, ijf0 ijf0Var, UiText uiText, UiText uiText2, uxs uxsVar, int i) {
        String str = skh0Var.a;
        String str2 = skh0Var.b;
        int i2 = skh0Var.c;
        if ((i & 8) != 0) {
            ijf0Var = skh0Var.d;
        }
        ijf0 ijf0Var2 = ijf0Var;
        if ((i & 16) != 0) {
            uiText = skh0Var.e;
        }
        UiText uiText3 = uiText;
        if ((i & 32) != 0) {
            uiText2 = skh0Var.f;
        }
        UiText uiText4 = uiText2;
        if ((i & 64) != 0) {
            uxsVar = skh0Var.g;
        }
        uxs uxsVar2 = uxsVar;
        skh0Var.getClass();
        str.getClass();
        str2.getClass();
        ijf0Var2.getClass();
        uxsVar2.getClass();
        return new skh0(str, str2, i2, ijf0Var2, uiText3, uiText4, uxsVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skh0)) {
            return false;
        }
        skh0 skh0Var = (skh0) obj;
        return Intrinsics.g(this.a, skh0Var.a) && Intrinsics.g(this.b, skh0Var.b) && this.c == skh0Var.c && Intrinsics.g(this.d, skh0Var.d) && Intrinsics.g(this.e, skh0Var.e) && Intrinsics.g(this.f, skh0Var.f) && this.g == skh0Var.g;
    }

    public final int hashCode() {
        int iB = ey1.b(this.d, gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        UiText uiText = this.e;
        int iHashCode = (iB + (uiText == null ? 0 : uiText.hashCode())) * 31;
        UiText uiText2 = this.f;
        return this.g.hashCode() + ((iHashCode + (uiText2 != null ? uiText2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("UpdatePhoneNumberState(previousPhoneNumber=", this.a, ", callingCode=", this.b, ", phoneMaxLength=");
        sbA.append(this.c);
        sbA.append(", newPhoneNumber=");
        sbA.append(this.d);
        sbA.append(", errorMessage=");
        vh8.a(sbA, this.e, ", errorDialog=", this.f, ", confirmButtonStatus=");
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }

    public skh0(String str, String str2, int i, ijf0 ijf0Var, UiText uiText, UiText uiText2, uxs uxsVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = ijf0Var;
        this.e = uiText;
        this.f = uiText2;
        this.g = uxsVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public skh0() {
        String str = null;
        this(str, str, 0, 127);
    }
}
