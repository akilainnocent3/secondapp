package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class maz implements aiv {
    public final Function1<yw90, Unit> a;
    public final boolean b;
    public final ihf0.b c;
    public final wgf0.b d;
    public final tmz e;
    public final float f;

    public maz(Function1 function1, boolean z, ihf0.b bVar, wgf0.b bVar2, tmz tmzVar, float f) {
        this.a = function1;
        this.b = z;
        this.c = bVar;
        this.d = bVar2;
        this.e = tmzVar;
        this.f = f;
    }

    public static final int j(int i, maz mazVar, int i2, int i3, y yVar, y yVar2) {
        if (mazVar.b) {
            i3 = Math.round(((i2 - yVar2.b) / 2.0f) * 1.0f);
        }
        int i4 = i + i3;
        ihf0.b bVar = mazVar.c;
        return Math.max(i4, (yVar != null ? yVar.b : 0) / 2);
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        return h(nzoVar, list, i, new iaz());
    }

    public final int b(mmd mmdVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int[] iArr = {i7, i3, i4, z ? 0 : vcv.c(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        tmz tmzVar = this.e;
        float fC1 = mmdVar.C1(tmzVar.d());
        if (!z) {
            fC1 = vcv.b(fC1, Math.max(fC1, i6 / 2.0f), f);
        }
        float fC2 = fC1 + i5 + mmdVar.C1(tmzVar.a());
        if (!z) {
            i6 = 0;
        }
        return oxa.f(Math.max(i, Math.max(i2, ycv.b(fC2))) + i6 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, androidx.compose.ui.layout.y] */
    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        vhv vhvVar;
        vhv vhvVar2;
        vhv vhvVar3;
        vhv vhvVar4;
        vhv vhvVar5;
        vhv vhvVar6;
        int i;
        vhv vhvVar7;
        y yVar;
        int i2;
        dq40 dq40Var;
        int i3;
        dq40 dq40Var2;
        int i4;
        int i5;
        List<? extends vhv> list2 = list;
        final float fInvoke = this.d.invoke();
        tmz tmzVar = this.e;
        int iY0 = tVar.y0(tmzVar.a());
        long jB = kxa.b(0, 0, 0, 0, 10, j);
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                vhvVar = null;
                break;
            }
            vhvVar = list2.get(i6);
            if (Intrinsics.g(i.a(vhvVar), "Leading")) {
                break;
            }
            i6++;
        }
        vhv vhvVar8 = vhvVar;
        y yVarD0 = vhvVar8 != null ? vhvVar8.d0(jB) : null;
        int i7 = yVarD0 != null ? yVarD0.a : 0;
        int iMax = Math.max(0, yVarD0 != null ? yVarD0.b : 0);
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                vhvVar2 = null;
                break;
            }
            vhvVar2 = list2.get(i8);
            if (Intrinsics.g(i.a(vhvVar2), "Trailing")) {
                break;
            }
            i8++;
        }
        vhv vhvVar9 = vhvVar2;
        y yVarD1 = vhvVar9 != null ? vhvVar9.d0(oxa.j(-i7, 0, 2, jB)) : null;
        int i9 = i7 + (yVarD1 != null ? yVarD1.a : 0);
        int iMax2 = Math.max(iMax, yVarD1 != null ? yVarD1.b : 0);
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                vhvVar3 = null;
                break;
            }
            vhvVar3 = list2.get(i10);
            int i11 = size3;
            if (Intrinsics.g(i.a(vhvVar3), "Prefix")) {
                break;
            }
            i10++;
            size3 = i11;
        }
        vhv vhvVar10 = vhvVar3;
        y yVarD2 = vhvVar10 != null ? vhvVar10.d0(oxa.j(-i9, 0, 2, jB)) : null;
        int i12 = i9 + (yVarD2 != null ? yVarD2.a : 0);
        int iMax3 = Math.max(iMax2, yVarD2 != null ? yVarD2.b : 0);
        int size4 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                vhvVar4 = null;
                break;
            }
            vhvVar4 = list2.get(i13);
            int i14 = size4;
            if (Intrinsics.g(i.a(vhvVar4), "Suffix")) {
                break;
            }
            i13++;
            size4 = i14;
        }
        vhv vhvVar11 = vhvVar4;
        y yVarD3 = vhvVar11 != null ? vhvVar11.d0(oxa.j(-i12, 0, 2, jB)) : null;
        int i15 = i12 + (yVarD3 != null ? yVarD3.a : 0);
        int iMax4 = Math.max(iMax3, yVarD3 != null ? yVarD3.b : 0);
        boolean z = false;
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                vhvVar5 = null;
                break;
            }
            vhvVar5 = list2.get(i16);
            int i17 = size5;
            if (Intrinsics.g(i.a(vhvVar5), "Label")) {
                break;
            }
            i16++;
            size5 = i17;
        }
        vhv vhvVar12 = vhvVar5;
        dq40 dq40Var3 = new dq40();
        Function1<yw90, Unit> function1 = this.a;
        long jFloatToRawIntBits = 0;
        int iY1 = tVar.y0(tmzVar.c(tVar.getLayoutDirection())) + tVar.y0(tmzVar.b(tVar.getLayoutDirection()));
        ?? D0 = vhvVar12 != null ? vhvVar12.d0(oxa.i(-vcv.c(fInvoke, i15 + iY1, iY1), jB, -iY0)) : 0;
        dq40Var3.a = D0;
        if (D0 != 0) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(D0.a)) << 32) | (((long) Float.floatToRawIntBits(D0.b)) & 4294967295L);
        }
        function1.invoke(new yw90(jFloatToRawIntBits));
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                vhvVar6 = null;
                break;
            }
            vhvVar6 = list2.get(i18);
            if (Intrinsics.g(i.a(vhvVar6), "Supporting")) {
                break;
            }
            i18++;
        }
        vhv vhvVar13 = vhvVar6;
        int iR = vhvVar13 != null ? vhvVar13.R(kxa.k(j)) : 0;
        y yVar2 = (y) dq40Var3.a;
        int iMax5 = Math.max((yVar2 != null ? yVar2.b : 0) / 2, tVar.y0(tmzVar.d()));
        long j2 = j;
        long jB2 = kxa.b(0, 0, 0, 0, 11, oxa.i(-i15, j2, (((-iY0) - iMax5) + 0) - iR));
        int size7 = list2.size();
        vhv vhvVar14 = vhvVar13;
        int i19 = 0;
        while (i19 < size7) {
            int i20 = i19;
            vhv vhvVar15 = list2.get(i19);
            int i21 = iMax5;
            if (Intrinsics.g(i.a(vhvVar15), "TextField")) {
                final y yVarD4 = vhvVar15.d0(jB2);
                long jB3 = kxa.b(0, 0, 0, 0, 14, jB2);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        i = iY0;
                        vhvVar7 = null;
                        break;
                    }
                    vhvVar7 = list2.get(i22);
                    i = iY0;
                    int i23 = size8;
                    if (Intrinsics.g(i.a(vhvVar7), "Hint")) {
                        break;
                    }
                    i22++;
                    size8 = i23;
                    iY0 = i;
                }
                vhv vhvVar16 = vhvVar7;
                y yVarD5 = vhvVar16 != null ? vhvVar16.d0(jB3) : null;
                int iMax6 = Math.max(iMax4, Math.max(yVarD4.b, yVarD5 != null ? yVarD5.b : 0) + i21 + i);
                int i24 = yVarD0 != 0 ? yVarD0.a : 0;
                y yVar3 = yVarD1;
                int i25 = yVarD1 != null ? yVar3.a : 0;
                final y yVar4 = yVarD2;
                int i26 = yVarD2 != null ? yVar4.a : 0;
                int i27 = i24;
                if (yVarD3 != null) {
                    i2 = yVarD3.a;
                    yVar = yVar3;
                } else {
                    yVar = yVar3;
                    i2 = 0;
                }
                int i28 = yVarD4.a;
                y yVar5 = (y) dq40Var3.a;
                if (yVar5 != null) {
                    dq40 dq40Var4 = dq40Var3;
                    i3 = yVar5.a;
                    dq40Var = dq40Var4;
                } else {
                    dq40Var = dq40Var3;
                    i3 = 0;
                }
                if (yVarD5 != null) {
                    dq40Var2 = dq40Var;
                    i4 = yVarD5.a;
                    i5 = i27;
                } else {
                    dq40Var2 = dq40Var;
                    i4 = 0;
                    i5 = i27;
                }
                final int iD = d(tVar, i5, i25, i26, i2, i28, i3, i4, j2, r27);
                final y yVarD6 = vhvVar14 != 0 ? vhvVar14.d0(kxa.b(0, iD, 0, 0, 9, oxa.j(0, -iMax6, 1, jB))) : null;
                int i29 = yVarD6 != null ? yVarD6.b : 0;
                final y yVar6 = yVarD0;
                int i30 = yVarD0 != null ? yVar6.b : 0;
                final y yVar7 = yVar;
                int i31 = yVar != null ? yVar7.b : 0;
                int i32 = yVar4 != null ? yVar4.b : 0;
                final y yVar8 = yVarD3;
                int i33 = yVar8 != null ? yVar8.b : 0;
                int i34 = yVarD4.b;
                final dq40 dq40Var5 = dq40Var2;
                y yVar9 = (y) dq40Var5.a;
                final y yVar10 = yVarD5;
                final int iB = b(tVar, i30, i31, i32, i33, i34, yVar9 != null ? yVar9.b : 0, yVar10 != null ? yVar10.b : 0, yVarD6 != null ? yVarD6.b : 0, j, z, r27);
                int i35 = (iB - i29) + 0;
                int size9 = list.size();
                int i36 = 0;
                while (i36 < size9) {
                    vhv vhvVar17 = list.get(i36);
                    if (Intrinsics.g(i.a(vhvVar17), "Container")) {
                        final y yVarD7 = vhvVar17.d0(oxa.a(iD != Integer.MAX_VALUE ? iD : 0, iD, i35 != Integer.MAX_VALUE ? i35 : 0, i35));
                        final boolean z2 = z;
                        return t.z1(tVar, iD, iB, new Function1() { // from class: jaz
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i37;
                                int i38;
                                int i39;
                                maz mazVar;
                                float f;
                                int iRound;
                                float f2;
                                float f3;
                                float f4;
                                y.a aVar = (y.a) obj;
                                y yVar11 = (y) dq40Var5.a;
                                t tVar2 = tVar;
                                float density = tVar2.getDensity();
                                asr layoutDirection = tVar2.getLayoutDirection();
                                maz mazVar2 = this.a;
                                float fC1 = tVar2.C1(mazVar2.f);
                                ihf0.b bVar = mazVar2.c;
                                tmz tmzVar2 = mazVar2.e;
                                boolean z3 = z2;
                                int i40 = (!z3 || yVar11 == null) ? 0 : yVar11.b;
                                aVar.s(yVarD7, 0, i40, 0.0f);
                                y yVar12 = yVarD6;
                                int i41 = (iB - (yVar12 != null ? yVar12.b : 0)) - ((!z3 || yVar11 == null) ? 0 : yVar11.b);
                                int iB2 = ycv.b(tmzVar2.d() * density);
                                y yVar13 = yVar6;
                                if (yVar13 != null) {
                                    y.a.A(aVar, yVar13, 0, Math.round(((i41 - yVar13.b) / 2.0f) * 1.0f) + i40);
                                }
                                int i42 = iD;
                                y yVar14 = yVar7;
                                if (yVar11 != null) {
                                    if (z3) {
                                        f = density;
                                        iRound = 0;
                                    } else {
                                        f = density;
                                        iRound = mazVar2.b ? Math.round(((i41 - yVar11.b) / 2.0f) * 1.0f) : iB2;
                                    }
                                    int i43 = z3 ? 0 : -(yVar11.b / 2);
                                    float f5 = fInvoke;
                                    int iC = vcv.c(f5, iRound, i43);
                                    if (z3) {
                                        aVar.s(yVar11, wgf0.e(bVar).a(yVar11.a, i42, layoutDirection), iC, 0.0f);
                                        i42 = i42;
                                    } else {
                                        float fD = h.d(tmzVar2, layoutDirection) * f;
                                        float fC = h.c(tmzVar2, layoutDirection) * f;
                                        if (yVar13 == null) {
                                            f2 = 0.0f;
                                            f3 = fD;
                                        } else {
                                            f2 = 0.0f;
                                            float f6 = yVar13.a;
                                            float f7 = fD - fC1;
                                            if (f7 < 0.0f) {
                                                f7 = 0.0f;
                                            }
                                            f3 = f6 + f7;
                                        }
                                        if (yVar14 == null) {
                                            f4 = fC;
                                        } else {
                                            float f8 = yVar14.a;
                                            float f9 = fC - fC1;
                                            if (f9 < f2) {
                                                f9 = f2;
                                            }
                                            f4 = f8 + f9;
                                        }
                                        asr asrVar = asr.a;
                                        aVar.s(yVar11, ycv.b(vcv.b(wgf0.d(bVar).a(yVar11.a, i42 - ycv.b(f3 + f4), layoutDirection) + (layoutDirection == asrVar ? f3 : f4), wgf0.e(bVar).a(yVar11.a, i42 - ycv.b(fD + fC), layoutDirection) + (layoutDirection == asrVar ? fD : fC), f5)), iC, f2);
                                    }
                                } else {
                                    i42 = i42;
                                    mazVar2 = mazVar2;
                                }
                                y yVar15 = yVar4;
                                if (yVar15 != null) {
                                    i37 = i40;
                                    i38 = iB2;
                                    i39 = i41;
                                    mazVar = mazVar2;
                                    y.a.A(aVar, yVar15, yVar13 != null ? yVar13.a : 0, maz.j(i37, mazVar, i39, i38, yVar11, yVar15));
                                } else {
                                    i37 = i40;
                                    i38 = iB2;
                                    i39 = i41;
                                    mazVar = mazVar2;
                                }
                                int i44 = (yVar13 != null ? yVar13.a : 0) + (yVar15 != null ? yVar15.a : 0);
                                y yVar16 = yVarD4;
                                y.a.A(aVar, yVar16, i44, maz.j(i37, mazVar, i39, i38, yVar11, yVar16));
                                y yVar17 = yVar10;
                                if (yVar17 != null) {
                                    y.a.A(aVar, yVar17, i44, maz.j(i37, mazVar, i39, i38, yVar11, yVar17));
                                }
                                y yVar18 = yVar8;
                                if (yVar18 != null) {
                                    y.a.A(aVar, yVar18, (i42 - (yVar14 != null ? yVar14.a : 0)) - yVar18.a, maz.j(i37, mazVar, i39, i38, yVar11, yVar18));
                                }
                                if (yVar14 != null) {
                                    y.a.A(aVar, yVar14, i42 - yVar14.a, Math.round(((i39 - yVar14.b) / 2.0f) * 1.0f) + i37);
                                }
                                if (yVar12 != null) {
                                    y.a.A(aVar, yVar12, 0, i37 + i39);
                                }
                                return Unit.a;
                            }
                        });
                    }
                    i36++;
                    iB = iB;
                    z = z;
                }
                throw hu1.a("Collection contains no element matching the predicate.");
            }
            i19 = i20 + 1;
            iMax5 = i21;
            dq40Var3 = dq40Var3;
            j2 = j;
            vhvVar14 = vhvVar14;
            list2 = list2;
            iY0 = iY0;
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    public final int d(mmd mmdVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, vcv.c(f, i6, 0))) + i + i2;
        asr asrVar = asr.a;
        tmz tmzVar = this.e;
        return oxa.g(Math.max(iMax, ycv.b((i6 + mmdVar.C1(tmzVar.c(asrVar) + tmzVar.b(asrVar))) * f)), j);
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        return h(nzoVar, list, i, new laz());
    }

    public final int f(nzo nzoVar, List<? extends mzo> list, int i, Function2<? super mzo, ? super Integer, Integer> function2) {
        mzo mzoVar;
        int iB;
        int iIntValue;
        mzo mzoVar2;
        int iIntValue2;
        mzo mzoVar3;
        mzo mzoVar4;
        int iIntValue3;
        mzo mzoVar5;
        int iIntValue4;
        mzo mzoVar6;
        mzo mzoVar7;
        maz mazVar = this;
        float fInvoke = mazVar.d.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                mzoVar = null;
                break;
            }
            mzoVar = list.get(i2);
            if (Intrinsics.g(ntr.a(mzoVar), "Leading")) {
                break;
            }
            i2++;
        }
        mzo mzoVar8 = mzoVar;
        if (mzoVar8 != null) {
            iB = ntr.b(i, mzoVar8.b0(Reader.READ_DONE));
            iIntValue = function2.invoke(mzoVar8, Integer.valueOf(i)).intValue();
        } else {
            iB = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                mzoVar2 = null;
                break;
            }
            mzoVar2 = list.get(i3);
            if (Intrinsics.g(ntr.a(mzoVar2), "Trailing")) {
                break;
            }
            i3++;
        }
        mzo mzoVar9 = mzoVar2;
        if (mzoVar9 != null) {
            iB = ntr.b(iB, mzoVar9.b0(Reader.READ_DONE));
            iIntValue2 = function2.invoke(mzoVar9, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                mzoVar3 = null;
                break;
            }
            mzoVar3 = list.get(i4);
            if (Intrinsics.g(ntr.a(mzoVar3), "Label")) {
                break;
            }
            i4++;
        }
        mzo mzoVar10 = mzoVar3;
        int iIntValue5 = mzoVar10 != null ? function2.invoke(mzoVar10, Integer.valueOf(vcv.c(fInvoke, iB, i))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                mzoVar4 = null;
                break;
            }
            mzoVar4 = list.get(i5);
            if (Intrinsics.g(ntr.a(mzoVar4), "Prefix")) {
                break;
            }
            i5++;
        }
        mzo mzoVar11 = mzoVar4;
        if (mzoVar11 != null) {
            iIntValue3 = function2.invoke(mzoVar11, Integer.valueOf(iB)).intValue();
            iB = ntr.b(iB, mzoVar11.b0(Reader.READ_DONE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                mzoVar5 = null;
                break;
            }
            mzoVar5 = list.get(i6);
            if (Intrinsics.g(ntr.a(mzoVar5), "Suffix")) {
                break;
            }
            i6++;
        }
        mzo mzoVar12 = mzoVar5;
        if (mzoVar12 != null) {
            iIntValue4 = function2.invoke(mzoVar12, Integer.valueOf(iB)).intValue();
            iB = ntr.b(iB, mzoVar12.b0(Reader.READ_DONE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            mzo mzoVar13 = list.get(i7);
            if (Intrinsics.g(ntr.a(mzoVar13), "TextField")) {
                int iIntValue6 = function2.invoke(mzoVar13, Integer.valueOf(iB)).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        mzoVar6 = null;
                        break;
                    }
                    mzoVar6 = list.get(i8);
                    if (Intrinsics.g(ntr.a(mzoVar6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                mzo mzoVar14 = mzoVar6;
                int iIntValue7 = mzoVar14 != null ? function2.invoke(mzoVar14, Integer.valueOf(iB)).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        mzoVar7 = null;
                        break;
                    }
                    mzoVar7 = list.get(i9);
                    if (Intrinsics.g(ntr.a(mzoVar7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                mzo mzoVar15 = mzoVar7;
                return mazVar.b(nzoVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, mzoVar15 != null ? function2.invoke(mzoVar15, Integer.valueOf(i)).intValue() : 0, oxa.b(0, 0, 0, 15), false, fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            mazVar = this;
            iIntValue3 = iIntValue3;
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        return f(nzoVar, list, i, new kaz(0));
    }

    public final int h(nzo nzoVar, List<? extends mzo> list, int i, Function2<? super mzo, ? super Integer, Integer> function2) {
        mzo mzoVar;
        mzo mzoVar2;
        mzo mzoVar3;
        mzo mzoVar4;
        mzo mzoVar5;
        mzo mzoVar6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mzo mzoVar7 = list.get(i2);
            if (Intrinsics.g(ntr.a(mzoVar7), "TextField")) {
                int iIntValue = function2.invoke(mzoVar7, Integer.valueOf(i)).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    mzoVar = null;
                    if (i3 >= size2) {
                        mzoVar2 = null;
                        break;
                    }
                    mzoVar2 = list.get(i3);
                    if (Intrinsics.g(ntr.a(mzoVar2), "Label")) {
                        break;
                    }
                    i3++;
                }
                mzo mzoVar8 = mzoVar2;
                int iIntValue2 = mzoVar8 != null ? function2.invoke(mzoVar8, Integer.valueOf(i)).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        mzoVar3 = null;
                        break;
                    }
                    mzoVar3 = list.get(i4);
                    if (Intrinsics.g(ntr.a(mzoVar3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                mzo mzoVar9 = mzoVar3;
                int iIntValue3 = mzoVar9 != null ? function2.invoke(mzoVar9, Integer.valueOf(i)).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        mzoVar4 = null;
                        break;
                    }
                    mzoVar4 = list.get(i5);
                    if (Intrinsics.g(ntr.a(mzoVar4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                mzo mzoVar10 = mzoVar4;
                int iIntValue4 = mzoVar10 != null ? function2.invoke(mzoVar10, Integer.valueOf(i)).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        mzoVar5 = null;
                        break;
                    }
                    mzoVar5 = list.get(i6);
                    if (Intrinsics.g(ntr.a(mzoVar5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                mzo mzoVar11 = mzoVar5;
                int iIntValue5 = mzoVar11 != null ? function2.invoke(mzoVar11, Integer.valueOf(i)).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        mzoVar6 = null;
                        break;
                    }
                    mzoVar6 = list.get(i7);
                    if (Intrinsics.g(ntr.a(mzoVar6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                mzo mzoVar12 = mzoVar6;
                int iIntValue6 = mzoVar12 != null ? function2.invoke(mzoVar12, Integer.valueOf(i)).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    mzo mzoVar13 = list.get(i8);
                    if (Intrinsics.g(ntr.a(mzoVar13), "Hint")) {
                        mzoVar = mzoVar13;
                        break;
                    }
                }
                mzo mzoVar14 = mzoVar;
                return d(nzoVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, mzoVar14 != null ? function2.invoke(mzoVar14, Integer.valueOf(i)).intValue() : 0, oxa.b(0, 0, 0, 15), this.d.invoke());
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        return f(nzoVar, list, i, new haz(0));
    }
}
