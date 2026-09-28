package androidx.compose.ui.layout;

import defpackage.goy;
import defpackage.p3w;
import defpackage.urr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lp3w;", "Lgoy;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OnGloballyPositionedElement extends p3w<goy> {
    public final Function1<urr, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(Function1<? super urr, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        goy goyVar = new goy();
        goyVar.D = this.b;
        return goyVar;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ((goy) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.b == ((OnGloballyPositionedElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
