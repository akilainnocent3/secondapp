package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sxg0 extends b64 {

    public static final class a implements b64.f {
        public final zxf0 a;
        public final nsz b = new nsz();
        public final int c;

        public a(int i, zxf0 zxf0Var) {
            this.c = i;
            this.a = zxf0Var;
        }

        @Override // b64.f
        public final b64.e a(l4h l4hVar, long j) {
            long j2;
            long position = l4hVar.getPosition();
            int iMin = (int) Math.min(112800L, l4hVar.getLength() - position);
            nsz nszVar = this.b;
            nszVar.F(iMin);
            l4hVar.m(nszVar.a, 0, iMin);
            int i = nszVar.c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                if (nszVar.a() < 188) {
                    j2 = -9223372036854775807L;
                    break;
                }
                byte[] bArr = nszVar.a;
                int i2 = nszVar.b;
                while (true) {
                    if (i2 >= i) {
                        j2 = -9223372036854775807L;
                        break;
                    }
                    j2 = -9223372036854775807L;
                    if (bArr[i2] == 71) {
                        break;
                    }
                    i2++;
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long jA = xxg0.a(nszVar, i2, this.c);
                if (jA != j2) {
                    long jB = this.a.b(jA);
                    if (jB > j) {
                        return j5 == j2 ? new b64.e(-1, jB, position) : new b64.e(0, -9223372036854775807L, position + j4);
                    }
                    j5 = jB;
                    if (100000 + j5 > j) {
                        return new b64.e(0, -9223372036854775807L, position + ((long) i2));
                    }
                    j4 = i2;
                }
                nszVar.I(i3);
                j3 = i3;
            }
            return j5 != j2 ? new b64.e(-2, j5, position + j3) : b64.e.d;
        }

        @Override // b64.f
        public final void b() {
            byte[] bArr = jrh0.b;
            this.b.G(bArr.length, bArr);
        }
    }
}
