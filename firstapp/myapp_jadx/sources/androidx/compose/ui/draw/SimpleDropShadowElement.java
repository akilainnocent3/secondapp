package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.hx80;
import defpackage.p3w;
import defpackage.qx80;
import defpackage.vj90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/SimpleDropShadowElement;", "Lp3w;", "Lvj90;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SimpleDropShadowElement extends p3w<vj90> {
    public final qx80 b;
    public final hx80 c;

    public SimpleDropShadowElement(qx80 qx80Var, hx80 hx80Var) {
        this.b = qx80Var;
        this.c = hx80Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        vj90 vj90Var = new vj90();
        vj90Var.D = this.b;
        vj90Var.E = this.c;
        return vj90Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        vj90 vj90Var = (vj90) cVar;
        qx80 qx80Var = vj90Var.D;
        qx80 qx80Var2 = this.b;
        boolean zG = Intrinsics.g(qx80Var, qx80Var2);
        hx80 hx80Var = this.c;
        if (!zG || !Intrinsics.g(vj90Var.E, hx80Var)) {
            vj90Var.F = null;
        }
        vj90Var.D = qx80Var2;
        vj90Var.E = hx80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleDropShadowElement)) {
            return false;
        }
        SimpleDropShadowElement simpleDropShadowElement = (SimpleDropShadowElement) obj;
        return Intrinsics.g(this.b, simpleDropShadowElement.b) && Intrinsics.g(this.c, simpleDropShadowElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleDropShadowElement(shape=" + this.b + ", shadow=" + this.c + ')';
    }
}
