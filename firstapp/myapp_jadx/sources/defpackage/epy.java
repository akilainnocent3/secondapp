package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class epy extends d.c implements mrr {
    public Function1<? super jxo, Unit> D;
    public final boolean E = true;
    public long F = -9223372034707292160L;

    public epy(Function1<? super jxo, Unit> function1) {
        this.D = function1;
    }

    @Override // defpackage.mrr
    public final void M(long j) {
        if (jxo.b(this.F, j)) {
            return;
        }
        this.D.invoke(new jxo(j));
        this.F = j;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return this.E;
    }
}
