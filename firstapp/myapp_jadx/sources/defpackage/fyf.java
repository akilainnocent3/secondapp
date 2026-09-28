package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.notice.EmailChangeNoticeViewModel$navigateToOtpVerification$1", f = "EmailChangeNoticeViewModel.kt", l = {124, 122}, m = "invokeSuspend", v = 2)
public final class fyf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ku90 a;
    public int b;
    public final /* synthetic */ gyf c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyf(gyf gyfVar, String str, v1b<? super fyf> v1bVar) {
        super(2, v1bVar);
        this.c = gyfVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fyf(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fyf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r1.a.emit(r4, r7) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r8)
            goto L4e
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L17:
            ku90 r1 = r7.a
            defpackage.uj50.b(r8)
            goto L3a
        L1d:
            defpackage.uj50.b(r8)
            gyf r8 = r7.c
            ku90<wxf> r1 = r8.i
            a6k r8 = r8.a
            r7.a = r1
            r7.b = r4
            odd r4 = r8.c
            z5k r5 = new z5k
            java.lang.String r6 = r7.d
            r5.<init>(r8, r6, r2)
            java.lang.Object r8 = defpackage.ej5.d(r4, r5, r7)
            if (r8 != r0) goto L3a
            goto L4d
        L3a:
            com.sporty.android.platform.features.newotp.util.OtpModule r8 = (com.sporty.android.platform.features.newotp.util.OtpModule) r8
            wxf$b r4 = new wxf$b
            r4.<init>(r8)
            r7.a = r2
            r7.b = r3
            b390 r8 = r1.a
            java.lang.Object r7 = r8.emit(r4, r7)
            if (r7 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
