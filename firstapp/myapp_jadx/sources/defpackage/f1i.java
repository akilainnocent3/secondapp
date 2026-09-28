package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class f1i implements lyh<Object> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: f1i$a$a, reason: collision with other inner class name */
        @c0d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
        public static final class C0543a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0543a(v1b v1bVar) {
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
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            C0543a c0543a;
            if (v1bVar instanceof C0543a) {
                c0543a = (C0543a) v1bVar;
                int i = c0543a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0543a.b = i - Integer.MIN_VALUE;
                } else {
                    c0543a = new C0543a(v1bVar);
                }
            } else {
                c0543a = new C0543a(v1bVar);
            }
            Object obj = c0543a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0543a.b;
            if (i2 == 0) {
                uj50.b(obj);
                if (t != null) {
                    c0543a.b = 1;
                    if (this.a.emit(t, c0543a) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public f1i(lyh lyhVar) {
        this.a = lyhVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
