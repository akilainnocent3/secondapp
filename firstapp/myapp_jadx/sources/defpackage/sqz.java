package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", l = {141, 158, 170, 173, 225, 228}, m = "invokeSuspend")
public final class sqz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xmz<Object> b;
    public final /* synthetic */ rqz<Object> c;
    public final /* synthetic */ kqz<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqz(xmz<Object> xmzVar, rqz<Object> rqzVar, kqz<Object> kqzVar, v1b<? super sqz> v1bVar) {
        super(2, v1bVar);
        this.b = xmzVar;
        this.c = rqzVar;
        this.d = kqzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sqz(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sqz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[PHI: r9
      0x00b5: PHI (r9v4 sqz) = (r9v0 sqz), (r9v0 sqz), (r9v5 sqz) binds: [B:25:0x00a8, B:27:0x00b1, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a0 A[PHI: r9
      0x01a0: PHI (r9v8 sqz) = (r9v0 sqz), (r9v0 sqz), (r9v9 sqz) binds: [B:78:0x0194, B:80:0x019d, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209 A[LOOP:0: B:96:0x0203->B:98:0x0209, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r4.b(r5, 0, 0, false, null, null, r11, r13) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r1.b(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r13.c(r14, r9) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b1, code lost:
    
        if (r13.c(r14, r9) == r0) goto L84;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sqz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
