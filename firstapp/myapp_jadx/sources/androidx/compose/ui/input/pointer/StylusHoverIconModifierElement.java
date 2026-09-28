package androidx.compose.ui.input.pointer;

import androidx.compose.ui.d;
import defpackage.ace0;
import defpackage.g020;
import defpackage.l7f;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.slf0;
import defpackage.t90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Lp3w;", "Lace0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends p3w<ace0> {
    public final t90 b = slf0.a;
    public final l7f c;

    public StylusHoverIconModifierElement(l7f l7fVar) {
        this.c = l7fVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new ace0(this.b, this.c);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ace0 ace0Var = (ace0) cVar;
        g020 g020Var = ace0Var.E;
        t90 t90Var = this.b;
        if (!Intrinsics.g(g020Var, t90Var)) {
            ace0Var.E = t90Var;
            if (ace0Var.F) {
                ace0Var.r2();
            }
        }
        ace0Var.D = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return Intrinsics.g(this.b, stylusHoverIconModifierElement.b) && Intrinsics.g(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.b.b * 31, 31, false);
        l7f l7fVar = this.c;
        return iA + (l7fVar != null ? l7fVar.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }
}
