package androidx.compose.foundation.lazy.layout;

import defpackage.gyr;
import defpackage.ivg0;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Lp3w;", "Livg0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class TraversablePrefetchStateModifierElement extends p3w<ivg0> {
    public final gyr b;

    public TraversablePrefetchStateModifierElement(gyr gyrVar) {
        this.b = gyrVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new ivg0(this.b);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((ivg0) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.g(this.b, ((TraversablePrefetchStateModifierElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.b + ')';
    }
}
