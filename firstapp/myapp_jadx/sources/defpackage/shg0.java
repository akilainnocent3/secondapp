package defpackage;

import com.sportygames.newcms.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.viewmodel.TournamentViewModel$downloadCmsData$3", f = "TournamentViewModel.kt", l = {122, 123}, m = "invokeSuspend", v = 1)
public final class shg0 extends tje0 implements Function2<b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aig0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shg0(aig0 aig0Var, v1b<? super shg0> v1bVar) {
        super(2, v1bVar);
        this.c = aig0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        shg0 shg0Var = new shg0(this.c, v1bVar);
        shg0Var.b = obj;
        return shg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b bVar, v1b<? super Unit> v1bVar) {
        return ((shg0) create(bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (kotlin.Unit.a == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            com.sportygames.newcms.b r0 = (com.sportygames.newcms.b) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 0
            aig0 r4 = r7.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r8)
            goto L42
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r3
        L1d:
            defpackage.uj50.b(r8)
            goto L32
        L21:
            defpackage.uj50.b(r8)
            wwd0 r8 = r4.w
            r7.b = r0
            r7.a = r6
            r8.setValue(r0)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r1) goto L32
            goto L41
        L32:
            x5g0 r8 = r4.b
            r7.b = r3
            r7.a = r5
            wwd0 r7 = r8.a
            r7.setValue(r0)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L42
        L41:
            return r1
        L42:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
