package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final class o67<T> extends u67<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(o67.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final wf40<T> d;
    public final boolean e;

    public /* synthetic */ o67(wf40 wf40Var, boolean z) {
        this(wf40Var, z, e.a, -3, pb5.a);
    }

    @Override // defpackage.u67, defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        if (this.b != -3) {
            Object objCollect = super.collect(myhVar, v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            ib5.a("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objB = izh.b(myhVar, this.d, z, v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.u67
    public final String e() {
        return "channel=" + this.d;
    }

    @Override // defpackage.u67
    public final Object f(ez20<? super T> ez20Var, v1b<? super Unit> v1bVar) {
        Object objB = izh.b(new rc80(ez20Var), this.d, this.e, v1bVar);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.u67
    public final u67<T> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new o67(this.d, this.e, coroutineContext, i, pb5Var);
    }

    @Override // defpackage.u67
    public final lyh<T> j() {
        return new o67(this.d, this.e);
    }

    @Override // defpackage.u67
    public final wf40<T> k(v5b v5bVar) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.k(v5bVar);
        }
        ib5.a("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o67(wf40<? extends T> wf40Var, boolean z, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(coroutineContext, i, pb5Var);
        this.d = wf40Var;
        this.e = z;
    }
}
