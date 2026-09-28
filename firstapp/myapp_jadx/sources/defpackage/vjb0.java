package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vjb0 {
    public final Integer a;
    public final UiText b;
    public final List<String> c;
    public final UiText d;
    public final UiText e;
    public final wg8 f;
    public final uxs g;
    public final vc8 h;
    public final z900 i;
    public final boolean j;

    public vjb0(Integer num, UiText uiText, List<String> list, UiText uiText2, UiText uiText3, wg8 wg8Var, uxs uxsVar, vc8 vc8Var, z900 z900Var, boolean z) {
        list.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = num;
        this.b = uiText;
        this.c = list;
        this.d = uiText2;
        this.e = uiText3;
        this.f = wg8Var;
        this.g = uxsVar;
        this.h = vc8Var;
        this.i = z900Var;
        this.j = z;
    }

    public static vjb0 a(vjb0 vjb0Var, Integer num, UiText uiText, List list, UiText uiText2, UiText uiText3, wg8 wg8Var, uxs uxsVar, vc8 vc8Var, z900 z900Var, boolean z, int i) {
        if ((i & 1) != 0) {
            num = vjb0Var.a;
        }
        Integer num2 = num;
        if ((i & 2) != 0) {
            uiText = vjb0Var.b;
        }
        UiText uiText4 = uiText;
        if ((i & 4) != 0) {
            list = vjb0Var.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            uiText2 = vjb0Var.d;
        }
        UiText uiText5 = uiText2;
        UiText uiText6 = (i & 16) != 0 ? vjb0Var.e : uiText3;
        wg8 wg8Var2 = (i & 32) != 0 ? vjb0Var.f : wg8Var;
        uxs uxsVar2 = (i & 64) != 0 ? vjb0Var.g : uxsVar;
        vc8 vc8Var2 = (i & 128) != 0 ? vjb0Var.h : vc8Var;
        z900 z900Var2 = (i & 256) != 0 ? vjb0Var.i : z900Var;
        boolean z2 = (i & 512) != 0 ? vjb0Var.j : z;
        vjb0Var.getClass();
        list2.getClass();
        uiText5.getClass();
        uiText6.getClass();
        wg8Var2.getClass();
        uxsVar2.getClass();
        vc8Var2.getClass();
        z900Var2.getClass();
        return new vjb0(num2, uiText4, list2, uiText5, uiText6, wg8Var2, uxsVar2, vc8Var2, z900Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjb0)) {
            return false;
        }
        vjb0 vjb0Var = (vjb0) obj;
        return Intrinsics.g(this.a, vjb0Var.a) && Intrinsics.g(this.b, vjb0Var.b) && Intrinsics.g(this.c, vjb0Var.c) && Intrinsics.g(this.d, vjb0Var.d) && Intrinsics.g(this.e, vjb0Var.e) && Intrinsics.g(this.f, vjb0Var.f) && this.g == vjb0Var.g && Intrinsics.g(this.h, vjb0Var.h) && Intrinsics.g(this.i, vjb0Var.i) && this.j == vjb0Var.j;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        UiText uiText = this.b;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + y45.a(this.g, (this.f.hashCode() + yvf.a(yvf.a(ai50.a((iHashCode + (uiText != null ? uiText.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SportyBetVoucherDepositState(logo=" + this.a + ", topHint=" + this.b + ", hints=" + this.c + ", balanceLabel=" + this.d + ", balanceText=" + this.e + ", commonPayDialogsState=" + this.f + ", depositButtonStatus=" + this.g + ", commonDepositDialogsState=" + this.h + ", pinError=" + this.i + ", isPendingRequestDialogVisible=" + this.j + ")";
    }

    public vjb0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vjb0(int i) {
        m2g m2gVar = m2g.a;
        StringUiText stringUiText = vch0.a;
        this(null, null, m2gVar, stringUiText, stringUiText, new wg8(0), uxs.DISABLE, new vc8(0), new z900(3, (StringUiText) null), false);
    }
}
