package androidx.compose.ui.layout;

import defpackage.biv;
import defpackage.gaj;
import defpackage.kxa;
import defpackage.osr;
import defpackage.p3w;
import defpackage.vhv;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lp3w;", "Losr;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class LayoutElement extends p3w<osr> {
    public final gaj<t, vhv, kxa, biv> b;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(gaj<? super t, ? super vhv, ? super kxa, ? extends biv> gajVar) {
        this.b = gajVar;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        osr osrVar = new osr();
        osrVar.D = this.b;
        return osrVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((osr) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.b == ((LayoutElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
