package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.presentation.RecapViewModel$loadRecapData$1", f = "RecapViewModel.kt", l = {55, 58, 100}, m = "invokeSuspend", v = 2)
public final class tf40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public qck.a a;
    public int b;
    public final /* synthetic */ sf40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf40(sf40 sf40Var, v1b<? super tf40> v1bVar) {
        super(2, v1bVar);
        this.c = sf40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tf40(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tf40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[LOOP:0: B:25:0x0067->B:58:0x0148, LOOP_START, PHI: r8
      0x0067: PHI (r8v8 java.lang.Throwable) = (r8v0 java.lang.Throwable), (r8v10 java.lang.Throwable) binds: [B:24:0x0065, B:58:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[LOOP:2: B:38:0x00df->B:42:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148 A[LOOP:0: B:25:0x0067->B:58:0x0148, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0198, code lost:
    
        if (r1.emit(r2, r19) == r3) goto L78;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
