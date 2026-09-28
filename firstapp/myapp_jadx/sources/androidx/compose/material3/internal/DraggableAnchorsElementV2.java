package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import defpackage.i20;
import defpackage.i3z;
import defpackage.jxo;
import defpackage.kxa;
import defpackage.n9f;
import defpackage.p3w;
import defpackage.t9f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElementV2;", "T", "Lp3w;", "Lt9f;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DraggableAnchorsElementV2<T> extends p3w<t9f<T>> {
    public final i20<T> b;
    public final Function2<jxo, kxa, Pair<n9f<T>, T>> c;
    public final i3z d;

    public DraggableAnchorsElementV2(i20 i20Var, Function2 function2) {
        i3z i3zVar = i3z.b;
        this.b = i20Var;
        this.c = function2;
        this.d = i3zVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        t9f t9fVar = new t9f();
        t9fVar.D = this.b;
        t9fVar.E = this.c;
        t9fVar.F = this.d;
        return t9fVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        t9f t9fVar = (t9f) cVar;
        t9fVar.D = this.b;
        t9fVar.E = this.c;
        t9fVar.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElementV2)) {
            return false;
        }
        DraggableAnchorsElementV2 draggableAnchorsElementV2 = (DraggableAnchorsElementV2) obj;
        return Intrinsics.g(this.b, draggableAnchorsElementV2.b) && this.c == draggableAnchorsElementV2.c && this.d == draggableAnchorsElementV2.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
