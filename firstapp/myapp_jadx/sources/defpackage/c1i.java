package defpackage;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class c1i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh<Object> c;
    public final /* synthetic */ dm8 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<ztw<T>> a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ dm8 c;

        public a(dq40 dq40Var, v5b v5bVar, dm8 dm8Var) {
            this.a = dq40Var;
            this.b = v5bVar;
            this.c = dm8Var;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, wwd0, ztw] */
        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            dq40<ztw<T>> dq40Var = this.a;
            ztw<T> ztwVar = dq40Var.a;
            if (ztwVar != null) {
                ztwVar.setValue(t);
            } else {
                ?? r3 = (T) xwd0.a(t);
                zi50.a aVar = zi50.b;
                this.c.R(new zi50(new v340(r3, i9p.f(this.b.getCoroutineContext()))));
                dq40Var.a = r3;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1i(lyh lyhVar, dm8 dm8Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = lyhVar;
        this.d = dm8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c1i c1iVar = new c1i(this.c, this.d, v1bVar);
        c1iVar.b = obj;
        return c1iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c1i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dq40 dq40Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        dm8 dm8Var = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                v5b v5bVar = (v5b) this.b;
                dq40 dq40Var2 = new dq40();
                lyh<Object> lyhVar = this.c;
                a aVar = new a(dq40Var2, v5bVar, dm8Var);
                this.b = dq40Var2;
                this.a = 1;
                if (lyhVar.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
                dq40Var = dq40Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dq40Var = (dq40) this.b;
                uj50.b(obj);
            }
            if (dq40Var.a == 0) {
                zi50.a aVar2 = zi50.b;
                dm8Var.R(new zi50(new zi50.b(new NoSuchElementException("Flow is empty"))));
            }
            return Unit.a;
        } catch (Throwable th) {
            dm8Var.F(th);
            throw th;
        }
    }
}
