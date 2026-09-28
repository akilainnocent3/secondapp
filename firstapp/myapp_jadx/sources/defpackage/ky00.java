package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onReactionClick$1", f = "PiggyBashViewModel.kt", l = {537, 539, 540}, m = "invokeSuspend", v = 1)
public final class ky00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky00(vx00 vx00Var, String str, v1b<? super ky00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ky00(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ky00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r7.a(r4, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7.a(r4, r6) == r0) goto L24;
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
            r2 = 3
            r3 = 2
            r4 = 1
            vx00 r5 = r6.b
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            goto L19
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)
            goto L63
        L1d:
            defpackage.uj50.b(r7)
            goto L33
        L21:
            defpackage.uj50.b(r7)
            yzm r7 = r5.G
            pu00 r1 = defpackage.pu00.JOIN_ROOM_CARD_CLICK
            r6.a = r4
            java.lang.String r1 = "EmojiBarClick"
            kotlin.Unit r7 = r7.b(r1)
            if (r7 != r0) goto L33
            goto L62
        L33:
            wwd0 r7 = r5.N
            java.lang.Object r7 = r7.getValue()
            sx00 r7 = (defpackage.sx00) r7
            noj r1 = defpackage.noj.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.g(r7, r1)
            java.lang.String r4 = r6.c
            if (r1 == 0) goto L50
            mtm r7 = r5.z
            r6.a = r3
            java.lang.Object r6 = r7.a(r4, r6)
            if (r6 != r0) goto L63
            goto L62
        L50:
            g7v r1 = defpackage.g7v.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.g(r7, r1)
            if (r7 == 0) goto L63
            sum r7 = r5.y
            r6.a = r2
            java.lang.Object r6 = r7.a(r4, r6)
            if (r6 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
