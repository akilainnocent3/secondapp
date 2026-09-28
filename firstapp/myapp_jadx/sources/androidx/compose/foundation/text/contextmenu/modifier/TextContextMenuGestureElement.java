package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.ui.d;
import defpackage.bif0;
import defpackage.eef0;
import defpackage.p3w;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Lp3w;", "Leef0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TextContextMenuGestureElement extends p3w<eef0> {
    public final bif0 b;

    public TextContextMenuGestureElement(bif0 bif0Var) {
        this.b = bif0Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new eef0(this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((eef0) cVar).F = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.b == ((TextContextMenuGestureElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        bif0 bif0Var = this.b;
        if (bif0Var != null) {
            return bif0Var.hashCode();
        }
        return 0;
    }
}
