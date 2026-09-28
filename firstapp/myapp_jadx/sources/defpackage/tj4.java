package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class tj4 implements qrm {
    public final bsm a;
    public final lum b;
    public final b390 c;

    public tj4(bsm bsmVar, lum lumVar) {
        bsmVar.getClass();
        lumVar.getClass();
        this.a = bsmVar;
        this.b = lumVar;
        this.c = d390.b(0, 0, null, 7);
    }

    @Override // defpackage.qrm
    public final Object a(Double d, String str, al4 al4Var) {
        b390 b390Var = this.c;
        if (d == null || d.doubleValue() <= 0.0d) {
            Object objEmit = b390Var.emit(fmj.a, al4Var);
            return objEmit == y5b.a ? objEmit : Unit.a;
        }
        Object objEmit2 = b390Var.emit(new jmj(d.doubleValue(), str), al4Var);
        return objEmit2 == y5b.a ? objEmit2 : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r3.emit(r7, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r3.emit(r7, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (r3.emit(r7, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r3.emit(r7, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        if (r3.emit(r9, r0) == r1) goto L64;
     */
    @Override // defpackage.qrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x4c r8, defpackage.x1b r9) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj4.b(x4c, x1b):java.lang.Object");
    }

    @Override // defpackage.ntm
    public final b390 invoke() {
        return this.c;
    }
}
