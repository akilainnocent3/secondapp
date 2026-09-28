package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class odv implements uov.a {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public odv(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        boolean z = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                ly0.b(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                ly0.b(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                ly0.b(z);
                break;
            case "auxiliary.tracks.map":
                ly0.b(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList d() {
        ly0.e("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int iA = 0; iA < b; iA = ndv.a(bArr[iA + 2], iA, 1, arrayList)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || odv.class != obj.getClass()) {
            return false;
        }
        odv odvVar = (odv) obj;
        return this.a.equals(odvVar.a) && Arrays.equals(this.b, odvVar.b) && this.c == odvVar.c && this.d == odvVar.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + gmf0.a(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[LOOP:0: B:40:0x00d1->B:42:0x00d4, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.a;
        byte[] bArr = this.b;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                string = jrh0.q(bArr);
            } else if (i == 23) {
                boolean z = bArr.length >= 4;
                int length = bArr.length;
                if (!z) {
                    hb5.a(p21.b("array too small: %s < %s", Integer.valueOf(length), 4));
                    return null;
                }
                string = String.valueOf(Float.intBitsToFloat(c0p.r(bArr[0], bArr[1], bArr[2], bArr[3])));
            } else if (i == 67) {
                boolean z2 = bArr.length >= 4;
                int length2 = bArr.length;
                if (!z2) {
                    hb5.a(p21.b("array too small: %s < %s", Integer.valueOf(length2), 4));
                    return null;
                }
                string = String.valueOf(c0p.r(bArr[0], bArr[1], bArr[2], bArr[3]));
            } else if (i == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i != 78) {
                String str2 = jrh0.a;
                sb = new StringBuilder(bArr.length * 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i2] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new nsz(bArr).B());
            }
        } else if (str.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbA = y4s.a("track types = ");
            new w9p(String.valueOf(',')).a(sbA, arrayListD.iterator());
            string = sbA.toString();
        } else {
            String str3 = jrh0.a;
            sb = new StringBuilder(bArr.length * 2);
            while (i2 < bArr.length) {
                sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i2] & 15, 16));
            }
            string = sb.toString();
        }
        return lx5.a("mdta: key=", str, ", value=", string);
    }
}
