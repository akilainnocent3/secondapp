package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class ik00 {
    public static final void a(kl00 kl00Var, final CountryCodeName countryCodeName, final Function0<Unit> function0, final Function1<? super String, Unit> function1, a aVar, final int i) {
        String upperCase;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        String strA;
        String code;
        final kl00 kl00Var2 = kl00Var;
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1484267148);
        int i2 = i | (bVarI.M(kl00Var2) ? 4 : 2) | (bVarI.d(countryCodeName == null ? -1 : countryCodeName.ordinal()) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            long jA = c68.a(R.color.brand_secondary, bVarI);
            zk40.a aVar4 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, jA, aVar4);
            kw0.g gVar = kw0.g;
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(aVar3, 16.0f, 8.0f, 0.0f, 8.0f, 4);
            n54.a aVar6 = ht.a.m;
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, aVar6, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d160 d160VarA2 = b160.a(kw0.a, bVar, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            lkf0.d(kl00Var2.a, null, c68.a(R.color.brand_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 24960, 110586);
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            d dVarR = j.r(aVar3, 18.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            boolean z = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function0() { // from class: uj00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(kl00Var2.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            h6n.b(erz.a(R.drawable.icon_copy, 0, bVarI), "code_copy", androidx.compose.foundation.d.b(dVarR, pswVar, null, false, null, (Function0) objY2, 28), c68.a(R.color.brand_tertiary, bVarI), bVarI, 48, 0);
            szg.a(bVarI, true, aVar3, 2.0f, bVarI);
            if (countryCodeName == null || (code = countryCodeName.getCode()) == null) {
                upperCase = "";
            } else {
                Locale locale = Locale.getDefault();
                locale.getClass();
                upperCase = code.toUpperCase(locale);
                upperCase.getClass();
            }
            lkf0.d(cb40.a(R.string.page_code_hub__code_from_vcountry, new Object[]{upperCase}, bVarI), null, c68.a(R.color.brand_tertiary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 24960, 110586);
            bVarI.X(true);
            d dVarH = h.h(aVar3, 16.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                aVar2 = aVar5;
                bVarI.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                c1350a = c1350a2;
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarR2 = j.r(aVar3, 20.0f);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = rzk.a(bVarI);
            }
            psw pswVar2 = (psw) objY3;
            boolean z2 = (i2 & 896) == 256;
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                objY4 = new Function0() { // from class: vj00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            yka.a.C1350a c1350a3 = c1350a;
            h6n.b(erz.a(R.drawable.ic_close_black_24dp, 0, bVarI), "code_copy", androidx.compose.foundation.d.b(dVarR2, pswVar2, null, false, null, (Function0) objY4, 28), c68.a(R.color.brand_tertiary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
            bVarI.X(true);
            d dVarB2 = androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.brand_secondary_variable_type1, bVarI), aVar4);
            d160 d160VarA3 = b160.a(kw0.f, bVar, bVarI, 54);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a3);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            n54.a aVar7 = ht.a.n;
            i78 i78VarA2 = g78.a(kVar, aVar7, bVarI, 48);
            int iHashCode6 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS6, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVarI, iHashCode6, c1350a3);
            }
            hlh0.a(bVarI, dVarC6, cVar);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            int i3 = kl00Var2.c;
            tsr.a aVar8 = aVar2;
            lkf0.d(i3 > 1000 ? m58.a(i3 / 1000, "K") : String.valueOf(i3), null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.page_code_hub__folds, new Object[0], bVarI), dw.a(aVar3, 0.7f), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 48, 0, 131064);
            iib0.a(aVar3, 4.0f, bVarI, true);
            i78 i78VarA3 = g78.a(kVar, aVar7, bVarI, 48);
            int iHashCode7 = Long.hashCode(bVarI.T);
            ne00 ne00VarS7 = bVarI.S();
            d dVarC7 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar8);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA3, bVar2);
            hlh0.a(bVarI, ne00VarS7, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVarI, iHashCode7, c1350a3);
            }
            hlh0.a(bVarI, dVarC7, cVar);
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            kl00Var2 = kl00Var;
            double d = kl00Var2.b;
            if (d > 999999.0d) {
                strA = m58.a((int) (d / 1000000.0d), "M");
            } else {
                strA = d > 9999.99d ? m58.a((int) (d / 1000.0d), "K") : bjb0.a0(d, Locale.US);
            }
            lkf0.d(strA, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 131066);
            lkf0.d(cb40.a(R.string.page_code_hub__odds, new Object[0], bVarI), dw.a(aVar3, 0.7f), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 48, 0, 131064);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar3, 4.0f));
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(countryCodeName, function0, function1, i) { // from class: wj00
                public final /* synthetic */ CountryCodeName b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ik00.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final kl00 kl00Var, final CountryCodeName countryCodeName, final SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function1<? super jl00, Unit> function2, final Function1<? super kl00, Unit> function3, final Function1<? super kl00, Unit> function4, final Function1<? super kl00, Unit> function5, a aVar, final int i) {
        int i2;
        SimpleDateFormat simpleDateFormat3;
        simpleDateFormat.getClass();
        simpleDateFormat2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        b bVarI = aVar.i(1907805754);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(kl00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(countryCodeName == null ? -1 : countryCodeName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(simpleDateFormat) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            simpleDateFormat3 = simpleDateFormat2;
            i2 |= bVarI.A(simpleDateFormat3) ? 2048 : 1024;
        } else {
            simpleDateFormat3 = simpleDateFormat2;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= bVarI.A(function5) ? 536870912 : 268435456;
        }
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            final SimpleDateFormat simpleDateFormat4 = simpleDateFormat3;
            u60.a(function0, new yle(false, false, 7), pp8.b(-1422527087, new Function2() { // from class: tj00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarB = androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), c68.a(R.color.background_type1_primary, aVar2), zk40.a);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarB);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        kl00 kl00Var2 = kl00Var;
                        ik00.a(kl00Var2, countryCodeName, function0, function1, aVar2, 0);
                        ik00.e(kl00Var2, simpleDateFormat, simpleDateFormat4, null, function2, aVar2, 0);
                        ik00.c(kl00Var2, function3, function4, function5, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 12) & 14) | 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yj00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ik00.b(kl00Var, countryCodeName, simpleDateFormat, simpleDateFormat2, function0, function1, function2, function3, function4, function5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v28 */
    public static final void c(kl00 kl00Var, final Function1<? super kl00, Unit> function1, final Function1<? super kl00, Unit> function2, final Function1<? super kl00, Unit> function3, a aVar, final int i) {
        b bVar;
        d.a aVar2;
        kw0.j jVar;
        zk40.a aVar3;
        tsr.a aVar4;
        yka.a.b bVar2;
        int i2;
        float f;
        b bVar3;
        String strA;
        tsr.a aVar5;
        yka.a.C1350a c1350a;
        yka.a.c cVar;
        yka.a.d dVar;
        yka.a.C1350a c1350a2;
        yka.a.b bVar4;
        d.a aVar6;
        int i3;
        a.C0041a.C0042a c0042a;
        int i4;
        float f2;
        boolean z;
        yka.a.C1350a c1350a3;
        int i5;
        String strA2;
        int i6;
        boolean z2;
        long jA;
        final kl00 kl00Var2 = kl00Var;
        bv7 bv7Var = kl00Var2.o;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(-1803882867);
        int i7 = i | (bVarI.M(kl00Var2) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024);
        if (bVarI.q(i7 & 1, (i7 & 1171) != 1170)) {
            boolean zD = r0b.d((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            d.a aVar7 = d.a.b;
            d dVarI = j.i(j.g(aVar7, 1.0f), 40.0f);
            long jA2 = c68.a(R.color.background_type1_primary, bVarI);
            zk40.a aVar8 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, jA2, aVar8);
            kw0.g gVar = kw0.g;
            n54.b bVar5 = ht.a.k;
            d160 d160VarA = b160.a(gVar, bVar5, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar9 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar9);
            } else {
                bVarI.p();
            }
            yka.a.b bVar6 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar6);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a4 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a4);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarI2 = j.i(aVar7, 40.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY == c0042a2) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            int i8 = i7 & 14;
            boolean z3 = ((i7 & 112) == 32) | (i8 == 4);
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a2) {
                objY2 = new ck00(0, function1, kl00Var2);
                bVarI.r(objY2);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarI2, pswVar, null, false, null, (Function0) objY2, 28);
            kw0.j jVar2 = kw0.a;
            d160 d160VarA2 = b160.a(jVar2, bVar5, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar9);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar6);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a4);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            ty0.a(bVarI, j.w(aVar7, 16.0f));
            bv7 bv7Var2 = kl00Var2.q;
            bv7.b bVar7 = bv7.b.a;
            if (Intrinsics.g(bv7Var, bVar7)) {
                bVarI.N(-1200048987);
                d dVarR = j.r(aVar7, 16.0f);
                rbn rbnVarA = d190.a();
                if (zD) {
                    z2 = false;
                    jA = rzg.a(bVarI, -1199904434, R.color.custom_brand_tertiary_type4, bVarI, false);
                } else {
                    z2 = false;
                    jA = rzg.a(bVarI, -1199788742, R.color.brand_secondary, bVarI, false);
                }
                aVar2 = aVar7;
                bVar3 = bVarI;
                h6n.a(rbnVarA, "share", dVarR, jA, bVar3, 432, 0);
                bVar3.X(z2);
                jVar = jVar2;
                aVar3 = aVar8;
                aVar4 = aVar9;
                i2 = z2;
                bVar2 = bVar6;
                f = 40.0f;
            } else {
                aVar2 = aVar7;
                bVarI.N(-1199581724);
                jVar = jVar2;
                aVar3 = aVar8;
                aVar4 = aVar9;
                bVar2 = bVar6;
                i2 = 0;
                f = 40.0f;
                q330.a(j.r(aVar2, 16.0f), c68.a(R.color.brand_secondary, bVarI), 2.0f, 0L, 0, 0.0f, bVarI, 390, 56);
                bVar3 = bVarI;
                bVar3.X(false);
            }
            ty0.a(bVar3, j.w(aVar2, 4.0f));
            if (Intrinsics.g(bv7Var, r27)) {
                bVar3.N(-1199214560);
                strA = cb40.a(R.string.page_code_hub__share, new Object[i2], bVar3);
                bVar3.X(i2);
            } else {
                bVar3.N(-1199115918);
                strA = cb40.a(R.string.common_functions__loading_with_dot, new Object[i2], bVar3);
                bVar3.X(i2);
            }
            b bVar8 = bVar3;
            lkf0.d(strA, null, zD ? rzg.a(bVar3, -1198968234, R.color.custom_brand_tertiary_type4, bVar3, i2) : rzg.a(bVar3, -1198860478, R.color.brand_secondary, bVar3, i2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVar3), bVar8, 0, 0, 131066);
            b bVar9 = bVar8;
            dd3.b(aVar2, 16.0f, bVar9, true);
            d dVarI3 = j.i(aVar2, f);
            kw0.j jVar3 = jVar;
            d160 d160VarA3 = b160.a(jVar3, r25, bVar9, 48);
            int iHashCode3 = Long.hashCode(bVar9.T);
            ne00 ne00VarS3 = bVar9.S();
            d dVarC3 = c.c(bVar9, dVarI3);
            bVar9.D();
            if (bVar9.S) {
                aVar5 = aVar4;
                bVar9.F(aVar5);
            } else {
                aVar5 = aVar4;
                bVar9.p();
            }
            yka.a.b bVar10 = bVar2;
            hlh0.a(bVar9, d160VarA3, bVar10);
            hlh0.a(bVar9, ne00VarS3, dVar2);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a4;
                n30.a(iHashCode3, bVar9, iHashCode3, c1350a);
            } else {
                c1350a = c1350a4;
            }
            hlh0.a(bVar9, dVarC3, cVar2);
            zk40.a aVar10 = aVar3;
            d dVarB3 = androidx.compose.foundation.a.b(j.r(aVar2, f), c68.a(R.color.brand_secondary_variable_type2, bVar9), aVar10);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, i2);
            d.a aVar11 = aVar2;
            int iHashCode4 = Long.hashCode(bVar9.T);
            ne00 ne00VarS4 = bVar9.S();
            d dVarC4 = c.c(bVar9, dVarB3);
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar5);
            } else {
                bVar9.p();
            }
            hlh0.a(bVar9, aivVarC, bVar10);
            hlh0.a(bVar9, ne00VarS4, dVar2);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVar9, iHashCode4, c1350a);
            }
            hlh0.a(bVar9, dVarC4, cVar2);
            kl00Var2 = kl00Var;
            tsr.a aVar12 = aVar5;
            if (Intrinsics.g(kl00Var2.p, r27)) {
                bVar9.N(1573666559);
                aVar6 = aVar11;
                d dVarR2 = j.r(aVar6, 16.0f);
                Object objY3 = bVar9.y();
                c0042a = c0042a2;
                if (objY3 == c0042a) {
                    objY3 = rzk.a(bVar9);
                }
                psw pswVar2 = (psw) objY3;
                xt50 xt50VarB = ut50.b(0.0f, 7, 0L, false);
                boolean z4 = ((i7 & 896) == 256) | (i8 == 4);
                Object objY4 = bVar9.y();
                if (z4 || objY4 == c0042a) {
                    i6 = 0;
                    objY4 = new dk00(0, function2, kl00Var2);
                    bVar9.r(objY4);
                } else {
                    i6 = 0;
                }
                i3 = i7;
                cVar = cVar2;
                dVar = dVar2;
                c1350a2 = c1350a;
                i4 = i8;
                bVar4 = bVar10;
                h6n.b(erz.a(R.drawable.ic_white_edit, i6, bVar9), "code_edit", androidx.compose.foundation.d.b(dVarR2, pswVar2, xt50VarB, false, null, (Function0) objY4, 28), c68.a(R.color.brand_tertiary, bVar9), bVar9, 48, 0);
                bVar9.X(false);
                f2 = 0.0f;
            } else {
                cVar = cVar2;
                dVar = dVar2;
                c1350a2 = c1350a;
                bVar4 = bVar10;
                aVar6 = aVar11;
                i3 = i7;
                c0042a = c0042a2;
                i4 = r24;
                bVar9.N(1574452626);
                f2 = 0.0f;
                q330.a(j.r(aVar6, 18.0f), c68.a(R.color.brand_tertiary, bVar9), 2.0f, 0L, 0, 0.0f, bVar9, 390, 56);
                bVar9 = bVar9;
                bVar9.X(false);
            }
            bVar9.X(true);
            d dVarB4 = androidx.compose.foundation.a.b(j.x(j.i(aVar6, 40.0f), f2, 180.0f), c68.a(R.color.brand_secondary, bVar9), aVar10);
            Object objY5 = bVar9.y();
            if (objY5 == c0042a) {
                objY5 = rzk.a(bVar9);
            }
            psw pswVar3 = (psw) objY5;
            xt50 xt50VarB2 = ut50.b(f2, 7, 0L, false);
            boolean z5 = (i4 == 4) | ((i3 & 7168) == 2048);
            Object objY6 = bVar9.y();
            if (z5 || objY6 == c0042a) {
                z = false;
                objY6 = new ek00(0, kl00Var2, function3);
                bVar9.r(objY6);
            } else {
                z = false;
            }
            d dVarB5 = androidx.compose.foundation.d.b(dVarB4, pswVar3, xt50VarB2, false, null, (Function0) objY6, 28);
            aiv aivVarC2 = g75.c(n54Var, z);
            int iHashCode5 = Long.hashCode(bVar9.T);
            ne00 ne00VarS5 = bVar9.S();
            d dVarC5 = c.c(bVar9, dVarB5);
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar12);
            } else {
                bVar9.p();
            }
            yka.a.b bVar11 = bVar4;
            hlh0.a(bVar9, aivVarC2, bVar11);
            yka.a.d dVar3 = dVar;
            hlh0.a(bVar9, ne00VarS5, dVar3);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode5))) {
                c1350a3 = c1350a2;
                n30.a(iHashCode5, bVar9, iHashCode5, c1350a3);
            } else {
                c1350a3 = c1350a2;
            }
            yka.a.c cVar3 = cVar;
            hlh0.a(bVar9, dVarC5, cVar3);
            d dVarH = h.h(aVar6, 12.0f, f2, 2);
            d160 d160VarA4 = b160.a(jVar3, bVar5, bVar9, 48);
            int iHashCode6 = Long.hashCode(bVar9.T);
            ne00 ne00VarS6 = bVar9.S();
            d dVarC6 = c.c(bVar9, dVarH);
            bVar9.D();
            if (bVar9.S) {
                bVar9.F(aVar12);
            } else {
                bVar9.p();
            }
            hlh0.a(bVar9, d160VarA4, bVar11);
            hlh0.a(bVar9, ne00VarS6, dVar3);
            if (bVar9.S || !Intrinsics.g(bVar9.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVar9, iHashCode6, c1350a3);
            }
            hlh0.a(bVar9, dVarC6, cVar3);
            if (Intrinsics.g(bv7Var2, bv7.a.a)) {
                bVar9.N(902690605);
                b bVar12 = bVar9;
                q330.a(j.r(aVar6, 18.0f), c68.a(R.color.brand_tertiary, bVar9), 2.0f, 0L, 0, 0.0f, bVar12, 390, 56);
                bVar9 = bVar12;
                i5 = 0;
                dd3.b(aVar6, 8.0f, bVar9, false);
            } else {
                i5 = 0;
                bVar9.N(903036565);
                bVar9.X(false);
            }
            if (Intrinsics.g(bv7Var2, bVar7)) {
                bVar9.N(903144383);
                strA2 = cb40.a(R.string.page_code_hub__add_to_betslip, new Object[i5], bVar9);
                bVar9.X(i5);
            } else {
                bVar9.N(903267546);
                strA2 = cb40.a(R.string.common_functions__loading_with_dot, new Object[i5], bVar9);
                bVar9.X(i5);
            }
            b bVar13 = bVar9;
            lkf0.d(strA2, null, c68.a(R.color.brand_tertiary, bVar9), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVar9), bVar13, 0, 0, 130042);
            bVar = bVar13;
            mx4.a(bVar, true, true, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, i) { // from class: fk00
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ik00.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final jl00 jl00Var, SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, final Function1<? super jl00, Unit> function1, a aVar, final int i) {
        SimpleDateFormat simpleDateFormat3;
        float f;
        float f2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        int i2;
        yka.a.c cVar;
        yka.a.C1350a c1350a2;
        tsr.a aVar3;
        yka.a.b bVar;
        b bVar2;
        String str;
        jl00Var.getClass();
        simpleDateFormat.getClass();
        simpleDateFormat2.getClass();
        function1.getClass();
        b bVarI = aVar.i(-66527503);
        int i3 = i | (bVarI.M(jl00Var) ? 4 : 2) | (bVarI.A(simpleDateFormat) ? 32 : 16) | (bVarI.A(simpleDateFormat2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar4 = d.a.b;
            d dVarF = h.f(j.g(aVar4, 1.0f), 4.0f);
            n54.b bVar3 = ht.a.k;
            i78 i78VarA = g78.a(new kw0.i(4.0f, false, new jw0(bVar3)), ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarG = j.g(aVar4, 1.0f);
            kw0.g gVar = kw0.g;
            d160 d160VarA = b160.a(gVar, bVar3, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar4);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a3);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            kw0.j jVar = kw0.a;
            d160 d160VarA2 = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar4);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a3);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            d dVarR = j.r(aVar4, 16.0f);
            String str2 = jl00Var.n;
            long j = jl00Var.c;
            boolean z = jl00Var.b;
            mw90.b(str2, "image", dVarR, erz.a(R.drawable.ic_codehub_default_league_logo, 0, bVarI), erz.a(R.drawable.ic_codehub_default_league_logo, 0, bVarI), null, null, null, null, 0.0f, null, bVarI, 432, 0, 32736);
            ty0.a(bVarI, j.w(aVar4, 4.0f));
            lkf0.d(jl00Var.j, !z ? j.x(aVar4, 0.0f, 160.0f) : j.x(aVar4, 0.0f, 200.0f), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, bVarI), bVarI, 0, 24960, 110584);
            b bVar5 = bVarI;
            if (z) {
                f = 0.0f;
                f2 = 160.0f;
                bVar5.N(104395759);
                bVar5.X(false);
            } else {
                yqg.a(bVar5, 103564494, aVar4, 4.0f, bVar5);
                lkf0.d("|", null, c68.a(R.color.text_type1_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B1_M, bVar5), bVar5, 6, 24576, 114682);
                ty0.a(bVar5, j.w(aVar4, 4.0f));
                f2 = 160.0f;
                f = 0.0f;
                lkf0.d(jl00Var.h, j.x(aVar4, 0.0f, 160.0f), c68.a(R.color.text_type1_secondary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(R.style.B1_M, bVar5), bVar5, 48, 24960, 110584);
                bVar5 = bVar5;
                bVar5.X(false);
            }
            bVar5.X(true);
            b bVar6 = bVar5;
            lkf0.d(bjb0.a0(jl00Var.k, Locale.US), null, c68.a(R.color.text_type1_primary, bVar5), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B1_B, bVar5), bVar6, 0, 24576, 114682);
            bVar6.X(true);
            d dVarG2 = j.g(aVar4, 1.0f);
            d160 d160VarA3 = b160.a(jVar, ht.a.j, bVar6, 0);
            int iHashCode4 = Long.hashCode(bVar6.T);
            ne00 ne00VarS4 = bVar6.S();
            d dVarC4 = c.c(bVar6, dVarG2);
            bVar6.D();
            if (bVar6.S) {
                aVar2 = aVar5;
                bVar6.F(aVar2);
            } else {
                aVar2 = aVar5;
                bVar6.p();
            }
            hlh0.a(bVar6, d160VarA3, bVar4);
            hlh0.a(bVar6, ne00VarS4, dVar);
            if (bVar6.S || !Intrinsics.g(bVar6.y(), Integer.valueOf(iHashCode4))) {
                c1350a = c1350a3;
                n30.a(iHashCode4, bVar6, iHashCode4, c1350a);
            } else {
                c1350a = c1350a3;
            }
            hlh0.a(bVar6, dVarC4, cVar2);
            if (z) {
                i2 = R.style.B2_R;
                cVar = cVar2;
                c1350a2 = c1350a;
                aVar3 = aVar2;
                bVar = bVar4;
                bVar6.N(428244608);
                lkf0.d(jl00Var.h, null, c68.a(R.color.text_type1_primary, bVar6), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(i2, bVar6), bVar6, 0, 24960, 110586);
                bVar2 = bVar6;
                bVar2.X(false);
            } else {
                bVar6.N(427069150);
                d dVarX = j.x(aVar4, f, f2);
                String str3 = jl00Var.e;
                long jA = c68.a(R.color.text_type1_primary, bVar6);
                imf0 imf0VarL = mla.l(R.style.B2_R, bVar6);
                aVar3 = aVar2;
                bVar = bVar4;
                i2 = R.style.B2_R;
                c1350a2 = c1350a;
                cVar = cVar2;
                lkf0.d(str3, dVarX, jA, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0VarL, bVar6, 48, 24960, 110584);
                ty0.a(bVar6, j.w(aVar4, 4.0f));
                lkf0.d("vs", null, c68.a(R.color.text_type1_secondary, bVar6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(i2, bVar6), bVar6, 6, 24576, 114682);
                ty0.a(bVar6, j.w(aVar4, 4.0f));
                lkf0.d(jl00Var.f, j.x(aVar4, 0.0f, f2), c68.a(R.color.text_type1_primary, bVar6), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(i2, bVar6), bVar6, 48, 24960, 110584);
                bVar2 = bVar6;
                bVar2.X(false);
            }
            bVar2.X(true);
            d dVarG3 = j.g(aVar4, 1.0f);
            d160 d160VarA4 = b160.a(gVar, bVar3, bVar2, 54);
            int iHashCode5 = Long.hashCode(bVar2.T);
            ne00 ne00VarS5 = bVar2.S();
            d dVarC5 = c.c(bVar2, dVarG3);
            bVar2.D();
            if (bVar2.S) {
                bVar2.F(aVar3);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, d160VarA4, bVar);
            hlh0.a(bVar2, ne00VarS5, dVar);
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVar2, iHashCode5, c1350a2);
            }
            hlh0.a(bVar2, dVarC5, cVar);
            if (DateUtils.isToday(j)) {
                bVar2.N(-409641876);
                str = cb40.a(R.string.common_dates__today, new Object[0], bVar2) + " " + simpleDateFormat2.format(Long.valueOf(j));
                bVar2.X(false);
                simpleDateFormat3 = simpleDateFormat;
            } else {
                bVar2.N(-409457736);
                bVar2.X(false);
                simpleDateFormat3 = simpleDateFormat;
                str = simpleDateFormat3.format(Long.valueOf(j));
            }
            String str4 = str;
            str4.getClass();
            b bVar7 = bVar2;
            lkf0.d(str4, null, c68.a(R.color.text_type1_secondary, bVar2), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mla.l(i2, bVar2), bVar7, 0, 24960, 110586);
            bVarI = bVar7;
            if (z) {
                bVarI.N(-408423421);
                bVarI.X(false);
            } else {
                bVarI.N(-409133073);
                d dVarR2 = j.r(aVar4, 18.0f);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                psw pswVar = (psw) objY;
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new tvv(1, jl00Var, function1);
                    bVarI.r(objY2);
                }
                h6n.b(erz.a(R.drawable.ic_codehub_statistic, 0, bVarI), "code_statistic", androidx.compose.foundation.d.b(dVarR2, pswVar, null, false, null, (Function0) objY2, 28), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 48, 0);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            simpleDateFormat3 = simpleDateFormat;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final SimpleDateFormat simpleDateFormat4 = simpleDateFormat3;
            eVarZ.d = new Function2(simpleDateFormat4, simpleDateFormat2, function1, i) { // from class: xj00
                public final /* synthetic */ SimpleDateFormat b;
                public final /* synthetic */ SimpleDateFormat c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ik00.d(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final kl00 kl00Var, final SimpleDateFormat simpleDateFormat, final SimpleDateFormat simpleDateFormat2, List list, final Function1 function1, a aVar, final int i) {
        b bVar;
        final List listK;
        int i2;
        boolean z;
        simpleDateFormat.getClass();
        simpleDateFormat2.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1741636703);
        int i3 = i | (bVarI.M(kl00Var) ? 4 : 2) | (bVarI.A(simpleDateFormat) ? 32 : 16) | (bVarI.A(simpleDateFormat2) ? 256 : 128) | 1024 | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        Object[] objArr = 0;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i2 = i3 & (-7169);
                listK = kotlin.collections.b.k(new j58(c68.a(R.color.background_general_primary, bVarI)), new j58(j58.l));
            } else {
                bVarI.G();
                i2 = i3 & (-7169);
                listK = list;
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            int i4 = i2;
            d dVarB = androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_type1_quaternary, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = h.h(j.j(j.g(aVar2, 1.0f), 0.0f, 330.0f), 12.0f, 0.0f, 2);
                bVarI.r(objY);
            }
            d dVarN = (d) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.c(aVar2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, 458751), new zj00(listK, objArr == true ? 1 : 0));
                bVarI.r(objY2);
            }
            d dVar = (d) objY2;
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                z = true;
                objY3 = a6a0.b(new zu3(zzrVarA, 1));
                bVarI.r(objY3);
            } else {
                z = true;
            }
            if (!((Boolean) ((twd0) objY3).getValue()).booleanValue()) {
                dVarN = dVarN.n(dVar);
            }
            d dVar2 = dVarN;
            boolean zA = ((i4 & 14) == 4 ? z : false) | bVarI.A(simpleDateFormat) | bVarI.A(simpleDateFormat2) | ((i4 & 57344) == 16384 ? z : false);
            Object objY4 = bVarI.y();
            if (zA != 0 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: ak00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        kl00 kl00Var2 = kl00Var;
                        List<jl00> list2 = kl00Var2.n;
                        szrVar.d(list2.size(), null, new gk00(list2), new op8(2039820996, new hk00(list2, simpleDateFormat, simpleDateFormat2, function1, kl00Var2), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            aur.a(dVar2, zzrVarA, null, false, null, null, null, false, null, (Function1) objY4, bVarI, 0, 508);
            bVar = bVarI;
            bVar.X(z);
        } else {
            bVar = bVarI;
            bVar.G();
            listK = list;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(simpleDateFormat, simpleDateFormat2, listK, function1, i) { // from class: bk00
                public final /* synthetic */ SimpleDateFormat b;
                public final /* synthetic */ SimpleDateFormat c;
                public final /* synthetic */ List d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ik00.e(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
