package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$bet$1", f = "TheGoldmineViewModel.kt", l = {579, 580, 586, 587}, m = "invokeSuspend", v = 1)
public final class bof0 extends tje0 implements Function2<mk50<? extends mue0.c>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aof0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bof0(aof0 aof0Var, v1b<? super bof0> v1bVar) {
        super(2, v1bVar);
        this.c = aof0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bof0 bof0Var = new bof0(this.c, v1bVar);
        bof0Var.b = obj;
        return bof0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(mk50<? extends mue0.c> mk50Var, v1b<? super Unit> v1bVar) {
        return ((bof0) create(mk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (kotlin.Unit.a == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        if (r11 == r4) goto L35;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            aof0 r0 = r11.c
            wwd0 r1 = r0.I
            wwd0 r2 = r0.y
            java.lang.Object r3 = r11.b
            mk50 r3 = (defpackage.mk50) r3
            y5b r4 = defpackage.y5b.a
            int r5 = r11.a
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L34
            if (r5 == r10) goto L30
            if (r5 == r9) goto L2c
            if (r5 == r8) goto L28
            if (r5 != r7) goto L22
            defpackage.uj50.b(r12)
            goto L9a
        L22:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r6
        L28:
            defpackage.uj50.b(r12)
            goto L7b
        L2c:
            defpackage.uj50.b(r12)
            goto L57
        L30:
            defpackage.uj50.b(r12)
            goto L49
        L34:
            defpackage.uj50.b(r12)
            boolean r12 = r3 instanceof mk50.a
            if (r12 == 0) goto L5f
            wwe0$b r12 = wwe0.b.a
            r11.b = r3
            r11.a = r10
            r2.setValue(r12)
            kotlin.Unit r12 = kotlin.Unit.a
            if (r12 != r4) goto L49
            goto L95
        L49:
            mue0$a r12 = mue0.a.a
            r11.b = r3
            r11.a = r9
            r1.setValue(r12)
            kotlin.Unit r11 = kotlin.Unit.a
            if (r11 != r4) goto L57
            goto L95
        L57:
            mk50$a r3 = (mk50.a) r3
            java.lang.Throwable r11 = r3.a
            r0.A1(r11)
            goto L9a
        L5f:
            mk50$b r12 = mk50.b.a
            boolean r12 = kotlin.jvm.internal.Intrinsics.g(r3, r12)
            if (r12 != 0) goto L9a
            boolean r12 = r3 instanceof mk50.c
            if (r12 == 0) goto L96
            mk50$c r3 = (mk50.c) r3
            T r12 = r3.a
            r11.b = r6
            r11.a = r8
            r1.setValue(r12)
            kotlin.Unit r12 = kotlin.Unit.a
            if (r12 != r4) goto L7b
            goto L95
        L7b:
            r11.b = r6
            r11.a = r7
            java.lang.Object r11 = r2.getValue()
            wwe0 r11 = (defpackage.wwe0) r11
            boolean r11 = r11 instanceof wwe0.a
            if (r11 == 0) goto L91
            wwe0$d r11 = wwe0.d.a
            r2.setValue(r11)
            kotlin.Unit r11 = kotlin.Unit.a
            goto L93
        L91:
            kotlin.Unit r11 = kotlin.Unit.a
        L93:
            if (r11 != r4) goto L9a
        L95:
            return r4
        L96:
            defpackage.uhc.a()
            return r6
        L9a:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bof0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
