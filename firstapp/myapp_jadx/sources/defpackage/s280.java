package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s280 {
    public final UiText a;
    public final n67 b;
    public final Function0<Unit> c;

    public s280(UiText uiText, n67 n67Var, Function0<Unit> function0) {
        uiText.getClass();
        function0.getClass();
        this.a = uiText;
        this.b = n67Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s280)) {
            return false;
        }
        s280 s280Var = (s280) obj;
        return Intrinsics.g(this.a, s280Var.a) && Intrinsics.g(this.b, s280Var.b) && Intrinsics.g(this.c, s280Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        n67 n67Var = this.b;
        return this.c.hashCode() + ((iHashCode + (n67Var == null ? 0 : n67Var.hashCode())) * 31);
    }

    public final String toString() {
        return "SecondaryAction(text=" + this.a + ", iconStyle=" + this.b + ", onClick=" + this.c + ")";
    }
}
