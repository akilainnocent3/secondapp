package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9659b = -9187201950435737472L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f9660c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9661d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f9662e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f9663f = 16;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        public static void h(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws y1 {
            if (m(byte2) || (((byte1 << 28) + (byte2 + 112)) >> 30) != 0 || m(byte3) || m(byte4)) {
                throw y1.j();
            }
            int iR = ((byte1 & 7) << 18) | (r(byte2) << 12) | (r(byte3) << 6) | r(byte4);
            resultArr[resultPos] = l(iR);
            resultArr[resultPos + 1] = q(iR);
        }

        public static void i(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        public static void j(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws y1 {
            if (m(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || m(byte3)))) {
                throw y1.j();
            }
            resultArr[resultPos] = (char) (((byte1 & zi.c.f161639q) << 12) | (r(byte2) << 6) | r(byte3));
        }

        public static void k(byte byte1, byte byte2, char[] resultArr, int resultPos) throws y1 {
            if (byte1 < -62 || m(byte2)) {
                throw y1.j();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | r(byte2));
        }

        public static char l(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        public static boolean m(byte b10) {
            return b10 > -65;
        }

        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        public static boolean o(byte b10) {
            return b10 < -16;
        }

        public static boolean p(byte b10) {
            return b10 < -32;
        }

        public static char q(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        public static int r(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public static int m(final ByteBuffer buffer, int index, final int limit) {
            int iM = index + c5.m(buffer, index, limit);
            while (iM < limit) {
                int i10 = iM + 1;
                byte b10 = buffer.get(iM);
                if (b10 >= 0) {
                    iM = i10;
                } else if (b10 < -32) {
                    if (i10 >= limit) {
                        return b10;
                    }
                    if (b10 < -62 || buffer.get(i10) > -65) {
                        return -1;
                    }
                    iM += 2;
                } else {
                    if (b10 >= -16) {
                        if (i10 >= limit - 2) {
                            return c5.q(buffer, b10, i10, limit - i10);
                        }
                        int i11 = iM + 2;
                        byte b11 = buffer.get(i10);
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i12 = iM + 3;
                            if (buffer.get(i11) <= -65) {
                                iM += 4;
                                if (buffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= limit - 1) {
                        return c5.q(buffer, b10, i10, limit - i10);
                    }
                    int i13 = iM + 2;
                    byte b12 = buffer.get(i10);
                    if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || buffer.get(i13) > -65))) {
                        return -1;
                    }
                    iM += 3;
                }
            }
            return 0;
        }

        public final String a(ByteBuffer buffer, int index, int size) throws y1 {
            if (buffer.hasArray()) {
                return b(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? d(buffer, index, size) : c(buffer, index, size);
        }

        public abstract String b(byte[] bytes, int index, int size) throws y1;

        public final String c(ByteBuffer buffer, int index, int size) throws y1 {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = buffer.get(index);
                if (!a.n(b10)) {
                    break;
                }
                index++;
                a.i(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = buffer.get(index);
                if (a.n(b11)) {
                    int i14 = i12 + 1;
                    a.i(b11, cArr, i12);
                    while (i13 < i10) {
                        byte b12 = buffer.get(i13);
                        if (!a.n(b12)) {
                            break;
                        }
                        i13++;
                        a.i(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i13;
                } else if (a.p(b11)) {
                    if (i13 >= i10) {
                        throw y1.j();
                    }
                    index += 2;
                    a.k(b11, buffer.get(i13), cArr, i12);
                    i12++;
                } else if (a.o(b11)) {
                    if (i13 >= i10 - 1) {
                        throw y1.j();
                    }
                    int i15 = index + 2;
                    index += 3;
                    a.j(b11, buffer.get(i13), buffer.get(i15), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw y1.j();
                    }
                    byte b13 = buffer.get(i13);
                    int i16 = index + 3;
                    byte b14 = buffer.get(index + 2);
                    index += 4;
                    a.h(b11, b13, b14, buffer.get(i16), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        public abstract String d(ByteBuffer buffer, int index, int size) throws y1;

        public abstract int e(String in2, byte[] out, int offset, int length);

        public final void f(String in2, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                a2.e(out, c5.i(in2, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                h(in2, out);
            } else {
                g(in2, out);
            }
        }

        public final void g(String in2, ByteBuffer out) {
            int length = in2.length();
            int iPosition = out.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char cCharAt = in2.charAt(i10);
                    if (cCharAt >= 128) {
                        break;
                    }
                    out.put(iPosition + i10, (byte) cCharAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i10 == length) {
                a2.e(out, iPosition + i10);
                return;
            }
            iPosition += i10;
            while (i10 < length) {
                char cCharAt2 = in2.charAt(i10);
                if (cCharAt2 < 128) {
                    out.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i11 = iPosition + 1;
                    try {
                        out.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        out.put(i11, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i11;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            try {
                                char cCharAt3 = in2.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i13 = iPosition + 1;
                                    try {
                                        out.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i14 = iPosition + 2;
                                        try {
                                            out.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            out.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                            out.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i10 = i12;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i10 = i12;
                                            iPosition = i14;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i13;
                                        i10 = i12;
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i10 = i12;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(i10) + " at index " + (out.position() + Math.max(i10, (iPosition - out.position()) + 1)));
                        }
                        throw new d(i10, length);
                    }
                    int i15 = iPosition + 1;
                    out.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    out.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    out.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i10++;
                iPosition++;
            }
            a2.e(out, iPosition);
        }

        public abstract void h(String in2, ByteBuffer out);

        public final boolean i(ByteBuffer buffer, int index, int limit) {
            return k(0, buffer, index, limit) == 0;
        }

        public final boolean j(byte[] bytes, int index, int limit) {
            return l(0, bytes, index, limit) == 0;
        }

        public final int k(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? o(state, buffer, index, limit) : n(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return l(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        public abstract int l(int state, byte[] bytes, int index, int limit);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int n(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.datastore.preferences.protobuf.c5.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.datastore.preferences.protobuf.c5.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.datastore.preferences.protobuf.c5.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c5.b.n(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int o(final int state, final ByteBuffer buffer, int index, final int limit);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends b {
        public static int p(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return q(bytes, index, limit);
        }

        public static int q(byte[] bytes, int index, int limit) {
            while (index < limit) {
                int i10 = index + 1;
                byte b10 = bytes[index];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i10 >= limit) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            index += 2;
                            if (bytes[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 >= -16) {
                        if (i10 >= limit - 2) {
                            return c5.r(bytes, i10, limit);
                        }
                        int i11 = index + 2;
                        byte b11 = bytes[i10];
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i12 = index + 3;
                            if (bytes[i11] <= -65) {
                                index += 4;
                                if (bytes[i12] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= limit - 1) {
                        return c5.r(bytes, i10, limit);
                    }
                    int i13 = index + 2;
                    byte b12 = bytes[i10];
                    if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                        index += 3;
                        if (bytes[i13] > -65) {
                        }
                    }
                    return -1;
                }
                index = i10;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public String b(byte[] bytes, int index, int size) throws y1 {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = bytes[index];
                if (!a.n(b10)) {
                    break;
                }
                index++;
                a.i(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = bytes[index];
                if (a.n(b11)) {
                    int i14 = i12 + 1;
                    a.i(b11, cArr, i12);
                    while (i13 < i10) {
                        byte b12 = bytes[i13];
                        if (!a.n(b12)) {
                            break;
                        }
                        i13++;
                        a.i(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i13;
                } else if (a.p(b11)) {
                    if (i13 >= i10) {
                        throw y1.j();
                    }
                    index += 2;
                    a.k(b11, bytes[i13], cArr, i12);
                    i12++;
                } else if (a.o(b11)) {
                    if (i13 >= i10 - 1) {
                        throw y1.j();
                    }
                    int i15 = index + 2;
                    index += 3;
                    a.j(b11, bytes[i13], bytes[i15], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw y1.j();
                    }
                    byte b13 = bytes[i13];
                    int i16 = index + 3;
                    byte b14 = bytes[index + 2];
                    index += 4;
                    a.h(b11, b13, b14, bytes[i16], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public String d(ByteBuffer buffer, int index, int size) throws y1 {
            return c(buffer, index, size);
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public int e(String in2, byte[] out, int offset, int length) {
            int i10;
            int i11;
            char cCharAt;
            int length2 = in2.length();
            int i12 = length + offset;
            int i13 = 0;
            while (i13 < length2 && (i11 = i13 + offset) < i12 && (cCharAt = in2.charAt(i13)) < 128) {
                out[i11] = (byte) cCharAt;
                i13++;
            }
            if (i13 == length2) {
                return offset + length2;
            }
            int i14 = offset + i13;
            while (i13 < length2) {
                char cCharAt2 = in2.charAt(i13);
                if (cCharAt2 < 128 && i14 < i12) {
                    out[i14] = (byte) cCharAt2;
                    i14++;
                } else if (cCharAt2 < 2048 && i14 <= i12 - 2) {
                    int i15 = i14 + 1;
                    out[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                    i14 += 2;
                    out[i15] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i14 > i12 - 3) {
                        if (i14 > i12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i13 + 1) == in2.length() || !Character.isSurrogatePair(cCharAt2, in2.charAt(i10)))) {
                                throw new d(i13, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i14);
                        }
                        int i16 = i13 + 1;
                        if (i16 != in2.length()) {
                            char cCharAt3 = in2.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                out[i14] = (byte) ((codePoint >>> 18) | 240);
                                out[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i17 = i14 + 3;
                                out[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                out[i17] = (byte) ((codePoint & 63) | 128);
                                i13 = i16;
                            } else {
                                i13 = i16;
                            }
                        }
                        throw new d(i13 - 1, length2);
                    }
                    out[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i18 = i14 + 2;
                    out[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i14 += 3;
                    out[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
                i13++;
            }
            return i14;
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public void h(String in2, ByteBuffer out) {
            g(in2, out);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.c5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.c5.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.c5.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.c5.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c5.c.l(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public int o(int state, ByteBuffer buffer, int index, int limit) {
            return n(state, buffer, index, limit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends IllegalArgumentException {
        public d(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends b {
        public static boolean p() {
            return b5.U() && b5.V();
        }

        public static int q(long address, int remaining) {
            int iS = s(address, remaining);
            long j10 = address + ((long) iS);
            int i10 = remaining - iS;
            while (true) {
                byte bA = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    bA = b5.A(j10);
                    if (bA < 0) {
                        j10 = j11;
                        break;
                    }
                    i10--;
                    j10 = j11;
                }
                if (i10 == 0) {
                    return 0;
                }
                int i11 = i10 - 1;
                if (bA < -32) {
                    if (i11 == 0) {
                        return bA;
                    }
                    i10 -= 2;
                    if (bA >= -62) {
                        long j12 = 1 + j10;
                        if (b5.A(j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (bA >= -16) {
                    if (i11 < 3) {
                        return u(j10, bA, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte bA2 = b5.A(j10);
                    if (bA2 <= -65 && (((bA << 28) + (bA2 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (b5.A(j13) <= -65) {
                            j10 += 3;
                            if (b5.A(j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return u(j10, bA, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte bA3 = b5.A(j10);
                if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                    j10 += 2;
                    if (b5.A(j15) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int r(final byte[] bytes, long offset, int remaining) {
            int iT = t(bytes, offset, remaining);
            int i10 = remaining - iT;
            long j10 = offset + ((long) iT);
            while (true) {
                byte bC = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    bC = b5.C(bytes, j10);
                    if (bC < 0) {
                        j10 = j11;
                        break;
                    }
                    i10--;
                    j10 = j11;
                }
                if (i10 == 0) {
                    return 0;
                }
                int i11 = i10 - 1;
                if (bC < -32) {
                    if (i11 == 0) {
                        return bC;
                    }
                    i10 -= 2;
                    if (bC >= -62) {
                        long j12 = 1 + j10;
                        if (b5.C(bytes, j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (bC >= -16) {
                    if (i11 < 3) {
                        return v(bytes, bC, j10, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte bC2 = b5.C(bytes, j10);
                    if (bC2 <= -65 && (((bC << 28) + (bC2 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (b5.C(bytes, j13) <= -65) {
                            j10 += 3;
                            if (b5.C(bytes, j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return v(bytes, bC, j10, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte bC3 = b5.C(bytes, j10);
                if (bC3 <= -65 && ((bC != -32 || bC3 >= -96) && (bC != -19 || bC3 < -96))) {
                    j10 += 2;
                    if (b5.C(bytes, j15) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int s(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i10 = (int) ((-address) & 7);
            int i11 = i10;
            while (i11 > 0) {
                long j10 = 1 + address;
                if (b5.A(address) < 0) {
                    return i10 - i11;
                }
                i11--;
                address = j10;
            }
            int i12 = maxChars - i10;
            while (i12 >= 8 && (b5.M(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i12 -= 8;
            }
            return maxChars - i12;
        }

        public static int t(byte[] bytes, long offset, final int maxChars) {
            int i10 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i11 = 8 - (((int) offset) & 7);
            while (i10 < i11) {
                long j10 = 1 + offset;
                if (b5.C(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > maxChars || (b5.N(bytes, b5.f9619h + offset) & (-9187201950435737472L)) != 0) {
                    break;
                }
                offset += 8;
                i10 = i12;
            }
            while (i10 < maxChars) {
                long j11 = offset + 1;
                if (b5.C(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j11;
            }
            return maxChars;
        }

        public static int u(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return c5.n(byte1);
            }
            if (remaining == 1) {
                return c5.o(byte1, b5.A(address));
            }
            if (remaining == 2) {
                return c5.p(byte1, b5.A(address), b5.A(address + 1));
            }
            throw new AssertionError();
        }

        public static int v(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return c5.n(byte1);
            }
            if (remaining == 1) {
                return c5.o(byte1, b5.C(bytes, offset));
            }
            if (remaining == 2) {
                return c5.p(byte1, b5.C(bytes, offset), b5.C(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public String b(byte[] bytes, int index, int size) throws y1 {
            Charset charset = t1.f10215b;
            String str = new String(bytes, index, size, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw y1.j();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public String d(ByteBuffer buffer, int index, int size) throws y1 {
            int i10;
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jK = b5.k(buffer) + ((long) index);
            long j10 = ((long) size) + jK;
            char[] cArr = new char[size];
            int i11 = 0;
            while (jK < j10) {
                byte bA = b5.A(jK);
                if (!a.n(bA)) {
                    break;
                }
                jK++;
                a.i(bA, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (jK < j10) {
                long j11 = jK + 1;
                byte bA2 = b5.A(jK);
                if (a.n(bA2)) {
                    i10 = i12 + 1;
                    a.i(bA2, cArr, i12);
                    while (j11 < j10) {
                        byte bA3 = b5.A(j11);
                        if (!a.n(bA3)) {
                            break;
                        }
                        j11++;
                        a.i(bA3, cArr, i10);
                        i10++;
                    }
                    jK = j11;
                } else if (a.p(bA2)) {
                    if (j11 >= j10) {
                        throw y1.j();
                    }
                    jK += 2;
                    a.k(bA2, b5.A(j11), cArr, i12);
                    i12++;
                } else if (a.o(bA2)) {
                    if (j11 >= j10 - 1) {
                        throw y1.j();
                    }
                    long j12 = 2 + jK;
                    jK += 3;
                    i10 = i12 + 1;
                    a.j(bA2, b5.A(j11), b5.A(j12), cArr, i12);
                } else {
                    if (j11 >= j10 - 2) {
                        throw y1.j();
                    }
                    byte bA4 = b5.A(j11);
                    long j13 = jK + 3;
                    byte bA5 = b5.A(2 + jK);
                    jK += 4;
                    a.h(bA2, bA4, bA5, b5.A(j13), cArr, i12);
                    i12 += 2;
                }
                i12 = i10;
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public int e(final String in2, final byte[] out, final int offset, final int length) {
            long j10;
            long j11;
            long j12;
            int i10;
            char cCharAt;
            long j13 = offset;
            long j14 = ((long) length) + j13;
            int length2 = in2.length();
            if (length2 > length || out.length - length < offset) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(length2 - 1) + " at index " + (offset + length));
            }
            int i11 = 0;
            while (true) {
                j10 = 1;
                if (i11 >= length2 || (cCharAt = in2.charAt(i11)) >= 128) {
                    break;
                }
                b5.g0(out, j13, (byte) cCharAt);
                i11++;
                j13 = 1 + j13;
            }
            if (i11 == length2) {
                return (int) j13;
            }
            while (i11 < length2) {
                char cCharAt2 = in2.charAt(i11);
                if (cCharAt2 < 128 && j13 < j14) {
                    b5.g0(out, j13, (byte) cCharAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length2 || !Character.isSurrogatePair(cCharAt2, in2.charAt(i10)))) {
                                throw new d(i11, length2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i12 = i11 + 1;
                        if (i12 != length2) {
                            char cCharAt3 = in2.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                b5.g0(out, j13, (byte) ((codePoint >>> 18) | 240));
                                b5.g0(out, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                b5.g0(out, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                b5.g0(out, j15, (byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        throw new d(i11 - 1, length2);
                    }
                    b5.g0(out, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    j12 = j14;
                    long j16 = j13 + 2;
                    b5.g0(out, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    b5.g0(out, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    b5.g0(out, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    b5.g0(out, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i11++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // androidx.datastore.preferences.protobuf.c5.b
        public void h(String in2, ByteBuffer out) {
            long j10;
            char c10;
            long j11;
            int i10;
            char c11;
            char cCharAt;
            long jK = b5.k(out);
            long jPosition = ((long) out.position()) + jK;
            long jLimit = ((long) out.limit()) + jK;
            int length = in2.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + in2.charAt(length - 1) + " at index " + out.limit());
            }
            int i11 = 0;
            while (true) {
                j10 = 1;
                c10 = 128;
                if (i11 >= length || (cCharAt = in2.charAt(i11)) >= 128) {
                    break;
                }
                b5.e0(jPosition, (byte) cCharAt);
                i11++;
                jPosition = 1 + jPosition;
            }
            if (i11 == length) {
                a2.e(out, (int) (jPosition - jK));
                return;
            }
            while (i11 < length) {
                char cCharAt2 = in2.charAt(i11);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j11 = j10;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j12 = jPosition + j11;
                        b5.e0(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        b5.e0(j12, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jK = jK;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, in2.charAt(i10)))) {
                                    throw new d(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt3 = in2.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    b5.e0(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    b5.e0(jPosition + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = jPosition + 3;
                                    b5.e0(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    b5.e0(j13, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new d(i11 - 1, length);
                        }
                        b5.e0(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = jPosition + 2;
                        b5.e0(jPosition + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        b5.e0(j14, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    b5.e0(jPosition, (byte) cCharAt2);
                    jK = jK;
                    jLimit = jLimit;
                    c11 = c10;
                    jPosition += j10;
                    j11 = j10;
                }
                i11++;
                c10 = c11;
                j10 = j11;
                jK = jK;
                jLimit = jLimit;
            }
            a2.e(out, (int) (jPosition - jK));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.b5.C(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.b5.C(r13, r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.c5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int l(int r12, byte[] r13, final int r14, final int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c5.e.l(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (androidx.datastore.preferences.protobuf.b5.A(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (androidx.datastore.preferences.protobuf.b5.A(r2) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.c5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int o(final int r11, java.nio.ByteBuffer r12, final int r13, final int r14) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c5.e.o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f9658a = (!e.p() || androidx.datastore.preferences.protobuf.e.c()) ? new c() : new e();
    }

    public static String g(ByteBuffer buffer, int index, int size) throws y1 {
        return f9658a.a(buffer, index, size);
    }

    public static String h(byte[] bytes, int index, int size) throws y1 {
        return f9658a.b(bytes, index, size);
    }

    public static int i(String in2, byte[] out, int offset, int length) {
        return f9658a.e(in2, out, offset, length);
    }

    public static void j(String in2, ByteBuffer out) {
        f9658a.f(in2, out);
    }

    public static int k(String string) {
        int length = string.length();
        int i10 = 0;
        while (i10 < length && string.charAt(i10) < 128) {
            i10++;
        }
        int iL = length;
        while (i10 < length) {
            char cCharAt = string.charAt(i10);
            if (cCharAt >= 2048) {
                iL += l(string, i10);
                break;
            }
            iL += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iL >= length) {
            return iL;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iL) + 4294967296L));
    }

    public static int l(String string, int start) {
        int length = string.length();
        int i10 = 0;
        while (start < length) {
            char cCharAt = string.charAt(start);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(string, start) < 65536) {
                        throw new d(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i10;
    }

    public static int m(ByteBuffer buffer, int index, int limit) {
        int i10 = limit - 7;
        int i11 = index;
        while (i11 < i10 && (buffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - index;
    }

    public static int n(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    public static int o(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    public static int p(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    public static int q(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return n(byte1);
        }
        if (remaining == 1) {
            return o(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return p(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    public static int r(byte[] bytes, int index, int limit) {
        byte b10 = bytes[index - 1];
        int i10 = limit - index;
        if (i10 == 0) {
            return n(b10);
        }
        if (i10 == 1) {
            return o(b10, bytes[index]);
        }
        if (i10 == 2) {
            return p(b10, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    public static boolean s(ByteBuffer buffer) {
        return f9658a.i(buffer, buffer.position(), buffer.remaining());
    }

    public static boolean t(byte[] bytes) {
        return f9658a.j(bytes, 0, bytes.length);
    }

    public static boolean u(byte[] bytes, int index, int limit) {
        return f9658a.j(bytes, index, limit);
    }

    public static int v(int state, ByteBuffer buffer, int index, int limit) {
        return f9658a.k(state, buffer, index, limit);
    }

    public static int w(int state, byte[] bytes, int index, int limit) {
        return f9658a.l(state, bytes, index, limit);
    }
}
