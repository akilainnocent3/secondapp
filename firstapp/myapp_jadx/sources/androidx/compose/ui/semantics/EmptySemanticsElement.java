package androidx.compose.ui.semantics;

import androidx.compose.ui.d;
import defpackage.p3w;
import defpackage.r3g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Lp3w;", "Lr3g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptySemanticsElement extends p3w<r3g> {
    public final r3g b;

    public EmptySemanticsElement(r3g r3gVar) {
        this.b = r3gVar;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return this.b;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
