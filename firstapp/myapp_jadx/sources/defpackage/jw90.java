package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class jw90<T, R> extends AtomicInteger implements pse {
    public final zu90<? super R> a;
    public final faj<? super Object[], ? extends R> b;
    public final kw90<T>[] c;
    public final Object[] d;

    public jw90(zu90 zu90Var, int i, ce6 ce6Var) {
        super(i);
        this.a = zu90Var;
        this.b = ce6Var;
        kw90<T>[] kw90VarArr = new kw90[i];
        for (int i2 = 0; i2 < i; i2++) {
            kw90VarArr[i2] = new kw90<>(this, i2);
        }
        this.c = kw90VarArr;
        this.d = new Object[i];
    }

    @Override // defpackage.pse
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (kw90<T> kw90Var : this.c) {
                kw90Var.getClass();
                xse.a(kw90Var);
            }
        }
    }

    @Override // defpackage.pse
    public final boolean isDisposed() {
        return get() <= 0;
    }
}
