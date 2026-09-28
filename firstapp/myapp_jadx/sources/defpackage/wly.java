package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class wly {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final nsz g = new nsz(255);

    public final boolean a(l4h l4hVar, boolean z) throws ssz, EOFException {
        boolean zC;
        boolean zC2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        nsz nszVar = this.g;
        nszVar.F(27);
        try {
            zC = l4hVar.c(nszVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zC = false;
        }
        if (zC && nszVar.y() == 1332176723) {
            if (nszVar.w() == 0) {
                this.a = nszVar.w();
                this.b = nszVar.m();
                nszVar.n();
                nszVar.n();
                nszVar.n();
                int iW = nszVar.w();
                this.c = iW;
                this.d = iW + 27;
                nszVar.F(iW);
                try {
                    zC2 = l4hVar.c(nszVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zC2 = false;
                }
                if (zC2) {
                    for (int i = 0; i < this.c; i++) {
                        int iW2 = nszVar.w();
                        this.f[i] = iW2;
                        this.e += iW2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ssz.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean b(l4h l4hVar, long j) {
        boolean zC;
        ly0.b(l4hVar.getPosition() == l4hVar.h());
        nsz nszVar = this.g;
        nszVar.F(4);
        while (true) {
            if (j != -1 && l4hVar.getPosition() + 4 >= j) {
                break;
            }
            try {
                zC = l4hVar.c(nszVar.a, 0, 4, true);
            } catch (EOFException unused) {
                zC = false;
            }
            if (!zC) {
                break;
            }
            nszVar.I(0);
            if (nszVar.y() == 1332176723) {
                l4hVar.e();
                return true;
            }
            l4hVar.l(1);
        }
        do {
            if (j != -1 && l4hVar.getPosition() >= j) {
                break;
            }
        } while (l4hVar.j(1) != -1);
        return false;
    }
}
