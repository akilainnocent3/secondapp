package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jur implements b.a {
    public final Function1<Integer, Object> a;
    public final Function2<vur, Integer, s7l> b;
    public final Function1<Integer, Object> c;
    public final op8 d;

    public jur(Function1 function1, Function2 function2, Function1 function3, op8 op8Var) {
        this.a = function1;
        this.b = function2;
        this.c = function3;
        this.d = op8Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getType() {
        return this.c;
    }
}
