package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroSideBetSection$attach$1$1$1$1$2$1", f = "SportyHeroSideBetSection.kt", l = {223, 229, 234, 251, 256, 258}, m = "invokeSuspend", v = 1)
public final class z5c0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wd0<Float, ij0> d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ twd0<Boolean> i;
    public final /* synthetic */ twd0<Boolean> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5c0(boolean z, wd0<Float, ij0> wd0Var, SharedPreferences sharedPreferences, ytw<Boolean> ytwVar, twd0<Boolean> twd0Var, twd0<Boolean> twd0Var2, v1b<? super z5c0> v1bVar) {
        super(2, v1bVar);
        this.c = z;
        this.d = wd0Var;
        this.e = sharedPreferences;
        this.f = ytwVar;
        this.i = twd0Var;
        this.v = twd0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z5c0(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z5c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r11.f(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r11.f(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r11.f(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r11.f(r14, r0) == r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
    
        if (defpackage.wd0.a(r14.d, r1, r2, null, null, r14, 12) == r7) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z5c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
