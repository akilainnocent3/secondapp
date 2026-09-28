package defpackage;

import androidx.compose.runtime.m;
import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class aj0<T, V extends mj0> implements twd0<T> {
    public final f0h0<T, V> a;
    public final ytw b;
    public V c;
    public long d;
    public long e;
    public boolean f;

    public aj0(f0h0<T, V> f0h0Var, T t, V v, long j, long j2, boolean z) {
        V vInvoke;
        this.a = f0h0Var;
        this.b = m.b(t);
        if (v != null) {
            vInvoke = (V) nj0.a(v);
        } else {
            vInvoke = f0h0Var.a().invoke(t);
            vInvoke.d();
        }
        this.c = vInvoke;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final T b() {
        return this.a.b().invoke(this.c);
    }

    @Override // defpackage.twd0
    public final T getValue() {
        return (T) ((x5a0) this.b).getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(((x5a0) this.b).getValue());
        sb.append(", velocity=");
        sb.append(b());
        sb.append(", isRunning=");
        sb.append(this.f);
        sb.append(", lastFrameTimeNanos=");
        sb.append(this.d);
        sb.append(", finishedTimeNanos=");
        return uvh.a(sb, this.e, ')');
    }

    public /* synthetic */ aj0(f0h0 f0h0Var, Object obj, mj0 mj0Var, int i) {
        this(f0h0Var, obj, (i & 4) != 0 ? null : mj0Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
