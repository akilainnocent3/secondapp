package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.d;
import defpackage.ok;
import defpackage.p3w;
import defpackage.pk;
import defpackage.qif0;
import defpackage.qk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Lp3w;", "Lqk;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AddTextContextMenuDataComponentsWithContextElement extends p3w<qk> {
    public final qif0 b;

    public AddTextContextMenuDataComponentsWithContextElement(qif0 qif0Var) {
        this.b = qif0Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        qk qkVar = new qk();
        qkVar.F = this.b;
        pk pkVar = new pk(qkVar, 0);
        ok okVar = new ok();
        okVar.D = pkVar;
        qkVar.p2(okVar);
        return qkVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((qk) cVar).F = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.b == ((AddTextContextMenuDataComponentsWithContextElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
