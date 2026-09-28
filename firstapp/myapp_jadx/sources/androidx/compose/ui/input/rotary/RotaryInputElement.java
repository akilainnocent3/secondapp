package androidx.compose.ui.input.rotary;

import androidx.compose.ui.d;
import defpackage.iw50;
import defpackage.jw50;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lp3w;", "Liw50;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RotaryInputElement extends p3w<iw50> {
    public final Function1<jw50, Boolean> b;

    public RotaryInputElement(Function1 function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        iw50 iw50Var = new iw50();
        iw50Var.D = this.b;
        return iw50Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((iw50) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RotaryInputElement) {
            return this.b == ((RotaryInputElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        Function1<jw50, Boolean> function1 = this.b;
        return (function1 != null ? function1.hashCode() : 0) * 31;
    }
}
