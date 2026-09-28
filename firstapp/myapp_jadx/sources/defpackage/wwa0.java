package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wwa0 {
    public final UiText a;
    public final String b;
    public final ijf0 c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ wwa0(int i) {
        this(null, "", new ijf0((String) null, 0L, 7), false, false);
    }

    public static wwa0 a(wwa0 wwa0Var, UiText uiText, String str, ijf0 ijf0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            uiText = wwa0Var.a;
        }
        UiText uiText2 = uiText;
        if ((i & 2) != 0) {
            str = wwa0Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            ijf0Var = wwa0Var.c;
        }
        ijf0 ijf0Var2 = ijf0Var;
        if ((i & 8) != 0) {
            z = wwa0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = wwa0Var.e;
        }
        wwa0Var.getClass();
        str2.getClass();
        ijf0Var2.getClass();
        return new wwa0(uiText2, str2, ijf0Var2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwa0)) {
            return false;
        }
        wwa0 wwa0Var = (wwa0) obj;
        return Intrinsics.g(this.a, wwa0Var.a) && Intrinsics.g(this.b, wwa0Var.b) && Intrinsics.g(this.c, wwa0Var.c) && this.d == wwa0Var.d && this.e == wwa0Var.e;
    }

    public final int hashCode() {
        UiText uiText = this.a;
        return Boolean.hashCode(this.e) + mtg0.a(ey1.b(this.c, gmf0.a((uiText == null ? 0 : uiText.hashCode()) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeiByStpWithdrawHeaderUiState(topHintBanner=");
        sb.append(this.a);
        sb.append(", accountName=");
        sb.append(this.b);
        sb.append(", accountNumber=");
        sb.append(this.c);
        sb.append(", showRecentAccountRow=");
        sb.append(this.d);
        sb.append(", isAccountNumberInvalid=");
        return mq0.a(sb, this.e, ")");
    }

    public wwa0(UiText uiText, String str, ijf0 ijf0Var, boolean z, boolean z2) {
        this.a = uiText;
        this.b = str;
        this.c = ijf0Var;
        this.d = z;
        this.e = z2;
    }

    public wwa0() {
        this(0);
    }
}
