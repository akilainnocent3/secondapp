package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import cv.z0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f70152c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, f6.q.f83619w, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    o f70153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f70154b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f70154b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f70154b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        return new f(c(j10));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().g() + z0.F);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f70154b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f70154b;
        if (j10 != cVar.f70154b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f70153a;
        o oVar2 = cVar.f70153a;
        int i10 = oVar.f70187b;
        int i11 = oVar2.f70187b;
        while (j11 < this.f70154b) {
            long jMin = Math.min(oVar.f70188c - i10, oVar2.f70188c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f70186a[i10] != oVar2.f70186a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f70188c) {
                oVar = oVar.f70191f;
                i10 = oVar.f70187b;
            }
            if (i11 == oVar2.f70188c) {
                oVar2 = oVar2.f70191f;
                i11 = oVar2.f70187b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f70154b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    public String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f70153a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f70188c;
            for (int i12 = oVar.f70187b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f70186a[i12];
            }
            oVar = oVar.f70191f;
        } while (oVar != this.f70153a);
        return i10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() {
        int i10;
        if (this.f70154b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            o oVar = this.f70153a;
            byte[] bArr = oVar.f70186a;
            int i12 = oVar.f70187b;
            int i13 = oVar.f70188c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b10));
                    }
                    i10 = b10 + l3.a.f103493v7;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().a(j10).writeByte((int) b10).p());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f70153a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f70187b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f70153a != null);
        this.f70154b -= (long) i11;
        return j10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f70154b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f70154b == 0) {
            return cVar;
        }
        o oVarC = this.f70153a.c();
        cVar.f70153a = oVarC;
        oVarC.f70192g = oVarC;
        oVarC.f70191f = oVarC;
        for (o oVar = this.f70153a.f70191f; oVar != this.f70153a; oVar = oVar.f70191f) {
            cVar.f70153a.f70192g.a(oVar.c());
        }
        cVar.f70154b = this.f70154b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f70154b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f70153a.f70192g;
        int i10 = oVar.f70188c;
        return (i10 >= 8192 || !oVar.f70190e) ? j10 : j10 - ((long) (i10 - oVar.f70187b));
    }

    public byte[] n() {
        try {
            return c(this.f70154b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f70154b, u.f70201a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f70154b;
        if (j10 <= 2147483647L) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f70154b);
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f70153a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f70188c - oVar.f70187b);
        System.arraycopy(oVar.f70186a, oVar.f70187b, bArr, i10, iMin);
        int i12 = oVar.f70187b + iMin;
        oVar.f70187b = i12;
        this.f70154b -= (long) iMin;
        if (i12 == oVar.f70188c) {
            this.f70153a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f70154b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f70153a;
        int i10 = oVar.f70187b;
        int i11 = oVar.f70188c;
        int i12 = i10 + 1;
        byte b10 = oVar.f70186a[i10];
        this.f70154b = j10 - 1;
        if (i12 != i11) {
            oVar.f70187b = i12;
            return b10;
        }
        this.f70153a = oVar.b();
        p.a(oVar);
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f70154b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f70154b);
        }
        o oVar = this.f70153a;
        int i10 = oVar.f70187b;
        int i11 = oVar.f70188c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f70186a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f70154b = j10 - 4;
        if (i14 != i11) {
            oVar.f70187b = i14;
            return i15;
        }
        this.f70153a = oVar.b();
        p.a(oVar);
        return i15;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f70154b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f70154b);
        }
        o oVar = this.f70153a;
        int i10 = oVar.f70187b;
        int i11 = oVar.f70188c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f70186a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f70154b = j10 - 2;
        if (i14 == i11) {
            this.f70153a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f70187b = i14;
        }
        return (short) i15;
    }

    public final long size() {
        return this.f70154b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            o oVar = this.f70153a;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, oVar.f70188c - oVar.f70187b);
            long j11 = iMin;
            this.f70154b -= j11;
            j10 -= j11;
            o oVar2 = this.f70153a;
            int i10 = oVar2.f70187b + iMin;
            oVar2.f70187b = i10;
            if (i10 == oVar2.f70188c) {
                this.f70153a = oVar2.b();
                p.a(oVar2);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f70154b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    public final byte f(long j10) {
        u.a(this.f70154b, j10, 1L);
        long j11 = this.f70154b;
        if (j11 - j10 > j10) {
            o oVar = this.f70153a;
            long j12 = j10;
            while (true) {
                int i10 = oVar.f70188c;
                int i11 = oVar.f70187b;
                long j13 = i10 - i11;
                if (j12 < j13) {
                    return oVar.f70186a[i11 + ((int) j12)];
                }
                j12 -= j13;
                oVar = oVar.f70191f;
            }
        } else {
            long j14 = j10 - j11;
            o oVar2 = this.f70153a.f70192g;
            while (true) {
                int i12 = oVar2.f70188c;
                int i13 = oVar2.f70187b;
                j14 += (long) (i12 - i13);
                if (j14 >= 0) {
                    return oVar2.f70186a[i13 + ((int) j14)];
                }
                oVar2 = oVar2.f70192g;
            }
        }
    }

    public String g(long j10) throws EOFException {
        return a(j10, u.f70201a);
    }

    public o b(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f70153a;
            if (oVar == null) {
                o oVarA = p.a();
                this.f70153a = oVarA;
                oVarA.f70192g = oVarA;
                oVarA.f70191f = oVarA;
                return oVarA;
            }
            o oVar2 = oVar.f70192g;
            return (oVar2.f70188c + i10 > 8192 || !oVar2.f70190e) ? oVar2.a(p.a()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f70186a;
        int i11 = oVarB.f70188c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        oVarB.f70188c = i11 + 2;
        this.f70154b += 2;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining;
            while (i10 > 0) {
                o oVarB = b(1);
                int iMin = Math.min(i10, 8192 - oVarB.f70188c);
                byteBuffer.get(oVarB.f70186a, oVarB.f70188c, iMin);
                i10 -= iMin;
                oVarB.f70188c += iMin;
            }
            this.f70154b += (long) iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar != null) {
            long j12 = j10;
            u.a(this.f70154b, j12, j11);
            if (j11 != 0) {
                cVar.f70154b += j11;
                o oVar = this.f70153a;
                while (true) {
                    long j13 = oVar.f70188c - oVar.f70187b;
                    if (j12 < j13) {
                        break;
                    }
                    j12 -= j13;
                    oVar = oVar.f70191f;
                }
                o oVar2 = oVar;
                long j14 = j11;
                while (j14 > 0) {
                    o oVarC = oVar2.c();
                    int i10 = (int) (((long) oVarC.f70187b) + j12);
                    oVarC.f70187b = i10;
                    oVarC.f70188c = Math.min(i10 + ((int) j14), oVarC.f70188c);
                    o oVar3 = cVar.f70153a;
                    if (oVar3 == null) {
                        oVarC.f70192g = oVarC;
                        oVarC.f70191f = oVarC;
                        cVar.f70153a = oVarC;
                    } else {
                        oVar3.f70192g.a(oVarC);
                    }
                    j14 -= (long) (oVarC.f70188c - oVarC.f70187b);
                    oVar2 = oVar2.f70191f;
                    j12 = 0;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f70186a;
        int i11 = oVarB.f70188c;
        oVarB.f70188c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f70154b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f70154b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.a(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f70153a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f70188c - oVar.f70187b);
        byteBuffer.put(oVar.f70186a, oVar.f70187b, iMin);
        int i10 = oVar.f70187b + iMin;
        oVar.f70187b = i10;
        this.f70154b -= (long) iMin;
        if (i10 == oVar.f70188c) {
            this.f70153a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f70186a;
        int i11 = oVarB.f70188c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        oVarB.f70188c = i11 + 4;
        this.f70154b += 4;
        return this;
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            writeByte((i10 >> 6) | 192);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                writeByte(63);
                return this;
            }
            writeByte((i10 >> 12) | 224);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
            return this;
        }
        if (i10 <= 1114111) {
            writeByte((i10 >> 18) | 240);
            writeByte(((i10 >> 12) & 63) | 128);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f70197d;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.f70154b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f70186a;
        int i10 = oVarB.f70188c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f70152c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f70188c += iNumberOfTrailingZeros;
        this.f70154b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public String a(long j10, Charset charset) throws EOFException {
        u.a(this.f70154b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f70153a;
        int i10 = oVar.f70187b;
        if (((long) i10) + j10 > oVar.f70188c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f70186a, i10, (int) j10, charset);
        int i11 = (int) (((long) oVar.f70187b) + j10);
        oVar.f70187b = i11;
        this.f70154b -= j10;
        if (i11 == oVar.f70188c) {
            this.f70153a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    o oVarB = b(1);
                    byte[] bArr = oVarB.f70186a;
                    int i12 = oVarB.f70188c - i10;
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
                    int i14 = oVarB.f70188c;
                    int i15 = (i12 + i10) - i14;
                    oVarB.f70188c = i14 + i15;
                    this.f70154b += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | 192);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            writeByte((i17 >> 18) | 240);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(u.f70201a)) {
                        return a(str, i10, i11);
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o oVarB = b(1);
                int iMin = Math.min(i12 - i10, 8192 - oVarB.f70188c);
                System.arraycopy(bArr, i10, oVarB.f70186a, oVarB.f70188c, iMin);
                i10 += iMin;
                oVarB.f70188c += iMin;
            }
            this.f70154b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, 8192L);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.a(cVar.f70154b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f70153a;
                if (j10 < oVar.f70188c - oVar.f70187b) {
                    o oVar2 = this.f70153a;
                    o oVar3 = oVar2 != null ? oVar2.f70192g : null;
                    if (oVar3 != null && oVar3.f70190e) {
                        if ((((long) oVar3.f70188c) + j10) - ((long) (oVar3.f70189d ? 0 : oVar3.f70187b)) <= 8192) {
                            oVar.a(oVar3, (int) j10);
                            cVar.f70154b -= j10;
                            this.f70154b += j10;
                            return;
                        }
                    }
                    cVar.f70153a = oVar.a((int) j10);
                }
                o oVar4 = cVar.f70153a;
                long j11 = oVar4.f70188c - oVar4.f70187b;
                cVar.f70153a = oVar4.b();
                o oVar5 = this.f70153a;
                if (oVar5 == null) {
                    this.f70153a = oVar4;
                    oVar4.f70192g = oVar4;
                    oVar4.f70191f = oVar4;
                } else {
                    oVar5.f70192g.a(oVar4).a();
                }
                cVar.f70154b -= j11;
                this.f70154b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f70154b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (oVar = this.f70153a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    oVar = oVar.f70192g;
                    j13 -= (long) (oVar.f70188c - oVar.f70187b);
                }
            } else {
                while (true) {
                    long j15 = ((long) (oVar.f70188c - oVar.f70187b)) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    oVar = oVar.f70191f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = oVar.f70186a;
                int iMin = (int) Math.min(oVar.f70188c, (((long) oVar.f70187b) + j14) - j13);
                for (int i10 = (int) ((((long) oVar.f70187b) + j16) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - oVar.f70187b)) + j13;
                    }
                }
                j13 += (long) (oVar.f70188c - oVar.f70187b);
                oVar = oVar.f70191f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f70154b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f70154b - j10 < i11 || fVar.j() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(((long) i12) + j10) != fVar.a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final f a(int i10) {
        if (i10 == 0) {
            return f.f70157e;
        }
        return new q(this, i10);
    }
}
