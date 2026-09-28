package androidx.compose.animation;

import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SharedBoundsNodeElement;", "Lp3w;", "Landroidx/compose/animation/j;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedBoundsNodeElement extends p3w<j> {
    public final k b;

    public SharedBoundsNodeElement(k kVar) {
        this.b = kVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new j(this.b);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        j jVar = (j) cVar;
        k kVar = jVar.E;
        k kVar2 = this.b;
        if (Intrinsics.g(kVar2, kVar)) {
            return;
        }
        jVar.E = kVar2;
        if (jVar.C) {
            jVar.r2();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedBoundsNodeElement) && Intrinsics.g(this.b, ((SharedBoundsNodeElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.b + ')';
    }
}
