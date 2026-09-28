package androidx.compose.foundation.layout;

import defpackage.asr;
import defpackage.iwo;
import defpackage.jxo;
import defpackage.m7k0;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.rqe;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lp3w;", "Lm7k0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class WrapContentElement extends p3w<m7k0> {
    public final rqe b;
    public final boolean c;
    public final Function2<jxo, asr, iwo> d;
    public final Object e;

    public WrapContentElement(rqe rqeVar, boolean z, Function2 function2, Object obj) {
        this.b = rqeVar;
        this.c = z;
        this.d = function2;
        this.e = obj;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        m7k0 m7k0Var = new m7k0();
        m7k0Var.D = this.b;
        m7k0Var.E = this.c;
        m7k0Var.F = this.d;
        return m7k0Var;
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        m7k0 m7k0Var = (m7k0) cVar;
        m7k0Var.D = this.b;
        m7k0Var.E = this.c;
        m7k0Var.F = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.b == wrapContentElement.b && this.c == wrapContentElement.c && Intrinsics.g(this.e, wrapContentElement.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + mtg0.a(this.b.hashCode() * 31, 31, this.c);
    }
}
