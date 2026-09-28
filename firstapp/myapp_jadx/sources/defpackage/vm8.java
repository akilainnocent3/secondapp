package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class vm8 implements lyh<an8<Object>> {
    public final /* synthetic */ wzh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: vm8$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.framework.CompleteResultKt$asCompleteResults$$inlined$map$1$2", f = "CompleteResult.kt", l = {50}, m = "emit", v = 1)
        public static final class C1216a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1216a(v1b v1bVar) {
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
            C1216a c1216a;
            if (v1bVar instanceof C1216a) {
                c1216a = (C1216a) v1bVar;
                int i = c1216a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1216a.b = i - Integer.MIN_VALUE;
                } else {
                    c1216a = new C1216a(v1bVar);
                }
            } else {
                c1216a = new C1216a(v1bVar);
            }
            Object obj2 = c1216a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1216a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                an8.d dVar = new an8.d(obj);
                c1216a.b = 1;
                if (this.a.emit(dVar, c1216a) == y5bVar) {
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

    public vm8(wzh wzhVar) {
        this.a = wzhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super an8<Object>> myhVar, v1b v1bVar) throws Throwable {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
