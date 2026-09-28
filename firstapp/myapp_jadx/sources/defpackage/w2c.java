package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportybet.android.social.data.local.CCPDatabase;
import com.sportybet.android.social.data.local.CreatorCreditEntity;
import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import com.sportybet.android.social.data.remote.entity.CreatorCredit;
import com.sportybet.android.social.data.remote.entity.RewardData;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class w2c implements x2c {
    public final h1c a;
    public final CCPDatabase b;
    public final lq1 c;
    public final k5b d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final wwd0 f = xwd0.a(null);
    public final wwd0 g = xwd0.a(null);
    public final LinkedHashMap h = new LinkedHashMap();

    @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$claimReward$1", f = "CreatorCreditsRepoImpl.kt", l = {100, 100}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<RewardData>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = w2c.this.new a(this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<RewardData>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                w2c r7 = defpackage.w2c.this
                h1c r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: w2c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getClaimedContents$1", f = "CreatorCreditsRepoImpl.kt", l = {96, 96}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<List<? extends CreatorCredit>>>, v1b<? super Unit>, Object> {
        public myh a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = w2c.this.new b(this.e, v1bVar);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends CreatorCredit>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.b
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L15
                defpackage.uj50.b(r7)
                goto L44
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                myh r0 = r6.a
                defpackage.uj50.b(r7)
                goto L37
            L21:
                defpackage.uj50.b(r7)
                w2c r7 = defpackage.w2c.this
                h1c r7 = r7.a
                r6.c = r5
                r6.a = r0
                r6.b = r4
                java.lang.String r2 = r6.e
                java.lang.Object r7 = r7.e(r2, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.c = r5
                r6.a = r5
                r6.b = r3
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L44
            L43:
                return r1
            L44:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: w2c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ w2c b;

        @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getCreatorEnabled$$inlined$map$1", f = "CreatorCreditsRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
            public final /* synthetic */ w2c b;

            @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getCreatorEnabled$$inlined$map$1$2", f = "CreatorCreditsRepoImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, w2c w2cVar) {
                this.a = myhVar;
                this.b = w2cVar;
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
                    Boolean bool = (Boolean) obj;
                    Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : qq1.a(this.b.c, BOConfigParam.EnableCreatorCredits, false));
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

        public c(wwd0 wwd0Var, w2c w2cVar) {
            this.a = wwd0Var;
            this.b = w2cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getCreatorEnabled$2", f = "CreatorCreditsRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = w2c.this.new d(v1bVar);
            dVar.a = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((d) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            w2c.this.f.k(null, Boolean.valueOf(z));
            return Unit.a;
        }
    }

    public static final class e implements lyh<Integer> {
        public final /* synthetic */ wwd0 a;
        public final /* synthetic */ w2c b;

        @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getMinSelections$$inlined$map$1", f = "CreatorCreditsRepoImpl.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ w2c b;

            /* JADX INFO: loaded from: classes6.dex */
            @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getMinSelections$$inlined$map$1$2", f = "CreatorCreditsRepoImpl.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, w2c w2cVar) {
                this.a = myhVar;
                this.b = w2cVar;
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
                    Integer num = (Integer) obj;
                    Integer num2 = new Integer(num != null ? num.intValue() : qq1.e(this.b.c, BOConfigParam.SocialCreatorCreditsMinimumSelections, 5));
                    aVar.b = 1;
                    if (this.a.emit(num2, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a(LGxrN.UcgioQlKwij);
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(wwd0 wwd0Var, w2c w2cVar) {
            this.a = wwd0Var;
            this.b = w2cVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Integer> myhVar, v1b v1bVar) throws Throwable {
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
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsRepoImpl$getMinSelections$2", f = "CreatorCreditsRepoImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = w2c.this.new f(v1bVar);
            fVar.a = ((Number) obj).intValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((f) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            w2c.this.g.k(null, new Integer(i));
            return Unit.a;
        }
    }

    public w2c(h1c h1cVar, CCPDatabase cCPDatabase, lq1 lq1Var, k5b k5bVar) {
        this.a = h1cVar;
        this.b = cCPDatabase;
        this.c = lq1Var;
        this.d = k5bVar;
    }

    @Override // defpackage.x2c
    public final lyh<BaseResponse<RewardData>> a(String str) {
        return ozh.c(new or60(new a(str, null)), this.d);
    }

    @Override // defpackage.x2c
    public final lyh<Boolean> b() {
        return ozh.c(new g1i(new c(this.f, this), new d(null)), this.d);
    }

    @Override // defpackage.x2c
    public final lyh<Integer> c() {
        return ozh.c(new g1i(new e(this.g, this), new f(null)), this.d);
    }

    @Override // defpackage.x2c
    public final lyh<kqz<CreatorCreditHistoryEntity>> d(final String str, final boolean z) {
        str.getClass();
        Pair pair = new Pair(str, Boolean.valueOf(z));
        LinkedHashMap linkedHashMap = this.e;
        koz kozVar = (koz) linkedHashMap.get(pair);
        if (kozVar == null) {
            kozVar = new koz(new iqz(5, 0, false, 0, 0, 62), new o2c(str, z, this.b, this.a), new Function0() { // from class: v2c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.b.A().a(str, z);
                }
            });
            linkedHashMap.put(new Pair(str, Boolean.valueOf(z)), kozVar);
        }
        return ozh.c(kozVar.a, this.d);
    }

    @Override // defpackage.x2c
    public final lyh<kqz<CreatorCreditEntity>> e(final String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.h;
        koz kozVar = (koz) linkedHashMap.get(str);
        if (kozVar == null) {
            kozVar = new koz(new iqz(5, 0, false, 0, 0, 62), new s2c(str, this.b, this.a), new Function0() { // from class: u2c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.b.y().a(str);
                }
            });
            linkedHashMap.put(str, kozVar);
        }
        return ozh.c(kozVar.a, this.d);
    }

    @Override // defpackage.x2c
    public final lyh<BaseResponse<List<CreatorCredit>>> f(String str) {
        str.getClass();
        return ozh.c(new or60(new b(str, null)), this.d);
    }
}
