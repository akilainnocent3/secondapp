package androidx.compose.ui;

import defpackage.h70;
import defpackage.p3w;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Lp3w;", "Landroidx/compose/ui/e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ZIndexElement extends p3w<e> {
    public final float b;

    public ZIndexElement(float f) {
        this.b = f;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        e eVar = new e();
        eVar.D = this.b;
        return eVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((e) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.b, ((ZIndexElement) obj).b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return h70.a(new StringBuilder("ZIndexElement(zIndex="), this.b, ')');
    }
}
