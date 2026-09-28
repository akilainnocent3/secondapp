package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fpz extends b<voz> {
    public final iaj<opz, Integer, a, Integer, Unit> a;
    public final Function1<Integer, Object> b;
    public final rsw c;

    /* JADX WARN: Multi-variable type inference failed */
    public fpz(iaj<? super opz, ? super Integer, ? super a, ? super Integer, Unit> iajVar, Function1<? super Integer, ? extends Object> function1, int i) {
        this.a = iajVar;
        this.b = function1;
        rsw rswVar = new rsw();
        rswVar.a(i, new voz(iajVar, function1));
        this.c = rswVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final rsw j() {
        return this.c;
    }
}
