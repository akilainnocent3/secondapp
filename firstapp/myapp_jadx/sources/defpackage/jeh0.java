package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
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

/* JADX INFO: loaded from: classes5.dex */
public final class jeh0 {
    public static final void a(final v3a0 v3a0Var, final Function0 function0, final Function0 function1, final Function0 function2, meh0 meh0Var, a aVar, final int i) {
        b bVar;
        final meh0 meh0Var2;
        meh0 meh0Var3;
        int i2;
        v3a0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(354802142);
        int i3 = i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | 8192;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    meh0Var3 = (meh0) p8i0.a(jq40.a(meh0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-57345);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-57345);
                meh0Var3 = meh0Var;
            }
            bVarI.Y();
            final ytw ytwVarC = wyh.c(meh0Var3.b, bVarI, 0, 7);
            final meh0 meh0Var4 = meh0Var3;
            bVar = bVarI;
            v1w.a(function2, null, v1w.g(true, null, bVarI, 6, 2), 0.0f, false, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), c68.a(R.color.bg_primary_d_base, bVarI), 0L, 0L, fz9.a, null, null, pp8.b(-1865717440, new gaj() { // from class: feh0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tsr.a aVar2;
                    yka.a.C1350a c1350a;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar4 = d.a.b;
                        d dVarH = h.h(j.g(aVar4, 1.0f), 8.0f, 0.0f, 2);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarH);
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
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar3, dVarC, cVar);
                        d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), c68.a(R.color.bg_primary_d_base, aVar3), j060.c(12.0f)), 16.0f, 20.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar3, 0);
                        int iHashCode2 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO2 = aVar3.o();
                        d dVarC2 = c.c(aVar3, dVarG);
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
                        hlh0.a(aVar3, ne00VarO2, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar3, dVarC2, cVar);
                        d dVarG2 = j.g(aVar4, 1.0f);
                        kw0.j jVar = kw0.a;
                        n54.b bVar3 = ht.a.k;
                        d160 d160VarA = b160.a(jVar, bVar3, aVar3, 48);
                        int iHashCode3 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO3 = aVar3.o();
                        d dVarC3 = c.c(aVar3, dVarG2);
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
                        hlh0.a(aVar3, d160VarA, bVar2);
                        hlh0.a(aVar3, ne00VarO3, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar3, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar3, dVarC3, cVar);
                        f160 f160Var = f160.a;
                        lkf0.d(cb40.a(R.string.unique_codes__info_sheet_title, new Object[0], aVar3), f160Var.a(1.0f, aVar4, true), c68.a(R.color.text_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 0, 0, 131064);
                        c6n.a(function2, null, false, null, null, fz9.b, aVar3, 1572864, 62);
                        aVar3.s();
                        ty0.a(aVar3, j.i(aVar4, 16.0f));
                        h9n.a(erz.a(R.drawable.money_unique, 0, aVar3), null, j.i(new HorizontalAlignElement(ht.a.n), 120.0f), null, d0b.a.c, 0.0f, null, aVar3, 24624, 104);
                        ty0.a(aVar3, j.i(aVar4, 16.0f));
                        int i4 = nk0.e;
                        lkf0.e(jnm.a(cb40.a(R.string.unique_codes__info_sheet_description, new Object[0], aVar3)), null, c68.a(R.color.text_primary, aVar3), 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, aVar3), aVar3, 0, 0, 261114);
                        d dVarB = wtc.b(aVar4, 16.0f, aVar3, aVar4, 1.0f);
                        d160 d160VarA2 = b160.a(jVar, bVar3, aVar3, 48);
                        int iHashCode4 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO4 = aVar3.o();
                        d dVarC4 = c.c(aVar3, dVarB);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar2 = aVar5;
                            aVar3.F(aVar2);
                        } else {
                            aVar2 = aVar5;
                            aVar3.p();
                        }
                        hlh0.a(aVar3, d160VarA2, bVar2);
                        hlh0.a(aVar3, ne00VarO4, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode4))) {
                            c1350a = c1350a2;
                            j3c.a(iHashCode4, aVar3, iHashCode4, c1350a);
                        } else {
                            c1350a = c1350a2;
                        }
                        hlh0.a(aVar3, dVarC4, cVar);
                        boolean z = ((keh0) ytwVarC.getValue()).a;
                        final meh0 meh0Var5 = meh0Var4;
                        boolean zA = aVar3.A(meh0Var5);
                        Object objY = aVar3.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function1() { // from class: heh0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    meh0 meh0Var6 = meh0Var5;
                                    meh0Var6.y1(new leh0(meh0Var6, zBooleanValue, null));
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY);
                        }
                        yka.a.C1350a c1350a3 = c1350a;
                        vj7.a(z, (Function1) objY, null, false, pj7.a(c68.a(R.color.colorPrimary, aVar3), c68.a(R.color.text_primary, aVar3), 0L, 0L, 0L, aVar3, 60), aVar3, 0, 44);
                        ty0.a(aVar3, j.w(aVar4, 4.0f));
                        tsr.a aVar6 = aVar2;
                        lkf0.d(cb40.a(R.string.unique_codes__info_sheet_dont_show_again, new Object[0], aVar3), f160Var.a(1.0f, aVar4, true), c68.a(R.color.text_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar3), aVar3, 0, 0, 131064);
                        aVar3.s();
                        ty0.a(aVar3, j.i(aVar4, 16.0f));
                        d dVarG3 = j.g(aVar4, 1.0f);
                        d160 d160VarA3 = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.j, aVar3, 6);
                        int iHashCode5 = Long.hashCode(aVar3.m());
                        ne00 ne00VarO5 = aVar3.o();
                        d dVarC5 = c.c(aVar3, dVarG3);
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar6);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, d160VarA3, bVar2);
                        hlh0.a(aVar3, ne00VarO5, dVar);
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode5))) {
                            j3c.a(iHashCode5, aVar3, iHashCode5, c1350a3);
                        }
                        hlh0.a(aVar3, dVarC5, cVar);
                        vuc0.b(f160Var.a(1.0f, aVar4, true), false, null, null, null, cb40.a(R.string.unique_codes__info_sheet_know_more, new Object[0], aVar3), null, null, null, null, function0, aVar3, 0, 0, 990);
                        d dVarA = f160Var.a(1.0f, aVar4, true);
                        alb0 alb0Var = sya.a;
                        final Function0 function3 = function1;
                        boolean zM = aVar3.M(function3);
                        Object objY2 = aVar3.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: ieh0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function3.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar3.r(objY2);
                        }
                        xya.b(dVarA, false, null, alb0Var, null, 0.0f, null, (Function0) objY2, fz9.d, aVar3, 100663296, 118);
                        aVar3.s();
                        aVar3.s();
                        s3a0.b(v3a0Var, androidx.compose.foundation.layout.d.a.b(aVar4, ht.a.h), null, aVar3, 0, 4);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i2 >> 9) & 14, 3078, 7066);
            meh0Var2 = meh0Var4;
        } else {
            bVar = bVarI;
            bVar.G();
            meh0Var2 = meh0Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, meh0Var2, i) { // from class: geh0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ meh0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    jeh0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
