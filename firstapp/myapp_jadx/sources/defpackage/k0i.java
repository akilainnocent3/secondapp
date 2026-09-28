package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class k0i implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ Function2 b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public l0i d;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return k0i.this.collect(null, this);
        }
    }

    public k0i(lyh lyhVar, Function2 function2) {
        this.a = lyhVar;
        this.b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        a aVar;
        l0i l0iVar;
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
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh lyhVar = this.a;
            l0i l0iVar2 = new l0i(myhVar, this.b);
            try {
                aVar.d = l0iVar2;
                aVar.b = 1;
                if (lyhVar.collect(l0iVar2, aVar) == y5bVar) {
                    return y5bVar;
                }
            } catch (t1 e) {
                e = e;
                l0iVar = l0iVar2;
                if (e.a == l0iVar) {
                    throw e;
                }
                i9p.e(aVar.getContext());
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l0iVar = aVar.d;
            try {
                uj50.b(obj);
            } catch (t1 e2) {
                e = e2;
                if (e.a == l0iVar) {
                    throw e;
                }
                i9p.e(aVar.getContext());
            }
        }
        return Unit.a;
    }
}
