package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$observeUserRanking$1", f = "LeaderboardViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class h2s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2s b;

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$observeUserRanking$1$1", f = "LeaderboardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<f1s, AccountInfo, v1b<? super Pair<? extends f1s, ? extends AccountInfo>>, Object> {
        public /* synthetic */ f1s a;
        public /* synthetic */ AccountInfo b;

        @Override // defpackage.gaj
        public final Object invoke(f1s f1sVar, AccountInfo accountInfo, v1b<? super Pair<? extends f1s, ? extends AccountInfo>> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = f1sVar;
            aVar.b = accountInfo;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            f1s f1sVar = this.a;
            AccountInfo accountInfo = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(f1sVar, accountInfo);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ f2s a;
        public final /* synthetic */ yp40 b;

        @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModel$observeUserRanking$1$2", f = "LeaderboardViewModel.kt", l = {146, 164}, m = "emit", v = 2)
        public static final class a extends x1b {
            public wwd0 a;
            public /* synthetic */ Object b;
            public final /* synthetic */ b<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.c = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public b(f2s f2sVar, yp40 yp40Var) {
            this.a = f2sVar;
            this.b = yp40Var;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (r14 == r2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r14 == r2) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlin.Pair<defpackage.f1s, com.sporty.android.core.model.account.AccountInfo> r13, defpackage.v1b<? super kotlin.Unit> r14) {
            /*
                r12 = this;
                f2s r0 = r12.a
                wwd0 r1 = r0.A
                boolean r2 = r14 instanceof h2s.b.a
                if (r2 == 0) goto L18
                r2 = r14
                h2s$b$a r2 = (h2s.b.a) r2
                int r3 = r2.d
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L18
                int r3 = r3 - r4
                r2.d = r3
            L16:
                r10 = r2
                goto L1e
            L18:
                h2s$b$a r2 = new h2s$b$a
                r2.<init>(r12, r14)
                goto L16
            L1e:
                java.lang.Object r14 = r10.b
                y5b r2 = defpackage.y5b.a
                int r3 = r10.d
                r4 = 2
                r11 = 1
                if (r3 == 0) goto L3f
                if (r3 == r11) goto L39
                if (r3 != r4) goto L32
                wwd0 r1 = r10.a
                defpackage.uj50.b(r14)
                goto L93
            L32:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                r12 = 0
                return r12
            L39:
                wwd0 r1 = r10.a
                defpackage.uj50.b(r14)
                goto L67
            L3f:
                defpackage.uj50.b(r14)
                A r14 = r13.a
                f1s r14 = (defpackage.f1s) r14
                B r13 = r13.b
                r5 = r13
                com.sporty.android.core.model.account.AccountInfo r5 = (com.sporty.android.core.model.account.AccountInfo) r5
                if (r14 == 0) goto L80
                java.lang.Integer r13 = r14.b
                r0.C = r13
                b2s r3 = r0.b
                boolean r6 = r0.i
                int r7 = r0.y
                int r8 = r0.w
                com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType r9 = r0.z
                r10.a = r1
                r10.d = r11
                r4 = r14
                java.lang.Object r14 = r3.e(r4, r5, r6, r7, r8, r9, r10)
                if (r14 != r2) goto L67
                goto L92
            L67:
                r1.setValue(r14)
                yp40 r12 = r12.b
                boolean r13 = r12.a
                if (r13 != 0) goto L96
                rdd0 r13 = r0.c
                i37$l r14 = i37.l.a
                k00 r0 = defpackage.k00.d
                k00[] r0 = new defpackage.k00[]{r0}
                r13.a(r14, r0)
                r12.a = r11
                goto L96
            L80:
                if (r5 == 0) goto L96
                b2s r12 = r0.b
                int r13 = r0.y
                com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType r14 = r0.z
                r10.a = r1
                r10.d = r4
                java.lang.Object r14 = r12.c(r5, r13, r14, r10)
                if (r14 != r2) goto L93
            L92:
                return r2
            L93:
                r1.setValue(r14)
            L96:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: h2s.b.emit(kotlin.Pair, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2s(f2s f2sVar, v1b<? super h2s> v1bVar) {
        super(2, v1bVar);
        this.b = f2sVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h2s(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h2s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yp40 yp40Var = new yp40();
            f2s f2sVar = this.b;
            v340 v340VarE = f2sVar.a.e();
            lyh<AccountInfo> accountInfoFlow = f2sVar.d.getAccountInfoFlow();
            a aVar = new a(3, null);
            b bVar = new b(f2sVar, yp40Var);
            this.a = 1;
            Object objA = r78.a(this, bVar, new o1i(aVar, null), q1i.a, new lyh[]{v340VarE, accountInfoFlow});
            if (objA != obj2) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
