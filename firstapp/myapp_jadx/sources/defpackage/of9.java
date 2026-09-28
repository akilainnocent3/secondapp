package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class of9 {
    public static final op8 a = new op8(-912569581, new nf9(), false);

    /* JADX WARN: Code duplicated, block: B:37:0x00c7 A[Catch: q2p -> 0x01aa, TryCatch #5 {q2p -> 0x01aa, blocks: (B:35:0x00c3, B:37:0x00c7, B:39:0x00cd, B:53:0x00f7, B:55:0x0111, B:59:0x0126, B:63:0x012e), top: B:117:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, aj0] */
    /* JADX WARN: Type inference failed for: r10v15, types: [T, aj0] */
    /* JADX WARN: Type inference failed for: r3v13, types: [jyr] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [jyr] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x017e -> B:121:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.uzr r28, int r29, int r30, int r31, defpackage.mmd r32, defpackage.x1b r33) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of9.a(uzr, int, int, int, mmd, x1b):java.lang.Object");
    }

    public static final boolean b(boolean z, jyr jyrVar, int i, int i2) {
        if (z) {
            if (jyrVar.g() > i) {
                return true;
            }
            return jyrVar.g() == i && jyrVar.f() > i2;
        }
        if (jyrVar.g() < i) {
            return true;
        }
        return jyrVar.g() == i && jyrVar.f() < i2;
    }

    public static final boolean c(jyr jyrVar, int i) {
        return i <= jyrVar.b() && jyrVar.g() <= i;
    }
}
