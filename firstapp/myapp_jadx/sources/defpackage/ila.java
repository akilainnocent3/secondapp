package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.util.ComposeUtilsKt$animateTextStyleAsState$1$1", f = "ComposeUtils.kt", l = {176, 177}, m = "invokeSuspend", v = 2)
public final class ila extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ twd0<imf0> b;
    public final /* synthetic */ imf0 c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ gzg0 e;
    public final /* synthetic */ ytw<imf0> f;
    public final /* synthetic */ ytw<imf0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ila(twd0 twd0Var, imf0 imf0Var, wd0 wd0Var, gzg0 gzg0Var, ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = twd0Var;
        this.c = imf0Var;
        this.d = wd0Var;
        this.e = gzg0Var;
        this.f = ytwVar;
        this.i = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ila(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ila) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (defpackage.wd0.a(r2, r3, r9.e, null, null, r9, 12) == r0) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            wd0<java.lang.Float, ij0> r2 = r9.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r10)
            goto L5b
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L19:
            defpackage.uj50.b(r10)
        L1c:
            r10 = r3
            goto L44
        L1e:
            defpackage.uj50.b(r10)
            twd0<imf0> r10 = r9.b
            java.lang.Object r10 = r10.getValue()
            imf0 r10 = (defpackage.imf0) r10
            ytw<imf0> r1 = r9.f
            r1.setValue(r10)
            ytw<imf0> r10 = r9.i
            imf0 r1 = r9.c
            r10.setValue(r1)
            java.lang.Float r10 = new java.lang.Float
            r1 = 0
            r10.<init>(r1)
            r9.a = r4
            java.lang.Object r10 = r2.f(r9, r10)
            if (r10 != r0) goto L1c
            goto L5a
        L44:
            java.lang.Float r3 = new java.lang.Float
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r1)
            r9.a = r10
            gzg0 r4 = r9.e
            r5 = 0
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r9 = defpackage.wd0.a(r2, r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ila.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
