package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class avr implements nxr {
    public final /* synthetic */ zvr a;
    public final /* synthetic */ tmz b;
    public final /* synthetic */ Function0<our> c;
    public final /* synthetic */ ovr d;
    public final /* synthetic */ kw0.l e;
    public final /* synthetic */ v5b f;
    public final /* synthetic */ t6l g;
    public final /* synthetic */ l0e0 h;

    public avr(zvr zvrVar, tmz tmzVar, lhp lhpVar, ovr ovrVar, kw0.l lVar, kw0.e eVar, v5b v5bVar, t6l t6lVar, l0e0.a.C0800a c0800a) {
        this.a = zvrVar;
        this.b = tmzVar;
        this.c = lhpVar;
        this.d = ovrVar;
        this.e = lVar;
        this.f = v5bVar;
        this.g = t6lVar;
        this.h = c0800a;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0402  */
    /* JADX WARN: Code duplicated, block: B:153:0x043f  */
    /* JADX WARN: Code duplicated, block: B:157:0x044f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0505 A[LOOP:6: B:181:0x04c0->B:196:0x0505, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x050f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0517  */
    /* JADX WARN: Code duplicated, block: B:204:0x0522  */
    /* JADX WARN: Code duplicated, block: B:223:0x058d  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:233:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:235:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:237:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:249:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:250:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:257:0x0612 A[LOOP:12: B:256:0x0610->B:257:0x0612, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x062a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0637  */
    /* JADX WARN: Code duplicated, block: B:268:0x0645 A[LOOP:13: B:267:0x0643->B:268:0x0645, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0656  */
    /* JADX WARN: Code duplicated, block: B:278:0x0683 A[LOOP:15: B:277:0x0681->B:278:0x0683, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x068f A[LOOP:14: B:276:0x066d->B:280:0x068f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:282:0x0698  */
    /* JADX WARN: Code duplicated, block: B:284:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:286:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:290:0x06c4 A[LOOP:17: B:287:0x06ad->B:290:0x06c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:295:0x06e5 A[LOOP:19: B:294:0x06e3->B:295:0x06e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x0700 A[LOOP:20: B:298:0x06fe->B:299:0x0700, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x073a  */
    /* JADX WARN: Code duplicated, block: B:305:0x074a  */
    /* JADX WARN: Code duplicated, block: B:307:0x0762  */
    /* JADX WARN: Code duplicated, block: B:309:0x0769 A[LOOP:16: B:308:0x0767->B:309:0x0769, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x077e  */
    /* JADX WARN: Code duplicated, block: B:316:0x07ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:344:0x044a A[EDGE_INSN: B:344:0x044a->B:155:0x044a BREAK  A[LOOP:4: B:143:0x03fe->B:154:0x0442], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0515 A[EDGE_INSN: B:352:0x0515->B:200:0x0515 BREAK  A[LOOP:6: B:181:0x04c0->B:196:0x0505], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x0693 A[EDGE_INSN: B:364:0x0693->B:281:0x0693 BREAK  A[LOOP:14: B:276:0x066d->B:280:0x068f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x06c8 A[EDGE_INSN: B:368:0x06c8->B:291:0x06c8 BREAK  A[LOOP:17: B:287:0x06ad->B:290:0x06c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x05da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x05da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.nxr
    public final biv a(oxr oxrVar, long j) {
        int iC;
        int iD;
        rce0 rce0Var;
        zvr zvrVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int size;
        List list;
        int i6;
        rvr rvrVar;
        yur yurVar;
        List list2;
        int i7;
        List arrayList;
        int size2;
        List arrayList2;
        int i8;
        int b;
        int i9;
        ivr ivrVar;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int iF;
        List listI0;
        boolean z3;
        int size3;
        int i14;
        int length;
        final ArrayList arrayList3;
        int size4;
        int size5;
        int i15;
        int i16;
        List list3;
        int size6;
        int i17;
        hvr[] hvrVarArrA;
        int length2;
        int i18;
        int i19;
        int i20;
        List list4;
        boolean z4;
        float f;
        int i21;
        int i22;
        boolean z5;
        gvr gvrVar;
        long jB;
        int iF2;
        int size7;
        int i23;
        int size8;
        int[] iArr;
        int i24;
        int[] iArr2;
        int i25;
        int i26;
        int i27;
        int[] iArr3;
        hvr[] hvrVarArrA2;
        int length3;
        int i28;
        int iIntValue;
        int i29;
        List<Integer> list5;
        yur yurVar2;
        hvr hvrVar;
        int iIntValue2;
        yur yurVar3;
        rce0 rce0Var2 = oxrVar.b;
        zvr zvrVar2 = this.a;
        ytw<Unit> ytwVar = zvrVar2.s;
        mvr mvrVar = zvrVar2.d;
        ytwVar.getValue();
        boolean z6 = zvrVar2.b || rce0Var2.q0();
        i3z i3zVar = i3z.a;
        dj7.a(j, i3zVar);
        asr layoutDirection = rce0Var2.getLayoutDirection();
        tmz tmzVar = this.b;
        int iY0 = rce0Var2.y0(tmzVar.b(layoutDirection));
        int iY1 = rce0Var2.y0(tmzVar.c(rce0Var2.getLayoutDirection()));
        int iY2 = rce0Var2.y0(tmzVar.d());
        int iY3 = rce0Var2.y0(tmzVar.a()) + iY2;
        int i30 = iY1 + iY0;
        int i31 = iY3 - iY2;
        long jI = oxa.i(-i30, j, -iY3);
        our ourVarInvoke = this.c.invoke();
        final rvr rvrVarI = ourVarInvoke.i();
        nvr nvrVarA = this.d.a(oxrVar, jI);
        int length4 = nvrVarA.a.length;
        if (length4 != rvrVarI.i) {
            rvrVarI.i = length4;
            ArrayList<rvr.a> arrayList4 = rvrVarI.b;
            arrayList4.clear();
            arrayList4.add(new rvr.a(0, 0));
            rvrVarI.c = 0;
            rvrVarI.d = 0;
            rvrVarI.e = 0;
            rvrVarI.f = -1;
            rvrVarI.g.clear();
        }
        kw0.l lVar = this.e;
        if (lVar == null) {
            zkn.b("null verticalArrangement when isVertical == true");
            fkd.a();
            return null;
        }
        int iY4 = rce0Var2.y0(lVar.a());
        int iA = ourVarInvoke.a();
        int iH = kxa.h(j) - iY3;
        yur yurVar4 = new yur(ourVarInvoke, oxrVar, iY4, this.a, iY2, i31, (((long) iY2) & 4294967295L) | (((long) iY0) << 32));
        final zur zurVar = new zur(nvrVarA, iA, iY4, yurVar4, rvrVarI);
        Function1 function1 = new Function1() { // from class: xur
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                rvr.c cVarB = rvrVarI.b(((Integer) obj).intValue());
                int i32 = cVarB.a;
                List<s7l> list6 = cVarB.b;
                ArrayList arrayList5 = new ArrayList(list6.size());
                int size9 = list6.size();
                int i33 = 0;
                for (int i34 = 0; i34 < size9; i34++) {
                    int i35 = (int) list6.get(i34).a;
                    arrayList5.add(new Pair(Integer.valueOf(i32), new kxa(zurVar.a(i33, i35))));
                    i32++;
                    i33 += i35;
                }
                return arrayList5;
            }
        };
        s6i s6iVar = new s6i(rvrVarI, 1);
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            int iD2 = ((u5a0) mvrVar.a).D();
            zur zurVar2 = zurVar;
            int iA2 = gxr.a(iD2, ourVarInvoke, mvrVar.d);
            if (iD2 != iA2) {
                ((u5a0) mvrVar.a).k(iA2);
                mvrVar.e.b(iD2);
            }
            if (iA2 < iA || iA <= 0) {
                iC = rvrVarI.c(iA2);
                iD = ((u5a0) mvrVar.b).D();
            } else {
                iC = rvrVarI.c(iA - 1);
                iD = 0;
            }
            Unit unit = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            List<Integer> listA = nwr.a(ourVarInvoke, zvrVar2.q, zvrVar2.n);
            float fFloatValue = (rce0Var2.q0() || !z6) ? zvrVar2.g : ((Number) ((x5a0) zvrVar2.v.b.b).getValue()).floatValue();
            LazyLayoutItemAnimator<hvr> lazyLayoutItemAnimator = zvrVar2.m;
            boolean zQ0 = rce0Var2.q0();
            gvr gvrVar2 = zvrVar2.c;
            final ytw<Unit> ytwVar2 = zvrVar2.r;
            if (iY2 < 0) {
                zkn.a("negative beforeContentPadding");
            }
            if (i31 < 0) {
                zkn.a("negative afterContentPadding");
            }
            our ourVar = yurVar4.b;
            v5b v5bVar = this.f;
            int i32 = iC;
            t6l t6lVar = this.g;
            float f2 = fFloatValue;
            if (iA <= 0) {
                int iK = kxa.k(jI);
                int iJ = kxa.j(jI);
                lazyLayoutItemAnimator.d(0, iK, iJ, new ArrayList(), ourVar.b(), yurVar4, true, zQ0, length4, z6, 0, 0, v5bVar, t6lVar);
                if (!zQ0) {
                    long jB2 = lazyLayoutItemAnimator.b();
                    if (!jxo.b(jB2, 0L)) {
                        iK = oxa.g((int) (jB2 >> 32), jI);
                        iJ = oxa.f((int) (jB2 & 4294967295L), jI);
                    }
                }
                dvr dvrVar = new dvr();
                int iG = oxa.g(iK + i30, j);
                int iF3 = oxa.f(iJ + iY3, j);
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                zvrVar = zvrVar2;
                rce0Var = rce0Var2;
                gvrVar = new gvr(null, 0, false, 0.0f, rce0Var2.e1(iG, iF3, o2gVar, dvrVar), 0.0f, false, v5bVar, oxrVar, length4, function1, s6iVar, m2g.a, -iY2, iH + i31, 0, i3zVar, i31, iY4);
            } else {
                rce0Var = rce0Var2;
                zvrVar = zvrVar2;
                yur yurVar5 = yurVar4;
                int i33 = iY4;
                int i34 = i31;
                int i35 = iY2;
                int iRound = Math.round(f2);
                int i36 = iD - iRound;
                if (i32 == 0 && i36 < 0) {
                    iRound += i36;
                    i36 = 0;
                }
                gx0 gx0Var = new gx0();
                int i37 = -i35;
                int i38 = i37 + (i33 < 0 ? i33 : 0);
                int i39 = i36 + i38;
                while (i39 < 0 && i32 > 0) {
                    int i40 = i33;
                    int i41 = i32 - 1;
                    int i42 = i37;
                    zur zurVar3 = zurVar2;
                    int i43 = i34;
                    ivr ivrVarC = zurVar3.c(i41);
                    i32 = i41;
                    gx0Var.add(0, ivrVarC);
                    i39 += ivrVarC.g;
                    i34 = i43;
                    i33 = i40;
                    zurVar2 = zurVar3;
                    i37 = i42;
                }
                int i44 = i33;
                int i45 = i37;
                final zur zurVar4 = zurVar2;
                int i46 = i34;
                if (i39 < i38) {
                    iRound -= i38 - i39;
                    i39 = i38;
                }
                int i47 = iRound;
                int i48 = i39 - i38;
                int i49 = iH + i46;
                int i50 = i49 >= 0 ? i49 : 0;
                int i51 = i48;
                int i52 = -i48;
                int i53 = i32;
                int i54 = 0;
                boolean z7 = false;
                while (i54 < gx0Var.c) {
                    if (i52 >= i50) {
                        gx0Var.c(i54);
                        Unit unit2 = Unit.a;
                        z7 = true;
                    } else {
                        i53++;
                        i52 += ((ivr) gx0Var.get(i54)).g;
                        i54++;
                    }
                }
                int i55 = i53;
                boolean z8 = z7;
                while (true) {
                    if (i55 >= iA || (i52 >= i50 && i52 > 0 && !gx0Var.isEmpty())) {
                        z = z8;
                        break;
                    }
                    z = z8;
                    ivr ivrVarC2 = zurVar4.c(i55);
                    int i56 = i55;
                    hvr[] hvrVarArr = ivrVarC2.b;
                    int i57 = i50;
                    int i58 = ivrVarC2.g;
                    if (hvrVarArr.length == 0) {
                        break;
                    }
                    i52 += i58;
                    if (i52 > i38 || ((hvr) ay0.H(hvrVarArr)).a == iA - 1) {
                        gx0Var.addLast(ivrVarC2);
                        z8 = z;
                    } else {
                        i51 -= i58;
                        Unit unit3 = Unit.a;
                        i32 = i56 + 1;
                        z8 = true;
                    }
                    i55 = i56 + 1;
                    i50 = i57;
                }
                if (i52 < iH) {
                    int i59 = iH - i52;
                    int i60 = i52 + i59;
                    i3 = i51 - i59;
                    while (i3 < i35 && i32 > 0) {
                        int i61 = i32 - 1;
                        int i62 = i60;
                        ivr ivrVarC3 = zurVar4.c(i61);
                        gx0Var.add(0, ivrVarC3);
                        i3 += ivrVarC3.g;
                        i60 = i62;
                        i35 = i35;
                        i32 = i61;
                    }
                    int i63 = i60;
                    i = i35;
                    i2 = i59 + i47;
                    if (i3 < 0) {
                        i2 += i3;
                        i52 = i63 + i3;
                        i3 = 0;
                    } else {
                        i52 = i63;
                    }
                } else {
                    i = i35;
                    i2 = i47;
                    i3 = i51;
                }
                float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i2) || Math.abs(Math.round(f2)) < Math.abs(i2)) ? f2 : i2;
                float f4 = f2 - f3;
                float f5 = 0.0f;
                if (zQ0 && i2 > i47 && f4 <= 0.0f) {
                    f5 = (i2 - i47) + f4;
                }
                float f6 = f5;
                if (i3 < 0) {
                    zkn.a("negative initial offset");
                }
                int i64 = -i3;
                ivr ivrVar2 = (ivr) gx0Var.first();
                hvr[] hvrVarArr2 = ivrVar2.b;
                int i65 = i3;
                hvr hvrVar2 = hvrVarArr2.length == 0 ? null : hvrVarArr2[0];
                int i66 = hvrVar2 != null ? hvrVar2.a : 0;
                ivr ivrVar3 = (ivr) gx0Var.i();
                if (ivrVar3 != null) {
                    hvr[] hvrVarArr3 = ivrVar3.b;
                    i4 = i64;
                    hvr hvrVar3 = hvrVarArr3.length == 0 ? null : hvrVarArr3[hvrVarArr3.length - 1];
                    i5 = hvrVar3 != null ? hvrVar3.a : 0;
                    size = listA.size();
                    list = null;
                    i6 = 0;
                    while (true) {
                        rvrVar = zurVar4.e;
                        if (i6 < size) {
                            break;
                        }
                        int i67 = size;
                        iIntValue2 = listA.get(i6).intValue();
                        if (iIntValue2 >= 0 || iIntValue2 >= i66) {
                            yurVar3 = yurVar5;
                        } else {
                            int iE = rvrVar.e(iIntValue2);
                            yur yurVar6 = yurVar5;
                            hvr hvrVarN0 = yurVar6.n0(iIntValue2, 0, iE, yurVar5.d, zurVar4.a(0, iE));
                            yurVar3 = yurVar6;
                            List arrayList5 = list == null ? new ArrayList() : list;
                            arrayList5.add(hvrVarN0);
                            list = arrayList5;
                        }
                        i6++;
                        yurVar5 = yurVar3;
                        size = i67;
                        i66 = i66;
                    }
                    int i68 = i66;
                    yurVar = yurVar5;
                    if (list == null) {
                        list = m2g.a;
                    }
                    list2 = list;
                    if (zQ0 || gvrVar2 == null) {
                        i7 = i5;
                        arrayList = null;
                    } else {
                        List<hvr> list6 = gvrVar2.m;
                        if (list6.isEmpty()) {
                            i7 = i5;
                            arrayList = null;
                        } else {
                            int size9 = list6.size() - 1;
                            int i69 = -1;
                            while (true) {
                                if (i69 >= size9) {
                                    hvrVar = null;
                                    break;
                                }
                                if (list6.get(size9).getIndex() > i5 && (size9 == 0 || list6.get(size9 - 1).getIndex() <= i5)) {
                                    hvrVar = list6.get(size9);
                                    break;
                                }
                                size9--;
                                i69 = -1;
                            }
                            nur nurVar = (nur) CollectionsKt.b0(list6);
                            ivr ivrVar4 = (ivr) CollectionsKt.d0(gx0Var);
                            int i70 = ivrVar4 != null ? ivrVar4.a + 1 : 0;
                            if (hvrVar != null) {
                                int index = hvrVar.getIndex();
                                i7 = i5;
                                int iMin = Math.min(nurVar.getIndex(), iA - 1);
                                if (index <= iMin) {
                                    arrayList = null;
                                    while (true) {
                                        if (arrayList != null) {
                                            int size10 = arrayList.size();
                                            f3 = f3;
                                            int i71 = 0;
                                            while (true) {
                                                if (i71 < size10) {
                                                    int i72 = size10;
                                                    hvr[] hvrVarArr4 = ((ivr) arrayList.get(i71)).b;
                                                    int i73 = i71;
                                                    int length5 = hvrVarArr4.length;
                                                    int i74 = 0;
                                                    while (true) {
                                                        if (i74 < length5) {
                                                            int i75 = i74;
                                                            if (hvrVarArr4[i75].a != index) {
                                                                i74 = i75 + 1;
                                                            }
                                                        } else {
                                                            i71 = i73 + 1;
                                                            size10 = i72;
                                                        }
                                                    }
                                                }
                                                if (index != iMin) {
                                                    break;
                                                }
                                                index++;
                                                f3 = f3;
                                            }
                                        } else {
                                            f3 = f3;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        ivr ivrVarC4 = zurVar4.c(i70);
                                        i70++;
                                        arrayList.add(ivrVarC4);
                                        if (index != iMin) {
                                            break;
                                            break;
                                        }
                                        index++;
                                        f3 = f3;
                                    }
                                }
                            } else {
                                i7 = i5;
                            }
                            arrayList = null;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = m2g.a;
                    }
                    size2 = listA.size();
                    arrayList2 = null;
                    i8 = 0;
                    while (i8 < size2) {
                        iIntValue = listA.get(i8).intValue();
                        if (i7 + 1 <= iIntValue || iIntValue >= iA) {
                            i29 = size2;
                            list5 = listA;
                        } else {
                            if (zQ0) {
                                int size11 = arrayList.size();
                                i29 = size2;
                                int i76 = 0;
                                while (true) {
                                    if (i76 < size11) {
                                        int i77 = i76;
                                        hvr[] hvrVarArr5 = ((ivr) arrayList.get(i76)).b;
                                        list5 = listA;
                                        int length6 = hvrVarArr5.length;
                                        int i78 = 0;
                                        while (true) {
                                            if (i78 < length6) {
                                                int i79 = i78;
                                                if (hvrVarArr5[i79].a != iIntValue) {
                                                    i78 = i79 + 1;
                                                }
                                            } else {
                                                i76 = i77 + 1;
                                                listA = list5;
                                            }
                                        }
                                    }
                                }
                            } else {
                                i29 = size2;
                            }
                            list5 = listA;
                            int iE2 = rvrVar.e(iIntValue);
                            yurVar2 = yurVar;
                            hvr hvrVarN1 = yurVar2.n0(iIntValue, 0, iE2, yurVar.d, zurVar4.a(0, iE2));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(hvrVarN1);
                            i8++;
                            size2 = i29;
                            listA = list5;
                            yurVar = yurVar2;
                        }
                        yurVar2 = yurVar;
                        i8++;
                        size2 = i29;
                        listA = list5;
                        yurVar = yurVar2;
                    }
                    final yur yurVar7 = yurVar;
                    if (arrayList2 == null) {
                        arrayList2 = m2g.a;
                    }
                    if (i <= 0 || i44 < 0) {
                        b = gx0Var.getB();
                        i9 = i65;
                        ivrVar = ivrVar2;
                        i10 = 0;
                        while (true) {
                            if (i10 < b) {
                                i12 = ((ivr) gx0Var.get(i10)).g;
                                if (i9 == 0 && i12 <= i9) {
                                    z2 = true;
                                    if (i10 == gx0Var.getB() - 1) {
                                        break;
                                    }
                                    i9 -= i12;
                                    i10++;
                                    ivrVar = (ivr) gx0Var.get(i10);
                                }
                            }
                            z2 = true;
                            break;
                        }
                        i11 = i9;
                    } else {
                        i11 = i65;
                        ivrVar = ivrVar2;
                        z2 = true;
                    }
                    i13 = kxa.i(jI);
                    iF = oxa.f(i52, jI);
                    listI0 = gx0Var;
                    if (!arrayList.isEmpty()) {
                        listI0 = CollectionsKt.i0(arrayList, gx0Var);
                    }
                    if (i52 < Math.min(iF, iH)) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    if (z3 && i4 != 0) {
                        zkn.c("non-zero firstLineScrollOffset");
                    }
                    size3 = listI0.size();
                    int i80 = i11;
                    length = 0;
                    for (i14 = 0; i14 < size3; i14++) {
                        length += ((ivr) listI0.get(i14)).b.length;
                    }
                    arrayList3 = new ArrayList(length);
                    if (z3) {
                        if (list2.isEmpty() || !arrayList2.isEmpty()) {
                            zkn.a("no items");
                        }
                        size8 = listI0.size();
                        iArr = new int[size8];
                        for (i24 = 0; i24 < size8; i24++) {
                            iArr[i24] = ((ivr) listI0.get(i24)).f;
                        }
                        iArr2 = new int[size8];
                        if (lVar != null) {
                            zkn.b("null verticalArrangement");
                            fkd.a();
                            return null;
                        }
                        lVar.c(oxrVar, iF, iArr, iArr2);
                        IntRange intRangeY = ay0.y(iArr2);
                        i25 = intRangeY.a;
                        i26 = intRangeY.b;
                        i27 = intRangeY.c;
                        if ((i27 > 0 && i25 <= i26) || (i27 < 0 && i26 <= i25)) {
                            while (true) {
                                iArr3 = iArr2;
                                hvrVarArrA2 = ((ivr) listI0.get(i25)).a(iArr2[i25], i13, iF);
                                length3 = hvrVarArrA2.length;
                                i28 = 0;
                                while (i28 < length3) {
                                    int i81 = i28;
                                    arrayList3.add(hvrVarArrA2[i81]);
                                    i28 = i81 + 1;
                                }
                                if (i25 == i26) {
                                    break;
                                }
                                i25 += i27;
                                iArr2 = iArr3;
                            }
                        }
                    } else {
                        size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            i19 = i4;
                            while (true) {
                                i20 = size4 - 1;
                                hvr hvrVar4 = (hvr) list2.get(size4);
                                list4 = list2;
                                i19 -= hvrVar4.o;
                                hvrVar4.d(i19, 0, i13, iF);
                                arrayList3.add(hvrVar4);
                                if (i20 < 0) {
                                    break;
                                }
                                size4 = i20;
                                list2 = list4;
                            }
                        }
                        size5 = listI0.size();
                        i15 = i4;
                        i16 = 0;
                        list3 = listI0;
                        while (i16 < size5) {
                            ivr ivrVar5 = (ivr) list3.get(i16);
                            List list7 = list3;
                            hvrVarArrA = ivrVar5.a(i15, i13, iF);
                            int i82 = size5;
                            length2 = hvrVarArrA.length;
                            i18 = 0;
                            while (i18 < length2) {
                                int i83 = i18;
                                arrayList3.add(hvrVarArrA[i83]);
                                i18 = i83 + 1;
                            }
                            i15 += ivrVar5.g;
                            i16++;
                            size5 = i82;
                            list3 = list7;
                        }
                        size6 = arrayList2.size();
                        for (i17 = 0; i17 < size6; i17++) {
                            hvr hvrVar5 = (hvr) arrayList2.get(i17);
                            hvrVar5.d(i15, 0, i13, iF);
                            arrayList3.add(hvrVar5);
                            i15 += hvrVar5.o;
                        }
                    }
                    lazyLayoutItemAnimator.d((int) f3, i13, iF, arrayList3, ourVar.b(), yurVar7, true, zQ0, length4, z6, i80, i52, v5bVar, t6lVar);
                    if (zQ0) {
                        z4 = zQ0;
                        f = f3;
                    } else {
                        jB = lazyLayoutItemAnimator.b();
                        z4 = zQ0;
                        if (!jxo.b(jB, 0L)) {
                            i13 = oxa.g(Math.max(i13, (int) (jB >> 32)), jI);
                            iF2 = oxa.f(Math.max(iF, (int) (jB & 4294967295L)), jI);
                            if (iF2 != iF) {
                                size7 = arrayList3.size();
                                for (i23 = 0; i23 < size7; i23++) {
                                    f = f3;
                                    hvr hvrVar6 = (hvr) arrayList3.get(i23);
                                    hvrVar6.p = iF2;
                                    hvrVar6.r = hvrVar6.f + iF2;
                                }
                                f = f3;
                            }
                            f = f3;
                            i21 = iF2;
                        }
                        int i84 = i13;
                        i22 = i7;
                        final List listC = wf9.c(this.h, i68, i22, arrayList3, ourVar.d(), i, i46, i84, i21, new Function1() { // from class: evr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int iIntValue3 = ((Integer) obj).intValue();
                                zur zurVar5 = zurVar4;
                                int iE3 = zurVar5.e.e(iIntValue3);
                                long jA = zurVar5.a(0, iE3);
                                yur yurVar8 = yurVar7;
                                return yurVar8.n0(iIntValue3, 0, iE3, yurVar8.d, jA);
                            }
                        });
                        if (i22 == iA - 1 || i52 > iH) {
                            z5 = z2;
                        } else {
                            z5 = false;
                        }
                        final boolean z9 = z4;
                        Function1<? super y.a, Unit> function2 = new Function1() { // from class: fvr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                boolean z10;
                                y.a aVar = (y.a) obj;
                                aVar.a = true;
                                ArrayList arrayList6 = arrayList3;
                                int size12 = arrayList6.size();
                                int i85 = 0;
                                while (true) {
                                    z10 = z9;
                                    if (i85 >= size12) {
                                        break;
                                    }
                                    ((hvr) arrayList6.get(i85)).p(aVar, z10);
                                    i85++;
                                }
                                List list8 = listC;
                                int size13 = list8.size();
                                for (int i86 = 0; i86 < size13; i86++) {
                                    ((hvr) list8.get(i86)).p(aVar, z10);
                                }
                                Unit unit4 = Unit.a;
                                aVar.a = false;
                                ytwVar2.getValue();
                                return Unit.a;
                            }
                        };
                        int iG2 = oxa.g(i84 + i30, j);
                        int iF4 = oxa.f(i21 + iY3, j);
                        o2g o2gVar2 = o2g.a;
                        o2gVar2.getClass();
                        gvrVar = new gvr(ivrVar, i80, z5, f, rce0Var.e1(iG2, iF4, o2gVar2, function2), f6, z, v5bVar, oxrVar, length4, function1, s6iVar, rxr.a(i68, i22, arrayList3, listC), i45, i49, iA, i3z.a, i46, i44);
                    }
                    f = f3;
                    i21 = iF;
                    int i85 = i13;
                    i22 = i7;
                    final List listC2 = wf9.c(this.h, i68, i22, arrayList3, ourVar.d(), i, i46, i85, i21, new Function1() { // from class: evr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int iIntValue3 = ((Integer) obj).intValue();
                            zur zurVar5 = zurVar4;
                            int iE3 = zurVar5.e.e(iIntValue3);
                            long jA = zurVar5.a(0, iE3);
                            yur yurVar8 = yurVar7;
                            return yurVar8.n0(iIntValue3, 0, iE3, yurVar8.d, jA);
                        }
                    });
                    if (i22 == iA - 1) {
                        z5 = z2;
                    } else {
                        z5 = z2;
                    }
                    final boolean z10 = z4;
                    Function1<? super y.a, Unit> function3 = new Function1() { // from class: fvr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z11;
                            y.a aVar = (y.a) obj;
                            aVar.a = true;
                            ArrayList arrayList6 = arrayList3;
                            int size12 = arrayList6.size();
                            int i86 = 0;
                            while (true) {
                                z11 = z10;
                                if (i86 >= size12) {
                                    break;
                                }
                                ((hvr) arrayList6.get(i86)).p(aVar, z11);
                                i86++;
                            }
                            List list8 = listC2;
                            int size13 = list8.size();
                            for (int i87 = 0; i87 < size13; i87++) {
                                ((hvr) list8.get(i87)).p(aVar, z11);
                            }
                            Unit unit4 = Unit.a;
                            aVar.a = false;
                            ytwVar2.getValue();
                            return Unit.a;
                        }
                    };
                    int iG3 = oxa.g(i85 + i30, j);
                    int iF5 = oxa.f(i21 + iY3, j);
                    o2g o2gVar3 = o2g.a;
                    o2gVar3.getClass();
                    gvrVar = new gvr(ivrVar, i80, z5, f, rce0Var.e1(iG3, iF5, o2gVar3, function3), f6, z, v5bVar, oxrVar, length4, function1, s6iVar, rxr.a(i68, i22, arrayList3, listC2), i45, i49, iA, i3z.a, i46, i44);
                } else {
                    i4 = i64;
                }
                size = listA.size();
                list = null;
                i6 = 0;
                while (true) {
                    rvrVar = zurVar4.e;
                    if (i6 < size) {
                        break;
                        break;
                    }
                    int i610 = size;
                    iIntValue2 = listA.get(i6).intValue();
                    if (iIntValue2 >= 0) {
                        yurVar3 = yurVar5;
                    } else {
                        yurVar3 = yurVar5;
                    }
                    i6++;
                    yurVar5 = yurVar3;
                    size = i610;
                    i66 = i66;
                }
                int i611 = i66;
                yurVar = yurVar5;
                if (list == null) {
                    list = m2g.a;
                }
                list2 = list;
                if (zQ0) {
                    i7 = i5;
                    arrayList = null;
                } else {
                    i7 = i5;
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = m2g.a;
                }
                size2 = listA.size();
                arrayList2 = null;
                i8 = 0;
                while (i8 < size2) {
                    iIntValue = listA.get(i8).intValue();
                    if (i7 + 1 <= iIntValue) {
                        i29 = size2;
                        list5 = listA;
                        yurVar2 = yurVar;
                    } else {
                        i29 = size2;
                        list5 = listA;
                        yurVar2 = yurVar;
                    }
                    i8++;
                    size2 = i29;
                    listA = list5;
                    yurVar = yurVar2;
                }
                final yur yurVar8 = yurVar;
                if (arrayList2 == null) {
                    arrayList2 = m2g.a;
                }
                if (i <= 0) {
                    b = gx0Var.getB();
                    i9 = i65;
                    ivrVar = ivrVar2;
                    i10 = 0;
                    while (true) {
                        if (i10 < b) {
                            i12 = ((ivr) gx0Var.get(i10)).g;
                            if (i9 == 0) {
                            }
                        }
                        z2 = true;
                        i9 -= i12;
                        i10++;
                        ivrVar = (ivr) gx0Var.get(i10);
                    }
                    i11 = i9;
                } else {
                    b = gx0Var.getB();
                    i9 = i65;
                    ivrVar = ivrVar2;
                    i10 = 0;
                    while (true) {
                        if (i10 < b) {
                            i12 = ((ivr) gx0Var.get(i10)).g;
                            if (i9 == 0) {
                            }
                        }
                        z2 = true;
                        i9 -= i12;
                        i10++;
                        ivrVar = (ivr) gx0Var.get(i10);
                    }
                    i11 = i9;
                }
                i13 = kxa.i(jI);
                iF = oxa.f(i52, jI);
                listI0 = gx0Var;
                if (!arrayList.isEmpty()) {
                    listI0 = CollectionsKt.i0(arrayList, gx0Var);
                }
                if (i52 < Math.min(iF, iH)) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                if (z3) {
                    zkn.c("non-zero firstLineScrollOffset");
                }
                size3 = listI0.size();
                int i86 = i11;
                length = 0;
                while (i14 < size3) {
                    length += ((ivr) listI0.get(i14)).b.length;
                }
                arrayList3 = new ArrayList(length);
                if (z3) {
                    if (list2.isEmpty()) {
                        zkn.a("no items");
                    } else {
                        zkn.a("no items");
                    }
                    size8 = listI0.size();
                    iArr = new int[size8];
                    while (i24 < size8) {
                        iArr[i24] = ((ivr) listI0.get(i24)).f;
                    }
                    iArr2 = new int[size8];
                    if (lVar != null) {
                        zkn.b("null verticalArrangement");
                        fkd.a();
                        return null;
                    }
                    lVar.c(oxrVar, iF, iArr, iArr2);
                    IntRange intRangeY2 = ay0.y(iArr2);
                    i25 = intRangeY2.a;
                    i26 = intRangeY2.b;
                    i27 = intRangeY2.c;
                    if (i27 > 0) {
                        while (true) {
                            iArr3 = iArr2;
                            hvrVarArrA2 = ((ivr) listI0.get(i25)).a(iArr2[i25], i13, iF);
                            length3 = hvrVarArrA2.length;
                            i28 = 0;
                            while (i28 < length3) {
                                int i87 = i28;
                                arrayList3.add(hvrVarArrA2[i87]);
                                i28 = i87 + 1;
                            }
                            if (i25 == i26) {
                                break;
                                break;
                            }
                            i25 += i27;
                            iArr2 = iArr3;
                        }
                    } else {
                        while (true) {
                            iArr3 = iArr2;
                            hvrVarArrA2 = ((ivr) listI0.get(i25)).a(iArr2[i25], i13, iF);
                            length3 = hvrVarArrA2.length;
                            i28 = 0;
                            while (i28 < length3) {
                                int i88 = i28;
                                arrayList3.add(hvrVarArrA2[i88]);
                                i28 = i88 + 1;
                            }
                            if (i25 == i26) {
                                break;
                                break;
                            }
                            i25 += i27;
                            iArr2 = iArr3;
                        }
                    }
                } else {
                    size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        i19 = i4;
                        while (true) {
                            i20 = size4 - 1;
                            hvr hvrVar7 = (hvr) list2.get(size4);
                            list4 = list2;
                            i19 -= hvrVar7.o;
                            hvrVar7.d(i19, 0, i13, iF);
                            arrayList3.add(hvrVar7);
                            if (i20 < 0) {
                                break;
                                break;
                            }
                            size4 = i20;
                            list2 = list4;
                        }
                    }
                    size5 = listI0.size();
                    i15 = i4;
                    i16 = 0;
                    list3 = listI0;
                    while (i16 < size5) {
                        ivr ivrVar6 = (ivr) list3.get(i16);
                        List list8 = list3;
                        hvrVarArrA = ivrVar6.a(i15, i13, iF);
                        int i89 = size5;
                        length2 = hvrVarArrA.length;
                        i18 = 0;
                        while (i18 < length2) {
                            int i810 = i18;
                            arrayList3.add(hvrVarArrA[i810]);
                            i18 = i810 + 1;
                        }
                        i15 += ivrVar6.g;
                        i16++;
                        size5 = i89;
                        list3 = list8;
                    }
                    size6 = arrayList2.size();
                    while (i17 < size6) {
                        hvr hvrVar8 = (hvr) arrayList2.get(i17);
                        hvrVar8.d(i15, 0, i13, iF);
                        arrayList3.add(hvrVar8);
                        i15 += hvrVar8.o;
                    }
                }
                lazyLayoutItemAnimator.d((int) f3, i13, iF, arrayList3, ourVar.b(), yurVar8, true, zQ0, length4, z6, i86, i52, v5bVar, t6lVar);
                if (zQ0) {
                    jB = lazyLayoutItemAnimator.b();
                    z4 = zQ0;
                    if (!jxo.b(jB, 0L)) {
                        i13 = oxa.g(Math.max(i13, (int) (jB >> 32)), jI);
                        iF2 = oxa.f(Math.max(iF, (int) (jB & 4294967295L)), jI);
                        if (iF2 != iF) {
                            size7 = arrayList3.size();
                            while (i23 < size7) {
                                f = f3;
                                hvr hvrVar9 = (hvr) arrayList3.get(i23);
                                hvrVar9.p = iF2;
                                hvrVar9.r = hvrVar9.f + iF2;
                            }
                            f = f3;
                        }
                        f = f3;
                        i21 = iF2;
                    }
                    int i811 = i13;
                    i22 = i7;
                    final List listC3 = wf9.c(this.h, i611, i22, arrayList3, ourVar.d(), i, i46, i811, i21, new Function1() { // from class: evr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int iIntValue3 = ((Integer) obj).intValue();
                            zur zurVar5 = zurVar4;
                            int iE3 = zurVar5.e.e(iIntValue3);
                            long jA = zurVar5.a(0, iE3);
                            yur yurVar9 = yurVar8;
                            return yurVar9.n0(iIntValue3, 0, iE3, yurVar9.d, jA);
                        }
                    });
                    if (i22 == iA - 1) {
                        z5 = z2;
                    } else {
                        z5 = z2;
                    }
                    final boolean z11 = z4;
                    Function1<? super y.a, Unit> function4 = new Function1() { // from class: fvr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            boolean z12;
                            y.a aVar = (y.a) obj;
                            aVar.a = true;
                            ArrayList arrayList6 = arrayList3;
                            int size12 = arrayList6.size();
                            int i812 = 0;
                            while (true) {
                                z12 = z11;
                                if (i812 >= size12) {
                                    break;
                                }
                                ((hvr) arrayList6.get(i812)).p(aVar, z12);
                                i812++;
                            }
                            List list9 = listC3;
                            int size13 = list9.size();
                            for (int i813 = 0; i813 < size13; i813++) {
                                ((hvr) list9.get(i813)).p(aVar, z12);
                            }
                            Unit unit4 = Unit.a;
                            aVar.a = false;
                            ytwVar2.getValue();
                            return Unit.a;
                        }
                    };
                    int iG4 = oxa.g(i811 + i30, j);
                    int iF6 = oxa.f(i21 + iY3, j);
                    o2g o2gVar4 = o2g.a;
                    o2gVar4.getClass();
                    gvrVar = new gvr(ivrVar, i86, z5, f, rce0Var.e1(iG4, iF6, o2gVar4, function4), f6, z, v5bVar, oxrVar, length4, function1, s6iVar, rxr.a(i611, i22, arrayList3, listC3), i45, i49, iA, i3z.a, i46, i44);
                } else {
                    z4 = zQ0;
                    f = f3;
                }
                f = f3;
                i21 = iF;
                int i812 = i13;
                i22 = i7;
                final List listC4 = wf9.c(this.h, i611, i22, arrayList3, ourVar.d(), i, i46, i812, i21, new Function1() { // from class: evr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iIntValue3 = ((Integer) obj).intValue();
                        zur zurVar5 = zurVar4;
                        int iE3 = zurVar5.e.e(iIntValue3);
                        long jA = zurVar5.a(0, iE3);
                        yur yurVar9 = yurVar8;
                        return yurVar9.n0(iIntValue3, 0, iE3, yurVar9.d, jA);
                    }
                });
                if (i22 == iA - 1) {
                    z5 = z2;
                } else {
                    z5 = z2;
                }
                final boolean z12 = z4;
                Function1<? super y.a, Unit> function5 = new Function1() { // from class: fvr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean z13;
                        y.a aVar = (y.a) obj;
                        aVar.a = true;
                        ArrayList arrayList6 = arrayList3;
                        int size12 = arrayList6.size();
                        int i813 = 0;
                        while (true) {
                            z13 = z12;
                            if (i813 >= size12) {
                                break;
                            }
                            ((hvr) arrayList6.get(i813)).p(aVar, z13);
                            i813++;
                        }
                        List list9 = listC4;
                        int size13 = list9.size();
                        for (int i814 = 0; i814 < size13; i814++) {
                            ((hvr) list9.get(i814)).p(aVar, z13);
                        }
                        Unit unit4 = Unit.a;
                        aVar.a = false;
                        ytwVar2.getValue();
                        return Unit.a;
                    }
                };
                int iG5 = oxa.g(i812 + i30, j);
                int iF7 = oxa.f(i21 + iY3, j);
                o2g o2gVar5 = o2g.a;
                o2gVar5.getClass();
                gvrVar = new gvr(ivrVar, i86, z5, f, rce0Var.e1(iG5, iF7, o2gVar5, function5), f6, z, v5bVar, oxrVar, length4, function1, s6iVar, rxr.a(i611, i22, arrayList3, listC4), i45, i49, iA, i3z.a, i46, i44);
            }
            zvr zvrVar3 = zvrVar;
            zvrVar3.f(gvrVar, rce0Var.q0(), false);
            pdd pddVar = zvrVar3.a;
            return gvrVar;
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }
}
