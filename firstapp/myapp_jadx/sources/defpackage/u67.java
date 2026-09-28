package defpackage;

import com.google.protobuf.Reader;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class u67<T> implements abj<T> {
    public final CoroutineContext a;
    public final int b;
    public final pb5 c;

    public u67(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        this.a = coroutineContext;
        this.b = i;
        this.c = pb5Var;
    }

    @Override // defpackage.lyh
    public Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new s67(myhVar, this, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.abj
    public final lyh<T> d(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        pb5 pb5Var2 = pb5.a;
        pb5 pb5Var3 = this.c;
        int i2 = this.b;
        if (pb5Var == pb5Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Reader.READ_DONE;
                        }
                    }
                }
            }
            pb5Var = pb5Var3;
        }
        return (Intrinsics.g(coroutineContextPlus, coroutineContext2) && i == i2 && pb5Var == pb5Var3) ? this : i(coroutineContextPlus, i, pb5Var);
    }

    public String e() {
        return null;
    }

    public abstract Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar);

    public abstract u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var);

    public lyh<T> j() {
        return null;
    }

    public wf40<T> k(v5b v5bVar) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        a6b a6bVar = a6b.c;
        Function2 t67Var = new t67(this, null);
        dz20 dz20Var = new dz20(g5b.b(v5bVar, this.a), d77.b(i, 4, this.c));
        dz20Var.n0(a6bVar, dz20Var, t67Var);
        return dz20Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        e eVar = e.a;
        CoroutineContext coroutineContext = this.a;
        if (coroutineContext != eVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        pb5 pb5Var = pb5.a;
        pb5 pb5Var2 = this.c;
        if (pb5Var2 != pb5Var) {
            arrayList.add("onBufferOverflow=" + pb5Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return j26.a(sb, CollectionsKt.a0(arrayList, ", ", null, null, null, 62), ']');
    }
}
