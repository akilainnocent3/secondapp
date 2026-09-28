package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$checkBiometricLoginTokenExistence$1", f = "MFAViewModel.kt", l = {314, 313, 318, 320}, m = "invokeSuspend", v = 2)
public final class pcu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public m2l a;
    public int b;
    public final /* synthetic */ ocu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcu(ocu ocuVar, v1b<? super pcu> v1bVar) {
        super(2, v1bVar);
        this.c = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pcu(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pcu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1.a.emit(r9, r8) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r1.a.emit(r9, r8) == r0) goto L27;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.b
            ocu r2 = r8.c
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L2e
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            goto L1c
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L1c:
            m2l r8 = r8.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.uj50.b(r9)
            goto L80
        L24:
            defpackage.uj50.b(r9)
            goto L55
        L28:
            m2l r1 = r8.a
            defpackage.uj50.b(r9)
            goto L40
        L2e:
            defpackage.uj50.b(r9)
            m2l r1 = r2.d
            mgb0 r9 = r2.c
            r8.a = r1
            r8.b = r6
            java.lang.Object r9 = r9.getLastAccount(r8)
            if (r9 != r0) goto L40
            goto L7f
        L40:
            java.lang.String r6 = "biometric_token_"
            java.lang.String r9 = defpackage.wga.a(r9, r6)
            r8.a = r7
            r8.b = r5
            zed r1 = r1.a
            java.lang.String r5 = ""
            java.lang.Object r9 = r1.getString(r9, r5, r8)
            if (r9 != r0) goto L55
            goto L7f
        L55:
            java.lang.String r9 = (java.lang.String) r9
            int r9 = r9.length()
            ku90<u9w> r1 = r2.E
            if (r9 <= 0) goto L71
            q9w r9 = new q9w
            r9.<init>()
            r8.a = r7
            r8.b = r4
            b390 r1 = r1.a
            java.lang.Object r8 = r1.emit(r9, r8)
            if (r8 != r0) goto L80
            goto L7f
        L71:
            p9w r9 = defpackage.p9w.a
            r8.a = r7
            r8.b = r3
            b390 r1 = r1.a
            java.lang.Object r8 = r1.emit(r9, r8)
            if (r8 != r0) goto L80
        L7f:
            return r0
        L80:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
