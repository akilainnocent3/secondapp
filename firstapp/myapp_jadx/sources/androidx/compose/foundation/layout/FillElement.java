package androidx.compose.foundation.layout;

import defpackage.p3w;
import defpackage.rqe;
import defpackage.ulh;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lp3w;", "Lulh;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FillElement extends p3w<ulh> {
    public final rqe b;
    public final float c;

    public FillElement(rqe rqeVar, float f) {
        this.b = rqeVar;
        this.c = f;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        ulh ulhVar = new ulh();
        ulhVar.D = this.b;
        ulhVar.E = this.c;
        return ulhVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ulh ulhVar = (ulh) cVar;
        ulhVar.D = this.b;
        ulhVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
