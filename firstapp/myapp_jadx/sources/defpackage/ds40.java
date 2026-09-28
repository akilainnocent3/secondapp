package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.RefsCallViewModel$fetch$1", f = "RefsCallViewModel.kt", l = {346, 349, 351, 352}, m = "invokeSuspend", v = 1)
public final class ds40 extends tje0 implements Function2<yo30, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zr40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds40(zr40 zr40Var, v1b<? super ds40> v1bVar) {
        super(2, v1bVar);
        this.c = zr40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ds40 ds40Var = new ds40(this.c, v1bVar);
        ds40Var.b = obj;
        return ds40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yo30 yo30Var, v1b<? super Unit> v1bVar) {
        return ((ds40) create(yo30Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r8.z1(r10, r9) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (kotlin.Unit.a == r1) goto L31;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            yo30 r0 = (defpackage.yo30) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            zr40 r8 = r9.c
            if (r2 == 0) goto L2c
            if (r2 == r6) goto L28
            if (r2 == r5) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L1a
            goto L24
        L1a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r7
        L20:
            defpackage.uj50.b(r10)
            goto L65
        L24:
            defpackage.uj50.b(r10)
            goto L7c
        L28:
            defpackage.uj50.b(r10)
            goto L3d
        L2c:
            defpackage.uj50.b(r10)
            wwd0 r10 = r8.L
            r9.b = r0
            r9.a = r6
            r10.setValue(r0)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r1) goto L3d
            goto L77
        L3d:
            boolean r10 = r0 instanceof yo30.b
            if (r10 != 0) goto L7c
            boolean r10 = r0 instanceof yo30.a
            if (r10 == 0) goto L54
            yo30$a r0 = (yo30.a) r0
            java.lang.Throwable r10 = r0.a
            r9.b = r7
            r9.a = r5
            java.lang.Object r9 = r8.z1(r10, r9)
            if (r9 != r1) goto L7c
            goto L77
        L54:
            boolean r10 = r0 instanceof yo30.c
            if (r10 == 0) goto L78
            r9.b = r7
            r9.a = r4
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r10 = defpackage.hkd.b(r4, r9)
            if (r10 != r1) goto L65
            goto L77
        L65:
            wwd0 r10 = r8.E
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.b = r7
            r9.a = r3
            r10.getClass()
            r10.k(r7, r0)
            kotlin.Unit r9 = kotlin.Unit.a
            if (r9 != r1) goto L7c
        L77:
            return r1
        L78:
            defpackage.uhc.a()
            return r7
        L7c:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
