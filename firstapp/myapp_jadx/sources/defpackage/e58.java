package defpackage;

import com.google.protobuf.RuntimeVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.collections.presentation.CollectionsViewModel$loadCollections$1", f = "CollectionsViewModel.kt", l = {24, RuntimeVersion.MINOR, 28}, m = "invokeSuspend", v = 1)
public final class e58 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g58 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(g58 g58Var, v1b<? super e58> v1bVar) {
        super(2, v1bVar);
        this.b = g58Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e58(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e58) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (kotlin.Unit.a == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (kotlin.Unit.a == r0) goto L22;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            g58 r3 = r7.b
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            goto L19
        L13:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L19:
            defpackage.uj50.b(r8)
            goto L5d
        L1d:
            defpackage.uj50.b(r8)
            goto L2f
        L21:
            defpackage.uj50.b(r8)
            qtm r8 = r3.a
            r7.a = r6
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L2f
            goto L5c
        L2f:
            j48 r8 = (defpackage.j48) r8
            java.lang.Throwable r1 = r8.b
            if (r1 == 0) goto L49
            wwd0 r8 = r3.b
            jbg r3 = new jbg
            r3.<init>(r1)
            r7.a = r5
            r8.getClass()
            r8.k(r2, r3)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L5d
            goto L5c
        L49:
            wwd0 r1 = r3.b
            fiu r3 = new fiu
            r3.<init>(r8)
            r7.a = r4
            r1.getClass()
            r1.k(r2, r3)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
