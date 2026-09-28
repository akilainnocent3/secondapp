package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", l = {110}, m = "invokeSuspend")
public final class l760 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh<Object> c;
    public final /* synthetic */ ycy.a d;

    public static final class a<T> implements myh {
        public final /* synthetic */ ycy.a a;

        public a(ycy.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            this.a.b(t);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l760(lyh lyhVar, ycy.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = lyhVar;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l760 l760Var = new l760(this.c, this.d, v1bVar);
        l760Var.b = obj;
        return l760Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l760) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        v5b v5bVar;
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ycy.a aVar = this.d;
        if (i == 0) {
            uj50.b(obj);
            v5b v5bVar2 = (v5b) this.b;
            try {
                lyh<Object> lyhVar = this.c;
                a aVar2 = new a(aVar);
                this.b = v5bVar2;
                this.a = 1;
                if (lyhVar.collect(aVar2, this) == y5bVar) {
                    return y5bVar;
                }
                v5bVar = v5bVar2;
            } catch (Throwable th2) {
                th = th2;
                v5bVar = v5bVar2;
                z = th instanceof CancellationException;
                if (!z) {
                    aVar.a();
                } else if (!aVar.c(th)) {
                    CoroutineContext coroutineContext = v5bVar.getCoroutineContext();
                    if (!z) {
                        o760.b(th);
                    }
                }
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v5bVar = (v5b) this.b;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                z = th instanceof CancellationException;
                if (!z) {
                    aVar.a();
                } else if (!aVar.c(th)) {
                    CoroutineContext coroutineContext2 = v5bVar.getCoroutineContext();
                    if (!z) {
                        try {
                            o760.b(th);
                        } catch (Throwable th4) {
                            rtg.a(th, th4);
                            o5b.a(coroutineContext2, th);
                        }
                    }
                }
            }
        }
        aVar.a();
        return Unit.a;
    }
}
