package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class q3g {

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
        b bVarI = aVar.i(-1412853303);
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
                i3 = -542339179;
                i4 = R.color.border_danger;
            } else {
                i3 = -542337192;
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
            eVarZ.d = new Function2() { // from class: j3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q3g.a(qj40.a(i | 1), (a) obj, dVar, function1, z, z2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final String str, boolean z, final boolean z2, Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        d dVar2;
        final boolean z3 = z;
        final Function1 function2 = function1;
        b bVarI = aVar.i(-1159850946);
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
                objY = new Function0() { // from class: h3g
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
            eVarZ.d = new Function2() { // from class: i3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q3g.b(dVar3, str, z3, z2, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:171:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:172:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:180:0x0358 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0366  */
    /* JADX WARN: Code duplicated, block: B:183:0x037a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0422  */
    /* JADX WARN: Code duplicated, block: B:187:0x0426  */
    /* JADX WARN: Code duplicated, block: B:192:0x0443  */
    /* JADX WARN: Code duplicated, block: B:195:0x0529  */
    /* JADX WARN: Code duplicated, block: B:196:0x052d  */
    /* JADX WARN: Code duplicated, block: B:201:0x054a  */
    /* JADX WARN: Code duplicated, block: B:204:0x0570  */
    /* JADX WARN: Code duplicated, block: B:205:0x0574  */
    /* JADX WARN: Code duplicated, block: B:210:0x0591  */
    /* JADX WARN: Code duplicated, block: B:213:0x060f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0613  */
    /* JADX WARN: Code duplicated, block: B:219:0x0630  */
    /* JADX WARN: Code duplicated, block: B:222:0x0650  */
    /* JADX WARN: Code duplicated, block: B:223:0x065c  */
    /* JADX WARN: Code duplicated, block: B:226:0x06be  */
    /* JADX WARN: Code duplicated, block: B:228:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:231:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:232:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:235:0x0706  */
    /* JADX WARN: Code duplicated, block: B:238:0x070b  */
    /* JADX WARN: Code duplicated, block: B:239:0x070e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0799  */
    /* JADX WARN: Code duplicated, block: B:244:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:247:0x0806  */
    /* JADX WARN: Code duplicated, block: B:249:0x0813  */
    /* JADX WARN: Code duplicated, block: B:252:0x0844  */
    /* JADX WARN: Code duplicated, block: B:253:0x0846  */
    /* JADX WARN: Code duplicated, block: B:256:0x084e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x0854  */
    /* JADX WARN: Code duplicated, block: B:262:0x08df  */
    /* JADX WARN: Code duplicated, block: B:263:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:266:0x08f4  */
    /* JADX WARN: Code duplicated, block: B:268:0x0902  */
    /* JADX WARN: Code duplicated, block: B:273:0x0930  */
    /* JADX WARN: Code duplicated, block: B:274:0x0934  */
    /* JADX WARN: Code duplicated, block: B:277:0x0943  */
    /* JADX WARN: Code duplicated, block: B:279:0x0951  */
    /* JADX WARN: Code duplicated, block: B:282:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:283:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:288:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:291:0x0ad1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:297:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:299:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:303:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b71 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:312:0x0bca  */
    /* JADX WARN: Code duplicated, block: B:314:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:316:0x0c05  */
    /* JADX WARN: Code duplicated, block: B:319:0x0c19  */
    /* JADX WARN: Code duplicated, block: B:321:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:327:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ca1  */
    /* JADX WARN: Code duplicated, block: B:331:0x0cce  */
    /* JADX WARN: Code duplicated, block: B:332:0x0cd2  */
    /* JADX WARN: Code duplicated, block: B:335:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:337:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:340:0x0d47  */
    /* JADX WARN: Code duplicated, block: B:341:0x0d49  */
    /* JADX WARN: Code duplicated, block: B:344:0x0d50 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x0d56  */
    /* JADX WARN: Code duplicated, block: B:349:0x0de5  */
    /* JADX WARN: Code duplicated, block: B:352:0x0e44  */
    /* JADX WARN: Code duplicated, block: B:353:0x0e48  */
    /* JADX WARN: Code duplicated, block: B:356:0x0e57  */
    /* JADX WARN: Code duplicated, block: B:358:0x0e65  */
    /* JADX WARN: Code duplicated, block: B:361:0x0e7b  */
    /* JADX WARN: Code duplicated, block: B:362:0x0e7d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0e84  */
    /* JADX WARN: Code duplicated, block: B:368:0x0e89  */
    /* JADX WARN: Code duplicated, block: B:369:0x0e8c  */
    /* JADX WARN: Code duplicated, block: B:373:0x0eef  */
    /* JADX WARN: Code duplicated, block: B:374:0x0ef3  */
    /* JADX WARN: Code duplicated, block: B:377:0x0f02  */
    /* JADX WARN: Code duplicated, block: B:379:0x0f10  */
    /* JADX WARN: Code duplicated, block: B:382:0x0f3a  */
    /* JADX WARN: Code duplicated, block: B:383:0x0f3e  */
    /* JADX WARN: Code duplicated, block: B:386:0x0f4d  */
    /* JADX WARN: Code duplicated, block: B:388:0x0f5b  */
    /* JADX WARN: Code duplicated, block: B:391:0x0fa8  */
    /* JADX WARN: Code duplicated, block: B:393:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:394:0x0fbf  */
    /* JADX WARN: Code duplicated, block: B:397:0x0fc6  */
    /* JADX WARN: Code duplicated, block: B:401:0x0fce  */
    /* JADX WARN: Code duplicated, block: B:403:0x0fe7  */
    public static final void c(final OrderBetType orderBetType, final String str, final String str2, final String str3, final boolean z, final boolean z2, final boolean z3, uxs uxsVar, final kmn kmnVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function0 function0, Function0 function5, final Function0 function6, final Function0 function7, final String str4, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        uxs uxsVar2;
        b bVar;
        int i6;
        yka.a.c cVar;
        n54.b bVar2;
        int iHashCode;
        int i7;
        int i8;
        String strA;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        xln xlnVar;
        Object objY;
        b5i b5iVar;
        boolean z4;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        Object objY2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Object objY3;
        b5i b5iVar2;
        int i11;
        int i12;
        boolean z7;
        boolean z8;
        Object objY4;
        int iHashCode6;
        yka.a.C1350a c1350a;
        int iHashCode7;
        int iHashCode8;
        yka.a.C1350a c1350a2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        boolean zA;
        Object objY5;
        int i13;
        int i14;
        int i15;
        boolean z9;
        Object objY6;
        UiText uiText;
        kw0.d dVar;
        yka.a.d dVar2;
        tsr.a aVar2;
        yka.a.c cVar2;
        yka.a.C1350a c1350a3;
        b bVar3;
        n54.b bVar4;
        yka.a.b bVar5;
        int iHashCode9;
        boolean z10;
        Object objY7;
        int iHashCode10;
        boolean z11;
        Object objY8;
        androidx.compose.runtime.a.C0041a.C0042a c0042a3;
        b bVar6;
        int iHashCode11;
        int iHashCode12;
        boolean z12;
        Object objY9;
        int iHashCode13;
        tsr.a aVar3;
        yka.a.C1350a c1350a4;
        Function0 function8 = function5;
        wd7.a(str, str2, str3, str4);
        b bVarI = aVar.i(-1464034113);
        if ((i & 6) == 0) {
            i3 = (bVarI.d(orderBetType == null ? -1 : orderBetType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i3;
        if ((i & 48) == 0) {
            i4 = i16 | (bVarI.M(str) ? 32 : 16);
        } else {
            i4 = i16;
        }
        if ((i & 384) == 0) {
            i4 |= bVarI.M(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.M(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= bVarI.b(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= bVarI.b(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= bVarI.d(uxsVar != null ? uxsVar.ordinal() : -1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= (134217728 & i) == 0 ? bVarI.M(kmnVar) : bVarI.A(kmnVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= bVarI.A(function1) ? 536870912 : 268435456;
        }
        int i17 = i4;
        if ((i2 & 6) == 0) {
            i5 = (bVarI.A(function2) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.A(function3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.A(function4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= bVarI.A(function8) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= bVarI.A(function6) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= bVarI.A(function7) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= bVarI.M(str4) ? 8388608 : 4194304;
        }
        if (bVarI.q(i17 & 1, ((i17 & 306783379) == 306783378 && (4793491 & i5) == 4793490) ? false : true)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            k4i k4iVar = (k4i) bVarI.O(kna.i);
            final boolean zC = gky.c((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            Object objY10 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a4 = androidx.compose.runtime.a.C0041a.a;
            if (objY10 == c0042a4) {
                objY10 = new b5i();
                bVarI.r(objY10);
            }
            b5i b5iVar3 = (b5i) objY10;
            Object objY11 = bVarI.y();
            if (objY11 == c0042a4) {
                objY11 = new b5i();
                bVarI.r(objY11);
            }
            b5i b5iVar4 = (b5i) objY11;
            d.a aVar4 = d.a.b;
            d dVarH = g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_content");
            kw0.k kVar = kw0.c;
            n54.a aVar5 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar5, bVarI, 0);
            int iHashCode14 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO = bVarI.o();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar6 = yka.a.b;
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            yka.a.b bVar7 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar7);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarO, dVar3);
            yka.a.C1350a c1350a5 = yka.a.g;
            if (bVarI.g()) {
                i6 = i5;
            } else {
                i6 = i5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode14))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarH2 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_bet_type_row");
                kw0.g gVar = kw0.g;
                bVar2 = ht.a.k;
                d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
                iHashCode = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO2 = bVarI.o();
                d dVarC2 = c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar7);
                hlh0.a(bVarI, ne00VarO2, dVar3);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a5);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                i7 = i6;
                lkf0.d(cb40.a(R.string.component_betslip__bet_type, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_bet_type_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
                i8 = a.a[orderBetType.ordinal()];
                if (i8 != 1) {
                    bVarI.N(-1098565153);
                    strA = cb40.a(R.string.component_betslip__single, new Object[0], bVarI);
                    bVarI.H();
                } else if (i8 != 2) {
                    bVarI.N(304408345);
                    bVarI.H();
                    strA = "";
                } else {
                    bVarI.N(-1098561823);
                    strA = cb40.a(R.string.component_betslip__multiple, new Object[0], bVarI);
                    bVarI.H();
                }
                lkf0.d(strA, g3w.h(aVar4, "auto_bet_create_bet_type_value"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 48, 0, 131064);
                bVarI.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
                d dVarH3 = g3w.h(h.g(androidx.compose.foundation.a.c(c68.a(R.color.transparent, bVarI), j.g(aVar4, 1.0f)), 24.0f, 8.0f), "auto_bet_create_outcome_row");
                d160 d160VarA2 = b160.a(gVar, bVar2, bVarI, 54);
                iHashCode2 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO3 = bVarI.o();
                d dVarC3 = c.c(bVarI, dVarH3);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar7);
                hlh0.a(bVarI, ne00VarO3, dVar3);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a5);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                lkf0.d(cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_outcome_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
                d040.a(1.0f, true, bVarI);
                aza.a(g3w.h(aVar4, "auto_bet_choose_outcome_button"), cb40.a(R.string.component_betslip__choose_outcome, new Object[0], bVarI), uxs.ENABLE, null, alb0.a(sya.b, g7f.a(36.0f), null, 0L, 0.0f, 29), null, null, null, function7, null, bVarI, 390 | ((i7 << 6) & 234881024), 744);
                bVarI.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
                d dVarH4 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_odds_row");
                d160 d160VarA3 = b160.a(gVar, bVar2, bVarI, 54);
                iHashCode3 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO4 = bVarI.o();
                d dVarC4 = c.c(bVarI, dVarH4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, bVar7);
                hlh0.a(bVarI, ne00VarO4, dVar3);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a5);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                i78 i78VarA2 = g78.a(kVar, aVar5, bVarI, 0);
                iHashCode4 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO5 = bVarI.o();
                d dVarC5 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, bVar7);
                hlh0.a(bVarI, ne00VarO5, dVar3);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a5);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                lkf0.d(cb40.a(R.string.common_functions__odds_txt, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_odds_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
                bVarI.s();
                d160 d160VarA4 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar2, bVarI, 54);
                iHashCode5 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO6 = bVarI.o();
                d dVarC6 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA4, bVar7);
                hlh0.a(bVarI, ne00VarO6, dVar3);
                if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVarI, iHashCode5, c1350a5);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                xln xlnVar2 = kmnVar.a;
                xlnVar = kmnVar.c;
                String str5 = xlnVar2.a;
                gop gopVar = new gop(9, 6, 115);
                objY = bVarI.y();
                if (objY == c0042a4) {
                    b5iVar = b5iVar3;
                    objY = new f3g(b5iVar, 0);
                    bVarI.r(objY);
                } else {
                    b5iVar = b5iVar3;
                }
                tnp tnpVar = new tnp(null, (Function1) objY, null, 59);
                imf0 imf0VarB = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var = new soa0(c68.a(R.color.text_primary, bVarI));
                d dVarI = j.i(j.w(aVar4, 76.0f), 30.0f);
                z4 = kmnVar.a.b;
                i9 = R.color.border_danger;
                if (z4) {
                    i10 = 503084501;
                } else {
                    i10 = 503087000;
                    i9 = R.color.border_secondary;
                }
                d dVarH5 = g3w.h(h.h(d35.a(dVarI, 1.0f, dr2.a(i10, i9, bVarI, bVarI), j060.c(2.0f)), 5.0f, 0.0f, 2), "auto_bet_create_min_odds_input");
                boolean zB = bVarI.b(zC);
                if ((i17 & 1879048192) == 536870912) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | zB;
                objY2 = bVarI.y();
                if (z6) {
                    c0042a = c0042a4;
                } else {
                    c0042a = c0042a4;
                    if (objY2 == c0042a) {
                    }
                    ab2.b(str5, (Function1) objY2, dVarH5, false, false, imf0VarB, gopVar, tnpVar, true, 0, 0, null, null, null, soa0Var, pp8.b(-1832142676, new gaj() { // from class: d3g
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Function2 function9 = (Function2) obj;
                            a aVar7 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function9.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar7.A(function9) ? 4 : 2;
                            }
                            int i18 = iIntValue;
                            if (aVar7.q(i18 & 1, (i18 & 19) != 18)) {
                                aiv aivVarC = g75.c(ht.a.f, false);
                                int iHashCode15 = Long.hashCode(aVar7.m());
                                ne00 ne00VarO7 = aVar7.o();
                                d.a aVar8 = d.a.b;
                                d dVarC7 = c.c(aVar7, aVar8);
                                yka.k.getClass();
                                tsr.a aVar9 = yka.a.b;
                                if (aVar7.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar7.D();
                                if (aVar7.g()) {
                                    aVar7.F(aVar9);
                                } else {
                                    aVar7.p();
                                }
                                hlh0.a(aVar7, aivVarC, yka.a.f);
                                hlh0.a(aVar7, ne00VarO7, yka.a.e);
                                yka.a.C1350a c1350a6 = yka.a.g;
                                if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode15))) {
                                    j3c.a(iHashCode15, aVar7, iHashCode15, c1350a6);
                                }
                                hlh0.a(aVar7, dVarC7, yka.a.d);
                                if (kmnVar.a.a.length() == 0) {
                                    aVar7.N(909945492);
                                    lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar7), j.g(aVar8, 1.0f), c68.a(R.color.text_placeholder, aVar7), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar7), aVar7, 48, 0, 130040);
                                    aVar7 = aVar7;
                                    aVar7.H();
                                } else {
                                    aVar7.N(910413468);
                                    aVar7.H();
                                }
                                ps.a(i18 & 14, aVar7, function9);
                            } else {
                                aVar7.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 102236160, 196608, 15896);
                    lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 6, 0, 131066);
                    String str6 = kmnVar.b.a;
                    gop gopVar2 = new gop(9, 6, 115);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        b5iVar2 = b5iVar4;
                        objY3 = new k3g(b5iVar2, 0);
                        bVarI.r(objY3);
                    } else {
                        b5iVar2 = b5iVar4;
                    }
                    b5i b5iVar5 = b5iVar2;
                    tnp tnpVar2 = new tnp(null, (Function1) objY3, null, 59);
                    imf0 imf0VarB2 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                    soa0 soa0Var2 = new soa0(c68.a(R.color.text_primary, bVarI));
                    d dVarI2 = j.i(j.w(aVar4, 76.0f), 30.0f);
                    if (kmnVar.b.b) {
                        i11 = 503174517;
                        i12 = R.color.border_danger;
                    } else {
                        i11 = 503177016;
                        i12 = R.color.border_secondary;
                    }
                    d dVarH6 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI2, 1.0f, dr2.a(i11, i12, bVarI, bVarI), j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2), "auto_bet_create_max_odds_input");
                    boolean zB2 = bVarI.b(zC);
                    if ((i7 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zB2 | z7;
                    objY4 = bVarI.y();
                    if (z8 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: l3g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String str7 = (String) obj;
                                str7.getClass();
                                Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                                if (str7.length() == 0 || regex.f(str7)) {
                                    function2.invoke(str7);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    ab2.b(str6, (Function1) objY4, dVarH6, false, false, imf0VarB2, gopVar2, tnpVar2, true, 0, 0, null, null, null, soa0Var2, pp8.b(755874901, new m3g(kmnVar, 0), bVarI), bVarI, 102236160, 196608, 15896);
                    bVarI.s();
                    bVarI.s();
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
                    d dVarH7 = g3w.h(h.i(j.g(aVar4, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                    d160 d160VarA5 = b160.a(gVar, bVar2, bVarI, 54);
                    iHashCode6 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO7 = bVarI.o();
                    d dVarC7 = c.c(bVarI, dVarH7);
                    bVarI.D();
                    if (bVarI.g()) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA5, bVar7);
                    hlh0.a(bVarI, ne00VarO7, dVar3);
                    if (bVarI.g() && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                        c1350a = c1350a5;
                    } else {
                        c1350a = c1350a5;
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    }
                    hlh0.a(bVarI, dVarC7, cVar);
                    i78 i78VarA3 = g78.a(kVar, aVar5, bVarI, 0);
                    iHashCode7 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO8 = bVarI.o();
                    d dVarC8 = c.c(bVarI, aVar4);
                    bVarI.D();
                    if (bVarI.g()) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA3, bVar7);
                    hlh0.a(bVarI, ne00VarO8, dVar3);
                    if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                        n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                    }
                    hlh0.a(bVarI, dVarC8, cVar);
                    lkf0.d("Stake", g3w.h(aVar4, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 54, 0, 131064);
                    lkf0.d(str4, g3w.h(aVar4, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i7 >> 21) & 14) | 48, 0, 131064);
                    bVarI.s();
                    d160 d160VarA6 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, bVarI, 54);
                    iHashCode8 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO9 = bVarI.o();
                    d dVarC9 = c.c(bVarI, aVar4);
                    bVarI.D();
                    if (bVarI.g()) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA6, bVar7);
                    hlh0.a(bVarI, ne00VarO9, dVar3);
                    if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode8))) {
                        n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
                    }
                    hlh0.a(bVarI, dVarC9, cVar);
                    c1350a2 = c1350a;
                    c0042a2 = c0042a;
                    lkf0.d(str, g3w.h(aVar4, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, ((i17 >> 3) & 14) | 48, 0, 131064);
                    String str7 = xlnVar.a;
                    gop gopVar3 = new gop(3, 7, 115);
                    zA = bVarI.A(k4iVar);
                    objY5 = bVarI.y();
                    if (!zA || objY5 == c0042a2) {
                        i13 = 2;
                        objY5 = new sg7(k4iVar, 2);
                        bVarI.r(objY5);
                    } else {
                        i13 = 2;
                    }
                    tnp tnpVar3 = new tnp((Function1) objY5, null, null, 62);
                    imf0 imf0VarB3 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                    soa0 soa0Var3 = new soa0(c68.a(R.color.text_primary, bVarI));
                    d dVarI3 = j.i(j.w(aVar4, 136.0f), 30.0f);
                    if (xlnVar.b) {
                        i14 = 1737155124;
                        i15 = R.color.border_danger;
                    } else {
                        i14 = 1737157623;
                        i15 = R.color.border_secondary;
                    }
                    d dVarH8 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI3, 1.0f, dr2.a(i14, i15, bVarI, bVarI), j060.c(2.0f)), b5iVar5), 5.0f, 0.0f, i13), "auto_bet_create_stake_input");
                    if ((i7 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objY6 = bVarI.y();
                    if (z9 || objY6 == c0042a2) {
                        objY6 = new n3g(0, function3);
                        bVarI.r(objY6);
                    }
                    ab2.b(str7, (Function1) objY6, dVarH8, false, false, imf0VarB3, gopVar3, tnpVar3, true, 0, 0, null, null, null, soa0Var3, pp8.b(1757964299, new gaj() { // from class: o3g
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar7;
                            Function2 function9 = (Function2) obj;
                            a aVar8 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            function9.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar8.A(function9) ? 4 : 2;
                            }
                            int i18 = iIntValue;
                            if (aVar8.q(i18 & 1, (i18 & 19) != 18)) {
                                aiv aivVarC = g75.c(ht.a.f, false);
                                int iHashCode15 = Long.hashCode(aVar8.m());
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
                                hlh0.a(aVar8, aivVarC, yka.a.f);
                                hlh0.a(aVar8, ne00VarO10, yka.a.e);
                                yka.a.C1350a c1350a6 = yka.a.g;
                                if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode15))) {
                                    j3c.a(iHashCode15, aVar8, iHashCode15, c1350a6);
                                }
                                hlh0.a(aVar8, dVarC10, yka.a.d);
                                if (kmnVar.c.a.length() == 0) {
                                    aVar8.N(511229408);
                                    imf0 imf0VarL = mla.l(R.style.B1_M, aVar8);
                                    lkf0.d(str2, j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar8, 48, 0, 130040);
                                    aVar7 = aVar8;
                                    aVar7.H();
                                } else {
                                    aVar7 = aVar8;
                                    aVar7.N(511656061);
                                    aVar7.H();
                                }
                                ps.a(i18 & 14, aVar7, function9);
                            } else {
                                aVar8.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 102236160, 196608, 15896);
                    bVarI.s();
                    bVarI.s();
                    uiText = xlnVar.c;
                    dVar = kw0.b;
                    if (uiText != null) {
                        bVarI.N(-605949145);
                        d dVarI4 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA7 = b160.a(dVar, bVar2, bVarI, 54);
                        iHashCode13 = Long.hashCode(l2a.a(bVarI));
                        ne00 ne00VarO10 = bVarI.o();
                        d dVarC10 = c.c(bVarI, dVarI4);
                        bVarI.D();
                        if (bVarI.g()) {
                            aVar3 = aVar6;
                            bVarI.F(aVar3);
                        } else {
                            aVar3 = aVar6;
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA7, bVar7);
                        hlh0.a(bVarI, ne00VarO10, dVar3);
                        if (bVarI.g() && Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode13))) {
                            c1350a4 = c1350a2;
                        } else {
                            c1350a4 = c1350a2;
                            n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                        }
                        hlh0.a(bVarI, dVarC10, cVar);
                        lkf0.d(vch0.a(xlnVar.c, bVarI), g3w.h(aVar4, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 24576, 113656);
                        bVarI.s();
                        bVarI.H();
                        dVar2 = dVar3;
                        cVar2 = cVar;
                        aVar2 = aVar3;
                        bVar4 = bVar2;
                        c1350a3 = c1350a4;
                        bVar3 = bVarI;
                        bVar5 = bVar7;
                    } else {
                        dVar2 = dVar3;
                        if (z) {
                            bVarI.N(-605153096);
                            d dVarI5 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                            d160 d160VarA8 = b160.a(dVar, bVar2, bVarI, 54);
                            iHashCode9 = Long.hashCode(l2a.a(bVarI));
                            ne00 ne00VarO11 = bVarI.o();
                            d dVarC11 = c.c(bVarI, dVarI5);
                            bVarI.D();
                            if (bVarI.g()) {
                                bVarI.F(aVar6);
                            } else {
                                bVarI.p();
                            }
                            hlh0.a(bVarI, d160VarA8, bVar7);
                            hlh0.a(bVarI, ne00VarO11, dVar2);
                            if (bVarI.g() || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                                n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                            }
                            hlh0.a(bVarI, dVarC11, cVar);
                            lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVarI).concat(", "), null, c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                            if ((458752 & i7) == 131072) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objY7 = bVarI.y();
                            if (z10 || objY7 == c0042a2) {
                                objY7 = new x6z(function6, 2);
                                bVarI.r(objY7);
                            }
                            lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[0], bVarI), g3w.h(g3w.f(aVar4, true, (Function0) objY7), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
                            d dVarR = j.r(aVar4, 12.0f);
                            aVar2 = aVar6;
                            cVar2 = cVar;
                            c1350a3 = c1350a2;
                            bVar5 = bVar7;
                            bVar4 = bVar2;
                            h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, dVarR, c68.a(R.color.text_brand_sub_primary_d_base, bVarI), bVarI, 432, 0);
                            bVar3 = bVarI;
                            bVar3.s();
                            bVar3.H();
                        } else {
                            aVar2 = aVar6;
                            cVar2 = cVar;
                            c1350a3 = c1350a2;
                            bVar3 = bVarI;
                            bVar4 = bVar2;
                            bVar5 = bVar7;
                            bVar3.N(-603799047);
                            bVar3.H();
                        }
                    }
                    ty0.a(bVar3, j.i(aVar4, 8.0f));
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar3), bVar3, 48, 1);
                    d dVarH9 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_terms_row");
                    kw0.j jVar = kw0.a;
                    d160 d160VarA9 = b160.a(jVar, bVar4, bVar3, 48);
                    iHashCode10 = Long.hashCode(l2a.a(bVar3));
                    ne00 ne00VarO12 = bVar3.o();
                    d dVarC12 = c.c(bVar3, dVarH9);
                    bVar3.D();
                    if (bVar3.g()) {
                        bVar3.F(aVar2);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, d160VarA9, bVar5);
                    hlh0.a(bVar3, ne00VarO12, dVar2);
                    if (bVar3.g() || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode10))) {
                        n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
                    }
                    hlh0.a(bVar3, dVarC12, cVar2);
                    String strA2 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar3);
                    if ((i7 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objY8 = bVar3.y();
                    if (z11) {
                        c0042a3 = r13;
                    } else {
                        c0042a3 = c0042a2;
                        if (objY8 == c0042a3) {
                        }
                        androidx.compose.runtime.a.C0041a.C0042a c0042a5 = c0042a3;
                        bVar6 = bVar3;
                        b(null, strA2, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                        bVar6.s();
                        ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                        d dVarG = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                        d160 d160VarA10 = b160.a(jVar, bVar4, bVar6, 48);
                        iHashCode11 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO13 = bVar6.o();
                        d dVarC13 = c.c(bVar6, dVarG);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar2);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, d160VarA10, bVar5);
                        hlh0.a(bVar6, ne00VarO13, dVar2);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode11))) {
                            n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC13, cVar2);
                        d dVarG2 = j.g(aVar4, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        iHashCode12 = Long.hashCode(l2a.a(bVar6));
                        ne00 ne00VarO14 = bVar6.o();
                        d dVarC14 = c.c(bVar6, dVarG2);
                        bVar6.D();
                        if (bVar6.g()) {
                            bVar6.F(aVar2);
                        } else {
                            bVar6.p();
                        }
                        hlh0.a(bVar6, aivVarC, bVar5);
                        hlh0.a(bVar6, ne00VarO14, dVar2);
                        if (bVar6.g() || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode12))) {
                            n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                        }
                        hlh0.a(bVar6, dVarC14, cVar2);
                        uxsVar2 = uxsVar;
                        aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                        bVar = bVar6;
                        if (uxsVar2 == uxs.DISABLE) {
                            bVar.N(597169397);
                            d dVarF = androidx.compose.foundation.layout.d.a.f(aVar4);
                            if ((i7 & 57344) == 16384) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objY9 = bVar.y();
                            if (!z12 || objY9 == c0042a5) {
                                function8 = function5;
                                objY9 = new dh7(function8, 1);
                                bVar.r(objY9);
                            } else {
                                function8 = function5;
                            }
                            g75.a(g3w.f(dVarF, true, (Function0) objY9), bVar, 0);
                            bVar.H();
                        } else {
                            function8 = function5;
                            bVar.N(597393310);
                            bVar.H();
                        }
                        bVar.s();
                        bVar.s();
                        bVar.s();
                    }
                    objY8 = new p3g(function4, 0);
                    bVar3.r(objY8);
                    androidx.compose.runtime.a.C0041a.C0042a c0042a6 = c0042a3;
                    bVar6 = bVar3;
                    b(null, strA2, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                    bVar6.s();
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                    d dVarG3 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                    d160 d160VarA11 = b160.a(jVar, bVar4, bVar6, 48);
                    iHashCode11 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO15 = bVar6.o();
                    d dVarC15 = c.c(bVar6, dVarG3);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, d160VarA11, bVar5);
                    hlh0.a(bVar6, ne00VarO15, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    } else {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC15, cVar2);
                    d dVarG4 = j.g(aVar4, 1.0f);
                    aiv aivVarC2 = g75.c(ht.a.a, false);
                    iHashCode12 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO16 = bVar6.o();
                    d dVarC16 = c.c(bVar6, dVarG4);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, aivVarC2, bVar5);
                    hlh0.a(bVar6, ne00VarO16, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    } else {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC16, cVar2);
                    uxsVar2 = uxsVar;
                    aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                    bVar = bVar6;
                    if (uxsVar2 == uxs.DISABLE) {
                        bVar.N(597169397);
                        d dVarF2 = androidx.compose.foundation.layout.d.a.f(aVar4);
                        if ((i7 & 57344) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objY9 = bVar.y();
                        if (z12) {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        } else {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        }
                        g75.a(g3w.f(dVarF2, true, (Function0) objY9), bVar, 0);
                        bVar.H();
                    } else {
                        function8 = function5;
                        bVar.N(597393310);
                        bVar.H();
                    }
                    bVar.s();
                    bVar.s();
                    bVar.s();
                }
                objY2 = new Function1() { // from class: g3g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str8 = (String) obj;
                        str8.getClass();
                        Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                        if (str8.length() == 0 || regex.f(str8)) {
                            function1.invoke(str8);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
                ab2.b(str5, (Function1) objY2, dVarH5, false, false, imf0VarB, gopVar, tnpVar, true, 0, 0, null, null, null, soa0Var, pp8.b(-1832142676, new gaj() { // from class: d3g
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Function2 function9 = (Function2) obj;
                        a aVar7 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function9.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar7.A(function9) ? 4 : 2;
                        }
                        int i18 = iIntValue;
                        if (aVar7.q(i18 & 1, (i18 & 19) != 18)) {
                            aiv aivVarC3 = g75.c(ht.a.f, false);
                            int iHashCode15 = Long.hashCode(aVar7.m());
                            ne00 ne00VarO17 = aVar7.o();
                            d.a aVar8 = d.a.b;
                            d dVarC17 = c.c(aVar7, aVar8);
                            yka.k.getClass();
                            tsr.a aVar9 = yka.a.b;
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar7.F(aVar9);
                            } else {
                                aVar7.p();
                            }
                            hlh0.a(aVar7, aivVarC3, yka.a.f);
                            hlh0.a(aVar7, ne00VarO17, yka.a.e);
                            yka.a.C1350a c1350a6 = yka.a.g;
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode15))) {
                                j3c.a(iHashCode15, aVar7, iHashCode15, c1350a6);
                            }
                            hlh0.a(aVar7, dVarC17, yka.a.d);
                            if (kmnVar.a.a.length() == 0) {
                                aVar7.N(909945492);
                                lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar7), j.g(aVar8, 1.0f), c68.a(R.color.text_placeholder, aVar7), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar7), aVar7, 48, 0, 130040);
                                aVar7 = aVar7;
                                aVar7.H();
                            } else {
                                aVar7.N(910413468);
                                aVar7.H();
                            }
                            ps.a(i18 & 14, aVar7, function9);
                        } else {
                            aVar7.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 102236160, 196608, 15896);
                lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 6, 0, 131066);
                String str8 = kmnVar.b.a;
                gop gopVar4 = new gop(9, 6, 115);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    b5iVar2 = b5iVar4;
                    objY3 = new k3g(b5iVar2, 0);
                    bVarI.r(objY3);
                } else {
                    b5iVar2 = b5iVar4;
                }
                b5i b5iVar6 = b5iVar2;
                tnp tnpVar4 = new tnp(null, (Function1) objY3, null, 59);
                imf0 imf0VarB4 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var4 = new soa0(c68.a(R.color.text_primary, bVarI));
                d dVarI6 = j.i(j.w(aVar4, 76.0f), 30.0f);
                if (kmnVar.b.b) {
                    i11 = 503174517;
                    i12 = R.color.border_danger;
                } else {
                    i11 = 503177016;
                    i12 = R.color.border_secondary;
                }
                d dVarH10 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI6, 1.0f, dr2.a(i11, i12, bVarI, bVarI), j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2), "auto_bet_create_max_odds_input");
                boolean zB3 = bVarI.b(zC);
                if ((i7 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zB3 | z7;
                objY4 = bVarI.y();
                if (z8) {
                    objY4 = new Function1() { // from class: l3g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str9 = (String) obj;
                            str9.getClass();
                            Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                            if (str9.length() == 0 || regex.f(str9)) {
                                function2.invoke(str9);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: l3g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str9 = (String) obj;
                            str9.getClass();
                            Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                            if (str9.length() == 0 || regex.f(str9)) {
                                function2.invoke(str9);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                ab2.b(str8, (Function1) objY4, dVarH10, false, false, imf0VarB4, gopVar4, tnpVar4, true, 0, 0, null, null, null, soa0Var4, pp8.b(755874901, new m3g(kmnVar, 0), bVarI), bVarI, 102236160, 196608, 15896);
                bVarI.s();
                bVarI.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
                d dVarH11 = g3w.h(h.i(j.g(aVar4, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                d160 d160VarA12 = b160.a(gVar, bVar2, bVarI, 54);
                iHashCode6 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO17 = bVarI.o();
                d dVarC17 = c.c(bVarI, dVarH11);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA12, bVar7);
                hlh0.a(bVarI, ne00VarO17, dVar3);
                if (bVarI.g()) {
                    c1350a = c1350a5;
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                } else {
                    c1350a = c1350a5;
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC17, cVar);
                i78 i78VarA4 = g78.a(kVar, aVar5, bVarI, 0);
                iHashCode7 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO18 = bVarI.o();
                d dVarC18 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA4, bVar7);
                hlh0.a(bVarI, ne00VarO18, dVar3);
                if (bVarI.g()) {
                    n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                } else {
                    n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                }
                hlh0.a(bVarI, dVarC18, cVar);
                lkf0.d("Stake", g3w.h(aVar4, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 54, 0, 131064);
                lkf0.d(str4, g3w.h(aVar4, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i7 >> 21) & 14) | 48, 0, 131064);
                bVarI.s();
                d160 d160VarA13 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, bVarI, 54);
                iHashCode8 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO19 = bVarI.o();
                d dVarC19 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA13, bVar7);
                hlh0.a(bVarI, ne00VarO19, dVar3);
                if (bVarI.g()) {
                    n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
                } else {
                    n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
                }
                hlh0.a(bVarI, dVarC19, cVar);
                c1350a2 = c1350a;
                c0042a2 = c0042a;
                lkf0.d(str, g3w.h(aVar4, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, ((i17 >> 3) & 14) | 48, 0, 131064);
                String str9 = xlnVar.a;
                gop gopVar5 = new gop(3, 7, 115);
                zA = bVarI.A(k4iVar);
                objY5 = bVarI.y();
                if (zA) {
                    i13 = 2;
                    objY5 = new sg7(k4iVar, 2);
                    bVarI.r(objY5);
                } else {
                    i13 = 2;
                    objY5 = new sg7(k4iVar, 2);
                    bVarI.r(objY5);
                }
                tnp tnpVar5 = new tnp((Function1) objY5, null, null, 62);
                imf0 imf0VarB5 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var5 = new soa0(c68.a(R.color.text_primary, bVarI));
                d dVarI7 = j.i(j.w(aVar4, 136.0f), 30.0f);
                if (xlnVar.b) {
                    i14 = 1737155124;
                    i15 = R.color.border_danger;
                } else {
                    i14 = 1737157623;
                    i15 = R.color.border_secondary;
                }
                d dVarH12 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI7, 1.0f, dr2.a(i14, i15, bVarI, bVarI), j060.c(2.0f)), b5iVar6), 5.0f, 0.0f, i13), "auto_bet_create_stake_input");
                if ((i7 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objY6 = bVarI.y();
                if (z9) {
                    objY6 = new n3g(0, function3);
                    bVarI.r(objY6);
                } else {
                    objY6 = new n3g(0, function3);
                    bVarI.r(objY6);
                }
                ab2.b(str9, (Function1) objY6, dVarH12, false, false, imf0VarB5, gopVar5, tnpVar5, true, 0, 0, null, null, null, soa0Var5, pp8.b(1757964299, new gaj() { // from class: o3g
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar7;
                        Function2 function9 = (Function2) obj;
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function9.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar8.A(function9) ? 4 : 2;
                        }
                        int i18 = iIntValue;
                        if (aVar8.q(i18 & 1, (i18 & 19) != 18)) {
                            aiv aivVarC3 = g75.c(ht.a.f, false);
                            int iHashCode15 = Long.hashCode(aVar8.m());
                            ne00 ne00VarO110 = aVar8.o();
                            d.a aVar9 = d.a.b;
                            d dVarC110 = c.c(aVar8, aVar9);
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
                            hlh0.a(aVar8, aivVarC3, yka.a.f);
                            hlh0.a(aVar8, ne00VarO110, yka.a.e);
                            yka.a.C1350a c1350a6 = yka.a.g;
                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode15))) {
                                j3c.a(iHashCode15, aVar8, iHashCode15, c1350a6);
                            }
                            hlh0.a(aVar8, dVarC110, yka.a.d);
                            if (kmnVar.c.a.length() == 0) {
                                aVar8.N(511229408);
                                imf0 imf0VarL = mla.l(R.style.B1_M, aVar8);
                                lkf0.d(str2, j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar8, 48, 0, 130040);
                                aVar7 = aVar8;
                                aVar7.H();
                            } else {
                                aVar7 = aVar8;
                                aVar7.N(511656061);
                                aVar7.H();
                            }
                            ps.a(i18 & 14, aVar7, function9);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 102236160, 196608, 15896);
                bVarI.s();
                bVarI.s();
                uiText = xlnVar.c;
                dVar = kw0.b;
                if (uiText != null) {
                    bVarI.N(-605949145);
                    d dVarI8 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA14 = b160.a(dVar, bVar2, bVarI, 54);
                    iHashCode13 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO110 = bVarI.o();
                    d dVarC110 = c.c(bVarI, dVarI8);
                    bVarI.D();
                    if (bVarI.g()) {
                        aVar3 = aVar6;
                        bVarI.F(aVar3);
                    } else {
                        aVar3 = aVar6;
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA14, bVar7);
                    hlh0.a(bVarI, ne00VarO110, dVar3);
                    if (bVarI.g()) {
                        c1350a4 = c1350a2;
                        n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                    } else {
                        c1350a4 = c1350a2;
                        n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                    }
                    hlh0.a(bVarI, dVarC110, cVar);
                    lkf0.d(vch0.a(xlnVar.c, bVarI), g3w.h(aVar4, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 24576, 113656);
                    bVarI.s();
                    bVarI.H();
                    dVar2 = dVar3;
                    cVar2 = cVar;
                    aVar2 = aVar3;
                    bVar4 = bVar2;
                    c1350a3 = c1350a4;
                    bVar3 = bVarI;
                    bVar5 = bVar7;
                } else {
                    dVar2 = dVar3;
                    if (z) {
                        bVarI.N(-605153096);
                        d dVarI9 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA15 = b160.a(dVar, bVar2, bVarI, 54);
                        iHashCode9 = Long.hashCode(l2a.a(bVarI));
                        ne00 ne00VarO111 = bVarI.o();
                        d dVarC111 = c.c(bVarI, dVarI9);
                        bVarI.D();
                        if (bVarI.g()) {
                            bVarI.F(aVar6);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA15, bVar7);
                        hlh0.a(bVarI, ne00VarO111, dVar2);
                        if (bVarI.g()) {
                            n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                        } else {
                            n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC111, cVar);
                        lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVarI).concat(", "), null, c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                        if ((458752 & i7) == 131072) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objY7 = bVarI.y();
                        if (z10) {
                            objY7 = new x6z(function6, 2);
                            bVarI.r(objY7);
                        } else {
                            objY7 = new x6z(function6, 2);
                            bVarI.r(objY7);
                        }
                        lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[0], bVarI), g3w.h(g3w.f(aVar4, true, (Function0) objY7), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
                        d dVarR2 = j.r(aVar4, 12.0f);
                        aVar2 = aVar6;
                        cVar2 = cVar;
                        c1350a3 = c1350a2;
                        bVar5 = bVar7;
                        bVar4 = bVar2;
                        h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, dVarR2, c68.a(R.color.text_brand_sub_primary_d_base, bVarI), bVarI, 432, 0);
                        bVar3 = bVarI;
                        bVar3.s();
                        bVar3.H();
                    } else {
                        aVar2 = aVar6;
                        cVar2 = cVar;
                        c1350a3 = c1350a2;
                        bVar3 = bVarI;
                        bVar4 = bVar2;
                        bVar5 = bVar7;
                        bVar3.N(-603799047);
                        bVar3.H();
                    }
                }
                ty0.a(bVar3, j.i(aVar4, 8.0f));
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar3), bVar3, 48, 1);
                d dVarH13 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_terms_row");
                kw0.j jVar2 = kw0.a;
                d160 d160VarA16 = b160.a(jVar2, bVar4, bVar3, 48);
                iHashCode10 = Long.hashCode(l2a.a(bVar3));
                ne00 ne00VarO112 = bVar3.o();
                d dVarC112 = c.c(bVar3, dVarH13);
                bVar3.D();
                if (bVar3.g()) {
                    bVar3.F(aVar2);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, d160VarA16, bVar5);
                hlh0.a(bVar3, ne00VarO112, dVar2);
                if (bVar3.g()) {
                    n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
                } else {
                    n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
                }
                hlh0.a(bVar3, dVarC112, cVar2);
                String strA3 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar3);
                if ((i7 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY8 = bVar3.y();
                if (z11) {
                    c0042a3 = c0042a2;
                    if (objY8 == c0042a3) {
                    }
                    androidx.compose.runtime.a.C0041a.C0042a c0042a7 = c0042a3;
                    bVar6 = bVar3;
                    b(null, strA3, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                    bVar6.s();
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                    d dVarG5 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                    d160 d160VarA17 = b160.a(jVar2, bVar4, bVar6, 48);
                    iHashCode11 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO113 = bVar6.o();
                    d dVarC113 = c.c(bVar6, dVarG5);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, d160VarA17, bVar5);
                    hlh0.a(bVar6, ne00VarO113, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    } else {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC113, cVar2);
                    d dVarG6 = j.g(aVar4, 1.0f);
                    aiv aivVarC3 = g75.c(ht.a.a, false);
                    iHashCode12 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO114 = bVar6.o();
                    d dVarC114 = c.c(bVar6, dVarG6);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, aivVarC3, bVar5);
                    hlh0.a(bVar6, ne00VarO114, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    } else {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC114, cVar2);
                    uxsVar2 = uxsVar;
                    aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                    bVar = bVar6;
                    if (uxsVar2 == uxs.DISABLE) {
                        bVar.N(597169397);
                        d dVarF3 = androidx.compose.foundation.layout.d.a.f(aVar4);
                        if ((i7 & 57344) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objY9 = bVar.y();
                        if (z12) {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        } else {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        }
                        g75.a(g3w.f(dVarF3, true, (Function0) objY9), bVar, 0);
                        bVar.H();
                    } else {
                        function8 = function5;
                        bVar.N(597393310);
                        bVar.H();
                    }
                    bVar.s();
                    bVar.s();
                    bVar.s();
                } else {
                    c0042a3 = r13;
                }
                objY8 = new p3g(function4, 0);
                bVar3.r(objY8);
                androidx.compose.runtime.a.C0041a.C0042a c0042a8 = c0042a3;
                bVar6 = bVar3;
                b(null, strA3, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                bVar6.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                d dVarG7 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                d160 d160VarA18 = b160.a(jVar2, bVar4, bVar6, 48);
                iHashCode11 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO115 = bVar6.o();
                d dVarC115 = c.c(bVar6, dVarG7);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, d160VarA18, bVar5);
                hlh0.a(bVar6, ne00VarO115, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                } else {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                }
                hlh0.a(bVar6, dVarC115, cVar2);
                d dVarG8 = j.g(aVar4, 1.0f);
                aiv aivVarC4 = g75.c(ht.a.a, false);
                iHashCode12 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO116 = bVar6.o();
                d dVarC116 = c.c(bVar6, dVarG8);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC4, bVar5);
                hlh0.a(bVar6, ne00VarO116, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                } else {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                }
                hlh0.a(bVar6, dVarC116, cVar2);
                uxsVar2 = uxsVar;
                aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                bVar = bVar6;
                if (uxsVar2 == uxs.DISABLE) {
                    bVar.N(597169397);
                    d dVarF4 = androidx.compose.foundation.layout.d.a.f(aVar4);
                    if ((i7 & 57344) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY9 = bVar.y();
                    if (z12) {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    } else {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    }
                    g75.a(g3w.f(dVarF4, true, (Function0) objY9), bVar, 0);
                    bVar.H();
                } else {
                    function8 = function5;
                    bVar.N(597393310);
                    bVar.H();
                }
                bVar.s();
                bVar.s();
                bVar.s();
            }
            n30.a(iHashCode14, bVarI, iHashCode14, c1350a5);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH14 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_bet_type_row");
            kw0.g gVar2 = kw0.g;
            bVar2 = ht.a.k;
            d160 d160VarA19 = b160.a(gVar2, bVar2, bVarI, 54);
            iHashCode = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO20 = bVarI.o();
            d dVarC20 = c.c(bVarI, dVarH14);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA19, bVar7);
            hlh0.a(bVarI, ne00VarO20, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a5);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a5);
            }
            hlh0.a(bVarI, dVarC20, cVar);
            i7 = i6;
            lkf0.d(cb40.a(R.string.component_betslip__bet_type, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_bet_type_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            i8 = a.a[orderBetType.ordinal()];
            if (i8 != 1) {
                bVarI.N(-1098565153);
                strA = cb40.a(R.string.component_betslip__single, new Object[0], bVarI);
                bVarI.H();
            } else if (i8 != 2) {
                bVarI.N(304408345);
                bVarI.H();
                strA = "";
            } else {
                bVarI.N(-1098561823);
                strA = cb40.a(R.string.component_betslip__multiple, new Object[0], bVarI);
                bVarI.H();
            }
            lkf0.d(strA, g3w.h(aVar4, "auto_bet_create_bet_type_value"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 48, 0, 131064);
            bVarI.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarH15 = g3w.h(h.g(androidx.compose.foundation.a.c(c68.a(R.color.transparent, bVarI), j.g(aVar4, 1.0f)), 24.0f, 8.0f), "auto_bet_create_outcome_row");
            d160 d160VarA20 = b160.a(gVar2, bVar2, bVarI, 54);
            iHashCode2 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO21 = bVarI.o();
            d dVarC21 = c.c(bVarI, dVarH15);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA20, bVar7);
            hlh0.a(bVarI, ne00VarO21, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a5);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a5);
            }
            hlh0.a(bVarI, dVarC21, cVar);
            lkf0.d(cb40.a(R.string.component_betslip__outcome, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_outcome_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            d040.a(1.0f, true, bVarI);
            aza.a(g3w.h(aVar4, "auto_bet_choose_outcome_button"), cb40.a(R.string.component_betslip__choose_outcome, new Object[0], bVarI), uxs.ENABLE, null, alb0.a(sya.b, g7f.a(36.0f), null, 0L, 0.0f, 29), null, null, null, function7, null, bVarI, 390 | ((i7 << 6) & 234881024), 744);
            bVarI.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarH16 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_odds_row");
            d160 d160VarA21 = b160.a(gVar2, bVar2, bVarI, 54);
            iHashCode3 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO22 = bVarI.o();
            d dVarC22 = c.c(bVarI, dVarH16);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA21, bVar7);
            hlh0.a(bVarI, ne00VarO22, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a5);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a5);
            }
            hlh0.a(bVarI, dVarC22, cVar);
            i78 i78VarA5 = g78.a(kVar, aVar5, bVarI, 0);
            iHashCode4 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO23 = bVarI.o();
            d dVarC23 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA5, bVar7);
            hlh0.a(bVarI, ne00VarO23, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a5);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a5);
            }
            hlh0.a(bVarI, dVarC23, cVar);
            lkf0.d(cb40.a(R.string.common_functions__odds_txt, new Object[0], bVarI), g3w.h(aVar4, "auto_bet_create_odds_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 48, 0, 131064);
            bVarI.s();
            d160 d160VarA22 = b160.a(new kw0.i(4.0f, true, new hw0()), bVar2, bVarI, 54);
            iHashCode5 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO24 = bVarI.o();
            d dVarC24 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA22, bVar7);
            hlh0.a(bVarI, ne00VarO24, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a5);
            } else {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a5);
            }
            hlh0.a(bVarI, dVarC24, cVar);
            xln xlnVar3 = kmnVar.a;
            xlnVar = kmnVar.c;
            String str10 = xlnVar3.a;
            gop gopVar6 = new gop(9, 6, 115);
            objY = bVarI.y();
            if (objY == c0042a4) {
                b5iVar = b5iVar3;
                objY = new f3g(b5iVar, 0);
                bVarI.r(objY);
            } else {
                b5iVar = b5iVar3;
            }
            tnp tnpVar6 = new tnp(null, (Function1) objY, null, 59);
            imf0 imf0VarB6 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            soa0 soa0Var6 = new soa0(c68.a(R.color.text_primary, bVarI));
            d dVarI10 = j.i(j.w(aVar4, 76.0f), 30.0f);
            z4 = kmnVar.a.b;
            i9 = R.color.border_danger;
            if (z4) {
                i10 = 503084501;
            } else {
                i10 = 503087000;
                i9 = R.color.border_secondary;
            }
            d dVarH17 = g3w.h(h.h(d35.a(dVarI10, 1.0f, dr2.a(i10, i9, bVarI, bVarI), j060.c(2.0f)), 5.0f, 0.0f, 2), "auto_bet_create_min_odds_input");
            boolean zB4 = bVarI.b(zC);
            if ((i17 & 1879048192) == 536870912) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | zB4;
            objY2 = bVarI.y();
            if (z6) {
                c0042a = c0042a4;
                if (objY2 == c0042a) {
                }
                ab2.b(str10, (Function1) objY2, dVarH17, false, false, imf0VarB6, gopVar6, tnpVar6, true, 0, 0, null, null, null, soa0Var6, pp8.b(-1832142676, new gaj() { // from class: d3g
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Function2 function9 = (Function2) obj;
                        a aVar7 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function9.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar7.A(function9) ? 4 : 2;
                        }
                        int i18 = iIntValue;
                        if (aVar7.q(i18 & 1, (i18 & 19) != 18)) {
                            aiv aivVarC5 = g75.c(ht.a.f, false);
                            int iHashCode15 = Long.hashCode(aVar7.m());
                            ne00 ne00VarO117 = aVar7.o();
                            d.a aVar8 = d.a.b;
                            d dVarC117 = c.c(aVar7, aVar8);
                            yka.k.getClass();
                            tsr.a aVar9 = yka.a.b;
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar7.F(aVar9);
                            } else {
                                aVar7.p();
                            }
                            hlh0.a(aVar7, aivVarC5, yka.a.f);
                            hlh0.a(aVar7, ne00VarO117, yka.a.e);
                            yka.a.C1350a c1350a6 = yka.a.g;
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode15))) {
                                j3c.a(iHashCode15, aVar7, iHashCode15, c1350a6);
                            }
                            hlh0.a(aVar7, dVarC117, yka.a.d);
                            if (kmnVar.a.a.length() == 0) {
                                aVar7.N(909945492);
                                lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar7), j.g(aVar8, 1.0f), c68.a(R.color.text_placeholder, aVar7), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar7), aVar7, 48, 0, 130040);
                                aVar7 = aVar7;
                                aVar7.H();
                            } else {
                                aVar7.N(910413468);
                                aVar7.H();
                            }
                            ps.a(i18 & 14, aVar7, function9);
                        } else {
                            aVar7.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 102236160, 196608, 15896);
                lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 6, 0, 131066);
                String str11 = kmnVar.b.a;
                gop gopVar7 = new gop(9, 6, 115);
                objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    b5iVar2 = b5iVar4;
                    objY3 = new k3g(b5iVar2, 0);
                    bVarI.r(objY3);
                } else {
                    b5iVar2 = b5iVar4;
                }
                b5i b5iVar7 = b5iVar2;
                tnp tnpVar7 = new tnp(null, (Function1) objY3, null, 59);
                imf0 imf0VarB7 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var7 = new soa0(c68.a(R.color.text_primary, bVarI));
                d dVarI11 = j.i(j.w(aVar4, 76.0f), 30.0f);
                if (kmnVar.b.b) {
                    i11 = 503174517;
                    i12 = R.color.border_danger;
                } else {
                    i11 = 503177016;
                    i12 = R.color.border_secondary;
                }
                d dVarH18 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI11, 1.0f, dr2.a(i11, i12, bVarI, bVarI), j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2), "auto_bet_create_max_odds_input");
                boolean zB5 = bVarI.b(zC);
                if ((i7 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zB5 | z7;
                objY4 = bVarI.y();
                if (z8) {
                    objY4 = new Function1() { // from class: l3g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str12 = (String) obj;
                            str12.getClass();
                            Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                            if (str12.length() == 0 || regex.f(str12)) {
                                function2.invoke(str12);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: l3g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str12 = (String) obj;
                            str12.getClass();
                            Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                            if (str12.length() == 0 || regex.f(str12)) {
                                function2.invoke(str12);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                ab2.b(str11, (Function1) objY4, dVarH18, false, false, imf0VarB7, gopVar7, tnpVar7, true, 0, 0, null, null, null, soa0Var7, pp8.b(755874901, new m3g(kmnVar, 0), bVarI), bVarI, 102236160, 196608, 15896);
                bVarI.s();
                bVarI.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
                d dVarH19 = g3w.h(h.i(j.g(aVar4, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
                d160 d160VarA110 = b160.a(gVar2, bVar2, bVarI, 54);
                iHashCode6 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO117 = bVarI.o();
                d dVarC117 = c.c(bVarI, dVarH19);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA110, bVar7);
                hlh0.a(bVarI, ne00VarO117, dVar3);
                if (bVarI.g()) {
                    c1350a = c1350a5;
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                } else {
                    c1350a = c1350a5;
                    n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                }
                hlh0.a(bVarI, dVarC117, cVar);
                i78 i78VarA6 = g78.a(kVar, aVar5, bVarI, 0);
                iHashCode7 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO118 = bVarI.o();
                d dVarC118 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA6, bVar7);
                hlh0.a(bVarI, ne00VarO118, dVar3);
                if (bVarI.g()) {
                    n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                } else {
                    n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
                }
                hlh0.a(bVarI, dVarC118, cVar);
                lkf0.d("Stake", g3w.h(aVar4, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 54, 0, 131064);
                lkf0.d(str4, g3w.h(aVar4, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i7 >> 21) & 14) | 48, 0, 131064);
                bVarI.s();
                d160 d160VarA111 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, bVarI, 54);
                iHashCode8 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO119 = bVarI.o();
                d dVarC119 = c.c(bVarI, aVar4);
                bVarI.D();
                if (bVarI.g()) {
                    bVarI.F(aVar6);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA111, bVar7);
                hlh0.a(bVarI, ne00VarO119, dVar3);
                if (bVarI.g()) {
                    n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
                } else {
                    n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
                }
                hlh0.a(bVarI, dVarC119, cVar);
                c1350a2 = c1350a;
                c0042a2 = c0042a;
                lkf0.d(str, g3w.h(aVar4, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, ((i17 >> 3) & 14) | 48, 0, 131064);
                String str12 = xlnVar.a;
                gop gopVar8 = new gop(3, 7, 115);
                zA = bVarI.A(k4iVar);
                objY5 = bVarI.y();
                if (zA) {
                    i13 = 2;
                    objY5 = new sg7(k4iVar, 2);
                    bVarI.r(objY5);
                } else {
                    i13 = 2;
                    objY5 = new sg7(k4iVar, 2);
                    bVarI.r(objY5);
                }
                tnp tnpVar8 = new tnp((Function1) objY5, null, null, 62);
                imf0 imf0VarB8 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
                soa0 soa0Var8 = new soa0(c68.a(R.color.text_primary, bVarI));
                d dVarI12 = j.i(j.w(aVar4, 136.0f), 30.0f);
                if (xlnVar.b) {
                    i14 = 1737155124;
                    i15 = R.color.border_danger;
                } else {
                    i14 = 1737157623;
                    i15 = R.color.border_secondary;
                }
                d dVarH110 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI12, 1.0f, dr2.a(i14, i15, bVarI, bVarI), j060.c(2.0f)), b5iVar7), 5.0f, 0.0f, i13), "auto_bet_create_stake_input");
                if ((i7 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objY6 = bVarI.y();
                if (z9) {
                    objY6 = new n3g(0, function3);
                    bVarI.r(objY6);
                } else {
                    objY6 = new n3g(0, function3);
                    bVarI.r(objY6);
                }
                ab2.b(str12, (Function1) objY6, dVarH110, false, false, imf0VarB8, gopVar8, tnpVar8, true, 0, 0, null, null, null, soa0Var8, pp8.b(1757964299, new gaj() { // from class: o3g
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar7;
                        Function2 function9 = (Function2) obj;
                        a aVar8 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function9.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar8.A(function9) ? 4 : 2;
                        }
                        int i18 = iIntValue;
                        if (aVar8.q(i18 & 1, (i18 & 19) != 18)) {
                            aiv aivVarC5 = g75.c(ht.a.f, false);
                            int iHashCode15 = Long.hashCode(aVar8.m());
                            ne00 ne00VarO1110 = aVar8.o();
                            d.a aVar9 = d.a.b;
                            d dVarC1110 = c.c(aVar8, aVar9);
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
                            hlh0.a(aVar8, aivVarC5, yka.a.f);
                            hlh0.a(aVar8, ne00VarO1110, yka.a.e);
                            yka.a.C1350a c1350a6 = yka.a.g;
                            if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode15))) {
                                j3c.a(iHashCode15, aVar8, iHashCode15, c1350a6);
                            }
                            hlh0.a(aVar8, dVarC1110, yka.a.d);
                            if (kmnVar.c.a.length() == 0) {
                                aVar8.N(511229408);
                                imf0 imf0VarL = mla.l(R.style.B1_M, aVar8);
                                lkf0.d(str2, j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar8, 48, 0, 130040);
                                aVar7 = aVar8;
                                aVar7.H();
                            } else {
                                aVar7 = aVar8;
                                aVar7.N(511656061);
                                aVar7.H();
                            }
                            ps.a(i18 & 14, aVar7, function9);
                        } else {
                            aVar8.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 102236160, 196608, 15896);
                bVarI.s();
                bVarI.s();
                uiText = xlnVar.c;
                dVar = kw0.b;
                if (uiText != null) {
                    bVarI.N(-605949145);
                    d dVarI13 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA112 = b160.a(dVar, bVar2, bVarI, 54);
                    iHashCode13 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO1110 = bVarI.o();
                    d dVarC1110 = c.c(bVarI, dVarI13);
                    bVarI.D();
                    if (bVarI.g()) {
                        aVar3 = aVar6;
                        bVarI.F(aVar3);
                    } else {
                        aVar3 = aVar6;
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA112, bVar7);
                    hlh0.a(bVarI, ne00VarO1110, dVar3);
                    if (bVarI.g()) {
                        c1350a4 = c1350a2;
                        n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                    } else {
                        c1350a4 = c1350a2;
                        n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                    }
                    hlh0.a(bVarI, dVarC1110, cVar);
                    lkf0.d(vch0.a(xlnVar.c, bVarI), g3w.h(aVar4, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 24576, 113656);
                    bVarI.s();
                    bVarI.H();
                    dVar2 = dVar3;
                    cVar2 = cVar;
                    aVar2 = aVar3;
                    bVar4 = bVar2;
                    c1350a3 = c1350a4;
                    bVar3 = bVarI;
                    bVar5 = bVar7;
                } else {
                    dVar2 = dVar3;
                    if (z) {
                        bVarI.N(-605153096);
                        d dVarI14 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                        d160 d160VarA113 = b160.a(dVar, bVar2, bVarI, 54);
                        iHashCode9 = Long.hashCode(l2a.a(bVarI));
                        ne00 ne00VarO1111 = bVarI.o();
                        d dVarC1111 = c.c(bVarI, dVarI14);
                        bVarI.D();
                        if (bVarI.g()) {
                            bVarI.F(aVar6);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA113, bVar7);
                        hlh0.a(bVarI, ne00VarO1111, dVar2);
                        if (bVarI.g()) {
                            n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                        } else {
                            n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                        }
                        hlh0.a(bVarI, dVarC1111, cVar);
                        lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVarI).concat(", "), null, c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                        if ((458752 & i7) == 131072) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objY7 = bVarI.y();
                        if (z10) {
                            objY7 = new x6z(function6, 2);
                            bVarI.r(objY7);
                        } else {
                            objY7 = new x6z(function6, 2);
                            bVarI.r(objY7);
                        }
                        lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[0], bVarI), g3w.h(g3w.f(aVar4, true, (Function0) objY7), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
                        d dVarR3 = j.r(aVar4, 12.0f);
                        aVar2 = aVar6;
                        cVar2 = cVar;
                        c1350a3 = c1350a2;
                        bVar5 = bVar7;
                        bVar4 = bVar2;
                        h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, dVarR3, c68.a(R.color.text_brand_sub_primary_d_base, bVarI), bVarI, 432, 0);
                        bVar3 = bVarI;
                        bVar3.s();
                        bVar3.H();
                    } else {
                        aVar2 = aVar6;
                        cVar2 = cVar;
                        c1350a3 = c1350a2;
                        bVar3 = bVarI;
                        bVar4 = bVar2;
                        bVar5 = bVar7;
                        bVar3.N(-603799047);
                        bVar3.H();
                    }
                }
                ty0.a(bVar3, j.i(aVar4, 8.0f));
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar3), bVar3, 48, 1);
                d dVarH111 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_terms_row");
                kw0.j jVar3 = kw0.a;
                d160 d160VarA114 = b160.a(jVar3, bVar4, bVar3, 48);
                iHashCode10 = Long.hashCode(l2a.a(bVar3));
                ne00 ne00VarO1112 = bVar3.o();
                d dVarC1112 = c.c(bVar3, dVarH111);
                bVar3.D();
                if (bVar3.g()) {
                    bVar3.F(aVar2);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, d160VarA114, bVar5);
                hlh0.a(bVar3, ne00VarO1112, dVar2);
                if (bVar3.g()) {
                    n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
                } else {
                    n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
                }
                hlh0.a(bVar3, dVarC1112, cVar2);
                String strA4 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar3);
                if ((i7 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objY8 = bVar3.y();
                if (z11) {
                    c0042a3 = c0042a2;
                    if (objY8 == c0042a3) {
                    }
                    androidx.compose.runtime.a.C0041a.C0042a c0042a9 = c0042a3;
                    bVar6 = bVar3;
                    b(null, strA4, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                    bVar6.s();
                    ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                    d dVarG9 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                    d160 d160VarA115 = b160.a(jVar3, bVar4, bVar6, 48);
                    iHashCode11 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO1113 = bVar6.o();
                    d dVarC1113 = c.c(bVar6, dVarG9);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, d160VarA115, bVar5);
                    hlh0.a(bVar6, ne00VarO1113, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    } else {
                        n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC1113, cVar2);
                    d dVarG10 = j.g(aVar4, 1.0f);
                    aiv aivVarC5 = g75.c(ht.a.a, false);
                    iHashCode12 = Long.hashCode(l2a.a(bVar6));
                    ne00 ne00VarO1114 = bVar6.o();
                    d dVarC1114 = c.c(bVar6, dVarG10);
                    bVar6.D();
                    if (bVar6.g()) {
                        bVar6.F(aVar2);
                    } else {
                        bVar6.p();
                    }
                    hlh0.a(bVar6, aivVarC5, bVar5);
                    hlh0.a(bVar6, ne00VarO1114, dVar2);
                    if (bVar6.g()) {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    } else {
                        n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                    }
                    hlh0.a(bVar6, dVarC1114, cVar2);
                    uxsVar2 = uxsVar;
                    aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                    bVar = bVar6;
                    if (uxsVar2 == uxs.DISABLE) {
                        bVar.N(597169397);
                        d dVarF5 = androidx.compose.foundation.layout.d.a.f(aVar4);
                        if ((i7 & 57344) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objY9 = bVar.y();
                        if (z12) {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        } else {
                            function8 = function5;
                            objY9 = new dh7(function8, 1);
                            bVar.r(objY9);
                        }
                        g75.a(g3w.f(dVarF5, true, (Function0) objY9), bVar, 0);
                        bVar.H();
                    } else {
                        function8 = function5;
                        bVar.N(597393310);
                        bVar.H();
                    }
                    bVar.s();
                    bVar.s();
                    bVar.s();
                } else {
                    c0042a3 = r13;
                }
                objY8 = new p3g(function4, 0);
                bVar3.r(objY8);
                androidx.compose.runtime.a.C0041a.C0042a c0042a10 = c0042a3;
                bVar6 = bVar3;
                b(null, strA4, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                bVar6.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                d dVarG11 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                d160 d160VarA116 = b160.a(jVar3, bVar4, bVar6, 48);
                iHashCode11 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO1115 = bVar6.o();
                d dVarC1115 = c.c(bVar6, dVarG11);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, d160VarA116, bVar5);
                hlh0.a(bVar6, ne00VarO1115, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                } else {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                }
                hlh0.a(bVar6, dVarC1115, cVar2);
                d dVarG12 = j.g(aVar4, 1.0f);
                aiv aivVarC6 = g75.c(ht.a.a, false);
                iHashCode12 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO1116 = bVar6.o();
                d dVarC1116 = c.c(bVar6, dVarG12);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC6, bVar5);
                hlh0.a(bVar6, ne00VarO1116, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                } else {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                }
                hlh0.a(bVar6, dVarC1116, cVar2);
                uxsVar2 = uxsVar;
                aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                bVar = bVar6;
                if (uxsVar2 == uxs.DISABLE) {
                    bVar.N(597169397);
                    d dVarF6 = androidx.compose.foundation.layout.d.a.f(aVar4);
                    if ((i7 & 57344) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY9 = bVar.y();
                    if (z12) {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    } else {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    }
                    g75.a(g3w.f(dVarF6, true, (Function0) objY9), bVar, 0);
                    bVar.H();
                } else {
                    function8 = function5;
                    bVar.N(597393310);
                    bVar.H();
                }
                bVar.s();
                bVar.s();
                bVar.s();
            } else {
                c0042a = c0042a4;
            }
            objY2 = new Function1() { // from class: g3g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str13 = (String) obj;
                    str13.getClass();
                    Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                    if (str13.length() == 0 || regex.f(str13)) {
                        function1.invoke(str13);
                    }
                    return Unit.a;
                }
            };
            bVarI.r(objY2);
            ab2.b(str10, (Function1) objY2, dVarH17, false, false, imf0VarB6, gopVar6, tnpVar6, true, 0, 0, null, null, null, soa0Var6, pp8.b(-1832142676, new gaj() { // from class: d3g
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function9 = (Function2) obj;
                    a aVar7 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function9.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar7.A(function9) ? 4 : 2;
                    }
                    int i18 = iIntValue;
                    if (aVar7.q(i18 & 1, (i18 & 19) != 18)) {
                        aiv aivVarC7 = g75.c(ht.a.f, false);
                        int iHashCode15 = Long.hashCode(aVar7.m());
                        ne00 ne00VarO1117 = aVar7.o();
                        d.a aVar8 = d.a.b;
                        d dVarC1117 = c.c(aVar7, aVar8);
                        yka.k.getClass();
                        tsr.a aVar9 = yka.a.b;
                        if (aVar7.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar7.D();
                        if (aVar7.g()) {
                            aVar7.F(aVar9);
                        } else {
                            aVar7.p();
                        }
                        hlh0.a(aVar7, aivVarC7, yka.a.f);
                        hlh0.a(aVar7, ne00VarO1117, yka.a.e);
                        yka.a.C1350a c1350a6 = yka.a.g;
                        if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode15))) {
                            j3c.a(iHashCode15, aVar7, iHashCode15, c1350a6);
                        }
                        hlh0.a(aVar7, dVarC1117, yka.a.d);
                        if (kmnVar.a.a.length() == 0) {
                            aVar7.N(909945492);
                            lkf0.d(cb40.a(R.string.component_betslip__min, new Object[0], aVar7), j.g(aVar8, 1.0f), c68.a(R.color.text_placeholder, aVar7), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar7), aVar7, 48, 0, 130040);
                            aVar7 = aVar7;
                            aVar7.H();
                        } else {
                            aVar7.N(910413468);
                            aVar7.H();
                        }
                        ps.a(i18 & 14, aVar7, function9);
                    } else {
                        aVar7.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 102236160, 196608, 15896);
            lkf0.d("~", null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 6, 0, 131066);
            String str13 = kmnVar.b.a;
            gop gopVar9 = new gop(9, 6, 115);
            objY3 = bVarI.y();
            if (objY3 == c0042a) {
                b5iVar2 = b5iVar4;
                objY3 = new k3g(b5iVar2, 0);
                bVarI.r(objY3);
            } else {
                b5iVar2 = b5iVar4;
            }
            b5i b5iVar8 = b5iVar2;
            tnp tnpVar9 = new tnp(null, (Function1) objY3, null, 59);
            imf0 imf0VarB9 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            soa0 soa0Var9 = new soa0(c68.a(R.color.text_primary, bVarI));
            d dVarI15 = j.i(j.w(aVar4, 76.0f), 30.0f);
            if (kmnVar.b.b) {
                i11 = 503174517;
                i12 = R.color.border_danger;
            } else {
                i11 = 503177016;
                i12 = R.color.border_secondary;
            }
            d dVarH112 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI15, 1.0f, dr2.a(i11, i12, bVarI, bVarI), j060.c(2.0f)), b5iVar), 5.0f, 0.0f, 2), "auto_bet_create_max_odds_input");
            boolean zB6 = bVarI.b(zC);
            if ((i7 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zB6 | z7;
            objY4 = bVarI.y();
            if (z8) {
                objY4 = new Function1() { // from class: l3g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str14 = (String) obj;
                        str14.getClass();
                        Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                        if (str14.length() == 0 || regex.f(str14)) {
                            function2.invoke(str14);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            } else {
                objY4 = new Function1() { // from class: l3g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str14 = (String) obj;
                        str14.getClass();
                        Regex regex = zC ? new Regex("-?\\d*") : new Regex("\\d*(\\.\\d{0,2})?");
                        if (str14.length() == 0 || regex.f(str14)) {
                            function2.invoke(str14);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            ab2.b(str13, (Function1) objY4, dVarH112, false, false, imf0VarB9, gopVar9, tnpVar9, true, 0, 0, null, null, null, soa0Var9, pp8.b(755874901, new m3g(kmnVar, 0), bVarI), bVarI, 102236160, 196608, 15896);
            bVarI.s();
            bVarI.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVarI), bVarI, 48, 1);
            d dVarH113 = g3w.h(h.i(j.g(aVar4, 1.0f), 24.0f, 8.0f, 24.0f, 0.0f), "auto_bet_create_stake_row");
            d160 d160VarA117 = b160.a(gVar2, bVar2, bVarI, 54);
            iHashCode6 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO1117 = bVarI.o();
            d dVarC1117 = c.c(bVarI, dVarH113);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA117, bVar7);
            hlh0.a(bVarI, ne00VarO1117, dVar3);
            if (bVarI.g()) {
                c1350a = c1350a5;
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            } else {
                c1350a = c1350a5;
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
            }
            hlh0.a(bVarI, dVarC1117, cVar);
            i78 i78VarA7 = g78.a(kVar, aVar5, bVarI, 0);
            iHashCode7 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO1118 = bVarI.o();
            d dVarC1118 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA7, bVar7);
            hlh0.a(bVarI, ne00VarO1118, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            } else {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a);
            }
            hlh0.a(bVarI, dVarC1118, cVar);
            lkf0.d("Stake", g3w.h(aVar4, "auto_bet_create_stake_label"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, 54, 0, 131064);
            lkf0.d(str4, g3w.h(aVar4, "auto_bet_create_balance"), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, ((i7 >> 21) & 14) | 48, 0, 131064);
            bVarI.s();
            d160 d160VarA118 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar2, bVarI, 54);
            iHashCode8 = Long.hashCode(l2a.a(bVarI));
            ne00 ne00VarO1119 = bVarI.o();
            d dVarC1119 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.g()) {
                bVarI.F(aVar6);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA118, bVar7);
            hlh0.a(bVarI, ne00VarO1119, dVar3);
            if (bVarI.g()) {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
            } else {
                n30.a(iHashCode8, bVarI, iHashCode8, c1350a);
            }
            hlh0.a(bVarI, dVarC1119, cVar);
            c1350a2 = c1350a;
            c0042a2 = c0042a;
            lkf0.d(str, g3w.h(aVar4, "auto_bet_create_currency"), c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, ((i17 >> 3) & 14) | 48, 0, 131064);
            String str14 = xlnVar.a;
            gop gopVar10 = new gop(3, 7, 115);
            zA = bVarI.A(k4iVar);
            objY5 = bVarI.y();
            if (zA) {
                i13 = 2;
                objY5 = new sg7(k4iVar, 2);
                bVarI.r(objY5);
            } else {
                i13 = 2;
                objY5 = new sg7(k4iVar, 2);
                bVarI.r(objY5);
            }
            tnp tnpVar10 = new tnp((Function1) objY5, null, null, 62);
            imf0 imf0VarB10 = imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 6, 0L, null, null, 16744446);
            soa0 soa0Var10 = new soa0(c68.a(R.color.text_primary, bVarI));
            d dVarI16 = j.i(j.w(aVar4, 136.0f), 30.0f);
            if (xlnVar.b) {
                i14 = 1737155124;
                i15 = R.color.border_danger;
            } else {
                i14 = 1737157623;
                i15 = R.color.border_secondary;
            }
            d dVarH114 = g3w.h(h.h(androidx.compose.ui.focus.b.a(d35.a(dVarI16, 1.0f, dr2.a(i14, i15, bVarI, bVarI), j060.c(2.0f)), b5iVar8), 5.0f, 0.0f, i13), "auto_bet_create_stake_input");
            if ((i7 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            objY6 = bVarI.y();
            if (z9) {
                objY6 = new n3g(0, function3);
                bVarI.r(objY6);
            } else {
                objY6 = new n3g(0, function3);
                bVarI.r(objY6);
            }
            ab2.b(str14, (Function1) objY6, dVarH114, false, false, imf0VarB10, gopVar10, tnpVar10, true, 0, 0, null, null, null, soa0Var10, pp8.b(1757964299, new gaj() { // from class: o3g
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar7;
                    Function2 function9 = (Function2) obj;
                    a aVar8 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function9.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar8.A(function9) ? 4 : 2;
                    }
                    int i18 = iIntValue;
                    if (aVar8.q(i18 & 1, (i18 & 19) != 18)) {
                        aiv aivVarC7 = g75.c(ht.a.f, false);
                        int iHashCode15 = Long.hashCode(aVar8.m());
                        ne00 ne00VarO11110 = aVar8.o();
                        d.a aVar9 = d.a.b;
                        d dVarC11110 = c.c(aVar8, aVar9);
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
                        hlh0.a(aVar8, aivVarC7, yka.a.f);
                        hlh0.a(aVar8, ne00VarO11110, yka.a.e);
                        yka.a.C1350a c1350a6 = yka.a.g;
                        if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode15))) {
                            j3c.a(iHashCode15, aVar8, iHashCode15, c1350a6);
                        }
                        hlh0.a(aVar8, dVarC11110, yka.a.d);
                        if (kmnVar.c.a.length() == 0) {
                            aVar8.N(511229408);
                            imf0 imf0VarL = mla.l(R.style.B1_M, aVar8);
                            lkf0.d(str2, j.g(aVar9, 1.0f), c68.a(R.color.text_placeholder, aVar8), null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, imf0VarL, aVar8, 48, 0, 130040);
                            aVar7 = aVar8;
                            aVar7.H();
                        } else {
                            aVar7 = aVar8;
                            aVar7.N(511656061);
                            aVar7.H();
                        }
                        ps.a(i18 & 14, aVar7, function9);
                    } else {
                        aVar8.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 102236160, 196608, 15896);
            bVarI.s();
            bVarI.s();
            uiText = xlnVar.c;
            dVar = kw0.b;
            if (uiText != null) {
                bVarI.N(-605949145);
                d dVarI17 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                d160 d160VarA119 = b160.a(dVar, bVar2, bVarI, 54);
                iHashCode13 = Long.hashCode(l2a.a(bVarI));
                ne00 ne00VarO11110 = bVarI.o();
                d dVarC11110 = c.c(bVarI, dVarI17);
                bVarI.D();
                if (bVarI.g()) {
                    aVar3 = aVar6;
                    bVarI.F(aVar3);
                } else {
                    aVar3 = aVar6;
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA119, bVar7);
                hlh0.a(bVarI, ne00VarO11110, dVar3);
                if (bVarI.g()) {
                    c1350a4 = c1350a2;
                    n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                } else {
                    c1350a4 = c1350a2;
                    n30.a(iHashCode13, bVarI, iHashCode13, c1350a4);
                }
                hlh0.a(bVarI, dVarC11110, cVar);
                lkf0.d(vch0.a(xlnVar.c, bVarI), g3w.h(aVar4, "auto_bet_create_stake_error"), c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, gdf0.a(6), 0L, 0, false, 2, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 24576, 113656);
                bVarI.s();
                bVarI.H();
                dVar2 = dVar3;
                cVar2 = cVar;
                aVar2 = aVar3;
                bVar4 = bVar2;
                c1350a3 = c1350a4;
                bVar3 = bVarI;
                bVar5 = bVar7;
            } else {
                dVar2 = dVar3;
                if (z) {
                    bVarI.N(-605153096);
                    d dVarI18 = h.i(j.g(aVar4, 1.0f), 24.0f, 4.0f, 24.0f, 0.0f);
                    d160 d160VarA1110 = b160.a(dVar, bVar2, bVarI, 54);
                    iHashCode9 = Long.hashCode(l2a.a(bVarI));
                    ne00 ne00VarO11111 = bVarI.o();
                    d dVarC11111 = c.c(bVarI, dVarI18);
                    bVarI.D();
                    if (bVarI.g()) {
                        bVarI.F(aVar6);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA1110, bVar7);
                    hlh0.a(bVarI, ne00VarO11111, dVar2);
                    if (bVarI.g()) {
                        n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                    } else {
                        n30.a(iHashCode9, bVarI, iHashCode9, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC11111, cVar);
                    lkf0.d(cb40.a(R.string.component_betslip__insufficient_balance, new Object[0], bVarI).concat(", "), null, c68.a(R.color.text_danger, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                    if ((458752 & i7) == 131072) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objY7 = bVarI.y();
                    if (z10) {
                        objY7 = new x6z(function6, 2);
                        bVarI.r(objY7);
                    } else {
                        objY7 = new x6z(function6, 2);
                        bVarI.r(objY7);
                    }
                    lkf0.d(cb40.a(R.string.page_login__go_to_deposit, new Object[0], bVarI), g3w.h(g3w.f(aVar4, true, (Function0) objY7), "auto_bet_create_deposit_link"), c68.a(R.color.text_brand_sub_primary_d_base, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 0, 0, 131064);
                    d dVarR4 = j.r(aVar4, 12.0f);
                    aVar2 = aVar6;
                    cVar2 = cVar;
                    c1350a3 = c1350a2;
                    bVar5 = bVar7;
                    bVar4 = bVar2;
                    h6n.b(erz.a(R.drawable.ic__arrow_chevron_right, 0, bVarI), null, dVarR4, c68.a(R.color.text_brand_sub_primary_d_base, bVarI), bVarI, 432, 0);
                    bVar3 = bVarI;
                    bVar3.s();
                    bVar3.H();
                } else {
                    aVar2 = aVar6;
                    cVar2 = cVar;
                    c1350a3 = c1350a2;
                    bVar3 = bVarI;
                    bVar4 = bVar2;
                    bVar5 = bVar7;
                    bVar3.N(-603799047);
                    bVar3.H();
                }
            }
            ty0.a(bVar3, j.i(aVar4, 8.0f));
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar3), bVar3, 48, 1);
            d dVarH115 = g3w.h(h.g(j.g(aVar4, 1.0f), 24.0f, 8.0f), "auto_bet_create_terms_row");
            kw0.j jVar4 = kw0.a;
            d160 d160VarA1111 = b160.a(jVar4, bVar4, bVar3, 48);
            iHashCode10 = Long.hashCode(l2a.a(bVar3));
            ne00 ne00VarO11112 = bVar3.o();
            d dVarC11112 = c.c(bVar3, dVarH115);
            bVar3.D();
            if (bVar3.g()) {
                bVar3.F(aVar2);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, d160VarA1111, bVar5);
            hlh0.a(bVar3, ne00VarO11112, dVar2);
            if (bVar3.g()) {
                n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
            } else {
                n30.a(iHashCode10, bVar3, iHashCode10, c1350a3);
            }
            hlh0.a(bVar3, dVarC11112, cVar2);
            String strA5 = cb40.a(R.string.component_betslip__auto_bet_terms_acknowledgment, new Object[0], bVar3);
            if ((i7 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            objY8 = bVar3.y();
            if (z11) {
                c0042a3 = c0042a2;
                if (objY8 == c0042a3) {
                }
                androidx.compose.runtime.a.C0041a.C0042a c0042a11 = c0042a3;
                bVar6 = bVar3;
                b(null, strA5, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
                bVar6.s();
                ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
                d dVarG13 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
                d160 d160VarA1112 = b160.a(jVar4, bVar4, bVar6, 48);
                iHashCode11 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO11113 = bVar6.o();
                d dVarC11113 = c.c(bVar6, dVarG13);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, d160VarA1112, bVar5);
                hlh0.a(bVar6, ne00VarO11113, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                } else {
                    n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
                }
                hlh0.a(bVar6, dVarC11113, cVar2);
                d dVarG14 = j.g(aVar4, 1.0f);
                aiv aivVarC7 = g75.c(ht.a.a, false);
                iHashCode12 = Long.hashCode(l2a.a(bVar6));
                ne00 ne00VarO11114 = bVar6.o();
                d dVarC11114 = c.c(bVar6, dVarG14);
                bVar6.D();
                if (bVar6.g()) {
                    bVar6.F(aVar2);
                } else {
                    bVar6.p();
                }
                hlh0.a(bVar6, aivVarC7, bVar5);
                hlh0.a(bVar6, ne00VarO11114, dVar2);
                if (bVar6.g()) {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                } else {
                    n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
                }
                hlh0.a(bVar6, dVarC11114, cVar2);
                uxsVar2 = uxsVar;
                aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
                bVar = bVar6;
                if (uxsVar2 == uxs.DISABLE) {
                    bVar.N(597169397);
                    d dVarF7 = androidx.compose.foundation.layout.d.a.f(aVar4);
                    if ((i7 & 57344) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objY9 = bVar.y();
                    if (z12) {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    } else {
                        function8 = function5;
                        objY9 = new dh7(function8, 1);
                        bVar.r(objY9);
                    }
                    g75.a(g3w.f(dVarF7, true, (Function0) objY9), bVar, 0);
                    bVar.H();
                } else {
                    function8 = function5;
                    bVar.N(597393310);
                    bVar.H();
                }
                bVar.s();
                bVar.s();
                bVar.s();
            } else {
                c0042a3 = r13;
            }
            objY8 = new p3g(function4, 0);
            bVar3.r(objY8);
            androidx.compose.runtime.a.C0041a.C0042a c0042a12 = c0042a3;
            bVar6 = bVar3;
            b(null, strA5, z2, z3, (Function1) objY8, bVar6, (i17 >> 9) & 8064);
            bVar6.s();
            ute.b(null, 1.0f, c68.a(R.color.border_primary, bVar6), bVar6, 48, 1);
            d dVarG15 = h.g(j.g(aVar4, 1.0f), 24.0f, 16.0f);
            d160 d160VarA1113 = b160.a(jVar4, bVar4, bVar6, 48);
            iHashCode11 = Long.hashCode(l2a.a(bVar6));
            ne00 ne00VarO11115 = bVar6.o();
            d dVarC11115 = c.c(bVar6, dVarG15);
            bVar6.D();
            if (bVar6.g()) {
                bVar6.F(aVar2);
            } else {
                bVar6.p();
            }
            hlh0.a(bVar6, d160VarA1113, bVar5);
            hlh0.a(bVar6, ne00VarO11115, dVar2);
            if (bVar6.g()) {
                n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
            } else {
                n30.a(iHashCode11, bVar6, iHashCode11, c1350a3);
            }
            hlh0.a(bVar6, dVarC11115, cVar2);
            d dVarG16 = j.g(aVar4, 1.0f);
            aiv aivVarC8 = g75.c(ht.a.a, false);
            iHashCode12 = Long.hashCode(l2a.a(bVar6));
            ne00 ne00VarO11116 = bVar6.o();
            d dVarC11116 = c.c(bVar6, dVarG16);
            bVar6.D();
            if (bVar6.g()) {
                bVar6.F(aVar2);
            } else {
                bVar6.p();
            }
            hlh0.a(bVar6, aivVarC8, bVar5);
            hlh0.a(bVar6, ne00VarO11116, dVar2);
            if (bVar6.g()) {
                n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
            } else {
                n30.a(iHashCode12, bVar6, iHashCode12, c1350a3);
            }
            hlh0.a(bVar6, dVarC11116, cVar2);
            uxsVar2 = uxsVar;
            aza.a(g3w.h(j.g(aVar4, 1.0f), "auto_bet_create_place_bet_button"), str3, uxsVar2, null, alb0.a(sya.a, g7f.a(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVar6, ((i17 >> 6) & 112) | 6 | ((i17 >> 15) & 896) | ((i7 << 15) & 234881024), 744);
            bVar = bVar6;
            if (uxsVar2 == uxs.DISABLE) {
                bVar.N(597169397);
                d dVarF8 = androidx.compose.foundation.layout.d.a.f(aVar4);
                if ((i7 & 57344) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objY9 = bVar.y();
                if (z12) {
                    function8 = function5;
                    objY9 = new dh7(function8, 1);
                    bVar.r(objY9);
                } else {
                    function8 = function5;
                    objY9 = new dh7(function8, 1);
                    bVar.r(objY9);
                }
                g75.a(g3w.f(dVarF8, true, (Function0) objY9), bVar, 0);
                bVar.H();
            } else {
                function8 = function5;
                bVar.N(597393310);
                bVar.H();
            }
            bVar.s();
            bVar.s();
            bVar.s();
        } else {
            uxsVar2 = uxsVar;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final uxs uxsVar3 = uxsVar2;
            final Function0 function9 = function8;
            eVarZ.e(new Function2() { // from class: e3g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    q3g.c(orderBetType, str, str2, str3, z, z2, z3, uxsVar3, kmnVar, function1, function2, function3, function4, function0, function9, function6, function7, str4, (a) obj, iA, iA2);
                    return Unit.a;
                }
            });
        }
    }
}
