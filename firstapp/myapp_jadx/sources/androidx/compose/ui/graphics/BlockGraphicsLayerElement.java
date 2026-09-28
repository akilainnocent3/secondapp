package androidx.compose.ui.graphics;

import androidx.compose.ui.d;
import defpackage.a7l;
import defpackage.of4;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.ywx;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Lp3w;", "Lof4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BlockGraphicsLayerElement extends p3w<of4> {
    public final Function1<a7l, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(Function1<? super a7l, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new of4(this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        of4 of4Var = (of4) cVar;
        of4Var.D = this.b;
        ywx ywxVar = pkd.d(of4Var, 2).H;
        if (ywxVar != null) {
            ywxVar.s2(true, of4Var.D);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.b == ((BlockGraphicsLayerElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
