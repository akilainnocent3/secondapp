package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$refreshGlobalCards$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {204, 211, 214, 222, 223, 224}, m = "invokeSuspend", v = 2)
public final class zey extends tje0 implements Function2<myh<? super p8q>, v1b<? super Unit>, Object> {
    public p8q a;
    public q7q.b b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wwd0 e;
    public final /* synthetic */ q8q f;
    public final /* synthetic */ g8q i;
    public final /* synthetic */ afy v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zey(wwd0 wwd0Var, q8q q8qVar, g8q g8qVar, afy afyVar, v1b v1bVar) {
        super(2, v1bVar);
        this.e = wwd0Var;
        this.f = q8qVar;
        this.i = g8qVar;
        this.v = afyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zey zeyVar = new zey(this.e, this.f, this.i, this.v, v1bVar);
        zeyVar.d = obj;
        return zeyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super p8q> myhVar, v1b<? super Unit> v1bVar) {
        return ((zey) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019 A[PHI: r2 r4 r12
      0x0019: PHI (r2v12 q7q$b) = (r2v10 q7q$b), (r2v14 q7q$b) binds: [B:49:0x00ea, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0019: PHI (r4v8 p8q) = (r4v6 p8q), (r4v10 p8q) binds: [B:49:0x00ea, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]
      0x0019: PHI (r12v22 java.lang.Object) = (r12v21 java.lang.Object), (r12v0 java.lang.Object) binds: [B:49:0x00ea, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0117, code lost:
    
        if (r0.emit(r4, r11) == r1) goto L60;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zey.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
