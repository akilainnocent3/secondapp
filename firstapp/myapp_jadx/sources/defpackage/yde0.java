package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class yde0<T> implements a390<T> {
    public final b390 a;
    public final ks5 b;

    @c0d(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {412}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ yde0<T> b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yde0<T> yde0Var, v1b<? super a> v1bVar) {
            super(v1bVar);
            this.b = yde0Var;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            this.b.collect(null, this);
            return y5b.a;
        }
    }

    public yde0(b390 b390Var, ks5 ks5Var) {
        this.a = b390Var;
        this.b = ks5Var;
    }

    @Override // defpackage.a390
    public final List<T> c() {
        return this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<?> v1bVar) throws Throwable {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, v1bVar);
            }
        } else {
            aVar = new a(this, v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        xde0 xde0Var = new xde0(myhVar, this.b);
        aVar.c = 1;
        this.a.collect(xde0Var, aVar);
        return y5bVar;
    }
}
