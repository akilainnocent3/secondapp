package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class jn20 implements lyh<Object> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ zn20.a b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ zn20.a b;

        /* JADX INFO: renamed from: jn20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.framework.datastore.PreferenceDataStoreImpl$getValue$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C0727a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0727a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, zn20.a aVar) {
            this.a = myhVar;
            this.b = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0727a c0727a;
            if (v1bVar instanceof C0727a) {
                c0727a = (C0727a) v1bVar;
                int i = c0727a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0727a.b = i - Integer.MIN_VALUE;
                } else {
                    c0727a = new C0727a(v1bVar);
                }
            } else {
                c0727a = new C0727a(v1bVar);
            }
            Object obj2 = c0727a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0727a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object objC = ((zn20) obj).c(this.b);
                c0727a.b = 1;
                if (this.a.emit(objC, c0727a) == y5bVar) {
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

    public jn20(yzh yzhVar, zn20.a aVar) {
        this.a = yzhVar;
        this.b = aVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
