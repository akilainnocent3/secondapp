package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class rt {
    public static void a(long j10, jb2 jb2Var, m73[] m73VarArr) {
        int i10;
        int iM;
        while (true) {
            if (jb2Var.f151003c - jb2Var.f151002b <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (jb2Var.f151003c - jb2Var.f151002b == 0) {
                    i10 = -1;
                    break;
                }
                int iM2 = jb2Var.m();
                i11 += iM2;
                if (iM2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (jb2Var.f151003c - jb2Var.f151002b == 0) {
                    i12 = -1;
                    break;
                } else {
                    iM = jb2Var.m();
                    i12 += iM;
                }
            } while (iM == 255);
            int i13 = jb2Var.f151002b;
            int i14 = i13 + i12;
            if (i12 == -1 || i12 > jb2Var.f151003c - i13) {
                ih1.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i14 = jb2Var.f151003c;
            } else if (i10 == 4 && i12 >= 8) {
                int iM3 = jb2Var.m();
                int iR = jb2Var.r();
                int iB = iR == 49 ? jb2Var.b() : 0;
                int iM4 = jb2Var.m();
                if (iR == 47) {
                    jb2Var.e(jb2Var.f151002b + 1);
                }
                boolean z10 = iM3 == 181 && (iR == 49 || iR == 47) && iM4 == 3;
                if (iR == 49) {
                    z10 &= iB == 1195456820;
                }
                if (z10) {
                    b(j10, jb2Var, m73VarArr);
                }
            }
            jb2Var.e(i14);
        }
    }

    public static void b(long j10, jb2 jb2Var, m73[] m73VarArr) {
        long j11;
        int iM = jb2Var.m();
        if ((iM & 64) != 0) {
            jb2Var.e(jb2Var.f151002b + 1);
            int i10 = (iM & 31) * 3;
            int i11 = jb2Var.f151002b;
            int length = m73VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                m73 m73Var = m73VarArr[i12];
                jb2Var.e(i11);
                m73Var.a(i10, jb2Var);
                if (j10 != -9223372036854775807L) {
                    j11 = j10;
                    m73Var.a(j11, 1, i10, 0, null);
                } else {
                    j11 = j10;
                }
                i12++;
                j10 = j11;
            }
        }
    }
}
