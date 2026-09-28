package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.lza;
import defpackage.p3w;
import defpackage.ycf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lp3w;", "Lycf;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithContentElement extends p3w<ycf> {
    public final Function1<lza, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawWithContentElement(Function1<? super lza, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        ycf ycfVar = new ycf();
        ycfVar.D = this.b;
        return ycfVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((ycf) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.b == ((DrawWithContentElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
