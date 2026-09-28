package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.d;
import defpackage.aif0;
import defpackage.cif0;
import defpackage.dif0;
import defpackage.p3w;
import defpackage.xef0;
import defpackage.yzf0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Lp3w;", "Lxef0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextContextMenuToolbarHandlerElement extends p3w<xef0> {
    public final yzf0 b;
    public final cif0 c;
    public final dif0 d;
    public final aif0 e;

    public TextContextMenuToolbarHandlerElement(yzf0 yzf0Var, cif0 cif0Var, dif0 dif0Var, aif0 aif0Var) {
        this.b = yzf0Var;
        this.c = cif0Var;
        this.d = dif0Var;
        this.e = aif0Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new xef0(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        xef0 xef0Var = (xef0) cVar;
        xef0Var.F.a = null;
        yzf0 yzf0Var = this.b;
        xef0Var.F = yzf0Var;
        yzf0Var.a = xef0Var;
        xef0Var.G = this.c;
        xef0Var.H = this.d;
        xef0Var.I = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.b == textContextMenuToolbarHandlerElement.b && this.c == textContextMenuToolbarHandlerElement.c && this.d == textContextMenuToolbarHandlerElement.d && this.e == textContextMenuToolbarHandlerElement.e;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        cif0 cif0Var = this.c;
        int iHashCode2 = (iHashCode + (cif0Var != null ? cif0Var.hashCode() : 0)) * 31;
        dif0 dif0Var = this.d;
        return hashCode() + ((iHashCode2 + (dif0Var != null ? dif0Var.hashCode() : 0)) * 31);
    }
}
