package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class sod0 implements lyh<nye> {
    public final /* synthetic */ lyh a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: sod0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.stacker.data.repository.StackerRepository$special$$inlined$map$1$2", f = "StackerRepository.kt", l = {50}, m = "emit", v = 1)
        public static final class C1098a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1098a(v1b v1bVar) {
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
            C1098a c1098a;
            nye nyeVar;
            if (v1bVar instanceof C1098a) {
                c1098a = (C1098a) v1bVar;
                int i = c1098a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1098a.b = i - Integer.MIN_VALUE;
                } else {
                    c1098a = new C1098a(v1bVar);
                }
            } else {
                c1098a = new C1098a(v1bVar);
            }
            Object obj2 = c1098a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1098a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                jld0 jld0Var = (jld0) obj;
                if (jld0Var instanceof db) {
                    db dbVar = (db) jld0Var;
                    nyeVar = new nye(dbVar.b, dbVar.a, 1);
                } else {
                    if (!(jld0Var instanceof nbx)) {
                        uhc.a();
                        return null;
                    }
                    nyeVar = new nye(((nbx) jld0Var).a, 0L, 2);
                }
                c1098a.b = 1;
                if (this.a.emit(nyeVar, c1098a) == y5bVar) {
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

    public sod0(a390 a390Var) {
        this.a = a390Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super nye> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
