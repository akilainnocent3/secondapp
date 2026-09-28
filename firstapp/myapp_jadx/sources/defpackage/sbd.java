package defpackage;

import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sbd implements mfn {
    public static final sbd a = new sbd();

    public static final class a extends d.c implements qcf {
        public final psw D;
        public boolean E;
        public boolean F;
        public boolean G;

        /* JADX INFO: renamed from: sbd$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
        public static final class C1088a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;

            /* JADX INFO: renamed from: sbd$a$a$a, reason: collision with other inner class name */
            public static final class C1089a<T> implements myh {
                public final /* synthetic */ bq40 a;
                public final /* synthetic */ bq40 b;
                public final /* synthetic */ bq40 c;
                public final /* synthetic */ a d;

                public C1089a(bq40 bq40Var, bq40 bq40Var2, bq40 bq40Var3, a aVar) {
                    this.a = bq40Var;
                    this.b = bq40Var2;
                    this.c = bq40Var3;
                    this.d = aVar;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    xxo xxoVar = (xxo) obj;
                    boolean z = xxoVar instanceof mp20.b;
                    bq40 bq40Var = this.c;
                    bq40 bq40Var2 = this.b;
                    bq40 bq40Var3 = this.a;
                    boolean z2 = true;
                    if (z) {
                        bq40Var3.a++;
                    } else if ((xxoVar instanceof mp20.c) || (xxoVar instanceof mp20.a)) {
                        bq40Var3.a--;
                    } else if (xxoVar instanceof vkm) {
                        bq40Var2.a++;
                    } else if (xxoVar instanceof wkm) {
                        bq40Var2.a--;
                    } else if (xxoVar instanceof c4i) {
                        bq40Var.a++;
                    } else if (xxoVar instanceof d4i) {
                        bq40Var.a--;
                    }
                    boolean z3 = false;
                    boolean z4 = bq40Var3.a > 0;
                    boolean z5 = bq40Var2.a > 0;
                    boolean z6 = bq40Var.a > 0;
                    a aVar = this.d;
                    if (aVar.E != z4) {
                        aVar.E = z4;
                        z3 = true;
                    }
                    if (aVar.F != z5) {
                        aVar.F = z5;
                        z3 = true;
                    }
                    if (aVar.G != z6) {
                        aVar.G = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        rcf.a(aVar);
                    }
                    return Unit.a;
                }
            }

            public C1088a(v1b<? super C1088a> v1bVar) {
                super(2, v1bVar);
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new C1088a(v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1088a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return Unit.a;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                bq40 bq40Var = new bq40();
                bq40 bq40Var2 = new bq40();
                bq40 bq40Var3 = new bq40();
                a aVar = a.this;
                b390 b390VarB = aVar.D.b();
                C1089a c1089a = new C1089a(bq40Var, bq40Var2, bq40Var3, aVar);
                this.a = 1;
                b390VarB.collect(c1089a, this);
                return y5bVar;
            }
        }

        public a(psw pswVar) {
            this.D = pswVar;
        }

        @Override // defpackage.qcf
        public final void A(wsr wsrVar) {
            qc6 qc6Var = wsrVar.a;
            wsrVar.b2();
            if (this.E) {
                tcf.m0(wsrVar, j58.c(0.3f, j58.b), 0L, qc6Var.d(), 0.0f, null, 0, 122);
            } else if (this.F || this.G) {
                tcf.m0(wsrVar, j58.c(0.1f, j58.b), 0L, qc6Var.d(), 0.0f, null, 0, 122);
            }
        }

        @Override // androidx.compose.ui.d.c
        public final void h2() {
            ej5.c(d2(), null, null, new C1088a(null), 3);
        }
    }

    @Override // defpackage.mfn
    public final okd a(psw pswVar) {
        return new a(pswVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.mfn
    public final int hashCode() {
        return -1;
    }
}
