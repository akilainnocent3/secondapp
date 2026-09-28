package defpackage;

import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$showRainUpcomingToastV2$1", f = "CrashFragment.kt", l = {7720, 7734}, m = "invokeSuspend", v = 1)
public final class fhb extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ RainTopicResponse b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhb(RainTopicResponse rainTopicResponse, String str, fgb fgbVar, v1b<? super fhb> v1bVar) {
        super(1, v1bVar);
        this.b = rainTopicResponse;
        this.c = str;
        this.d = fgbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new fhb(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((fhb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (defpackage.hkd.b(4000, r20) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            y5b r1 = defpackage.y5b.a
            int r2 = r0.a
            fgb r3 = r0.d
            com.sportygames.sportyherov2.remote.models.RainTopicResponse r4 = r0.b
            r5 = 2
            r6 = 1
            r7 = 4000(0xfa0, double:1.9763E-320)
            if (r2 == 0) goto L23
            if (r2 == r6) goto L1f
            if (r2 != r5) goto L18
            defpackage.uj50.b(r21)
            goto L76
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L1f:
            defpackage.uj50.b(r21)
            goto L31
        L23:
            defpackage.uj50.b(r21)
            r0.a = r6
            r9 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r2 = defpackage.hkd.b(r9, r0)
            if (r2 != r1) goto L31
            goto L75
        L31:
            ssw<com.sportygames.commons.models.RainToastData> r2 = defpackage.qv30.b
            com.sportygames.commons.models.RainToastData r9 = new com.sportygames.commons.models.RainToastData
            java.lang.Integer r10 = r4.getId()
            tv30[] r6 = defpackage.tv30.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r7)
            java.lang.Integer r15 = new java.lang.Integer
            r6 = 0
            r15.<init>(r6)
            r18 = 128(0x80, float:1.8E-43)
            r19 = 0
            java.lang.String r11 = "upcoming"
            java.lang.String r12 = r0.c
            java.lang.String r13 = ""
            r16 = 0
            r17 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.j(r9)
            ytw<ob30> r2 = r3.c1
            ob30$c r6 = new ob30$c
            rv30$c r9 = new rv30$c
            java.lang.String r10 = r0.c
            r9.<init>(r10)
            r6.<init>(r9)
            x5a0 r2 = (defpackage.x5a0) r2
            r2.setValue(r6)
            r0.a = r5
            java.lang.Object r0 = defpackage.hkd.b(r7, r0)
            if (r0 != r1) goto L76
        L75:
            return r1
        L76:
            r3.s1()
            ssw<com.sportygames.commons.models.RainToastData> r0 = defpackage.qv30.b
            com.sportygames.commons.models.RainToastData r9 = new com.sportygames.commons.models.RainToastData
            java.lang.Integer r10 = r4.getId()
            tv30[] r1 = defpackage.tv30.a
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r7)
            java.lang.Integer r15 = new java.lang.Integer
            r1 = 8
            r15.<init>(r1)
            r18 = 128(0x80, float:1.8E-43)
            r19 = 0
            java.lang.String r11 = "upcoming"
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            r16 = 0
            r17 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.j(r9)
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
