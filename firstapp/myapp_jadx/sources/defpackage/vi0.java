package defpackage;

import androidx.compose.runtime.m;
import defpackage.mj0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vi0<T, V extends mj0> {
    public final f0h0<T, V> a;
    public final T b;
    public final long c;
    public final Function0<Unit> d;
    public final ytw e;
    public V f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final ytw i = m.b(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public vi0(Object obj, f0h0 f0h0Var, mj0 mj0Var, long j, Object obj2, long j2, Function0 function0) {
        this.a = f0h0Var;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = m.b(obj);
        this.f = (V) nj0.a(mj0Var);
        this.g = j;
    }

    public final void a() {
        ((x5a0) this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final T b() {
        return this.a.b().invoke(this.f);
    }
}
