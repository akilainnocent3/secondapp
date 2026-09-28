package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ms5 implements lyh<kqz<Object>> {
    public final /* synthetic */ or60 a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: ms5$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
        public static final class C0877a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0877a(v1b v1bVar) {
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
            C0877a c0877a;
            if (v1bVar instanceof C0877a) {
                c0877a = (C0877a) v1bVar;
                int i = c0877a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0877a.b = i - Integer.MIN_VALUE;
                } else {
                    c0877a = new C0877a(v1bVar);
                }
            } else {
                c0877a = new C0877a(v1bVar);
            }
            Object obj2 = c0877a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0877a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                fmw fmwVar = (fmw) obj;
                wzh wzhVar = new wzh(new xzh(fmwVar.b.e, new cmw(fmwVar, null)), new dmw(fmwVar, null));
                kqz<T> kqzVar = fmwVar.a;
                kqz kqzVar2 = new kqz(wzhVar, kqzVar.b, kqzVar.c, new emw(fmwVar));
                c0877a.b = 1;
                if (this.a.emit(kqzVar2, c0877a) == y5bVar) {
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

    public ms5(or60 or60Var) {
        this.a = or60Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super kqz<Object>> myhVar, v1b v1bVar) throws Throwable {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
