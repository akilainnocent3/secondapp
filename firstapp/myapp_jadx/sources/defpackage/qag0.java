package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.campaign.data.model.TournamentRankResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentKt$Tournament$24$1", f = "Tournament.kt", l = {1673}, m = "invokeSuspend", v = 1)
public final class qag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i96 c;
    public final /* synthetic */ m6a0<Long, Integer> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ v5b a;
        public final /* synthetic */ m6a0<Long, Integer> b;

        public a(v5b v5bVar, m6a0<Long, Integer> m6a0Var) {
            this.a = v5bVar;
            this.b = m6a0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object bVar;
            Integer rank;
            Pair pair = (Pair) obj;
            long jLongValue = ((Number) pair.a).longValue();
            String str = (String) pair.b;
            if (jLongValue == 0 || StringsKt.U(str) || Intrinsics.g(str, AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                return Unit.a;
            }
            try {
                zi50.a aVar = zi50.b;
                TournamentRankResponse tournamentRankResponse = (TournamentRankResponse) new eal().e(str, TournamentRankResponse.class);
                bVar = new Integer((tournamentRankResponse == null || (rank = tournamentRankResponse.getRank()) == null) ? 0 : rank.intValue());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object num = new Integer(0);
            if (bVar instanceof zi50.b) {
                bVar = num;
            }
            int iIntValue = ((Number) bVar).intValue();
            if (iIntValue > 0) {
                this.b.put(new Long(jLongValue), new Integer(iIntValue));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qag0(i96 i96Var, m6a0<Long, Integer> m6a0Var, v1b<? super qag0> v1bVar) {
        super(2, v1bVar);
        this.c = i96Var;
        this.d = m6a0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qag0 qag0Var = new qag0(this.c, this.d, v1bVar);
        qag0Var.b = obj;
        return qag0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((qag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to qag0 for r6v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            v5b r0 = (defpackage.v5b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r6.a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 == r4) goto L14
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r3
        L14:
            defpackage.uj50.b(r7)
            goto L33
        L18:
            defpackage.uj50.b(r7)
            i96 r7 = r6.c
            t340 r7 = r7.M
            qag0$a r2 = new qag0$a
            m6a0<java.lang.Long, java.lang.Integer> r5 = r6.d
            r2.<init>(r0, r5)
            r6.b = r3
            r6.a = r4
            a390<T> r7 = r7.a
            java.lang.Object r6 = r7.collect(r2, r6)
            if (r6 != r1) goto L33
            return r1
        L33:
            defpackage.fkd.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qag0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
