package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fuh extends d8e0 {
    public huh n;
    public a o;

    public static final class a implements xly {
        public huh a;
        public huh.a b;
        public long c;
        public long d;

        @Override // defpackage.xly
        public final long a(l4h l4hVar) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // defpackage.xly
        public final p480 b() {
            ly0.f(this.c != -1);
            return new guh(this.a, this.c);
        }

        @Override // defpackage.xly
        public final void c(long j) {
            long[] jArr = this.b.a;
            this.d = jArr[jrh0.e(jArr, j, true)];
        }
    }

    @Override // defpackage.d8e0
    public final long b(nsz nszVar) {
        byte[] bArr = nszVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            nszVar.J(4);
            nszVar.D();
        }
        int iB = duh.b(i, nszVar);
        nszVar.I(0);
        return iB;
    }

    @Override // defpackage.d8e0
    public final boolean c(nsz nszVar, long j, d8e0.a aVar) {
        byte[] bArr = nszVar.a;
        huh huhVar = this.n;
        if (huhVar == null) {
            huh huhVar2 = new huh(17, bArr);
            this.n = huhVar2;
            androidx.media3.common.a.C0062a c0062aA = huhVar2.c(Arrays.copyOfRange(bArr, 9, nszVar.c), null).a();
            c0062aA.l = gqv.m("audio/ogg");
            aVar.a = new androidx.media3.common.a(c0062aA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.c = j;
                aVar.b = aVar2;
            }
            aVar.a.getClass();
            return false;
        }
        huh.a aVarB = euh.b(nszVar);
        huh huhVar3 = new huh(huhVar.a, huhVar.b, huhVar.c, huhVar.d, huhVar.e, huhVar.g, huhVar.h, huhVar.j, aVarB, huhVar.l);
        this.n = huhVar3;
        a aVar3 = new a();
        aVar3.a = huhVar3;
        aVar3.b = aVarB;
        aVar3.c = -1L;
        aVar3.d = -1L;
        this.o = aVar3;
        return true;
    }

    @Override // defpackage.d8e0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
