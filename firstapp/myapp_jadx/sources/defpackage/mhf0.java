package defpackage;

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
public final class mhf0 implements aiv {
    public final boolean a;
    public final ihf0.b b;
    public final wgf0.b c;
    public final tmz d;
    public final float e;

    public mhf0(boolean z, ihf0.b bVar, wgf0.b bVar2, tmz tmzVar, float f) {
        this.a = z;
        this.b = bVar;
        this.c = bVar2;
        this.d = tmzVar;
        this.e = f;
    }

    public static int f(int i, List list, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.g(ntr.a((mzo) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.g(ntr.a((mzo) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                mzo mzoVar = (mzo) obj2;
                int iIntValue2 = mzoVar != null ? ((Number) function2.invoke(mzoVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.g(ntr.a((mzo) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                mzo mzoVar2 = (mzo) obj3;
                int iIntValue3 = mzoVar2 != null ? ((Number) function2.invoke(mzoVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.g(ntr.a((mzo) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                mzo mzoVar3 = (mzo) obj4;
                int iIntValue4 = mzoVar3 != null ? ((Number) function2.invoke(mzoVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.g(ntr.a((mzo) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                mzo mzoVar4 = (mzo) obj5;
                int iIntValue5 = mzoVar4 != null ? ((Number) function2.invoke(mzoVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.g(ntr.a((mzo) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                mzo mzoVar5 = (mzo) obj6;
                int iIntValue6 = mzoVar5 != null ? ((Number) function2.invoke(mzoVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (Intrinsics.g(ntr.a((mzo) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                mzo mzoVar6 = (mzo) obj;
                int i9 = iIntValue4 + iIntValue5;
                return oxa.g(Math.max(iIntValue + i9, Math.max((mzoVar6 != null ? ((Number) function2.invoke(mzoVar6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, oxa.b(0, 0, 0, 15));
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    public static final int h(mhf0 mhf0Var, int i, int i2, y yVar) {
        return mhf0Var.a ? Math.round(((i - yVar.b) / 2.0f) * 1.0f) : i2;
    }

    @Override // defpackage.aiv
    public final int a(nzo nzoVar, List<? extends mzo> list, int i) {
        return f(i, list, new haz(1));
    }

    public final int b(mmd mmdVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        tmz tmzVar = this.d;
        int iY0 = mmdVar.y0(tmzVar.a() + tmzVar.d());
        int[] iArr = {i7, i5, i6, z ? 0 : vcv.c(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        int iMax = iY0 + ((i2 <= 0 || z) ? 0 : Math.max(mmdVar.y0(this.e * 2.0f), vcv.c(e6w.a.a(f), 0, i2))) + i;
        if (!z) {
            i2 = 0;
        }
        return oxa.f(Math.max(i3, Math.max(i4, iMax)) + i2 + i8, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aiv
    public final biv c(final t tVar, List<? extends vhv> list, long j) {
        vhv vhvVar;
        vhv vhvVar2;
        vhv vhvVar3;
        vhv vhvVar4;
        y yVar;
        vhv vhvVar5;
        int i;
        vhv vhvVar6;
        vhv vhvVar7;
        dq40 dq40Var;
        int i2;
        int i3;
        int i4;
        y yVar2;
        int i5;
        boolean z;
        float f;
        int i6;
        float fInvoke = this.c.invoke();
        tmz tmzVar = this.d;
        final int iY0 = tVar.y0(tmzVar.d());
        int iY1 = tVar.y0(tmzVar.a());
        long jB = kxa.b(0, 0, 0, 0, 10, j);
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                vhvVar = null;
                break;
            }
            vhvVar = list.get(i7);
            if (Intrinsics.g(i.a(vhvVar), "Leading")) {
                break;
            }
            i7++;
        }
        vhv vhvVar8 = vhvVar;
        y yVarD0 = vhvVar8 != null ? vhvVar8.d0(jB) : null;
        int i8 = yVarD0 != null ? yVarD0.a : 0;
        int iMax = Math.max(0, yVarD0 != null ? yVarD0.b : 0);
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                vhvVar2 = null;
                break;
            }
            vhvVar2 = list.get(i9);
            if (Intrinsics.g(i.a(vhvVar2), "Trailing")) {
                break;
            }
            i9++;
        }
        vhv vhvVar9 = vhvVar2;
        y yVarD1 = vhvVar9 != null ? vhvVar9.d0(oxa.j(-i8, 0, 2, jB)) : null;
        int i10 = i8 + (yVarD1 != null ? yVarD1.a : 0);
        int iMax2 = Math.max(iMax, yVarD1 != null ? yVarD1.b : 0);
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                vhvVar3 = null;
                break;
            }
            vhvVar3 = list.get(i11);
            if (Intrinsics.g(i.a(vhvVar3), "Prefix")) {
                break;
            }
            i11++;
        }
        vhv vhvVar10 = vhvVar3;
        y yVarD2 = vhvVar10 != null ? vhvVar10.d0(oxa.j(-i10, 0, 2, jB)) : null;
        int i12 = (yVarD2 != null ? yVarD2.a : 0) + i10;
        int iMax3 = Math.max(iMax2, yVarD2 != null ? yVarD2.b : 0);
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                vhvVar4 = null;
                break;
            }
            vhvVar4 = list.get(i13);
            if (Intrinsics.g(i.a(vhvVar4), "Suffix")) {
                break;
            }
            i13++;
        }
        vhv vhvVar11 = vhvVar4;
        y yVarD3 = vhvVar11 != null ? vhvVar11.d0(oxa.j(-i12, 0, 2, jB)) : null;
        int i14 = i12 + (yVarD3 != null ? yVarD3.a : 0);
        int iMax4 = Math.max(iMax3, yVarD3 != null ? yVarD3.b : 0);
        boolean z2 = false;
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                yVar = yVarD2;
                vhvVar5 = null;
                break;
            }
            vhvVar5 = list.get(i15);
            yVar = yVarD2;
            if (Intrinsics.g(i.a(vhvVar5), "Label")) {
                break;
            }
            i15++;
            yVarD2 = yVar;
        }
        vhv vhvVar12 = vhvVar5;
        dq40 dq40Var2 = new dq40();
        dq40Var2.a = vhvVar12 != null ? vhvVar12.d0(oxa.i(-i14, jB, -iY1)) : 0;
        int size6 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                i = iY1;
                vhvVar6 = null;
                break;
            }
            vhvVar6 = list.get(i16);
            i = iY1;
            if (Intrinsics.g(i.a(vhvVar6), "Supporting")) {
                break;
            }
            i16++;
            iY1 = i;
        }
        vhv vhvVar13 = vhvVar6;
        int iR = vhvVar13 != null ? vhvVar13.R(kxa.k(j)) : 0;
        y yVar3 = (y) dq40Var2.a;
        int i17 = (yVar3 != null ? yVar3.b : 0) + 0 + iY0;
        final y yVar4 = yVarD0;
        vhv vhvVar14 = vhvVar13;
        y yVar5 = yVar;
        float f2 = fInvoke;
        y yVar6 = yVar5;
        long j2 = jB;
        long jI = oxa.i(-i14, kxa.b(0, 0, 0, 0, 11, j), ((-i17) - i) - iR);
        int size7 = list.size();
        int i18 = 0;
        while (i18 < size7) {
            vhv vhvVar15 = list.get(i18);
            if (Intrinsics.g(i.a(vhvVar15), "TextField")) {
                y yVarD4 = vhvVar15.d0(jI);
                long jB2 = kxa.b(0, 0, 0, 0, 14, jI);
                int size8 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        vhvVar7 = null;
                        break;
                    }
                    vhvVar7 = list.get(i19);
                    if (Intrinsics.g(i.a(vhvVar7), "Hint")) {
                        break;
                    }
                    i19++;
                }
                vhv vhvVar16 = vhvVar7;
                y yVarD5 = vhvVar16 != null ? vhvVar16.d0(jB2) : null;
                int iMax5 = Math.max(iMax4, Math.max(yVarD4.b, yVarD5 != null ? yVarD5.b : 0) + i17 + i);
                int i20 = yVar4 != null ? yVar4.a : 0;
                int i21 = yVarD1 != null ? yVarD1.a : 0;
                int i22 = yVar6 != null ? yVar6.a : 0;
                int i23 = yVarD3 != null ? yVarD3.a : 0;
                int i24 = yVarD4.a;
                y yVar7 = (y) dq40Var2.a;
                int i25 = i22 + i23;
                final int iG = oxa.g(Math.max(i24 + i25, Math.max((yVarD5 != null ? yVarD5.a : 0) + i25, yVar7 != null ? yVar7.a : 0)) + i20 + i21, j);
                final y yVarD6 = vhvVar14 != null ? vhvVar14.d0(kxa.b(0, iG, 0, 0, 9, oxa.j(0, -iMax5, 1, j2))) : null;
                int i26 = yVarD6 != null ? yVarD6.b : 0;
                y yVar8 = yVarD4;
                int i27 = yVar8.b;
                y yVar9 = (y) dq40Var2.a;
                int i28 = yVar9 != null ? yVar9.b : 0;
                int i29 = yVar4 != null ? yVar4.b : 0;
                int i30 = yVarD1 != null ? yVarD1.b : 0;
                int i31 = yVar6 != null ? yVar6.b : 0;
                final y yVar10 = yVarD1;
                if (yVarD3 != null) {
                    i2 = yVarD3.b;
                    dq40Var = dq40Var2;
                } else {
                    dq40Var = r3;
                    i2 = 0;
                }
                final dq40 dq40Var3 = dq40Var;
                if (yVarD5 != null) {
                    int i32 = i30;
                    i4 = yVarD5.b;
                    i3 = i32;
                } else {
                    i3 = i30;
                    i4 = 0;
                }
                if (yVarD6 != null) {
                    yVar2 = yVarD5;
                    i5 = yVarD6.b;
                    z = z2;
                    f = f2;
                    i6 = 0;
                } else {
                    yVar2 = yVarD5;
                    i5 = 0;
                    z = z2;
                    f = f2;
                    i6 = 0;
                }
                final int iB = b(tVar, i27, i28, i29, i3, i31, i2, i4, i5, j, z, f);
                final int i33 = (iB - i26) + 0;
                int size9 = list.size();
                int i34 = i6;
                while (i34 < size9) {
                    vhv vhvVar17 = list.get(i34);
                    if (Intrinsics.g(i.a(vhvVar17), "Container")) {
                        final y yVarD7 = vhvVar17.d0(oxa.a(iG != 2147483647 ? iG : i6, iG, i33 != Integer.MAX_VALUE ? i33 : i6, i33));
                        final boolean z3 = z;
                        final float f3 = f;
                        final y yVar11 = yVarD3;
                        final y yVar12 = yVar6;
                        final y yVar13 = yVar8;
                        final y yVar14 = yVar2;
                        return t.z1(tVar, iG, iB, new Function1() { // from class: lhf0
                            /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i35;
                                int iY2;
                                int i36;
                                int i37;
                                y.a aVar = (y.a) obj;
                                dq40 dq40Var4 = dq40Var3;
                                T t = dq40Var4.a;
                                mhf0 mhf0Var = this;
                                t tVar2 = tVar;
                                int i38 = iG;
                                int i39 = iB;
                                y yVar15 = yVar13;
                                y yVar16 = yVar14;
                                y yVar17 = yVar4;
                                y yVar18 = yVar10;
                                y yVar19 = yVar12;
                                y yVar20 = yVar11;
                                y yVar21 = yVarD7;
                                y yVar22 = yVarD6;
                                if (t != 0) {
                                    boolean z4 = z3;
                                    int i40 = iY0;
                                    if (z4) {
                                        i35 = i40;
                                        iY2 = 0;
                                    } else {
                                        i35 = i40;
                                        if (mhf0Var.a) {
                                            iY2 = Math.round(((i33 - ((y) t).b) / 2.0f) * 1.0f);
                                        } else {
                                            iY2 = tVar2.y0(mhf0Var.e) + i35;
                                        }
                                    }
                                    int i41 = z4 ? 0 : i35;
                                    y yVar23 = (y) dq40Var4.a;
                                    int i42 = i35 + (z4 ? 0 : yVar23.b);
                                    asr layoutDirection = tVar2.getLayoutDirection();
                                    ihf0.b bVar = mhf0Var.b;
                                    int i43 = z4 ? yVar23.b : 0;
                                    aVar.s(yVar21, 0, i43, 0.0f);
                                    int i44 = (i39 - (yVar22 != null ? yVar22.b : 0)) - (z4 ? yVar23.b : 0);
                                    if (yVar17 != null) {
                                        y.a.A(aVar, yVar17, 0, Math.round(((i44 - yVar17.b) / 2.0f) * 1.0f) + i43);
                                    }
                                    float f4 = f3;
                                    int iC = vcv.c(f4, iY2, i41);
                                    if (z4) {
                                        aVar.s(yVar23, wgf0.e(bVar).a(yVar23.a, i38, layoutDirection), iC, 0.0f);
                                        i37 = i38;
                                    } else {
                                        if (layoutDirection == asr.a) {
                                            if (yVar17 != null) {
                                                i36 = yVar17.a;
                                            } else {
                                                i36 = 0;
                                            }
                                        } else if (yVar18 != null) {
                                            i36 = yVar18.a;
                                        } else {
                                            i36 = 0;
                                        }
                                        int i45 = i36;
                                        i37 = i38;
                                        aVar.s(yVar23, vcv.c(f4, wgf0.d(bVar).a(yVar23.a, (i38 - (yVar17 != null ? yVar17.a : 0)) - (yVar18 != null ? yVar18.a : 0), layoutDirection) + i45, wgf0.e(bVar).a(yVar23.a, (i37 - (yVar17 != null ? yVar17.a : 0)) - (yVar18 != null ? yVar18.a : 0), layoutDirection) + i45), iC, 0.0f);
                                    }
                                    if (yVar19 != null) {
                                        y.a.A(aVar, yVar19, yVar17 != null ? yVar17.a : 0, i43 + i42);
                                    }
                                    int i46 = (yVar17 != null ? yVar17.a : 0) + (yVar19 != null ? yVar19.a : 0);
                                    int i47 = i43 + i42;
                                    y.a.A(aVar, yVar15, i46, i47);
                                    if (yVar16 != null) {
                                        y.a.A(aVar, yVar16, i46, i47);
                                    }
                                    if (yVar20 != null) {
                                        y.a.A(aVar, yVar20, (i37 - (yVar18 != null ? yVar18.a : 0)) - yVar20.a, i47);
                                    }
                                    if (yVar18 != null) {
                                        y.a.A(aVar, yVar18, i37 - yVar18.a, Math.round(((i44 - yVar18.b) / 2.0f) * 1.0f) + i43);
                                    }
                                    if (yVar22 != null) {
                                        y.a.A(aVar, yVar22, 0, i43 + i44);
                                    }
                                } else {
                                    float density = tVar2.getDensity();
                                    y.a.x(aVar, yVar21, 0L);
                                    int i48 = i39 - (yVar22 != null ? yVar22.b : 0);
                                    int iB2 = ycv.b(mhf0Var.d.d() * density);
                                    if (yVar17 != null) {
                                        y.a.A(aVar, yVar17, 0, Math.round(((i48 - yVar17.b) / 2.0f) * 1.0f));
                                    }
                                    if (yVar19 != null) {
                                        y.a.A(aVar, yVar19, yVar17 != null ? yVar17.a : 0, mhf0.h(mhf0Var, i48, iB2, yVar19));
                                    }
                                    int i49 = (yVar17 != null ? yVar17.a : 0) + (yVar19 != null ? yVar19.a : 0);
                                    y.a.A(aVar, yVar15, i49, mhf0.h(mhf0Var, i48, iB2, yVar15));
                                    if (yVar16 != null) {
                                        y.a.A(aVar, yVar16, i49, mhf0.h(mhf0Var, i48, iB2, yVar16));
                                    }
                                    if (yVar20 != null) {
                                        y.a.A(aVar, yVar20, (i38 - (yVar18 != null ? yVar18.a : 0)) - yVar20.a, mhf0.h(mhf0Var, i48, iB2, yVar20));
                                    }
                                    if (yVar18 != null) {
                                        y.a.A(aVar, yVar18, i38 - yVar18.a, Math.round(((i48 - yVar18.b) / 2.0f) * 1.0f));
                                    }
                                    if (yVar22 != null) {
                                        y.a.A(aVar, yVar22, 0, i48);
                                    }
                                }
                                return Unit.a;
                            }
                        });
                    }
                    i34++;
                    yVar8 = yVar8;
                }
                throw hu1.a("Collection contains no element matching the predicate.");
            }
            i18++;
            z2 = z2;
            yVarD3 = yVarD3;
            f2 = f2;
            yVar6 = yVar6;
            yVarD1 = yVarD1;
            jI = jI;
            j2 = j2;
            vhvVar14 = vhvVar14;
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    public final int d(nzo nzoVar, List<? extends mzo> list, int i, Function2<? super mzo, ? super Integer, Integer> function2) {
        mzo mzoVar;
        int i2;
        int iIntValue;
        int iB;
        mzo mzoVar2;
        int iIntValue2;
        mzo mzoVar3;
        mzo mzoVar4;
        int i3;
        mzo mzoVar5;
        int i4;
        mzo mzoVar6;
        mzo mzoVar7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                mzoVar = null;
                break;
            }
            mzoVar = list.get(i5);
            if (Intrinsics.g(ntr.a(mzoVar), "Leading")) {
                break;
            }
            i5++;
        }
        mzo mzoVar8 = mzoVar;
        if (mzoVar8 != null) {
            i2 = i;
            iB = ntr.b(i2, mzoVar8.b0(Reader.READ_DONE));
            iIntValue = function2.invoke(mzoVar8, Integer.valueOf(i2)).intValue();
        } else {
            i2 = i;
            iIntValue = 0;
            iB = i2;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                mzoVar2 = null;
                break;
            }
            mzoVar2 = list.get(i6);
            if (Intrinsics.g(ntr.a(mzoVar2), "Trailing")) {
                break;
            }
            i6++;
        }
        mzo mzoVar9 = mzoVar2;
        if (mzoVar9 != null) {
            iB = ntr.b(iB, mzoVar9.b0(Reader.READ_DONE));
            iIntValue2 = function2.invoke(mzoVar9, Integer.valueOf(i2)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                mzoVar3 = null;
                break;
            }
            mzoVar3 = list.get(i7);
            if (Intrinsics.g(ntr.a(mzoVar3), "Label")) {
                break;
            }
            i7++;
        }
        mzo mzoVar10 = mzoVar3;
        int iIntValue3 = mzoVar10 != null ? function2.invoke(mzoVar10, Integer.valueOf(iB)).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                mzoVar4 = null;
                break;
            }
            mzoVar4 = list.get(i8);
            if (Intrinsics.g(ntr.a(mzoVar4), "Prefix")) {
                break;
            }
            i8++;
        }
        mzo mzoVar11 = mzoVar4;
        if (mzoVar11 != null) {
            int iIntValue4 = function2.invoke(mzoVar11, Integer.valueOf(iB)).intValue();
            iB = ntr.b(iB, mzoVar11.b0(Reader.READ_DONE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                mzoVar5 = null;
                break;
            }
            mzoVar5 = list.get(i9);
            if (Intrinsics.g(ntr.a(mzoVar5), "Suffix")) {
                break;
            }
            i9++;
        }
        mzo mzoVar12 = mzoVar5;
        if (mzoVar12 != null) {
            int iIntValue5 = function2.invoke(mzoVar12, Integer.valueOf(iB)).intValue();
            iB = ntr.b(iB, mzoVar12.b0(Reader.READ_DONE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            mzo mzoVar13 = list.get(i10);
            if (Intrinsics.g(ntr.a(mzoVar13), "TextField")) {
                int iIntValue6 = function2.invoke(mzoVar13, Integer.valueOf(iB)).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        mzoVar6 = null;
                        break;
                    }
                    mzoVar6 = list.get(i11);
                    if (Intrinsics.g(ntr.a(mzoVar6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                mzo mzoVar14 = mzoVar6;
                int iIntValue7 = mzoVar14 != null ? function2.invoke(mzoVar14, Integer.valueOf(iB)).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        mzoVar7 = null;
                        break;
                    }
                    mzoVar7 = list.get(i12);
                    if (Intrinsics.g(ntr.a(mzoVar7), "Supporting")) {
                        break;
                    }
                    i12++;
                }
                mzo mzoVar15 = mzoVar7;
                return b(nzoVar, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, mzoVar15 != null ? function2.invoke(mzoVar15, Integer.valueOf(i2)).intValue() : 0, oxa.b(0, 0, 0, 15), false, this.c.invoke());
            }
        }
        throw hu1.a("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.aiv
    public final int e(nzo nzoVar, List<? extends mzo> list, int i) {
        return f(i, list, new khf0());
    }

    @Override // defpackage.aiv
    public final int g(nzo nzoVar, List<? extends mzo> list, int i) {
        return d(nzoVar, list, i, new kaz(1));
    }

    @Override // defpackage.aiv
    public final int i(nzo nzoVar, List<? extends mzo> list, int i) {
        return d(nzoVar, list, i, new s5q());
    }
}
