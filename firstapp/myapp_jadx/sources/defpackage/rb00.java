package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class rb00 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jb00.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jb00 jb00Var = jb00.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[lxf0.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                lxf0 lxf0Var = lxf0.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(final ib00 ib00Var, final Function1<? super ib00, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        String strA;
        b bVarI = aVar.i(1968685082);
        int i2 = (bVarI.M(ib00Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            xt50 xt50VarB = ut50.b(0.0f, 7, 0L, false);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new pb00(0, function1, ib00Var);
                bVarI.r(objY2);
            }
            d.a aVar2 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.d.b(aVar2, pswVar, xt50VarB, false, null, (Function0) objY2, 28), 24.0f, 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC, cVar, 1.0f, true);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String str = ib00Var.b;
            zzg zzgVar = ib00Var.d;
            lkf0.d(cb40.a(R.string.page_payment__amount_vcurrency_vamount, new Object[]{str, ib00Var.c}, bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            if (zzgVar == null) {
                bVarI.N(769913921);
                bVarI.X(false);
            } else {
                String str2 = zzgVar.a;
                bVarI.N(769913922);
                int iOrdinal = zzgVar.b.ordinal();
                if (iOrdinal == 0) {
                    bVarI.N(-1264236927);
                    strA = cb40.a(R.string.page_payment__expires_in_vnum_seconds, new Object[]{str2}, bVarI);
                    bVarI.X(false);
                } else {
                    if (iOrdinal != 1) {
                        throw igf0.a(bVarI, -1264238952, false);
                    }
                    bVarI.N(-1264229891);
                    strA = cb40.a(R.string.page_payment__expires_in_vnum_min, new Object[]{str2}, bVarI);
                    bVarI.X(false);
                }
                lkf0.d(strA, h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, bVarI), bVarI, 48, 0, 131064);
                bVarI = bVarI;
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(true);
            h6n.b(erz.a(R.drawable.ic_chevron_right, 0, bVarI), null, null, c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 4);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: qb00
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rb00.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final sb00 sb00Var, final v3a0 v3a0Var, final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        sb00 sb00Var2;
        v3a0 v3a0Var2;
        final Function1<? super String, Unit> function3;
        Function0<Unit> function4;
        Function0<Unit> function5;
        b bVar;
        sb00Var.getClass();
        v3a0Var.getClass();
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1026584754);
        int i2 = (bVarI.A(sb00Var) ? 4 : 2) | i | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (!bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            sb00Var2 = sb00Var;
            v3a0Var2 = v3a0Var;
            function3 = function1;
            function4 = function0;
            function5 = function2;
            bVar = bVarI;
            bVar.G();
        } else {
            if (!sb00Var.a) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(v3a0Var, function1, function0, function2, i) { // from class: kb00
                        public final /* synthetic */ v3a0 b;
                        public final /* synthetic */ Function1 c;
                        public final /* synthetic */ Function0 d;
                        public final /* synthetic */ Function0 e;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(57);
                            rb00.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            yle yleVar = new yle(false, false, 3);
            Function2 function6 = new Function2() { // from class: lb00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    d.a aVar2;
                    sb00 sb00Var3;
                    lb00 lb00Var;
                    a.C0041a.C0042a c0042a;
                    int i3;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar4 = d.a.b;
                        d dVarE = j.e(aVar4, 1.0f);
                        n54 n54Var = ht.a.a;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarE);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar3, aivVarC, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar3, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        d dVarE2 = j.e(abk0.a(aVar4, Float.MIN_VALUE), 1.0f);
                        Function0 function7 = function0;
                        boolean zM = aVar3.M(function7);
                        Object objY = aVar3.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zM || objY == c0042a2) {
                            objY = new zo8(function7, 2);
                            aVar3.r(objY);
                        }
                        g75.a(g3w.f(dVarE2, true, (Function0) objY), aVar3, 0);
                        n54 n54Var2 = ht.a.e;
                        androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                        d dVarH = h.h(j.g(abk0.a(dVar2.b(aVar4, n54Var2), Float.MAX_VALUE), 1.0f), 40.0f, 0.0f, 2);
                        Object objY2 = aVar3.y();
                        if (objY2 == c0042a2) {
                            objY2 = new nb00();
                            aVar3.r(objY2);
                        }
                        d dVarF = g3w.f(dVarH, true, (Function0) objY2);
                        long jA = c68.a(R.color.bg_primary_d_base, aVar3);
                        zk40.a aVar6 = zk40.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarF, jA, aVar6);
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarB);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC2, bVar2);
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar3, dVarC2, cVar);
                        a.C0041a.C0042a c0042a3 = c0042a2;
                        c6n.a(function7, j.r(h.j(aVar4, 12.0f, 12.0f, 0.0f, 0.0f, 12), 20.0f), false, null, null, fi9.a, aVar3, 1572912, 60);
                        d dVarG = h.g(j.g(aVar4, 1.0f), 20.0f, 32.0f);
                        kw0.k kVar = kw0.c;
                        n54.a aVar7 = ht.a.m;
                        i78 i78VarA = g78.a(kVar, aVar7, aVar3, 0);
                        int iHashCode3 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO3 = aVar3.o();
                        d dVarC3 = c.c(aVar3, dVarG);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, i78VarA, bVar2);
                        hlh0.a(aVar3, ne00VarO3, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        String strA = cb40.a(R.string.page_payment__pending_deposits, new Object[0], aVar3);
                        n54.a aVar8 = ht.a.n;
                        lkf0.d(strA, new HorizontalAlignElement(aVar8), c68.a(R.color.text_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, aVar3), aVar3, 0, 0, 131064);
                        a aVar9 = aVar3;
                        sb00 sb00Var4 = sb00Var;
                        Integer num = sb00Var4.b;
                        if (num == null) {
                            aVar9.N(1312352526);
                            aVar9.H();
                            sb00Var3 = sb00Var4;
                            aVar2 = aVar4;
                        } else {
                            aVar9.N(1312352527);
                            aVar2 = aVar4;
                            sb00Var3 = sb00Var4;
                            lkf0.d(cb40.a(R.string.page_payment__vnum_max_pending_deposits_allowed, new Object[]{Integer.valueOf(num.intValue())}, aVar9), k78.a(aVar8, h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13)), c68.a(R.color.text_primary, aVar9), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, aVar9), aVar9, 0, 0, 131064);
                            aVar9 = aVar9;
                            Unit unit = Unit.a;
                            aVar9.H();
                        }
                        d dVarB2 = androidx.compose.foundation.a.b(ls7.a(h.j(j.g(aVar2, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), j060.c(8.0f)), c68.a(R.color.bg_secondary_d_lighter, aVar9), aVar6);
                        i78 i78VarA2 = g78.a(kVar, aVar7, aVar9, 0);
                        int iHashCode4 = Long.hashCode(aVar9.m());
                        ne00 ne00VarO4 = aVar9.o();
                        d dVarC4 = c.c(aVar9, dVarB2);
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar9.F(aVar5);
                        } else {
                            aVar9.p();
                        }
                        hlh0.a(aVar9, i78VarA2, bVar2);
                        hlh0.a(aVar9, ne00VarO4, dVar);
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar9, iHashCode4, c1350a);
                        }
                        hlh0.a(aVar9, dVarC4, cVar);
                        aVar9.N(-1921456285);
                        sb00 sb00Var5 = sb00Var3;
                        int i4 = 0;
                        for (Object obj3 : sb00Var5.c) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            ib00 ib00Var = (ib00) obj3;
                            if (i4 > 0) {
                                aVar9.N(978612907);
                                ute.b(h.h(aVar2, 12.0f, 0.0f, 2), 0.0f, c68.a(R.color.border_primary, aVar9), aVar9, 6, 2);
                                aVar9.H();
                            } else {
                                aVar9.N(978897363);
                                aVar9.H();
                            }
                            Function1 function8 = function1;
                            boolean zM2 = aVar9.M(function8) | aVar9.M(ib00Var);
                            Object objY3 = aVar9.y();
                            if (zM2) {
                                c0042a = c0042a3;
                            } else {
                                c0042a = c0042a3;
                                if (objY3 != c0042a) {
                                    i3 = 0;
                                }
                                rb00.a(ib00Var, (Function1) objY3, aVar9, i3);
                                c0042a3 = c0042a;
                                i4 = i5;
                            }
                            i3 = 0;
                            objY3 = new ob00(0, ib00Var, function8);
                            aVar9.r(objY3);
                            rb00.a(ib00Var, (Function1) objY3, aVar9, i3);
                            c0042a3 = c0042a;
                            i4 = i5;
                        }
                        aVar9.H();
                        aVar9.s();
                        jb00 jb00Var = sb00Var5.d;
                        int i6 = jb00Var == null ? -1 : rb00.a.a[jb00Var.ordinal()];
                        if (i6 != -1) {
                            Function0 function9 = function2;
                            if (i6 == 1) {
                                lb00Var = this;
                                aVar9.N(-1481631922);
                                aza.a(h.j(j.g(aVar2, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), cb40.a(R.string.page_payment__start_a_new_deposit, new Object[0], aVar9), null, null, sya.b, null, null, null, function9, null, aVar9, 6, 748);
                                aVar9.H();
                                Unit unit2 = Unit.a;
                            } else {
                                if (i6 != 2) {
                                    throw rg.a(-1481634112, aVar9);
                                }
                                aVar9.N(-1481615786);
                                lb00Var = this;
                                aza.a(h.j(j.g(aVar2, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), cb40.a(R.string.page_payment__continue_with_a_new_deposit, new Object[0], aVar9), null, null, sya.b, null, null, null, function9, null, aVar9, 6, 748);
                                aVar9.H();
                                Unit unit3 = Unit.a;
                            }
                        } else {
                            lb00Var = this;
                            aVar9.N(1315002686);
                            aVar9.H();
                            Unit unit4 = Unit.a;
                        }
                        aVar9.s();
                        aVar9.s();
                        d dVarE3 = j.e(aVar2, 1.0f);
                        aiv aivVarC3 = g75.c(n54Var, false);
                        int iHashCode5 = Long.hashCode(aVar9.m());
                        ne00 ne00VarO5 = aVar9.o();
                        d dVarC5 = c.c(aVar9, dVarE3);
                        yka.k.getClass();
                        tsr.a aVar10 = yka.a.b;
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar9.F(aVar10);
                        } else {
                            aVar9.p();
                        }
                        hlh0.a(aVar9, aivVarC3, yka.a.f);
                        hlh0.a(aVar9, ne00VarO5, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar9, iHashCode5, c1350a2);
                        }
                        hlh0.a(aVar9, dVarC5, yka.a.d);
                        s3a0.b(v3a0Var, dVar2.b(aVar2, ht.a.h), fi9.b, aVar9, 384, 0);
                        aVar9.s();
                        aVar9.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            };
            function5 = function2;
            function3 = function1;
            function4 = function0;
            sb00Var2 = sb00Var;
            v3a0Var2 = v3a0Var;
            bVar = bVarI;
            u60.a(function4, yleVar, pp8.b(-4682757, function6, bVarI), bVar, ((i2 >> 9) & 14) | 432, 0);
        }
        e eVarZ2 = bVar.Z();
        if (eVarZ2 != null) {
            final sb00 sb00Var3 = sb00Var2;
            final v3a0 v3a0Var3 = v3a0Var2;
            final Function0<Unit> function7 = function5;
            final Function0<Unit> function8 = function4;
            eVarZ2.d = new Function2(v3a0Var3, function3, function8, function7, i) { // from class: mb00
                public final /* synthetic */ v3a0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(57);
                    rb00.b(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
