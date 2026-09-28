package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import defpackage.ek7;
import defpackage.ik7;
import defpackage.p3w;
import defpackage.pkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/ChildSemanticsNodeElement;", "Lp3w;", "Lik7;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChildSemanticsNodeElement extends p3w<ik7> {
    public final ek7 b;

    public ChildSemanticsNodeElement(ek7 ek7Var) {
        this.b = ek7Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        ik7 ik7Var = new ik7();
        ik7Var.D = this.b;
        return ik7Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        ik7 ik7Var = (ik7) cVar;
        ik7Var.D = this.b;
        pkd.f(ik7Var).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChildSemanticsNodeElement) {
            return this.b == ((ChildSemanticsNodeElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
