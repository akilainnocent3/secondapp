package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rsa {
    public final r700 a;
    public final UiText b;
    public final String c;
    public final String d;
    public final String e;

    public rsa(r700 r700Var, UiText uiText, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = r700Var;
        this.b = uiText;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsa)) {
            return false;
        }
        rsa rsaVar = (rsa) obj;
        return this.a == rsaVar.a && this.b.equals(rsaVar.b) && Intrinsics.g(this.c, rsaVar.c) && this.d.equals(rsaVar.d) && Intrinsics.g(this.e, rsaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(gmf0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmAmountDialogState(dialogType=");
        sb.append(this.a);
        sb.append(", bankName=");
        sb.append(this.b);
        sb.append(", amount=");
        hxa.c(sb, this.c, ", accountValue=", this.d, ", currency=");
        return uf80.a(sb, this.e, ")");
    }
}
