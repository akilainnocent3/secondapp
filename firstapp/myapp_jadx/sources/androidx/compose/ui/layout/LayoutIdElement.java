package androidx.compose.ui.layout;

import defpackage.dsr;
import defpackage.ekw;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lp3w;", "Ldsr;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class LayoutIdElement extends p3w<dsr> {
    public final Object b;

    public LayoutIdElement(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        dsr dsrVar = new dsr();
        dsrVar.D = this.b;
        return dsrVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((dsr) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.g(this.b, ((LayoutIdElement) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ekw.a(new StringBuilder("LayoutIdElement(layoutId="), this.b, ')');
    }
}
