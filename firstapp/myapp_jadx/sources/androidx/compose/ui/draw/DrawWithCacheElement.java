package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.kr5;
import defpackage.mr5;
import defpackage.p3w;
import defpackage.scf;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lp3w;", "Lkr5;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithCacheElement extends p3w<kr5> {
    public final Function1<mr5, scf> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithCacheElement(Function1<? super mr5, scf> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new kr5(new mr5(), this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        kr5 kr5Var = (kr5) cVar;
        kr5Var.G = this.b;
        kr5Var.W0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.b == ((DrawWithCacheElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
