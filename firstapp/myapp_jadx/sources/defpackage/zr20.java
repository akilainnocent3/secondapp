package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzr20;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zr20 extends j8i0 {
    public final lyz a;
    public final wwd0 b;
    public final v340 c;
    public final v340 d;
    public final b390 e;
    public final t340 f;

    public static final class a implements lyh<uxs> {
        public final /* synthetic */ wwd0 a;

        /* JADX INFO: renamed from: zr20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.primaryphone.instructions.PrimaryPhoneInstructionsViewModel$special$$inlined$map$1", f = "PrimaryPhoneInstructionsViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1411a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1411a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: zr20$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.primaryphone.instructions.PrimaryPhoneInstructionsViewModel$special$$inlined$map$1$2", f = "PrimaryPhoneInstructionsViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1412a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1412a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1412a c1412a;
                if (v1bVar instanceof C1412a) {
                    c1412a = (C1412a) v1bVar;
                    int i = c1412a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1412a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1412a = new C1412a(v1bVar);
                    }
                } else {
                    c1412a = new C1412a(v1bVar);
                }
                Object obj2 = c1412a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1412a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    uxs uxsVar = ((gso) obj).e ? uxs.LOADING : uxs.ENABLE;
                    c1412a.b = 1;
                    if (this.a.emit(uxsVar, c1412a) == y5bVar) {
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

        public a(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super uxs> myhVar, v1b v1bVar) throws Throwable {
            C1411a c1411a;
            if (v1bVar instanceof C1411a) {
                c1411a = (C1411a) v1bVar;
                int i = c1411a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1411a.b = i - Integer.MIN_VALUE;
                } else {
                    c1411a = new C1411a(v1bVar);
                }
            } else {
                c1411a = new C1411a(v1bVar);
            }
            Object obj = c1411a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1411a.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            c1411a.b = 1;
            this.a.collect(bVar, c1411a);
            return y5bVar;
        }
    }

    public zr20(lyz lyzVar, psm psmVar, psm psmVar2) {
        lyzVar.getClass();
        psmVar.getClass();
        psmVar2.getClass();
        this.a = lyzVar;
        wwd0 wwd0VarA = xwd0.a(new gso(psmVar.b(), psmVar2.getCountryCode(), 28));
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
        this.d = e1i.e(new a(wwd0VarA), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), uxs.ENABLE);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.e = b390VarB;
        this.f = e1i.a(b390VarB);
    }
}
