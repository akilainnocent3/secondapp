package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class wzh implements lyh<Object> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ gaj b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public Object d;
        public myh e;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return wzh.this.collect(null, this);
        }
    }

    public wzh(lyh lyhVar, gaj gajVar) {
        this.a = lyhVar;
        this.b = gajVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) throws Throwable {
        a aVar;
        kr60 kr60Var;
        kr60 kr60Var2;
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
        try {
            try {
                if (i2 == 0) {
                    uj50.b(obj);
                    lyh lyhVar = this.a;
                    aVar.d = this;
                    aVar.e = myhVar;
                    aVar.b = 1;
                    if (lyhVar.collect(myhVar, aVar) != y5bVar) {
                    }
                    return y5bVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) aVar.d;
                        uj50.b(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kr60Var2 = (kr60) aVar.d;
                    try {
                        uj50.b(obj);
                        kr60Var2.releaseIntercepted();
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        kr60Var2.releaseIntercepted();
                        throw th;
                    }
                }
                myhVar = aVar.e;
                this = (wzh) aVar.d;
                uj50.b(obj);
                gaj gajVar = this.b;
                aVar.d = kr60Var;
                aVar.e = null;
                aVar.b = 3;
                if (gajVar.invoke(kr60Var, null, aVar) != y5bVar) {
                    kr60Var2 = kr60Var;
                    kr60Var2.releaseIntercepted();
                    return Unit.a;
                }
            } catch (Throwable th3) {
                th = th3;
                kr60Var2 = kr60Var;
                kr60Var2.releaseIntercepted();
                throw th;
            }
            kr60Var = new kr60(myhVar, aVar.getContext());
        } catch (Throwable th4) {
            wzh wzhVar = this;
            qpf0 qpf0Var = new qpf0(th4);
            gaj gajVar2 = wzhVar.b;
            aVar.d = th4;
            aVar.e = null;
            aVar.b = 2;
            if (h99.b(qpf0Var, gajVar2, th4, aVar) != y5bVar) {
                throw th4;
            }
        }
        return y5bVar;
    }
}
