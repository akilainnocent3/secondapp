package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class auh extends b64 {

    public static final class a implements b64.f {
        public final huh a;
        public final int b;
        public final duh.a c = new duh.a();

        public a(huh huhVar, int i) {
            this.a = huhVar;
            this.b = i;
        }

        @Override // b64.f
        public final b64.e a(l4h l4hVar, long j) {
            long position = l4hVar.getPosition();
            long jC = c(l4hVar);
            long jH = l4hVar.h();
            l4hVar.i(Math.max(6, this.a.c));
            long jC2 = c(l4hVar);
            long jH2 = l4hVar.h();
            if (jC > j || jC2 <= j) {
                return jC2 <= j ? new b64.e(-2, jC2, jH2) : new b64.e(-1, jC, position);
            }
            return new b64.e(0, -9223372036854775807L, jH);
        }

        public final long c(l4h l4hVar) {
            duh.a aVar;
            huh huhVar;
            int iK;
            while (true) {
                long jH = l4hVar.h();
                long length = l4hVar.getLength() - 6;
                aVar = this.c;
                huhVar = this.a;
                if (jH >= length) {
                    break;
                }
                long jH2 = l4hVar.h();
                byte[] bArr = new byte[2];
                int i = 0;
                boolean zA = false;
                l4hVar.m(bArr, 0, 2);
                int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i3 = this.b;
                if (i2 != i3) {
                    l4hVar.e();
                    l4hVar.i((int) (jH2 - l4hVar.getPosition()));
                } else {
                    nsz nszVar = new nsz(16);
                    System.arraycopy(bArr, 0, nszVar.a, 0, 2);
                    byte[] bArr2 = nszVar.a;
                    while (i < 14 && (iK = l4hVar.k(bArr2, 2 + i, 14 - i)) != -1) {
                        i += iK;
                    }
                    nszVar.H(i);
                    l4hVar.e();
                    l4hVar.i((int) (jH2 - l4hVar.getPosition()));
                    zA = duh.a(nszVar, huhVar, i3, aVar);
                }
                if (zA) {
                    break;
                }
                l4hVar.i(1);
            }
            if (l4hVar.h() < l4hVar.getLength() - 6) {
                return aVar.a;
            }
            l4hVar.i((int) (l4hVar.getLength() - l4hVar.h()));
            return huhVar.j;
        }
    }
}
