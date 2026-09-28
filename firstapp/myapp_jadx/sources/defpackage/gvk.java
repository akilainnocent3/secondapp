package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class gvk {
    public static final void a(final d dVar, final eok eokVar, final Function0 function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(2146587457);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(eokVar) : bVarI.A(eokVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = eokVar.l;
            int i3 = eokVar.b.a;
            twd0 twd0VarB = xe0.b(z ? 180.0f : 0.0f, null, "rotation", null, bVarI, 3072, 22);
            kw0.k kVar = kw0.c;
            n54.a aVar2 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d160 d160VarA = b160.a(kw0.a, ht.a.l, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d.a aVar4 = d.a.b;
            d dVarC2 = c.c(bVarI, aVar4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVarI, dVarC2, cVar, 1.0f, true);
            i78 i78VarA2 = g78.a(kVar, aVar2, bVarI, 0);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, layoutWeightElementA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            String strG = eokVar.g.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            qyd0 qyd0Var = kjb0.a;
            lkf0.d(strG, null, c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).i, bVarI, 0, 0, 131066);
            d dVarJ = h.j(aVar4, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String str = eokVar.h;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).n;
            qyd0 qyd0Var2 = oib0.a;
            lkf0.d(str, dVarJ, ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 48, 0, 131064);
            bVarI.X(true);
            d dVarF = g3w.f(h.j(aVar4, 0.0f, 0.0f, 10.0f, 0.0f, 11), true, function0);
            d160 d160VarA2 = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            lkf0.d(cb40.a(R.string.common_functions__more, new Object[0], bVarI), null, c68.a(i3, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).n, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            d dVarR = j.r(aVar4, 16.0f);
            boolean zM = bVarI.M(twd0VarB);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = new tib(twd0VarB, 1);
                bVarI.r(objY);
            }
            h9n.a(erz.a(R.drawable.spr_arrow_gift_blue_down, 0, bVarI), null, androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY), null, null, 0.0f, new gf4(c68.a(i3, bVarI), 5), bVarI, 48, 56);
            bVarI.X(true);
            bVarI.X(true);
            if (eokVar.l) {
                bVarI.N(-181910575);
                lkf0.d(eokVar.i, j.g(h.j(aVar4, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).n, bVarI, 48, 0, 131064);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(-181648873);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vuk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gvk.a(dVar, eokVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, eok eokVar, Function1 function1, a aVar, final int i) {
        int i2;
        final eok eokVar2;
        final Function1 function2;
        yka.a.C1350a c1350a;
        b bVarI = aVar.i(-697081080);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(eokVar) : bVarI.A(eokVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            kw0.j jVar = kw0.a;
            n54.b bVar = ht.a.j;
            d160 d160VarA = b160.a(jVar, bVar, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, ht.a.m, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            UiText uiText = eokVar.c;
            uiText.getClass();
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var));
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).n;
            long jA = c68.a(R.color.text_type2_primary, bVarI);
            d.a aVar3 = d.a.b;
            int i3 = i2;
            lkf0.d(strG, aVar3, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 48, 0, 131064);
            d dVarJ = h.j(aVar3, 0.0f, 10.0f, 0.0f, 0.0f, 13);
            d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                c1350a = c1350a2;
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC3, cVar);
            yka.a.C1350a c1350a3 = c1350a;
            eokVar2 = eokVar;
            lkf0.d(eokVar.d, aVar3, c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, 48, 0, 131064);
            d dVarH = g3w.h(h.j(aVar3, 7.0f, 0.0f, 0.0f, 0.0f, 14), "gift_selector_item_gift_value_text");
            UiText uiText2 = eokVar2.e;
            uiText2.getClass();
            lkf0.d(uiText2.g((Context) bVarI.O(qyd0Var)), dVarH, c68.a(R.color.text_type2_primary, bVarI), null, mla.m(25.0f, bVarI), null, t9i.E, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 1572912, 0, 262056);
            bVarI.X(true);
            bVarI.X(true);
            i78 i78VarA2 = g78.a(kVar, ht.a.o, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarT = j.t(aVar3, 76.0f, 26.0f);
            hok hokVar = eokVar2.b;
            xik xikVar = eokVar2.k;
            boolean z = eokVar2.j;
            boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(eokVar2))) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                function2 = function1;
                objY = new Function0() { // from class: ouk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(eokVar2.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                function2 = function1;
            }
            c(dVarT, hokVar, xikVar, z, (Function0) objY, bVarI, 6);
            lkf0.d(eokVar2.f.g((Context) bVarI.O(qyd0Var)), h.j(aVar3, 0.0f, 6.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type2_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 48, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            eokVar2 = eokVar;
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: quk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    gvk.b(dVar, eokVar2, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final eok eokVar, Function1<? super String, Unit> function1, final Function1<? super String, Unit> function2, a aVar, int i) {
        Function1<? super String, Unit> function3;
        boolean z;
        eokVar.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(869666424);
        int i2 = i | (bVarI.M(eokVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = i2 | (bVarI.A(function2) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY);
            }
            final isw iswVar = (isw) objY;
            boolean zC = bVarI.c(iswVar.j());
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                objY2 = new g7f(mmdVar.v1(iswVar.j()));
                bVarI.r(objY2);
            }
            float f = ((g7f) objY2).a;
            boolean zC2 = bVarI.c(f);
            Object objY3 = bVarI.y();
            if (zC2 || objY3 == c0042a) {
                objY3 = new yvk(f);
                bVarI.r(objY3);
            }
            yvk yvkVar = (yvk) objY3;
            aiv aivVarC = g75.c(ht.a.a, false);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarA = ls7.a(j.g(aVar2, 1.0f), yvkVar);
            qyd0 qyd0Var = oib0.a;
            d dVarA2 = d35.a(dVarA, 0.5f, ((lib0) bVarI.O(qyd0Var)).A, yvkVar);
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
            zk40.a aVar4 = zk40.a;
            d dVarA3 = androidx.compose.animation.e.a(androidx.compose.foundation.a.b(dVarA2, j, aVar4));
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                z = false;
                objY4 = new zuk(0);
                bVarI.r(objY4);
            } else {
                z = false;
            }
            d dVarH = g3w.h(xa80.b(dVarA3, z, (Function1) objY4), "gift_selector_item_content_" + eokVar.a);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
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
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new Function1() { // from class: bvk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        iswVar.A((int) (((jxo) obj).a & 4294967295L));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            d dVarG = h.g(j.g(androidx.compose.foundation.a.b(w.a(aVar2, (Function1) objY5), c68.a(eokVar.b.a, bVarI), aVar4), 1.0f), 12.0f, 10.0f);
            int i4 = i3 << 3;
            int i5 = i4 & 112;
            function3 = function1;
            b(dVarG, eokVar, function3, bVarI, i4 & 1008);
            ute.b(j.g(aVar2, 1.0f), 0.0f, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 6, 2);
            d dVarG2 = h.g(j.g(aVar2, 1.0f), 12.0f, 10.0f);
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objY6 = bVarI.y();
            if (z2 || objY6 == c0042a) {
                objY6 = new Function0() { // from class: dvk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(eokVar.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY6);
            }
            a(dVarG2, eokVar, (Function0) objY6, bVarI, 6 | i5);
            bVarI.X(true);
            if (eokVar.k != xik.a) {
                bVarI.N(-366992879);
                e(androidx.compose.foundation.layout.d.a.f(aVar2), yvkVar, bVarI, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-366851612);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            function3 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new evk(i, 0, function2, eokVar, function3);
        }
    }

    public static final void e(final d dVar, final qx80 qx80Var, a aVar, final int i) {
        b bVarI = aVar.i(-563863397);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(qx80Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            g75.a(androidx.compose.foundation.a.b(ls7.a(dVar, qx80Var), j58.c(0.8f, c68.a(R.color.background_type1_quaternary, bVarI)), zk40.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qx80Var, i) { // from class: suk
                public final /* synthetic */ qx80 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gvk.e(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final hok hokVar, xik xikVar, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        final xik xikVar2;
        long jA;
        boolean z2;
        b bVarI = aVar.i(1335793562);
        int i2 = i | (bVarI.d(hokVar.ordinal()) ? 32 : 16) | (bVarI.d(xikVar.ordinal()) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            xikVar2 = xikVar;
            boolean z3 = xikVar2 == xik.b;
            if (z) {
                bVarI.N(1754311408);
                jA = c68.a(hokVar.b, bVarI);
                bVarI.X(false);
            } else {
                jA = rzg.a(bVarI, 1754372974, R.color.brand_tertiary, bVarI, false);
            }
            d dVarB = androidx.compose.foundation.a.b(dVar, jA, zk40.a);
            d.a aVar2 = d.a.b;
            d dVarH = g3w.h(dVarB.n(z3 ? aVar2 : g3w.f(aVar2, true, function0)), lobGSRIlnSGJY.JtKBcJcMrTnV);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
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
            if (z) {
                bVarI.N(-442851470);
                z2 = true;
                h9n.a(erz.a(R.drawable.spr_betslip_gift_seleted, 0, bVarI), null, j.c(aVar2, 1.0f), null, d0b.a.e, 0.0f, null, bVarI, 25008, 104);
                bVarI.X(false);
            } else {
                z2 = true;
                if (z) {
                    throw igf0.a(bVarI, -707023021, false);
                }
                bVarI.N(-707013266);
                lkf0.d(cb40.a(z3 ? R.string.common_functions__upcoming : R.string.gift__use, new Object[0], bVarI), null, c68.a(hokVar.a, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).m, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            xikVar2 = xikVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(hokVar, xikVar2, z, function0, i) { // from class: xuk
                public final /* synthetic */ hok b;
                public final /* synthetic */ xik c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    gvk.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
