package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class kw90<T> extends AtomicReference<pse> implements zu90<T> {
    public final jw90<T, ?> a;
    public final int b;

    public kw90(jw90<T, ?> jw90Var, int i) {
        this.a = jw90Var;
        this.b = i;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        int i;
        jw90<T, ?> jw90Var = this.a;
        int i2 = 0;
        if (jw90Var.getAndSet(0) <= 0) {
            o760.b(th);
            return;
        }
        kw90<T>[] kw90VarArr = jw90Var.c;
        int length = kw90VarArr.length;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            kw90<T> kw90Var = kw90VarArr[i2];
            kw90Var.getClass();
            xse.a(kw90Var);
            i2++;
        }
        while (true) {
            i++;
            if (i >= length) {
                jw90Var.a.onError(th);
                return;
            } else {
                kw90<T> kw90Var2 = kw90VarArr[i];
                kw90Var2.getClass();
                xse.a(kw90Var2);
            }
        }
    }

    @Override // defpackage.zu90
    public final void onSubscribe(pse pseVar) {
        xse.d(this, pseVar);
    }

    @Override // defpackage.zu90
    public final void onSuccess(T t) {
        jw90<T, ?> jw90Var = this.a;
        zu90<? super Object> zu90Var = jw90Var.a;
        Object[] objArr = jw90Var.d;
        objArr[this.b] = t;
        if (jw90Var.decrementAndGet() == 0) {
            try {
                Object objApply = jw90Var.b.apply(objArr);
                yby.b(objApply, "The zipper returned a null value");
                zu90Var.onSuccess(objApply);
            } catch (Throwable th) {
                qtg.a(th);
                zu90Var.onError(th);
            }
        }
    }
}
