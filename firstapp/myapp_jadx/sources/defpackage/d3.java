package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d3<T> implements lyh<T> {

    @c0d(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class a extends x1b {
        public kr60 a;
        public /* synthetic */ Object b;
        public final /* synthetic */ d3<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d3<T> d3Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.c = d3Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) throws Throwable {
        a aVar;
        kr60 kr60Var;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, v1bVar);
            }
        } else {
            aVar = new a(this, v1bVar);
        }
        Object obj = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kr60Var = aVar.a;
            try {
                uj50.b(obj);
                kr60Var.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th) {
                th = th;
                kr60Var.releaseIntercepted();
                throw th;
            }
        }
        uj50.b(obj);
        kr60 kr60Var2 = new kr60(myhVar, aVar.getContext());
        try {
            aVar.a = kr60Var2;
            aVar.d = 1;
            try {
                Object objInvoke = ((or60) this).a.invoke(kr60Var2, aVar);
                if (objInvoke != y5bVar) {
                    objInvoke = Unit.a;
                }
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
                kr60Var = kr60Var2;
                kr60Var.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                kr60Var = kr60Var2;
                kr60Var.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
