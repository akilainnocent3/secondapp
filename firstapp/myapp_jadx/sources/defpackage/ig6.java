package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {727, 737}, m = "invokeSuspend")
public final class ig6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wd0<g7f, ij0> b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ jg6 e;
    public final /* synthetic */ xxo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig6(wd0<g7f, ij0> wd0Var, float f, boolean z, jg6 jg6Var, xxo xxoVar, v1b<? super ig6> v1bVar) {
        super(2, v1bVar);
        this.b = wd0Var;
        this.c = f;
        this.d = z;
        this.e = jg6Var;
        this.f = xxoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ig6(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ig6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r9.f(r8, r1) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (defpackage.hwf.a(r9, r5, r2, r8.f, r8) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
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
            if (r1 == 0) goto L19
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r2
        L14:
            defpackage.uj50.b(r9)
            goto L96
        L19:
            defpackage.uj50.b(r9)
            wd0<g7f, ij0> r9 = r8.b
            ytw r1 = r9.e
            x5a0 r1 = (defpackage.x5a0) r1
            java.lang.Object r1 = r1.getValue()
            g7f r1 = (defpackage.g7f) r1
            float r1 = r1.a
            float r5 = r8.c
            boolean r1 = defpackage.g7f.b(r1, r5)
            if (r1 != 0) goto L96
            boolean r1 = r8.d
            if (r1 != 0) goto L44
            g7f r1 = new g7f
            r1.<init>(r5)
            r8.a = r4
            java.lang.Object r8 = r9.f(r8, r1)
            if (r8 != r0) goto L96
            goto L95
        L44:
            ytw r1 = r9.e
            x5a0 r1 = (defpackage.x5a0) r1
            java.lang.Object r1 = r1.getValue()
            g7f r1 = (defpackage.g7f) r1
            float r1 = r1.a
            jg6 r4 = r8.e
            float r6 = r4.b
            boolean r6 = defpackage.g7f.b(r1, r6)
            if (r6 == 0) goto L62
            mp20$b r2 = new mp20$b
            r6 = 0
            r2.<init>(r6)
            goto L8b
        L62:
            float r6 = r4.d
            boolean r6 = defpackage.g7f.b(r1, r6)
            if (r6 == 0) goto L70
            vkm r2 = new vkm
            r2.<init>()
            goto L8b
        L70:
            float r6 = r4.c
            boolean r6 = defpackage.g7f.b(r1, r6)
            if (r6 == 0) goto L7e
            c4i r2 = new c4i
            r2.<init>()
            goto L8b
        L7e:
            float r4 = r4.e
            boolean r1 = defpackage.g7f.b(r1, r4)
            if (r1 == 0) goto L8b
            i9f$b r2 = new i9f$b
            r2.<init>()
        L8b:
            r8.a = r3
            xxo r1 = r8.f
            java.lang.Object r8 = defpackage.hwf.a(r9, r5, r2, r1, r8)
            if (r8 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
