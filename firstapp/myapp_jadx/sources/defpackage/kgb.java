package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$enqueueVipLhsToast$1", f = "CrashFragment.kt", l = {883, 893}, m = "invokeSuspend", v = 1)
public final class kgb extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ fgb c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgb(String str, fgb fgbVar, String str2, String str3, v1b v1bVar) {
        super(1, v1bVar);
        this.b = str;
        this.c = fgbVar;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new kgb(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((kgb) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (defpackage.hkd.b(3000, r8) == r0) goto L20;
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
            r2 = 2
            r3 = 1
            fgb r4 = r8.c
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L12
            goto L4f
        L12:
            r8 = move-exception
            goto L5e
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L1b:
            defpackage.uj50.b(r9)     // Catch: java.lang.Throwable -> L12
            goto L2d
        L1f:
            defpackage.uj50.b(r9)
            r8.a = r3     // Catch: java.lang.Throwable -> L12
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = defpackage.hkd.b(r5, r8)     // Catch: java.lang.Throwable -> L12
            if (r9 != r0) goto L2d
            goto L4e
        L2d:
            java.lang.String r9 = r8.b     // Catch: java.lang.Throwable -> L12
            ytw<ob30> r1 = r4.c1     // Catch: java.lang.Throwable -> L12
            ob30$d r3 = new ob30$d     // Catch: java.lang.Throwable -> L12
            wdi0$a r5 = new wdi0$a     // Catch: java.lang.Throwable -> L12
            java.lang.String r6 = r8.d     // Catch: java.lang.Throwable -> L12
            java.lang.String r7 = r8.e     // Catch: java.lang.Throwable -> L12
            r5.<init>(r9, r6, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L12
            x5a0 r1 = (defpackage.x5a0) r1     // Catch: java.lang.Throwable -> L12
            r1.setValue(r3)     // Catch: java.lang.Throwable -> L12
            r8.a = r2     // Catch: java.lang.Throwable -> L12
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r8 = defpackage.hkd.b(r1, r8)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L4f
        L4e:
            return r0
        L4f:
            r4.s1()     // Catch: java.lang.Throwable -> L12
            ytw<java.lang.Boolean> r8 = r4.d1
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            x5a0 r8 = (defpackage.x5a0) r8
            r8.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L5e:
            ytw<java.lang.Boolean> r9 = r4.d1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            x5a0 r9 = (defpackage.x5a0) r9
            r9.setValue(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
