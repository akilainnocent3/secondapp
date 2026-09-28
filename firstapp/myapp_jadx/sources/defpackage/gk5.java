package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {998, 1007}, m = "invokeSuspend")
public final class gk5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<g7f, ij0> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hk5 e;
    public final /* synthetic */ xxo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk5(wd0<g7f, ij0> wd0Var, float f, boolean z, hk5 hk5Var, xxo xxoVar, v1b<? super gk5> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = f;
        this.d = z;
        this.e = hk5Var;
        this.f = xxoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gk5(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gk5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r9.f(r8, r1) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (defpackage.hwf.a(r9, r5, r2, r8.f, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r8.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L14:
            defpackage.uj50.b(r9)
            goto L84
        L18:
            defpackage.uj50.b(r9)
            wd0<g7f, ij0> r9 = r8.b
            ytw r1 = r9.e
            x5a0 r1 = (defpackage.x5a0) r1
            java.lang.Object r1 = r1.getValue()
            g7f r1 = (defpackage.g7f) r1
            float r1 = r1.a
            float r5 = r8.c
            boolean r1 = defpackage.g7f.b(r1, r5)
            if (r1 != 0) goto L84
            boolean r1 = r8.d
            if (r1 != 0) goto L43
            g7f r1 = new g7f
            r1.<init>(r5)
            r8.a = r4
            java.lang.Object r8 = r9.f(r8, r1)
            if (r8 != r0) goto L84
            goto L83
        L43:
            ytw r1 = r9.e
            x5a0 r1 = (defpackage.x5a0) r1
            java.lang.Object r1 = r1.getValue()
            g7f r1 = (defpackage.g7f) r1
            float r1 = r1.a
            r4 = 0
            boolean r6 = defpackage.g7f.b(r1, r4)
            if (r6 == 0) goto L5e
            mp20$b r2 = new mp20$b
            r6 = 0
            r2.<init>(r6)
            goto L79
        L5e:
            hk5 r6 = r8.e
            float r6 = r6.b
            boolean r6 = defpackage.g7f.b(r1, r6)
            if (r6 == 0) goto L6e
            vkm r2 = new vkm
            r2.<init>()
            goto L79
        L6e:
            boolean r1 = defpackage.g7f.b(r1, r4)
            if (r1 == 0) goto L79
            c4i r2 = new c4i
            r2.<init>()
        L79:
            r8.a = r3
            xxo r1 = r8.f
            java.lang.Object r8 = defpackage.hwf.a(r9, r5, r2, r1, r8)
            if (r8 != r0) goto L84
        L83:
            return r0
        L84:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
