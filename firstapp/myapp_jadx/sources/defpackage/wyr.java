package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wyr implements b.a {
    public final Function1<Integer, Object> a;
    public final Function1<Integer, Object> b;
    public final op8 c;

    public wyr(Function1 function1, Function1 function2, op8 op8Var) {
        this.a = function1;
        this.b = function2;
        this.c = op8Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.b.a
    public final Function1<Integer, Object> getType() {
        return this.b;
    }
}
