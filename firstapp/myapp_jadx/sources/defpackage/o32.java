package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class o32 {

    public static class a {
        public long a;
        public byte[] b;
        public int c;
        public int d;
        public boolean e;
        public int f;

        public final String toString() {
            String simpleName = a.class.getSimpleName();
            String string = Arrays.toString(this.b);
            boolean z = this.e;
            long j = this.a;
            int i = this.f;
            int i2 = this.c;
            int i3 = this.d;
            StringBuilder sb = new StringBuilder(simpleName);
            sb.append("[buffer=");
            sb.append(string);
            sb.append(", currentLinePos=0, eof=");
            sb.append(z);
            g41.a(j, ", ibitWorkArea=0, lbitWorkArea=", ", modulus=", sb);
            d5d.a(sb, i, ", pos=", i2, ", readPos=");
            return zk1.a(i3, "]", sb);
        }
    }

    public static byte[] a(int i, a aVar) {
        byte[] bArr = aVar.b;
        if (bArr == null) {
            byte[] bArr2 = new byte[Math.max(i, 8192)];
            aVar.b = bArr2;
            aVar.c = 0;
            aVar.d = 0;
            return bArr2;
        }
        int i2 = aVar.c + i;
        if (i2 - bArr.length <= 0) {
            return bArr;
        }
        int length = bArr.length * 2;
        if (Integer.compare(length ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
            length = i2;
        }
        if (Integer.compare(Integer.MIN_VALUE ^ length, -9) > 0) {
            if (i2 < 0) {
                throw new OutOfMemoryError("Unable to allocate array size: " + (((long) i2) & 4294967295L));
            }
            length = Math.max(i2, 2147483639);
        }
        byte[] bArrCopyOf = Arrays.copyOf(aVar.b, length);
        aVar.b = bArrCopyOf;
        return bArrCopyOf;
    }
}
