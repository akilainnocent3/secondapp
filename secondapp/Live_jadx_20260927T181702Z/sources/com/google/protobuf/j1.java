package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final b processor;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || (((byte1 << 28) + (byte2 + 112)) >> 30) != 0 || isNotTrailingByte(byte3) || isNotTrailingByte(byte4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12) | (trailingByteValue(byte3) << 6) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(iTrailingByteValue);
            resultArr[resultPos + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(byte2) || ((byte1 == -32 && byte2 < -96) || ((byte1 == -19 && byte2 >= -96) || isNotTrailingByte(byte3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & zi.c.f161639q) << 12) | (trailingByteValue(byte2) << 6) | trailingByteValue(byte3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws InvalidProtocolBufferException {
            if (byte1 < -62 || isNotTrailingByte(byte2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b10) {
            return b10 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b10) {
            return b10 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b10) {
            return b10 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b10) {
            return b10 < -32;
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }

        private static int trailingByteValue(byte b10) {
            return b10 & 63;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public final String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if (buffer.hasArray()) {
                return decodeUtf8(buffer.array(), buffer.arrayOffset() + index, size);
            }
            return buffer.isDirect() ? decodeUtf8Direct(buffer, index, size) : decodeUtf8Default(buffer, index, size);
        }

        public abstract String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = buffer.get(index);
                if (!a.isOneByte(b10)) {
                    break;
                }
                index++;
                a.handleOneByte(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = buffer.get(index);
                if (a.isOneByte(b11)) {
                    int i14 = i12 + 1;
                    a.handleOneByte(b11, cArr, i12);
                    while (i13 < i10) {
                        byte b12 = buffer.get(i13);
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        i13++;
                        a.handleOneByte(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i13;
                } else if (a.isTwoBytes(b11)) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    a.handleTwoBytes(b11, buffer.get(i13), cArr, i12);
                    i12++;
                } else if (a.isThreeBytes(b11)) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i15 = index + 2;
                    index += 3;
                    a.handleThreeBytes(b11, buffer.get(i13), buffer.get(i15), cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = buffer.get(i13);
                    int i16 = index + 3;
                    byte b14 = buffer.get(index + 2);
                    index += 4;
                    a.handleFourBytes(b11, b13, b14, buffer.get(i16), cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        public abstract String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence in2, byte[] out, int offset, int length);

        public final void encodeUtf8(CharSequence in2, ByteBuffer out) {
            if (out.hasArray()) {
                int iArrayOffset = out.arrayOffset();
                d0.position(out, j1.encode(in2, out.array(), out.position() + iArrayOffset, out.remaining()) - iArrayOffset);
            } else if (out.isDirect()) {
                encodeUtf8Direct(in2, out);
            } else {
                encodeUtf8Default(in2, out);
            }
        }

        public final void encodeUtf8Default(CharSequence in2, ByteBuffer out) {
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
                d0.position(out, iPosition + i10);
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
            d0.position(out, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence in2, ByteBuffer out);

        public final boolean isValidUtf8(byte[] bytes, int index, int limit) {
            return partialIsValidUtf8(0, bytes, index, limit) == 0;
        }

        public final int partialIsValidUtf8(final int state, final ByteBuffer buffer, int index, final int limit) {
            if (!buffer.hasArray()) {
                return buffer.isDirect() ? partialIsValidUtf8Direct(state, buffer, index, limit) : partialIsValidUtf8Default(state, buffer, index, limit);
            }
            int iArrayOffset = buffer.arrayOffset();
            return partialIsValidUtf8(state, buffer.array(), index + iArrayOffset, iArrayOffset + limit);
        }

        public abstract int partialIsValidUtf8(int state, byte[] bytes, int index, int limit);

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
        public final int partialIsValidUtf8Default(final int r7, final java.nio.ByteBuffer r8, int r9, final int r10) {
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
                int r7 = com.google.protobuf.j1.access$000(r0, r9)
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
                int r7 = com.google.protobuf.j1.access$000(r0, r1)
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
                int r7 = com.google.protobuf.j1.access$100(r0, r1, r7)
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
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j1.b.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(final int state, final ByteBuffer buffer, int index, final int limit);

        public final boolean isValidUtf8(ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8(0, buffer, index, limit) == 0;
        }

        private static int partialIsValidUtf8(final ByteBuffer buffer, int index, final int limit) {
            int iEstimateConsecutiveAscii = index + j1.estimateConsecutiveAscii(buffer, index, limit);
            while (iEstimateConsecutiveAscii < limit) {
                int i10 = iEstimateConsecutiveAscii + 1;
                byte b10 = buffer.get(iEstimateConsecutiveAscii);
                if (b10 >= 0) {
                    iEstimateConsecutiveAscii = i10;
                } else if (b10 < -32) {
                    if (i10 >= limit) {
                        return b10;
                    }
                    if (b10 < -62 || buffer.get(i10) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b10 >= -16) {
                        if (i10 >= limit - 2) {
                            return j1.incompleteStateFor(buffer, b10, i10, limit - i10);
                        }
                        int i11 = iEstimateConsecutiveAscii + 2;
                        byte b11 = buffer.get(i10);
                        if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                            int i12 = iEstimateConsecutiveAscii + 3;
                            if (buffer.get(i11) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (buffer.get(i12) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i10 >= limit - 1) {
                        return j1.incompleteStateFor(buffer, b10, i10, limit - i10);
                    }
                    int i13 = iEstimateConsecutiveAscii + 2;
                    byte b12 = buffer.get(i10);
                    if (b12 > -65 || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || buffer.get(i13) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends IllegalArgumentException {
        public d(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    static {
        processor = (!e.isAvailable() || com.google.protobuf.c.isOnAndroidDevice()) ? new c() : new e();
    }

    private j1() {
    }

    public static String decodeUtf8(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(buffer, index, size);
    }

    public static int encode(CharSequence in2, byte[] out, int offset, int length) {
        return processor.encodeUtf8(in2, out, offset, length);
    }

    public static void encodeUtf8(CharSequence in2, ByteBuffer out) {
        processor.encodeUtf8(in2, out);
    }

    public static int encodedLength(CharSequence sequence) {
        int length = sequence.length();
        int i10 = 0;
        while (i10 < length && sequence.charAt(i10) < 128) {
            i10++;
        }
        int iEncodedLengthGeneral = length;
        while (i10 < length) {
            char cCharAt = sequence.charAt(i10);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(sequence, i10);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int length = sequence.length();
        int i10 = 0;
        while (start < length) {
            char cCharAt = sequence.charAt(start);
            if (cCharAt < 2048) {
                i10 += (127 - cCharAt) >>> 31;
            } else {
                i10 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(sequence, start) < 65536) {
                        throw new d(start, length);
                    }
                    start++;
                }
            }
            start++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer buffer, int index, int limit) {
        int i10 = limit - 7;
        int i11 = index;
        while (i11 < i10 && (buffer.getLong(i11) & (-9187201950435737472L)) == 0) {
            i11 += 8;
        }
        return i11 - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1) {
        if (byte1 > -12) {
            return -1;
        }
        return byte1;
    }

    public static boolean isValidUtf8(byte[] bytes) {
        return processor.isValidUtf8(bytes, 0, bytes.length);
    }

    public static int partialIsValidUtf8(int state, byte[] bytes, int index, int limit) {
        return processor.partialIsValidUtf8(state, bytes, index, limit);
    }

    public static String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bytes, index, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2) {
        if (byte1 > -12 || byte2 > -65) {
            return -1;
        }
        return byte1 ^ (byte2 << 8);
    }

    public static boolean isValidUtf8(byte[] bytes, int index, int limit) {
        return processor.isValidUtf8(bytes, index, limit);
    }

    public static int partialIsValidUtf8(int state, ByteBuffer buffer, int index, int limit) {
        return processor.partialIsValidUtf8(state, buffer, index, limit);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends b {
        public static boolean isAvailable() {
            return i1.hasUnsafeArrayOperations() && i1.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bytes, long offset, final int maxChars) {
            int i10 = 0;
            if (maxChars < 16) {
                return 0;
            }
            int i11 = 8 - (((int) offset) & 7);
            while (i10 < i11) {
                long j10 = 1 + offset;
                if (i1.getByte(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j10;
            }
            while (true) {
                int i12 = i10 + 8;
                if (i12 > maxChars || (i1.getLong((Object) bytes, i1.BYTE_ARRAY_BASE_OFFSET + offset) & (-9187201950435737472L)) != 0) {
                    break;
                }
                offset += 8;
                i10 = i12;
            }
            while (i10 < maxChars) {
                long j11 = offset + 1;
                if (i1.getByte(bytes, offset) < 0) {
                    return i10;
                }
                i10++;
                offset = j11;
            }
            return maxChars;
        }

        private static int unsafeIncompleteStateFor(byte[] bytes, int byte1, long offset, int remaining) {
            if (remaining == 0) {
                return j1.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return j1.incompleteStateFor(byte1, i1.getByte(bytes, offset));
            }
            if (remaining == 2) {
                return j1.incompleteStateFor(byte1, i1.getByte(bytes, offset), i1.getByte(bytes, offset + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.j1.b
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bytes, index, size, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bytes, index, size + index))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.j1.b
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            int i10;
            if ((index | size | ((buffer.limit() - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(buffer.limit()), Integer.valueOf(index), Integer.valueOf(size)));
            }
            long jAddressOffset = i1.addressOffset(buffer) + ((long) index);
            long j10 = ((long) size) + jAddressOffset;
            char[] cArr = new char[size];
            int i11 = 0;
            while (jAddressOffset < j10) {
                byte b10 = i1.getByte(jAddressOffset);
                if (!a.isOneByte(b10)) {
                    break;
                }
                jAddressOffset++;
                a.handleOneByte(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (jAddressOffset < j10) {
                long j11 = jAddressOffset + 1;
                byte b11 = i1.getByte(jAddressOffset);
                if (a.isOneByte(b11)) {
                    i10 = i12 + 1;
                    a.handleOneByte(b11, cArr, i12);
                    while (j11 < j10) {
                        byte b12 = i1.getByte(j11);
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        j11++;
                        a.handleOneByte(b12, cArr, i10);
                        i10++;
                    }
                    jAddressOffset = j11;
                } else if (a.isTwoBytes(b11)) {
                    if (j11 >= j10) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    a.handleTwoBytes(b11, i1.getByte(j11), cArr, i12);
                    i12++;
                } else if (a.isThreeBytes(b11)) {
                    if (j11 >= j10 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j12 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    i10 = i12 + 1;
                    a.handleThreeBytes(b11, i1.getByte(j11), i1.getByte(j12), cArr, i12);
                } else {
                    if (j11 >= j10 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = i1.getByte(j11);
                    long j13 = jAddressOffset + 3;
                    byte b14 = i1.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    a.handleFourBytes(b11, b13, b14, i1.getByte(j13), cArr, i12);
                    i12 += 2;
                }
                i12 = i10;
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.j1.b
        public int encodeUtf8(final CharSequence in2, final byte[] out, final int offset, final int length) {
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
                i1.putByte(out, j13, (byte) cCharAt);
                i11++;
                j13 = 1 + j13;
            }
            if (i11 == length2) {
                return (int) j13;
            }
            while (i11 < length2) {
                char cCharAt2 = in2.charAt(i11);
                if (cCharAt2 < 128 && j13 < j14) {
                    i1.putByte(out, j13, (byte) cCharAt2);
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
                                i1.putByte(out, j13, (byte) ((codePoint >>> 18) | 240));
                                i1.putByte(out, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                i1.putByte(out, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                i1.putByte(out, j15, (byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        throw new d(i11 - 1, length2);
                    }
                    i1.putByte(out, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    j12 = j14;
                    long j16 = j13 + 2;
                    i1.putByte(out, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    i1.putByte(out, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    i1.putByte(out, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    i1.putByte(out, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i11++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        @Override // com.google.protobuf.j1.b
        public void encodeUtf8Direct(CharSequence in2, ByteBuffer out) {
            long j10;
            char c10;
            long j11;
            int i10;
            char c11;
            char cCharAt;
            long jAddressOffset = i1.addressOffset(out);
            long jPosition = ((long) out.position()) + jAddressOffset;
            long jLimit = ((long) out.limit()) + jAddressOffset;
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
                i1.putByte(jPosition, (byte) cCharAt);
                i11++;
                jPosition = 1 + jPosition;
            }
            if (i11 == length) {
                d0.position(out, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i11 < length) {
                char cCharAt2 = in2.charAt(i11);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j11 = j10;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j12 = jPosition + j11;
                        i1.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        i1.putByte(j12, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jAddressOffset = jAddressOffset;
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
                                    i1.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    i1.putByte(jPosition + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j13 = jPosition + 3;
                                    i1.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    i1.putByte(j13, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new d(i11 - 1, length);
                        }
                        i1.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = jPosition + 2;
                        i1.putByte(jPosition + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        i1.putByte(j14, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c11 = 128;
                } else {
                    i1.putByte(jPosition, (byte) cCharAt2);
                    jAddressOffset = jAddressOffset;
                    jLimit = jLimit;
                    c11 = c10;
                    jPosition += j10;
                    j11 = j10;
                }
                i11++;
                c10 = c11;
                j10 = j11;
                jAddressOffset = jAddressOffset;
                jLimit = jLimit;
            }
            d0.position(out, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.i1.getByte(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.i1.getByte(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r12, byte[] r13, final int r14, final int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j1.e.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
        
            if (com.google.protobuf.i1.getByte(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
        
            if (com.google.protobuf.i1.getByte(r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(final int r11, java.nio.ByteBuffer r12, final int r13, final int r14) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j1.e.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long address, final int maxChars) {
            if (maxChars < 16) {
                return 0;
            }
            int i10 = (int) ((-address) & 7);
            int i11 = i10;
            while (i11 > 0) {
                long j10 = 1 + address;
                if (i1.getByte(address) < 0) {
                    return i10 - i11;
                }
                i11--;
                address = j10;
            }
            int i12 = maxChars - i10;
            while (i12 >= 8 && (i1.getLong(address) & (-9187201950435737472L)) == 0) {
                address += 8;
                i12 -= 8;
            }
            return maxChars - i12;
        }

        private static int unsafeIncompleteStateFor(long address, final int byte1, int remaining) {
            if (remaining == 0) {
                return j1.incompleteStateFor(byte1);
            }
            if (remaining == 1) {
                return j1.incompleteStateFor(byte1, i1.getByte(address));
            }
            if (remaining == 2) {
                return j1.incompleteStateFor(byte1, i1.getByte(address), i1.getByte(address + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(final byte[] bytes, long offset, int remaining) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bytes, offset, remaining);
            int i10 = remaining - iUnsafeEstimateConsecutiveAscii;
            long j10 = offset + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b10 = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    b10 = i1.getByte(bytes, j10);
                    if (b10 < 0) {
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
                if (b10 < -32) {
                    if (i11 == 0) {
                        return b10;
                    }
                    i10 -= 2;
                    if (b10 >= -62) {
                        long j12 = 1 + j10;
                        if (i1.getByte(bytes, j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i11 < 3) {
                        return unsafeIncompleteStateFor(bytes, b10, j10, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte b11 = i1.getByte(bytes, j10);
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (i1.getByte(bytes, j13) <= -65) {
                            j10 += 3;
                            if (i1.getByte(bytes, j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return unsafeIncompleteStateFor(bytes, b10, j10, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte b12 = i1.getByte(bytes, j10);
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                    j10 += 2;
                    if (i1.getByte(bytes, j15) > -65) {
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long address, int remaining) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(address, remaining);
            long j10 = address + ((long) iUnsafeEstimateConsecutiveAscii);
            int i10 = remaining - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b10 = 0;
                while (i10 > 0) {
                    long j11 = j10 + 1;
                    b10 = i1.getByte(j10);
                    if (b10 < 0) {
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
                if (b10 < -32) {
                    if (i11 == 0) {
                        return b10;
                    }
                    i10 -= 2;
                    if (b10 >= -62) {
                        long j12 = 1 + j10;
                        if (i1.getByte(j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i11 < 3) {
                        return unsafeIncompleteStateFor(j10, b10, i11);
                    }
                    i10 -= 4;
                    long j13 = 1 + j10;
                    byte b11 = i1.getByte(j10);
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        long j14 = 2 + j10;
                        if (i1.getByte(j13) <= -65) {
                            j10 += 3;
                            if (i1.getByte(j14) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i11 < 2) {
                    return unsafeIncompleteStateFor(j10, b10, i11);
                }
                i10 -= 3;
                long j15 = 1 + j10;
                byte b12 = i1.getByte(j10);
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                    j10 += 2;
                    if (i1.getByte(j15) > -65) {
                    }
                }
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int byte1, int byte2, int byte3) {
        if (byte1 > -12 || byte2 > -65 || byte3 > -65) {
            return -1;
        }
        return (byte1 ^ (byte2 << 8)) ^ (byte3 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer buffer) {
        return processor.isValidUtf8(buffer, buffer.position(), buffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bytes, int index, int limit) {
        byte b10 = bytes[index - 1];
        int i10 = limit - index;
        if (i10 == 0) {
            return incompleteStateFor(b10);
        }
        if (i10 == 1) {
            return incompleteStateFor(b10, bytes[index]);
        }
        if (i10 == 2) {
            return incompleteStateFor(b10, bytes[index], bytes[index + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(final ByteBuffer buffer, final int byte1, final int index, final int remaining) {
        if (remaining == 0) {
            return incompleteStateFor(byte1);
        }
        if (remaining == 1) {
            return incompleteStateFor(byte1, buffer.get(index));
        }
        if (remaining == 2) {
            return incompleteStateFor(byte1, buffer.get(index), buffer.get(index + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends b {
        private static int partialIsValidUtf8NonAscii(byte[] bytes, int index, int limit) {
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
                            return j1.incompleteStateFor(bytes, i10, limit);
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
                        return j1.incompleteStateFor(bytes, i10, limit);
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

        @Override // com.google.protobuf.j1.b
        public String decodeUtf8(byte[] bytes, int index, int size) throws InvalidProtocolBufferException {
            if ((index | size | ((bytes.length - index) - size)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)));
            }
            int i10 = index + size;
            char[] cArr = new char[size];
            int i11 = 0;
            while (index < i10) {
                byte b10 = bytes[index];
                if (!a.isOneByte(b10)) {
                    break;
                }
                index++;
                a.handleOneByte(b10, cArr, i11);
                i11++;
            }
            int i12 = i11;
            while (index < i10) {
                int i13 = index + 1;
                byte b11 = bytes[index];
                if (a.isOneByte(b11)) {
                    int i14 = i12 + 1;
                    a.handleOneByte(b11, cArr, i12);
                    while (i13 < i10) {
                        byte b12 = bytes[i13];
                        if (!a.isOneByte(b12)) {
                            break;
                        }
                        i13++;
                        a.handleOneByte(b12, cArr, i14);
                        i14++;
                    }
                    i12 = i14;
                    index = i13;
                } else if (a.isTwoBytes(b11)) {
                    if (i13 >= i10) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    index += 2;
                    a.handleTwoBytes(b11, bytes[i13], cArr, i12);
                    i12++;
                } else if (a.isThreeBytes(b11)) {
                    if (i13 >= i10 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i15 = index + 2;
                    index += 3;
                    a.handleThreeBytes(b11, bytes[i13], bytes[i15], cArr, i12);
                    i12++;
                } else {
                    if (i13 >= i10 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b13 = bytes[i13];
                    int i16 = index + 3;
                    byte b14 = bytes[index + 2];
                    index += 4;
                    a.handleFourBytes(b11, b13, b14, bytes[i16], cArr, i12);
                    i12 += 2;
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // com.google.protobuf.j1.b
        public String decodeUtf8Direct(ByteBuffer buffer, int index, int size) throws InvalidProtocolBufferException {
            return decodeUtf8Default(buffer, index, size);
        }

        @Override // com.google.protobuf.j1.b
        public int encodeUtf8(CharSequence in2, byte[] out, int offset, int length) {
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

        @Override // com.google.protobuf.j1.b
        public void encodeUtf8Direct(CharSequence in2, ByteBuffer out) {
            encodeUtf8Default(in2, out);
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
        @Override // com.google.protobuf.j1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
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
                int r7 = com.google.protobuf.j1.access$000(r0, r9)
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
                int r7 = com.google.protobuf.j1.access$000(r0, r1)
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
                int r7 = com.google.protobuf.j1.access$100(r0, r1, r7)
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
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j1.c.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.j1.b
        public int partialIsValidUtf8Direct(int state, ByteBuffer buffer, int index, int limit) {
            return partialIsValidUtf8Default(state, buffer, index, limit);
        }

        private static int partialIsValidUtf8(byte[] bytes, int index, int limit) {
            while (index < limit && bytes[index] >= 0) {
                index++;
            }
            if (index >= limit) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bytes, index, limit);
        }
    }
}
