package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public final class lw90<T, R> extends ct90<R> {
    public final ArrayList a;
    public final ce6 b;

    public final class a implements faj<T, R> {
        public a() {
        }

        @Override // defpackage.faj
        public final R apply(T t) {
            lw90.this.b.apply(new Object[]{t});
            return (R) Boolean.TRUE;
        }
    }

    public lw90(ArrayList arrayList, ce6 ce6Var) {
        this.a = arrayList;
        this.b = ce6Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super R> zu90Var) {
        f2g f2gVar = f2g.a;
        dw90[] dw90VarArr = new dw90[8];
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                dw90 dw90Var = (dw90) obj;
                if (dw90Var == null) {
                    NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                    zu90Var.onSubscribe(f2gVar);
                    zu90Var.onError(nullPointerException);
                    return;
                } else {
                    if (i == dw90VarArr.length) {
                        dw90VarArr = (dw90[]) Arrays.copyOf(dw90VarArr, (i >> 2) + i);
                    }
                    int i3 = i + 1;
                    dw90VarArr[i] = dw90Var;
                    i = i3;
                }
            }
            if (i == 0) {
                NoSuchElementException noSuchElementException = new NoSuchElementException();
                zu90Var.onSubscribe(f2gVar);
                zu90Var.onError(noSuchElementException);
            } else {
                if (i == 1) {
                    dw90VarArr[0].a(new xu90.a(zu90Var, new a()));
                    return;
                }
                jw90 jw90Var = new jw90(zu90Var, i, this.b);
                zu90Var.onSubscribe(jw90Var);
                for (int i4 = 0; i4 < i && !jw90Var.isDisposed(); i4++) {
                    dw90VarArr[i4].a(jw90Var.c[i4]);
                }
            }
        } catch (Throwable th) {
            qtg.a(th);
            zu90Var.onSubscribe(f2gVar);
            zu90Var.onError(th);
        }
    }
}
