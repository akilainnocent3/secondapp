package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class shl {
    public final UiText a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final lw40 f;

    public /* synthetic */ shl(String str, lw40 lw40Var, int i) {
        this(null, null, null, (i & 8) != 0 ? "" : str, false, (i & 32) != 0 ? new lw40(7, null) : lw40Var);
    }

    public static shl a(shl shlVar, UiText uiText, String str, String str2, lw40 lw40Var, int i) {
        if ((i & 1) != 0) {
            uiText = shlVar.a;
        }
        UiText uiText2 = uiText;
        if ((i & 2) != 0) {
            str = shlVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = shlVar.c;
        }
        String str4 = str2;
        String str5 = shlVar.d;
        boolean z = (i & 16) != 0 ? shlVar.e : true;
        if ((i & 32) != 0) {
            lw40Var = shlVar.f;
        }
        lw40 lw40Var2 = lw40Var;
        shlVar.getClass();
        str5.getClass();
        lw40Var2.getClass();
        return new shl(uiText2, str3, str4, str5, z, lw40Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shl)) {
            return false;
        }
        shl shlVar = (shl) obj;
        return Intrinsics.g(this.a, shlVar.a) && Intrinsics.g(this.b, shlVar.b) && Intrinsics.g(this.c, shlVar.c) && Intrinsics.g(this.d, shlVar.d) && this.e == shlVar.e && Intrinsics.g(this.f, shlVar.f);
    }

    public final int hashCode() {
        UiText uiText = this.a;
        int iHashCode = (uiText == null ? 0 : uiText.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + mtg0.a(gmf0.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderAndBanksState(topHintBanner=");
        sb.append(this.a);
        sb.append(", minAmount=");
        sb.append(this.b);
        sb.append(", maxAmount=");
        hxa.c(sb, this.c, ", maskedCpf=", this.d, ", isInvalidCpfWarningVisible=");
        sb.append(this.e);
        sb.append(", registeredBankAccounts=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public shl(UiText uiText, String str, String str2, String str3, boolean z, lw40 lw40Var) {
        str3.getClass();
        lw40Var.getClass();
        this.a = uiText;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = lw40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public shl() {
        this(null, 0 == true ? 1 : 0, 63);
    }
}
