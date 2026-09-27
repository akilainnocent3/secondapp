package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f46928a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f46929b = new SparseBooleanArray();

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01de A[PHI: r30
      0x01de: PHI (r30v7 int) = (r30v5 int), (r30v9 int) binds: [B:102:0x01dc, B:95:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2 A[PHI: r30
      0x01e2: PHI (r30v6 int) = (r30v5 int), (r30v9 int) binds: [B:104:0x01e0, B:97:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int[][] iArr;
        int i12;
        boolean z12;
        c cVar;
        int[][][] iArr2;
        int i13;
        int i14;
        y yVar;
        ArrayList arrayList;
        boolean z13;
        int i15;
        boolean z14;
        boolean zA;
        boolean z15;
        int i16;
        int i17;
        int iB;
        int i18;
        int i19;
        boolean z16;
        int[] iArr3;
        boolean z17 = true;
        int[] iArr4 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr5 = new int[aVarArr.length + 1][][];
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = zVar.f46913a;
            yVarArr[i20] = new y[i21];
            iArr5[i20] = new int[i21][];
        }
        int length2 = aVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i22 = 0; i22 < length2; i22++) {
            aVarArr[i22].getClass();
            iArr6[i22] = 4;
        }
        int i23 = 0;
        while (i23 < zVar.f46913a) {
            y yVar2 = zVar.f46914b[i23];
            int length3 = aVarArr.length;
            int i24 = 0;
            int i25 = 0;
            while (true) {
                if (i24 >= aVarArr.length) {
                    z16 = z17;
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i24];
                int i26 = 0;
                while (i26 < yVar2.f46909a) {
                    o oVar = yVar2.f46910b[i26];
                    z16 = z17;
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int iB2 = cVar2.b(cVar2.f46718h, oVar) & 3;
                        if (iB2 > i25) {
                            if (iB2 == 3) {
                                length3 = i24;
                                break;
                            }
                            i25 = iB2;
                            length3 = i24;
                        }
                        i26++;
                        z17 = z16;
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
                    }
                }
                i24++;
            }
            if (length3 == aVarArr.length) {
                iArr3 = new int[yVar2.f46909a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr7 = new int[yVar2.f46909a];
                for (int i27 = 0; i27 < yVar2.f46909a; i27++) {
                    o oVar2 = yVar2.f46910b[i27];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr7[i27] = cVar3.b(cVar3.f46718h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e11) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
                    }
                }
                iArr3 = iArr7;
            }
            int i28 = iArr4[length3];
            yVarArr[length3][i28] = yVar2;
            iArr5[length3][i28] = iArr3;
            iArr4[length3] = i28 + 1;
            i23++;
            z17 = z16;
        }
        boolean z18 = z17;
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr8 = new int[aVarArr.length];
        for (int i29 = 0; i29 < aVarArr.length; i29++) {
            int i30 = iArr4[i29];
            zVarArr[i29] = new z((y[]) Arrays.copyOf(yVarArr[i29], i30));
            iArr5[i29] = (int[][]) Arrays.copyOf(iArr5[i29], i30);
            iArr8[i29] = aVarArr[i29].f45569a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr4[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).f46927c.get();
        int i31 = 0;
        boolean z19 = false;
        while (i31 < length4) {
            if (2 == aVarArr[i31].f45569a) {
                if (z19) {
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i13 = i31;
                } else {
                    z zVar2 = zVarArr[i31];
                    int[][] iArr9 = iArr5[i31];
                    cVar4.getClass();
                    y yVar3 = null;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = -1;
                    int i36 = -1;
                    while (i32 < zVar2.f46913a) {
                        y yVar4 = zVar2.f46914b[i32];
                        c cVar5 = cVar4;
                        ArrayList arrayList2 = new ArrayList(yVar4.f46909a);
                        int[][][] iArr10 = iArr5;
                        for (int i37 = 0; i37 < yVar4.f46909a; i37++) {
                            arrayList2.add(Integer.valueOf(i37));
                        }
                        int[] iArr11 = iArr9[i32];
                        int i38 = i34;
                        int i39 = i35;
                        int i40 = i31;
                        int iB3 = i39;
                        int i41 = i36;
                        z zVar3 = zVar2;
                        int i42 = i41;
                        y yVar5 = yVar3;
                        int i43 = 0;
                        while (i43 < yVar4.f46909a) {
                            int i44 = i43;
                            if (d.a(iArr11[i43], z18)) {
                                o oVar3 = yVar4.f46910b[i44];
                                if (arrayList2.contains(Integer.valueOf(i44))) {
                                    int i45 = oVar3.f46793j;
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                    z13 = (i45 == -1 || i45 <= Integer.MAX_VALUE) && ((i18 = oVar3.f46794k) == -1 || i18 <= Integer.MAX_VALUE) && ((i19 = oVar3.f46785b) == -1 || i19 <= Integer.MAX_VALUE);
                                    if (z13) {
                                        i15 = 2;
                                    } else {
                                        i15 = 1;
                                    }
                                    z14 = z13;
                                    zA = d.a(iArr11[i44], false);
                                    if (zA) {
                                        i15 += 1000;
                                    }
                                    if (i15 > i38) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (i15 == i38) {
                                        if (oVar3.b() != iB3) {
                                            iB = oVar3.b();
                                            i14 = i38;
                                            i16 = -1;
                                            if (iB == -1) {
                                                if (iB3 == -1) {
                                                    i16 = 0;
                                                }
                                            } else if (iB3 == -1) {
                                                i16 = 1;
                                            } else {
                                                i16 = iB - iB3;
                                            }
                                        } else {
                                            i14 = i38;
                                            i16 = -1;
                                            i17 = oVar3.f46785b;
                                            if (i17 == -1) {
                                                if (i42 == -1) {
                                                    i16 = 0;
                                                }
                                            } else if (i42 == -1) {
                                                i16 = 1;
                                            } else {
                                                i16 = i17 - i42;
                                            }
                                        }
                                        z15 = zA || !z14 ? i16 < 0 : i16 > 0;
                                    } else {
                                        i14 = i38;
                                    }
                                    if (z15) {
                                        i42 = oVar3.f46785b;
                                        iB3 = oVar3.b();
                                        i38 = i15;
                                        i33 = i44;
                                        yVar5 = yVar;
                                    }
                                    i43 = i44 + 1;
                                    yVar4 = yVar;
                                    arrayList2 = arrayList;
                                    z18 = true;
                                } else {
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                }
                                if (z13) {
                                    i15 = 2;
                                } else {
                                    i15 = 1;
                                }
                                z14 = z13;
                                zA = d.a(iArr11[i44], false);
                                if (zA) {
                                    i15 += 1000;
                                }
                                if (i15 > i38) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (i15 == i38) {
                                    if (oVar3.b() != iB3) {
                                        iB = oVar3.b();
                                        i14 = i38;
                                        i16 = -1;
                                        if (iB == -1) {
                                            if (iB3 == -1) {
                                                i16 = 0;
                                            }
                                        } else if (iB3 == -1) {
                                            i16 = 1;
                                        } else {
                                            i16 = iB - iB3;
                                        }
                                    } else {
                                        i14 = i38;
                                        i16 = -1;
                                        i17 = oVar3.f46785b;
                                        if (i17 == -1) {
                                            if (i42 == -1) {
                                                i16 = 0;
                                            }
                                        } else if (i42 == -1) {
                                            i16 = 1;
                                        } else {
                                            i16 = i17 - i42;
                                        }
                                    }
                                    if (zA) {
                                    }
                                    i43 = i44 + 1;
                                    yVar4 = yVar;
                                    arrayList2 = arrayList;
                                    z18 = true;
                                } else {
                                    i14 = i38;
                                }
                                if (z15) {
                                    i42 = oVar3.f46785b;
                                    iB3 = oVar3.b();
                                    i38 = i15;
                                    i33 = i44;
                                    yVar5 = yVar;
                                }
                                i43 = i44 + 1;
                                yVar4 = yVar;
                                arrayList2 = arrayList;
                                z18 = true;
                            } else {
                                i14 = i38;
                                yVar = yVar4;
                                arrayList = arrayList2;
                            }
                            i38 = i14;
                            i43 = i44 + 1;
                            yVar4 = yVar;
                            arrayList2 = arrayList;
                            z18 = true;
                        }
                        int i46 = i38;
                        i32++;
                        i35 = iB3;
                        i31 = i40;
                        i36 = i42;
                        zVar2 = zVar3;
                        cVar4 = cVar5;
                        iArr5 = iArr10;
                        yVar3 = yVar5;
                        i34 = i46;
                        z18 = true;
                    }
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i13 = i31;
                    e eVar = yVar3 == null ? null : new e(yVar3, i33);
                    bVarArr[i13] = eVar;
                    z19 = eVar != null;
                }
                int i47 = zVarArr[i13].f46913a;
            } else {
                cVar = cVar4;
                iArr2 = iArr5;
                i13 = i31;
            }
            i31 = i13 + 1;
            cVar4 = cVar;
            iArr5 = iArr2;
            z18 = true;
        }
        c cVar6 = cVar4;
        int[][][] iArr12 = iArr5;
        boolean z20 = false;
        boolean z21 = false;
        int i48 = 0;
        while (i48 < length4) {
            int i49 = aVarArr[i48].f45569a;
            if (i49 == 1) {
                z10 = z20;
                i10 = length4;
                z11 = z21;
                if (!z11) {
                    z zVar4 = zVarArr[i48];
                    int[][] iArr13 = iArr12[i48];
                    cVar6.getClass();
                    int i50 = 0;
                    int i51 = 0;
                    int i52 = -1;
                    int i53 = -1;
                    while (i50 < zVar4.f46913a) {
                        y yVar6 = zVar4.f46914b[i50];
                        int[] iArr14 = iArr13[i50];
                        int i54 = i53;
                        int i55 = 0;
                        while (i55 < yVar6.f46909a) {
                            int[][] iArr15 = iArr13;
                            if (d.a(iArr14[i55], true)) {
                                o oVar4 = yVar6.f46910b[i55];
                                int i56 = iArr14[i55];
                                int i57 = (oVar4.f46807x & 1) != 0 ? 2 : 1;
                                i11 = i50;
                                if (d.a(i56, false)) {
                                    i57 += 1000;
                                }
                                if (i57 > i51) {
                                    i52 = i55;
                                    i51 = i57;
                                    i54 = i11;
                                }
                            } else {
                                i11 = i50;
                            }
                            i55++;
                            i50 = i11;
                            iArr13 = iArr15;
                        }
                        i50++;
                        i53 = i54;
                        iArr13 = iArr13;
                    }
                    e eVar2 = i53 == -1 ? null : new e(zVar4.f46914b[i53], i52);
                    bVarArr[i48] = eVar2;
                    z11 = eVar2 != null;
                }
                z20 = z10;
                i48++;
                length4 = i10;
                z21 = z11;
            } else if (i49 == 2) {
                z10 = z20;
                i10 = length4;
                z11 = z21;
            } else if (i49 != 3) {
                z zVar5 = zVarArr[i48];
                int[][] iArr16 = iArr12[i48];
                cVar6.getClass();
                y yVar7 = null;
                int i58 = 0;
                int i59 = 0;
                int i60 = 0;
                while (i58 < zVar5.f46913a) {
                    y yVar8 = zVar5.f46914b[i58];
                    int[] iArr17 = iArr16[i58];
                    boolean z22 = z20;
                    int i61 = length4;
                    int i62 = 0;
                    while (i62 < yVar8.f46909a) {
                        int i63 = i62;
                        if (d.a(iArr17[i62], true)) {
                            int i64 = (yVar8.f46910b[i63].f46807x & 1) != 0 ? 2 : 1;
                            z12 = z21;
                            if (d.a(iArr17[i63], false)) {
                                i64 += 1000;
                            }
                            if (i64 > i60) {
                                i60 = i64;
                                yVar7 = yVar8;
                                i59 = i63;
                            }
                        } else {
                            z12 = z21;
                        }
                        i62 = i63 + 1;
                        z21 = z12;
                    }
                    i58++;
                    z20 = z22;
                    length4 = i61;
                }
                z10 = z20;
                i10 = length4;
                z11 = z21;
                bVarArr[i48] = yVar7 == null ? null : new e(yVar7, i59);
            } else {
                z10 = z20;
                i10 = length4;
                z11 = z21;
                if (!z10) {
                    z zVar6 = zVarArr[i48];
                    int[][] iArr18 = iArr12[i48];
                    cVar6.getClass();
                    y yVar9 = null;
                    int i65 = 0;
                    int i66 = 0;
                    int i67 = 0;
                    while (i65 < zVar6.f46913a) {
                        y yVar10 = zVar6.f46914b[i65];
                        int[] iArr19 = iArr18[i65];
                        y yVar11 = yVar9;
                        int i68 = 0;
                        while (i68 < yVar10.f46909a) {
                            z zVar7 = zVar6;
                            if (d.a(iArr19[i68], true)) {
                                int i69 = yVar10.f46910b[i68].f46807x;
                                boolean z23 = (i69 & 1) != 0;
                                boolean z24 = (i69 & 2) != 0;
                                if (z23) {
                                    i12 = 3;
                                } else if (z24) {
                                    i12 = 1;
                                } else {
                                    iArr = iArr18;
                                }
                                iArr = iArr18;
                                if (d.a(iArr19[i68], false)) {
                                    i12 += 1000;
                                }
                                if (i12 > i67) {
                                    i67 = i12;
                                    i66 = i68;
                                    yVar11 = yVar10;
                                }
                            } else {
                                iArr = iArr18;
                            }
                            i68++;
                            zVar6 = zVar7;
                            iArr18 = iArr;
                        }
                        i65++;
                        yVar9 = yVar11;
                    }
                    e eVar3 = yVar9 == null ? null : new e(yVar9, i66);
                    bVarArr[i48] = eVar3;
                    z20 = eVar3 != null;
                }
                i48++;
                length4 = i10;
                z21 = z11;
            }
            z20 = z10;
            i48++;
            length4 = i10;
            z21 = z11;
        }
        for (int i70 = 0; i70 < aVarArr.length; i70++) {
            if (this.f46929b.get(i70)) {
                bVarArr[i70] = null;
            } else {
                z zVar8 = zVarArr[i70];
                Map map = (Map) this.f46928a.get(i70);
                if (!(map != null && map.containsKey(zVar8))) {
                    continue;
                } else {
                    if (((Map) this.f46928a.get(i70)).get(zVar8) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i70] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i71 = 0; i71 < aVarArr.length; i71++) {
            tVarArr[i71] = bVarArr[i71] != null ? t.f46916b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
