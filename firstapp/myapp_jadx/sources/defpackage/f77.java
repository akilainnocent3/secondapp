package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f77 extends bz1 {
    public int[] i;
    public int[] j;

    @Override // defpackage.bz1
    public final j31.a a(j31.a aVar) throws j31.b {
        int i = aVar.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return j31.a.e;
        }
        int i2 = aVar.b;
        if (!jrh0.K(i)) {
            throw new j31.b(aVar);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new j31.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new j31.a(aVar.a, iArr.length, i) : j31.a.e;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    @Override // defpackage.j31
    public final void d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iT = (jrh0.t(this.b.c) * i5) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferJ.putShort(byteBuffer.getShort(iT));
                } else if (i6 == 3) {
                    byteBufferJ.put(byteBuffer.get(iT));
                } else if (i6 == 4) {
                    byteBufferJ.putFloat(byteBuffer.getFloat(iT));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iT;
                    } else {
                        i = iT + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iT + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iT += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ly0.a("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                    ly0.b(byteBufferJ.remaining() >= 3);
                    if (byteBufferJ.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferJ.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferJ.put(b3).put(b4).put((byte) i4);
                } else {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferJ.putShort(byteBuffer.getShort(iT));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iT;
                            } else {
                                i = iT + 2;
                            }
                            byte b5 = byteBuffer.get(i);
                            byte b6 = byteBuffer.get(iT + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iT += 2;
                            }
                            i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iT) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            ly0.a("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                            ly0.b(byteBufferJ.remaining() >= 3);
                            if (byteBufferJ.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b7 = (byte) i3;
                            byte b8 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferJ.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferJ.put(b7).put(b8).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            iyi.a(this.b.c, "Unexpected encoding: ");
                            return;
                        }
                    }
                    byteBufferJ.putInt(byteBuffer.getInt(iT));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // defpackage.bz1
    public final void g() {
        this.j = this.i;
    }

    @Override // defpackage.bz1
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
