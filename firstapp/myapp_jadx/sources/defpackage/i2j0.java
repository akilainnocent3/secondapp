package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.debugscreen.impl.welcomereward.WelcomeRewardDebugViewModel$resetAll$1", f = "WelcomeRewardDebugViewModel.kt", l = {63, WebSocketProtocol.B0_FLAG_RSV1, 65}, m = "invokeSuspend", v = 2)
public final class i2j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h2j0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2j0(h2j0 h2j0Var, v1b<? super i2j0> v1bVar) {
        super(2, v1bVar);
        this.b = h2j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i2j0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i2j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r12.a(r11) == r2) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h2j0 r0 = r11.b
            w1j0 r1 = r0.a
            y5b r2 = defpackage.y5b.a
            int r3 = r11.a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L26
            if (r3 == r7) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L18
            defpackage.uj50.b(r12)
            goto L56
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r4
        L1e:
            defpackage.uj50.b(r12)
            goto L43
        L22:
            defpackage.uj50.b(r12)
            goto L36
        L26:
            defpackage.uj50.b(r12)
            wm20 r12 = r1.b()
            r11.a = r7
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r2) goto L36
            goto L55
        L36:
            wm20 r12 = r1.a()
            r11.a = r6
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r2) goto L43
            goto L55
        L43:
            rkd r12 = r1.d
            ohp<java.lang.Object>[] r3 = defpackage.w1j0.i
            r3 = r3[r6]
            wm20 r12 = r12.a(r1, r3)
            r11.a = r5
            java.lang.Object r11 = r12.a(r11)
            if (r11 != r2) goto L56
        L55:
            return r2
        L56:
            wwd0 r11 = r0.c
            com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig r5 = new com.sporty.android.core.model.welcomereward.WelcomeRewardTimingConfig
            r9 = 7
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.getClass()
            r11.k(r4, r5)
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
