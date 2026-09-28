package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.presentation.WorldCupPassViewModel$loadStatus$1", f = "WorldCupPassViewModel.kt", l = {104, 105}, m = "invokeSuspend", v = 2)
public final class z3k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ y3k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3k0(y3k0 y3k0Var, v1b<? super z3k0> v1bVar) {
        super(2, v1bVar);
        this.b = y3k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z3k0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z3k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r1.x1(r2, r18) == r3) goto L21;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            y3k0 r1 = r0.b
            wwd0 r2 = r1.i
            y5b r3 = defpackage.y5b.a
            int r4 = r0.a
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L24
            if (r4 == r7) goto L1e
            if (r4 != r6) goto L18
            defpackage.uj50.b(r19)
            goto La5
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r5
        L1e:
            defpackage.uj50.b(r19)
            r4 = r19
            goto L5b
        L24:
            defpackage.uj50.b(r19)
            java.lang.Object r4 = r2.getValue()
            w3k0 r4 = (defpackage.w3k0) r4
            w3k0$a r4 = r4.a
            boolean r4 = r4 instanceof w3k0.a.c
            if (r4 != 0) goto L50
        L33:
            java.lang.Object r4 = r2.getValue()
            r8 = r4
            w3k0 r8 = (defpackage.w3k0) r8
            w3k0$a$b r9 = w3k0.a.b.a
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            w3k0 r8 = defpackage.w3k0.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r2.g(r4, r8)
            if (r4 == 0) goto L33
        L50:
            b3k0 r4 = r1.a
            r0.a = r7
            java.lang.Object r4 = r4.b(r0)
            if (r4 != r3) goto L5b
            goto L6f
        L5b:
            lk50 r4 = (defpackage.lk50) r4
            boolean r7 = r4 instanceof lk50.c
            if (r7 == 0) goto L70
            lk50$c r4 = (lk50.c) r4
            T r2 = r4.a
            r3k0 r2 = (defpackage.r3k0) r2
            r0.a = r6
            java.lang.Object r0 = r1.x1(r2, r0)
            if (r0 != r3) goto La5
        L6f:
            return r3
        L70:
            boolean r0 = r4 instanceof lk50.a
            if (r0 == 0) goto La1
            com.sporty.android.common.network.data.SprThrowable r0 = defpackage.bm50.h(r4)
            if (r0 == 0) goto L7f
            com.sporty.android.common_ui.uitext.UiText r0 = r0.b()
            goto L81
        L7f:
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = defpackage.vch0.b
        L81:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            w3k0 r3 = (defpackage.w3k0) r3
            w3k0$a$a r4 = new w3k0$a$a
            r4.<init>(r0)
            r11 = 0
            r12 = 254(0xfe, float:3.56E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            w3k0 r3 = defpackage.w3k0.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r2.g(r1, r3)
            if (r1 == 0) goto L81
            goto La5
        La1:
            boolean r0 = r4 instanceof lk50.b
            if (r0 == 0) goto La8
        La5:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        La8:
            defpackage.uhc.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
