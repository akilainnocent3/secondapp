package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.jumpbank.JumpBankViewModel$onShouldOverrideUrlLoading$1", f = "JumpBankViewModel.kt", l = {53, 55}, m = "invokeSuspend", v = 2)
public final class mgp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ogp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgp(ogp ogpVar, v1b<? super mgp> v1bVar) {
        super(2, v1bVar);
        this.b = ogpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mgp(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mgp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r6.a.emit(r1, r5) == r0) goto L15;
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
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.uj50.b(r6)
            goto L3a
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L17:
            defpackage.uj50.b(r6)
            goto L29
        L1b:
            defpackage.uj50.b(r6)
            r5.a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = defpackage.hkd.b(r3, r5)
            if (r6 != r0) goto L29
            goto L39
        L29:
            ogp r6 = r5.b
            ku90<jgp> r6 = r6.d
            jgp$a r1 = jgp.a.a
            r5.a = r2
            b390 r6 = r6.a
            java.lang.Object r5 = r6.emit(r1, r5)
            if (r5 != r0) goto L3a
        L39:
            return r0
        L3a:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
