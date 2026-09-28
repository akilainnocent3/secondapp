package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class qzs implements lyh<xxs<Object>> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: qzs$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$toSingleLoadingTask$$inlined$map$1$2", f = "LoadingTask.kt", l = {50}, m = "emit", v = 1)
        public static final class C1028a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1028a(v1b v1bVar) {
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
            C1028a c1028a;
            if (v1bVar instanceof C1028a) {
                c1028a = (C1028a) v1bVar;
                int i = c1028a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1028a.b = i - Integer.MIN_VALUE;
                } else {
                    c1028a = new C1028a(v1bVar);
                }
            } else {
                c1028a = new C1028a(v1bVar);
            }
            Object obj2 = c1028a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1028a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                xxs xxsVar = new xxs(1, obj);
                c1028a.b = 1;
                if (this.a.emit(xxsVar, c1028a) == y5bVar) {
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

    public qzs(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super xxs<Object>> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
