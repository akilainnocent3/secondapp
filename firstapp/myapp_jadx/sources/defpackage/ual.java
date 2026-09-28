package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class ual implements zpa0 {
    public byte a;
    public final y740 b;
    public final Inflater c;
    public final lgn d;
    public final CRC32 e;

    public ual(cc5 cc5Var) {
        cc5Var.getClass();
        y740 y740Var = new y740(cc5Var);
        this.b = y740Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new lgn(y740Var, inflater);
        this.e = new CRC32();
    }

    public static void d(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbB = mq0.b(str, ": actual 0x");
        sbB.append(StringsKt.Z(8, l.e(i2)));
        sbB.append(" != expected 0x");
        sbB.append(StringsKt.Z(8, l.e(i)));
        throw new IOException(sbB.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    public final void f(long j, lb5 lb5Var, long j2) {
        e580 e580Var = lb5Var.a;
        e580Var.getClass();
        while (true) {
            long j3 = e580Var.c - e580Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            e580Var = e580Var.f;
            e580Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) e580Var.b) + j);
            int iMin = (int) Math.min(e580Var.c - i, j2);
            this.e.update(e580Var.a, i, iMin);
            j2 -= (long) iMin;
            e580Var = e580Var.f;
            e580Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.zpa0
    public final long read(lb5 lb5Var, long j) throws IOException {
        byte b;
        ual ualVar = this;
        y740 y740Var = ualVar.b;
        lb5 lb5Var2 = y740Var.b;
        lb5Var.getClass();
        if (j < 0) {
            kb5.a(avg.a(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = ualVar.a;
        CRC32 crc32 = ualVar.e;
        if (b2 == 0) {
            y740Var.q0(10L);
            byte bM = lb5Var2.m(3L);
            boolean z = ((bM >> 1) & 1) == 1;
            if (z) {
                ualVar.f(0L, lb5Var2, 10L);
            }
            d(8075, y740Var.readShort(), "ID1ID2");
            y740Var.skip(8L);
            if (((bM >> 2) & 1) == 1) {
                y740Var.q0(2L);
                if (z) {
                    f(0L, lb5Var2, 2L);
                }
                long jP = lb5Var2.P() & 65535;
                y740Var.q0(jP);
                if (z) {
                    f(0L, lb5Var2, jP);
                }
                y740Var.skip(jP);
            }
            if (((bM >> 3) & 1) == 1) {
                long jD = y740Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(0L, lb5Var2, jD + 1);
                }
                y740Var.skip(jD + 1);
            }
            if (((bM >> 4) & 1) == 1) {
                long jD2 = y740Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    ualVar = this;
                    ualVar.f(0L, lb5Var2, jD2 + 1);
                } else {
                    ualVar = this;
                }
                y740Var.skip(jD2 + 1);
            } else {
                ualVar = this;
            }
            if (z) {
                d(y740Var.l(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            ualVar.a = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = lb5Var.b;
            long j3 = ualVar.d.read(lb5Var, j);
            if (j3 != -1) {
                ualVar.f(j2, lb5Var, j3);
                return j3;
            }
            b = 2;
            ualVar.a = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            d(y740Var.f(), (int) crc32.getValue(), "CRC");
            d(y740Var.f(), (int) ualVar.c.getBytesWritten(), "ISIZE");
            ualVar.a = (byte) 3;
            if (!y740Var.N0()) {
                i08.a("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // defpackage.zpa0
    public final sxf0 timeout() {
        return this.b.a.timeout();
    }
}
