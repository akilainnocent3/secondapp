package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class inz implements lyh<p1k> {
    public final /* synthetic */ d0i a;
    public final /* synthetic */ int b;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: inz$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {223}, m = "emit")
        public static final class C0686a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0686a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, int i) {
            this.a = myhVar;
            this.b = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0686a c0686a;
            if (v1bVar instanceof C0686a) {
                c0686a = (C0686a) v1bVar;
                int i = c0686a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0686a.b = i - Integer.MIN_VALUE;
                } else {
                    c0686a = new C0686a(v1bVar);
                }
            } else {
                c0686a = new C0686a(v1bVar);
            }
            Object obj2 = c0686a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0686a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                p1k p1kVar = new p1k(this.b, (qai0) obj);
                c0686a.b = 1;
                if (this.a.emit(p1kVar, c0686a) == y5bVar) {
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

    public inz(d0i d0iVar, int i) {
        this.a = d0iVar;
        this.b = i;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super p1k> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
