package androidx.compose.ui.layout;

import defpackage.epy;
import defpackage.jxo;
import defpackage.p3w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Lp3w;", "Lepy;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OnSizeChangedModifier extends p3w<epy> {
    public final Function1<jxo, Unit> b;

    /* JADX WARN: Multi-variable type inference failed */
    public OnSizeChangedModifier(Function1<? super jxo, Unit> function1) {
        this.b = function1;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new epy(this.b);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        epy epyVar = (epy) cVar;
        epyVar.D = this.b;
        epyVar.F = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.b == ((OnSizeChangedModifier) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
