package com.bytedance.sdk.component.tq.hww.tq;

import ce.a;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import gi.j;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import za.h;
import zi.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy implements Serializable, Comparable<vy> {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    transient String f35063hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    transient int f35064hv;
    final byte[] vy;
    static final char[] hww = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final Charset f35062tq = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static final vy f35061sd = hww(new byte[0]);

    public vy(byte[] bArr) {
        this.vy = bArr;
    }

    public static vy hww(byte... bArr) {
        if (bArr != null) {
            return new vy((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vy) {
            vy vyVar = (vy) obj;
            int iSd = vyVar.sd();
            byte[] bArr = this.vy;
            if (iSd == bArr.length && vyVar.hww(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f35064hv;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.vy);
        this.f35064hv = iHashCode;
        return iHashCode;
    }

    public int sd() {
        return this.vy.length;
    }

    public String toString() {
        if (this.vy.length == 0) {
            return "[size=0]";
        }
        String strHww = hww();
        int iHww = hww(strHww, 64);
        if (iHww == -1) {
            if (this.vy.length <= 64) {
                return "[hex=" + tq() + C4235d4.j.f61462e;
            }
            return "[size=" + this.vy.length + " hex=" + hww(0, 64).tq() + "…]";
        }
        String strReplace = strHww.substring(0, iHww).replace(a.f23003h, "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace(h.f160939d, "\\r");
        if (iHww >= strHww.length()) {
            return "[text=" + strReplace + C4235d4.j.f61462e;
        }
        return "[size=" + this.vy.length + " text=" + strReplace + "…]";
    }

    public String tq() {
        byte[] bArr = this.vy;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = hww;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & c.f161639q];
        }
        return new String(cArr);
    }

    public byte[] vy() {
        return (byte[]) this.vy.clone();
    }

    public String hww() {
        String str = this.f35063hu;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.vy, f35062tq);
        this.f35063hu = str2;
        return str2;
    }

    public vy hww(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.vy;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.vy.length + j.f86771d);
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new vy(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte hww(int i10) {
        return this.vy[i10];
    }

    public boolean hww(int i10, vy vyVar, int i11, int i12) {
        return vyVar.hww(i11, this.vy, i10, i12);
    }

    public boolean hww(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.vy;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && rs.hww(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(vy vyVar) {
        int iSd = sd();
        int iSd2 = vyVar.sd();
        int iMin = Math.min(iSd, iSd2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iHww = hww(i10) & 255;
            int iHww2 = vyVar.hww(i10) & 255;
            if (iHww != iHww2) {
                return iHww < iHww2 ? -1 : 1;
            }
        }
        if (iSd == iSd2) {
            return 0;
        }
        return iSd < iSd2 ? -1 : 1;
    }

    public static int hww(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
