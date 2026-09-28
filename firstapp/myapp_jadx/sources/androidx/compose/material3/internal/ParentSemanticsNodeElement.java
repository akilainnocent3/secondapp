package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import defpackage.cc2;
import defpackage.jsz;
import defpackage.p3w;
import defpackage.pkd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/internal/ParentSemanticsNodeElement;", "Lp3w;", "Ljsz;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParentSemanticsNodeElement extends p3w<jsz> {
    public final cc2 b;

    public ParentSemanticsNodeElement(cc2 cc2Var) {
        this.b = cc2Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new jsz(this.b);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        jsz jszVar = (jsz) cVar;
        jszVar.D = this.b;
        pkd.f(jszVar).R();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentSemanticsNodeElement) {
            return this.b == ((ParentSemanticsNodeElement) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode();
    }
}
