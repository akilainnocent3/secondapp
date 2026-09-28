package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class r7l extends rfi0 {
    public jxa I0;
    public ixa[] J0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public float P0;
    public float Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public int V0;
    public int W0;
    public boolean[][] X0;
    public int[][] Z0;
    public int a1;
    public int[][] b1;
    public boolean K0 = false;
    public final HashSet Y0 = new HashSet();
    public int c1 = 0;

    public r7l() {
        int[][] iArrK0;
        int[][] iArrK1;
        boolean[][] zArr;
        this.W0 = 0;
        m0();
        int[][] iArr = this.Z0;
        boolean z = iArr != null && iArr.length == this.w0 && (zArr = this.X0) != null && zArr.length == this.L0 && zArr[0].length == this.N0;
        if (!z) {
            i0();
        }
        if (z) {
            for (int i = 0; i < this.X0.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr2 = this.X0;
                    if (i2 < zArr2[0].length) {
                        zArr2[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.Z0.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr2 = this.Z0;
                    if (i4 < iArr2[0].length) {
                        iArr2[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.W0 = 0;
        String str = this.U0;
        if (str != null && !str.trim().isEmpty() && (iArrK1 = k0(this.U0, false)) != null) {
            g0(iArrK1);
        }
        String str2 = this.T0;
        if (str2 == null || str2.trim().isEmpty() || (iArrK0 = k0(this.T0, true)) == null) {
            return;
        }
        h0(iArrK0);
    }

    public static void c0(ixa ixaVar) {
        ixaVar.o0[1] = -1.0f;
        ixaVar.L.j();
        ixaVar.N.j();
        ixaVar.O.j();
    }

    public static float[] l0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // defpackage.rfi0
    public final void a0(int i, int i2, int i3, int i4) {
        int[][] iArrK0;
        this.I0 = (jxa) this.W;
        if (this.L0 >= 1 && this.N0 >= 1) {
            this.W0 = 0;
            String str = this.U0;
            if (str != null && !str.trim().isEmpty() && (iArrK0 = k0(this.U0, false)) != null) {
                g0(iArrK0);
            }
            String str2 = this.T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.b1 = k0(this.T0, true);
            }
            int iMax = Math.max(this.L0, this.N0);
            ixa[] ixaVarArr = this.J0;
            ixa.a aVar = ixa.a.c;
            if (ixaVarArr == null) {
                this.J0 = new ixa[iMax];
                int i5 = 0;
                while (true) {
                    ixa[] ixaVarArr2 = this.J0;
                    if (i5 >= ixaVarArr2.length) {
                        break;
                    }
                    ixa ixaVar = new ixa();
                    ixa.a[] aVarArr = ixaVar.V;
                    aVarArr[0] = aVar;
                    aVarArr[1] = aVar;
                    ixaVar.k = String.valueOf(ixaVar.hashCode());
                    ixaVarArr2[i5] = ixaVar;
                    i5++;
                }
            } else if (iMax != ixaVarArr.length) {
                ixa[] ixaVarArr3 = new ixa[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    ixa[] ixaVarArr4 = this.J0;
                    if (i6 < ixaVarArr4.length) {
                        ixaVarArr3[i6] = ixaVarArr4[i6];
                    } else {
                        ixa ixaVar2 = new ixa();
                        ixa.a[] aVarArr2 = ixaVar2.V;
                        aVarArr2[0] = aVar;
                        aVarArr2[1] = aVar;
                        ixaVar2.k = String.valueOf(ixaVar2.hashCode());
                        ixaVarArr3[i6] = ixaVar2;
                    }
                }
                while (true) {
                    ixa[] ixaVarArr5 = this.J0;
                    if (iMax >= ixaVarArr5.length) {
                        break;
                    }
                    ixa ixaVar3 = ixaVarArr5[iMax];
                    this.I0.v0.remove(ixaVar3);
                    ixaVar3.E();
                    iMax++;
                }
                this.J0 = ixaVarArr3;
            }
            int[][] iArr = this.b1;
            if (iArr != null) {
                h0(iArr);
            }
        }
        jxa jxaVar = this.I0;
        ixa[] ixaVarArr6 = this.J0;
        jxaVar.getClass();
        for (ixa ixaVar4 : ixaVarArr6) {
            jxaVar.W(ixaVar4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b4  */
    @Override // defpackage.ixa
    public final void c(ofs ofsVar, boolean z) {
        int i;
        int i2;
        r7l r7lVar;
        int[][] iArr;
        int i3;
        super.c(ofsVar, z);
        int iMax = Math.max(this.L0, this.N0);
        ixa ixaVar = this.J0[0];
        float[] fArrL0 = l0(this.L0, this.R0);
        int i4 = this.L0;
        ewa ewaVar = this.N;
        ewa ewaVar2 = this.L;
        if (i4 == 1) {
            c0(ixaVar);
            ixaVar.L.a(ewaVar2, 0);
            ixaVar.N.a(ewaVar, 0);
        } else {
            int i5 = 0;
            while (true) {
                i = this.L0;
                if (i5 >= i) {
                    break;
                }
                ixa ixaVar2 = this.J0[i5];
                c0(ixaVar2);
                ewa ewaVar3 = ixaVar2.L;
                if (fArrL0 != null) {
                    ixaVar2.o0[1] = fArrL0[i5];
                }
                if (i5 > 0) {
                    ewaVar3.a(this.J0[i5 - 1].N, 0);
                } else {
                    ewaVar3.a(ewaVar2, 0);
                }
                int i6 = this.L0 - 1;
                ewa ewaVar4 = ixaVar2.N;
                if (i5 < i6) {
                    ewaVar4.a(this.J0[i5 + 1].L, 0);
                } else {
                    ewaVar4.a(ewaVar, 0);
                }
                if (i5 > 0) {
                    ewaVar3.g = (int) this.Q0;
                }
                i5++;
            }
            while (i < iMax) {
                ixa ixaVar3 = this.J0[i];
                c0(ixaVar3);
                ixaVar3.L.a(ewaVar2, 0);
                ixaVar3.N.a(ewaVar, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.L0, this.N0);
        ixa ixaVar4 = this.J0[0];
        float[] fArrL1 = l0(this.N0, this.S0);
        int i7 = this.N0;
        ewa ewaVar5 = this.M;
        ewa ewaVar6 = this.K;
        if (i7 == 1) {
            float[] fArr = ixaVar4.o0;
            ewa ewaVar7 = ixaVar4.M;
            ewa ewaVar8 = ixaVar4.K;
            fArr[0] = -1.0f;
            ewaVar8.j();
            ewaVar7.j();
            ewaVar8.a(ewaVar6, 0);
            ewaVar7.a(ewaVar5, 0);
        } else {
            int i8 = 0;
            while (true) {
                i2 = this.N0;
                if (i8 >= i2) {
                    break;
                }
                ixa ixaVar5 = this.J0[i8];
                float[] fArr2 = ixaVar5.o0;
                ewa ewaVar9 = ixaVar5.M;
                ewa ewaVar10 = ixaVar5.K;
                fArr2[0] = -1.0f;
                ewaVar10.j();
                ewaVar9.j();
                if (fArrL1 != null) {
                    ixaVar5.o0[0] = fArrL1[i8];
                }
                if (i8 > 0) {
                    ewaVar10.a(this.J0[i8 - 1].M, 0);
                } else {
                    ewaVar10.a(ewaVar6, 0);
                }
                if (i8 < this.N0 - 1) {
                    ewaVar9.a(this.J0[i8 + 1].K, 0);
                } else {
                    ewaVar9.a(ewaVar5, 0);
                }
                if (i8 > 0) {
                    ewaVar10.g = (int) this.P0;
                }
                i8++;
            }
            while (i2 < iMax2) {
                ixa ixaVar6 = this.J0[i2];
                float[] fArr3 = ixaVar6.o0;
                ewa ewaVar11 = ixaVar6.M;
                ewa ewaVar12 = ixaVar6.K;
                fArr3[0] = -1.0f;
                ewaVar12.j();
                ewaVar11.j();
                ewaVar12.a(ewaVar6, 0);
                ewaVar11.a(ewaVar5, 0);
                i2++;
            }
        }
        int i9 = 0;
        while (i9 < this.w0) {
            if (this.Y0.contains(this.v0[i9].k)) {
                r7lVar = this;
            } else {
                boolean z2 = false;
                int i10 = 0;
                while (!z2) {
                    i10 = this.W0;
                    if (i10 >= this.L0 * this.N0) {
                        i10 = -1;
                        break;
                    }
                    int iF0 = this.f0(i10);
                    int iE0 = this.e0(this.W0);
                    boolean[] zArr = this.X0[iF0];
                    if (zArr[iE0]) {
                        zArr[iE0] = false;
                        z2 = true;
                    }
                    this.W0++;
                }
                int iF1 = this.f0(i10);
                int iE1 = this.e0(i10);
                if (i10 == -1) {
                    return;
                }
                if ((this.a1 & 2) <= 0 || (iArr = this.b1) == null || (i3 = this.c1) >= iArr.length) {
                    r7lVar = this;
                    r7lVar.d0(r7lVar.v0[i9], iF1, iE1, 1, 1);
                } else {
                    int[] iArr2 = iArr[i3];
                    if (iArr2[0] == i10) {
                        this.X0[iF1][iE1] = true;
                        if (this.j0(iF1, iE1, iArr2[1], iArr2[2])) {
                            ixa ixaVar7 = this.v0[i9];
                            int[] iArr3 = this.b1[this.c1];
                            r7lVar = this;
                            r7lVar.d0(ixaVar7, iF1, iE1, iArr3[1], iArr3[2]);
                            r7lVar.c1++;
                        } else {
                            r7lVar = this;
                        }
                    } else {
                        r7lVar = this;
                        r7lVar.d0(r7lVar.v0[i9], iF1, iE1, 1, 1);
                    }
                }
            }
            i9++;
            this = r7lVar;
        }
    }

    public final void d0(ixa ixaVar, int i, int i2, int i3, int i4) {
        ixaVar.K.a(this.J0[i2].K, 0);
        ixaVar.L.a(this.J0[i].L, 0);
        ixaVar.M.a(this.J0[(i2 + i4) - 1].M, 0);
        ixaVar.N.a(this.J0[(i + i3) - 1].N, 0);
    }

    public final int e0(int i) {
        return this.V0 == 1 ? i / this.L0 : i % this.N0;
    }

    public final int f0(int i) {
        return this.V0 == 1 ? i % this.L0 : i / this.N0;
    }

    public final void g0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!j0(f0(iArr2[0]), e0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void h0(int[][] iArr) {
        if ((this.a1 & 2) > 0) {
            return;
        }
        int i = 0;
        while (i < iArr.length) {
            int iF0 = this.f0(iArr[i][0]);
            int iE0 = this.e0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!this.j0(iF0, iE0, iArr2[1], iArr2[2])) {
                return;
            }
            ixa ixaVar = this.v0[i];
            int[] iArr3 = iArr[i];
            r7l r7lVar = this;
            r7lVar.d0(ixaVar, iF0, iE0, iArr3[1], iArr3[2]);
            r7lVar.Y0.add(r7lVar.v0[i].k);
            i++;
            this = r7lVar;
        }
    }

    public final void i0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.L0, this.N0);
        this.X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.w0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean j0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.X0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] k0(String str, boolean z) {
        int i;
        int i2;
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new q7l());
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.L0 != 1 && this.N0 != 1) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String[] strArrSplit2 = strArrSplit[i3].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i3][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.a1 & 1) > 0) {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i3][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i3][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                String[] strArrSplit4 = strArrSplit[i6].trim().split(":");
                iArr[i6][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i6];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.N0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i4 += iArr[i6][1];
                    if (z) {
                        i4--;
                    }
                }
                if (this.L0 == 1) {
                    iArr[i6][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i6][2];
                    if (z) {
                        i5--;
                    }
                }
            }
            if (i4 != 0 && !this.K0 && (i2 = this.L0 + i4) <= 50 && this.M0 != i2) {
                this.M0 = i2;
                m0();
                i0();
            }
            if (i5 != 0 && !this.K0 && (i = this.N0 + i5) <= 50 && this.O0 != i) {
                this.O0 = i;
                m0();
                i0();
            }
            this.K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void m0() {
        int i;
        int i2 = this.M0;
        if (i2 != 0 && (i = this.O0) != 0) {
            this.L0 = i2;
            this.N0 = i;
            return;
        }
        int i3 = this.O0;
        if (i3 > 0) {
            this.N0 = i3;
            this.L0 = ((this.w0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.L0 = i2;
            this.N0 = ((this.w0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.w0) + 1.5d);
            this.L0 = iSqrt;
            this.N0 = ((this.w0 + iSqrt) - 1) / iSqrt;
        }
    }
}
