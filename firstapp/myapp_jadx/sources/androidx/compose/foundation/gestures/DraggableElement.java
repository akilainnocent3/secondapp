package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import defpackage.gaj;
import defpackage.gly;
import defpackage.i3z;
import defpackage.jcf;
import defpackage.kcf;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.psw;
import defpackage.u9f;
import defpackage.v1b;
import defpackage.v5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Lp3w;", "Ljcf;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DraggableElement extends p3w<jcf> {
    public static final u9f j = new u9f();
    public final kcf b;
    public final i3z c;
    public final boolean d;
    public final psw e;
    public final boolean f;
    public final gaj<v5b, gly, v1b<? super Unit>, Object> g;
    public final gaj<v5b, Float, v1b<? super Unit>, Object> h;
    public final boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(kcf kcfVar, i3z i3zVar, boolean z, psw pswVar, boolean z2, gaj<? super v5b, ? super gly, ? super v1b<? super Unit>, ? extends Object> gajVar, gaj<? super v5b, ? super Float, ? super v1b<? super Unit>, ? extends Object> gajVar2, boolean z3) {
        this.b = kcfVar;
        this.c = i3zVar;
        this.d = z;
        this.e = pswVar;
        this.f = z2;
        this.g = gajVar;
        this.h = gajVar2;
        this.i = z3;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        u9f u9fVar = j;
        boolean z = this.d;
        psw pswVar = this.e;
        i3z i3zVar = this.c;
        jcf jcfVar = new jcf(u9fVar, z, pswVar, i3zVar);
        jcfVar.O = this.b;
        jcfVar.P = i3zVar;
        jcfVar.Q = this.f;
        jcfVar.R = this.g;
        jcfVar.S = this.h;
        jcfVar.T = this.i;
        return jcfVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        boolean z;
        boolean z2;
        jcf jcfVar = (jcf) cVar;
        kcf kcfVar = jcfVar.O;
        kcf kcfVar2 = this.b;
        if (Intrinsics.g(kcfVar, kcfVar2)) {
            z = false;
        } else {
            jcfVar.O = kcfVar2;
            z = true;
        }
        i3z i3zVar = jcfVar.P;
        i3z i3zVar2 = this.c;
        if (i3zVar != i3zVar2) {
            jcfVar.P = i3zVar2;
            z = true;
        }
        boolean z3 = jcfVar.T;
        boolean z4 = this.i;
        if (z3 != z4) {
            jcfVar.T = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        jcfVar.R = this.g;
        jcfVar.S = this.h;
        jcfVar.Q = this.f;
        jcfVar.A2(j, this.d, this.e, i3zVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.g(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && Intrinsics.g(this.e, draggableElement.e) && this.f == draggableElement.f && Intrinsics.g(this.g, draggableElement.g) && Intrinsics.g(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    public final int hashCode() {
        int iA = mtg0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        psw pswVar = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + mtg0.a((iA + (pswVar != null ? pswVar.hashCode() : 0)) * 31, 31, this.f)) * 31)) * 31);
    }
}
