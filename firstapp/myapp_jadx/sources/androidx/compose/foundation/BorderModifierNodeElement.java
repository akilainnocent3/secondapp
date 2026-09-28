package androidx.compose.foundation;

import defpackage.g7f;
import defpackage.j35;
import defpackage.jr5;
import defpackage.k35;
import defpackage.p3w;
import defpackage.qx80;
import defpackage.ya5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lp3w;", "Lj35;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends p3w<j35> {
    public final float b;
    public final ya5 c;
    public final qx80 d;

    public BorderModifierNodeElement(float f, ya5 ya5Var, qx80 qx80Var) {
        this.b = f;
        this.c = ya5Var;
        this.d = qx80Var;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new j35(this.b, this.c, this.d);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        j35 j35Var = (j35) cVar;
        float f = j35Var.G;
        jr5 jr5Var = j35Var.J;
        float f2 = this.b;
        if (!g7f.b(f, f2)) {
            j35Var.G = f2;
            jr5Var.W0();
        }
        ya5 ya5Var = j35Var.H;
        ya5 ya5Var2 = this.c;
        if (!Intrinsics.g(ya5Var, ya5Var2)) {
            j35Var.H = ya5Var2;
            jr5Var.W0();
        }
        qx80 qx80Var = j35Var.I;
        qx80 qx80Var2 = this.d;
        if (Intrinsics.g(qx80Var, qx80Var2)) {
            return;
        }
        j35Var.I = qx80Var2;
        jr5Var.W0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return g7f.b(this.b, borderModifierNodeElement.b) && Intrinsics.g(this.c, borderModifierNodeElement.c) && Intrinsics.g(this.d, borderModifierNodeElement.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BorderModifierNodeElement(width=");
        k35.a(this.b, ", brush=", sb);
        sb.append(this.c);
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
