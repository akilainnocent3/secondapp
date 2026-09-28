package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.lazy.a;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/* JADX INFO: loaded from: classes.dex */
public final class izr implements nxr {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tmz c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0<azr> e;
    public final /* synthetic */ kw0.l f;
    public final /* synthetic */ kw0.e g;
    public final /* synthetic */ v5b h;
    public final /* synthetic */ t6l i;
    public final /* synthetic */ l0e0 j;
    public final /* synthetic */ ht.b k;
    public final /* synthetic */ ht.c l;

    public izr(zzr zzrVar, boolean z, tmz tmzVar, boolean z2, lhp lhpVar, kw0.l lVar, kw0.e eVar, v5b v5bVar, t6l t6lVar, l0e0.a.C0800a c0800a, ht.b bVar, ht.c cVar) {
        this.a = zzrVar;
        this.b = z;
        this.c = tmzVar;
        this.d = z2;
        this.e = lhpVar;
        this.f = lVar;
        this.g = eVar;
        this.h = v5bVar;
        this.i = t6lVar;
        this.j = c0800a;
        this.k = bVar;
        this.l = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x03db  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x040b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0439  */
    /* JADX WARN: Code duplicated, block: B:183:0x043d  */
    /* JADX WARN: Code duplicated, block: B:186:0x044f A[LOOP:4: B:182:0x043b->B:186:0x044f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0457  */
    /* JADX WARN: Code duplicated, block: B:190:0x0463 A[LOOP:5: B:190:0x0463->B:197:0x0482, LOOP_START, PHI: r3 r9
      0x0463: PHI (r3v87 java.util.List) = (r3v17 java.util.List), (r3v88 java.util.List) binds: [B:189:0x0461, B:197:0x0482] A[DONT_GENERATE, DONT_INLINE]
      0x0463: PHI (r9v44 int) = (r9v28 int), (r9v48 int) binds: [B:189:0x0461, B:197:0x0482] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:192:0x0471 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x0473  */
    /* JADX WARN: Code duplicated, block: B:197:0x0482 A[LOOP:5: B:190:0x0463->B:197:0x0482, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:199:0x0487  */
    /* JADX WARN: Code duplicated, block: B:202:0x0492 A[LOOP:6: B:201:0x0490->B:202:0x0492, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:205:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04dd A[LOOP:7: B:206:0x04c7->B:210:0x04dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:277:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:279:0x0604 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:280:0x0606  */
    /* JADX WARN: Code duplicated, block: B:282:0x061d  */
    /* JADX WARN: Code duplicated, block: B:289:0x063e  */
    /* JADX WARN: Code duplicated, block: B:291:0x064a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x064c  */
    /* JADX WARN: Code duplicated, block: B:296:0x065d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0668 A[LOOP:15: B:298:0x0666->B:299:0x0668, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0690  */
    /* JADX WARN: Code duplicated, block: B:309:0x0693  */
    /* JADX WARN: Code duplicated, block: B:310:0x0695  */
    /* JADX WARN: Code duplicated, block: B:313:0x069c  */
    /* JADX WARN: Code duplicated, block: B:316:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:317:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:321:0x06af  */
    /* JADX WARN: Code duplicated, block: B:328:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:333:0x06de  */
    /* JADX WARN: Code duplicated, block: B:336:0x06ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:337:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:338:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:342:0x0705  */
    /* JADX WARN: Code duplicated, block: B:344:0x0709  */
    /* JADX WARN: Code duplicated, block: B:345:0x0715  */
    /* JADX WARN: Code duplicated, block: B:347:0x071c  */
    /* JADX WARN: Code duplicated, block: B:349:0x0722  */
    /* JADX WARN: Code duplicated, block: B:353:0x0735  */
    /* JADX WARN: Code duplicated, block: B:361:0x0759  */
    /* JADX WARN: Code duplicated, block: B:362:0x075d  */
    /* JADX WARN: Code duplicated, block: B:365:0x076d  */
    /* JADX WARN: Code duplicated, block: B:366:0x0775  */
    /* JADX WARN: Code duplicated, block: B:369:0x077f A[LOOP:17: B:359:0x0755->B:369:0x077f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:371:0x078b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0794  */
    /* JADX WARN: Code duplicated, block: B:375:0x07a2 A[LOOP:19: B:374:0x07a0->B:375:0x07a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:378:0x07c0 A[LOOP:20: B:377:0x07be->B:378:0x07c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:381:0x07da A[LOOP:21: B:380:0x07d8->B:381:0x07da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:384:0x081a  */
    /* JADX WARN: Code duplicated, block: B:386:0x0828 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x082a  */
    /* JADX WARN: Code duplicated, block: B:389:0x082e  */
    /* JADX WARN: Code duplicated, block: B:392:0x084b  */
    /* JADX WARN: Code duplicated, block: B:393:0x084d  */
    /* JADX WARN: Code duplicated, block: B:395:0x0850  */
    /* JADX WARN: Code duplicated, block: B:397:0x0857 A[LOOP:18: B:396:0x0855->B:397:0x0857, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:400:0x086c  */
    /* JADX WARN: Code duplicated, block: B:404:0x0879  */
    /* JADX WARN: Code duplicated, block: B:405:0x087e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0888  */
    /* JADX WARN: Code duplicated, block: B:409:0x088d  */
    /* JADX WARN: Code duplicated, block: B:412:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:414:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:415:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:416:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:418:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:420:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:422:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:423:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:425:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:427:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:433:0x0912  */
    /* JADX WARN: Code duplicated, block: B:434:0x0917  */
    /* JADX WARN: Code duplicated, block: B:436:0x091a  */
    /* JADX WARN: Code duplicated, block: B:437:0x091f  */
    /* JADX WARN: Code duplicated, block: B:440:0x0926  */
    /* JADX WARN: Code duplicated, block: B:442:0x092b  */
    /* JADX WARN: Code duplicated, block: B:467:0x045b A[EDGE_INSN: B:467:0x045b->B:188:0x045b BREAK  A[LOOP:4: B:182:0x043b->B:186:0x044f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x0485 A[EDGE_INSN: B:468:0x0485->B:198:0x0485 BREAK  A[LOOP:5: B:190:0x0463->B:197:0x0482], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x04ec A[EDGE_INSN: B:470:0x04ec->B:212:0x04ec BREAK  A[LOOP:7: B:206:0x04c7->B:210:0x04dd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0658 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0786 A[EDGE_INSN: B:494:0x0786->B:370:0x0786 BREAK  A[LOOP:17: B:359:0x0755->B:369:0x077f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x042b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.nxr
    public final biv a(oxr oxrVar, long j) {
        int i;
        float fA;
        zzr zzrVar;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        ozr ozrVar;
        int b;
        ozr ozrVar2;
        int i7;
        int i8;
        boolean z;
        ozr ozrVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax;
        int i13;
        int i14;
        List arrayList;
        int size;
        int size2;
        int iMax2;
        int i15;
        int iMin;
        int i16;
        float f3;
        int i17;
        ArrayList arrayList2;
        List arrayList3;
        int size3;
        int i18;
        int size4;
        int iMax3;
        int i19;
        boolean z2;
        int i20;
        int iG;
        int iF;
        int i21;
        boolean z3;
        final ArrayList arrayList4;
        long j2;
        int size5;
        int i22;
        int i23;
        int b2;
        int i24;
        int i25;
        int size6;
        int i26;
        int i27;
        boolean z4;
        int i28;
        ozr ozrVar4;
        int i29;
        ozr ozrVar5;
        int i30;
        boolean z5;
        ozr ozrVar6;
        Integer numValueOf;
        ozr ozrVar7;
        int iIntValue;
        int iIntValue2;
        i3z i3zVar;
        nzr nzrVar;
        rce0 rce0Var;
        ozr ozrVar8;
        ozr ozrVar9;
        long jB;
        int i31;
        int iG2;
        int i32;
        int size7;
        int i33;
        int b3;
        int[] iArr;
        int i34;
        int[] iArr2;
        c cVarY;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        ozr ozrVar10;
        int i40;
        int iIntValue3;
        ozr ozrVar11;
        float f4;
        ozr ozrVar12;
        Object obj;
        ozr ozrVar13;
        int i41;
        Object obj2;
        int index;
        int iMin2;
        ozr ozrVar14;
        Object obj3;
        ArrayList arrayList5;
        int i42;
        int iIntValue4;
        List arrayList6;
        rce0 rce0Var2 = oxrVar.b;
        zzr zzrVar2 = this.a;
        zzrVar2.s.getValue();
        boolean z6 = zzrVar2.b || rce0Var2.q0();
        boolean z7 = this.b;
        dj7.a(j, z7 ? i3z.a : i3z.b);
        tmz tmzVar = this.c;
        int iY0 = z7 ? rce0Var2.y0(tmzVar.b(rce0Var2.getLayoutDirection())) : rce0Var2.y0(h.d(tmzVar, rce0Var2.getLayoutDirection()));
        int iY1 = z7 ? rce0Var2.y0(tmzVar.c(rce0Var2.getLayoutDirection())) : rce0Var2.y0(h.c(tmzVar, rce0Var2.getLayoutDirection()));
        int iY2 = rce0Var2.y0(tmzVar.d());
        int iY3 = rce0Var2.y0(tmzVar.a());
        int i43 = iY2 + iY3;
        int i44 = iY0 + iY1;
        int i45 = z7 ? i43 : i44;
        boolean z8 = this.d;
        if (z7 && !z8) {
            i = iY2;
        } else if (z7 && z8) {
            i = iY3;
        } else {
            i = (z7 || z8) ? iY1 : iY0;
        }
        int i46 = i45 - i;
        long jI = oxa.i(-i44, j, -i43);
        azr azrVarInvoke = this.e.invoke();
        a aVarF = azrVarInvoke.f();
        int i47 = kxa.i(jI);
        int iH = kxa.h(jI);
        ((u5a0) aVarF.a).k(i47);
        ((u5a0) aVarF.b).k(iH);
        kw0.e eVar = this.g;
        kw0.l lVar = this.f;
        Integer numValueOf2 = null;
        if (z7) {
            if (lVar == null) {
                zkn.b("null verticalArrangement when isVertical == true");
                fkd.a();
                return null;
            }
            fA = lVar.a();
        } else {
            if (eVar == null) {
                zkn.b("null horizontalAlignment when isVertical == false");
                fkd.a();
                return null;
            }
            fA = eVar.a();
        }
        int iY4 = rce0Var2.y0(fA);
        int iA = azrVarInvoke.a();
        int iH2 = z7 ? kxa.h(j) - i43 : kxa.i(j) - i44;
        boolean z9 = this.d;
        if (z9 && iH2 <= 0) {
            if (!z7) {
                iY0 += iH2;
            }
            if (z7) {
                iY2 += iH2;
            }
        }
        long j3 = (((long) iY0) << 32) | (((long) iY2) & 4294967295L);
        int i48 = i;
        hzr hzrVar = new hzr(jI, this.b, azrVarInvoke, oxrVar, iA, iY4, this.k, this.l, z9, i48, i46, j3, this.a);
        c5a0.e.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            int iH3 = zzrVar2.h();
            tzr tzrVar = zzrVar2.e;
            int iA2 = gxr.a(iH3, azrVarInvoke, tzrVar.d);
            if (iH3 != iA2) {
                ((u5a0) tzrVar.a).k(iA2);
                tzrVar.e.b(iH3);
            }
            int i49 = zzrVar2.i();
            Unit unit = Unit.a;
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            List<Integer> listA = nwr.a(azrVarInvoke, zzrVar2.r, zzrVar2.o);
            float fFloatValue = (rce0Var2.q0() || !z6) ? zzrVar2.h : ((Number) ((x5a0) zzrVar2.w.b.b).getValue()).floatValue();
            LazyLayoutItemAnimator<ozr> lazyLayoutItemAnimator = zzrVar2.n;
            final boolean zQ0 = rce0Var2.q0();
            nzr nzrVar2 = zzrVar2.c;
            final ytw<Unit> ytwVar = zzrVar2.v;
            if (i48 < 0) {
                zkn.a("invalid beforeContentPadding");
            }
            if (i46 < 0) {
                zkn.a("invalid afterContentPadding");
            }
            azr azrVar = hzrVar.b;
            boolean z10 = this.b;
            boolean z11 = this.d;
            v5b v5bVar = this.h;
            t6l t6lVar = this.i;
            int i50 = i49;
            if (iA <= 0) {
                int iK = kxa.k(jI);
                int iJ = kxa.j(jI);
                lazyLayoutItemAnimator.d(0, iK, iJ, new ArrayList(), azrVar.b(), hzrVar, z10, zQ0, 1, z6, 0, 0, v5bVar, t6lVar);
                if (!zQ0) {
                    long jB2 = lazyLayoutItemAnimator.b();
                    if (!jxo.b(jB2, 0L)) {
                        iK = oxa.g((int) (jB2 >> 32), jI);
                        iJ = oxa.f((int) (jB2 & 4294967295L), jI);
                    }
                }
                lzr lzrVar = new lzr();
                int iG3 = oxa.g(iK + i44, j);
                int iF2 = oxa.f(iJ + i43, j);
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                zzrVar = zzrVar2;
                nzrVar = new nzr(null, 0, false, 0.0f, rce0Var2.e1(iG3, iF2, o2gVar, lzrVar), 0.0f, false, v5bVar, oxrVar, hzrVar.d, m2g.a, -i48, iH2 + i46, 0, z11, z10 ? i3z.a : i3z.b, i46, iY4);
                rce0Var = rce0Var2;
            } else {
                zzrVar = zzrVar2;
                t6l t6lVar2 = t6lVar;
                if (iA2 >= iA) {
                    iA2 = iA - 1;
                    i50 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i51 = i50 - iRound;
                if (iA2 == 0 && i51 < 0) {
                    iRound += i51;
                    i51 = 0;
                }
                gx0 gx0Var = new gx0();
                int i52 = -i48;
                float f5 = fFloatValue;
                int i53 = i52 + (iY4 < 0 ? iY4 : 0);
                int i54 = i51 + i53;
                int i55 = iA2;
                int iMax4 = 0;
                while (i54 < 0 && i55 > 0) {
                    t6l t6lVar3 = t6lVar2;
                    int i56 = i55 - 1;
                    int i57 = iRound;
                    ozr ozrVarO0 = pzr.o0(hzrVar, i56);
                    i55 = i56;
                    gx0Var.add(0, ozrVarO0);
                    iMax4 = Math.max(iMax4, ozrVarO0.s);
                    i54 += ozrVarO0.r;
                    t6lVar2 = t6lVar3;
                    iRound = i57;
                }
                t6l t6lVar4 = t6lVar2;
                int i58 = iRound;
                if (i54 < i53) {
                    i2 = i58 - (i53 - i54);
                    i54 = i53;
                } else {
                    i2 = i58;
                }
                int i59 = i54 - i53;
                int i60 = iH2 + i46;
                int i61 = i60 < 0 ? 0 : i60;
                int i62 = iMax4;
                int i63 = -i59;
                int i64 = i59;
                int i65 = i55;
                int i66 = 0;
                boolean z12 = false;
                while (i66 < gx0Var.c) {
                    if (i63 >= i61) {
                        gx0Var.c(i66);
                        Unit unit2 = Unit.a;
                        z12 = true;
                    } else {
                        i65++;
                        i63 += ((ozr) gx0Var.get(i66)).r;
                        i66++;
                    }
                }
                int iMax5 = i62;
                int i67 = i65;
                while (i67 < iA && (i63 < i61 || i63 <= 0 || gx0Var.isEmpty())) {
                    int i68 = i61;
                    ozr ozrVarO1 = pzr.o0(hzrVar, i67);
                    int i69 = ozrVarO1.r;
                    i63 += i69;
                    if (i63 > i53 || i67 == iA - 1) {
                        int iMax6 = Math.max(iMax5, ozrVarO1.s);
                        gx0Var.addLast(ozrVarO1);
                        iMax5 = iMax6;
                    } else {
                        i64 -= i69;
                        Unit unit3 = Unit.a;
                        i55 = i67 + 1;
                        z12 = true;
                    }
                    i67++;
                    i61 = i68;
                }
                if (i63 < iH2) {
                    int i70 = iH2 - i63;
                    i63 += i70;
                    int i71 = i64 - i70;
                    while (i71 < i48 && i55 > 0) {
                        int i72 = i55 - 1;
                        int i73 = i70;
                        ozr ozrVarO2 = pzr.o0(hzrVar, i72);
                        gx0Var.add(0, ozrVarO2);
                        iMax5 = Math.max(iMax5, ozrVarO2.s);
                        i71 += ozrVarO2.r;
                        i55 = i72;
                        i70 = i73;
                    }
                    i64 = i71;
                    i3 = i2 + i70;
                    if (i64 < 0) {
                        i3 += i64;
                        i63 += i64;
                        i4 = i55;
                        i5 = 0;
                    }
                    int i74 = iMax5;
                    if (Integer.signum(Math.round(f5)) == Integer.signum(i3) || Math.abs(Math.round(f5)) < Math.abs(i3)) {
                        f = f5;
                    } else {
                        f = i3;
                    }
                    float f6 = f5 - f;
                    if (zQ0 || i3 <= i2 || f6 > 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = (i3 - i2) + f6;
                    }
                    if (i5 < 0) {
                        zkn.a("negative currentFirstItemScrollOffset");
                    }
                    i6 = -i5;
                    ozrVar = (ozr) gx0Var.first();
                    if (i48 <= 0 || iY4 < 0) {
                        b = gx0Var.getB();
                        ozrVar2 = ozrVar;
                        i7 = 0;
                        while (true) {
                            if (i7 < b) {
                                i8 = i6;
                                i11 = ((ozr) gx0Var.get(i7)).r;
                                if (i5 == 0 && i11 <= i5) {
                                    i12 = b;
                                    z = true;
                                    if (i7 == gx0Var.getB() - 1) {
                                        break;
                                    }
                                    i5 -= i11;
                                    i7++;
                                    ozrVar2 = (ozr) gx0Var.get(i7);
                                    i6 = i8;
                                    b = i12;
                                }
                            } else {
                                i8 = i6;
                            }
                            z = true;
                            break;
                        }
                        ozrVar3 = ozrVar2;
                        i9 = i5;
                        i10 = 0;
                    } else {
                        i8 = i6;
                        ozrVar3 = ozrVar;
                        z = true;
                        i10 = 0;
                        i9 = i5;
                    }
                    iMax = Math.max(i10, i4);
                    i13 = i4 - 1;
                    if (iMax <= i13) {
                        arrayList6 = null;
                        while (true) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList = arrayList6;
                            i14 = i9;
                            arrayList.add(pzr.o0(hzrVar, i13));
                            if (i13 != iMax) {
                                break;
                            }
                            i13--;
                            i9 = i14;
                            arrayList6 = arrayList;
                        }
                    } else {
                        i14 = i9;
                        arrayList = null;
                    }
                    size = listA.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            i42 = size - 1;
                            iIntValue4 = listA.get(size).intValue();
                            if (iIntValue4 < iMax) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(pzr.o0(hzrVar, iIntValue4));
                            }
                            if (i42 < 0) {
                                break;
                            }
                            size = i42;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = m2g.a;
                    }
                    iMax2 = i74;
                    i15 = 0;
                    for (size2 = arrayList.size(); i15 < size2; size2 = size2) {
                        iMax2 = Math.max(iMax2, ((ozr) arrayList.get(i15)).s);
                        i15++;
                    }
                    int i75 = iA - 1;
                    iMin = Math.min(((ozr) CollectionsKt.b0(gx0Var)).a, i75);
                    int i76 = iMax2;
                    i16 = ((ozr) CollectionsKt.b0(gx0Var)).a + 1;
                    if (i16 <= iMin) {
                        arrayList5 = null;
                        while (true) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            i17 = i67;
                            arrayList2 = arrayList5;
                            f3 = f;
                            arrayList2.add(pzr.o0(hzrVar, i16));
                            if (i16 != iMin) {
                                break;
                            }
                            i16++;
                            f = f3;
                            arrayList5 = arrayList2;
                            i67 = i17;
                        }
                    } else {
                        f3 = f;
                        i17 = i67;
                        arrayList2 = null;
                    }
                    if (zQ0 || nzrVar2 == null) {
                        arrayList = arrayList;
                        arrayList3 = arrayList2;
                    } else {
                        List<ozr> list = nzrVar2.k;
                        if (list.isEmpty()) {
                            arrayList = arrayList;
                            arrayList3 = arrayList2;
                        } else {
                            int size8 = list.size() - 1;
                            ArrayList arrayList7 = arrayList2;
                            while (true) {
                                if (-1 >= size8) {
                                    ozrVar11 = null;
                                    break;
                                }
                                if (list.get(size8).getIndex() > iMin && (size8 == 0 || list.get(size8 - 1).getIndex() <= iMin)) {
                                    ozrVar11 = list.get(size8);
                                    break;
                                }
                                size8--;
                            }
                            zyr zyrVar = (zyr) CollectionsKt.b0(list);
                            if (ozrVar11 != null && (index = ozrVar11.getIndex()) <= (iMin2 = Math.min(zyrVar.getIndex(), i75))) {
                                arrayList3 = arrayList7;
                                while (true) {
                                    if (arrayList3 != null) {
                                        int size9 = arrayList3.size();
                                        int i77 = 0;
                                        while (true) {
                                            if (i77 >= size9) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = arrayList3.get(i77);
                                            int i78 = i77;
                                            if (((ozr) obj3).a == index) {
                                                break;
                                            }
                                            i77 = i78 + 1;
                                        }
                                        ozrVar14 = (ozr) obj3;
                                    } else {
                                        ozrVar14 = null;
                                    }
                                    if (ozrVar14 == null) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(pzr.o0(hzrVar, index));
                                    }
                                    if (index == iMin2) {
                                        break;
                                    }
                                    index++;
                                    zyrVar = zyrVar;
                                    arrayList = arrayList;
                                }
                            } else {
                                arrayList = arrayList;
                                zyrVar = zyrVar;
                                arrayList3 = arrayList7;
                            }
                            float offset = ((nzrVar2.m - zyrVar.getOffset()) - zyrVar.a()) - f3;
                            if (offset > 0.0f) {
                                int index2 = zyrVar.getIndex() + 1;
                                int i79 = 0;
                                while (index2 < iA && i79 < offset) {
                                    if (index2 <= iMin) {
                                        int b4 = gx0Var.getB();
                                        int i80 = 0;
                                        while (true) {
                                            if (i80 >= b4) {
                                                f4 = offset;
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = gx0Var.get(i80);
                                            f4 = offset;
                                            if (((ozr) obj2).a == index2) {
                                                break;
                                            }
                                            i80++;
                                            offset = f4;
                                        }
                                        ozrVar13 = (ozr) obj2;
                                    } else {
                                        f4 = offset;
                                        if (arrayList3 != null) {
                                            int size10 = arrayList3.size();
                                            int i81 = 0;
                                            while (true) {
                                                if (i81 >= size10) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = arrayList3.get(i81);
                                                int i82 = size10;
                                                if (((ozr) obj).a == index2) {
                                                    break;
                                                }
                                                i81++;
                                                size10 = i82;
                                            }
                                            ozrVar13 = (ozr) obj;
                                        } else {
                                            ozrVar12 = null;
                                        }
                                        if (ozrVar12 != null) {
                                            index2++;
                                            i41 = ozrVar12.r;
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(pzr.o0(hzrVar, index2));
                                            index2++;
                                            i41 = ((ozr) CollectionsKt.b0(arrayList3)).r;
                                        }
                                        i79 += i41;
                                        offset = f4;
                                    }
                                    ozrVar12 = ozrVar13;
                                    if (ozrVar12 != null) {
                                        index2++;
                                        i41 = ozrVar12.r;
                                    } else {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(pzr.o0(hzrVar, index2));
                                        index2++;
                                        i41 = ((ozr) CollectionsKt.b0(arrayList3)).r;
                                    }
                                    i79 += i41;
                                    offset = f4;
                                }
                            }
                        }
                    }
                    if (arrayList3 != null && ((ozr) CollectionsKt.b0(arrayList3)).a > iMin) {
                        iMin = ((ozr) CollectionsKt.b0(arrayList3)).a;
                    }
                    size3 = listA.size();
                    for (i18 = 0; i18 < size3; i18++) {
                        iIntValue3 = listA.get(i18).intValue();
                        if (iIntValue3 <= iMin) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(pzr.o0(hzrVar, iIntValue3));
                        }
                    }
                    if (arrayList3 == null) {
                        arrayList3 = m2g.a;
                    }
                    size4 = arrayList3.size();
                    iMax3 = i76;
                    for (i19 = 0; i19 < size4; i19++) {
                        iMax3 = Math.max(iMax3, ((ozr) arrayList3.get(i19)).s);
                    }
                    if (!Intrinsics.g(ozrVar3, gx0Var.first()) && arrayList.isEmpty() && arrayList3.isEmpty()) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (z10) {
                        i20 = iMax3;
                    } else {
                        i20 = i63;
                    }
                    iG = oxa.g(i20, jI);
                    if (z10) {
                        iMax3 = i63;
                    }
                    iF = oxa.f(iMax3, jI);
                    if (z10) {
                        i21 = iF;
                    } else {
                        i21 = iG;
                    }
                    if (i63 < Math.min(i21, iH2)) {
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                    if (z3 && i8 != 0) {
                        zkn.c("non-zero itemsScrollOffset");
                    }
                    ozr ozrVar15 = ozrVar3;
                    arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + gx0Var.getB());
                    if (z3) {
                        if (arrayList.isEmpty() || !arrayList3.isEmpty()) {
                            zkn.a("no extra items");
                        }
                        b3 = gx0Var.getB();
                        iArr = new int[b3];
                        for (i34 = 0; i34 < b3; i34++) {
                            if (z11) {
                                i40 = (b3 - i34) - 1;
                            } else {
                                i40 = i34;
                            }
                            iArr[i34] = ((ozr) gx0Var.get(i40)).q;
                        }
                        iArr2 = new int[b3];
                        if (z10) {
                            if (lVar != null) {
                                zkn.b("null verticalArrangement when isVertical == true");
                                fkd.a();
                                return null;
                            }
                            lVar.c(oxrVar, i21, iArr, iArr2);
                            j2 = jI;
                        } else {
                            if (eVar != null) {
                                zkn.b("null horizontalArrangement when isVertical == false");
                                fkd.a();
                                return null;
                            }
                            j2 = jI;
                            eVar.b(oxrVar, i21, iArr, asr.a, iArr2);
                        }
                        cVarY = ay0.y(iArr2);
                        if (z11) {
                            c.a aVar = c.d;
                            int i83 = cVarY.b;
                            int i84 = cVarY.a;
                            int i85 = -cVarY.c;
                            aVar.getClass();
                            cVarY = new c(i83, i84, i85);
                        }
                        i35 = cVarY.a;
                        i36 = cVarY.b;
                        i37 = cVarY.c;
                        if ((i37 > 0 && i35 <= i36) || (i37 < 0 && i36 <= i35)) {
                            while (true) {
                                i38 = iArr2[i35];
                                if (z11) {
                                    i39 = (b3 - i35) - 1;
                                } else {
                                    i39 = i35;
                                }
                                ozrVar10 = (ozr) gx0Var.get(i39);
                                if (z11) {
                                    i38 = (i21 - i38) - ozrVar10.q;
                                }
                                ozrVar10.o(i38, iG, iF);
                                arrayList4.add(ozrVar10);
                                if (i35 == i36) {
                                    break;
                                }
                                i35 += i37;
                                i21 = i21;
                                i37 = i37;
                            }
                        }
                    } else {
                        j2 = jI;
                        size5 = arrayList.size();
                        i23 = i8;
                        for (i22 = 0; i22 < size5; i22++) {
                            ozr ozrVar16 = (ozr) arrayList.get(i22);
                            i23 -= ozrVar16.r;
                            ozrVar16.o(i23, iG, iF);
                            arrayList4.add(ozrVar16);
                        }
                        b2 = gx0Var.getB();
                        i25 = i8;
                        for (i24 = 0; i24 < b2; i24++) {
                            ozr ozrVar17 = (ozr) gx0Var.get(i24);
                            ozrVar17.o(i25, iG, iF);
                            arrayList4.add(ozrVar17);
                            i25 += ozrVar17.r;
                        }
                        size6 = arrayList3.size();
                        for (i26 = 0; i26 < size6; i26++) {
                            ozr ozrVar18 = (ozr) arrayList3.get(i26);
                            ozrVar18.o(i25, iG, iF);
                            arrayList4.add(ozrVar18);
                            i25 += ozrVar18.r;
                        }
                    }
                    float f7 = f3;
                    int i86 = i63;
                    i27 = i17;
                    lazyLayoutItemAnimator.d((int) f7, iG, iF, arrayList4, azrVar.b(), hzrVar, z10, zQ0, 1, z6, i14, i86, v5bVar, t6lVar4);
                    if (zQ0) {
                        z4 = z2;
                    } else {
                        jB = lazyLayoutItemAnimator.b();
                        z4 = z2;
                        if (!jxo.b(jB, 0L)) {
                            if (z10) {
                                i31 = iF;
                            } else {
                                i31 = iG;
                            }
                            long j4 = j2;
                            iG2 = oxa.g(Math.max(iG, (int) (jB >> 32)), j4);
                            iF = oxa.f(Math.max(iF, (int) (jB & 4294967295L)), j4);
                            if (z10) {
                                i32 = iF;
                            } else {
                                i32 = iG2;
                            }
                            if (i32 != i31) {
                                size7 = arrayList4.size();
                                for (i33 = 0; i33 < size7; i33++) {
                                    ozr ozrVar19 = (ozr) arrayList4.get(i33);
                                    ozrVar19.u = i32;
                                    ozrVar19.w = ozrVar19.i + i32;
                                }
                            }
                            i28 = iG2;
                        }
                        int i87 = iF;
                        ozrVar4 = (ozr) gx0Var.f();
                        if (ozrVar4 != null) {
                            i29 = ozrVar4.a;
                        } else {
                            i29 = 0;
                        }
                        ozrVar5 = (ozr) gx0Var.i();
                        if (ozrVar5 != null) {
                            i30 = ozrVar5.a;
                        } else {
                            i30 = 0;
                        }
                        z5 = true;
                        final List listC = wf9.c(this.j, i29, i30, arrayList4, azrVar.d(), i48, i46, i28, i87, new p8d(hzrVar, 1));
                        if (z4) {
                            ozrVar9 = (ozr) CollectionsKt.firstOrNull(arrayList4);
                            if (ozrVar9 != null) {
                                numValueOf = Integer.valueOf(ozrVar9.a);
                            } else {
                                numValueOf = null;
                            }
                        } else {
                            ozrVar6 = (ozr) gx0Var.f();
                            if (ozrVar6 != null) {
                                numValueOf = Integer.valueOf(ozrVar6.a);
                            } else {
                                numValueOf = null;
                            }
                        }
                        if (z4) {
                            ozrVar8 = (ozr) CollectionsKt.d0(arrayList4);
                            if (ozrVar8 != null) {
                                numValueOf2 = Integer.valueOf(ozrVar8.a);
                            }
                        } else {
                            ozrVar7 = (ozr) gx0Var.i();
                            if (ozrVar7 != null) {
                                numValueOf2 = Integer.valueOf(ozrVar7.a);
                            }
                        }
                        if (i27 >= iA && i86 <= iH2) {
                            z5 = false;
                        }
                        Function1<? super y.a, Unit> function1 = new Function1() { // from class: mzr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                boolean z13;
                                y.a aVar2 = (y.a) obj4;
                                aVar2.a = true;
                                ArrayList arrayList8 = arrayList4;
                                int size11 = arrayList8.size();
                                int i88 = 0;
                                while (true) {
                                    z13 = zQ0;
                                    if (i88 >= size11) {
                                        break;
                                    }
                                    ((ozr) arrayList8.get(i88)).i(aVar2, z13);
                                    i88++;
                                }
                                List list2 = listC;
                                int size12 = list2.size();
                                for (int i89 = 0; i89 < size12; i89++) {
                                    ((ozr) list2.get(i89)).i(aVar2, z13);
                                }
                                Unit unit4 = Unit.a;
                                aVar2.a = false;
                                ytwVar.getValue();
                                return Unit.a;
                            }
                        };
                        int iG4 = oxa.g(i28 + i44, j);
                        int iF3 = oxa.f(i87 + i43, j);
                        o2g o2gVar2 = o2g.a;
                        o2gVar2.getClass();
                        biv bivVarE1 = rce0Var2.e1(iG4, iF3, o2gVar2, function1);
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (numValueOf2 != null) {
                            iIntValue2 = numValueOf2.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        List listA2 = rxr.a(iIntValue, iIntValue2, arrayList4, listC);
                        if (z10) {
                            i3zVar = i3z.a;
                        } else {
                            i3zVar = i3z.b;
                        }
                        rce0Var = rce0Var2;
                        nzrVar = new nzr(ozrVar15, i14, z5, f7, bivVarE1, f2, z12, v5bVar, oxrVar, hzrVar.d, listA2, i52, i60, iA, z11, i3zVar, i46, iY4);
                    }
                    i28 = iG;
                    int i88 = iF;
                    ozrVar4 = (ozr) gx0Var.f();
                    if (ozrVar4 != null) {
                        i29 = ozrVar4.a;
                    } else {
                        i29 = 0;
                    }
                    ozrVar5 = (ozr) gx0Var.i();
                    if (ozrVar5 != null) {
                        i30 = ozrVar5.a;
                    } else {
                        i30 = 0;
                    }
                    z5 = true;
                    final List listC2 = wf9.c(this.j, i29, i30, arrayList4, azrVar.d(), i48, i46, i28, i88, new p8d(hzrVar, 1));
                    if (z4) {
                        ozrVar9 = (ozr) CollectionsKt.firstOrNull(arrayList4);
                        if (ozrVar9 != null) {
                            numValueOf = Integer.valueOf(ozrVar9.a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        ozrVar6 = (ozr) gx0Var.f();
                        if (ozrVar6 != null) {
                            numValueOf = Integer.valueOf(ozrVar6.a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z4) {
                        ozrVar8 = (ozr) CollectionsKt.d0(arrayList4);
                        if (ozrVar8 != null) {
                            numValueOf2 = Integer.valueOf(ozrVar8.a);
                        }
                    } else {
                        ozrVar7 = (ozr) gx0Var.i();
                        if (ozrVar7 != null) {
                            numValueOf2 = Integer.valueOf(ozrVar7.a);
                        }
                    }
                    if (i27 >= iA) {
                        z5 = false;
                    }
                    Function1<? super y.a, Unit> function2 = new Function1() { // from class: mzr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            boolean z13;
                            y.a aVar2 = (y.a) obj4;
                            aVar2.a = true;
                            ArrayList arrayList8 = arrayList4;
                            int size11 = arrayList8.size();
                            int i89 = 0;
                            while (true) {
                                z13 = zQ0;
                                if (i89 >= size11) {
                                    break;
                                }
                                ((ozr) arrayList8.get(i89)).i(aVar2, z13);
                                i89++;
                            }
                            List list2 = listC2;
                            int size12 = list2.size();
                            for (int i810 = 0; i810 < size12; i810++) {
                                ((ozr) list2.get(i810)).i(aVar2, z13);
                            }
                            Unit unit4 = Unit.a;
                            aVar2.a = false;
                            ytwVar.getValue();
                            return Unit.a;
                        }
                    };
                    int iG5 = oxa.g(i28 + i44, j);
                    int iF4 = oxa.f(i88 + i43, j);
                    o2g o2gVar3 = o2g.a;
                    o2gVar3.getClass();
                    biv bivVarE2 = rce0Var2.e1(iG5, iF4, o2gVar3, function2);
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    List listA3 = rxr.a(iIntValue, iIntValue2, arrayList4, listC2);
                    if (z10) {
                        i3zVar = i3z.a;
                    } else {
                        i3zVar = i3z.b;
                    }
                    rce0Var = rce0Var2;
                    nzrVar = new nzr(ozrVar15, i14, z5, f7, bivVarE2, f2, z12, v5bVar, oxrVar, hzrVar.d, listA3, i52, i60, iA, z11, i3zVar, i46, iY4);
                } else {
                    i3 = i2;
                }
                i4 = i55;
                i5 = i64;
                int i710 = iMax5;
                if (Integer.signum(Math.round(f5)) == Integer.signum(i3)) {
                    f = f5;
                } else {
                    f = f5;
                }
                float f8 = f5 - f;
                if (zQ0) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                }
                if (i5 < 0) {
                    zkn.a("negative currentFirstItemScrollOffset");
                }
                i6 = -i5;
                ozrVar = (ozr) gx0Var.first();
                if (i48 <= 0) {
                    b = gx0Var.getB();
                    ozrVar2 = ozrVar;
                    i7 = 0;
                    while (true) {
                        if (i7 < b) {
                            i8 = i6;
                            i11 = ((ozr) gx0Var.get(i7)).r;
                            if (i5 == 0) {
                            }
                        } else {
                            i8 = i6;
                        }
                        z = true;
                        i5 -= i11;
                        i7++;
                        ozrVar2 = (ozr) gx0Var.get(i7);
                        i6 = i8;
                        b = i12;
                    }
                    ozrVar3 = ozrVar2;
                    i9 = i5;
                    i10 = 0;
                } else {
                    b = gx0Var.getB();
                    ozrVar2 = ozrVar;
                    i7 = 0;
                    while (true) {
                        if (i7 < b) {
                            i8 = i6;
                            i11 = ((ozr) gx0Var.get(i7)).r;
                            if (i5 == 0) {
                            }
                        } else {
                            i8 = i6;
                        }
                        z = true;
                        i5 -= i11;
                        i7++;
                        ozrVar2 = (ozr) gx0Var.get(i7);
                        i6 = i8;
                        b = i12;
                    }
                    ozrVar3 = ozrVar2;
                    i9 = i5;
                    i10 = 0;
                }
                iMax = Math.max(i10, i4);
                i13 = i4 - 1;
                if (iMax <= i13) {
                    arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList = arrayList6;
                        i14 = i9;
                        arrayList.add(pzr.o0(hzrVar, i13));
                        if (i13 != iMax) {
                            break;
                            break;
                        }
                        i13--;
                        i9 = i14;
                        arrayList6 = arrayList;
                    }
                } else {
                    i14 = i9;
                    arrayList = null;
                }
                size = listA.size() - 1;
                if (size >= 0) {
                    while (true) {
                        i42 = size - 1;
                        iIntValue4 = listA.get(size).intValue();
                        if (iIntValue4 < iMax) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(pzr.o0(hzrVar, iIntValue4));
                        }
                        if (i42 < 0) {
                            break;
                            break;
                        }
                        size = i42;
                    }
                }
                if (arrayList == null) {
                    arrayList = m2g.a;
                }
                iMax2 = i710;
                i15 = 0;
                while (i15 < size2) {
                    iMax2 = Math.max(iMax2, ((ozr) arrayList.get(i15)).s);
                    i15++;
                }
                int i711 = iA - 1;
                iMin = Math.min(((ozr) CollectionsKt.b0(gx0Var)).a, i711);
                int i712 = iMax2;
                i16 = ((ozr) CollectionsKt.b0(gx0Var)).a + 1;
                if (i16 <= iMin) {
                    arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i17 = i67;
                        arrayList2 = arrayList5;
                        f3 = f;
                        arrayList2.add(pzr.o0(hzrVar, i16));
                        if (i16 != iMin) {
                            break;
                            break;
                        }
                        i16++;
                        f = f3;
                        arrayList5 = arrayList2;
                        i67 = i17;
                    }
                } else {
                    f3 = f;
                    i17 = i67;
                    arrayList2 = null;
                }
                if (zQ0) {
                    arrayList = arrayList;
                    arrayList3 = arrayList2;
                } else {
                    arrayList = arrayList;
                    arrayList3 = arrayList2;
                }
                if (arrayList3 != null) {
                    iMin = ((ozr) CollectionsKt.b0(arrayList3)).a;
                }
                size3 = listA.size();
                while (i18 < size3) {
                    iIntValue3 = listA.get(i18).intValue();
                    if (iIntValue3 <= iMin) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(pzr.o0(hzrVar, iIntValue3));
                    }
                }
                if (arrayList3 == null) {
                    arrayList3 = m2g.a;
                }
                size4 = arrayList3.size();
                iMax3 = i712;
                while (i19 < size4) {
                    iMax3 = Math.max(iMax3, ((ozr) arrayList3.get(i19)).s);
                }
                if (!Intrinsics.g(ozrVar3, gx0Var.first())) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z10) {
                    i20 = iMax3;
                } else {
                    i20 = i63;
                }
                iG = oxa.g(i20, jI);
                if (z10) {
                    iMax3 = i63;
                }
                iF = oxa.f(iMax3, jI);
                if (z10) {
                    i21 = iF;
                } else {
                    i21 = iG;
                }
                if (i63 < Math.min(i21, iH2)) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    zkn.c("non-zero itemsScrollOffset");
                }
                ozr ozrVar110 = ozrVar3;
                arrayList4 = new ArrayList(arrayList3.size() + arrayList.size() + gx0Var.getB());
                if (z3) {
                    if (arrayList.isEmpty()) {
                        zkn.a("no extra items");
                    } else {
                        zkn.a("no extra items");
                    }
                    b3 = gx0Var.getB();
                    iArr = new int[b3];
                    while (i34 < b3) {
                        if (z11) {
                            i40 = i34;
                        } else {
                            i40 = (b3 - i34) - 1;
                        }
                        iArr[i34] = ((ozr) gx0Var.get(i40)).q;
                    }
                    iArr2 = new int[b3];
                    if (z10) {
                        if (lVar != null) {
                            zkn.b("null verticalArrangement when isVertical == true");
                            fkd.a();
                            return null;
                        }
                        lVar.c(oxrVar, i21, iArr, iArr2);
                        j2 = jI;
                    } else {
                        if (eVar != null) {
                            zkn.b("null horizontalArrangement when isVertical == false");
                            fkd.a();
                            return null;
                        }
                        j2 = jI;
                        eVar.b(oxrVar, i21, iArr, asr.a, iArr2);
                    }
                    cVarY = ay0.y(iArr2);
                    if (z11) {
                        c.a aVar2 = c.d;
                        int i89 = cVarY.b;
                        int i810 = cVarY.a;
                        int i811 = -cVarY.c;
                        aVar2.getClass();
                        cVarY = new c(i89, i810, i811);
                    }
                    i35 = cVarY.a;
                    i36 = cVarY.b;
                    i37 = cVarY.c;
                    if (i37 > 0) {
                        while (true) {
                            i38 = iArr2[i35];
                            if (z11) {
                                i39 = i35;
                            } else {
                                i39 = (b3 - i35) - 1;
                            }
                            ozrVar10 = (ozr) gx0Var.get(i39);
                            if (z11) {
                                i38 = (i21 - i38) - ozrVar10.q;
                            }
                            ozrVar10.o(i38, iG, iF);
                            arrayList4.add(ozrVar10);
                            if (i35 == i36) {
                                break;
                                break;
                            }
                            i35 += i37;
                            i21 = i21;
                            i37 = i37;
                        }
                    } else {
                        while (true) {
                            i38 = iArr2[i35];
                            if (z11) {
                                i39 = i35;
                            } else {
                                i39 = (b3 - i35) - 1;
                            }
                            ozrVar10 = (ozr) gx0Var.get(i39);
                            if (z11) {
                                i38 = (i21 - i38) - ozrVar10.q;
                            }
                            ozrVar10.o(i38, iG, iF);
                            arrayList4.add(ozrVar10);
                            if (i35 == i36) {
                                break;
                                break;
                            }
                            i35 += i37;
                            i21 = i21;
                            i37 = i37;
                        }
                    }
                } else {
                    j2 = jI;
                    size5 = arrayList.size();
                    i23 = i8;
                    while (i22 < size5) {
                        ozr ozrVar111 = (ozr) arrayList.get(i22);
                        i23 -= ozrVar111.r;
                        ozrVar111.o(i23, iG, iF);
                        arrayList4.add(ozrVar111);
                    }
                    b2 = gx0Var.getB();
                    i25 = i8;
                    while (i24 < b2) {
                        ozr ozrVar112 = (ozr) gx0Var.get(i24);
                        ozrVar112.o(i25, iG, iF);
                        arrayList4.add(ozrVar112);
                        i25 += ozrVar112.r;
                    }
                    size6 = arrayList3.size();
                    while (i26 < size6) {
                        ozr ozrVar113 = (ozr) arrayList3.get(i26);
                        ozrVar113.o(i25, iG, iF);
                        arrayList4.add(ozrVar113);
                        i25 += ozrVar113.r;
                    }
                }
                float f9 = f3;
                int i812 = i63;
                i27 = i17;
                lazyLayoutItemAnimator.d((int) f9, iG, iF, arrayList4, azrVar.b(), hzrVar, z10, zQ0, 1, z6, i14, i812, v5bVar, t6lVar4);
                if (zQ0) {
                    jB = lazyLayoutItemAnimator.b();
                    z4 = z2;
                    if (!jxo.b(jB, 0L)) {
                        if (z10) {
                            i31 = iF;
                        } else {
                            i31 = iG;
                        }
                        long j5 = j2;
                        iG2 = oxa.g(Math.max(iG, (int) (jB >> 32)), j5);
                        iF = oxa.f(Math.max(iF, (int) (jB & 4294967295L)), j5);
                        if (z10) {
                            i32 = iF;
                        } else {
                            i32 = iG2;
                        }
                        if (i32 != i31) {
                            size7 = arrayList4.size();
                            while (i33 < size7) {
                                ozr ozrVar114 = (ozr) arrayList4.get(i33);
                                ozrVar114.u = i32;
                                ozrVar114.w = ozrVar114.i + i32;
                            }
                        }
                        i28 = iG2;
                    }
                    int i813 = iF;
                    ozrVar4 = (ozr) gx0Var.f();
                    if (ozrVar4 != null) {
                        i29 = ozrVar4.a;
                    } else {
                        i29 = 0;
                    }
                    ozrVar5 = (ozr) gx0Var.i();
                    if (ozrVar5 != null) {
                        i30 = ozrVar5.a;
                    } else {
                        i30 = 0;
                    }
                    z5 = true;
                    final List listC3 = wf9.c(this.j, i29, i30, arrayList4, azrVar.d(), i48, i46, i28, i813, new p8d(hzrVar, 1));
                    if (z4) {
                        ozrVar9 = (ozr) CollectionsKt.firstOrNull(arrayList4);
                        if (ozrVar9 != null) {
                            numValueOf = Integer.valueOf(ozrVar9.a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        ozrVar6 = (ozr) gx0Var.f();
                        if (ozrVar6 != null) {
                            numValueOf = Integer.valueOf(ozrVar6.a);
                        } else {
                            numValueOf = null;
                        }
                    }
                    if (z4) {
                        ozrVar8 = (ozr) CollectionsKt.d0(arrayList4);
                        if (ozrVar8 != null) {
                            numValueOf2 = Integer.valueOf(ozrVar8.a);
                        }
                    } else {
                        ozrVar7 = (ozr) gx0Var.i();
                        if (ozrVar7 != null) {
                            numValueOf2 = Integer.valueOf(ozrVar7.a);
                        }
                    }
                    if (i27 >= iA) {
                        z5 = false;
                    }
                    Function1<? super y.a, Unit> function3 = new Function1() { // from class: mzr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            boolean z13;
                            y.a aVar3 = (y.a) obj4;
                            aVar3.a = true;
                            ArrayList arrayList8 = arrayList4;
                            int size11 = arrayList8.size();
                            int i814 = 0;
                            while (true) {
                                z13 = zQ0;
                                if (i814 >= size11) {
                                    break;
                                }
                                ((ozr) arrayList8.get(i814)).i(aVar3, z13);
                                i814++;
                            }
                            List list2 = listC3;
                            int size12 = list2.size();
                            for (int i815 = 0; i815 < size12; i815++) {
                                ((ozr) list2.get(i815)).i(aVar3, z13);
                            }
                            Unit unit4 = Unit.a;
                            aVar3.a = false;
                            ytwVar.getValue();
                            return Unit.a;
                        }
                    };
                    int iG6 = oxa.g(i28 + i44, j);
                    int iF5 = oxa.f(i813 + i43, j);
                    o2g o2gVar4 = o2g.a;
                    o2gVar4.getClass();
                    biv bivVarE3 = rce0Var2.e1(iG6, iF5, o2gVar4, function3);
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (numValueOf2 != null) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    List listA4 = rxr.a(iIntValue, iIntValue2, arrayList4, listC3);
                    if (z10) {
                        i3zVar = i3z.a;
                    } else {
                        i3zVar = i3z.b;
                    }
                    rce0Var = rce0Var2;
                    nzrVar = new nzr(ozrVar110, i14, z5, f9, bivVarE3, f2, z12, v5bVar, oxrVar, hzrVar.d, listA4, i52, i60, iA, z11, i3zVar, i46, iY4);
                } else {
                    z4 = z2;
                }
                i28 = iG;
                int i814 = iF;
                ozrVar4 = (ozr) gx0Var.f();
                if (ozrVar4 != null) {
                    i29 = ozrVar4.a;
                } else {
                    i29 = 0;
                }
                ozrVar5 = (ozr) gx0Var.i();
                if (ozrVar5 != null) {
                    i30 = ozrVar5.a;
                } else {
                    i30 = 0;
                }
                z5 = true;
                final List listC4 = wf9.c(this.j, i29, i30, arrayList4, azrVar.d(), i48, i46, i28, i814, new p8d(hzrVar, 1));
                if (z4) {
                    ozrVar9 = (ozr) CollectionsKt.firstOrNull(arrayList4);
                    if (ozrVar9 != null) {
                        numValueOf = Integer.valueOf(ozrVar9.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    ozrVar6 = (ozr) gx0Var.f();
                    if (ozrVar6 != null) {
                        numValueOf = Integer.valueOf(ozrVar6.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z4) {
                    ozrVar8 = (ozr) CollectionsKt.d0(arrayList4);
                    if (ozrVar8 != null) {
                        numValueOf2 = Integer.valueOf(ozrVar8.a);
                    }
                } else {
                    ozrVar7 = (ozr) gx0Var.i();
                    if (ozrVar7 != null) {
                        numValueOf2 = Integer.valueOf(ozrVar7.a);
                    }
                }
                if (i27 >= iA) {
                    z5 = false;
                }
                Function1<? super y.a, Unit> function4 = new Function1() { // from class: mzr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        boolean z13;
                        y.a aVar3 = (y.a) obj4;
                        aVar3.a = true;
                        ArrayList arrayList8 = arrayList4;
                        int size11 = arrayList8.size();
                        int i815 = 0;
                        while (true) {
                            z13 = zQ0;
                            if (i815 >= size11) {
                                break;
                            }
                            ((ozr) arrayList8.get(i815)).i(aVar3, z13);
                            i815++;
                        }
                        List list2 = listC4;
                        int size12 = list2.size();
                        for (int i816 = 0; i816 < size12; i816++) {
                            ((ozr) list2.get(i816)).i(aVar3, z13);
                        }
                        Unit unit4 = Unit.a;
                        aVar3.a = false;
                        ytwVar.getValue();
                        return Unit.a;
                    }
                };
                int iG7 = oxa.g(i28 + i44, j);
                int iF6 = oxa.f(i814 + i43, j);
                o2g o2gVar5 = o2g.a;
                o2gVar5.getClass();
                biv bivVarE4 = rce0Var2.e1(iG7, iF6, o2gVar5, function4);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                List listA5 = rxr.a(iIntValue, iIntValue2, arrayList4, listC4);
                if (z10) {
                    i3zVar = i3z.a;
                } else {
                    i3zVar = i3z.b;
                }
                rce0Var = rce0Var2;
                nzrVar = new nzr(ozrVar110, i14, z5, f9, bivVarE4, f2, z12, v5bVar, oxrVar, hzrVar.d, listA5, i52, i60, iA, z11, i3zVar, i46, iY4);
            }
            zzr zzrVar3 = zzrVar;
            zzrVar3.g(nzrVar, rce0Var.q0(), false);
            qdd qddVar = zzrVar3.a;
            return nzrVar;
        } catch (Throwable th) {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
            throw th;
        }
    }
}
