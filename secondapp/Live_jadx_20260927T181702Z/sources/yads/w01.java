package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f157156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f157157d;

    public w01(List list, int i10, float f10, String str) {
        this.f157154a = list;
        this.f157155b = i10;
        this.f157156c = f10;
        this.f157157d = str;
    }

    public static w01 a(jb2 jb2Var) throws ob2 {
        boolean z10;
        boolean z11 = true;
        try {
            jb2Var.e(jb2Var.f151002b + 21);
            int iM = jb2Var.m() & 3;
            int iM2 = jb2Var.m();
            int i10 = jb2Var.f151002b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < iM2; i13++) {
                jb2Var.e(jb2Var.f151002b + 1);
                int iR = jb2Var.r();
                for (int i14 = 0; i14 < iR; i14++) {
                    int iR2 = jb2Var.r();
                    i12 += iR2 + 4;
                    jb2Var.e(jb2Var.f151002b + iR2);
                }
            }
            jb2Var.e(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String strA = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < iM2) {
                int iM3 = jb2Var.m() & 127;
                int iR3 = jb2Var.r();
                int i17 = i11;
                while (i17 < iR3) {
                    int iR4 = jb2Var.r();
                    z10 = z11;
                    try {
                        System.arraycopy(dy1.f148408a, i11, bArr, i16, 4);
                        int i18 = i16 + 4;
                        System.arraycopy(jb2Var.f151001a, jb2Var.f151002b, bArr, i18, iR4);
                        if (iM3 == 33 && i17 == 0) {
                            ay1 ay1VarA = dy1.a(bArr, i18, i18 + iR4);
                            f10 = ay1VarA.f146967g;
                            strA = jx.a(ay1VarA.f146961a, ay1VarA.f146962b, ay1VarA.f146963c, ay1VarA.f146964d, ay1VarA.f146965e, ay1VarA.f146966f);
                        }
                        i16 = i18 + iR4;
                        jb2Var.e(jb2Var.f151002b + iR4);
                        i17++;
                        z11 = z10;
                        iM = iM;
                        i11 = 0;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        e = e10;
                        boolean z12 = z10;
                        throw new ob2("Error parsing HEVC config", e, z12, z12 ? 1 : 0);
                    }
                }
                i15++;
                i11 = 0;
            }
            z10 = z11;
            return new w01(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM + 1, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            z10 = z11;
        }
    }
}
