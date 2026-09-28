package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qb1 implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ fb1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onRemoveAutoBetOnList$$inlined$handleApiUnitResult$default$1", f = "AutoBetViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return qb1.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ fb1 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onRemoveAutoBetOnList$$inlined$handleApiUnitResult$default$1$2", f = "AutoBetViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, fb1 fb1Var, String str, String str2, String str3) {
            this.a = myhVar;
            this.b = fb1Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
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
                lk50 lk50Var = (lk50) obj;
                boolean z = lk50Var instanceof lk50.c;
                fb1 fb1Var = this.b;
                if (z) {
                    l91 l91Var = fb1Var.P;
                    Object value = fb1Var.X.getValue();
                    t91.e eVar = value instanceof t91.e ? (t91.e) value : null;
                    fb1Var.z1(l91Var, eVar != null ? eVar.a : 1);
                    T value2 = fb1Var.W.a.getValue();
                    twb.f fVar = value2 instanceof twb.f ? (twb.f) value2 : null;
                    if (fVar != null) {
                        if ((Intrinsics.g(fVar.b, this.c) ? fVar : null) != null) {
                            fb1Var.B1();
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    fb1Var.D1(new rb1(this.d));
                    ej5.c(o8i0.d(fb1Var), null, null, new sb1(fb1Var, null), 3);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    fb1Var.D1(new tb1(this.e));
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
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

    public qb1(yzh yzhVar, fb1 fb1Var, String str, String str2, String str3) {
        this.a = yzhVar;
        this.b = fb1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
        a aVar;
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
            b bVar = new b(myhVar, this.b, this.c, this.d, this.e);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
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
