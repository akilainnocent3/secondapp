package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gxo {
    public final ijf0 a;
    public final UiText b;
    public final dwz c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ gxo(dwz dwzVar, int i) {
        this(new ijf0((String) null, 0L, 7), null, (i & 4) != 0 ? new dwz(255) : dwzVar, false, false, "", false, false, false);
    }

    public static gxo a(gxo gxoVar, ijf0 ijf0Var, dwz dwzVar, boolean z, boolean z2, String str, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            ijf0Var = gxoVar.a;
        }
        ijf0 ijf0Var2 = ijf0Var;
        UiText uiText = (i & 2) != 0 ? gxoVar.b : null;
        if ((i & 4) != 0) {
            dwzVar = gxoVar.c;
        }
        dwz dwzVar2 = dwzVar;
        if ((i & 8) != 0) {
            z = gxoVar.d;
        }
        boolean z5 = z;
        boolean z6 = (i & 16) != 0 ? gxoVar.e : z2;
        String str2 = (i & 32) != 0 ? gxoVar.f : str;
        boolean z7 = (i & 64) != 0 ? gxoVar.g : true;
        boolean z8 = (i & 128) != 0 ? gxoVar.h : z3;
        boolean z9 = (i & 256) != 0 ? gxoVar.i : z4;
        gxoVar.getClass();
        ijf0Var2.getClass();
        dwzVar2.getClass();
        str2.getClass();
        return new gxo(ijf0Var2, uiText, dwzVar2, z5, z6, str2, z7, z8, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo)) {
            return false;
        }
        gxo gxoVar = (gxo) obj;
        return Intrinsics.g(this.a, gxoVar.a) && Intrinsics.g(this.b, gxoVar.b) && Intrinsics.g(this.c, gxoVar.c) && this.d == gxoVar.d && this.e == gxoVar.e && Intrinsics.g(this.f, gxoVar.f) && this.g == gxoVar.g && this.h == gxoVar.h && this.i == gxoVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        return Boolean.hashCode(this.i) + mtg0.a(mtg0.a(gmf0.a(mtg0.a(mtg0.a((this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntResetPwdUIState(passwordValue=");
        sb.append(this.a);
        sb.append(", passwordError=");
        sb.append(this.b);
        sb.append(", passwordStatus=");
        sb.append(this.c);
        sb.append(", isResettingPassword=");
        sb.append(this.d);
        sb.append(", showFacialRecognitionDialog=");
        mng.a(", cpfNumber=", this.f, ", showSuccessDialog=", sb, this.e);
        nng.a(", showFacialRecognitionErrorDialog=", ", showGeneralError=", sb, this.g, this.h);
        return mq0.a(sb, this.i, ")");
    }

    public gxo(ijf0 ijf0Var, UiText uiText, dwz dwzVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5) {
        dwzVar.getClass();
        this.a = ijf0Var;
        this.b = uiText;
        this.c = dwzVar;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = z3;
        this.h = z4;
        this.i = z5;
    }

    public gxo() {
        this(null, 511);
    }
}
