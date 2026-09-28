package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class mpz implements nxr {
    public final /* synthetic */ zpz a;
    public final /* synthetic */ tmz b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xnz d;
    public final /* synthetic */ Function0<hpz> e;
    public final /* synthetic */ Function0<Integer> f;
    public final /* synthetic */ ht.c g;
    public final /* synthetic */ int h;
    public final /* synthetic */ z4a0 i;
    public final /* synthetic */ v5b j;

    public mpz(zpz zpzVar, tmz tmzVar, float f, xnz xnzVar, lhp lhpVar, Function0 function0, ht.c cVar, int i, z4a0 z4a0Var, v5b v5bVar) {
        i3z i3zVar = i3z.a;
        this.a = zpzVar;
        this.b = tmzVar;
        this.c = f;
        this.d = xnzVar;
        this.e = lhpVar;
        this.f = function0;
        this.g = cVar;
        this.h = i;
        this.i = z4a0Var;
        this.j = v5bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v65, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v66, types: [m2g] */
    /* JADX WARN: Type inference failed for: r32v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r52v2 */
    /* JADX WARN: Type inference failed for: r52v3 */
    /* JADX WARN: Type inference failed for: r52v4 */
    @Override // defpackage.nxr
    public final biv a(oxr oxrVar, long j) {
        ht.c cVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        fiv fivVar;
        int i17;
        int i18;
        gx0 gx0Var;
        int i19;
        ArrayList arrayList;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList2;
        int i23;
        int i24;
        gx0 gx0Var2;
        rce0 rce0Var;
        ArrayList arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        ?? r52;
        int i25;
        z4a0 z4a0Var;
        int i26;
        int i27;
        ArrayList arrayList6;
        int i28;
        Object obj;
        npz npzVar;
        int i29;
        List<Integer> list;
        List<Integer> list2;
        mpz mpzVar = this;
        zpz zpzVar = mpzVar.a;
        zpzVar.D.getValue();
        i3z i3zVar = i3z.b;
        i3z i3zVar2 = i3z.a;
        dj7.a(j, i3zVar);
        rce0 rce0Var2 = oxrVar.b;
        asr layoutDirection = rce0Var2.getLayoutDirection();
        tmz tmzVar = mpzVar.b;
        int iY0 = rce0Var2.y0(h.d(tmzVar, layoutDirection));
        int iY1 = rce0Var2.y0(h.c(tmzVar, rce0Var2.getLayoutDirection()));
        int iY2 = rce0Var2.y0(tmzVar.d());
        int iY3 = rce0Var2.y0(tmzVar.a()) + iY2;
        int i30 = iY1 + iY0;
        int i31 = i30 - iY0;
        long jI = oxa.i(-i30, j, -iY3);
        zpzVar.q = oxrVar;
        int iY4 = rce0Var2.y0(mpzVar.c);
        int i32 = kxa.i(j) - i30;
        long j2 = (((long) iY0) << 32) | (((long) iY2) & 4294967295L);
        mpzVar.d.a(i32);
        int i33 = i32 < 0 ? 0 : i32;
        long j3 = j2;
        zpzVar.A = oxa.b(0, i33, kxa.h(jI), 5);
        hpz hpzVarInvoke = mpzVar.e.invoke();
        int i34 = i32 + iY0 + i31;
        c5a0.a aVar = c5a0.e;
        z4a0 z4a0Var2 = mpzVar.i;
        aVar.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            int iK = zpzVar.k();
            qpz qpzVar = zpzVar.d;
            int iA = gxr.a(iK, hpzVarInvoke, qpzVar.e);
            if (iK != iA) {
                ((u5a0) qpzVar.b).k(iA);
                qpzVar.f.b(iK);
            }
            zpzVar.k();
            float fL = zpzVar.l();
            zpzVar.n();
            int i35 = i33 + iY4;
            int iB = ycv.b(z4a0Var2.d(i34, i33, iY0, i31) - (fL * i35));
            Unit unit = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            List<Integer> listA = nwr.a(hpzVarInvoke, zpzVar.B, zpzVar.w);
            msw mswVar = hwo.a;
            msw mswVar2 = new msw();
            int iIntValue = mpzVar.f.invoke().intValue();
            ytw<Unit> ytwVar = zpzVar.C;
            if (iY0 < 0) {
                zkn.a("negative beforeContentPadding");
            }
            if (i31 < 0) {
                zkn.a("negative afterContentPadding");
            }
            int i36 = i35 < 0 ? 0 : i35;
            int i37 = mpzVar.h;
            if (i37 > iIntValue) {
                i37 = iIntValue;
            }
            int i38 = i33;
            z4a0 z4a0Var3 = mpzVar.i;
            v5b v5bVar = mpzVar.j;
            if (iIntValue <= 0) {
                int iK2 = kxa.k(jI);
                int iJ = kxa.j(jI);
                jpz jpzVar = new jpz();
                int iG = oxa.g(iK2 + i30, j);
                int iF = oxa.f(iJ + iY3, j);
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                npz npzVar2 = new npz(m2g.a, i38, iY4, i31, -iY0, i32 + i31, i37, z4a0Var3, rce0Var2.e1(iG, iF, o2gVar, jpzVar), v5bVar);
                rce0Var = rce0Var2;
                npzVar = npzVar2;
            } else {
                int i39 = i37;
                int i40 = i38;
                int i41 = iB;
                long jB = oxa.b(0, i40, kxa.h(jI), 5);
                int i42 = iA;
                while (i42 > 0 && i41 > 0) {
                    i42--;
                    i41 -= i36;
                }
                int i43 = i41 * (-1);
                if (i42 >= iIntValue) {
                    i42 = iIntValue - 1;
                    i43 = 0;
                }
                gx0 gx0Var3 = new gx0();
                int i44 = -iY0;
                int i45 = i44 + (iY4 < 0 ? iY4 : 0);
                int i46 = i43 + i45;
                List<Integer> list3 = listA;
                int i47 = i46;
                int i48 = i34;
                int i49 = iIntValue;
                int iMax = 0;
                while (true) {
                    cVar = mpzVar.g;
                    if (i47 >= 0 || i42 <= 0) {
                        break;
                    }
                    int i50 = i42 - 1;
                    int i51 = i36;
                    ytw<Unit> ytwVar2 = ytwVar;
                    long j4 = j3;
                    long j5 = jB;
                    fiv fivVarA = lpz.a(oxrVar, i50, j5, hpzVarInvoke, j4, cVar, rce0Var2.getLayoutDirection(), i40, mswVar2);
                    gx0Var3.add(0, fivVarA);
                    iMax = Math.max(iMax, fivVarA.h);
                    i47 += i51;
                    mpzVar = this;
                    i42 = i50;
                    iY0 = iY0;
                    i48 = i48;
                    i39 = i39;
                    i40 = i40;
                    i36 = i51;
                    i45 = i45;
                    iY4 = iY4;
                    hpzVarInvoke = hpzVarInvoke;
                    jB = j5;
                    ytwVar = ytwVar2;
                    j3 = j4;
                }
                int i52 = iY0;
                final ytw<Unit> ytwVar3 = ytwVar;
                int i53 = i39;
                int i54 = iY4;
                int i55 = i32;
                int i56 = i48;
                int i57 = i45;
                int i58 = i36;
                int i59 = i40;
                long j6 = jB;
                hpz hpzVar = hpzVarInvoke;
                long j7 = j3;
                long j8 = j6;
                if (i47 < i57) {
                    i47 = i57;
                }
                int i60 = i47 - i57;
                int i61 = i31;
                int i62 = i55 + i61;
                int i63 = i62 < 0 ? 0 : i62;
                int i64 = -i60;
                int i65 = 0;
                boolean z = false;
                int i66 = i42;
                while (true) {
                    i = i60;
                    if (i65 >= gx0Var3.c) {
                        break;
                    }
                    if (i64 >= i63) {
                        gx0Var3.c(i65);
                        Unit unit2 = Unit.a;
                        z = true;
                    } else {
                        i66++;
                        i64 += i58;
                        i65++;
                    }
                    i60 = i;
                }
                int i67 = i66;
                int i68 = i42;
                int iMax2 = iMax;
                int i69 = i64;
                boolean z2 = z;
                int i70 = i;
                while (true) {
                    i2 = i49;
                    if (i67 >= i2) {
                        i3 = 1;
                        i4 = 0;
                        break;
                    }
                    if (i69 >= i63 && i69 > 0 && !gx0Var3.isEmpty()) {
                        i3 = 1;
                        i4 = 0;
                        break;
                    }
                    int i71 = iMax2;
                    i49 = i2;
                    int i72 = i58;
                    int i73 = i61;
                    long j9 = j8;
                    int i74 = i63;
                    fiv fivVarA2 = lpz.a(oxrVar, i67, j9, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2);
                    int i75 = i67;
                    int i76 = i49 - 1;
                    i69 += i75 == i76 ? i59 : i72;
                    if (i69 > i57 || i75 == i76) {
                        int iMax3 = Math.max(i71, fivVarA2.h);
                        gx0Var3.addLast(fivVarA2);
                        i71 = iMax3;
                    } else {
                        i70 -= i72;
                        Unit unit3 = Unit.a;
                        z2 = true;
                        i68 = i75 + 1;
                    }
                    i67 = i75 + 1;
                    i63 = i74;
                    j8 = j9;
                    iMax2 = i71;
                    i58 = i72;
                    i61 = i73;
                }
                if (i69 < i55) {
                    int i77 = i55 - i69;
                    int i78 = i69 + i77;
                    int i79 = i70 - i77;
                    int i80 = i52;
                    while (i79 < i80 && i68 > 0) {
                        i68--;
                        int i81 = i80;
                        fiv fivVarA3 = lpz.a(oxrVar, i68, j8, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2);
                        gx0Var3.add(i4, fivVarA3);
                        iMax2 = Math.max(iMax2, fivVarA3.h);
                        i80 = i81;
                        i78 = i78;
                        i79 += i58;
                        i67 = i67;
                    }
                    i5 = i67;
                    int i82 = i79;
                    i7 = i78;
                    i6 = i80;
                    if (i82 < 0) {
                        i7 += i82;
                        i8 = i4;
                    } else {
                        i8 = i82;
                    }
                } else {
                    i5 = i67;
                    int i83 = i69;
                    i6 = i52;
                    int i84 = i70;
                    i7 = i83;
                    i8 = i84;
                }
                if (i8 < 0) {
                    zkn.a("invalid currentFirstPageScrollOffset");
                }
                int i85 = -i8;
                fiv fivVar2 = (fiv) gx0Var3.first();
                int i86 = i54;
                if (i6 > 0 || i86 < 0) {
                    int i87 = i8;
                    int b = gx0Var3.getB();
                    fiv fivVar3 = fivVar2;
                    int i88 = i87;
                    int i89 = 0;
                    while (true) {
                        if (i89 >= b || i88 == 0) {
                            i9 = iMax2;
                            i10 = i58;
                            break;
                        }
                        i9 = iMax2;
                        i10 = i58;
                        if (i10 > i88) {
                            break;
                        }
                        int i90 = b;
                        if (i89 == gx0Var3.getB() - 1) {
                            break;
                        }
                        i88 -= i10;
                        i89++;
                        fivVar3 = (fiv) gx0Var3.get(i89);
                        i58 = i10;
                        iMax2 = i9;
                        b = i90;
                    }
                    i11 = i88;
                    fivVar2 = fivVar3;
                } else {
                    i11 = i8;
                    i9 = iMax2;
                    i10 = i58;
                }
                i3z i3zVar3 = i3z.a;
                int iMax4 = Math.max(0, i68 - i53);
                int i91 = i68 - 1;
                if (iMax4 <= i91) {
                    ArrayList arrayList7 = null;
                    while (true) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        i13 = i10;
                        arrayList = arrayList7;
                        i3z i3zVar4 = i3z.a;
                        i12 = i55;
                        i14 = i6;
                        fivVar = fivVar2;
                        i16 = iMax4;
                        i15 = i85;
                        i17 = i86;
                        i18 = i7;
                        gx0Var = gx0Var3;
                        i19 = i53;
                        arrayList.add(lpz.a(oxrVar, i91, j8, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2));
                        if (i91 == i16) {
                            break;
                        }
                        i91--;
                        iMax4 = i16;
                        i53 = i19;
                        fivVar2 = fivVar;
                        gx0Var3 = gx0Var;
                        i6 = i14;
                        i55 = i12;
                        i7 = i18;
                        i86 = i17;
                        i85 = i15;
                        arrayList7 = arrayList;
                        i10 = i13;
                    }
                } else {
                    i12 = i55;
                    i13 = i10;
                    i14 = i6;
                    i15 = i85;
                    i16 = iMax4;
                    fivVar = fivVar2;
                    i17 = i86;
                    i18 = i7;
                    gx0Var = gx0Var3;
                    i19 = i53;
                    arrayList = null;
                }
                int size = list3.size();
                List arrayList8 = arrayList;
                int i92 = 0;
                while (i92 < size) {
                    List<Integer> list4 = list3;
                    int i93 = size;
                    int iIntValue2 = list4.get(i92).intValue();
                    if (iIntValue2 < i16) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        i3z i3zVar5 = i3z.a;
                        list2 = list4;
                        List list5 = arrayList8;
                        list5.add(lpz.a(oxrVar, iIntValue2, j8, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2));
                        arrayList8 = list5;
                    } else {
                        list2 = list4;
                    }
                    i92++;
                    i16 = i16;
                    size = i93;
                    list3 = list2;
                }
                List<Integer> list6 = list3;
                if (arrayList8 == null) {
                    arrayList8 = m2g.a;
                }
                List list7 = arrayList8;
                int size2 = list7.size();
                int iMax5 = i9;
                for (int i94 = 0; i94 < size2; i94++) {
                    iMax5 = Math.max(iMax5, ((fiv) list7.get(i94)).h);
                }
                int i95 = ((fiv) gx0Var.last()).a;
                i3z i3zVar6 = i3z.a;
                int iMin = Math.min(i19, (i2 - i95) - 1) + i95;
                int i96 = i95 + 1;
                if (i96 <= iMin) {
                    ArrayList arrayList9 = null;
                    while (true) {
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                        }
                        i3z i3zVar7 = i3z.a;
                        i20 = iMax5;
                        i21 = i19;
                        arrayList2 = arrayList9;
                        i22 = iMin;
                        int i97 = i96;
                        arrayList2.add(lpz.a(oxrVar, i97, j8, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2));
                        if (i97 == i22) {
                            break;
                        }
                        i96 = i97 + 1;
                        iMin = i22;
                        arrayList9 = arrayList2;
                        iMax5 = i20;
                        i19 = i21;
                    }
                } else {
                    i20 = iMax5;
                    i21 = i19;
                    i22 = iMin;
                    arrayList2 = null;
                }
                int size3 = list6.size();
                ArrayList arrayList10 = arrayList2;
                int i98 = 0;
                while (i98 < size3) {
                    List<Integer> list8 = list6;
                    int i99 = size3;
                    int iIntValue3 = list8.get(i98).intValue();
                    ArrayList arrayList11 = arrayList10;
                    if (i22 + 1 <= iIntValue3) {
                        int i100 = i2;
                        if (iIntValue3 < i100) {
                            if (arrayList11 == null) {
                                arrayList11 = new ArrayList();
                            }
                            ArrayList arrayList12 = arrayList11;
                            i3z i3zVar8 = i3z.a;
                            i98 = i98;
                            i29 = i100;
                            list = list8;
                            arrayList12.add(lpz.a(oxrVar, iIntValue3, j8, hpzVar, j7, cVar, rce0Var2.getLayoutDirection(), i59, mswVar2));
                            arrayList10 = arrayList12;
                        } else {
                            i29 = i100;
                        }
                        int i101 = i98 + 1;
                        i2 = i29;
                        i22 = i22;
                        i98 = i101;
                        list6 = list;
                        size3 = i99;
                    } else {
                        i29 = i2;
                    }
                    list = list8;
                    arrayList10 = arrayList11;
                    int i102 = i98 + 1;
                    i2 = i29;
                    i22 = i22;
                    i98 = i102;
                    list6 = list;
                    size3 = i99;
                }
                ArrayList arrayList13 = arrayList10;
                int i103 = i2;
                List list9 = arrayList13 == null ? m2g.a : arrayList13;
                int size4 = list9.size();
                int iMax6 = i20;
                for (int i104 = 0; i104 < size4; i104++) {
                    iMax6 = Math.max(iMax6, ((fiv) list9.get(i104)).h);
                }
                int i105 = (Intrinsics.g(fivVar, gx0Var.first()) && list7.isEmpty() && list9.isEmpty()) ? i3 : 0;
                i3z i3zVar9 = i3z.a;
                int iG2 = oxa.g(i18, jI);
                int iF2 = oxa.f(iMax6, jI);
                int i106 = i12;
                int i107 = i18 < Math.min(iG2, i106) ? i3 : 0;
                if (i107 == 0 || i15 == 0) {
                    i23 = i15;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i23 = i15;
                    sb.append(i23);
                    zkn.c(sb.toString());
                }
                final ArrayList arrayList14 = new ArrayList(list9.size() + list7.size() + gx0Var.getB());
                if (i107 != 0) {
                    if (!list7.isEmpty() || !list9.isEmpty()) {
                        zkn.a("No extra pages");
                    }
                    int b2 = gx0Var.getB();
                    int[] iArr = new int[b2];
                    for (int i108 = 0; i108 < b2; i108++) {
                        iArr[i108] = i59;
                    }
                    int[] iArr2 = new int[b2];
                    i24 = i105;
                    kw0.i iVar = new kw0.i(rce0Var2.u1(i17), false, null);
                    i3z i3zVar10 = i3z.a;
                    rce0Var = rce0Var2;
                    iVar.b(oxrVar, iG2, iArr, asr.a, iArr2);
                    IntRange intRangeY = ay0.y(iArr2);
                    int i109 = intRangeY.b;
                    int i110 = intRangeY.c;
                    if ((i110 > 0 && i109 >= 0) || (i110 < 0 && i109 <= 0)) {
                        int i111 = 0;
                        while (true) {
                            int i112 = iArr2[i111];
                            int i113 = i110;
                            gx0Var2 = gx0Var;
                            int[] iArr3 = iArr2;
                            fiv fivVar4 = (fiv) gx0Var2.get(i111);
                            fivVar4.b(i112, iG2, iF2);
                            arrayList14.add(fivVar4);
                            if (i111 == i109) {
                                break;
                            }
                            i111 += i113;
                            iArr2 = iArr3;
                            gx0Var = gx0Var2;
                            i110 = i113;
                        }
                    } else {
                        gx0Var2 = gx0Var;
                    }
                } else {
                    i24 = i105;
                    gx0Var2 = gx0Var;
                    rce0Var = rce0Var2;
                    int size5 = list7.size();
                    int i114 = i23;
                    int i115 = 0;
                    while (i115 < size5) {
                        int i116 = i23;
                        fiv fivVar5 = (fiv) list7.get(i115);
                        i114 -= i35;
                        fivVar5.b(i114, iG2, iF2);
                        arrayList14.add(fivVar5);
                        i115++;
                        i23 = i116;
                    }
                    int i117 = i23;
                    int b3 = gx0Var2.getB();
                    int i118 = i117;
                    for (int i119 = 0; i119 < b3; i119++) {
                        fiv fivVar6 = (fiv) gx0Var2.get(i119);
                        fivVar6.b(i118, iG2, iF2);
                        arrayList14.add(fivVar6);
                        i118 += i35;
                    }
                    int size6 = list9.size();
                    for (int i120 = 0; i120 < size6; i120++) {
                        fiv fivVar7 = (fiv) list9.get(i120);
                        fivVar7.b(i118, iG2, iF2);
                        arrayList14.add(fivVar7);
                        i118 += i35;
                    }
                }
                if (i24 != 0) {
                    arrayList3 = arrayList14;
                } else {
                    arrayList3 = new ArrayList(arrayList14.size());
                    int size7 = arrayList14.size();
                    int i121 = 0;
                    while (i121 < size7) {
                        Object obj2 = arrayList14.get(i121);
                        gx0 gx0Var4 = gx0Var2;
                        fiv fivVar8 = (fiv) obj2;
                        int i122 = iG2;
                        int i123 = size7;
                        if (fivVar8.a >= ((fiv) gx0Var4.first()).a && fivVar8.a <= ((fiv) gx0Var4.last()).a) {
                            arrayList3.add(obj2);
                        }
                        i121++;
                        size7 = i123;
                        iG2 = i122;
                        gx0Var2 = gx0Var4;
                    }
                }
                gx0 gx0Var5 = gx0Var2;
                int i124 = iG2;
                if (list7.isEmpty()) {
                    arrayList4 = m2g.a;
                } else {
                    arrayList4 = new ArrayList(arrayList14.size());
                    int size8 = arrayList14.size();
                    for (int i125 = 0; i125 < size8; i125++) {
                        Object obj3 = arrayList14.get(i125);
                        if (((fiv) obj3).a < ((fiv) gx0Var5.first()).a) {
                            arrayList4.add(obj3);
                        }
                    }
                }
                ?? r32 = arrayList4;
                if (list9.isEmpty()) {
                    arrayList5 = m2g.a;
                } else {
                    arrayList5 = new ArrayList(arrayList14.size());
                    int size9 = arrayList14.size();
                    for (int i126 = 0; i126 < size9; i126++) {
                        Object obj4 = arrayList14.get(i126);
                        if (((fiv) obj4).a > ((fiv) gx0Var5.last()).a) {
                            arrayList5.add(obj4);
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    r52 = arrayList5;
                    i28 = iF2;
                    i25 = i14;
                    z4a0Var = z4a0Var3;
                    i26 = i56;
                    i27 = i61;
                    obj = null;
                    arrayList6 = arrayList3;
                } else {
                    Object obj5 = arrayList3.get(0);
                    r52 = arrayList5;
                    i25 = i14;
                    z4a0Var = z4a0Var3;
                    i26 = i56;
                    i27 = i61;
                    float f = -Math.abs(((fiv) obj5).j - z4a0Var.d(i26, i59, i25, i27));
                    int size10 = arrayList3.size() - 1;
                    int i127 = i3;
                    if (i127 <= size10) {
                        obj = obj5;
                        float f2 = f;
                        while (true) {
                            Object obj6 = arrayList3.get(i127);
                            arrayList6 = arrayList3;
                            i28 = iF2;
                            float f3 = -Math.abs(((fiv) obj6).j - z4a0Var.d(i26, i59, i25, i27));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj = obj6;
                            }
                            if (i127 == size10) {
                                break;
                            }
                            i127++;
                            arrayList3 = arrayList6;
                            iF2 = i28;
                        }
                    } else {
                        arrayList6 = arrayList3;
                        i28 = iF2;
                        obj = obj5;
                    }
                }
                fiv fivVar9 = (fiv) obj;
                float fD = i13 == 0 ? 0.0f : f.d((z4a0Var.d(i26, i59, i25, i27) - (fivVar9 != null ? fivVar9.j : 0)) / i13, -0.5f, 0.5f);
                Function1<? super y.a, Unit> function1 = new Function1() { // from class: kpz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        y.a aVar2 = (y.a) obj7;
                        final ArrayList arrayList15 = arrayList14;
                        Function1 function2 = new Function1() { // from class: ipz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                y.a aVar3 = (y.a) obj8;
                                ArrayList arrayList16 = arrayList15;
                                int size11 = arrayList16.size();
                                for (int i128 = 0; i128 < size11; i128++) {
                                    fiv fivVar10 = (fiv) arrayList16.get(i128);
                                    List<y> list10 = fivVar10.b;
                                    boolean z3 = fivVar10.g;
                                    if (fivVar10.k == Integer.MIN_VALUE) {
                                        zkn.a("position() should be called first");
                                    }
                                    int size12 = list10.size();
                                    for (int i129 = 0; i129 < size12; i129++) {
                                        y yVar = list10.get(i129);
                                        int[] iArr4 = fivVar10.i;
                                        int i130 = i129 * 2;
                                        long jD = iwo.d((((long) iArr4[i130]) << 32) | (((long) iArr4[i130 + 1]) & 4294967295L), fivVar10.c);
                                        if (z3) {
                                            y.a.M(aVar3, yVar, jD);
                                        } else {
                                            y.a.D(aVar3, yVar, jD);
                                        }
                                    }
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.a = true;
                        function2.invoke(aVar2);
                        aVar2.a = false;
                        ytwVar3.getValue();
                        return Unit.a;
                    }
                };
                float f4 = fD;
                int iG3 = oxa.g(i124 + i30, j);
                int iF3 = oxa.f(i28 + iY3, j);
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                npzVar = new npz(arrayList6, i59, i17, i27, i3zVar, i44, i62, i21, fivVar, fivVar9, f4, i11, i5 < i103 || i18 > i106, z4a0Var, rce0Var.e1(iG3, iF3, o2gVar2, function1), z2, r32, r52, v5bVar);
            }
            zpzVar.h(npzVar, rce0Var.q0(), false);
            return npzVar;
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }
}
