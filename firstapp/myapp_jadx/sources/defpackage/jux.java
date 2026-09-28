package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.nightnday.presentation.NightNDayViewModel$fetch$2", f = "NightNDayViewModel.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
public final class jux extends tje0 implements Function2<myh<? super d9x>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ gux b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jux(gux guxVar, v1b<? super jux> v1bVar) {
        super(2, v1bVar);
        this.b = guxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jux(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super d9x> myhVar, v1b<? super Unit> v1bVar) {
        return ((jux) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (kotlin.Unit.a == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            gux r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            defpackage.uj50.b(r7)
            goto L42
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L31
        L1d:
            defpackage.uj50.b(r7)
            wwd0 r7 = r3.A
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.a = r5
            r7.getClass()
            r7.k(r2, r1)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L31
            goto L41
        L31:
            wwd0 r7 = r3.M
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.a = r4
            r7.getClass()
            r7.k(r2, r1)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r0) goto L42
        L41:
            return r0
        L42:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jux.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
