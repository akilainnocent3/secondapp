package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.NCUseCase$clearAllData$1", f = "NCUseCase.kt", l = {119, 121}, m = "invokeSuspend", v = 2)
public final class j4x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public f4x[] a;
    public h4x b;
    public int c;
    public int d;
    public int e;
    public final /* synthetic */ h4x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4x(h4x h4xVar, v1b<? super j4x> v1bVar) {
        super(2, v1bVar);
        this.f = h4xVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j4x(this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j4x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r7.a.putBoolean(r10, r8, r9) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:21:0x0061). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.e
            r2 = 0
            h4x r3 = r9.f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 != r4) goto L1b
            int r1 = r9.d
            int r2 = r9.c
            h4x r3 = r9.b
            f4x[] r6 = r9.a
            defpackage.uj50.b(r10)
            goto L61
        L1b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r2
        L21:
            defpackage.uj50.b(r10)
            goto L3d
        L25:
            defpackage.uj50.b(r10)
            r9.e = r5
            com.sportybet.feature.notificationcenter.db.NCDatabase r10 = r3.c
            k4x r1 = new k4x
            r1.<init>(r3, r2)
            java.lang.Object r10 = defpackage.qv50.b(r10, r1, r9)
            if (r10 != r0) goto L38
            goto L3a
        L38:
            kotlin.Unit r10 = kotlin.Unit.a
        L3a:
            if (r10 != r0) goto L3d
            goto L60
        L3d:
            f4x[] r10 = defpackage.f4x.values()
            int r1 = r10.length
            r2 = 0
            r6 = r10
        L44:
            if (r2 >= r1) goto L63
            r10 = r6[r2]
            m2l r7 = r3.b
            java.lang.String r10 = r10.c
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r9.a = r6
            r9.b = r3
            r9.c = r2
            r9.d = r1
            r9.e = r4
            zed r7 = r7.a
            java.lang.Object r10 = r7.putBoolean(r10, r8, r9)
            if (r10 != r0) goto L61
        L60:
            return r0
        L61:
            int r2 = r2 + r5
            goto L44
        L63:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
