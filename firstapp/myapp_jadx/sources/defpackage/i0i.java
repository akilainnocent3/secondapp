package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class i0i implements lyh<Object> {
    public final /* synthetic */ lyh a;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public Object d;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return i0i.this.collect(null, this);
        }
    }

    public i0i(lyh lyhVar) {
        this.a = lyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        a aVar;
        Object obj;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj2 = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj2);
            Object obj3 = new Object();
            bq40 bq40Var = new bq40();
            try {
                lyh lyhVar = this.a;
                j0i j0iVar = new j0i(bq40Var, myhVar, obj3);
                aVar.d = obj3;
                aVar.b = 1;
                if (lyhVar.collect(j0iVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } catch (t1 e) {
                e = e;
                obj = obj3;
                if (e.a != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = aVar.d;
            try {
                uj50.b(obj2);
            } catch (t1 e2) {
                e = e2;
                if (e.a != obj) {
                    throw e;
                }
            }
        }
        return Unit.a;
    }
}
