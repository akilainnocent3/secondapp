package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.AnimatedHammerImageKt$rememberHammerHitAnimation$1$1", f = "AnimatedHammerImage.kt", l = {107, 111, 116, 120, 122, 127, 128}, m = "invokeSuspend", v = 1)
public final class ag0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wd0<gly, jj0> c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wd0<Float, ij0> e;
    public final /* synthetic */ ytw<Boolean> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(boolean z, wd0<gly, jj0> wd0Var, long j, wd0<Float, ij0> wd0Var2, ytw<Boolean> ytwVar, v1b<? super ag0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = wd0Var;
        this.d = j;
        this.e = wd0Var2;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ag0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ag0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (defpackage.wd0.a(r16.c, r1, r2, null, null, r16, 12) == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        if (r16.c.f(r16, r0) == r7) goto L35;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
