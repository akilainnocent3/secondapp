package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf2s;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f2s extends j8i0 {
    public final wwd0 A;
    public final v340 B;
    public Integer C;
    public final ku90<e1s> D;
    public final t340 E;
    public final t340 F;
    public final v340 G;
    public final c27 a;
    public final b2s b;
    public final rdd0 c;
    public final mgb0 d;
    public final ResourceUiText e;
    public final ResourceUiText f;
    public final boolean i;
    public final v340 v;
    public final int w;
    public final int y;
    public final ChallengeType z;

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$entries$1$1", f = "LeaderboardViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<f1s, v1b<? super h1s>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = f2s.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(f1s f1sVar, v1b<? super h1s> v1bVar) {
            return ((a) create(f1sVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            f1s f1sVar = (f1s) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            f2s f2sVar = f2s.this;
            b2s b2sVar = f2sVar.b;
            ChallengeType challengeType = f2sVar.z;
            this.b = null;
            this.a = 1;
            Object objD = b2sVar.d(f1sVar, challengeType, this);
            return objD == y5bVar ? y5bVar : objD;
        }
    }

    public static final class b implements lyh<Boolean> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ f2s b;

        @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$special$$inlined$map$1", f = "LeaderboardViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: f2s$b$b, reason: collision with other inner class name */
        public static final class C0545b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ f2s b;

            /* JADX INFO: renamed from: f2s$b$b$a */
            @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$special$$inlined$map$1$2", f = "LeaderboardViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0545b.this.emit(null, this);
                }
            }

            public C0545b(myh myhVar, f2s f2sVar) {
                this.a = myhVar;
                this.b = f2sVar;
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
                    Boolean boolValueOf = Boolean.valueOf(this.b.i || ((f1s) obj) == null);
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
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

        public b(uwd0 uwd0Var, f2s f2sVar) {
            this.a = uwd0Var;
            this.b = f2sVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
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
                C0545b c0545b = new C0545b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c0545b, aVar) == y5bVar) {
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

    public static final class c implements lyh<kqz<h1s>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ f2s b;

        @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$special$$inlined$map$2", f = "LeaderboardViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ f2s b;

            @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$special$$inlined$map$2$2", f = "LeaderboardViewModel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, f2s f2sVar) {
                this.a = myhVar;
                this.b = f2sVar;
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
                    kqz kqzVarB = vqz.b((kqz) obj, this.b.new a(null));
                    aVar.b = 1;
                    if (this.a.emit(kqzVarB, aVar) == y5bVar) {
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

        public c(lyh lyhVar, f2s f2sVar) {
            this.a = lyhVar;
            this.b = f2sVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super kqz<h1s>> myhVar, v1b v1bVar) {
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
                b bVar = new b(myhVar, this.b);
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

    public f2s(vu60 vu60Var, c27 c27Var, b2s b2sVar, rdd0 rdd0Var, mgb0 mgb0Var) {
        or60 or60Var;
        or60 or60Var2;
        vu60Var.getClass();
        c27Var.getClass();
        b2sVar.getClass();
        rdd0Var.getClass();
        mgb0Var.getClass();
        this.a = c27Var;
        this.b = b2sVar;
        this.c = rdd0Var;
        this.d = mgb0Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        j07 j07Var = (j07) fnf.a(vu60Var, jq40.a(j07.class), o2gVar);
        Object[] objArr = {j07Var.b};
        StringUiText stringUiText = vch0.a;
        this.e = new ResourceUiText(R.string.page_loyalty__challenge_leaderboard_of, ay0.S(objArr));
        this.f = new ResourceUiText(j07Var.c);
        ChallengeCardStatus challengeCardStatus = j07Var.g;
        boolean z = challengeCardStatus == ChallengeCardStatus.Cancelled || challengeCardStatus == ChallengeCardStatus.Expired;
        this.i = z;
        this.v = e1i.e(new b(c27Var.e(), this), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), Boolean.valueOf(z));
        this.w = j07Var.f;
        this.y = j07Var.i;
        this.z = j07Var.h;
        wwd0 wwd0VarA = xwd0.a(null);
        this.A = wwd0VarA;
        this.B = e1i.b(wwd0VarA);
        ku90<e1s> ku90Var = new ku90<>();
        this.D = ku90Var;
        this.E = e1i.a(ku90Var);
        this.F = rs5.a(new c(c27Var.d(j07Var.a), this), o8i0.d(this));
        long j = j07Var.d;
        long j2 = j07Var.e;
        j2s j2sVar = j2s.a;
        challengeCardStatus.getClass();
        j2sVar.getClass();
        switch (i2s.a[challengeCardStatus.ordinal()]) {
            case 1:
            case 2:
                or60Var = new or60(new k2s(2, null));
                or60Var2 = or60Var;
                this.G = e1i.e(or60Var2, o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new ResourceUiText(R.string.page_loyalty__challenge_time_end));
                ej5.c(o8i0.d(this), null, null, new h2s(this, null), 3);
                return;
            case 3:
                or60Var = new or60(new l2s(j, j2sVar, null));
                or60Var2 = or60Var;
                this.G = e1i.e(or60Var2, o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new ResourceUiText(R.string.page_loyalty__challenge_time_end));
                ej5.c(o8i0.d(this), null, null, new h2s(this, null), 3);
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                or60Var2 = new or60(new m2s(j2, null));
                this.G = e1i.e(or60Var2, o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new ResourceUiText(R.string.page_loyalty__challenge_time_end));
                ej5.c(o8i0.d(this), null, null, new h2s(this, null), 3);
                return;
            default:
                uhc.a();
                throw null;
        }
    }
}
