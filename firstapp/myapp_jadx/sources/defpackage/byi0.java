package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class byi0 {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(l4h l4hVar, nsz nszVar) {
            l4hVar.m(nszVar.a, 0, 8);
            nszVar.I(0);
            return new a(nszVar.j(), nszVar.n());
        }
    }

    public static boolean a(l4h l4hVar) {
        nsz nszVar = new nsz(8);
        int i = a.a(l4hVar, nszVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        l4hVar.m(nszVar.a, 0, 4);
        nszVar.I(0);
        int iJ = nszVar.j();
        if (iJ == 1463899717) {
            return true;
        }
        cft.c("WavHeaderReader", "Unsupported form type: " + iJ);
        return false;
    }

    public static a b(int i, l4h l4hVar, nsz nszVar) throws ssz {
        a aVarA = a.a(l4hVar, nszVar);
        while (true) {
            int i2 = aVarA.a;
            if (i2 == i) {
                return aVarA;
            }
            h08.a(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = aVarA.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ssz.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            l4hVar.l((int) j2);
            aVarA = a.a(l4hVar, nszVar);
        }
    }
}
