package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.CampaignSocketViewModel$handleTopicMessage$1", f = "CampaignSocketViewModel.kt", l = {251, 253}, m = "invokeSuspend", v = 1)
public final class c96 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ igg0 b;
    public final /* synthetic */ i96 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c96(igg0 igg0Var, i96 i96Var, String str, v1b<? super c96> v1bVar) {
        super(2, v1bVar);
        this.b = igg0Var;
        this.c = i96Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c96(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c96) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5.emit(com.sporty.android.core.model.tracking.AnalyticsEvent.BI_TRACKING_KIND_ERROR, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5.emit(r4.d, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L14:
            defpackage.uj50.b(r5)
            goto L3d
        L18:
            defpackage.uj50.b(r5)
            igg0 r5 = r4.b
            boolean r5 = r5.d
            i96 r1 = r4.c
            if (r5 == 0) goto L30
            b390 r5 = r1.J
            r4.a = r3
            java.lang.String r1 = "error"
            java.lang.Object r4 = r5.emit(r1, r4)
            if (r4 != r0) goto L3d
            goto L3c
        L30:
            b390 r5 = r1.J
            r4.a = r2
            java.lang.String r1 = r4.d
            java.lang.Object r4 = r5.emit(r1, r4)
            if (r4 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c96.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
