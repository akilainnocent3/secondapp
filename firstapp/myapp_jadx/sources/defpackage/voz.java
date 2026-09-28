package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class voz implements b.a {
    public final Function1<Integer, Object> a;
    public final iaj<opz, Integer, a, Integer, Unit> b;

    public voz(iaj iajVar, Function1 function1) {
        this.a = function1;
        this.b = iajVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return this.a;
    }
}
