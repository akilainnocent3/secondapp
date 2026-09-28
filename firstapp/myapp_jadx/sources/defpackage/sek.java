package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetStreakRewardStatusUseCase$invoke$1", f = "GetStreakRewardStatusUseCase.kt", l = {22, 24, 43}, m = "invokeSuspend", v = 2)
public final class sek extends tje0 implements Function2<myh<? super lk50<? extends o34>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uek c;

    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetStreakRewardStatusUseCase$invoke$1$result$1", f = "GetStreakRewardStatusUseCase.kt", l = {28, 29}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends o34>>, Object> {
        public pjd a;
        public lk50 b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ uek e;

        /* JADX INFO: renamed from: sek$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetStreakRewardStatusUseCase$invoke$1$result$1$displayConfigDeferred$1", f = "GetStreakRewardStatusUseCase.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
        public static final class C1092a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends h44>>, Object> {
            public int a;
            public final /* synthetic */ uek b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1092a(uek uekVar, v1b<? super C1092a> v1bVar) {
                super(2, v1bVar);
                this.b = uekVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1092a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends h44>> v1bVar) {
                return ((C1092a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
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
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objG = c34Var.g(this);
                return objG == y5bVar ? y5bVar : objG;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetStreakRewardStatusUseCase$invoke$1$result$1$metricDeferred$1", f = "GetStreakRewardStatusUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super lk50<? extends a24>>, Object> {
            public int a;
            public final /* synthetic */ uek b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(uek uekVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = uekVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends a24>> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
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
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objC = c34Var.c(this);
                return objC == y5bVar ? y5bVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uek uekVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = uekVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.e, v1bVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends o34>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0095  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            pjd pjdVarA;
            lk50 lk50Var;
            lk50 lk50Var2;
            Pair pair;
            v5b v5bVar = (v5b) this.d;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                uek uekVar = this.e;
                pjd pjdVarA2 = ej5.a(v5bVar, null, new C1092a(uekVar, null), 3);
                pjdVarA = ej5.a(v5bVar, null, new b(uekVar, null), 3);
                this.d = null;
                this.a = pjdVarA;
                this.c = 1;
                obj = pjdVarA2.q(this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                pjdVarA = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lk50Var = this.b;
                uj50.b(obj);
            }
            lk50Var2 = (lk50) obj;
            if (!(lk50Var instanceof lk50.c) && (lk50Var2 instanceof lk50.c)) {
                double d = ((a24) ((lk50.c) lk50Var2).a).d;
                return new lk50.c(new o34(d, ycv.a((d - 1.0d) * 100.0d), ((h44) ((lk50.c) lk50Var).a).b));
            }
            if (lk50Var instanceof lk50.a) {
                lk50.a aVar = (lk50.a) lk50Var;
                pair = new Pair(aVar.a, aVar.b);
            } else if (lk50Var2 instanceof lk50.a) {
                lk50.a aVar2 = (lk50.a) lk50Var2;
                pair = new Pair(aVar2.a, aVar2.b);
            } else {
                pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
            }
            return new lk50.a((Throwable) pair.a, (UiText) pair.b);
            lk50 lk50Var3 = (lk50) obj;
            this.d = null;
            this.a = null;
            this.b = lk50Var3;
            this.c = 2;
            Object objAwait = pjdVarA.await(this);
            if (objAwait != y5bVar) {
                obj = objAwait;
                lk50Var = lk50Var3;
                lk50Var2 = (lk50) obj;
                if (!(lk50Var instanceof lk50.c)) {
                }
                if (lk50Var instanceof lk50.a) {
                    lk50.a aVar3 = (lk50.a) lk50Var;
                    pair = new Pair(aVar3.a, aVar3.b);
                } else if (lk50Var2 instanceof lk50.a) {
                    lk50.a aVar4 = (lk50.a) lk50Var2;
                    pair = new Pair(aVar4.a, aVar4.b);
                } else {
                    pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                }
                return new lk50.a((Throwable) pair.a, (UiText) pair.b);
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sek(uek uekVar, v1b<? super sek> v1bVar) {
        super(2, v1bVar);
        this.c = uekVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sek sekVar = new sek(this.c, v1bVar);
        sekVar.b = obj;
        return sekVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends o34>> myhVar, v1b<? super Unit> v1bVar) {
        return ((sek) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0.emit((defpackage.lk50) r8, r7) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            defpackage.uj50.b(r8)
            goto L55
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1e:
            defpackage.uj50.b(r8)
            goto L48
        L22:
            defpackage.uj50.b(r8)
            goto L36
        L26:
            defpackage.uj50.b(r8)
            lk50$b r8 = lk50.b.a
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L36
            goto L54
        L36:
            sek$a r8 = new sek$a
            uek r2 = r7.c
            r8.<init>(r2, r6)
            r7.b = r0
            r7.a = r4
            java.lang.Object r8 = defpackage.w5b.d(r8, r7)
            if (r8 != r1) goto L48
            goto L54
        L48:
            lk50 r8 = (defpackage.lk50) r8
            r7.b = r6
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
