package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class cxa implements lyh<Object> {
    public final /* synthetic */ g1i a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: cxa$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$$inlined$filterIsInstance$1$2", f = "ConstraintTrackingWorker.kt", l = {223}, m = "emit")
        public static final class C0468a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0468a(v1b v1bVar) {
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
            C0468a c0468a;
            if (v1bVar instanceof C0468a) {
                c0468a = (C0468a) v1bVar;
                int i = c0468a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0468a.b = i - Integer.MIN_VALUE;
                } else {
                    c0468a = new C0468a(v1bVar);
                }
            } else {
                c0468a = new C0468a(v1bVar);
            }
            Object obj2 = c0468a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0468a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                if (obj instanceof rxa.b) {
                    c0468a.b = 1;
                    if (this.a.emit(obj, c0468a) == y5bVar) {
                        return y5bVar;
                    }
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

    public cxa(g1i g1iVar) {
        this.a = g1iVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
