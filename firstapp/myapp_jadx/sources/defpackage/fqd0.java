package defpackage;

import com.sportygames.newcms.b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$downloadCmsData$4", f = "StackerViewModel.kt", l = {203, 204}, m = "invokeSuspend", v = 1)
public final class fqd0 extends tje0 implements gaj<myh<? super xxs<b>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ tqd0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqd0(tqd0 tqd0Var, v1b<? super fqd0> v1bVar) {
        super(3, v1bVar);
        this.c = tqd0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xxs<b>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        fqd0 fqd0Var = new fqd0(this.c, v1bVar);
        fqd0Var.b = th;
        return fqd0Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
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
            tqd0 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L1f
            if (r2 == r6) goto L1b
            if (r2 != r5) goto L15
            defpackage.uj50.b(r8)
            goto L3f
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1b:
            defpackage.uj50.b(r8)
            goto L32
        L1f:
            defpackage.uj50.b(r8)
            wwd0 r8 = r4.H
            qn5 r2 = defpackage.qn5.a
            r7.b = r0
            r7.a = r6
            r8.setValue(r2)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L32
            goto L3e
        L32:
            zzm r8 = r4.B
            r7.b = r3
            r7.a = r5
            kotlin.Unit r7 = r8.a(r0)
            if (r7 != r1) goto L3f
        L3e:
            return r1
        L3f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
