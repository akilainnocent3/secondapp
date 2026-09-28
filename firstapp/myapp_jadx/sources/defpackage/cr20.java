package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cr20 {
    public final UiText a;
    public final n67 b;
    public final Function0<Unit> c;

    public cr20(UiText uiText, n67 n67Var, Function0<Unit> function0) {
        uiText.getClass();
        n67Var.getClass();
        function0.getClass();
        this.a = uiText;
        this.b = n67Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr20)) {
            return false;
        }
        cr20 cr20Var = (cr20) obj;
        return Intrinsics.g(this.a, cr20Var.a) && Intrinsics.g(this.b, cr20Var.b) && Intrinsics.g(this.c, cr20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PrimaryAction(text=" + this.a + ", iconStyle=" + this.b + ", onClick=" + this.c + ")";
    }
}
