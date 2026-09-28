package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.survey.SurveyRepositoryImpl$fetchAndSaveAvailableSurveyIds$2", f = "SurveyRepositoryImpl.kt", l = {58, 60}, m = "invokeSuspend", v = 2)
public final class uie0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sie0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uie0(sie0 sie0Var, v1b<? super uie0> v1bVar) {
        super(2, v1bVar);
        this.b = sie0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uie0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uie0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r1.a.putString("survey_ids", r6, r5) == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            sie0 r4 = r5.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L4d
            goto L5e
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L1d:
            defpackage.uj50.b(r6)
            lie0 r6 = r4.a     // Catch: java.lang.Throwable -> L4d
            r5.a = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r6 = r6.b(r5)     // Catch: java.lang.Throwable -> L4d
            if (r6 != r0) goto L2b
            goto L4c
        L2b:
            com.sporty.android.common.network.data.BaseResponse r6 = (com.sporty.android.common.network.data.BaseResponse) r6     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r6 = defpackage.n52.b(r6)     // Catch: java.lang.Throwable -> L4d
            com.sporty.android.core.model.survey.AvailableSurveyIds r6 = (com.sporty.android.core.model.survey.AvailableSurveyIds) r6     // Catch: java.lang.Throwable -> L4d
            if (r6 != 0) goto L38
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L4d
            return r5
        L38:
            com.sporty.android.core.model.json.JsonSerializeService r1 = r4.d     // Catch: java.lang.Throwable -> L4d
            java.lang.String r6 = r1.toJson(r6)     // Catch: java.lang.Throwable -> L4d
            m2l r1 = r4.c     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "survey_ids"
            r5.a = r2     // Catch: java.lang.Throwable -> L4d
            zed r1 = r1.a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r1.putString(r3, r6, r5)     // Catch: java.lang.Throwable -> L4d
            if (r5 != r0) goto L5e
        L4c:
            return r0
        L4d:
            r5 = move-exception
            itf0$a r6 = defpackage.itf0.a
            java.lang.String r0 = "SB_Survey"
            java.lang.String r1 = "fetchAndSaveAvailableSurveyIds error: "
            java.lang.String r0 = defpackage.e40.a(r6, r0, r1, r5)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6.f(r5, r0, r1)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uie0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
