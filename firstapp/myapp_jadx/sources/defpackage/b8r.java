package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb8r;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b8r extends j8i0 {
    public final rdd0 a;
    public final ku90<ccr> b;
    public final wwd0 c;
    public final v340 d;

    public static final class a implements lyh<z7r> {
        public final /* synthetic */ wwd0 a;

        /* JADX INFO: renamed from: b8r$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.presentation.LNRewardCenterViewModel$special$$inlined$map$1", f = "LNRewardCenterViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0114a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0114a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: b8r$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.presentation.LNRewardCenterViewModel$special$$inlined$map$1$2", f = "LNRewardCenterViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0115a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0115a(v1b v1bVar) {
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
                C0115a c0115a;
                if (v1bVar instanceof C0115a) {
                    c0115a = (C0115a) v1bVar;
                    int i = c0115a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0115a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0115a = new C0115a(v1bVar);
                    }
                } else {
                    c0115a = new C0115a(v1bVar);
                }
                Object obj2 = c0115a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0115a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    z7r z7rVar = new z7r((a8r) obj);
                    c0115a.b = 1;
                    if (this.a.emit(z7rVar, c0115a) == y5bVar) {
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
        public final Object collect(myh<? super z7r> myhVar, v1b v1bVar) throws Throwable {
            C0114a c0114a;
            if (v1bVar instanceof C0114a) {
                c0114a = (C0114a) v1bVar;
                int i = c0114a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0114a.b = i - Integer.MIN_VALUE;
                } else {
                    c0114a = new C0114a(v1bVar);
                }
            } else {
                c0114a = new C0114a(v1bVar);
            }
            Object obj = c0114a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0114a.b;
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
            c0114a.b = 1;
            this.a.collect(bVar, c0114a);
            return y5bVar;
        }
    }

    public b8r(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(a8r.Gift);
        this.c = wwd0VarA;
        this.d = e1i.e(new a(wwd0VarA), o8i0.d(this), q490.a.a, new z7r(0));
    }
}
