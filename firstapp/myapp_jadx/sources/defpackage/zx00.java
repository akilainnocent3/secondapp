package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$handleSidePanelEvent$2", f = "PiggyBashViewModel.kt", l = {509, 511}, m = "invokeSuspend", v = 1)
public final class zx00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ uw00 b;
    public final /* synthetic */ vx00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx00(v1b v1bVar, uw00 uw00Var, vx00 vx00Var) {
        super(2, v1bVar);
        this.b = uw00Var;
        this.c = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zx00(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zx00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (kotlin.Unit.a == r0) goto L17;
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
            vx00 r2 = r6.c
            uw00 r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L4a
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L3a
        L1f:
            defpackage.uj50.b(r7)
            r7 = r3
            uw00$b r7 = (uw00.b) r7
            lx00 r7 = r7.a
            boolean r7 = r7 instanceof lx00.a
            if (r7 == 0) goto L3a
            yzm r7 = r2.G
            pu00 r1 = defpackage.pu00.JOIN_ROOM_CARD_CLICK
            r6.a = r5
            java.lang.String r1 = "BetHistoryClick"
            kotlin.Unit r7 = r7.b(r1)
            if (r7 != r0) goto L3a
            goto L49
        L3a:
            wwd0 r7 = r2.P
            uw00$b r3 = (uw00.b) r3
            lx00 r1 = r3.a
            r6.a = r4
            r7.setValue(r1)
            kotlin.Unit r6 = kotlin.Unit.a
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
