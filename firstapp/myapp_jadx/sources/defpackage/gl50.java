package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class gl50 implements lyh<mk50<Object>> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: gl50$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.business.repositories.ResultsKt$asResults$$inlined$map$1$2", f = "Results.kt", l = {50}, m = "emit", v = 1)
        public static final class C0602a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0602a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0602a c0602a;
            if (v1bVar instanceof C0602a) {
                c0602a = (C0602a) v1bVar;
                int i = c0602a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0602a.b = i - Integer.MIN_VALUE;
                } else {
                    c0602a = new C0602a(v1bVar);
                }
            } else {
                c0602a = new C0602a(v1bVar);
            }
            Object obj2 = c0602a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0602a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                mk50.c cVar = new mk50.c(obj);
                c0602a.b = 1;
                if (this.a.emit(cVar, c0602a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public gl50(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super mk50<Object>> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
