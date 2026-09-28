package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$verify2FACodeForLoginFlow$1$1$1", f = "MFAViewModel.kt", l = {r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 257, 260, 266, 272}, m = "invokeSuspend", v = 2)
public final class cdu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ BaseResponse<Void> b;
    public final /* synthetic */ ocu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdu(BaseResponse<Void> baseResponse, ocu ocuVar, v1b<? super cdu> v1bVar) {
        super(2, v1bVar);
        this.b = baseResponse;
        this.c = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cdu(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cdu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7.y1(r9, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r7.y1(r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r7.y1(r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r7.y1(r1, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        return r0;
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
            int r1 = r8.a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1d
            if (r1 == r5) goto L1d
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            goto L1d
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L1d:
            defpackage.uj50.b(r9)
            goto L99
        L22:
            defpackage.uj50.b(r9)
            com.sporty.android.common.network.data.BaseResponse<java.lang.Void> r9 = r8.b
            boolean r1 = r9.isSuccessful()
            ocu r7 = r8.c
            if (r1 == 0) goto L56
            psm r9 = r7.e
            boolean r9 = r9.W()
            if (r9 == 0) goto L4b
            b390 r9 = r7.A
            u6h r1 = new u6h
            java.lang.String r2 = r7.H
            q7h r3 = defpackage.q7h.SEVEN_DAYS_LOGIN
            r1.<init>(r2, r3)
            r8.a = r6
            java.lang.Object r8 = r9.emit(r1, r8)
            if (r8 != r0) goto L99
            goto L98
        L4b:
            fcu r9 = defpackage.fcu.VERIFY_TWO_FA_CODE_SUCCESS
            r8.a = r5
            java.lang.Object r8 = r7.y1(r9, r8)
            if (r8 != r0) goto L99
            goto L98
        L56:
            int r1 = r9.bizCode
            r5 = 12404(0x3074, float:1.7382E-41)
            if (r1 != r5) goto L6f
            fcu r1 = defpackage.fcu.TWO_FA_CODE_IS_INCORRECT
            java.lang.String r9 = r9.message
            r9.getClass()
            r1.a(r9)
            r8.a = r4
            java.lang.Object r8 = r7.y1(r1, r8)
            if (r8 != r0) goto L99
            goto L98
        L6f:
            r4 = 12405(0x3075, float:1.7383E-41)
            if (r1 != r4) goto L86
            fcu r1 = defpackage.fcu.TWO_FA_RATE_LIMIT_EXCEEDED
            java.lang.String r9 = r9.message
            r9.getClass()
            r1.a(r9)
            r8.a = r3
            java.lang.Object r8 = r7.y1(r1, r8)
            if (r8 != r0) goto L99
            goto L98
        L86:
            fcu r1 = defpackage.fcu.CUSTOM_ERROR
            java.lang.String r9 = r9.message
            r9.getClass()
            r1.a(r9)
            r8.a = r2
            java.lang.Object r8 = r7.y1(r1, r8)
            if (r8 != r0) goto L99
        L98:
            return r0
        L99:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
