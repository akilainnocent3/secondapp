package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import defpackage.c20;
import defpackage.i3z;
import defpackage.jxo;
import defpackage.kxa;
import defpackage.m9f;
import defpackage.p3w;
import defpackage.r9f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "Lp3w;", "Lr9f;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends p3w<r9f<T>> {
    public final c20<T> b;
    public final Function2<jxo, kxa, Pair<m9f<T>, T>> c;
    public final i3z d;

    public DraggableAnchorsElement(c20 c20Var, Function2 function2) {
        i3z i3zVar = i3z.a;
        this.b = c20Var;
        this.c = function2;
        this.d = i3zVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        r9f r9fVar = new r9f();
        r9fVar.D = this.b;
        r9fVar.E = this.c;
        r9fVar.F = this.d;
        return r9fVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        r9f r9fVar = (r9f) cVar;
        r9fVar.D = this.b;
        r9fVar.E = this.c;
        r9fVar.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return Intrinsics.g(this.b, draggableAnchorsElement.b) && this.c == draggableAnchorsElement.c && this.d == draggableAnchorsElement.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
