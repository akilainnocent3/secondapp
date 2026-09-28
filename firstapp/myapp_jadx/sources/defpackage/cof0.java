package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.TheGoldmineViewModel$fetch$1", f = "TheGoldmineViewModel.kt", l = {547, 551, 552, 553}, m = "invokeSuspend", v = 1)
public final class cof0 extends tje0 implements Function2<q4l, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aof0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cof0(aof0 aof0Var, v1b<? super cof0> v1bVar) {
        super(2, v1bVar);
        this.c = aof0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cof0 cof0Var = new cof0(this.c, v1bVar);
        cof0Var.b = obj;
        return cof0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q4l q4lVar, v1b<? super Unit> v1bVar) {
        return ((cof0) create(q4lVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (kotlin.Unit.a == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (kotlin.Unit.a == r3) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            aof0 r0 = r10.c
            wwd0 r1 = r0.z
            java.lang.Object r2 = r10.b
            q4l r2 = (defpackage.q4l) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r10.a
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L2e
            if (r4 == r8) goto L2a
            if (r4 == r7) goto L26
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1c
            goto L2a
        L1c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r9
        L22:
            defpackage.uj50.b(r11)
            goto L78
        L26:
            defpackage.uj50.b(r11)
            goto L6a
        L2a:
            defpackage.uj50.b(r11)
            goto L86
        L2e:
            defpackage.uj50.b(r11)
            boolean r11 = r2 instanceof q4l.a
            if (r11 == 0) goto L3d
            q4l$a r2 = (q4l.a) r2
            java.lang.Throwable r10 = r2.a
            r0.A1(r10)
            goto L86
        L3d:
            boolean r11 = r2 instanceof q4l.b
            if (r11 == 0) goto L59
            hzs$b r11 = new hzs$b
            q4l$b r2 = (q4l.b) r2
            float r0 = r2.a
            r11.<init>(r0)
            r10.b = r9
            r10.a = r8
            r1.getClass()
            r1.k(r9, r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r3) goto L86
            goto L85
        L59:
            boolean r11 = r2 instanceof q4l.c
            if (r11 == 0) goto L89
            r10.b = r2
            r10.a = r7
            r7 = 300(0x12c, double:1.48E-321)
            java.lang.Object r11 = defpackage.hkd.b(r7, r10)
            if (r11 != r3) goto L6a
            goto L85
        L6a:
            wwd0 r11 = r0.A
            r10.b = r9
            r10.a = r6
            r11.setValue(r2)
            kotlin.Unit r11 = kotlin.Unit.a
            if (r11 != r3) goto L78
            goto L85
        L78:
            hzs$a r11 = hzs.a.a
            r10.b = r9
            r10.a = r5
            r1.setValue(r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r3) goto L86
        L85:
            return r3
        L86:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L89:
            defpackage.uhc.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cof0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
