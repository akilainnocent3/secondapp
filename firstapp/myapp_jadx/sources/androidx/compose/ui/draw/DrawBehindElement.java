package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.lcf;
import defpackage.p3w;
import defpackage.tcf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lp3w;", "Llcf;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawBehindElement extends p3w<lcf> {
    public final Function1<tcf, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(Function1<? super tcf, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        lcf lcfVar = new lcf();
        lcfVar.D = this.b;
        return lcfVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((lcf) cVar).D = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.b == ((DrawBehindElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
