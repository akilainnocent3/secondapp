package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$2", f = "LNSearchViewModel.kt", l = {193, 193}, m = "invokeSuspend", v = 2)
public final class fbr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public wwd0 a;
    public xbr b;
    public int c;
    public final /* synthetic */ xbr d;

    @c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$2$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<qcn<? extends erq>, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qcn<? extends erq> qcnVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qcn qcnVar = (qcn) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(!qcnVar.isEmpty());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbr(xbr xbrVar, v1b<? super fbr> v1bVar) {
        super(2, v1bVar);
        this.d = xbrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fbr(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fbr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r2.emit(r9, r8) == r0) goto L16;
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
            int r1 = r8.c
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1f
            if (r1 == r2) goto L17
            if (r1 != r4) goto L11
            defpackage.uj50.b(r9)
            goto L53
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r3
        L17:
            xbr r1 = r8.b
            wwd0 r2 = r8.a
            defpackage.uj50.b(r9)
            goto L3d
        L1f:
            defpackage.uj50.b(r9)
            xbr r1 = r8.d
            wwd0 r9 = r1.e
            v340 r5 = r1.d
            fbr$a r6 = new fbr$a
            r6.<init>(r4, r3)
            r8.a = r9
            r8.b = r1
            r8.c = r2
            java.lang.Object r2 = defpackage.s0i.b(r5, r6, r8)
            if (r2 != r0) goto L3a
            goto L52
        L3a:
            r7 = r2
            r2 = r9
            r9 = r7
        L3d:
            qcn r9 = (defpackage.qcn) r9
            r1.getClass()
            uf00 r9 = defpackage.xbr.x1(r9)
            r8.a = r3
            r8.b = r3
            r8.c = r4
            java.lang.Object r8 = r2.emit(r9, r8)
            if (r8 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
