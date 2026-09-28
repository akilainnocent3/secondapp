package androidx.compose.ui.semantics;

import androidx.compose.ui.d;
import defpackage.h3b;
import defpackage.p3w;
import defpackage.pb80;
import defpackage.sa80;
import defpackage.wa80;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Lp3w;", "Lh3b;", "Lwa80;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearAndSetSemanticsElement extends p3w<h3b> implements wa80 {
    public final Function1<pb80, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(Function1<? super pb80, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new h3b(false, true, this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ((h3b) cVar).F = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClearAndSetSemanticsElement) {
            return this.b == ((ClearAndSetSemanticsElement) obj).b;
        }
        return false;
    }

    @Override // defpackage.wa80
    public final sa80 f() {
        sa80 sa80Var = new sa80();
        sa80Var.c = false;
        sa80Var.d = true;
        this.b.invoke(sa80Var);
        return sa80Var;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
