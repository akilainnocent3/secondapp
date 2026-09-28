package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.hx80;
import defpackage.p3w;
import defpackage.qx80;
import defpackage.zj90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/SimpleInnerShadowElement;", "Lp3w;", "Lzj90;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SimpleInnerShadowElement extends p3w<zj90> {
    public final qx80 b;
    public final hx80 c;

    public SimpleInnerShadowElement(qx80 qx80Var, hx80 hx80Var) {
        this.b = qx80Var;
        this.c = hx80Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        zj90 zj90Var = new zj90();
        zj90Var.D = this.b;
        zj90Var.E = this.c;
        return zj90Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        zj90 zj90Var = (zj90) cVar;
        qx80 qx80Var = zj90Var.D;
        qx80 qx80Var2 = this.b;
        boolean zG = Intrinsics.g(qx80Var, qx80Var2);
        hx80 hx80Var = this.c;
        if (!zG || !Intrinsics.g(zj90Var.E, hx80Var)) {
            zj90Var.F = null;
        }
        zj90Var.D = qx80Var2;
        zj90Var.E = hx80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleInnerShadowElement)) {
            return false;
        }
        SimpleInnerShadowElement simpleInnerShadowElement = (SimpleInnerShadowElement) obj;
        return Intrinsics.g(this.b, simpleInnerShadowElement.b) && Intrinsics.g(this.c, simpleInnerShadowElement.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleInnerShadowElement(shape=" + this.b + ", shadow=" + this.c + ')';
    }
}
