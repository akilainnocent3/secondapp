package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.loyalty.LoyaltyUseCase$updateLoyaltyAggregateData$2", f = "LoyaltyUseCase.kt", l = {161, 163}, m = "invokeSuspend", v = 2)
public final class s2u extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public u2u a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u2u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2u(v1b v1bVar, u2u u2uVar) {
        super(2, v1bVar);
        this.d = u2uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s2u s2uVar = new s2u(v1bVar, this.d);
        s2uVar.c = obj;
        return s2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((s2u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r1.a.putString("key_loyalty_unread", r6, r5) == r0) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            v5b r0 = (defpackage.v5b) r0
            y5b r0 = defpackage.y5b.a
            int r1 = r5.b
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            u2u r5 = r5.a
            v5b r5 = (defpackage.v5b) r5
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L61
            goto L5c
        L19:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r4
        L1f:
            u2u r1 = r5.a
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L61
            goto L3b
        L25:
            defpackage.uj50.b(r6)
            u2u r1 = r5.d
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L61
            h530 r6 = r1.b     // Catch: java.lang.Throwable -> L61
            r5.c = r4     // Catch: java.lang.Throwable -> L61
            r5.a = r1     // Catch: java.lang.Throwable -> L61
            r5.b = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = r6.u(r5)     // Catch: java.lang.Throwable -> L61
            if (r6 != r0) goto L3b
            goto L5b
        L3b:
            com.sporty.android.common.network.data.BaseResponse r6 = (com.sporty.android.common.network.data.BaseResponse) r6     // Catch: java.lang.Throwable -> L61
            java.lang.Object r6 = defpackage.n52.b(r6)     // Catch: java.lang.Throwable -> L61
            com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData r6 = (com.sporty.android.core.model.loyalty.LoyaltyAggregateHintData) r6     // Catch: java.lang.Throwable -> L61
            com.sporty.android.core.model.json.JsonSerializeService r3 = r1.k     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = r3.toJson(r6)     // Catch: java.lang.Throwable -> L61
            m2l r1 = r1.c     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "key_loyalty_unread"
            r5.c = r4     // Catch: java.lang.Throwable -> L61
            r5.a = r4     // Catch: java.lang.Throwable -> L61
            r5.b = r2     // Catch: java.lang.Throwable -> L61
            zed r1 = r1.a     // Catch: java.lang.Throwable -> L61
            java.lang.Object r5 = r1.putString(r3, r6, r5)     // Catch: java.lang.Throwable -> L61
            if (r5 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L61
            zi50$a r6 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L61
            goto L6a
        L61:
            r5 = move-exception
            zi50$a r6 = defpackage.zi50.b
            zi50$b r6 = new zi50$b
            r6.<init>(r5)
            r5 = r6
        L6a:
            zi50 r6 = new zi50
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
