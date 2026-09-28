package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e830 extends b64 {

    public static final class a implements b64.f {
        public final zxf0 a;
        public final nsz b = new nsz();

        public a(zxf0 zxf0Var) {
            this.a = zxf0Var;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
        @Override // b64.f
        public final b64.e a(l4h l4hVar, long j) {
            int iD;
            long position = l4hVar.getPosition();
            int iMin = (int) Math.min(20000L, l4hVar.getLength() - position);
            nsz nszVar = this.b;
            nszVar.F(iMin);
            l4hVar.m(nszVar.a, 0, iMin);
            int i = -1;
            int i2 = -1;
            long j2 = -9223372036854775807L;
            while (nszVar.a() >= 4) {
                if (e830.d(nszVar.b, nszVar.a) != 442) {
                    nszVar.J(1);
                } else {
                    nszVar.J(4);
                    long jC = f830.c(nszVar);
                    if (jC != -9223372036854775807L) {
                        long jB = this.a.b(jC);
                        if (jB > j) {
                            return j2 == -9223372036854775807L ? new b64.e(-1, jB, position) : new b64.e(0, -9223372036854775807L, position + ((long) i2));
                        }
                        j2 = jB;
                        long j3 = 100000 + j2;
                        i2 = nszVar.b;
                        if (j3 > j) {
                            return new b64.e(0, -9223372036854775807L, position + ((long) i2));
                        }
                    }
                    int i3 = nszVar.c;
                    if (nszVar.a() >= 10) {
                        nszVar.J(9);
                        int iW = nszVar.w() & 7;
                        if (nszVar.a() >= iW) {
                            nszVar.J(iW);
                            if (nszVar.a() >= 4) {
                                if (e830.d(nszVar.b, nszVar.a) != 443) {
                                    while (nszVar.a() >= 4) {
                                        iD = e830.d(nszVar.b, nszVar.a);
                                        if (iD == 442) {
                                            break;
                                        }
                                        break;
                                    }
                                }
                                nszVar.J(4);
                                int iC = nszVar.C();
                                if (nszVar.a() < iC) {
                                    nszVar.I(i3);
                                } else {
                                    nszVar.J(iC);
                                    while (nszVar.a() >= 4) {
                                        iD = e830.d(nszVar.b, nszVar.a);
                                        if (iD == 442 || iD == 441 || (iD >>> 8) != 1) {
                                            break;
                                        }
                                        nszVar.J(4);
                                        if (nszVar.a() < 2) {
                                            nszVar.I(i3);
                                            break;
                                        }
                                        nszVar.I(Math.min(nszVar.c, nszVar.b + nszVar.C()));
                                    }
                                }
                            } else {
                                nszVar.I(i3);
                            }
                        } else {
                            nszVar.I(i3);
                        }
                    } else {
                        nszVar.I(i3);
                    }
                    i = nszVar.b;
                }
            }
            return j2 != -9223372036854775807L ? new b64.e(-2, j2, position + ((long) i)) : b64.e.d;
        }

        @Override // b64.f
        public final void b() {
            byte[] bArr = jrh0.b;
            this.b.G(bArr.length, bArr);
        }
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
