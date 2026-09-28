package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2562, 2564}, m = "invokeSuspend")
public final class f780 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<g7f, ij0> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xxo e;
    public final /* synthetic */ ytw<xxo> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f780(wd0<g7f, ij0> wd0Var, float f, boolean z, xxo xxoVar, ytw<xxo> ytwVar, v1b<? super f780> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = f;
        this.d = z;
        this.e = xxoVar;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f780(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f780) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r8.f(r7, r1) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (defpackage.hwf.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            xxo r2 = r7.e
            ytw<xxo> r3 = r7.f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1c
            if (r1 == r5) goto L18
            if (r1 != r4) goto L11
            goto L18
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L18:
            defpackage.uj50.b(r8)
            goto L56
        L1c:
            defpackage.uj50.b(r8)
            wd0<g7f, ij0> r8 = r7.b
            ytw r1 = r8.e
            x5a0 r1 = (defpackage.x5a0) r1
            java.lang.Object r1 = r1.getValue()
            g7f r1 = (defpackage.g7f) r1
            float r1 = r1.a
            float r6 = r7.c
            boolean r1 = defpackage.g7f.b(r1, r6)
            if (r1 != 0) goto L59
            boolean r1 = r7.d
            if (r1 != 0) goto L47
            g7f r1 = new g7f
            r1.<init>(r6)
            r7.a = r5
            java.lang.Object r7 = r8.f(r7, r1)
            if (r7 != r0) goto L56
            goto L55
        L47:
            java.lang.Object r1 = r3.getValue()
            xxo r1 = (defpackage.xxo) r1
            r7.a = r4
            java.lang.Object r7 = defpackage.hwf.a(r8, r6, r1, r2, r7)
            if (r7 != r0) goto L56
        L55:
            return r0
        L56:
            r3.setValue(r2)
        L59:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f780.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
