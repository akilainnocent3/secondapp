package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$recoveryLastMultiMaker$1", f = "MultiMakerViewModel.kt", l = {942, 943}, m = "invokeSuspend", v = 2)
public final class yiw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yiw(v1b v1bVar, tjw tjwVar) {
        super(2, v1bVar);
        this.b = tjwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yiw(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yiw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r10.join(r9) == r0) goto L27;
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
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            tjw r6 = r9.b
            if (r1 == 0) goto L1e
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L14
            defpackage.uj50.b(r10)
            goto L83
        L14:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L1a:
            defpackage.uj50.b(r10)
            goto L75
        L1e:
            defpackage.uj50.b(r10)
            wwd0 r10 = r6.d0
            java.lang.Object r10 = r10.getValue()
            shw r10 = (defpackage.shw) r10
            wwd0 r1 = r6.F
            java.lang.Object r1 = r1.getValue()
            lk50 r1 = (defpackage.lk50) r1
            java.lang.Object r1 = defpackage.bm50.i(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L3c
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L3c:
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L43
            goto L86
        L43:
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r1.next()
            mfb0 r7 = (defpackage.mfb0) r7
            java.lang.String r7 = r7.getId()
            java.lang.String r8 = r10.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.g(r7, r8)
            if (r7 == 0) goto L47
            et7 r1 = defpackage.o8i0.d(r6)
            piw r7 = new piw
            r7.<init>(r6, r10, r2)
            jvd0 r10 = defpackage.ej5.c(r1, r2, r2, r7, r3)
            r9.a = r5
            java.lang.Object r10 = r10.join(r9)
            if (r10 != r0) goto L75
            goto L82
        L75:
            r10 = 0
            jvd0 r10 = defpackage.tjw.I1(r6, r10, r3)
            r9.a = r4
            java.lang.Object r9 = r10.join(r9)
            if (r9 != r0) goto L83
        L82:
            return r0
        L83:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L86:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yiw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
