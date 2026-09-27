package com.bytedance.sdk.component.tq.hww.tq;

import f6.q;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class hww implements sd, tq, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final byte[] f35058sd = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, q.f83619w, 101, 102};
    hv hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    long f35059tq;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hww)) {
            return false;
        }
        hww hwwVar = (hww) obj;
        long j10 = this.f35059tq;
        if (j10 != hwwVar.f35059tq) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        hv hvVar = this.hww;
        hv hvVar2 = hwwVar.hww;
        int i10 = hvVar.f35057tq;
        int i11 = hvVar2.f35057tq;
        while (j11 < this.f35059tq) {
            long jMin = Math.min(hvVar.f35056sd - i10, hvVar2.f35056sd - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (hvVar.hww[i10] != hvVar2.hww[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == hvVar.f35056sd) {
                hvVar = hvVar.f35054hu;
                i10 = hvVar.f35057tq;
            }
            if (i11 == hvVar2.f35056sd) {
                hvVar2 = hvVar2.f35054hu;
                i11 = hvVar2.f35057tq;
            }
            j11 += jMin;
        }
        return true;
    }

    public int hashCode() {
        hv hvVar = this.hww;
        if (hvVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = hvVar.f35056sd;
            for (int i12 = hvVar.f35057tq; i12 < i11; i12++) {
                i10 = (i10 * 31) + hvVar.hww[i12];
            }
            hvVar = hvVar.f35054hu;
        } while (hvVar != this.hww);
        return i10;
    }

    public final vy hv() {
        long j10 = this.f35059tq;
        if (j10 <= 2147483647L) {
            return vy((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f35059tq);
    }

    public boolean hww() {
        return this.f35059tq == 0;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        hv hvVar = this.hww;
        if (hvVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), hvVar.f35056sd - hvVar.f35057tq);
        byteBuffer.put(hvVar.hww, hvVar.f35057tq, iMin);
        int i10 = hvVar.f35057tq + iMin;
        hvVar.f35057tq = i10;
        this.f35059tq -= (long) iMin;
        if (i10 == hvVar.f35056sd) {
            this.hww = hvVar.tq();
            hu.hww(hvVar);
        }
        return iMin;
    }

    public String sd() {
        try {
            return hww(this.f35059tq, rs.hww);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public String toString() {
        return hv().toString();
    }

    public byte tq() {
        long j10 = this.f35059tq;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        hv hvVar = this.hww;
        int i10 = hvVar.f35057tq;
        int i11 = hvVar.f35056sd;
        int i12 = i10 + 1;
        byte b10 = hvVar.hww[i10];
        this.f35059tq = j10 - 1;
        if (i12 != i11) {
            hvVar.f35057tq = i12;
            return b10;
        }
        this.hww = hvVar.tq();
        hu.hww(hvVar);
        return b10;
    }

    /* JADX INFO: renamed from: vy, reason: merged with bridge method [inline-methods] */
    public hww clone() {
        hww hwwVar = new hww();
        if (this.f35059tq == 0) {
            return hwwVar;
        }
        hv hvVarHww = this.hww.hww();
        hwwVar.hww = hvVarHww;
        hvVarHww.vgm = hvVarHww;
        hvVarHww.f35054hu = hvVarHww;
        hv hvVar = this.hww;
        while (true) {
            hvVar = hvVar.f35054hu;
            if (hvVar == this.hww) {
                hwwVar.f35059tq = this.f35059tq;
                return hwwVar;
            }
            hwwVar.hww.vgm.hww(hvVar.hww());
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            hv hvVarSd = sd(1);
            int iMin = Math.min(i10, 8192 - hvVarSd.f35056sd);
            byteBuffer.get(hvVarSd.hww, hvVarSd.f35056sd, iMin);
            i10 -= iMin;
            hvVarSd.f35056sd += iMin;
        }
        this.f35059tq += (long) iRemaining;
        return iRemaining;
    }

    public String hww(long j10, Charset charset) throws EOFException {
        rs.hww(this.f35059tq, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        hv hvVar = this.hww;
        int i10 = hvVar.f35057tq;
        if (((long) i10) + j10 > hvVar.f35056sd) {
            return new String(hww(j10), charset);
        }
        String str = new String(hvVar.hww, i10, (int) j10, charset);
        int i11 = (int) (((long) hvVar.f35057tq) + j10);
        hvVar.f35057tq = i11;
        this.f35059tq -= j10;
        if (i11 == hvVar.f35056sd) {
            this.hww = hvVar.tq();
            hu.hww(hvVar);
        }
        return str;
    }

    public hv sd(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            hv hvVar = this.hww;
            if (hvVar == null) {
                hv hvVarHww = hu.hww();
                this.hww = hvVarHww;
                hvVarHww.vgm = hvVarHww;
                hvVarHww.f35054hu = hvVarHww;
                return hvVarHww;
            }
            hv hvVar2 = hvVar.vgm;
            return (hvVar2.f35056sd + i10 > 8192 || !hvVar2.f35055hv) ? hvVar2.hww(hu.hww()) : hvVar2;
        }
        throw new IllegalArgumentException();
    }

    public final vy vy(int i10) {
        if (i10 == 0) {
            return vy.f35061sd;
        }
        return new vgm(this, i10);
    }

    public hww tq(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            rs.hww(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                hv hvVarSd = sd(1);
                int iMin = Math.min(i12 - i10, 8192 - hvVarSd.f35056sd);
                System.arraycopy(bArr, i10, hvVarSd.hww, hvVarSd.f35056sd, iMin);
                i10 += iMin;
                hvVarSd.f35056sd += iMin;
            }
            this.f35059tq += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] hww(long j10) throws EOFException {
        rs.hww(this.f35059tq, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            hww(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public void hww(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iHww = hww(bArr, i10, bArr.length - i10);
            if (iHww == -1) {
                throw new EOFException();
            }
            i10 += iHww;
        }
    }

    public hww tq(int i10) {
        hv hvVarSd = sd(1);
        byte[] bArr = hvVarSd.hww;
        int i11 = hvVarSd.f35056sd;
        hvVarSd.f35056sd = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f35059tq++;
        return this;
    }

    public int hww(byte[] bArr, int i10, int i11) {
        rs.hww(bArr.length, i10, i11);
        hv hvVar = this.hww;
        if (hvVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, hvVar.f35056sd - hvVar.f35057tq);
        System.arraycopy(hvVar.hww, hvVar.f35057tq, bArr, i10, iMin);
        int i12 = hvVar.f35057tq + iMin;
        hvVar.f35057tq = i12;
        this.f35059tq -= (long) iMin;
        if (i12 == hvVar.f35056sd) {
            this.hww = hvVar.tq();
            hu.hww(hvVar);
        }
        return iMin;
    }

    public hww tq(long j10) {
        if (j10 == 0) {
            return tq(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        hv hvVarSd = sd(iNumberOfTrailingZeros);
        byte[] bArr = hvVarSd.hww;
        int i10 = hvVarSd.f35056sd;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f35058sd[(int) (15 & j10)];
            j10 >>>= 4;
        }
        hvVarSd.f35056sd += iNumberOfTrailingZeros;
        this.f35059tq += (long) iNumberOfTrailingZeros;
        return this;
    }

    public hww hww(String str) {
        return hww(str, 0, str.length());
    }

    public hww hww(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    hv hvVarSd = sd(1);
                    byte[] bArr = hvVarSd.hww;
                    int i12 = hvVarSd.f35056sd - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = hvVarSd.f35056sd;
                    int i15 = (i12 + i10) - i14;
                    hvVarSd.f35056sd = i14 + i15;
                    this.f35059tq += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        tq((cCharAt2 >> 6) | 192);
                        tq((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            tq((i17 >> 18) | 240);
                            tq(((i17 >> 12) & 63) | 128);
                            tq(((i17 >> 6) & 63) | 128);
                            tq((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            tq(63);
                            i10 = i16;
                        }
                    } else {
                        tq((cCharAt2 >> '\f') | 224);
                        tq(((cCharAt2 >> 6) & 63) | 128);
                        tq((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public hww hww(int i10) {
        if (i10 < 128) {
            tq(i10);
            return this;
        }
        if (i10 < 2048) {
            tq((i10 >> 6) | 192);
            tq((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                tq(63);
                return this;
            }
            tq((i10 >> 12) | 224);
            tq(((i10 >> 6) & 63) | 128);
            tq((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            tq((i10 >> 18) | 240);
            tq(((i10 >> 12) & 63) | 128);
            tq(((i10 >> 6) & 63) | 128);
            tq((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    public hww hww(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(rs.hww)) {
                    return hww(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return tq(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }
}
