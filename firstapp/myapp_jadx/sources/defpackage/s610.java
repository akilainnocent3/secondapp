package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s610 {
    public final UiText a;
    public final List<String> b;

    public s610(UiText uiText, List<String> list) {
        list.getClass();
        this.a = uiText;
        this.b = list;
    }

    public static s610 a(s610 s610Var, UiText uiText, List list, int i) {
        if ((i & 1) != 0) {
            uiText = s610Var.a;
        }
        if ((i & 2) != 0) {
            list = s610Var.b;
        }
        s610Var.getClass();
        list.getClass();
        return new s610(uiText, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s610)) {
            return false;
        }
        s610 s610Var = (s610) obj;
        return Intrinsics.g(this.a, s610Var.a) && Intrinsics.g(this.b, s610Var.b);
    }

    public final int hashCode() {
        UiText uiText = this.a;
        return this.b.hashCode() + ((uiText == null ? 0 : uiText.hashCode()) * 31);
    }

    public final String toString() {
        return "PixBtgBalanceInfoState(balance=" + this.a + ", hints=" + this.b + ")";
    }

    public s610() {
        this(0);
    }

    public s610(int i) {
        this(null, m2g.a);
    }
}
