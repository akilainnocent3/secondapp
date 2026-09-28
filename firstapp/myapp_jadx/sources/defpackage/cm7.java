package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class cm7 extends j8i0 {
    public final gl7 a;
    public final wwd0 b;
    public final v340 c;

    public static final class a implements lyh<uf00<? extends il7>> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ cm7 b;

        /* JADX INFO: renamed from: cm7$a$a, reason: collision with other inner class name */
        public static final class C0177a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ cm7 b;

            /* JADX INFO: renamed from: cm7$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.component.chip.chipselector.ChipsSelectorViewModel$special$$inlined$map$1$2", f = "ChipsSelectorViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0178a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0178a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0177a.this.emit(null, this);
                }
            }

            public C0177a(myh myhVar, cm7 cm7Var) {
                this.a = myhVar;
                this.b = cm7Var;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x006c  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0178a c0178a;
                boolean z;
                if (v1bVar instanceof C0178a) {
                    c0178a = (C0178a) v1bVar;
                    int i = c0178a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0178a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0178a = new C0178a(v1bVar);
                    }
                } else {
                    c0178a = new C0178a(v1bVar);
                }
                Object obj2 = c0178a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0178a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    bm7 bm7Var = (bm7) obj;
                    qcn<skd0> qcnVar = bm7Var.c;
                    ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                    Iterator<skd0> it = qcnVar.iterator();
                    while (it.hasNext()) {
                        BigDecimal bigDecimal = it.next().a;
                        if (bm7Var.a) {
                            BigDecimal bigDecimalAdd = bm7Var.f.add(bigDecimal);
                            bigDecimalAdd.getClass();
                            if (bigDecimalAdd.compareTo(bm7Var.e) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = true;
                        }
                        arrayList.add(new il7(z, this.b.a.b(bigDecimal), fl7.a(bigDecimal.doubleValue()), bigDecimal));
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    c0178a.b = 1;
                    if (this.a.emit(uf00VarF, c0178a) == y5bVar) {
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

        public a(wwd0 wwd0Var, cm7 cm7Var) {
            this.a = wwd0Var;
            this.b = cm7Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends il7>> myhVar, v1b v1bVar) throws Throwable {
            this.a.collect(new C0177a(myhVar, this.b), v1bVar);
            return y5b.a;
        }
    }

    @c0d(c = "com.sportygames.component.chip.chipselector.ChipsSelectorViewModel$uiState$1", f = "ChipsSelectorViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements gaj<bm7, uf00<? extends il7>, v1b<? super qyo>, Object> {
        public /* synthetic */ bm7 a;
        public /* synthetic */ uf00 b;

        @Override // defpackage.gaj
        public final Object invoke(bm7 bm7Var, uf00<? extends il7> uf00Var, v1b<? super qyo> v1bVar) {
            b bVar = new b(3, v1bVar);
            bVar.a = bm7Var;
            bVar.b = uf00Var;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            bm7 bm7Var = this.a;
            uf00 uf00Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new qyo(bm7Var.b, fl7.a(bm7Var.d.doubleValue()), fl7.a(bm7Var.e.doubleValue()), uf00Var);
        }
    }

    public cm7(k5b k5bVar, gl7 gl7Var) {
        k5bVar.getClass();
        gl7Var.getClass();
        this.a = gl7Var;
        wwd0 wwd0VarA = xwd0.a(new bm7());
        this.b = wwd0VarA;
        a aVar = new a(wwd0VarA, this);
        n1a0 n1a0Var = n1a0.c;
        lyh lyhVarC = ozh.c(aVar, k5bVar);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        n1i n1iVar = new n1i(wwd0VarA, e1i.e(lyhVarC, et7VarD, kwd0Var, n1a0Var), new b(3, null));
        this.c = e1i.e(ozh.c(n1iVar, k5bVar), o8i0.d(this), kwd0Var, new qyo(0));
    }
}
