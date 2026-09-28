package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oxb {

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderBetType.MULTIPLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final void a(final int i, androidx.compose.runtime.a aVar, final d dVar, final Function1 function1, final boolean z, final boolean z2) {
        int i2;
        Function1 function2;
        b bVar;
        int i3;
        int i4;
        b bVarI = aVar.i(898040774);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarR = j.r(bz60.a(h.f(dVar, 2.0f), 0.7f, 0.7f), 20.0f);
            long jA = c68.a(R.color.bg_secondary_d_white, bVarI);
            long jA2 = c68.a(R.color.bg_brand_sub_primary_d_base, bVarI);
            if (z2) {
                i3 = -271223214;
                i4 = R.color.border_danger;
            } else {
                i3 = -271221227;
                i4 = R.color.border_secondary;
            }
            bVar = bVarI;
            vj7.a(z, function2, dVarR, false, pj7.a(jA2, rzg.a(bVarI, i3, i4, bVarI, false), jA, c68.a(R.color.line_type1_secondary, bVarI), c68.a(R.color.line_type1_secondary, bVarI), bVar, 32), bVar, ((i2 >> 3) & 14) | ((i2 >> 6) & 112), 40);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gxb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oxb.a(qj40.a(i | 1), (a) obj, dVar, function1, z, z2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final String str, boolean z, final boolean z2, Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        d dVar2;
        final boolean z3 = z;
        final Function1 function2 = function1;
        b bVarI = aVar.i(319540027);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i4 = i3 >> 3;
            a((i4 & 112) | 6 | (i4 & 896) | (i4 & 7168), bVarI, g3w.h(aVar2, "bottom_sheet_checkbox"), function2, z3, z2);
            function2 = function2;
            z3 = z3;
            boolean z4 = ((57344 & i3) == 16384) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            if (z4 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: exb
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(Boolean.valueOf(!z3));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            dVar2 = aVar2;
            lkf0.d(str, g3w.h(h.h(g3w.f(aVar2, true, (Function0) objY), 4.0f, 0.0f, 2), "bottom_sheet_checkbox_text"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, i4 & 14, 0, 131064);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2() { // from class: fxb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oxb.b(dVar3, str, z3, z2, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0444  */
    /* JADX WARN: Code duplicated, block: B:210:0x0452  */
    /* JADX WARN: Code duplicated, block: B:213:0x048a  */
    /* JADX WARN: Code duplicated, block: B:214:0x048e  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:222:0x0530  */
    /* JADX WARN: Code duplicated, block: B:223:0x0534  */
    /* JADX WARN: Code duplicated, block: B:228:0x0551  */
    /* JADX WARN: Code duplicated, block: B:231:0x057a  */
    /* JADX WARN: Code duplicated, block: B:232:0x057e  */
    /* JADX WARN: Code duplicated, block: B:237:0x059b  */
    /* JADX WARN: Code duplicated, block: B:240:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:242:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:243:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:248:0x060a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0614  */
    /* JADX WARN: Code duplicated, block: B:254:0x062d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0632  */
    /* JADX WARN: Code duplicated, block: B:257:0x0645  */
    /* JADX WARN: Code duplicated, block: B:260:0x0691  */
    /* JADX WARN: Code duplicated, block: B:267:0x0732  */
    /* JADX WARN: Code duplicated, block: B:270:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:271:0x083f  */
    /* JADX WARN: Code duplicated, block: B:274:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:276:0x08df  */
    /* JADX WARN: Code duplicated, block: B:281:0x0903  */
    /* JADX WARN: Code duplicated, block: B:287:0x0934  */
    /* JADX WARN: Code duplicated, block: B:288:0x0938  */
    /* JADX WARN: Code duplicated, block: B:293:0x0955  */
    /* JADX WARN: Code duplicated, block: B:296:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:297:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:300:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:301:0x0a36  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:322:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b2e  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:332:0x0b57 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:335:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:338:0x0bde  */
    /* JADX WARN: Code duplicated, block: B:339:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:342:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:354:0x0c97  */
    /* JADX WARN: Code duplicated, block: B:357:0x0cb5  */
    /* JADX WARN: Code duplicated, block: B:358:0x0cb7  */
    /* JADX WARN: Code duplicated, block: B:361:0x0cbe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:364:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:367:0x0d5d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0d61  */
    /* JADX WARN: Code duplicated, block: B:371:0x0d70  */
    /* JADX WARN: Code duplicated, block: B:373:0x0d7e  */
    /* JADX WARN: Code duplicated, block: B:376:0x0da6  */
    /* JADX WARN: Code duplicated, block: B:377:0x0daa  */
    /* JADX WARN: Code duplicated, block: B:380:0x0db9  */
    /* JADX WARN: Code duplicated, block: B:382:0x0dc7  */
    /* JADX WARN: Code duplicated, block: B:385:0x0e63  */
    /* JADX WARN: Code duplicated, block: B:386:0x0e67  */
    /* JADX WARN: Code duplicated, block: B:389:0x0e76  */
    /* JADX WARN: Code duplicated, block: B:391:0x0e84  */
    /* JADX WARN: Code duplicated, block: B:394:0x0ee5  */
    /* JADX WARN: Code duplicated, block: B:397:0x0eea  */
    /* JADX WARN: Code duplicated, block: B:398:0x0eed  */
    /* JADX WARN: Code duplicated, block: B:402:0x0f53  */
    /* JADX WARN: Code duplicated, block: B:404:0x0f66  */
    /* JADX WARN: Code duplicated, block: B:406:0x0f6c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0f73  */
    /* JADX WARN: Code duplicated, block: B:410:0x0f96  */
    /* JADX WARN: Code duplicated, block: B:413:0x0fb5  */
    /* JADX WARN: Code duplicated, block: B:414:0x0fb7  */
    /* JADX WARN: Code duplicated, block: B:417:0x0fbe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x0fc5  */
    /* JADX WARN: Code duplicated, block: B:423:0x100b  */
    /* JADX WARN: Code duplicated, block: B:425:0x103d  */
    /* JADX WARN: Code duplicated, block: B:426:0x1041  */
    /* JADX WARN: Code duplicated, block: B:429:0x1050  */
    /* JADX WARN: Code duplicated, block: B:433:0x1062  */
    /* JADX WARN: Code duplicated, block: B:435:0x10bf  */
    /* JADX WARN: Code duplicated, block: B:437:0x10c3  */
    /* JADX WARN: Code duplicated, block: B:439:0x10f5  */
    /* JADX WARN: Code duplicated, block: B:440:0x10f9  */
    /* JADX WARN: Code duplicated, block: B:443:0x1108  */
    /* JADX WARN: Code duplicated, block: B:445:0x1116  */
    /* JADX WARN: Code duplicated, block: B:448:0x116e  */
    /* JADX WARN: Code duplicated, block: B:449:0x1170  */
    /* JADX WARN: Code duplicated, block: B:452:0x1177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:455:0x117e  */
    /* JADX WARN: Code duplicated, block: B:458:0x1209  */
    /* JADX WARN: Code duplicated, block: B:461:0x1261  */
    /* JADX WARN: Code duplicated, block: B:462:0x1265  */
    /* JADX WARN: Code duplicated, block: B:465:0x1274  */
    /* JADX WARN: Code duplicated, block: B:467:0x1282  */
    /* JADX WARN: Code duplicated, block: B:470:0x129a  */
    /* JADX WARN: Code duplicated, block: B:471:0x129c  */
    /* JADX WARN: Code duplicated, block: B:474:0x12a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:477:0x12a9  */
    /* JADX WARN: Code duplicated, block: B:480:0x1305  */
    /* JADX WARN: Code duplicated, block: B:481:0x1309  */
    /* JADX WARN: Code duplicated, block: B:484:0x1318  */
    /* JADX WARN: Code duplicated, block: B:486:0x1326  */
    /* JADX WARN: Code duplicated, block: B:489:0x1350  */
    /* JADX WARN: Code duplicated, block: B:490:0x1354  */
    /* JADX WARN: Code duplicated, block: B:493:0x1363  */
    /* JADX WARN: Code duplicated, block: B:495:0x1371  */
    /* JADX WARN: Code duplicated, block: B:498:0x137c  */
    /* JADX WARN: Code duplicated, block: B:499:0x137e  */
    /* JADX WARN: Code duplicated, block: B:502:0x1385 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:505:0x138c  */
    /* JADX WARN: Code duplicated, block: B:508:0x13a9  */
    /* JADX WARN: Code duplicated, block: B:509:0x13bc  */
    /* JADX WARN: Code duplicated, block: B:512:0x13fd  */
    /* JADX WARN: Code duplicated, block: B:514:0x140f  */
    /* JADX WARN: Code duplicated, block: B:515:0x1412  */
    /* JADX WARN: Code duplicated, block: B:518:0x1419 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:521:0x1420  */
    /* JADX WARN: Code duplicated, block: B:523:0x1438  */
    public static final void c(final OrderBetType orderBetType, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, m980 m980Var, final boolean z, final boolean z2, final boolean z3, final boolean z4, uxs uxsVar, final kmn kmnVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function0 function0, Function0 function5, final Function0 function6, final String str9, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        m980 m980Var2;
        b bVar;
        uxs uxsVar2;
        String strA;
        String str10;
        int i6;
        int i7;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str11;
        n54 n54Var;
        char c;
        yka.a.c cVar;
        tsr.a aVar2;
        yka.a.d dVar;
        yka.a.b bVar2;
        n54.b bVar3;
        kw0.g gVar;
        d.a aVar3;
        int iHashCode4;
        tsr.a aVar4;
        yka.a.b bVar4;
        yka.a.d dVar2;
        yka.a.C1350a c1350a;
        yka.a.c cVar2;
        int iHashCode5;
        int iHashCode6;
        xln xlnVar;
        xln xlnVar2;
        Object objY;
        b5i b5iVar;
        boolean z5;
        int i8;
        int i9;
        long jA;
        Object objY2;
        boolean z6;
        Object objY3;
        Object objY4;
        final b5i b5iVar2;
        int i10;
        int i11;
        long jA2;
        Object objY5;
        boolean z7;
        Object objY6;
        b bVar5;
        n54.b bVar6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        boolean zA;
        Object objY7;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        int i12;
        int i13;
        int i14;
        Object objY8;
        boolean z8;
        Object objY9;
        UiText uiText;
        kw0.d dVar3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        yka.a.c cVar3;
        float f;
        float f2;
        int iHashCode10;
        boolean z9;
        Object objY10;
        int i15;
        int iHashCode11;
        boolean z10;
        Object objY11;
        b bVar7;
        int iHashCode12;
        int iHashCode13;
        boolean z11;
        Object objY12;
        int i16;
        alb0 alb0VarA;
        boolean z12;
        Object objY13;
        int i17;
        int iHashCode14;
        int iHashCode15;
        String strA2;
        Function0 function7 = function5;
        qn4.b(str2, str3, str4, str5, str6);
        str7.getClass();
        str8.getClass();
        m980Var.getClass();
        str9.getClass();
        b bVarI = aVar.i(-1458245200);
        int i18 = i | (bVarI.d(orderBetType == null ? -1 : orderBetType.ordinal()) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.M(str4) ? 16384 : 8192) | (bVarI.M(str5) ? 131072 : 65536) | (bVarI.M(str6) ? 1048576 : 524288) | (bVarI.M(str7) ? 8388608 : 4194304) | (bVarI.M(str8) ? 67108864 : 33554432) | (bVarI.A(m980Var) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.b(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.b(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.b(z4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.d(uxsVar == null ? -1 : uxsVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= (262144 & i2) == 0 ? bVarI.M(kmnVar) : bVarI.A(kmnVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= bVarI.A(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= bVarI.A(function3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= bVarI.A(function4) ? 536870912 : 268435456;
        }
        int i19 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (bVarI.A(function0) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= bVarI.A(function7) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= bVarI.A(function6) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= bVarI.M(str9) ? 2048 : 1024;
        }
        int i20 = i5;
        if (bVarI.q(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 306783379) == 306783378 && (i20 & 1171) == 1170) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            k4i k4iVar = (k4i) bVarI.O(kna.i);
            Object objY14 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (objY14 == c0042a3) {
                objY14 = new b5i();
                bVarI.r(objY14);
            }
            b5i b5iVar3 = (b5i) objY14;
            Object objY15 = bVarI.y();
            if (objY15 == c0042a3) {
                objY15 = new b5i();
                bVarI.r(objY15);
            }
            b5i b5iVar4 = (b5i) objY15;
            Object objY16 = bVarI.y();
            if (objY16 == c0042a3) {
                objY16 = m.b(Boolean.FALSE);
                bVarI.r(objY16);
            }
            ytw ytwVar = (ytw) objY16;
            Object objY17 = bVarI.y();
            if (objY17 == c0042a3) {
                objY17 = m.b(Boolean.FALSE);
                bVarI.r(objY17);
            }
            ytw ytwVar2 = (ytw) objY17;
            Object objY18 = bVarI.y();
            if (objY18 == c0042a3) {
                objY18 = m.b(Boolean.FALSE);
                bVarI.r(objY18);
            }
            final ytw ytwVar3 = (ytw) objY18;
            d.a aVar5 = d.a.b;
            d dVarH = g3w.h(j.g(aVar5, 1.0f), "auto_bet_create_content");
            kw0.k kVar = kw0.c;
            n54.a aVar6 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar6, bVarI, 0);
            int iHashCode16 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO = bVarI.o();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar8 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar8);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarO, dVar4);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode16))) {
                n30.a(iHashCode16, bVarI, iHashCode16, c1350a2);
            }
            yka.a.c cVar4 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar4);
            d dVarH2 = g3w.h(j.i(h.g(j.g(aVar5, 1.0f), 24.0f, 0.0f), 42.0f), "auto_bet_create_bet_type_row");
            kw0.g gVar2 = kw0.g;
            n54.b bVar9 = ht.a.k;
            d160 d160VarA = b160.a(gVar2, bVar9, bVarI, 54);
            int iHashCode17 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO2 = bVarI.o();
            d dVarC2 = c.c(bVarI, dVarH2);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar8);
            hlh0.a(bVarI, ne00VarO2, dVar4);
            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode17))) {
                n30.a(iHashCode17, bVarI, iHashCode17, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar4);
            lkf0.d(cb40.a(R.string.component_betslip__bet_type, new Object[0], bVarI), g3w.h(aVar5, "auto_bet_create_bet_type_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            b bVar10 = bVarI;
            int i21 = a.a[orderBetType.ordinal()];
            if (i21 != 1) {
                if (i21 != 2) {
                    bVar10.N(140901396);
                    bVar10.H();
                    str10 = "";
                } else {
                    bVar10.N(1805657734);
                    strA = cb40.a(R.string.component_betslip__multiple, new Object[0], bVar10);
                    bVar10.H();
                }
                lkf0.d(str10, g3w.h(aVar5, "auto_bet_create_bet_type_value"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, 48, 0, 131064);
                bVar10.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar10, 48, 1);
                d dVarG = j.g(aVar5, 1.0f);
                if (z) {
                    i6 = 883981141;
                    i7 = R.color.warning_tertiary;
                } else {
                    i6 = 883983472;
                    i7 = R.color.transparent;
                }
                d dVarH3 = g3w.h(h.g(androidx.compose.foundation.a.c(dr2.a(i6, i7, bVar10, bVar10), dVarG), 24.0f, 8.0f), "auto_bet_create_outcome_row");
                d160 d160VarA2 = b160.a(gVar2, bVar9, bVar10, 54);
                iHashCode = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO3 = bVar10.o();
                d dVarC3 = c.c(bVar10, dVarH3);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar7);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, d160VarA2, bVar8);
                hlh0.a(bVar10, ne00VarO3, dVar4);
                if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVar10, iHashCode, c1350a2);
                }
                hlh0.a(bVar10, dVarC3, cVar4);
                lkf0.d(cb40.a(R.string.component_betslip__outcome, new Object[0], bVar10), g3w.h(aVar5, "auto_bet_create_outcome_label"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar10), bVar10, 48, 0, 131064);
                ty0.a(bVar10, j.w(aVar5, 12.0f));
                i78 i78VarA2 = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.o, bVar10, 54);
                iHashCode2 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO4 = bVar10.o();
                d dVarC4 = c.c(bVar10, aVar5);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar7);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, i78VarA2, bVar8);
                hlh0.a(bVar10, ne00VarO4, dVar4);
                if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVar10, iHashCode2, c1350a2);
                }
                hlh0.a(bVar10, dVarC4, cVar4);
                kw0.j jVar = kw0.a;
                d160 d160VarA3 = b160.a(jVar, bVar9, bVar10, 48);
                iHashCode3 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO5 = bVar10.o();
                str11 = "";
                d dVarC5 = c.c(bVar10, aVar5);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar7);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, d160VarA3, bVar8);
                hlh0.a(bVar10, ne00VarO5, dVar4);
                if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVar10, iHashCode3, c1350a2);
                }
                hlh0.a(bVar10, dVarC5, cVar4);
                n54Var = ht.a.a;
                if (z) {
                    bVar10.N(1497383477);
                    d dVarH4 = g3w.h(h.g(androidx.compose.foundation.a.b(aVar5, c68.a(R.color.bg_disabled, bVar10), j060.c(2.0f)), 8.0f, 2.0f), "auto_bet_create_outcome_status_badge");
                    aiv aivVarC = g75.c(n54Var, false);
                    iHashCode15 = Long.hashCode(l2a.a(bVar10));
                    ne00 ne00VarO6 = bVar10.o();
                    d dVarC6 = c.c(bVar10, dVarH4);
                    bVar10.D();
                    if (bVar10.g()) {
                        bVar10.F(aVar7);
                    } else {
                        bVar10.p();
                    }
                    hlh0.a(bVar10, aivVarC, bVar8);
                    hlh0.a(bVar10, ne00VarO6, dVar4);
                    if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode15))) {
                        n30.a(iHashCode15, bVar10, iHashCode15, c1350a2);
                    }
                    hlh0.a(bVar10, dVarC6, cVar4);
                    if (m980Var instanceof m980.f) {
                        bVar10.N(-819140775);
                        strA2 = cb40.a(R.string.component_betslip__suspended, new Object[0], bVar10);
                        bVar10.H();
                    } else {
                        if (m980Var instanceof m980.g) {
                            bVar10.N(-819136549);
                            strA2 = cb40.a(R.string.component_betslip__unavailable, new Object[0], bVar10);
                            bVar10.H();
                        } else {
                            bVar10.N(376676002);
                            bVar10.H();
                        }
                        c = 2140;
                        lkf0.d(str11, g3w.h(aVar5, "auto_bet_create_outcome_status_text"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                        bVar10.s();
                        bVar10.H();
                    }
                    str11 = strA2;
                    c = 2140;
                    lkf0.d(str11, g3w.h(aVar5, "auto_bet_create_outcome_status_text"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                    bVar10.s();
                    bVar10.H();
                } else {
                    c = 2140;
                    bVar10.N(1498630855);
                    bVar10.H();
                }
                ty0.a(bVar10, j.w(aVar5, 8.0f));
                if (str != null || str.length() <= 0) {
                    cVar = cVar4;
                    aVar2 = aVar7;
                    dVar = dVar4;
                    bVar2 = bVar8;
                    bVar3 = bVar9;
                    gVar = gVar2;
                    bVar10.N(1499300548);
                    aVar3 = aVar5;
                    h6n.b(erz.a(R.drawable.ic_sport_default, 0, bVar10), null, j.r(aVar3, 16.0f), c68.a(R.color.icon_primary, bVar10), bVar10, 432, 0);
                    bVar10.H();
                } else {
                    bVar10.N(1498792024);
                    bVar3 = bVar9;
                    cVar = cVar4;
                    aVar2 = aVar7;
                    dVar = dVar4;
                    bVar2 = bVar8;
                    gVar = gVar2;
                    mw90.b(str, null, j.r(aVar5, 16.0f), null, erz.a(R.drawable.ic_sport_default, 0, bVar10), null, null, null, d0b.a.b, 0.0f, new gf4(c68.a(R.color.icon_primary, bVar10), 5), bVar10, ((i18 >> 3) & 14) | 432, 6, 27624);
                    bVar10 = bVar10;
                    bVar10.H();
                    aVar3 = aVar5;
                }
                ty0.a(bVar10, j.w(aVar3, 2.0f));
                lkf0.d(str2, g3w.h(aVar3, "auto_bet_create_outcome_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, ((i18 >> 6) & 14) | 48, 0, 131064);
                bVar10.s();
                if (str3.length() > 0) {
                    bVar10.N(1009104796);
                    b bVar11 = bVar10;
                    lkf0.d(str3, g3w.h(aVar3, "auto_bet_create_match_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, bVar10), bVar11, ((i18 >> 9) & 14) | 48, 24960, 109560);
                    lkf0.d(str4, g3w.h(aVar3, "auto_bet_create_market_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar11, ((i18 >> 12) & 14) | 48, 0, 130040);
                    bVar10.H();
                } else {
                    bVar10.N(1010023450);
                    lkf0.d(str4, g3w.h(aVar3, "auto_bet_create_match_name_no_market"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, ((i18 >> 12) & 14) | 48, 24960, 109560);
                    bVar10.H();
                }
                bVar10.s();
                bVar10.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar10, 48, 1);
                d dVarH5 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, 8.0f), "auto_bet_create_odds_row");
                kw0.g gVar3 = gVar;
                n54.b bVar12 = bVar3;
                d160 d160VarA4 = b160.a(gVar3, bVar12, bVar10, 54);
                iHashCode4 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO7 = bVar10.o();
                d dVarC7 = c.c(bVar10, dVarH5);
                bVar10.D();
                if (bVar10.g()) {
                    aVar4 = aVar2;
                    bVar10.F(aVar4);
                } else {
                    aVar4 = aVar2;
                    bVar10.p();
                }
                bVar4 = bVar2;
                hlh0.a(bVar10, d160VarA4, bVar4);
                dVar2 = dVar;
                hlh0.a(bVar10, ne00VarO7, dVar2);
                if (bVar10.g() && Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode4))) {
                    c1350a = c1350a2;
                } else {
                    c1350a = r16;
                    n30.a(iHashCode4, bVar10, iHashCode4, c1350a);
                }
                cVar2 = cVar;
                hlh0.a(bVar10, dVarC7, cVar2);
                i78 i78VarA3 = g78.a(kVar, aVar6, bVar10, 0);
                iHashCode5 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO8 = bVar10.o();
                d dVarC8 = c.c(bVar10, aVar3);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar4);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, i78VarA3, bVar4);
                hlh0.a(bVar10, ne00VarO8, dVar2);
                if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVar10, iHashCode5, c1350a);
                }
                hlh0.a(bVar10, dVarC8, cVar2);
                lkf0.d(cb40.a(R.string.common_functions__odds_txt, new Object[0], bVar10), g3w.h(aVar3, "auto_bet_create_odds_label"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar10), bVar10, 48, 0, 131064);
                if (z) {
                    bVar10.N(-924965910);
                    bVar10.H();
                } else {
                    bVar10.N(-925349907);
                    lkf0.d(tug.a(cb40.a(R.string.component_betslip__current_odds, new Object[0], bVar10), ": ", str6), g3w.h(aVar3, "auto_bet_create_current_odds_hint"), c68.a(R.color.text_secondary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                    bVar10.H();
                }
                bVar10.s();
                d160 d160VarA5 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar12, bVar10, 54);
                iHashCode6 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO9 = bVar10.o();
                d dVarC9 = c.c(bVar10, aVar3);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar4);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, d160VarA5, bVar4);
                hlh0.a(bVar10, ne00VarO9, dVar2);
                if (bVar10.g() || !Intrinsics.g(bVar10.y(), Integer.valueOf(iHashCode6))) {
                    n30.a(iHashCode6, bVar10, iHashCode6, c1350a);
                }
                hlh0.a(bVar10, dVarC9, cVar2);
                xln xlnVar3 = kmnVar.a;
                xlnVar = kmnVar.b;
                xlnVar2 = kmnVar.c;
                String str12 = xlnVar3.a;
                gop gopVar = new gop(3, 6, 115);
                objY = bVar10.y();
                if (objY == c0042a3) {
                    b5iVar = b5iVar3;
                    objY = new bxb(b5iVar, 0);
                    bVar10.r(objY);
                } else {
                    b5iVar = r50;
                }
                tnp tnpVar = new tnp(null, (Function1) objY, null, 59);
                imf0 imf0VarB = imf0.b(mla.l(R.style.B1_M, bVar10), c68.a(R.color.text_primary, bVar10), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var = new soa0(c68.a(R.color.text_primary, bVar10));
                d dVarI = j.i(j.w(aVar3, 76.0f), 30.0f);
                z5 = kmnVar.a.b;
                i8 = R.color.border_secondary;
                if (!z5 || xlnVar.b) {
                    i9 = 1847562098;
                    i8 = R.color.border_danger;
                } else {
                    if (d(ytwVar)) {
                        jA = dr2.a(1847565301, R.color.border_brand_sub, bVar10, bVar10);
                    } else {
                        i9 = 1847567893;
                    }
                    d dVarH6 = h.h(d35.a(dVarI, 1.0f, jA, j060.c(2.0f)), 5.0f, 0.0f, 2);
                    objY2 = bVar10.y();
                    if (objY2 == c0042a3) {
                        objY2 = new cxb(ytwVar, 0);
                        bVar10.r(objY2);
                    }
                    d dVarH7 = g3w.h(androidx.compose.ui.focus.a.a(dVarH6, (Function1) objY2), "auto_bet_create_min_odds_input");
                    if ((3670016 & i19) == 1048576) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objY3 = bVar10.y();
                    if (z6 || objY3 == c0042a3) {
                        objY3 = new dxb(function1, 0);
                        bVar10.r(objY3);
                    }
                    ab2.b(str12, (Function1) objY3, dVarH7, false, false, imf0VarB, gopVar, tnpVar, true, 0, 0, null, null, null, soa0Var, pp8.b(1828570979, new gaj() { // from class: wwb
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Function2 function8 = (Function2) obj;
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function8.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar8.A(function8) ? 4 : 2;
                            }
                            int i22 = iIntValue;
                            if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                                aiv aivVarC2 = g75.c(ht.a.f, false);
                                int iHashCode18 = Long.hashCode(aVar8.m());
                                ne00 ne00VarO10 = aVar8.o();
                                d.a aVar9 = d.a.b;
                                d dVarC10 = c.c(aVar8, aVar9);
                                yka.k.getClass();
                                tsr.a aVar10 = yka.a.b;
                                if (aVar8.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar8.D();
                                if (aVar8.g()) {
                                    aVar8.F(aVar10);
                                } else {
                                    aVar8.p();
                                }
                                hlh0.a(aVar8, aivVarC2, yka.a.f);
                                hlh0.a(aVar8, ne00VarO10, yka.a.e);
                                yka.a.C1350a c1350a3 = yka.a.g;
                                if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                                    j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                                }
                                hlh0.a(aVar8, dVarC10, yka.a.d);
                                if (kmnVar.a.a.length() == 0) {
                                    aVar8.N(-1807621071);
                                    lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                                    aVar8 = aVar8;
                                    aVar8.H();
                                } else {
                                    aVar8.N(-1807153095);
                                    aVar8.H();
                                }
                                ps.a(i22 & 14, aVar8, function8);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVar10), bVar10, 102236160, 196608, 15896);
                    lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, 6, 0, 131066);
                    String str13 = xlnVar.a;
                    gop gopVar2 = new gop(3, 6, 115);
                    objY4 = bVar10.y();
                    if (objY4 == c0042a3) {
                        b5iVar2 = b5iVar4;
                        objY4 = new Function1() { // from class: hxb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((snp) obj).getClass();
                                b5i.b(b5iVar2);
                                return Unit.a;
                            }
                        };
                        bVar10.r(objY4);
                    } else {
                        b5iVar2 = r52;
                    }
                    tnp tnpVar2 = new tnp(null, (Function1) objY4, null, 59);
                    imf0 imf0VarB2 = imf0.b(mla.l(R.style.B1_M, bVar10), c68.a(R.color.text_primary, bVar10), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                    soa0 soa0Var2 = new soa0(c68.a(R.color.text_primary, bVar10));
                    d dVarI2 = j.i(j.w(aVar3, 76.0f), 30.0f);
                    if (!xlnVar.b || kmnVar.a.b) {
                        i10 = 1847655986;
                        i11 = R.color.border_danger;
                    } else {
                        if (e(ytwVar2)) {
                            i10 = 1847659189;
                            i11 = R.color.border_brand_sub;
                        } else {
                            jA2 = dr2.a(1847661781, R.color.border_secondary, bVar10, bVar10);
                        }
                        d dVarH8 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI2, 1.0f, jA2, j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2);
                        objY5 = bVar10.y();
                        if (objY5 == c0042a3) {
                            objY5 = new ixb(ytwVar2, 0);
                            bVar10.r(objY5);
                        }
                        d dVarH9 = g3w.h(androidx.compose.ui.focus.a.a(dVarH8, (Function1) objY5), "auto_bet_create_max_odds_input");
                        if ((29360128 & i19) == 8388608) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objY6 = bVar10.y();
                        if (z7 || objY6 == c0042a3) {
                            objY6 = new Function1() { // from class: jxb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    String str14 = (String) obj;
                                    str14.getClass();
                                    if (str14.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str14)) {
                                        function2.invoke(str14);
                                    }
                                    return Unit.a;
                                }
                            };
                            bVar10.r(objY6);
                        }
                        ab2.b(str13, (Function1) objY6, dVarH9, false, false, imf0VarB2, gopVar2, tnpVar2, true, 0, 0, null, null, null, soa0Var2, pp8.b(1547738330, new gaj() { // from class: kxb
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Function2 function8 = (Function2) obj;
                                a aVar8 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                function8.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= aVar8.A(function8) ? 4 : 2;
                                }
                                int i22 = iIntValue;
                                if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                                    aiv aivVarC2 = g75.c(ht.a.f, false);
                                    int iHashCode18 = Long.hashCode(aVar8.m());
                                    ne00 ne00VarO10 = aVar8.o();
                                    d.a aVar9 = d.a.b;
                                    d dVarC10 = c.c(aVar8, aVar9);
                                    yka.k.getClass();
                                    tsr.a aVar10 = yka.a.b;
                                    if (aVar8.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar8.D();
                                    if (aVar8.g()) {
                                        aVar8.F(aVar10);
                                    } else {
                                        aVar8.p();
                                    }
                                    hlh0.a(aVar8, aivVarC2, yka.a.f);
                                    hlh0.a(aVar8, ne00VarO10, yka.a.e);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                                        j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                                    }
                                    hlh0.a(aVar8, dVarC10, yka.a.d);
                                    if (kmnVar.b.a.length() == 0) {
                                        aVar8.N(-1590042406);
                                        lkf0.d(cb40.a(R.string.component_betslip__max, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                                        aVar8 = aVar8;
                                        aVar8.H();
                                    } else {
                                        aVar8.N(-1589574430);
                                        aVar8.H();
                                    }
                                    ps.a(i22 & 14, aVar8, function8);
                                } else {
                                    aVar8.G();
                                }
                                return Unit.a;
                            }
                        }, bVar10), bVar10, 102236160, 196608, 15896);
                        bVar10.s();
                        bVar10.s();
                        bVar5 = bVar10;
                        ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar5, 48, 1);
                        d dVarH10 = g3w.h(h.i(j.g(aVar3, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                        bVar6 = bVar12;
                        d160 d160VarA6 = b160.a(gVar3, bVar6, bVar5, 54);
                        iHashCode7 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO10 = bVar5.o();
                        d dVarC10 = c.c(bVar5, dVarH10);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA6, bVar4);
                        hlh0.a(bVar5, ne00VarO10, dVar2);
                        if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode7))) {
                            n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
                        }
                        hlh0.a(bVar5, dVarC10, cVar2);
                        i78 i78VarA4 = g78.a(kVar, aVar6, bVar5, 0);
                        iHashCode8 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO11 = bVar5.o();
                        d dVarC11 = c.c(bVar5, aVar3);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, i78VarA4, bVar4);
                        hlh0.a(bVar5, ne00VarO11, dVar2);
                        if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode8))) {
                            n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                        }
                        hlh0.a(bVar5, dVarC11, cVar2);
                        lkf0.d(cb40.a(R.string.common_functions__stake, new Object[0], bVar5), g3w.h(aVar3, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar5), bVar5, 48, 0, 131064);
                        lkf0.d(str9, g3w.h(aVar3, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, ((i20 >> 9) & 14) | 48, 0, 131064);
                        bVar5.s();
                        d160 d160VarA7 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar6, bVar5, 54);
                        iHashCode9 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO12 = bVar5.o();
                        d dVarC12 = c.c(bVar5, aVar3);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA7, bVar4);
                        hlh0.a(bVar5, ne00VarO12, dVar2);
                        if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode9))) {
                            n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
                        }
                        hlh0.a(bVar5, dVarC12, cVar2);
                        lkf0.d(str5, g3w.h(aVar3, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, ((i18 >> 15) & 14) | 48, 0, 131064);
                        String str14 = xlnVar2.a;
                        gop gopVar3 = new gop(3, 7, 115);
                        zA = bVar5.A(k4iVar);
                        objY7 = bVar5.y();
                        if (zA) {
                            c0042a = c0042a3;
                        } else {
                            c0042a = c0042a3;
                            if (objY7 == c0042a) {
                            }
                            tnp tnpVar3 = new tnp((Function1) objY7, null, null, 62);
                            imf0 imf0VarB3 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                            i12 = i20;
                            soa0 soa0Var3 = new soa0(c68.a(R.color.text_primary, bVar5));
                            d dVarI3 = j.i(j.w(aVar3, 136.0f), 30.0f);
                            if (xlnVar2.b) {
                                i13 = 1369607091;
                                i14 = R.color.border_danger;
                            } else if (f(ytwVar3)) {
                                i13 = 1369610230;
                                i14 = R.color.border_brand_sub;
                            } else {
                                i13 = 1369612822;
                                i14 = R.color.border_secondary;
                            }
                            d dVarH11 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI3, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                            objY8 = bVar5.y();
                            if (objY8 == c0042a) {
                                objY8 = new Function1() { // from class: lxb
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        j5i j5iVar = (j5i) obj;
                                        j5iVar.getClass();
                                        ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                                        return Unit.a;
                                    }
                                };
                                bVar5.r(objY8);
                            }
                            d dVarH12 = g3w.h(androidx.compose.ui.focus.a.a(dVarH11, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                            if ((i19 & 234881024) == 67108864) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            objY9 = bVar5.y();
                            if (z8 || objY9 == c0042a) {
                                objY9 = new l53(function3, 1);
                                bVar5.r(objY9);
                            }
                            ab2.b(str14, (Function1) objY9, dVarH12, false, false, imf0VarB3, gopVar3, tnpVar3, true, 0, 0, null, null, null, soa0Var3, pp8.b(-1403207708, new gaj() { // from class: mxb
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    a aVar8;
                                    Function2 function8 = (Function2) obj;
                                    a aVar9 = (a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    function8.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= aVar9.A(function8) ? 4 : 2;
                                    }
                                    int i22 = iIntValue;
                                    if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                                        aiv aivVarC2 = g75.c(ht.a.f, false);
                                        int iHashCode18 = Long.hashCode(aVar9.m());
                                        ne00 ne00VarO13 = aVar9.o();
                                        d.a aVar10 = d.a.b;
                                        d dVarC13 = c.c(aVar9, aVar10);
                                        yka.k.getClass();
                                        tsr.a aVar11 = yka.a.b;
                                        if (aVar9.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar9.D();
                                        if (aVar9.g()) {
                                            aVar9.F(aVar11);
                                        } else {
                                            aVar9.p();
                                        }
                                        hlh0.a(aVar9, aivVarC2, yka.a.f);
                                        hlh0.a(aVar9, ne00VarO13, yka.a.e);
                                        yka.a.C1350a c1350a3 = yka.a.g;
                                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                            j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                                        }
                                        hlh0.a(aVar9, dVarC13, yka.a.d);
                                        if (kmnVar.c.a.length() == 0) {
                                            aVar9.N(555385627);
                                            imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                            lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                            aVar8 = aVar9;
                                            aVar8.H();
                                        } else {
                                            aVar8 = aVar9;
                                            aVar8.N(555812280);
                                            aVar8.H();
                                        }
                                        ps.a(i22 & 14, aVar8, function8);
                                    } else {
                                        aVar9.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVar5), bVar5, 102236160, 196608, 15896);
                            bVar5.s();
                            bVar5.s();
                            uiText = xlnVar2.c;
                            dVar3 = kw0.b;
                            if (uiText != null) {
                                bVar5.N(1650374506);
                                d dVarI4 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                                d160 d160VarA8 = b160.a(dVar3, bVar6, bVar5, 54);
                                iHashCode14 = Long.hashCode(l2a.a(bVar5));
                                ne00 ne00VarO13 = bVar5.o();
                                d dVarC13 = c.c(bVar5, dVarI4);
                                bVar5.D();
                                if (bVar5.g()) {
                                    bVar5.F(aVar4);
                                } else {
                                    bVar5.p();
                                }
                                hlh0.a(bVar5, d160VarA8, bVar4);
                                hlh0.a(bVar5, ne00VarO13, dVar2);
                                if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode14))) {
                                    n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                                }
                                hlh0.a(bVar5, dVarC13, cVar2);
                                lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                                bVar5.s();
                                bVar5.H();
                                c0042a2 = c0042a;
                                bVar6 = bVar6;
                                cVar3 = cVar2;
                                f2 = 8.0f;
                                f = 1.0f;
                            } else {
                                if (z2) {
                                    bVar5.N(1651170555);
                                    d dVarI5 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                                    d160 d160VarA9 = b160.a(dVar3, bVar6, bVar5, 54);
                                    iHashCode10 = Long.hashCode(l2a.a(bVar5));
                                    ne00 ne00VarO14 = bVar5.o();
                                    d dVarC14 = c.c(bVar5, dVarI5);
                                    bVar5.D();
                                    if (bVar5.g()) {
                                        bVar5.F(aVar4);
                                    } else {
                                        bVar5.p();
                                    }
                                    hlh0.a(bVar5, d160VarA9, bVar4);
                                    hlh0.a(bVar5, ne00VarO14, dVar2);
                                    if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode10))) {
                                        n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                                    }
                                    hlh0.a(bVar5, dVarC14, cVar2);
                                    lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                                    if ((i12 & 896) == 256) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objY10 = bVar5.y();
                                    if (!z9 || objY10 == c0042a) {
                                        i15 = 0;
                                        objY10 = new nxb(0, function6);
                                        bVar5.r(objY10);
                                    } else {
                                        i15 = 0;
                                    }
                                    lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                                    i12 = i12;
                                    cVar3 = cVar2;
                                    c0042a2 = c0042a;
                                    f = 1.0f;
                                    h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                                    bVar5 = bVar5;
                                    bVar5.s();
                                    bVar5.H();
                                } else {
                                    c0042a2 = c0042a;
                                    cVar3 = cVar2;
                                    f = 1.0f;
                                    bVar5.N(1652524604);
                                    bVar5.H();
                                }
                                f2 = 8.0f;
                            }
                            ty0.a(bVar5, j.i(aVar3, f2));
                            ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                            d dVarH13 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                            d160 d160VarA10 = b160.a(jVar, bVar6, bVar5, 48);
                            iHashCode11 = Long.hashCode(l2a.a(bVar5));
                            ne00 ne00VarO15 = bVar5.o();
                            d dVarC15 = c.c(bVar5, dVarH13);
                            bVar5.D();
                            if (bVar5.g()) {
                                bVar5.F(aVar4);
                            } else {
                                bVar5.p();
                            }
                            hlh0.a(bVar5, d160VarA10, bVar4);
                            hlh0.a(bVar5, ne00VarO15, dVar2);
                            if (bVar5.g() || !Intrinsics.g(bVar5.y(), Integer.valueOf(iHashCode11))) {
                                n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                            }
                            hlh0.a(bVar5, dVarC15, cVar3);
                            String strA3 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                            if ((i19 & 1879048192) == 536870912) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objY11 = bVar5.y();
                            if (z10 || objY11 == c0042a2) {
                                objY11 = new xwb(function4, 0);
                                bVar5.r(objY11);
                            }
                            bVar7 = bVar5;
                            b(null, strA3, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                            bVar7.s();
                            ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                            d dVarG2 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                            d160 d160VarA11 = b160.a(jVar, bVar6, bVar7, 48);
                            iHashCode12 = Long.hashCode(l2a.a(bVar7));
                            ne00 ne00VarO16 = bVar7.o();
                            d dVarC16 = c.c(bVar7, dVarG2);
                            bVar7.D();
                            if (bVar7.g()) {
                                bVar7.F(aVar4);
                            } else {
                                bVar7.p();
                            }
                            hlh0.a(bVar7, d160VarA11, bVar4);
                            hlh0.a(bVar7, ne00VarO16, dVar2);
                            if (bVar7.g() || !Intrinsics.g(bVar7.y(), Integer.valueOf(iHashCode12))) {
                                n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                            }
                            hlh0.a(bVar7, dVarC16, cVar3);
                            d dVarG3 = j.g(aVar3, 1.0f);
                            aiv aivVarC2 = g75.c(n54Var, false);
                            iHashCode13 = Long.hashCode(l2a.a(bVar7));
                            ne00 ne00VarO17 = bVar7.o();
                            d dVarC17 = c.c(bVar7, dVarG3);
                            bVar7.D();
                            if (bVar7.g()) {
                                bVar7.F(aVar4);
                            } else {
                                bVar7.p();
                            }
                            hlh0.a(bVar7, aivVarC2, bVar4);
                            hlh0.a(bVar7, ne00VarO17, dVar2);
                            if (bVar7.g() || !Intrinsics.g(bVar7.y(), Integer.valueOf(iHashCode13))) {
                                n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                            }
                            hlh0.a(bVar7, dVarC17, cVar3);
                            if ((i12 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objY12 = bVar7.y();
                            if (!z11 || objY12 == c0042a2) {
                                i16 = 0;
                                objY12 = new ywb(function0, 0);
                                bVar7.r(objY12);
                            } else {
                                i16 = 0;
                            }
                            Function0 function0D = mla.d((Function0) objY12, bVar7, i16);
                            m980Var2 = m980Var;
                            if (Intrinsics.g(m980Var2, m980.d.a)) {
                                alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                            } else {
                                alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                            }
                            bVar = bVar7;
                            androidx.compose.runtime.a.C0041a.C0042a c0042a4 = c0042a2;
                            uxsVar2 = uxsVar;
                            aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                            if (uxsVar2 == uxs.DISABLE) {
                                bVar.N(-985848274);
                                d dVarF = androidx.compose.foundation.layout.d.a.f(aVar3);
                                if ((i12 & 112) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                objY13 = bVar.y();
                                if (!z12 || objY13 == c0042a4) {
                                    function7 = function5;
                                    i17 = 0;
                                    objY13 = new zwb(function7, 0);
                                    bVar.r(objY13);
                                } else {
                                    function7 = function5;
                                    i17 = 0;
                                }
                                g75.a(g3w.f(dVarF, true, (Function0) objY13), bVar, i17);
                                bVar.H();
                            } else {
                                function7 = function5;
                                bVar.N(-985624361);
                                bVar.H();
                            }
                            bVar.s();
                            bVar.s();
                            bVar.s();
                        }
                        objY7 = new o43(k4iVar, 1);
                        bVar5.r(objY7);
                        tnp tnpVar4 = new tnp((Function1) objY7, null, null, 62);
                        imf0 imf0VarB4 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                        i12 = i20;
                        soa0 soa0Var4 = new soa0(c68.a(R.color.text_primary, bVar5));
                        d dVarI6 = j.i(j.w(aVar3, 136.0f), 30.0f);
                        if (xlnVar2.b) {
                            i13 = 1369607091;
                            i14 = R.color.border_danger;
                        } else if (f(ytwVar3)) {
                            i13 = 1369610230;
                            i14 = R.color.border_brand_sub;
                        } else {
                            i13 = 1369612822;
                            i14 = R.color.border_secondary;
                        }
                        d dVarH14 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI6, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                        objY8 = bVar5.y();
                        if (objY8 == c0042a) {
                            objY8 = new Function1() { // from class: lxb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    j5i j5iVar = (j5i) obj;
                                    j5iVar.getClass();
                                    ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                                    return Unit.a;
                                }
                            };
                            bVar5.r(objY8);
                        }
                        d dVarH15 = g3w.h(androidx.compose.ui.focus.a.a(dVarH14, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                        if ((i19 & 234881024) == 67108864) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objY9 = bVar5.y();
                        if (z8) {
                            objY9 = new l53(function3, 1);
                            bVar5.r(objY9);
                        } else {
                            objY9 = new l53(function3, 1);
                            bVar5.r(objY9);
                        }
                        ab2.b(str14, (Function1) objY9, dVarH15, false, false, imf0VarB4, gopVar3, tnpVar4, true, 0, 0, null, null, null, soa0Var4, pp8.b(-1403207708, new gaj() { // from class: mxb
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar8;
                                Function2 function8 = (Function2) obj;
                                a aVar9 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                function8.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= aVar9.A(function8) ? 4 : 2;
                                }
                                int i22 = iIntValue;
                                if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                                    aiv aivVarC3 = g75.c(ht.a.f, false);
                                    int iHashCode18 = Long.hashCode(aVar9.m());
                                    ne00 ne00VarO18 = aVar9.o();
                                    d.a aVar10 = d.a.b;
                                    d dVarC18 = c.c(aVar9, aVar10);
                                    yka.k.getClass();
                                    tsr.a aVar11 = yka.a.b;
                                    if (aVar9.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar9.D();
                                    if (aVar9.g()) {
                                        aVar9.F(aVar11);
                                    } else {
                                        aVar9.p();
                                    }
                                    hlh0.a(aVar9, aivVarC3, yka.a.f);
                                    hlh0.a(aVar9, ne00VarO18, yka.a.e);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                        j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                                    }
                                    hlh0.a(aVar9, dVarC18, yka.a.d);
                                    if (kmnVar.c.a.length() == 0) {
                                        aVar9.N(555385627);
                                        imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                        lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                        aVar8 = aVar9;
                                        aVar8.H();
                                    } else {
                                        aVar8 = aVar9;
                                        aVar8.N(555812280);
                                        aVar8.H();
                                    }
                                    ps.a(i22 & 14, aVar8, function8);
                                } else {
                                    aVar9.G();
                                }
                                return Unit.a;
                            }
                        }, bVar5), bVar5, 102236160, 196608, 15896);
                        bVar5.s();
                        bVar5.s();
                        uiText = xlnVar2.c;
                        dVar3 = kw0.b;
                        if (uiText != null) {
                            bVar5.N(1650374506);
                            d dVarI7 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                            d160 d160VarA12 = b160.a(dVar3, bVar6, bVar5, 54);
                            iHashCode14 = Long.hashCode(l2a.a(bVar5));
                            ne00 ne00VarO18 = bVar5.o();
                            d dVarC18 = c.c(bVar5, dVarI7);
                            bVar5.D();
                            if (bVar5.g()) {
                                bVar5.F(aVar4);
                            } else {
                                bVar5.p();
                            }
                            hlh0.a(bVar5, d160VarA12, bVar4);
                            hlh0.a(bVar5, ne00VarO18, dVar2);
                            if (bVar5.g()) {
                                n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                            } else {
                                n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                            }
                            hlh0.a(bVar5, dVarC18, cVar2);
                            lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                            bVar5.s();
                            bVar5.H();
                            c0042a2 = c0042a;
                            bVar6 = bVar6;
                            cVar3 = cVar2;
                            f2 = 8.0f;
                            f = 1.0f;
                        } else {
                            if (z2) {
                                bVar5.N(1651170555);
                                d dVarI8 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                                d160 d160VarA13 = b160.a(dVar3, bVar6, bVar5, 54);
                                iHashCode10 = Long.hashCode(l2a.a(bVar5));
                                ne00 ne00VarO19 = bVar5.o();
                                d dVarC19 = c.c(bVar5, dVarI8);
                                bVar5.D();
                                if (bVar5.g()) {
                                    bVar5.F(aVar4);
                                } else {
                                    bVar5.p();
                                }
                                hlh0.a(bVar5, d160VarA13, bVar4);
                                hlh0.a(bVar5, ne00VarO19, dVar2);
                                if (bVar5.g()) {
                                    n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                                } else {
                                    n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                                }
                                hlh0.a(bVar5, dVarC19, cVar2);
                                lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                                if ((i12 & 896) == 256) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objY10 = bVar5.y();
                                if (z9) {
                                    i15 = 0;
                                    objY10 = new nxb(0, function6);
                                    bVar5.r(objY10);
                                } else {
                                    i15 = 0;
                                    objY10 = new nxb(0, function6);
                                    bVar5.r(objY10);
                                }
                                lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                                i12 = i12;
                                cVar3 = cVar2;
                                c0042a2 = c0042a;
                                f = 1.0f;
                                h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                                bVar5 = bVar5;
                                bVar5.s();
                                bVar5.H();
                            } else {
                                c0042a2 = c0042a;
                                cVar3 = cVar2;
                                f = 1.0f;
                                bVar5.N(1652524604);
                                bVar5.H();
                            }
                            f2 = 8.0f;
                        }
                        ty0.a(bVar5, j.i(aVar3, f2));
                        ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                        d dVarH16 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                        d160 d160VarA14 = b160.a(jVar, bVar6, bVar5, 48);
                        iHashCode11 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO110 = bVar5.o();
                        d dVarC110 = c.c(bVar5, dVarH16);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA14, bVar4);
                        hlh0.a(bVar5, ne00VarO110, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                        } else {
                            n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                        }
                        hlh0.a(bVar5, dVarC110, cVar3);
                        String strA4 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                        if ((i19 & 1879048192) == 536870912) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objY11 = bVar5.y();
                        if (z10) {
                            objY11 = new xwb(function4, 0);
                            bVar5.r(objY11);
                        } else {
                            objY11 = new xwb(function4, 0);
                            bVar5.r(objY11);
                        }
                        bVar7 = bVar5;
                        b(null, strA4, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                        bVar7.s();
                        ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                        d dVarG4 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                        d160 d160VarA15 = b160.a(jVar, bVar6, bVar7, 48);
                        iHashCode12 = Long.hashCode(l2a.a(bVar7));
                        ne00 ne00VarO111 = bVar7.o();
                        d dVarC111 = c.c(bVar7, dVarG4);
                        bVar7.D();
                        if (bVar7.g()) {
                            bVar7.F(aVar4);
                        } else {
                            bVar7.p();
                        }
                        hlh0.a(bVar7, d160VarA15, bVar4);
                        hlh0.a(bVar7, ne00VarO111, dVar2);
                        if (bVar7.g()) {
                            n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                        } else {
                            n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                        }
                        hlh0.a(bVar7, dVarC111, cVar3);
                        d dVarG5 = j.g(aVar3, 1.0f);
                        aiv aivVarC3 = g75.c(n54Var, false);
                        iHashCode13 = Long.hashCode(l2a.a(bVar7));
                        ne00 ne00VarO112 = bVar7.o();
                        d dVarC112 = c.c(bVar7, dVarG5);
                        bVar7.D();
                        if (bVar7.g()) {
                            bVar7.F(aVar4);
                        } else {
                            bVar7.p();
                        }
                        hlh0.a(bVar7, aivVarC3, bVar4);
                        hlh0.a(bVar7, ne00VarO112, dVar2);
                        if (bVar7.g()) {
                            n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                        } else {
                            n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                        }
                        hlh0.a(bVar7, dVarC112, cVar3);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objY12 = bVar7.y();
                        if (z11) {
                            i16 = 0;
                            objY12 = new ywb(function0, 0);
                            bVar7.r(objY12);
                        } else {
                            i16 = 0;
                            objY12 = new ywb(function0, 0);
                            bVar7.r(objY12);
                        }
                        Function0 function0D2 = mla.d((Function0) objY12, bVar7, i16);
                        m980Var2 = m980Var;
                        if (Intrinsics.g(m980Var2, m980.d.a)) {
                            alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                        } else {
                            alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                        }
                        bVar = bVar7;
                        androidx.compose.runtime.a.C0041a.C0042a c0042a5 = c0042a2;
                        uxsVar2 = uxsVar;
                        aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D2, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                        if (uxsVar2 == uxs.DISABLE) {
                            bVar.N(-985848274);
                            d dVarF2 = androidx.compose.foundation.layout.d.a.f(aVar3);
                            if ((i12 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objY13 = bVar.y();
                            if (z12) {
                                function7 = function5;
                                i17 = 0;
                                objY13 = new zwb(function7, 0);
                                bVar.r(objY13);
                            } else {
                                function7 = function5;
                                i17 = 0;
                                objY13 = new zwb(function7, 0);
                                bVar.r(objY13);
                            }
                            g75.a(g3w.f(dVarF2, true, (Function0) objY13), bVar, i17);
                            bVar.H();
                        } else {
                            function7 = function5;
                            bVar.N(-985624361);
                            bVar.H();
                        }
                        bVar.s();
                        bVar.s();
                        bVar.s();
                    }
                    jA2 = dr2.a(i10, i11, bVar10, bVar10);
                    d dVarH17 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI2, 1.0f, jA2, j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2);
                    objY5 = bVar10.y();
                    if (objY5 == c0042a3) {
                        objY5 = new ixb(ytwVar2, 0);
                        bVar10.r(objY5);
                    }
                    d dVarH18 = g3w.h(androidx.compose.ui.focus.a.a(dVarH17, (Function1) objY5), "auto_bet_create_max_odds_input");
                    if ((29360128 & i19) == 8388608) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objY6 = bVar10.y();
                    if (z7) {
                        objY6 = new Function1() { // from class: jxb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String str15 = (String) obj;
                                str15.getClass();
                                if (str15.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str15)) {
                                    function2.invoke(str15);
                                }
                                return Unit.a;
                            }
                        };
                        bVar10.r(objY6);
                    } else {
                        objY6 = new Function1() { // from class: jxb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String str15 = (String) obj;
                                str15.getClass();
                                if (str15.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str15)) {
                                    function2.invoke(str15);
                                }
                                return Unit.a;
                            }
                        };
                        bVar10.r(objY6);
                    }
                    ab2.b(str13, (Function1) objY6, dVarH18, false, false, imf0VarB2, gopVar2, tnpVar2, true, 0, 0, null, null, null, soa0Var2, pp8.b(1547738330, new gaj() { // from class: kxb
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Function2 function8 = (Function2) obj;
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function8.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar8.A(function8) ? 4 : 2;
                            }
                            int i22 = iIntValue;
                            if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                                aiv aivVarC4 = g75.c(ht.a.f, false);
                                int iHashCode18 = Long.hashCode(aVar8.m());
                                ne00 ne00VarO113 = aVar8.o();
                                d.a aVar9 = d.a.b;
                                d dVarC113 = c.c(aVar8, aVar9);
                                yka.k.getClass();
                                tsr.a aVar10 = yka.a.b;
                                if (aVar8.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar8.D();
                                if (aVar8.g()) {
                                    aVar8.F(aVar10);
                                } else {
                                    aVar8.p();
                                }
                                hlh0.a(aVar8, aivVarC4, yka.a.f);
                                hlh0.a(aVar8, ne00VarO113, yka.a.e);
                                yka.a.C1350a c1350a3 = yka.a.g;
                                if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                                    j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                                }
                                hlh0.a(aVar8, dVarC113, yka.a.d);
                                if (kmnVar.b.a.length() == 0) {
                                    aVar8.N(-1590042406);
                                    lkf0.d(cb40.a(R.string.component_betslip__max, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                                    aVar8 = aVar8;
                                    aVar8.H();
                                } else {
                                    aVar8.N(-1589574430);
                                    aVar8.H();
                                }
                                ps.a(i22 & 14, aVar8, function8);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVar10), bVar10, 102236160, 196608, 15896);
                    bVar10.s();
                    bVar10.s();
                    bVar5 = bVar10;
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar5, 48, 1);
                    d dVarH19 = g3w.h(h.i(j.g(aVar3, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                    bVar6 = bVar12;
                    d160 d160VarA16 = b160.a(gVar3, bVar6, bVar5, 54);
                    iHashCode7 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO113 = bVar5.o();
                    d dVarC113 = c.c(bVar5, dVarH19);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA16, bVar4);
                    hlh0.a(bVar5, ne00VarO113, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
                    } else {
                        n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
                    }
                    hlh0.a(bVar5, dVarC113, cVar2);
                    i78 i78VarA5 = g78.a(kVar, aVar6, bVar5, 0);
                    iHashCode8 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO114 = bVar5.o();
                    d dVarC114 = c.c(bVar5, aVar3);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, i78VarA5, bVar4);
                    hlh0.a(bVar5, ne00VarO114, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                    } else {
                        n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                    }
                    hlh0.a(bVar5, dVarC114, cVar2);
                    lkf0.d(cb40.a(R.string.common_functions__stake, new Object[0], bVar5), g3w.h(aVar3, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar5), bVar5, 48, 0, 131064);
                    lkf0.d(str9, g3w.h(aVar3, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, ((i20 >> 9) & 14) | 48, 0, 131064);
                    bVar5.s();
                    d160 d160VarA17 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar6, bVar5, 54);
                    iHashCode9 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO115 = bVar5.o();
                    d dVarC115 = c.c(bVar5, aVar3);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA17, bVar4);
                    hlh0.a(bVar5, ne00VarO115, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
                    } else {
                        n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
                    }
                    hlh0.a(bVar5, dVarC115, cVar2);
                    lkf0.d(str5, g3w.h(aVar3, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, ((i18 >> 15) & 14) | 48, 0, 131064);
                    String str15 = xlnVar2.a;
                    gop gopVar4 = new gop(3, 7, 115);
                    zA = bVar5.A(k4iVar);
                    objY7 = bVar5.y();
                    if (zA) {
                        c0042a = c0042a3;
                        if (objY7 == c0042a) {
                        }
                        tnp tnpVar5 = new tnp((Function1) objY7, null, null, 62);
                        imf0 imf0VarB5 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                        i12 = i20;
                        soa0 soa0Var5 = new soa0(c68.a(R.color.text_primary, bVar5));
                        d dVarI9 = j.i(j.w(aVar3, 136.0f), 30.0f);
                        if (xlnVar2.b) {
                            i13 = 1369607091;
                            i14 = R.color.border_danger;
                        } else if (f(ytwVar3)) {
                            i13 = 1369610230;
                            i14 = R.color.border_brand_sub;
                        } else {
                            i13 = 1369612822;
                            i14 = R.color.border_secondary;
                        }
                        d dVarH110 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI9, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                        objY8 = bVar5.y();
                        if (objY8 == c0042a) {
                            objY8 = new Function1() { // from class: lxb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    j5i j5iVar = (j5i) obj;
                                    j5iVar.getClass();
                                    ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                                    return Unit.a;
                                }
                            };
                            bVar5.r(objY8);
                        }
                        d dVarH111 = g3w.h(androidx.compose.ui.focus.a.a(dVarH110, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                        if ((i19 & 234881024) == 67108864) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objY9 = bVar5.y();
                        if (z8) {
                            objY9 = new l53(function3, 1);
                            bVar5.r(objY9);
                        } else {
                            objY9 = new l53(function3, 1);
                            bVar5.r(objY9);
                        }
                        ab2.b(str15, (Function1) objY9, dVarH111, false, false, imf0VarB5, gopVar4, tnpVar5, true, 0, 0, null, null, null, soa0Var5, pp8.b(-1403207708, new gaj() { // from class: mxb
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                a aVar8;
                                Function2 function8 = (Function2) obj;
                                a aVar9 = (a) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                function8.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= aVar9.A(function8) ? 4 : 2;
                                }
                                int i22 = iIntValue;
                                if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                                    aiv aivVarC4 = g75.c(ht.a.f, false);
                                    int iHashCode18 = Long.hashCode(aVar9.m());
                                    ne00 ne00VarO116 = aVar9.o();
                                    d.a aVar10 = d.a.b;
                                    d dVarC116 = c.c(aVar9, aVar10);
                                    yka.k.getClass();
                                    tsr.a aVar11 = yka.a.b;
                                    if (aVar9.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar9.D();
                                    if (aVar9.g()) {
                                        aVar9.F(aVar11);
                                    } else {
                                        aVar9.p();
                                    }
                                    hlh0.a(aVar9, aivVarC4, yka.a.f);
                                    hlh0.a(aVar9, ne00VarO116, yka.a.e);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                        j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                                    }
                                    hlh0.a(aVar9, dVarC116, yka.a.d);
                                    if (kmnVar.c.a.length() == 0) {
                                        aVar9.N(555385627);
                                        imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                        lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                        aVar8 = aVar9;
                                        aVar8.H();
                                    } else {
                                        aVar8 = aVar9;
                                        aVar8.N(555812280);
                                        aVar8.H();
                                    }
                                    ps.a(i22 & 14, aVar8, function8);
                                } else {
                                    aVar9.G();
                                }
                                return Unit.a;
                            }
                        }, bVar5), bVar5, 102236160, 196608, 15896);
                        bVar5.s();
                        bVar5.s();
                        uiText = xlnVar2.c;
                        dVar3 = kw0.b;
                        if (uiText != null) {
                            bVar5.N(1650374506);
                            d dVarI10 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                            d160 d160VarA18 = b160.a(dVar3, bVar6, bVar5, 54);
                            iHashCode14 = Long.hashCode(l2a.a(bVar5));
                            ne00 ne00VarO116 = bVar5.o();
                            d dVarC116 = c.c(bVar5, dVarI10);
                            bVar5.D();
                            if (bVar5.g()) {
                                bVar5.F(aVar4);
                            } else {
                                bVar5.p();
                            }
                            hlh0.a(bVar5, d160VarA18, bVar4);
                            hlh0.a(bVar5, ne00VarO116, dVar2);
                            if (bVar5.g()) {
                                n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                            } else {
                                n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                            }
                            hlh0.a(bVar5, dVarC116, cVar2);
                            lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                            bVar5.s();
                            bVar5.H();
                            c0042a2 = c0042a;
                            bVar6 = bVar6;
                            cVar3 = cVar2;
                            f2 = 8.0f;
                            f = 1.0f;
                        } else {
                            if (z2) {
                                bVar5.N(1651170555);
                                d dVarI11 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                                d160 d160VarA19 = b160.a(dVar3, bVar6, bVar5, 54);
                                iHashCode10 = Long.hashCode(l2a.a(bVar5));
                                ne00 ne00VarO117 = bVar5.o();
                                d dVarC117 = c.c(bVar5, dVarI11);
                                bVar5.D();
                                if (bVar5.g()) {
                                    bVar5.F(aVar4);
                                } else {
                                    bVar5.p();
                                }
                                hlh0.a(bVar5, d160VarA19, bVar4);
                                hlh0.a(bVar5, ne00VarO117, dVar2);
                                if (bVar5.g()) {
                                    n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                                } else {
                                    n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                                }
                                hlh0.a(bVar5, dVarC117, cVar2);
                                lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                                if ((i12 & 896) == 256) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objY10 = bVar5.y();
                                if (z9) {
                                    i15 = 0;
                                    objY10 = new nxb(0, function6);
                                    bVar5.r(objY10);
                                } else {
                                    i15 = 0;
                                    objY10 = new nxb(0, function6);
                                    bVar5.r(objY10);
                                }
                                lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                                i12 = i12;
                                cVar3 = cVar2;
                                c0042a2 = c0042a;
                                f = 1.0f;
                                h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                                bVar5 = bVar5;
                                bVar5.s();
                                bVar5.H();
                            } else {
                                c0042a2 = c0042a;
                                cVar3 = cVar2;
                                f = 1.0f;
                                bVar5.N(1652524604);
                                bVar5.H();
                            }
                            f2 = 8.0f;
                        }
                        ty0.a(bVar5, j.i(aVar3, f2));
                        ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                        d dVarH112 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                        d160 d160VarA110 = b160.a(jVar, bVar6, bVar5, 48);
                        iHashCode11 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO118 = bVar5.o();
                        d dVarC118 = c.c(bVar5, dVarH112);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA110, bVar4);
                        hlh0.a(bVar5, ne00VarO118, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                        } else {
                            n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                        }
                        hlh0.a(bVar5, dVarC118, cVar3);
                        String strA5 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                        if ((i19 & 1879048192) == 536870912) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objY11 = bVar5.y();
                        if (z10) {
                            objY11 = new xwb(function4, 0);
                            bVar5.r(objY11);
                        } else {
                            objY11 = new xwb(function4, 0);
                            bVar5.r(objY11);
                        }
                        bVar7 = bVar5;
                        b(null, strA5, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                        bVar7.s();
                        ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                        d dVarG6 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                        d160 d160VarA111 = b160.a(jVar, bVar6, bVar7, 48);
                        iHashCode12 = Long.hashCode(l2a.a(bVar7));
                        ne00 ne00VarO119 = bVar7.o();
                        d dVarC119 = c.c(bVar7, dVarG6);
                        bVar7.D();
                        if (bVar7.g()) {
                            bVar7.F(aVar4);
                        } else {
                            bVar7.p();
                        }
                        hlh0.a(bVar7, d160VarA111, bVar4);
                        hlh0.a(bVar7, ne00VarO119, dVar2);
                        if (bVar7.g()) {
                            n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                        } else {
                            n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                        }
                        hlh0.a(bVar7, dVarC119, cVar3);
                        d dVarG7 = j.g(aVar3, 1.0f);
                        aiv aivVarC4 = g75.c(n54Var, false);
                        iHashCode13 = Long.hashCode(l2a.a(bVar7));
                        ne00 ne00VarO1110 = bVar7.o();
                        d dVarC1110 = c.c(bVar7, dVarG7);
                        bVar7.D();
                        if (bVar7.g()) {
                            bVar7.F(aVar4);
                        } else {
                            bVar7.p();
                        }
                        hlh0.a(bVar7, aivVarC4, bVar4);
                        hlh0.a(bVar7, ne00VarO1110, dVar2);
                        if (bVar7.g()) {
                            n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                        } else {
                            n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                        }
                        hlh0.a(bVar7, dVarC1110, cVar3);
                        if ((i12 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objY12 = bVar7.y();
                        if (z11) {
                            i16 = 0;
                            objY12 = new ywb(function0, 0);
                            bVar7.r(objY12);
                        } else {
                            i16 = 0;
                            objY12 = new ywb(function0, 0);
                            bVar7.r(objY12);
                        }
                        Function0 function0D3 = mla.d((Function0) objY12, bVar7, i16);
                        m980Var2 = m980Var;
                        if (Intrinsics.g(m980Var2, m980.d.a)) {
                            alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                        } else {
                            alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                        }
                        bVar = bVar7;
                        androidx.compose.runtime.a.C0041a.C0042a c0042a6 = c0042a2;
                        uxsVar2 = uxsVar;
                        aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D3, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                        if (uxsVar2 == uxs.DISABLE) {
                            bVar.N(-985848274);
                            d dVarF3 = androidx.compose.foundation.layout.d.a.f(aVar3);
                            if ((i12 & 112) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objY13 = bVar.y();
                            if (z12) {
                                function7 = function5;
                                i17 = 0;
                                objY13 = new zwb(function7, 0);
                                bVar.r(objY13);
                            } else {
                                function7 = function5;
                                i17 = 0;
                                objY13 = new zwb(function7, 0);
                                bVar.r(objY13);
                            }
                            g75.a(g3w.f(dVarF3, true, (Function0) objY13), bVar, i17);
                            bVar.H();
                        } else {
                            function7 = function5;
                            bVar.N(-985624361);
                            bVar.H();
                        }
                        bVar.s();
                        bVar.s();
                        bVar.s();
                    } else {
                        c0042a = c0042a3;
                    }
                    objY7 = new o43(k4iVar, 1);
                    bVar5.r(objY7);
                    tnp tnpVar6 = new tnp((Function1) objY7, null, null, 62);
                    imf0 imf0VarB6 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                    i12 = i20;
                    soa0 soa0Var6 = new soa0(c68.a(R.color.text_primary, bVar5));
                    d dVarI12 = j.i(j.w(aVar3, 136.0f), 30.0f);
                    if (xlnVar2.b) {
                        i13 = 1369607091;
                        i14 = R.color.border_danger;
                    } else if (f(ytwVar3)) {
                        i13 = 1369610230;
                        i14 = R.color.border_brand_sub;
                    } else {
                        i13 = 1369612822;
                        i14 = R.color.border_secondary;
                    }
                    d dVarH113 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI12, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                    objY8 = bVar5.y();
                    if (objY8 == c0042a) {
                        objY8 = new Function1() { // from class: lxb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                j5i j5iVar = (j5i) obj;
                                j5iVar.getClass();
                                ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                                return Unit.a;
                            }
                        };
                        bVar5.r(objY8);
                    }
                    d dVarH114 = g3w.h(androidx.compose.ui.focus.a.a(dVarH113, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                    if ((i19 & 234881024) == 67108864) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objY9 = bVar5.y();
                    if (z8) {
                        objY9 = new l53(function3, 1);
                        bVar5.r(objY9);
                    } else {
                        objY9 = new l53(function3, 1);
                        bVar5.r(objY9);
                    }
                    ab2.b(str15, (Function1) objY9, dVarH114, false, false, imf0VarB6, gopVar4, tnpVar6, true, 0, 0, null, null, null, soa0Var6, pp8.b(-1403207708, new gaj() { // from class: mxb
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar8;
                            Function2 function8 = (Function2) obj;
                            a aVar9 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function8.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar9.A(function8) ? 4 : 2;
                            }
                            int i22 = iIntValue;
                            if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                                aiv aivVarC5 = g75.c(ht.a.f, false);
                                int iHashCode18 = Long.hashCode(aVar9.m());
                                ne00 ne00VarO1111 = aVar9.o();
                                d.a aVar10 = d.a.b;
                                d dVarC1111 = c.c(aVar9, aVar10);
                                yka.k.getClass();
                                tsr.a aVar11 = yka.a.b;
                                if (aVar9.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar9.D();
                                if (aVar9.g()) {
                                    aVar9.F(aVar11);
                                } else {
                                    aVar9.p();
                                }
                                hlh0.a(aVar9, aivVarC5, yka.a.f);
                                hlh0.a(aVar9, ne00VarO1111, yka.a.e);
                                yka.a.C1350a c1350a3 = yka.a.g;
                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                    j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                                }
                                hlh0.a(aVar9, dVarC1111, yka.a.d);
                                if (kmnVar.c.a.length() == 0) {
                                    aVar9.N(555385627);
                                    imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                    lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                    aVar8 = aVar9;
                                    aVar8.H();
                                } else {
                                    aVar8 = aVar9;
                                    aVar8.N(555812280);
                                    aVar8.H();
                                }
                                ps.a(i22 & 14, aVar8, function8);
                            } else {
                                aVar9.G();
                            }
                            return Unit.a;
                        }
                    }, bVar5), bVar5, 102236160, 196608, 15896);
                    bVar5.s();
                    bVar5.s();
                    uiText = xlnVar2.c;
                    dVar3 = kw0.b;
                    if (uiText != null) {
                        bVar5.N(1650374506);
                        d dVarI13 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA112 = b160.a(dVar3, bVar6, bVar5, 54);
                        iHashCode14 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO1111 = bVar5.o();
                        d dVarC1111 = c.c(bVar5, dVarI13);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA112, bVar4);
                        hlh0.a(bVar5, ne00VarO1111, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                        } else {
                            n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                        }
                        hlh0.a(bVar5, dVarC1111, cVar2);
                        lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                        bVar5.s();
                        bVar5.H();
                        c0042a2 = c0042a;
                        bVar6 = bVar6;
                        cVar3 = cVar2;
                        f2 = 8.0f;
                        f = 1.0f;
                    } else {
                        if (z2) {
                            bVar5.N(1651170555);
                            d dVarI14 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                            d160 d160VarA113 = b160.a(dVar3, bVar6, bVar5, 54);
                            iHashCode10 = Long.hashCode(l2a.a(bVar5));
                            ne00 ne00VarO1112 = bVar5.o();
                            d dVarC1112 = c.c(bVar5, dVarI14);
                            bVar5.D();
                            if (bVar5.g()) {
                                bVar5.F(aVar4);
                            } else {
                                bVar5.p();
                            }
                            hlh0.a(bVar5, d160VarA113, bVar4);
                            hlh0.a(bVar5, ne00VarO1112, dVar2);
                            if (bVar5.g()) {
                                n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                            } else {
                                n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                            }
                            hlh0.a(bVar5, dVarC1112, cVar2);
                            lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                            if ((i12 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objY10 = bVar5.y();
                            if (z9) {
                                i15 = 0;
                                objY10 = new nxb(0, function6);
                                bVar5.r(objY10);
                            } else {
                                i15 = 0;
                                objY10 = new nxb(0, function6);
                                bVar5.r(objY10);
                            }
                            lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                            i12 = i12;
                            cVar3 = cVar2;
                            c0042a2 = c0042a;
                            f = 1.0f;
                            h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                            bVar5 = bVar5;
                            bVar5.s();
                            bVar5.H();
                        } else {
                            c0042a2 = c0042a;
                            cVar3 = cVar2;
                            f = 1.0f;
                            bVar5.N(1652524604);
                            bVar5.H();
                        }
                        f2 = 8.0f;
                    }
                    ty0.a(bVar5, j.i(aVar3, f2));
                    ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                    d dVarH115 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                    d160 d160VarA114 = b160.a(jVar, bVar6, bVar5, 48);
                    iHashCode11 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO1113 = bVar5.o();
                    d dVarC1113 = c.c(bVar5, dVarH115);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA114, bVar4);
                    hlh0.a(bVar5, ne00VarO1113, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                    } else {
                        n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                    }
                    hlh0.a(bVar5, dVarC1113, cVar3);
                    String strA6 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                    if ((i19 & 1879048192) == 536870912) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objY11 = bVar5.y();
                    if (z10) {
                        objY11 = new xwb(function4, 0);
                        bVar5.r(objY11);
                    } else {
                        objY11 = new xwb(function4, 0);
                        bVar5.r(objY11);
                    }
                    bVar7 = bVar5;
                    b(null, strA6, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                    bVar7.s();
                    ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                    d dVarG8 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                    d160 d160VarA115 = b160.a(jVar, bVar6, bVar7, 48);
                    iHashCode12 = Long.hashCode(l2a.a(bVar7));
                    ne00 ne00VarO1114 = bVar7.o();
                    d dVarC1114 = c.c(bVar7, dVarG8);
                    bVar7.D();
                    if (bVar7.g()) {
                        bVar7.F(aVar4);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, d160VarA115, bVar4);
                    hlh0.a(bVar7, ne00VarO1114, dVar2);
                    if (bVar7.g()) {
                        n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                    } else {
                        n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                    }
                    hlh0.a(bVar7, dVarC1114, cVar3);
                    d dVarG9 = j.g(aVar3, 1.0f);
                    aiv aivVarC5 = g75.c(n54Var, false);
                    iHashCode13 = Long.hashCode(l2a.a(bVar7));
                    ne00 ne00VarO1115 = bVar7.o();
                    d dVarC1115 = c.c(bVar7, dVarG9);
                    bVar7.D();
                    if (bVar7.g()) {
                        bVar7.F(aVar4);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, aivVarC5, bVar4);
                    hlh0.a(bVar7, ne00VarO1115, dVar2);
                    if (bVar7.g()) {
                        n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                    } else {
                        n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                    }
                    hlh0.a(bVar7, dVarC1115, cVar3);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objY12 = bVar7.y();
                    if (z11) {
                        i16 = 0;
                        objY12 = new ywb(function0, 0);
                        bVar7.r(objY12);
                    } else {
                        i16 = 0;
                        objY12 = new ywb(function0, 0);
                        bVar7.r(objY12);
                    }
                    Function0 function0D4 = mla.d((Function0) objY12, bVar7, i16);
                    m980Var2 = m980Var;
                    if (Intrinsics.g(m980Var2, m980.d.a)) {
                        alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                    } else {
                        alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                    }
                    bVar = bVar7;
                    androidx.compose.runtime.a.C0041a.C0042a c0042a7 = c0042a2;
                    uxsVar2 = uxsVar;
                    aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D4, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                    if (uxsVar2 == uxs.DISABLE) {
                        bVar.N(-985848274);
                        d dVarF4 = androidx.compose.foundation.layout.d.a.f(aVar3);
                        if ((i12 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objY13 = bVar.y();
                        if (z12) {
                            function7 = function5;
                            i17 = 0;
                            objY13 = new zwb(function7, 0);
                            bVar.r(objY13);
                        } else {
                            function7 = function5;
                            i17 = 0;
                            objY13 = new zwb(function7, 0);
                            bVar.r(objY13);
                        }
                        g75.a(g3w.f(dVarF4, true, (Function0) objY13), bVar, i17);
                        bVar.H();
                    } else {
                        function7 = function5;
                        bVar.N(-985624361);
                        bVar.H();
                    }
                    bVar.s();
                    bVar.s();
                    bVar.s();
                }
                jA = dr2.a(i9, i8, bVar10, bVar10);
                d dVarH20 = h.h(d35.a(dVarI, 1.0f, jA, j060.c(2.0f)), 5.0f, 0.0f, 2);
                objY2 = bVar10.y();
                if (objY2 == c0042a3) {
                    objY2 = new cxb(ytwVar, 0);
                    bVar10.r(objY2);
                }
                d dVarH21 = g3w.h(androidx.compose.ui.focus.a.a(dVarH20, (Function1) objY2), "auto_bet_create_min_odds_input");
                if ((3670016 & i19) == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objY3 = bVar10.y();
                if (z6) {
                    objY3 = new dxb(function1, 0);
                    bVar10.r(objY3);
                } else {
                    objY3 = new dxb(function1, 0);
                    bVar10.r(objY3);
                }
                ab2.b(str12, (Function1) objY3, dVarH21, false, false, imf0VarB, gopVar, tnpVar, true, 0, 0, null, null, null, soa0Var, pp8.b(1828570979, new gaj() { // from class: wwb
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Function2 function8 = (Function2) obj;
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function8.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar8.A(function8) ? 4 : 2;
                        }
                        int i22 = iIntValue;
                        if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                            aiv aivVarC6 = g75.c(ht.a.f, false);
                            int iHashCode18 = Long.hashCode(aVar8.m());
                            ne00 ne00VarO120 = aVar8.o();
                            d.a aVar9 = d.a.b;
                            d dVarC120 = c.c(aVar8, aVar9);
                            yka.k.getClass();
                            tsr.a aVar10 = yka.a.b;
                            if (aVar8.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar8.D();
                            if (aVar8.g()) {
                                aVar8.F(aVar10);
                            } else {
                                aVar8.p();
                            }
                            hlh0.a(aVar8, aivVarC6, yka.a.f);
                            hlh0.a(aVar8, ne00VarO120, yka.a.e);
                            yka.a.C1350a c1350a3 = yka.a.g;
                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                                j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                            }
                            hlh0.a(aVar8, dVarC120, yka.a.d);
                            if (kmnVar.a.a.length() == 0) {
                                aVar8.N(-1807621071);
                                lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                                aVar8 = aVar8;
                                aVar8.H();
                            } else {
                                aVar8.N(-1807153095);
                                aVar8.H();
                            }
                            ps.a(i22 & 14, aVar8, function8);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVar10), bVar10, 102236160, 196608, 15896);
                lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, 6, 0, 131066);
                String str16 = xlnVar.a;
                gop gopVar5 = new gop(3, 6, 115);
                objY4 = bVar10.y();
                if (objY4 == c0042a3) {
                    b5iVar2 = b5iVar4;
                    objY4 = new Function1() { // from class: hxb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((snp) obj).getClass();
                            b5i.b(b5iVar2);
                            return Unit.a;
                        }
                    };
                    bVar10.r(objY4);
                } else {
                    b5iVar2 = r52;
                }
                tnp tnpVar7 = new tnp(null, (Function1) objY4, null, 59);
                imf0 imf0VarB7 = imf0.b(mla.l(R.style.B1_M, bVar10), c68.a(R.color.text_primary, bVar10), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var7 = new soa0(c68.a(R.color.text_primary, bVar10));
                d dVarI15 = j.i(j.w(aVar3, 76.0f), 30.0f);
                if (xlnVar.b) {
                    i10 = 1847655986;
                    i11 = R.color.border_danger;
                    jA2 = dr2.a(i10, i11, bVar10, bVar10);
                } else {
                    i10 = 1847655986;
                    i11 = R.color.border_danger;
                    jA2 = dr2.a(i10, i11, bVar10, bVar10);
                }
                d dVarH116 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI15, 1.0f, jA2, j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2);
                objY5 = bVar10.y();
                if (objY5 == c0042a3) {
                    objY5 = new ixb(ytwVar2, 0);
                    bVar10.r(objY5);
                }
                d dVarH117 = g3w.h(androidx.compose.ui.focus.a.a(dVarH116, (Function1) objY5), "auto_bet_create_max_odds_input");
                if ((29360128 & i19) == 8388608) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objY6 = bVar10.y();
                if (z7) {
                    objY6 = new Function1() { // from class: jxb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str17 = (String) obj;
                            str17.getClass();
                            if (str17.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str17)) {
                                function2.invoke(str17);
                            }
                            return Unit.a;
                        }
                    };
                    bVar10.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: jxb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str17 = (String) obj;
                            str17.getClass();
                            if (str17.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str17)) {
                                function2.invoke(str17);
                            }
                            return Unit.a;
                        }
                    };
                    bVar10.r(objY6);
                }
                ab2.b(str16, (Function1) objY6, dVarH117, false, false, imf0VarB7, gopVar5, tnpVar7, true, 0, 0, null, null, null, soa0Var7, pp8.b(1547738330, new gaj() { // from class: kxb
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Function2 function8 = (Function2) obj;
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function8.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar8.A(function8) ? 4 : 2;
                        }
                        int i22 = iIntValue;
                        if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                            aiv aivVarC6 = g75.c(ht.a.f, false);
                            int iHashCode18 = Long.hashCode(aVar8.m());
                            ne00 ne00VarO1116 = aVar8.o();
                            d.a aVar9 = d.a.b;
                            d dVarC1116 = c.c(aVar8, aVar9);
                            yka.k.getClass();
                            tsr.a aVar10 = yka.a.b;
                            if (aVar8.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar8.D();
                            if (aVar8.g()) {
                                aVar8.F(aVar10);
                            } else {
                                aVar8.p();
                            }
                            hlh0.a(aVar8, aivVarC6, yka.a.f);
                            hlh0.a(aVar8, ne00VarO1116, yka.a.e);
                            yka.a.C1350a c1350a3 = yka.a.g;
                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                                j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                            }
                            hlh0.a(aVar8, dVarC1116, yka.a.d);
                            if (kmnVar.b.a.length() == 0) {
                                aVar8.N(-1590042406);
                                lkf0.d(cb40.a(R.string.component_betslip__max, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                                aVar8 = aVar8;
                                aVar8.H();
                            } else {
                                aVar8.N(-1589574430);
                                aVar8.H();
                            }
                            ps.a(i22 & 14, aVar8, function8);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVar10), bVar10, 102236160, 196608, 15896);
                bVar10.s();
                bVar10.s();
                bVar5 = bVar10;
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar5, 48, 1);
                d dVarH118 = g3w.h(h.i(j.g(aVar3, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                bVar6 = bVar12;
                d160 d160VarA116 = b160.a(gVar3, bVar6, bVar5, 54);
                iHashCode7 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO1116 = bVar5.o();
                d dVarC1116 = c.c(bVar5, dVarH118);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, d160VarA116, bVar4);
                hlh0.a(bVar5, ne00VarO1116, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
                } else {
                    n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
                }
                hlh0.a(bVar5, dVarC1116, cVar2);
                i78 i78VarA6 = g78.a(kVar, aVar6, bVar5, 0);
                iHashCode8 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO1117 = bVar5.o();
                d dVarC1117 = c.c(bVar5, aVar3);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, i78VarA6, bVar4);
                hlh0.a(bVar5, ne00VarO1117, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                } else {
                    n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
                }
                hlh0.a(bVar5, dVarC1117, cVar2);
                lkf0.d(cb40.a(R.string.common_functions__stake, new Object[0], bVar5), g3w.h(aVar3, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar5), bVar5, 48, 0, 131064);
                lkf0.d(str9, g3w.h(aVar3, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, ((i20 >> 9) & 14) | 48, 0, 131064);
                bVar5.s();
                d160 d160VarA117 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar6, bVar5, 54);
                iHashCode9 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO1118 = bVar5.o();
                d dVarC1118 = c.c(bVar5, aVar3);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, d160VarA117, bVar4);
                hlh0.a(bVar5, ne00VarO1118, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
                } else {
                    n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
                }
                hlh0.a(bVar5, dVarC1118, cVar2);
                lkf0.d(str5, g3w.h(aVar3, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, ((i18 >> 15) & 14) | 48, 0, 131064);
                String str17 = xlnVar2.a;
                gop gopVar6 = new gop(3, 7, 115);
                zA = bVar5.A(k4iVar);
                objY7 = bVar5.y();
                if (zA) {
                    c0042a = c0042a3;
                    if (objY7 == c0042a) {
                    }
                    tnp tnpVar8 = new tnp((Function1) objY7, null, null, 62);
                    imf0 imf0VarB8 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                    i12 = i20;
                    soa0 soa0Var8 = new soa0(c68.a(R.color.text_primary, bVar5));
                    d dVarI16 = j.i(j.w(aVar3, 136.0f), 30.0f);
                    if (xlnVar2.b) {
                        i13 = 1369607091;
                        i14 = R.color.border_danger;
                    } else if (f(ytwVar3)) {
                        i13 = 1369610230;
                        i14 = R.color.border_brand_sub;
                    } else {
                        i13 = 1369612822;
                        i14 = R.color.border_secondary;
                    }
                    d dVarH119 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI16, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                    objY8 = bVar5.y();
                    if (objY8 == c0042a) {
                        objY8 = new Function1() { // from class: lxb
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                j5i j5iVar = (j5i) obj;
                                j5iVar.getClass();
                                ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                                return Unit.a;
                            }
                        };
                        bVar5.r(objY8);
                    }
                    d dVarH1110 = g3w.h(androidx.compose.ui.focus.a.a(dVarH119, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                    if ((i19 & 234881024) == 67108864) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objY9 = bVar5.y();
                    if (z8) {
                        objY9 = new l53(function3, 1);
                        bVar5.r(objY9);
                    } else {
                        objY9 = new l53(function3, 1);
                        bVar5.r(objY9);
                    }
                    ab2.b(str17, (Function1) objY9, dVarH1110, false, false, imf0VarB8, gopVar6, tnpVar8, true, 0, 0, null, null, null, soa0Var8, pp8.b(-1403207708, new gaj() { // from class: mxb
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar8;
                            Function2 function8 = (Function2) obj;
                            a aVar9 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function8.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar9.A(function8) ? 4 : 2;
                            }
                            int i22 = iIntValue;
                            if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                                aiv aivVarC6 = g75.c(ht.a.f, false);
                                int iHashCode18 = Long.hashCode(aVar9.m());
                                ne00 ne00VarO1119 = aVar9.o();
                                d.a aVar10 = d.a.b;
                                d dVarC1119 = c.c(aVar9, aVar10);
                                yka.k.getClass();
                                tsr.a aVar11 = yka.a.b;
                                if (aVar9.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar9.D();
                                if (aVar9.g()) {
                                    aVar9.F(aVar11);
                                } else {
                                    aVar9.p();
                                }
                                hlh0.a(aVar9, aivVarC6, yka.a.f);
                                hlh0.a(aVar9, ne00VarO1119, yka.a.e);
                                yka.a.C1350a c1350a3 = yka.a.g;
                                if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                    j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                                }
                                hlh0.a(aVar9, dVarC1119, yka.a.d);
                                if (kmnVar.c.a.length() == 0) {
                                    aVar9.N(555385627);
                                    imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                    lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                    aVar8 = aVar9;
                                    aVar8.H();
                                } else {
                                    aVar8 = aVar9;
                                    aVar8.N(555812280);
                                    aVar8.H();
                                }
                                ps.a(i22 & 14, aVar8, function8);
                            } else {
                                aVar9.G();
                            }
                            return Unit.a;
                        }
                    }, bVar5), bVar5, 102236160, 196608, 15896);
                    bVar5.s();
                    bVar5.s();
                    uiText = xlnVar2.c;
                    dVar3 = kw0.b;
                    if (uiText != null) {
                        bVar5.N(1650374506);
                        d dVarI17 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA118 = b160.a(dVar3, bVar6, bVar5, 54);
                        iHashCode14 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO1119 = bVar5.o();
                        d dVarC1119 = c.c(bVar5, dVarI17);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA118, bVar4);
                        hlh0.a(bVar5, ne00VarO1119, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                        } else {
                            n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                        }
                        hlh0.a(bVar5, dVarC1119, cVar2);
                        lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                        bVar5.s();
                        bVar5.H();
                        c0042a2 = c0042a;
                        bVar6 = bVar6;
                        cVar3 = cVar2;
                        f2 = 8.0f;
                        f = 1.0f;
                    } else {
                        if (z2) {
                            bVar5.N(1651170555);
                            d dVarI18 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                            d160 d160VarA119 = b160.a(dVar3, bVar6, bVar5, 54);
                            iHashCode10 = Long.hashCode(l2a.a(bVar5));
                            ne00 ne00VarO11110 = bVar5.o();
                            d dVarC11110 = c.c(bVar5, dVarI18);
                            bVar5.D();
                            if (bVar5.g()) {
                                bVar5.F(aVar4);
                            } else {
                                bVar5.p();
                            }
                            hlh0.a(bVar5, d160VarA119, bVar4);
                            hlh0.a(bVar5, ne00VarO11110, dVar2);
                            if (bVar5.g()) {
                                n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                            } else {
                                n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                            }
                            hlh0.a(bVar5, dVarC11110, cVar2);
                            lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                            if ((i12 & 896) == 256) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objY10 = bVar5.y();
                            if (z9) {
                                i15 = 0;
                                objY10 = new nxb(0, function6);
                                bVar5.r(objY10);
                            } else {
                                i15 = 0;
                                objY10 = new nxb(0, function6);
                                bVar5.r(objY10);
                            }
                            lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                            i12 = i12;
                            cVar3 = cVar2;
                            c0042a2 = c0042a;
                            f = 1.0f;
                            h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                            bVar5 = bVar5;
                            bVar5.s();
                            bVar5.H();
                        } else {
                            c0042a2 = c0042a;
                            cVar3 = cVar2;
                            f = 1.0f;
                            bVar5.N(1652524604);
                            bVar5.H();
                        }
                        f2 = 8.0f;
                    }
                    ty0.a(bVar5, j.i(aVar3, f2));
                    ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                    d dVarH1111 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                    d160 d160VarA1110 = b160.a(jVar, bVar6, bVar5, 48);
                    iHashCode11 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO11111 = bVar5.o();
                    d dVarC11111 = c.c(bVar5, dVarH1111);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA1110, bVar4);
                    hlh0.a(bVar5, ne00VarO11111, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                    } else {
                        n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                    }
                    hlh0.a(bVar5, dVarC11111, cVar3);
                    String strA7 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                    if ((i19 & 1879048192) == 536870912) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objY11 = bVar5.y();
                    if (z10) {
                        objY11 = new xwb(function4, 0);
                        bVar5.r(objY11);
                    } else {
                        objY11 = new xwb(function4, 0);
                        bVar5.r(objY11);
                    }
                    bVar7 = bVar5;
                    b(null, strA7, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                    bVar7.s();
                    ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                    d dVarG10 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                    d160 d160VarA1111 = b160.a(jVar, bVar6, bVar7, 48);
                    iHashCode12 = Long.hashCode(l2a.a(bVar7));
                    ne00 ne00VarO11112 = bVar7.o();
                    d dVarC11112 = c.c(bVar7, dVarG10);
                    bVar7.D();
                    if (bVar7.g()) {
                        bVar7.F(aVar4);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, d160VarA1111, bVar4);
                    hlh0.a(bVar7, ne00VarO11112, dVar2);
                    if (bVar7.g()) {
                        n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                    } else {
                        n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                    }
                    hlh0.a(bVar7, dVarC11112, cVar3);
                    d dVarG11 = j.g(aVar3, 1.0f);
                    aiv aivVarC6 = g75.c(n54Var, false);
                    iHashCode13 = Long.hashCode(l2a.a(bVar7));
                    ne00 ne00VarO11113 = bVar7.o();
                    d dVarC11113 = c.c(bVar7, dVarG11);
                    bVar7.D();
                    if (bVar7.g()) {
                        bVar7.F(aVar4);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, aivVarC6, bVar4);
                    hlh0.a(bVar7, ne00VarO11113, dVar2);
                    if (bVar7.g()) {
                        n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                    } else {
                        n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                    }
                    hlh0.a(bVar7, dVarC11113, cVar3);
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objY12 = bVar7.y();
                    if (z11) {
                        i16 = 0;
                        objY12 = new ywb(function0, 0);
                        bVar7.r(objY12);
                    } else {
                        i16 = 0;
                        objY12 = new ywb(function0, 0);
                        bVar7.r(objY12);
                    }
                    Function0 function0D5 = mla.d((Function0) objY12, bVar7, i16);
                    m980Var2 = m980Var;
                    if (Intrinsics.g(m980Var2, m980.d.a)) {
                        alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                    } else {
                        alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                    }
                    bVar = bVar7;
                    androidx.compose.runtime.a.C0041a.C0042a c0042a8 = c0042a2;
                    uxsVar2 = uxsVar;
                    aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D5, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                    if (uxsVar2 == uxs.DISABLE) {
                        bVar.N(-985848274);
                        d dVarF5 = androidx.compose.foundation.layout.d.a.f(aVar3);
                        if ((i12 & 112) == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objY13 = bVar.y();
                        if (z12) {
                            function7 = function5;
                            i17 = 0;
                            objY13 = new zwb(function7, 0);
                            bVar.r(objY13);
                        } else {
                            function7 = function5;
                            i17 = 0;
                            objY13 = new zwb(function7, 0);
                            bVar.r(objY13);
                        }
                        g75.a(g3w.f(dVarF5, true, (Function0) objY13), bVar, i17);
                        bVar.H();
                    } else {
                        function7 = function5;
                        bVar.N(-985624361);
                        bVar.H();
                    }
                    bVar.s();
                    bVar.s();
                    bVar.s();
                } else {
                    c0042a = c0042a3;
                }
                objY7 = new o43(k4iVar, 1);
                bVar5.r(objY7);
                tnp tnpVar9 = new tnp((Function1) objY7, null, null, 62);
                imf0 imf0VarB9 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                i12 = i20;
                soa0 soa0Var9 = new soa0(c68.a(R.color.text_primary, bVar5));
                d dVarI19 = j.i(j.w(aVar3, 136.0f), 30.0f);
                if (xlnVar2.b) {
                    i13 = 1369607091;
                    i14 = R.color.border_danger;
                } else if (f(ytwVar3)) {
                    i13 = 1369610230;
                    i14 = R.color.border_brand_sub;
                } else {
                    i13 = 1369612822;
                    i14 = R.color.border_secondary;
                }
                d dVarH1112 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI19, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                objY8 = bVar5.y();
                if (objY8 == c0042a) {
                    objY8 = new Function1() { // from class: lxb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            j5i j5iVar = (j5i) obj;
                            j5iVar.getClass();
                            ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                            return Unit.a;
                        }
                    };
                    bVar5.r(objY8);
                }
                d dVarH1113 = g3w.h(androidx.compose.ui.focus.a.a(dVarH1112, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                if ((i19 & 234881024) == 67108864) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objY9 = bVar5.y();
                if (z8) {
                    objY9 = new l53(function3, 1);
                    bVar5.r(objY9);
                } else {
                    objY9 = new l53(function3, 1);
                    bVar5.r(objY9);
                }
                ab2.b(str17, (Function1) objY9, dVarH1113, false, false, imf0VarB9, gopVar6, tnpVar9, true, 0, 0, null, null, null, soa0Var9, pp8.b(-1403207708, new gaj() { // from class: mxb
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar8;
                        Function2 function8 = (Function2) obj;
                        a aVar9 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function8.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar9.A(function8) ? 4 : 2;
                        }
                        int i22 = iIntValue;
                        if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                            aiv aivVarC7 = g75.c(ht.a.f, false);
                            int iHashCode18 = Long.hashCode(aVar9.m());
                            ne00 ne00VarO11114 = aVar9.o();
                            d.a aVar10 = d.a.b;
                            d dVarC11114 = c.c(aVar9, aVar10);
                            yka.k.getClass();
                            tsr.a aVar11 = yka.a.b;
                            if (aVar9.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar9.D();
                            if (aVar9.g()) {
                                aVar9.F(aVar11);
                            } else {
                                aVar9.p();
                            }
                            hlh0.a(aVar9, aivVarC7, yka.a.f);
                            hlh0.a(aVar9, ne00VarO11114, yka.a.e);
                            yka.a.C1350a c1350a3 = yka.a.g;
                            if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                            }
                            hlh0.a(aVar9, dVarC11114, yka.a.d);
                            if (kmnVar.c.a.length() == 0) {
                                aVar9.N(555385627);
                                imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                aVar8 = aVar9;
                                aVar8.H();
                            } else {
                                aVar8 = aVar9;
                                aVar8.N(555812280);
                                aVar8.H();
                            }
                            ps.a(i22 & 14, aVar8, function8);
                        } else {
                            aVar9.G();
                        }
                        return Unit.a;
                    }
                }, bVar5), bVar5, 102236160, 196608, 15896);
                bVar5.s();
                bVar5.s();
                uiText = xlnVar2.c;
                dVar3 = kw0.b;
                if (uiText != null) {
                    bVar5.N(1650374506);
                    d dVarI110 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA1112 = b160.a(dVar3, bVar6, bVar5, 54);
                    iHashCode14 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO11114 = bVar5.o();
                    d dVarC11114 = c.c(bVar5, dVarI110);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA1112, bVar4);
                    hlh0.a(bVar5, ne00VarO11114, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                    } else {
                        n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                    }
                    hlh0.a(bVar5, dVarC11114, cVar2);
                    lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                    bVar5.s();
                    bVar5.H();
                    c0042a2 = c0042a;
                    bVar6 = bVar6;
                    cVar3 = cVar2;
                    f2 = 8.0f;
                    f = 1.0f;
                } else {
                    if (z2) {
                        bVar5.N(1651170555);
                        d dVarI111 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA1113 = b160.a(dVar3, bVar6, bVar5, 54);
                        iHashCode10 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO11115 = bVar5.o();
                        d dVarC11115 = c.c(bVar5, dVarI111);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA1113, bVar4);
                        hlh0.a(bVar5, ne00VarO11115, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                        } else {
                            n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                        }
                        hlh0.a(bVar5, dVarC11115, cVar2);
                        lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                        if ((i12 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objY10 = bVar5.y();
                        if (z9) {
                            i15 = 0;
                            objY10 = new nxb(0, function6);
                            bVar5.r(objY10);
                        } else {
                            i15 = 0;
                            objY10 = new nxb(0, function6);
                            bVar5.r(objY10);
                        }
                        lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                        i12 = i12;
                        cVar3 = cVar2;
                        c0042a2 = c0042a;
                        f = 1.0f;
                        h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                        bVar5 = bVar5;
                        bVar5.s();
                        bVar5.H();
                    } else {
                        c0042a2 = c0042a;
                        cVar3 = cVar2;
                        f = 1.0f;
                        bVar5.N(1652524604);
                        bVar5.H();
                    }
                    f2 = 8.0f;
                }
                ty0.a(bVar5, j.i(aVar3, f2));
                ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                d dVarH1114 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                d160 d160VarA1114 = b160.a(jVar, bVar6, bVar5, 48);
                iHashCode11 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO11116 = bVar5.o();
                d dVarC11116 = c.c(bVar5, dVarH1114);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, d160VarA1114, bVar4);
                hlh0.a(bVar5, ne00VarO11116, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                } else {
                    n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                }
                hlh0.a(bVar5, dVarC11116, cVar3);
                String strA8 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                if ((i19 & 1879048192) == 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objY11 = bVar5.y();
                if (z10) {
                    objY11 = new xwb(function4, 0);
                    bVar5.r(objY11);
                } else {
                    objY11 = new xwb(function4, 0);
                    bVar5.r(objY11);
                }
                bVar7 = bVar5;
                b(null, strA8, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                bVar7.s();
                ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                d dVarG12 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                d160 d160VarA1115 = b160.a(jVar, bVar6, bVar7, 48);
                iHashCode12 = Long.hashCode(l2a.a(bVar7));
                ne00 ne00VarO11117 = bVar7.o();
                d dVarC11117 = c.c(bVar7, dVarG12);
                bVar7.D();
                if (bVar7.g()) {
                    bVar7.F(aVar4);
                } else {
                    bVar7.p();
                }
                hlh0.a(bVar7, d160VarA1115, bVar4);
                hlh0.a(bVar7, ne00VarO11117, dVar2);
                if (bVar7.g()) {
                    n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                } else {
                    n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                }
                hlh0.a(bVar7, dVarC11117, cVar3);
                d dVarG13 = j.g(aVar3, 1.0f);
                aiv aivVarC7 = g75.c(n54Var, false);
                iHashCode13 = Long.hashCode(l2a.a(bVar7));
                ne00 ne00VarO11118 = bVar7.o();
                d dVarC11118 = c.c(bVar7, dVarG13);
                bVar7.D();
                if (bVar7.g()) {
                    bVar7.F(aVar4);
                } else {
                    bVar7.p();
                }
                hlh0.a(bVar7, aivVarC7, bVar4);
                hlh0.a(bVar7, ne00VarO11118, dVar2);
                if (bVar7.g()) {
                    n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                } else {
                    n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                }
                hlh0.a(bVar7, dVarC11118, cVar3);
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY12 = bVar7.y();
                if (z11) {
                    i16 = 0;
                    objY12 = new ywb(function0, 0);
                    bVar7.r(objY12);
                } else {
                    i16 = 0;
                    objY12 = new ywb(function0, 0);
                    bVar7.r(objY12);
                }
                Function0 function0D6 = mla.d((Function0) objY12, bVar7, i16);
                m980Var2 = m980Var;
                if (Intrinsics.g(m980Var2, m980.d.a)) {
                    alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                } else {
                    alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                }
                bVar = bVar7;
                androidx.compose.runtime.a.C0041a.C0042a c0042a9 = c0042a2;
                uxsVar2 = uxsVar;
                aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D6, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                if (uxsVar2 == uxs.DISABLE) {
                    bVar.N(-985848274);
                    d dVarF6 = androidx.compose.foundation.layout.d.a.f(aVar3);
                    if ((i12 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY13 = bVar.y();
                    if (z12) {
                        function7 = function5;
                        i17 = 0;
                        objY13 = new zwb(function7, 0);
                        bVar.r(objY13);
                    } else {
                        function7 = function5;
                        i17 = 0;
                        objY13 = new zwb(function7, 0);
                        bVar.r(objY13);
                    }
                    g75.a(g3w.f(dVarF6, true, (Function0) objY13), bVar, i17);
                    bVar.H();
                } else {
                    function7 = function5;
                    bVar.N(-985624361);
                    bVar.H();
                }
                bVar.s();
                bVar.s();
                bVar.s();
            } else {
                bVar10.N(1805654404);
                strA = cb40.a(R.string.component_betslip__single, new Object[0], bVar10);
                bVar10.H();
            }
            str10 = strA;
            lkf0.d(str10, g3w.h(aVar5, "auto_bet_create_bet_type_value"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, 48, 0, 131064);
            bVar10.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar10, 48, 1);
            d dVarG14 = j.g(aVar5, 1.0f);
            if (z) {
                i6 = 883981141;
                i7 = R.color.warning_tertiary;
            } else {
                i6 = 883983472;
                i7 = R.color.transparent;
            }
            d dVarH22 = g3w.h(h.g(androidx.compose.foundation.a.c(dr2.a(i6, i7, bVar10, bVar10), dVarG14), 24.0f, 8.0f), "auto_bet_create_outcome_row");
            d160 d160VarA20 = b160.a(gVar2, bVar9, bVar10, 54);
            iHashCode = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO20 = bVar10.o();
            d dVarC20 = c.c(bVar10, dVarH22);
            bVar10.D();
            if (bVar10.g()) {
                bVar10.F(aVar7);
            } else {
                bVar10.p();
            }
            hlh0.a(bVar10, d160VarA20, bVar8);
            hlh0.a(bVar10, ne00VarO20, dVar4);
            if (bVar10.g()) {
                n30.a(iHashCode, bVar10, iHashCode, c1350a2);
            } else {
                n30.a(iHashCode, bVar10, iHashCode, c1350a2);
            }
            hlh0.a(bVar10, dVarC20, cVar4);
            lkf0.d(cb40.a(R.string.component_betslip__outcome, new Object[0], bVar10), g3w.h(aVar5, "auto_bet_create_outcome_label"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar10), bVar10, 48, 0, 131064);
            ty0.a(bVar10, j.w(aVar5, 12.0f));
            i78 i78VarA7 = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.o, bVar10, 54);
            iHashCode2 = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO21 = bVar10.o();
            d dVarC21 = c.c(bVar10, aVar5);
            bVar10.D();
            if (bVar10.g()) {
                bVar10.F(aVar7);
            } else {
                bVar10.p();
            }
            hlh0.a(bVar10, i78VarA7, bVar8);
            hlh0.a(bVar10, ne00VarO21, dVar4);
            if (bVar10.g()) {
                n30.a(iHashCode2, bVar10, iHashCode2, c1350a2);
            } else {
                n30.a(iHashCode2, bVar10, iHashCode2, c1350a2);
            }
            hlh0.a(bVar10, dVarC21, cVar4);
            kw0.j jVar2 = kw0.a;
            d160 d160VarA21 = b160.a(jVar2, bVar9, bVar10, 48);
            iHashCode3 = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO22 = bVar10.o();
            str11 = "";
            d dVarC22 = c.c(bVar10, aVar5);
            bVar10.D();
            if (bVar10.g()) {
                bVar10.F(aVar7);
            } else {
                bVar10.p();
            }
            hlh0.a(bVar10, d160VarA21, bVar8);
            hlh0.a(bVar10, ne00VarO22, dVar4);
            if (bVar10.g()) {
                n30.a(iHashCode3, bVar10, iHashCode3, c1350a2);
            } else {
                n30.a(iHashCode3, bVar10, iHashCode3, c1350a2);
            }
            hlh0.a(bVar10, dVarC22, cVar4);
            n54Var = ht.a.a;
            if (z) {
                bVar10.N(1497383477);
                d dVarH23 = g3w.h(h.g(androidx.compose.foundation.a.b(aVar5, c68.a(R.color.bg_disabled, bVar10), j060.c(2.0f)), 8.0f, 2.0f), "auto_bet_create_outcome_status_badge");
                aiv aivVarC8 = g75.c(n54Var, false);
                iHashCode15 = Long.hashCode(l2a.a(bVar10));
                ne00 ne00VarO23 = bVar10.o();
                d dVarC23 = c.c(bVar10, dVarH23);
                bVar10.D();
                if (bVar10.g()) {
                    bVar10.F(aVar7);
                } else {
                    bVar10.p();
                }
                hlh0.a(bVar10, aivVarC8, bVar8);
                hlh0.a(bVar10, ne00VarO23, dVar4);
                if (bVar10.g()) {
                    n30.a(iHashCode15, bVar10, iHashCode15, c1350a2);
                } else {
                    n30.a(iHashCode15, bVar10, iHashCode15, c1350a2);
                }
                hlh0.a(bVar10, dVarC23, cVar4);
                if (m980Var instanceof m980.f) {
                    bVar10.N(-819140775);
                    strA2 = cb40.a(R.string.component_betslip__suspended, new Object[0], bVar10);
                    bVar10.H();
                } else {
                    if (m980Var instanceof m980.g) {
                        bVar10.N(-819136549);
                        strA2 = cb40.a(R.string.component_betslip__unavailable, new Object[0], bVar10);
                        bVar10.H();
                    } else {
                        bVar10.N(376676002);
                        bVar10.H();
                    }
                    c = 2140;
                    lkf0.d(str11, g3w.h(aVar5, "auto_bet_create_outcome_status_text"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                    bVar10.s();
                    bVar10.H();
                }
                str11 = strA2;
                c = 2140;
                lkf0.d(str11, g3w.h(aVar5, "auto_bet_create_outcome_status_text"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                bVar10.s();
                bVar10.H();
            } else {
                c = 2140;
                bVar10.N(1498630855);
                bVar10.H();
            }
            ty0.a(bVar10, j.w(aVar5, 8.0f));
            if (str != null) {
                cVar = cVar4;
                aVar2 = aVar7;
                dVar = dVar4;
                bVar2 = bVar8;
                bVar3 = bVar9;
                gVar = gVar2;
                bVar10.N(1499300548);
                aVar3 = aVar5;
                h6n.b(erz.a(R.drawable.ic_sport_default, 0, bVar10), null, j.r(aVar3, 16.0f), c68.a(R.color.icon_primary, bVar10), bVar10, 432, 0);
                bVar10.H();
            } else {
                cVar = cVar4;
                aVar2 = aVar7;
                dVar = dVar4;
                bVar2 = bVar8;
                bVar3 = bVar9;
                gVar = gVar2;
                bVar10.N(1499300548);
                aVar3 = aVar5;
                h6n.b(erz.a(R.drawable.ic_sport_default, 0, bVar10), null, j.r(aVar3, 16.0f), c68.a(R.color.icon_primary, bVar10), bVar10, 432, 0);
                bVar10.H();
            }
            ty0.a(bVar10, j.w(aVar3, 2.0f));
            lkf0.d(str2, g3w.h(aVar3, "auto_bet_create_outcome_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, ((i18 >> 6) & 14) | 48, 0, 131064);
            bVar10.s();
            if (str3.length() > 0) {
                bVar10.N(1009104796);
                b bVar13 = bVar10;
                lkf0.d(str3, g3w.h(aVar3, "auto_bet_create_match_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, bVar10), bVar13, ((i18 >> 9) & 14) | 48, 24960, 109560);
                lkf0.d(str4, g3w.h(aVar3, "auto_bet_create_market_name"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar13, ((i18 >> 12) & 14) | 48, 0, 130040);
                bVar10.H();
            } else {
                bVar10.N(1010023450);
                lkf0.d(str4, g3w.h(aVar3, "auto_bet_create_match_name_no_market"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 2, false, 2, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, ((i18 >> 12) & 14) | 48, 24960, 109560);
                bVar10.H();
            }
            bVar10.s();
            bVar10.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar10, 48, 1);
            d dVarH24 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, 8.0f), "auto_bet_create_odds_row");
            kw0.g gVar4 = gVar;
            n54.b bVar14 = bVar3;
            d160 d160VarA22 = b160.a(gVar4, bVar14, bVar10, 54);
            iHashCode4 = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO24 = bVar10.o();
            d dVarC24 = c.c(bVar10, dVarH24);
            bVar10.D();
            if (bVar10.g()) {
                aVar4 = aVar2;
                bVar10.F(aVar4);
            } else {
                aVar4 = aVar2;
                bVar10.p();
            }
            bVar4 = bVar2;
            hlh0.a(bVar10, d160VarA22, bVar4);
            dVar2 = dVar;
            hlh0.a(bVar10, ne00VarO24, dVar2);
            if (bVar10.g()) {
                c1350a = r16;
                n30.a(iHashCode4, bVar10, iHashCode4, c1350a);
            } else {
                c1350a = r16;
                n30.a(iHashCode4, bVar10, iHashCode4, c1350a);
            }
            cVar2 = cVar;
            hlh0.a(bVar10, dVarC24, cVar2);
            i78 i78VarA8 = g78.a(kVar, aVar6, bVar10, 0);
            iHashCode5 = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO25 = bVar10.o();
            d dVarC25 = c.c(bVar10, aVar3);
            bVar10.D();
            if (bVar10.g()) {
                bVar10.F(aVar4);
            } else {
                bVar10.p();
            }
            hlh0.a(bVar10, i78VarA8, bVar4);
            hlh0.a(bVar10, ne00VarO25, dVar2);
            if (bVar10.g()) {
                n30.a(iHashCode5, bVar10, iHashCode5, c1350a);
            } else {
                n30.a(iHashCode5, bVar10, iHashCode5, c1350a);
            }
            hlh0.a(bVar10, dVarC25, cVar2);
            lkf0.d(cb40.a(R.string.common_functions__odds_txt, new Object[0], bVar10), g3w.h(aVar3, "auto_bet_create_odds_label"), c68.a(R.color.text_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar10), bVar10, 48, 0, 131064);
            if (z) {
                bVar10.N(-925349907);
                lkf0.d(tug.a(cb40.a(R.string.component_betslip__current_odds, new Object[0], bVar10), ": ", str6), g3w.h(aVar3, "auto_bet_create_current_odds_hint"), c68.a(R.color.text_secondary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar10), bVar10, 48, 0, 131064);
                bVar10.H();
            } else {
                bVar10.N(-924965910);
                bVar10.H();
            }
            bVar10.s();
            d160 d160VarA23 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar14, bVar10, 54);
            iHashCode6 = Long.hashCode(l2a.a(bVar10));
            ne00 ne00VarO26 = bVar10.o();
            d dVarC26 = c.c(bVar10, aVar3);
            bVar10.D();
            if (bVar10.g()) {
                bVar10.F(aVar4);
            } else {
                bVar10.p();
            }
            hlh0.a(bVar10, d160VarA23, bVar4);
            hlh0.a(bVar10, ne00VarO26, dVar2);
            if (bVar10.g()) {
                n30.a(iHashCode6, bVar10, iHashCode6, c1350a);
            } else {
                n30.a(iHashCode6, bVar10, iHashCode6, c1350a);
            }
            hlh0.a(bVar10, dVarC26, cVar2);
            xln xlnVar4 = kmnVar.a;
            xlnVar = kmnVar.b;
            xlnVar2 = kmnVar.c;
            String str18 = xlnVar4.a;
            gop gopVar7 = new gop(3, 6, 115);
            objY = bVar10.y();
            if (objY == c0042a3) {
                b5iVar = b5iVar3;
                objY = new bxb(b5iVar, 0);
                bVar10.r(objY);
            } else {
                b5iVar = r50;
            }
            tnp tnpVar10 = new tnp(null, (Function1) objY, null, 59);
            imf0 imf0VarB10 = imf0.b(mla.l(R.style.B1_M, bVar10), c68.a(R.color.text_primary, bVar10), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            soa0 soa0Var10 = new soa0(c68.a(R.color.text_primary, bVar10));
            d dVarI20 = j.i(j.w(aVar3, 76.0f), 30.0f);
            z5 = kmnVar.a.b;
            i8 = R.color.border_secondary;
            if (z5) {
                i9 = 1847562098;
                i8 = R.color.border_danger;
                jA = dr2.a(i9, i8, bVar10, bVar10);
            } else {
                i9 = 1847562098;
                i8 = R.color.border_danger;
                jA = dr2.a(i9, i8, bVar10, bVar10);
            }
            d dVarH25 = h.h(d35.a(dVarI20, 1.0f, jA, j060.c(2.0f)), 5.0f, 0.0f, 2);
            objY2 = bVar10.y();
            if (objY2 == c0042a3) {
                objY2 = new cxb(ytwVar, 0);
                bVar10.r(objY2);
            }
            d dVarH26 = g3w.h(androidx.compose.ui.focus.a.a(dVarH25, (Function1) objY2), "auto_bet_create_min_odds_input");
            if ((3670016 & i19) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            objY3 = bVar10.y();
            if (z6) {
                objY3 = new dxb(function1, 0);
                bVar10.r(objY3);
            } else {
                objY3 = new dxb(function1, 0);
                bVar10.r(objY3);
            }
            ab2.b(str18, (Function1) objY3, dVarH26, false, false, imf0VarB10, gopVar7, tnpVar10, true, 0, 0, null, null, null, soa0Var10, pp8.b(1828570979, new gaj() { // from class: wwb
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function8 = (Function2) obj;
                    a aVar8 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function8.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar8.A(function8) ? 4 : 2;
                    }
                    int i22 = iIntValue;
                    if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                        aiv aivVarC9 = g75.c(ht.a.f, false);
                        int iHashCode18 = Long.hashCode(aVar8.m());
                        ne00 ne00VarO120 = aVar8.o();
                        d.a aVar9 = d.a.b;
                        d dVarC120 = c.c(aVar8, aVar9);
                        yka.k.getClass();
                        tsr.a aVar10 = yka.a.b;
                        if (aVar8.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar8.D();
                        if (aVar8.g()) {
                            aVar8.F(aVar10);
                        } else {
                            aVar8.p();
                        }
                        hlh0.a(aVar8, aivVarC9, yka.a.f);
                        hlh0.a(aVar8, ne00VarO120, yka.a.e);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                            j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                        }
                        hlh0.a(aVar8, dVarC120, yka.a.d);
                        if (kmnVar.a.a.length() == 0) {
                            aVar8.N(-1807621071);
                            lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                            aVar8 = aVar8;
                            aVar8.H();
                        } else {
                            aVar8.N(-1807153095);
                            aVar8.H();
                        }
                        ps.a(i22 & 14, aVar8, function8);
                    } else {
                        aVar8.G();
                    }
                    return Unit.a;
                }
            }, bVar10), bVar10, 102236160, 196608, 15896);
            lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVar10), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVar10), bVar10, 6, 0, 131066);
            String str19 = xlnVar.a;
            gop gopVar8 = new gop(3, 6, 115);
            objY4 = bVar10.y();
            if (objY4 == c0042a3) {
                b5iVar2 = b5iVar4;
                objY4 = new Function1() { // from class: hxb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((snp) obj).getClass();
                        b5i.b(b5iVar2);
                        return Unit.a;
                    }
                };
                bVar10.r(objY4);
            } else {
                b5iVar2 = r52;
            }
            tnp tnpVar11 = new tnp(null, (Function1) objY4, null, 59);
            imf0 imf0VarB11 = imf0.b(mla.l(R.style.B1_M, bVar10), c68.a(R.color.text_primary, bVar10), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            soa0 soa0Var11 = new soa0(c68.a(R.color.text_primary, bVar10));
            d dVarI112 = j.i(j.w(aVar3, 76.0f), 30.0f);
            if (xlnVar.b) {
                i10 = 1847655986;
                i11 = R.color.border_danger;
                jA2 = dr2.a(i10, i11, bVar10, bVar10);
            } else {
                i10 = 1847655986;
                i11 = R.color.border_danger;
                jA2 = dr2.a(i10, i11, bVar10, bVar10);
            }
            d dVarH1115 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI112, 1.0f, jA2, j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2);
            objY5 = bVar10.y();
            if (objY5 == c0042a3) {
                objY5 = new ixb(ytwVar2, 0);
                bVar10.r(objY5);
            }
            d dVarH1116 = g3w.h(androidx.compose.ui.focus.a.a(dVarH1115, (Function1) objY5), "auto_bet_create_max_odds_input");
            if ((29360128 & i19) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            objY6 = bVar10.y();
            if (z7) {
                objY6 = new Function1() { // from class: jxb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str110 = (String) obj;
                        str110.getClass();
                        if (str110.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str110)) {
                            function2.invoke(str110);
                        }
                        return Unit.a;
                    }
                };
                bVar10.r(objY6);
            } else {
                objY6 = new Function1() { // from class: jxb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str110 = (String) obj;
                        str110.getClass();
                        if (str110.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str110)) {
                            function2.invoke(str110);
                        }
                        return Unit.a;
                    }
                };
                bVar10.r(objY6);
            }
            ab2.b(str19, (Function1) objY6, dVarH1116, false, false, imf0VarB11, gopVar8, tnpVar11, true, 0, 0, null, null, null, soa0Var11, pp8.b(1547738330, new gaj() { // from class: kxb
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function8 = (Function2) obj;
                    a aVar8 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function8.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar8.A(function8) ? 4 : 2;
                    }
                    int i22 = iIntValue;
                    if (aVar8.q(i22 & 1, (i22 & 19) != 18)) {
                        aiv aivVarC9 = g75.c(ht.a.f, false);
                        int iHashCode18 = Long.hashCode(aVar8.m());
                        ne00 ne00VarO11119 = aVar8.o();
                        d.a aVar9 = d.a.b;
                        d dVarC11119 = c.c(aVar8, aVar9);
                        yka.k.getClass();
                        tsr.a aVar10 = yka.a.b;
                        if (aVar8.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar8.D();
                        if (aVar8.g()) {
                            aVar8.F(aVar10);
                        } else {
                            aVar8.p();
                        }
                        hlh0.a(aVar8, aivVarC9, yka.a.f);
                        hlh0.a(aVar8, ne00VarO11119, yka.a.e);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode18))) {
                            j3c.a(iHashCode18, aVar8, iHashCode18, c1350a3);
                        }
                        hlh0.a(aVar8, dVarC11119, yka.a.d);
                        if (kmnVar.b.a.length() == 0) {
                            aVar8.N(-1590042406);
                            lkf0.d(cb40.a(R.string.component_betslip__max, new Object[0], aVar8), j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar8), aVar8, 48, 0, 130040);
                            aVar8 = aVar8;
                            aVar8.H();
                        } else {
                            aVar8.N(-1589574430);
                            aVar8.H();
                        }
                        ps.a(i22 & 14, aVar8, function8);
                    } else {
                        aVar8.G();
                    }
                    return Unit.a;
                }
            }, bVar10), bVar10, 102236160, 196608, 15896);
            bVar10.s();
            bVar10.s();
            bVar5 = bVar10;
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar10), bVar5, 48, 1);
            d dVarH1117 = g3w.h(h.i(j.g(aVar3, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
            bVar6 = bVar14;
            d160 d160VarA1116 = b160.a(gVar4, bVar6, bVar5, 54);
            iHashCode7 = Long.hashCode(l2a.a(bVar5));
            ne00 ne00VarO11119 = bVar5.o();
            d dVarC11119 = c.c(bVar5, dVarH1117);
            bVar5.D();
            if (bVar5.g()) {
                bVar5.F(aVar4);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, d160VarA1116, bVar4);
            hlh0.a(bVar5, ne00VarO11119, dVar2);
            if (bVar5.g()) {
                n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
            } else {
                n30.a(iHashCode7, bVar5, iHashCode7, c1350a);
            }
            hlh0.a(bVar5, dVarC11119, cVar2);
            i78 i78VarA9 = g78.a(kVar, aVar6, bVar5, 0);
            iHashCode8 = Long.hashCode(l2a.a(bVar5));
            ne00 ne00VarO11120 = bVar5.o();
            d dVarC11120 = c.c(bVar5, aVar3);
            bVar5.D();
            if (bVar5.g()) {
                bVar5.F(aVar4);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, i78VarA9, bVar4);
            hlh0.a(bVar5, ne00VarO11120, dVar2);
            if (bVar5.g()) {
                n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
            } else {
                n30.a(iHashCode8, bVar5, iHashCode8, c1350a);
            }
            hlh0.a(bVar5, dVarC11120, cVar2);
            lkf0.d(cb40.a(R.string.common_functions__stake, new Object[0], bVar5), g3w.h(aVar3, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar5), bVar5, 48, 0, 131064);
            lkf0.d(str9, g3w.h(aVar3, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, ((i20 >> 9) & 14) | 48, 0, 131064);
            bVar5.s();
            d160 d160VarA1117 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar6, bVar5, 54);
            iHashCode9 = Long.hashCode(l2a.a(bVar5));
            ne00 ne00VarO11121 = bVar5.o();
            d dVarC11121 = c.c(bVar5, aVar3);
            bVar5.D();
            if (bVar5.g()) {
                bVar5.F(aVar4);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, d160VarA1117, bVar4);
            hlh0.a(bVar5, ne00VarO11121, dVar2);
            if (bVar5.g()) {
                n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
            } else {
                n30.a(iHashCode9, bVar5, iHashCode9, c1350a);
            }
            hlh0.a(bVar5, dVarC11121, cVar2);
            lkf0.d(str5, g3w.h(aVar3, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, ((i18 >> 15) & 14) | 48, 0, 131064);
            String str110 = xlnVar2.a;
            gop gopVar9 = new gop(3, 7, 115);
            zA = bVar5.A(k4iVar);
            objY7 = bVar5.y();
            if (zA) {
                c0042a = c0042a3;
                if (objY7 == c0042a) {
                }
                tnp tnpVar12 = new tnp((Function1) objY7, null, null, 62);
                imf0 imf0VarB12 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                i12 = i20;
                soa0 soa0Var12 = new soa0(c68.a(R.color.text_primary, bVar5));
                d dVarI113 = j.i(j.w(aVar3, 136.0f), 30.0f);
                if (xlnVar2.b) {
                    i13 = 1369607091;
                    i14 = R.color.border_danger;
                } else if (f(ytwVar3)) {
                    i13 = 1369610230;
                    i14 = R.color.border_brand_sub;
                } else {
                    i13 = 1369612822;
                    i14 = R.color.border_secondary;
                }
                d dVarH1118 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI113, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
                objY8 = bVar5.y();
                if (objY8 == c0042a) {
                    objY8 = new Function1() { // from class: lxb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            j5i j5iVar = (j5i) obj;
                            j5iVar.getClass();
                            ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                            return Unit.a;
                        }
                    };
                    bVar5.r(objY8);
                }
                d dVarH1119 = g3w.h(androidx.compose.ui.focus.a.a(dVarH1118, (Function1) objY8), TEFcJcMqR.NNZYWQ);
                if ((i19 & 234881024) == 67108864) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objY9 = bVar5.y();
                if (z8) {
                    objY9 = new l53(function3, 1);
                    bVar5.r(objY9);
                } else {
                    objY9 = new l53(function3, 1);
                    bVar5.r(objY9);
                }
                ab2.b(str110, (Function1) objY9, dVarH1119, false, false, imf0VarB12, gopVar9, tnpVar12, true, 0, 0, null, null, null, soa0Var12, pp8.b(-1403207708, new gaj() { // from class: mxb
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar8;
                        Function2 function8 = (Function2) obj;
                        a aVar9 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function8.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar9.A(function8) ? 4 : 2;
                        }
                        int i22 = iIntValue;
                        if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                            aiv aivVarC9 = g75.c(ht.a.f, false);
                            int iHashCode18 = Long.hashCode(aVar9.m());
                            ne00 ne00VarO111110 = aVar9.o();
                            d.a aVar10 = d.a.b;
                            d dVarC111110 = c.c(aVar9, aVar10);
                            yka.k.getClass();
                            tsr.a aVar11 = yka.a.b;
                            if (aVar9.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar9.D();
                            if (aVar9.g()) {
                                aVar9.F(aVar11);
                            } else {
                                aVar9.p();
                            }
                            hlh0.a(aVar9, aivVarC9, yka.a.f);
                            hlh0.a(aVar9, ne00VarO111110, yka.a.e);
                            yka.a.C1350a c1350a3 = yka.a.g;
                            if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                                j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                            }
                            hlh0.a(aVar9, dVarC111110, yka.a.d);
                            if (kmnVar.c.a.length() == 0) {
                                aVar9.N(555385627);
                                imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                                lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                                aVar8 = aVar9;
                                aVar8.H();
                            } else {
                                aVar8 = aVar9;
                                aVar8.N(555812280);
                                aVar8.H();
                            }
                            ps.a(i22 & 14, aVar8, function8);
                        } else {
                            aVar9.G();
                        }
                        return Unit.a;
                    }
                }, bVar5), bVar5, 102236160, 196608, 15896);
                bVar5.s();
                bVar5.s();
                uiText = xlnVar2.c;
                dVar3 = kw0.b;
                if (uiText != null) {
                    bVar5.N(1650374506);
                    d dVarI114 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA1118 = b160.a(dVar3, bVar6, bVar5, 54);
                    iHashCode14 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO111110 = bVar5.o();
                    d dVarC111110 = c.c(bVar5, dVarI114);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA1118, bVar4);
                    hlh0.a(bVar5, ne00VarO111110, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                    } else {
                        n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                    }
                    hlh0.a(bVar5, dVarC111110, cVar2);
                    lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                    bVar5.s();
                    bVar5.H();
                    c0042a2 = c0042a;
                    bVar6 = bVar6;
                    cVar3 = cVar2;
                    f2 = 8.0f;
                    f = 1.0f;
                } else {
                    if (z2) {
                        bVar5.N(1651170555);
                        d dVarI115 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA1119 = b160.a(dVar3, bVar6, bVar5, 54);
                        iHashCode10 = Long.hashCode(l2a.a(bVar5));
                        ne00 ne00VarO111111 = bVar5.o();
                        d dVarC111111 = c.c(bVar5, dVarI115);
                        bVar5.D();
                        if (bVar5.g()) {
                            bVar5.F(aVar4);
                        } else {
                            bVar5.p();
                        }
                        hlh0.a(bVar5, d160VarA1119, bVar4);
                        hlh0.a(bVar5, ne00VarO111111, dVar2);
                        if (bVar5.g()) {
                            n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                        } else {
                            n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                        }
                        hlh0.a(bVar5, dVarC111111, cVar2);
                        lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                        if ((i12 & 896) == 256) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objY10 = bVar5.y();
                        if (z9) {
                            i15 = 0;
                            objY10 = new nxb(0, function6);
                            bVar5.r(objY10);
                        } else {
                            i15 = 0;
                            objY10 = new nxb(0, function6);
                            bVar5.r(objY10);
                        }
                        lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                        i12 = i12;
                        cVar3 = cVar2;
                        c0042a2 = c0042a;
                        f = 1.0f;
                        h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                        bVar5 = bVar5;
                        bVar5.s();
                        bVar5.H();
                    } else {
                        c0042a2 = c0042a;
                        cVar3 = cVar2;
                        f = 1.0f;
                        bVar5.N(1652524604);
                        bVar5.H();
                    }
                    f2 = 8.0f;
                }
                ty0.a(bVar5, j.i(aVar3, f2));
                ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
                d dVarH11110 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
                d160 d160VarA11110 = b160.a(jVar2, bVar6, bVar5, 48);
                iHashCode11 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO111112 = bVar5.o();
                d dVarC111112 = c.c(bVar5, dVarH11110);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, d160VarA11110, bVar4);
                hlh0.a(bVar5, ne00VarO111112, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                } else {
                    n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
                }
                hlh0.a(bVar5, dVarC111112, cVar3);
                String strA9 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
                if ((i19 & 1879048192) == 536870912) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objY11 = bVar5.y();
                if (z10) {
                    objY11 = new xwb(function4, 0);
                    bVar5.r(objY11);
                } else {
                    objY11 = new xwb(function4, 0);
                    bVar5.r(objY11);
                }
                bVar7 = bVar5;
                b(null, strA9, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
                bVar7.s();
                ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
                d dVarG15 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
                d160 d160VarA11111 = b160.a(jVar2, bVar6, bVar7, 48);
                iHashCode12 = Long.hashCode(l2a.a(bVar7));
                ne00 ne00VarO111113 = bVar7.o();
                d dVarC111113 = c.c(bVar7, dVarG15);
                bVar7.D();
                if (bVar7.g()) {
                    bVar7.F(aVar4);
                } else {
                    bVar7.p();
                }
                hlh0.a(bVar7, d160VarA11111, bVar4);
                hlh0.a(bVar7, ne00VarO111113, dVar2);
                if (bVar7.g()) {
                    n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                } else {
                    n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
                }
                hlh0.a(bVar7, dVarC111113, cVar3);
                d dVarG16 = j.g(aVar3, 1.0f);
                aiv aivVarC9 = g75.c(n54Var, false);
                iHashCode13 = Long.hashCode(l2a.a(bVar7));
                ne00 ne00VarO111114 = bVar7.o();
                d dVarC111114 = c.c(bVar7, dVarG16);
                bVar7.D();
                if (bVar7.g()) {
                    bVar7.F(aVar4);
                } else {
                    bVar7.p();
                }
                hlh0.a(bVar7, aivVarC9, bVar4);
                hlh0.a(bVar7, ne00VarO111114, dVar2);
                if (bVar7.g()) {
                    n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                } else {
                    n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
                }
                hlh0.a(bVar7, dVarC111114, cVar3);
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY12 = bVar7.y();
                if (z11) {
                    i16 = 0;
                    objY12 = new ywb(function0, 0);
                    bVar7.r(objY12);
                } else {
                    i16 = 0;
                    objY12 = new ywb(function0, 0);
                    bVar7.r(objY12);
                }
                Function0 function0D7 = mla.d((Function0) objY12, bVar7, i16);
                m980Var2 = m980Var;
                if (Intrinsics.g(m980Var2, m980.d.a)) {
                    alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
                } else {
                    alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
                }
                bVar = bVar7;
                androidx.compose.runtime.a.C0041a.C0042a c0042a10 = c0042a2;
                uxsVar2 = uxsVar;
                aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D7, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
                if (uxsVar2 == uxs.DISABLE) {
                    bVar.N(-985848274);
                    d dVarF7 = androidx.compose.foundation.layout.d.a.f(aVar3);
                    if ((i12 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY13 = bVar.y();
                    if (z12) {
                        function7 = function5;
                        i17 = 0;
                        objY13 = new zwb(function7, 0);
                        bVar.r(objY13);
                    } else {
                        function7 = function5;
                        i17 = 0;
                        objY13 = new zwb(function7, 0);
                        bVar.r(objY13);
                    }
                    g75.a(g3w.f(dVarF7, true, (Function0) objY13), bVar, i17);
                    bVar.H();
                } else {
                    function7 = function5;
                    bVar.N(-985624361);
                    bVar.H();
                }
                bVar.s();
                bVar.s();
                bVar.s();
            } else {
                c0042a = c0042a3;
            }
            objY7 = new o43(k4iVar, 1);
            bVar5.r(objY7);
            tnp tnpVar13 = new tnp((Function1) objY7, null, null, 62);
            imf0 imf0VarB13 = imf0.b(mla.l(R.style.B1_M, bVar5), c68.a(R.color.text_primary, bVar5), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            i12 = i20;
            soa0 soa0Var13 = new soa0(c68.a(R.color.text_primary, bVar5));
            d dVarI116 = j.i(j.w(aVar3, 136.0f), 30.0f);
            if (xlnVar2.b) {
                i13 = 1369607091;
                i14 = R.color.border_danger;
            } else if (f(ytwVar3)) {
                i13 = 1369610230;
                i14 = R.color.border_brand_sub;
            } else {
                i13 = 1369612822;
                i14 = R.color.border_secondary;
            }
            d dVarH11111 = h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI116, 1.0f, dr2.a(i13, i14, bVar5, bVar5), j060.c(2.0f)), b5iVar2), 5.0f, 0.0f, 2);
            objY8 = bVar5.y();
            if (objY8 == c0042a) {
                objY8 = new Function1() { // from class: lxb
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        j5i j5iVar = (j5i) obj;
                        j5iVar.getClass();
                        ytwVar3.setValue(Boolean.valueOf(j5iVar.a()));
                        return Unit.a;
                    }
                };
                bVar5.r(objY8);
            }
            d dVarH11112 = g3w.h(androidx.compose.ui.focus.a.a(dVarH11111, (Function1) objY8), TEFcJcMqR.NNZYWQ);
            if ((i19 & 234881024) == 67108864) {
                z8 = true;
            } else {
                z8 = false;
            }
            objY9 = bVar5.y();
            if (z8) {
                objY9 = new l53(function3, 1);
                bVar5.r(objY9);
            } else {
                objY9 = new l53(function3, 1);
                bVar5.r(objY9);
            }
            ab2.b(str110, (Function1) objY9, dVarH11112, false, false, imf0VarB13, gopVar9, tnpVar13, true, 0, 0, null, null, null, soa0Var13, pp8.b(-1403207708, new gaj() { // from class: mxb
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar8;
                    Function2 function8 = (Function2) obj;
                    a aVar9 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function8.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar9.A(function8) ? 4 : 2;
                    }
                    int i22 = iIntValue;
                    if (aVar9.q(i22 & 1, (i22 & 19) != 18)) {
                        aiv aivVarC10 = g75.c(ht.a.f, false);
                        int iHashCode18 = Long.hashCode(aVar9.m());
                        ne00 ne00VarO111115 = aVar9.o();
                        d.a aVar10 = d.a.b;
                        d dVarC111115 = c.c(aVar9, aVar10);
                        yka.k.getClass();
                        tsr.a aVar11 = yka.a.b;
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar9.F(aVar11);
                        } else {
                            aVar9.p();
                        }
                        hlh0.a(aVar9, aivVarC10, yka.a.f);
                        hlh0.a(aVar9, ne00VarO111115, yka.a.e);
                        yka.a.C1350a c1350a3 = yka.a.g;
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode18))) {
                            j3c.a(iHashCode18, aVar9, iHashCode18, c1350a3);
                        }
                        hlh0.a(aVar9, dVarC111115, yka.a.d);
                        if (kmnVar.c.a.length() == 0) {
                            aVar9.N(555385627);
                            imf0 imf0VarL = mla.l(R.style.B1_M, aVar9);
                            lkf0.d(str7, j.g(aVar10, 1.0f), c68.a(R.color.text_placeholder, aVar9), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar9, 48, 0, 130040);
                            aVar8 = aVar9;
                            aVar8.H();
                        } else {
                            aVar8 = aVar9;
                            aVar8.N(555812280);
                            aVar8.H();
                        }
                        ps.a(i22 & 14, aVar8, function8);
                    } else {
                        aVar9.G();
                    }
                    return Unit.a;
                }
            }, bVar5), bVar5, 102236160, 196608, 15896);
            bVar5.s();
            bVar5.s();
            uiText = xlnVar2.c;
            dVar3 = kw0.b;
            if (uiText != null) {
                bVar5.N(1650374506);
                d dVarI117 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                d160 d160VarA11112 = b160.a(dVar3, bVar6, bVar5, 54);
                iHashCode14 = Long.hashCode(l2a.a(bVar5));
                ne00 ne00VarO111115 = bVar5.o();
                d dVarC111115 = c.c(bVar5, dVarI117);
                bVar5.D();
                if (bVar5.g()) {
                    bVar5.F(aVar4);
                } else {
                    bVar5.p();
                }
                hlh0.a(bVar5, d160VarA11112, bVar4);
                hlh0.a(bVar5, ne00VarO111115, dVar2);
                if (bVar5.g()) {
                    n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                } else {
                    n30.a(iHashCode14, bVar5, iHashCode14, c1350a);
                }
                hlh0.a(bVar5, dVarC111115, cVar2);
                lkf0.d(vch0.a(xlnVar2.c, bVar5), g3w.h(aVar3, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 48, 24576, 113656);
                bVar5.s();
                bVar5.H();
                c0042a2 = c0042a;
                bVar6 = bVar6;
                cVar3 = cVar2;
                f2 = 8.0f;
                f = 1.0f;
            } else {
                if (z2) {
                    bVar5.N(1651170555);
                    d dVarI118 = h.i(j.g(aVar3, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA11113 = b160.a(dVar3, bVar6, bVar5, 54);
                    iHashCode10 = Long.hashCode(l2a.a(bVar5));
                    ne00 ne00VarO111116 = bVar5.o();
                    d dVarC111116 = c.c(bVar5, dVarI118);
                    bVar5.D();
                    if (bVar5.g()) {
                        bVar5.F(aVar4);
                    } else {
                        bVar5.p();
                    }
                    hlh0.a(bVar5, d160VarA11113, bVar4);
                    hlh0.a(bVar5, ne00VarO111116, dVar2);
                    if (bVar5.g()) {
                        n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                    } else {
                        n30.a(iHashCode10, bVar5, iHashCode10, c1350a);
                    }
                    hlh0.a(bVar5, dVarC111116, cVar2);
                    lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVar5).concat(", "), null, c68.a(R.color.text_danger, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar5), bVar5, 0, 0, 131066);
                    if ((i12 & 896) == 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objY10 = bVar5.y();
                    if (z9) {
                        i15 = 0;
                        objY10 = new nxb(0, function6);
                        bVar5.r(objY10);
                    } else {
                        i15 = 0;
                        objY10 = new nxb(0, function6);
                        bVar5.r(objY10);
                    }
                    lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[i15], bVar5), g3w.h(g3w.f(aVar3, true, (Function0) objY10), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVar5), bVar5, 0, 0, 131064);
                    i12 = i12;
                    cVar3 = cVar2;
                    c0042a2 = c0042a;
                    f = 1.0f;
                    h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVar5), null, j.r(aVar3, 12.0f), c68.a(R.color.text_brand_sub_primary_d_base, bVar5), bVar5, 432, 0);
                    bVar5 = bVar5;
                    bVar5.s();
                    bVar5.H();
                } else {
                    c0042a2 = c0042a;
                    cVar3 = cVar2;
                    f = 1.0f;
                    bVar5.N(1652524604);
                    bVar5.H();
                }
                f2 = 8.0f;
            }
            ty0.a(bVar5, j.i(aVar3, f2));
            ute.b(null, f, c68.a(R.color.border_primary, bVar5), bVar5, 48, 1);
            d dVarH11113 = g3w.h(h.g(j.g(aVar3, 1.0f), 24.0f, f2), "auto_bet_create_terms_row");
            d160 d160VarA11114 = b160.a(jVar2, bVar6, bVar5, 48);
            iHashCode11 = Long.hashCode(l2a.a(bVar5));
            ne00 ne00VarO111117 = bVar5.o();
            d dVarC111117 = c.c(bVar5, dVarH11113);
            bVar5.D();
            if (bVar5.g()) {
                bVar5.F(aVar4);
            } else {
                bVar5.p();
            }
            hlh0.a(bVar5, d160VarA11114, bVar4);
            hlh0.a(bVar5, ne00VarO111117, dVar2);
            if (bVar5.g()) {
                n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
            } else {
                n30.a(iHashCode11, bVar5, iHashCode11, c1350a);
            }
            hlh0.a(bVar5, dVarC111117, cVar3);
            String strA10 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar5);
            if ((i19 & 1879048192) == 536870912) {
                z10 = true;
            } else {
                z10 = false;
            }
            objY11 = bVar5.y();
            if (z10) {
                objY11 = new xwb(function4, 0);
                bVar5.r(objY11);
            } else {
                objY11 = new xwb(function4, 0);
                bVar5.r(objY11);
            }
            bVar7 = bVar5;
            b(null, strA10, z3, z4, (Function1) objY11, bVar7, i19 & 8064);
            bVar7.s();
            ute.b(null, f, c68.a(R.color.border_primary, bVar7), bVar7, 48, 1);
            d dVarG17 = h.g(j.g(aVar3, 1.0f), 24.0f, 16.0f);
            d160 d160VarA11115 = b160.a(jVar2, bVar6, bVar7, 48);
            iHashCode12 = Long.hashCode(l2a.a(bVar7));
            ne00 ne00VarO111118 = bVar7.o();
            d dVarC111118 = c.c(bVar7, dVarG17);
            bVar7.D();
            if (bVar7.g()) {
                bVar7.F(aVar4);
            } else {
                bVar7.p();
            }
            hlh0.a(bVar7, d160VarA11115, bVar4);
            hlh0.a(bVar7, ne00VarO111118, dVar2);
            if (bVar7.g()) {
                n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
            } else {
                n30.a(iHashCode12, bVar7, iHashCode12, c1350a);
            }
            hlh0.a(bVar7, dVarC111118, cVar3);
            d dVarG18 = j.g(aVar3, 1.0f);
            aiv aivVarC10 = g75.c(n54Var, false);
            iHashCode13 = Long.hashCode(l2a.a(bVar7));
            ne00 ne00VarO111119 = bVar7.o();
            d dVarC111119 = c.c(bVar7, dVarG18);
            bVar7.D();
            if (bVar7.g()) {
                bVar7.F(aVar4);
            } else {
                bVar7.p();
            }
            hlh0.a(bVar7, aivVarC10, bVar4);
            hlh0.a(bVar7, ne00VarO111119, dVar2);
            if (bVar7.g()) {
                n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
            } else {
                n30.a(iHashCode13, bVar7, iHashCode13, c1350a);
            }
            hlh0.a(bVar7, dVarC111119, cVar3);
            if ((i12 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objY12 = bVar7.y();
            if (z11) {
                i16 = 0;
                objY12 = new ywb(function0, 0);
                bVar7.r(objY12);
            } else {
                i16 = 0;
                objY12 = new ywb(function0, 0);
                bVar7.r(objY12);
            }
            Function0 function0D8 = mla.d((Function0) objY12, bVar7, i16);
            m980Var2 = m980Var;
            if (Intrinsics.g(m980Var2, m980.d.a)) {
                alb0VarA = alb0.a(sya.b, g7f.a(44.0f), null, 0L, 0.0f, 29);
            } else {
                alb0VarA = alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29);
            }
            bVar = bVar7;
            androidx.compose.runtime.a.C0041a.C0042a c0042a11 = c0042a2;
            uxsVar2 = uxsVar;
            aza.a(g3w.h(j.g(aVar3, 1.0f), "auto_bet_create_place_bet_button"), str8, uxsVar2, null, alb0VarA, null, null, null, function0D8, null, bVar, ((i18 >> 21) & 112) | 6 | ((i19 >> 6) & 896), 744);
            if (uxsVar2 == uxs.DISABLE) {
                bVar.N(-985848274);
                d dVarF8 = androidx.compose.foundation.layout.d.a.f(aVar3);
                if ((i12 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objY13 = bVar.y();
                if (z12) {
                    function7 = function5;
                    i17 = 0;
                    objY13 = new zwb(function7, 0);
                    bVar.r(objY13);
                } else {
                    function7 = function5;
                    i17 = 0;
                    objY13 = new zwb(function7, 0);
                    bVar.r(objY13);
                }
                g75.a(g3w.f(dVarF8, true, (Function0) objY13), bVar, i17);
                bVar.H();
            } else {
                function7 = function5;
                bVar.N(-985624361);
                bVar.H();
            }
            bVar.s();
            bVar.s();
            bVar.s();
        } else {
            m980Var2 = m980Var;
            bVar = bVarI;
            uxsVar2 = uxsVar;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function8 = function7;
            final m980 m980Var3 = m980Var2;
            final uxs uxsVar3 = uxsVar2;
            eVarZ.e(new Function2(str, str2, str3, str4, str5, str6, str7, str8, m980Var3, z, z2, z3, z4, uxsVar3, kmnVar, function1, function2, function3, function4, function0, function8, function6, str9, i, i2, i3) { // from class: axb
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ uxs D;
                public final /* synthetic */ kmn E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ Function1 G;
                public final /* synthetic */ Function1 H;
                public final /* synthetic */ Function1 I;
                public final /* synthetic */ Function0 J;
                public final /* synthetic */ Function0 K;
                public final /* synthetic */ Function0 L;
                public final /* synthetic */ String M;
                public final /* synthetic */ int N;
                public final /* synthetic */ int O;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ m980 y;
                public final /* synthetic */ boolean z;

                {
                    this.N = i2;
                    this.O = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1073741825);
                    int iA2 = qj40.a(this.N);
                    int iA3 = qj40.a(this.O);
                    oxb.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (a) obj, iA, iA2, iA3);
                    return Unit.a;
                }
            });
        }
    }

    public static final boolean d(ytw<Boolean> ytwVar) {
        return ytwVar.getValue().booleanValue();
    }

    public static final boolean e(ytw<Boolean> ytwVar) {
        return ytwVar.getValue().booleanValue();
    }

    public static final boolean f(ytw<Boolean> ytwVar) {
        return ytwVar.getValue().booleanValue();
    }
}
