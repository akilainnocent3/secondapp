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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class nv3 {

    public static final class a implements ssd0 {
        public final /* synthetic */ Function2<zrd0, BigDecimal, Unit> a;
        public final /* synthetic */ ov3 b;
        public final /* synthetic */ Function2<zrd0, String, Unit> c;
        public final /* synthetic */ Function1<zrd0, Unit> d;
        public final /* synthetic */ Function1<zrd0, Unit> e;
        public final /* synthetic */ Function2<zrd0, Boolean, Unit> f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super zrd0, ? super BigDecimal, Unit> function2, ov3 ov3Var, Function2<? super zrd0, ? super String, Unit> function3, Function1<? super zrd0, Unit> function1, Function1<? super zrd0, Unit> function4, Function2<? super zrd0, ? super Boolean, Unit> function5) {
            this.a = function2;
            this.b = ov3Var;
            this.c = function3;
            this.d = function1;
            this.e = function4;
            this.f = function5;
        }

        @Override // defpackage.ssd0
        public final void a() {
            this.e.invoke(this.b.h);
        }

        @Override // defpackage.ssd0
        public final void b() {
            this.d.invoke(this.b.h);
        }

        @Override // defpackage.ssd0
        public final void c(String str) {
            str.getClass();
            this.c.invoke(this.b.h, str);
        }

        @Override // defpackage.ssd0
        public final void d(boolean z) {
            this.f.invoke(this.b.h, Boolean.valueOf(z));
        }

        @Override // defpackage.ssd0
        public final void e(BigDecimal bigDecimal) {
            this.a.invoke(this.b.h, bigDecimal);
        }
    }

    public static final void a(final ov3 ov3Var, final Function1<? super String, Unit> function1, final Function1<? super zrd0, Unit> function2, final Function2<? super zrd0, ? super BigDecimal, Unit> function3, final Function2<? super zrd0, ? super String, Unit> function4, final Function1<? super zrd0, Unit> function5, final Function1<? super zrd0, Unit> function6, final Function2<? super zrd0, ? super Boolean, Unit> function7, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        n54.a aVar2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        kw0.k kVar;
        kw0.j jVar;
        boolean z2;
        qyd0 qyd0Var;
        boolean z3;
        boolean z4;
        d.a aVar3;
        ov3Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        b bVarI = aVar.i(1281334678);
        int i2 = i | (bVarI.A(ov3Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function3) ? 2048 : 1024) | (bVarI.A(function4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function5) ? 131072 : 65536) | (bVarI.A(function6) ? 1048576 : 524288) | (bVarI.A(function7) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            long jA = c68.a(ov3Var.b, bVarI);
            d.a aVar4 = d.a.b;
            zk40.a aVar5 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(aVar4, jA, aVar5);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                objY = new jv3();
                bVarI.r(objY);
            }
            d dVarH = g3w.h(xa80.b(dVarB, false, (Function1) objY), "betslip_selection");
            kw0.k kVar2 = kw0.c;
            n54.a aVar6 = ht.a.m;
            i78 i78VarA = g78.a(kVar2, aVar6, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(aVar4, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            n54.b bVar2 = ht.a.j;
            kw0.j jVar2 = kw0.a;
            d160 d160VarA = b160.a(jVar2, bVar2, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            xt3 xt3Var = ov3Var.c;
            if (xt3Var == null) {
                bVarI.N(-20273911);
                z = false;
                bVarI.X(false);
            } else {
                z = false;
                bVarI.N(-20273910);
                wt3.a(h.j(aVar4, 4.0f, 6.0f, 0.0f, 0.0f, 12), xt3Var, bVarI, 6);
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            UiText uiText = ov3Var.d;
            if (uiText == null) {
                bVarI.N(-20011651);
                bVarI.X(z);
                c0042a = c0042a2;
                aVar2 = aVar6;
                jVar = jVar2;
                kVar = kVar2;
                z2 = true;
            } else {
                bVarI.N(-20011650);
                d dVarA = ls7.a(j.k(h.j(aVar4, 4.0f, 8.0f, 0.0f, 2.0f, 4), 16.0f, 0.0f, 2), j060.c(16.0f));
                qyd0 qyd0Var2 = oib0.a;
                d dVarH2 = h.h(androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var2)).s0, aVar5), 6.0f, 0.0f, 2);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode3 = Long.hashCode(bVarI.m());
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar7);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                aVar2 = aVar6;
                c0042a = c0042a2;
                kVar = kVar2;
                jVar = jVar2;
                lkf0.d(uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var2)).d, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).n, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                z2 = true;
                bVarI.X(true);
                Unit unit2 = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(z2);
            d dVarG = j.g(r16, 1.0f);
            n54.b bVar3 = ht.a.k;
            d160 d160VarA2 = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            crz crzVarA = erz.a(R.drawable.ic__cancel, 0, bVarI);
            d dVarA2 = ls7.a(h.j(aVar4, 8.0f, 0.0f, 6.0f, 0.0f, 10), j060.a);
            int i3 = i2 & 14;
            boolean z5 = ((i2 & 112) == 32) | (i3 == 4 || bVarI.A(ov3Var));
            Object objY2 = bVarI.y();
            if (z5 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: kv3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(ov3Var.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarH3 = g3w.h(j.r(h.f(androidx.compose.foundation.d.d(dVarA2, false, null, null, (Function0) objY2, 15), 4.0f), 16.0f), "betslip_selection_remove_icon");
            qyd0 qyd0Var3 = oib0.a;
            b bVar4 = bVarI;
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = c0042a;
            h6n.b(crzVarA, "Remove selection", dVarH3, ((lib0) bVarI.O(qyd0Var3)).O, bVar4, 48, 0);
            d dVarJ2 = h.j(j.g(aVar4, 1.0f), 0.0f, 8.0f, 16.0f, 7.0f, 1);
            n54.a aVar8 = aVar2;
            i78 i78VarA2 = g78.a(new kw0.i(4.0f, true, new hw0()), aVar8, bVar4, 6);
            int iHashCode5 = Long.hashCode(bVar4.m());
            ne00 ne00VarS5 = bVar4.S();
            d dVarC5 = c.c(bVar4, dVarJ2);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar7);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, i78VarA2, bVar);
            hlh0.a(bVar4, ne00VarS5, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVar4, iHashCode5, c1350a);
            }
            hlh0.a(bVar4, dVarC5, cVar);
            gw8.a(ov3Var.e, bVar4, 0);
            i78 i78VarA3 = g78.a(kVar, aVar8, bVar4, 0);
            int iHashCode6 = Long.hashCode(bVar4.m());
            ne00 ne00VarS6 = bVar4.S();
            d dVarC6 = c.c(bVar4, aVar4);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar7);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, i78VarA3, bVar);
            hlh0.a(bVar4, ne00VarS6, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode6))) {
                n30.a(iHashCode6, bVar4, iHashCode6, c1350a);
            }
            hlh0.a(bVar4, dVarC6, cVar);
            d dVarG2 = j.g(aVar4, 1.0f);
            d160 d160VarA3 = b160.a(new kw0.i(8.0f, true, new hw0()), bVar3, bVar4, 54);
            int iHashCode7 = Long.hashCode(bVar4.m());
            ne00 ne00VarS7 = bVar4.S();
            d dVarC7 = c.c(bVar4, dVarG2);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar7);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, d160VarA3, bVar);
            hlh0.a(bVar4, ne00VarS7, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode7))) {
                n30.a(iHashCode7, bVar4, iHashCode7, c1350a);
            }
            LayoutWeightElement layoutWeightElementA = yy.a(bVar4, dVarC7, cVar, 1.0f, true);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            int iHashCode8 = Long.hashCode(bVar4.m());
            ne00 ne00VarS8 = bVar4.S();
            d dVarC8 = c.c(bVar4, layoutWeightElementA);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar7);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, aivVarC2, bVar);
            hlh0.a(bVar4, ne00VarS8, dVar);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode8))) {
                n30.a(iHashCode8, bVar4, iHashCode8, c1350a);
            }
            hlh0.a(bVar4, dVarC8, cVar);
            String str = ov3Var.f;
            long jA2 = c68.a(ov3Var.g, bVar4);
            qyd0 qyd0Var4 = kjb0.a;
            lkf0.d(str, null, jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar4.O(qyd0Var4)).j, bVar4, 0, 0, 131066);
            bVarI = bVar4;
            bVarI.X(true);
            d dVarH4 = g3w.h(aVar4, "betslip_selection_stake_input");
            asd0 asd0Var = ov3Var.i;
            boolean z6 = ((i2 & 896) == 256) | (i3 == 4 || bVarI.A(ov3Var));
            Object objY3 = bVarI.y();
            if (z6 || objY3 == c0042a3) {
                objY3 = new Function0() { // from class: lv3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(ov3Var.h);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            xrd0.a(dVarH4, asd0Var, (Function0) objY3, bVarI, 6);
            bVarI.X(true);
            UiText uiText2 = ov3Var.j;
            if (uiText2 == null) {
                bVarI.N(-388439863);
                z4 = false;
                bVarI.X(false);
                qyd0Var = qyd0Var3;
                z3 = true;
            } else {
                bVarI.N(-388439862);
                d dVarJ3 = h.j(j.g(aVar4, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                aiv aivVarC3 = g75.c(ht.a.f, false);
                int iHashCode9 = Long.hashCode(bVarI.m());
                ne00 ne00VarS9 = bVarI.S();
                d dVarC9 = c.c(bVarI, dVarJ3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar7);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar);
                hlh0.a(bVarI, ne00VarS9, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                    n30.a(iHashCode9, bVarI, iHashCode9, c1350a);
                }
                hlh0.a(bVarI, dVarC9, cVar);
                qyd0Var = qyd0Var3;
                lkf0.e(uiText2.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) bVarI.O(qyd0Var)).j, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 0, false, 0, 0, null, null, ((ijb0) bVarI.O(qyd0Var4)).q, bVarI, 0, 0, 261114);
                bVarI = bVarI;
                z3 = true;
                bVarI.X(true);
                Unit unit3 = Unit.a;
                z4 = false;
                bVarI.X(false);
            }
            f30.a(bVarI, z3, z3, z3);
            if (ov3Var.k) {
                bVarI.N(-1494871504);
                aVar3 = aVar4;
                psd0.a(h.j(aVar4, 0.0f, 1.0f, 0.0f, 7.0f, 5), ov3Var.l, new a(function3, ov3Var, function4, function5, function6, function7), bVarI, 70, 0);
                bVarI.X(z4);
            } else {
                aVar3 = aVar4;
                bVarI.N(-1493839390);
                bVarI.X(z4);
            }
            ute.b(h.j(j.g(aVar3, 1.0f), 34.0f, 0.0f, 0.0f, 0.0f, 14), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).A, bVarI, 6, 0);
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function3, function4, function5, function6, function7, i) { // from class: mv3
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function2 v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    nv3.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
