package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kod {
    public static final kod g = new kod(0);
    public final Integer a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final UiText e;
    public final String f;

    public kod(Integer num, boolean z, boolean z2, boolean z3, StringUiText stringUiText, String str) {
        stringUiText.getClass();
        this.a = num;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = stringUiText;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kod)) {
            return false;
        }
        kod kodVar = (kod) obj;
        return Intrinsics.g(this.a, kodVar.a) && this.b == kodVar.b && this.c == kodVar.c && this.d == kodVar.d && Intrinsics.g(this.e, kodVar.e) && Intrinsics.g(this.f, kodVar.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.f.hashCode() + yvf.a(mtg0.a(mtg0.a(mtg0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DepositAlertVisibilityConfig(payChannelId=");
        sb.append(this.a);
        sb.append(", showDropAlert=");
        sb.append(this.b);
        sb.append(", showCreditDelaysHint=");
        nng.a(", showMaintenanceAlert=", ", alertContent=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", estimatedEndTime=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public kod() {
        this(0);
    }

    public kod(int i) {
        this(null, false, false, false, vch0.a, "");
    }
}
