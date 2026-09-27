package fh;

import androidx.annotation.Nullable;
import eh.m0;
import eh.t0;
import java.util.Collections;
import java.util.List;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f84361j = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f84362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f84366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f84368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f84369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f84370i;

    public g(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, @Nullable String str) {
        this.f84362a = list;
        this.f84363b = i10;
        this.f84364c = i11;
        this.f84365d = i12;
        this.f84366e = i13;
        this.f84367f = i14;
        this.f84368g = i15;
        this.f84369h = f10;
        this.f84370i = str;
    }

    public static g a(t0 t0Var) throws d4 {
        boolean z10;
        try {
            t0Var.Z(21);
            int iL = t0Var.L() & 3;
            int iL2 = t0Var.L();
            int iF = t0Var.f();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                z10 = true;
                if (i11 >= iL2) {
                    break;
                }
                t0Var.Z(1);
                int iR = t0Var.R();
                for (int i13 = 0; i13 < iR; i13++) {
                    int iR2 = t0Var.R();
                    i12 += iR2 + 4;
                    t0Var.Z(iR2);
                }
                i11++;
            }
            t0Var.Y(iF);
            byte[] bArr = new byte[i12];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String strC = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < iL2) {
                int iL3 = t0Var.L() & 63;
                int iR3 = t0Var.R();
                int i21 = i10;
                while (i21 < iR3) {
                    int iR4 = t0Var.R();
                    boolean z11 = z10;
                    byte[] bArr2 = m0.f81079i;
                    int i22 = iL;
                    System.arraycopy(bArr2, i10, bArr, i20, bArr2.length);
                    int length = i20 + bArr2.length;
                    System.arraycopy(t0Var.e(), t0Var.f(), bArr, length, iR4);
                    if (iL3 == 33 && i21 == 0) {
                        m0.a aVarH = m0.h(bArr, length, length + iR4);
                        i14 = aVarH.f81097k;
                        i15 = aVarH.f81098l;
                        i16 = aVarH.f81100n;
                        int i23 = aVarH.f81101o;
                        int i24 = aVarH.f81102p;
                        float f11 = aVarH.f81099m;
                        strC = eh.i.c(aVarH.f81087a, aVarH.f81088b, aVarH.f81089c, aVarH.f81090d, aVarH.f81094h, aVarH.f81095i);
                        i18 = i24;
                        f10 = f11;
                        i17 = i23;
                    }
                    i20 = length + iR4;
                    t0Var.Z(iR4);
                    i21++;
                    z10 = z11;
                    iL = i22;
                    iL2 = iL2;
                    i10 = 0;
                }
                i19++;
                i10 = 0;
            }
            return new g(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iL + 1, i14, i15, i16, i17, i18, f10, strC);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw d4.a("Error parsing HEVC config", e10);
        }
    }
}
