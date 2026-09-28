package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import defpackage.f020;
import defpackage.g020;
import defpackage.p3w;
import defpackage.t90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Lp3w;", "Lf020;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends p3w<f020> {
    public final t90 b;

    public PointerHoverIconModifierElement(t90 t90Var) {
        this.b = t90Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new f020(this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        f020 f020Var = (f020) cVar;
        g020 g020Var = f020Var.E;
        t90 t90Var = this.b;
        if (Intrinsics.g(g020Var, t90Var)) {
            return;
        }
        f020Var.E = t90Var;
        if (f020Var.F) {
            f020Var.r2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && Intrinsics.g(this.b, ((PointerHoverIconModifierElement) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
