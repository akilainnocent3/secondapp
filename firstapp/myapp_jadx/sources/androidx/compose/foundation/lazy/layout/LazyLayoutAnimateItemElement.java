package androidx.compose.foundation.lazy.layout;

import defpackage.fkd0;
import defpackage.goh;
import defpackage.iwr;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Lp3w;", "Liwr;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends p3w<iwr> {
    public final goh<Float> b;
    public final fkd0 c;
    public final goh<Float> d;

    public LazyLayoutAnimateItemElement(goh gohVar, fkd0 fkd0Var, goh gohVar2) {
        this.b = gohVar;
        this.c = fkd0Var;
        this.d = gohVar2;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        iwr iwrVar = new iwr();
        iwrVar.D = this.b;
        iwrVar.E = this.c;
        iwrVar.F = this.d;
        return iwrVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        iwr iwrVar = (iwr) cVar;
        iwrVar.D = this.b;
        iwrVar.E = this.c;
        iwrVar.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return Intrinsics.g(this.b, lazyLayoutAnimateItemElement.b) && Intrinsics.g(this.c, lazyLayoutAnimateItemElement.c) && Intrinsics.g(this.d, lazyLayoutAnimateItemElement.d);
    }

    public final int hashCode() {
        goh<Float> gohVar = this.b;
        int iHashCode = (gohVar == null ? 0 : gohVar.hashCode()) * 31;
        fkd0 fkd0Var = this.c;
        int iHashCode2 = (iHashCode + (fkd0Var == null ? 0 : fkd0Var.hashCode())) * 31;
        goh<Float> gohVar2 = this.d;
        return iHashCode2 + (gohVar2 != null ? gohVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.b + ", placementSpec=" + this.c + ", fadeOutSpec=" + this.d + ')';
    }
}
