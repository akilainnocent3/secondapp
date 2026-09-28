package defpackage;

import androidx.recyclerview.widget.r;
import com.sportygames.newcms.b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$downloadCmsData$4", f = "BonusCupViewModel.kt", l = {249, r.d.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend", v = 1)
public final class wp4 extends tje0 implements gaj<myh<? super xxs<b>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ qq4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp4(qq4 qq4Var, v1b<? super wp4> v1bVar) {
        super(3, v1bVar);
        this.c = qq4Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xxs<b>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        wp4 wp4Var = new wp4(this.c, v1bVar);
        wp4Var.b = th;
        return wp4Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r8.a(r0) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Throwable r0 = r7.b
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            qq4 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L20
            if (r2 == r6) goto L1c
            if (r2 != r5) goto L15
            defpackage.uj50.b(r8)
            goto L40
        L15:
            r7 = 0
            java.lang.String r7 = com.sporty.android.permission.location.KN.qUnCRF.DpxiPWFIT
            defpackage.ib5.a(r7)
            return r3
        L1c:
            defpackage.uj50.b(r8)
            goto L33
        L20:
            defpackage.uj50.b(r8)
            wwd0 r8 = r4.H
            rn5 r2 = defpackage.rn5.a
            r7.b = r0
            r7.a = r6
            r8.setValue(r2)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L33
            goto L3f
        L33:
            a0n r8 = r4.y
            r7.b = r3
            r7.a = r5
            kotlin.Unit r7 = r8.a(r0)
            if (r7 != r1) goto L40
        L3f:
            return r1
        L40:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
