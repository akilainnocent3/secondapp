package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class n08 {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d;

    public n08(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r1[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.c
            byte[] r1 = r9.a
            int r2 = r9.b
            if (r2 != r0) goto L9
            goto L6d
        L9:
            int r3 = r0 + 1
            r4 = r1[r0]
            if (r4 < 0) goto L12
            r9.c = r3
            return r4
        L12:
            int r5 = r2 - r3
            r6 = 9
            if (r5 >= r6) goto L19
            goto L6d
        L19:
            int r5 = r0 + 2
            r3 = r1[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L26
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L9d
        L26:
            int r4 = r0 + 3
            r5 = r1[r5]
            int r5 = r5 << 14
            r3 = r3 ^ r5
            if (r3 < 0) goto L34
            r0 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L31:
            r5 = r4
            goto L9d
        L34:
            int r5 = r0 + 4
            r4 = r1[r4]
            int r4 = r4 << 21
            r3 = r3 ^ r4
            if (r3 >= 0) goto L42
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r3
            goto L9d
        L42:
            int r4 = r0 + 5
            r5 = r1[r5]
            int r6 = r5 << 28
            r3 = r3 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r6
            if (r5 >= 0) goto L9b
            int r5 = r0 + 6
            r4 = r1[r4]
            if (r4 >= 0) goto L99
            int r4 = r0 + 7
            r5 = r1[r5]
            if (r5 >= 0) goto L9b
            int r5 = r0 + 8
            r4 = r1[r4]
            if (r4 >= 0) goto L99
            int r4 = r0 + 9
            r5 = r1[r5]
            if (r5 >= 0) goto L9b
            int r5 = r0 + 10
            r0 = r1[r4]
            if (r0 >= 0) goto L99
        L6d:
            r0 = 0
            r3 = 0
            r5 = r0
        L71:
            r6 = 64
            if (r5 >= r6) goto L93
            int r6 = r9.c
            if (r6 == r2) goto L8d
            int r7 = r6 + 1
            r9.c = r7
            r6 = r1[r6]
            r7 = r6 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r7
            long r7 = r7 << r5
            long r3 = r3 | r7
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 != 0) goto L8a
            int r9 = (int) r3
            return r9
        L8a:
            int r5 = r5 + 7
            goto L71
        L8d:
            java.lang.String r9 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            defpackage.i08.a(r9)
            return r0
        L93:
            java.lang.String r9 = "CodedInputStream encountered a malformed varint."
            defpackage.i08.a(r9)
            return r0
        L99:
            r0 = r3
            goto L9d
        L9b:
            r0 = r3
            goto L31
        L9d:
            r9.c = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n08.a():int");
    }

    public final void b(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.c;
            if (i <= this.b - i2) {
                this.c = i2 + i;
                return;
            }
        }
        if (i < 0) {
            i08.a("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            i08.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
