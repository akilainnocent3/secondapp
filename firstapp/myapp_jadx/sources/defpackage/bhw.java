package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class bhw {

    @c0d(c = "com.sportybet.android.multimaker.presentation.compose.MultiMakerFooterComposeViewKt$MultiMakerFooterView$1$1", f = "MultiMakerFooterComposeView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke();
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.multimaker.presentation.compose.MultiMakerFooterComposeViewKt$MultiMakerFooterView$2$2$3$1$1$1", f = "MultiMakerFooterComposeView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ k4i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k4i k4iVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = k4iVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.t(false);
            return Unit.a;
        }
    }

    public static final void a(final chw chwVar, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function1<? super String, Unit> function3, final Function0<Unit> function4, final Function0<Unit> function5, final Function0<Unit> function6, final Function1<? super UiText, Unit> function7, androidx.compose.runtime.a aVar, final int i) {
        chwVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-625742418);
        int i2 = i | (bVarI.A(chwVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function4) ? 131072 : 65536) | (bVarI.A(function5) ? 1048576 : 524288) | (bVarI.A(function6) ? 8388608 : 4194304) | (bVarI.A(function7) ? 67108864 : 33554432);
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new gly(0L));
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(new jxo(0L));
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            Unit unit = Unit.a;
            boolean z = (i2 & 3670016) == 1048576;
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new a(function5, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, unit, (Function2) objY3);
            q75.a(j.g(d.a.b, 1.0f), null, false, pp8.b(74983812, new gaj() { // from class: pgw
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    n54.a aVar2;
                    yka.a.d dVar;
                    tsr.a aVar3;
                    yka.a.b bVar;
                    yka.a.c cVar;
                    int i3;
                    kw0.j jVar;
                    n54.b bVar2;
                    kw0.k kVar;
                    final chw chwVar2;
                    pgw pgwVar;
                    float f;
                    float f2;
                    mmd mmdVar2;
                    ytw ytwVar3;
                    tsr.a aVar4;
                    yka.a.C1350a c1350a;
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((r75) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar6 = d.a.b;
                        d dVarG = j.g(aVar6, 1.0f);
                        long jA = c68.a(R.color.bg_inverse_disabled, aVar5);
                        zk40.a aVar7 = zk40.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarG, jA, aVar7);
                        Object objY4 = aVar5.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY4 == c0042a2) {
                            objY4 = new vgw();
                            aVar5.r(objY4);
                        }
                        d dVarB2 = xa80.b(dVarB, false, (Function1) objY4);
                        kw0.k kVar2 = kw0.c;
                        n54.a aVar8 = ht.a.m;
                        i78 i78VarA = g78.a(kVar2, aVar8, aVar5, 0);
                        int iHashCode = Long.hashCode(aVar5.m());
                        ne00 ne00VarO = aVar5.o();
                        d dVarC = c.c(aVar5, dVarB2);
                        yka.k.getClass();
                        tsr.a aVar9 = yka.a.b;
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar9);
                        } else {
                            aVar5.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar5, i78VarA, bVar3);
                        yka.a.d dVar2 = yka.a.e;
                        hlh0.a(aVar5, ne00VarO, dVar2);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar5, iHashCode, c1350a2);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar5, dVarC, cVar2);
                        chw chwVar3 = chwVar;
                        boolean z2 = chwVar3.j;
                        dfw dfwVar = chwVar3.i;
                        kw0.j jVar2 = kw0.a;
                        n54.b bVar4 = ht.a.k;
                        if (z2) {
                            aVar5.N(-467296005);
                            d dVarF = h.f(androidx.compose.foundation.a.b(j.g(aVar6, 1.0f), c68.a(R.color.bg_inverse_secondary, aVar5), aVar7), 8.0f);
                            d160 d160VarA = b160.a(jVar2, bVar4, aVar5, 48);
                            int iHashCode2 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO2 = aVar5.o();
                            d dVarC2 = c.c(aVar5, dVarF);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar9);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, d160VarA, bVar3);
                            hlh0.a(aVar5, ne00VarO2, dVar2);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar5, dVarC2, cVar2);
                            aVar2 = aVar8;
                            h6n.b(erz.a(R.drawable.icon_exclamtion_2, 0, aVar5), "Spin Icon", j.r(aVar6, 20.0f), c68.a(R.color.icon_inverse_highlight, aVar5), aVar5, 432, 0);
                            ty0.a(aVar5, j.w(aVar6, 8.0f));
                            d dVarH = g3w.h(aVar6, "top_warning_text");
                            String strA = cb40.a(R.string.component_betslip__liability_change_selections_dialog_content, new Object[0], aVar5);
                            imf0 imf0VarB = imf0.b(mla.l(R.style.B2_M, aVar5), c68.a(R.color.text_inverse_warning, aVar5), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                            aVar3 = aVar9;
                            i3 = R.color.bg_inverse_secondary;
                            cVar = cVar2;
                            dVar = dVar2;
                            jVar = jVar2;
                            bVar = bVar3;
                            bVar2 = bVar4;
                            kVar = kVar2;
                            chwVar2 = chwVar3;
                            lkf0.d(strA, dVarH, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarB, aVar5, 48, 0, 131068);
                            aVar5 = aVar5;
                            aVar5.s();
                            aVar5.H();
                        } else {
                            aVar2 = aVar8;
                            dVar = dVar2;
                            aVar3 = aVar9;
                            bVar = bVar3;
                            cVar = cVar2;
                            i3 = R.color.bg_inverse_secondary;
                            jVar = jVar2;
                            bVar2 = bVar4;
                            kVar = kVar2;
                            chwVar2 = chwVar3;
                            aVar5.N(-466053432);
                            aVar5.H();
                        }
                        ty0.a(aVar5, j.i(aVar6, 12.0f));
                        if (chwVar2.l) {
                            aVar5.N(-465654090);
                            d dVarH2 = h.h(j.g(aVar6, 1.0f), 12.0f, 0.0f, 2);
                            kw0.j jVar3 = jVar;
                            n54.b bVar5 = bVar2;
                            d160 d160VarA2 = b160.a(jVar3, bVar5, aVar5, 48);
                            int iHashCode3 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO3 = aVar5.o();
                            d dVarC3 = c.c(aVar5, dVarH2);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar4 = aVar3;
                                aVar5.F(aVar4);
                            } else {
                                aVar4 = aVar3;
                                aVar5.p();
                            }
                            yka.a.b bVar6 = bVar;
                            hlh0.a(aVar5, d160VarA2, bVar6);
                            yka.a.d dVar3 = dVar;
                            hlh0.a(aVar5, ne00VarO3, dVar3);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                c1350a = c1350a2;
                                j3c.a(iHashCode3, aVar5, iHashCode3, c1350a);
                            } else {
                                c1350a = c1350a2;
                            }
                            yka.a.c cVar3 = cVar;
                            hlh0.a(aVar5, dVarC3, cVar3);
                            i78 i78VarA2 = g78.a(kVar, aVar2, aVar5, 0);
                            int iHashCode4 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO4 = aVar5.o();
                            d dVarC4 = c.c(aVar5, aVar6);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar4);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, i78VarA2, bVar6);
                            hlh0.a(aVar5, ne00VarO4, dVar3);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                j3c.a(iHashCode4, aVar5, iHashCode4, c1350a);
                            }
                            hlh0.a(aVar5, dVarC4, cVar3);
                            d160 d160VarA3 = b160.a(jVar3, bVar5, aVar5, 48);
                            int iHashCode5 = Long.hashCode(aVar5.m());
                            ne00 ne00VarO5 = aVar5.o();
                            d dVarC5 = c.c(aVar5, aVar6);
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar4);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, d160VarA3, bVar6);
                            hlh0.a(aVar5, ne00VarO5, dVar3);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                                j3c.a(iHashCode5, aVar5, iHashCode5, c1350a);
                            }
                            hlh0.a(aVar5, dVarC5, cVar3);
                            yka.a.C1350a c1350a3 = c1350a;
                            a aVar10 = aVar5;
                            tsr.a aVar11 = aVar4;
                            lkf0.d(cb40.a(R.string.multi_maker__selections, new Object[0], aVar5), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_R, aVar5), c68.a(R.color.text_inverse_secondary, aVar5), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar10, 0, 0, 131070);
                            ty0.a(aVar10, j.w(aVar6, 8.0f));
                            chw chwVar4 = chwVar2;
                            lkf0.d(chwVar2.a, g3w.h(aVar6, "mm_selection_info"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B1_R, aVar10), c68.a(R.color.text_inverse_primary, aVar10), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar10, 48, 0, 131068);
                            aVar10.s();
                            ty0.a(aVar10, j.i(aVar6, 4.0f));
                            d160 d160VarA4 = b160.a(jVar3, bVar5, aVar10, 48);
                            int iHashCode6 = Long.hashCode(aVar10.m());
                            ne00 ne00VarO6 = aVar10.o();
                            d dVarC6 = c.c(aVar10, aVar6);
                            if (aVar10.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar10.D();
                            if (aVar10.g()) {
                                aVar10.F(aVar11);
                            } else {
                                aVar10.p();
                            }
                            hlh0.a(aVar10, d160VarA4, bVar6);
                            hlh0.a(aVar10, ne00VarO6, dVar3);
                            if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode6))) {
                                j3c.a(iHashCode6, aVar10, iHashCode6, c1350a3);
                            }
                            hlh0.a(aVar10, dVarC6, cVar3);
                            lkf0.d(cb40.a(R.string.common_functions__total_odds, new Object[0], aVar10), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_R, aVar10), c68.a(R.color.text_inverse_secondary, aVar10), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar10, 0, 0, 131070);
                            ty0.a(aVar10, j.w(aVar6, 8.0f));
                            chwVar2 = chwVar4;
                            lkf0.d(chwVar4.b, g3w.h(aVar6, "mm_odds_info"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B1_R, aVar10), c68.a(R.color.text_inverse_primary, aVar10), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar10, 48, 0, 131068);
                            aVar5 = aVar10;
                            aVar5.s();
                            aVar5.s();
                            ty0.a(aVar5, new LayoutWeightElement(1.0f, true));
                            ihe0.a(j.r(aVar6, 40.0f), j060.c(2.0f), c68.a(chwVar2.c ? i3 : R.color.bg_inverse_tertiary_d_lighter, aVar5), 0L, 0.0f, 0.0f, m35.a(1.0f, c68.a(R.color.border_inverse_secondary, aVar5)), pp8.b(2055587275, new z6i(chwVar2, function0), aVar5), aVar5, 12582918, 56);
                            ty0.a(aVar5, j.w(aVar6, 8.0f));
                            d dVarR = j.r(aVar6, 40.0f);
                            i060 i060VarC = j060.c(2.0f);
                            long jA2 = c68.a((chwVar2.f && chwVar2.d) ? i3 : R.color.bg_inverse_tertiary_d_lighter, aVar5);
                            l35 l35VarA = m35.a(1.0f, c68.a(R.color.border_inverse_secondary, aVar5));
                            final Function0 function8 = function1;
                            ihe0.a(dVarR, i060VarC, jA2, 0L, 0.0f, 0.0f, l35VarA, pp8.b(-1943629758, new Function2() { // from class: wgw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar12 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar12.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d dVarH3 = g3w.h(j.e(d.a.b, 1.0f), "remove_all_button");
                                        i060 i060VarC2 = j060.c(2.0f);
                                        umz umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                                        final chw chwVar5 = chwVar2;
                                        nk5.b(function8, dVarH3, chwVar5.d, i060VarC2, null, null, umzVar, pp8.b(307691152, new gaj() { // from class: qgw
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                a aVar13 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((e160) obj6).getClass();
                                                if (aVar13.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    crz crzVarA = erz.a(R.drawable.mm_trash, 0, aVar13);
                                                    d dVarF2 = h.f(j.e(d.a.b, 1.0f), 10.0f);
                                                    chw chwVar6 = chwVar5;
                                                    h6n.b(crzVarA, "Delete Icon", dVarF2, c68.a((chwVar6.f && chwVar6.d) ? R.color.icon_inverse_primary : R.color.icon_disable, aVar13), aVar13, 432, 0);
                                                } else {
                                                    aVar13.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar12), aVar12, 819462192, 304);
                                    } else {
                                        aVar12.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), aVar5, 12582918, 56);
                            ty0.a(aVar5, j.w(aVar6, 8.0f));
                            d dVarR2 = j.r(aVar6, 40.0f);
                            i060 i060VarC2 = j060.c(2.0f);
                            long jA3 = c68.a(chwVar2.e ? i3 : R.color.bg_inverse_tertiary_d_lighter, aVar5);
                            l35 l35VarA2 = m35.a(1.0f, c68.a(R.color.border_inverse_secondary, aVar5));
                            pgwVar = this;
                            final Function0 function9 = function2;
                            ihe0.a(dVarR2, i060VarC2, jA3, 0L, 0.0f, 0.0f, l35VarA2, pp8.b(1090529411, new Function2() { // from class: xgw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar12 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar12.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        d dVarH3 = g3w.h(j.e(d.a.b, 1.0f), "lock_all_button");
                                        i060 i060VarC3 = j060.c(2.0f);
                                        umz umzVar = new umz(0.0f, 0.0f, 0.0f, 0.0f);
                                        final chw chwVar5 = chwVar2;
                                        nk5.b(function9, dVarH3, chwVar5.e, i060VarC3, null, null, umzVar, pp8.b(-953116975, new gaj() { // from class: rgw
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                int i4;
                                                a aVar13 = (a) obj7;
                                                int iIntValue3 = ((Integer) obj8).intValue();
                                                ((e160) obj6).getClass();
                                                if (aVar13.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                    chw chwVar6 = chwVar5;
                                                    boolean z3 = chwVar6.f;
                                                    boolean z4 = chwVar6.e;
                                                    crz crzVarA = erz.a(z3 ? R.drawable.mm_all_lock : R.drawable.mm_all_unlock, 0, aVar13);
                                                    d dVarF2 = h.f(j.e(d.a.b, 1.0f), 10.0f);
                                                    if (chwVar6.f && z4) {
                                                        i4 = R.color.icon_inverse_primary;
                                                    } else {
                                                        i4 = z4 ? R.color.icon_inverse_brand_sub_secondary : R.color.icon_disable;
                                                    }
                                                    h6n.b(crzVarA, "Lock Icon", dVarF2, c68.a(i4, aVar13), aVar13, 432, 0);
                                                } else {
                                                    aVar13.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar12), aVar12, 819462192, 304);
                                    } else {
                                        aVar12.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), aVar5, 12582918, 56);
                            aVar5.s();
                            f = 12.0f;
                            ty0.a(aVar5, j.i(aVar6, 12.0f));
                            aVar5.H();
                        } else {
                            pgwVar = this;
                            f = 12.0f;
                            aVar5.N(-456534200);
                            aVar5.H();
                        }
                        d dVarH3 = h.h(j.g(aVar6, 1.0f), f, 0.0f, 2);
                        final mmd mmdVar3 = mmdVar;
                        final ytw ytwVar4 = ytwVar2;
                        final Context context2 = context;
                        final Function1 function10 = function3;
                        final Function0 function11 = function4;
                        final Function0 function12 = function6;
                        final ytw ytwVar5 = ytwVar;
                        final chw chwVar5 = chwVar2;
                        q75.a(dVarH3, null, false, pp8.b(-1131519408, new gaj() { // from class: ygw
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i4;
                                ygw ygwVar;
                                r75 r75Var = (r75) obj4;
                                a aVar12 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                r75Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar12.M(r75Var) ? 4 : 2;
                                }
                                if (aVar12.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    float fD = r75Var.d();
                                    mmd mmdVar4 = mmdVar3;
                                    float fC1 = mmdVar4.C1(fD);
                                    float fC2 = mmdVar4.C1(8.0f);
                                    float fC3 = mmdVar4.C1(44.0f);
                                    d.a aVar13 = d.a.b;
                                    d dVarG2 = j.g(aVar13, 1.0f);
                                    kw0.j jVar4 = kw0.a;
                                    n54.b bVar7 = ht.a.k;
                                    d160 d160VarA5 = b160.a(jVar4, bVar7, aVar12, 48);
                                    int iHashCode7 = Long.hashCode(aVar12.m());
                                    ne00 ne00VarO7 = aVar12.o();
                                    d dVarC7 = c.c(aVar12, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar14 = yka.a.b;
                                    if (aVar12.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar12.D();
                                    if (aVar12.g()) {
                                        aVar12.F(aVar14);
                                    } else {
                                        aVar12.p();
                                    }
                                    hlh0.a(aVar12, d160VarA5, yka.a.f);
                                    hlh0.a(aVar12, ne00VarO7, yka.a.e);
                                    yka.a.C1350a c1350a4 = yka.a.g;
                                    if (aVar12.g() || !Intrinsics.g(aVar12.y(), Integer.valueOf(iHashCode7))) {
                                        j3c.a(iHashCode7, aVar12, iHashCode7, c1350a4);
                                    }
                                    hlh0.a(aVar12, dVarC7, yka.a.d);
                                    float f3 = (fC1 / 2.0f) - (fC2 / 2.0f);
                                    ytwVar4.setValue(new jxo((((long) ((int) mmdVar4.C1(44.0f))) & 4294967295L) | (((long) ((int) (f3 - fC3))) << 32)));
                                    Object objY5 = aVar12.y();
                                    a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                    if (objY5 == c0042a3) {
                                        objY5 = new b5i();
                                        aVar12.r(objY5);
                                    }
                                    b5i b5iVar = (b5i) objY5;
                                    k4i k4iVar = (k4i) aVar12.O(kna.i);
                                    final chw chwVar6 = chwVar5;
                                    dfw dfwVar2 = chwVar6.i;
                                    boolean z3 = dfwVar2.d;
                                    dfw.a aVar15 = dfwVar2.b;
                                    if (z3) {
                                        aVar12.N(67521806);
                                        aVar12.H();
                                    } else {
                                        aVar12.N(67377656);
                                        Unit unit2 = Unit.a;
                                        boolean zA = aVar12.A(k4iVar);
                                        Object objY6 = aVar12.y();
                                        if (zA || objY6 == c0042a3) {
                                            objY6 = new bhw.b(k4iVar, null);
                                            aVar12.r(objY6);
                                        }
                                        xvf.e(aVar12, unit2, (Function2) objY6);
                                        aVar12.H();
                                    }
                                    d dVarI = j.i(j.w(b.a(aVar13, b5iVar), 44.0f), 44.0f);
                                    boolean z4 = dfwVar2.c;
                                    aVar15.getClass();
                                    if (aVar15.equals(dfw.a.b.a) || !(aVar15 instanceof dfw.a.c)) {
                                        i4 = z4 ? R.color.border_inverse_brand_sub : R.color.border_inverse_secondary;
                                    } else {
                                        i4 = R.color.text_danger;
                                    }
                                    d dVarH4 = g3w.h(j.A(androidx.compose.foundation.a.b(h.f(androidx.compose.foundation.a.b(dVarI, c68.a(i4, aVar12), j060.e(2.0f, 0.0f, 0.0f, 2.0f, 6)), 1.0f), c68.a(R.color.bg_inverse_disabled, aVar12), j060.e(2.0f, 0.0f, 0.0f, 2.0f, 6)), bVar7, 2), "add_selections_text_field");
                                    imf0 imf0VarB2 = imf0.b(mla.l(R.style.B1_M, aVar12), c68.a(z4 ? R.color.text_inverse_primary : R.color.text_inverse_secondary, aVar12), 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446);
                                    soa0 soa0Var = new soa0(c68.a(R.color.text_inverse_primary, aVar12));
                                    ab2.b(dfwVar2.a.e(context2).toString(), function10, dVarH4, dfwVar2.c, false, imf0VarB2, new gop(8, 7, 115), null, false, 0, 0, null, null, null, soa0Var, null, aVar12, 1572864, 0, 49040);
                                    d dVarI2 = j.i(new LayoutWeightElement(1.0f, true), 44.0f);
                                    Object objY7 = aVar12.y();
                                    if (objY7 == c0042a3) {
                                        ygwVar = this;
                                        objY7 = new u6i(ytwVar5, 1);
                                        aVar12.r(objY7);
                                    } else {
                                        ygwVar = this;
                                    }
                                    aza.a(g3w.h(v.a(dVarI2, (Function1) objY7), "add_selections_button"), null, aza.b(chwVar6.h), j060.e(0.0f, 2.0f, 2.0f, 0.0f, 9), alb0.a(sya.b, null, new umz(0.0f, 0.0f, 0.0f, 0.0f), 0L, 0.0f, 27), sya.a(c68.a(R.color.bg_inverse_brand_sub_primary, aVar12), 0L, c68.a(R.color.bg_inverse_tertiary_d_lighter, aVar12), c68.a(R.color.bg_inverse_tertiary_d_lighter, aVar12), aVar12, 24576, 2), sya.a(0L, 0L, c68.a(R.color.bg_inverse_brand_sub_primary, aVar12), c68.a(R.color.icon_inverse_primary, aVar12), aVar12, 24576, 3), null, function11, pp8.b(-1983635827, new gaj() { // from class: sgw
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            a aVar16 = (a) obj8;
                                            int iIntValue3 = ((Integer) obj9).intValue();
                                            ((e160) obj7).getClass();
                                            if (aVar16.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                lkf0.d(cb40.a(R.string.component_betslip__add_selections, new Object[0], aVar16), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B1_M, aVar16), c68.a(chwVar6.g ? R.color.text_tertiary : R.color.text_inverse_secondary, aVar16), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar16, 0, 0, 131070);
                                            } else {
                                                aVar16.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar12), aVar12, 805306368, 130);
                                    ty0.a(aVar12, j.w(aVar13, 8.0f));
                                    d dVarI3 = j.i(j.w(aVar13, mmdVar4.v1(f3)), 44.0f);
                                    wfw.a.getClass();
                                    aza.a(g3w.h(c9j.d(dVarI3, wfw.b), "add_to_betslip_button"), null, aza.b(chwVar6.k), j060.c(0.0f), null, sya.a(c68.a(R.color.bg_brand_sub_primary_d_base, aVar12), 0L, c68.a(R.color.bg_inverse_tertiary_d_lighter, aVar12), c68.a(R.color.bg_inverse_tertiary_d_lighter, aVar12), aVar12, 24576, 2), null, null, function12, pp8.b(212982148, new gaj() { // from class: tgw
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            a aVar16 = (a) obj8;
                                            int iIntValue3 = ((Integer) obj9).intValue();
                                            ((e160) obj7).getClass();
                                            if (aVar16.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                String strA2 = cb40.a(R.string.multi_maker__add_to_betslip, new Object[0], aVar16);
                                                imf0 imf0VarL = mla.l(R.style.B1_M, aVar16);
                                                c330 c330Var = chwVar6.k;
                                                c330.a aVar17 = c330Var instanceof c330.a ? (c330.a) c330Var : null;
                                                lkf0.d(strA2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(imf0VarL, c68.a((aVar17 == null || !aVar17.a) ? R.color.text_inverse_secondary : R.color.text_inverse_primary, aVar16), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar16, 0, 0, 131070);
                                            } else {
                                                aVar16.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar12), aVar12, 805306368, 210);
                                    aVar12.s();
                                } else {
                                    aVar12.G();
                                }
                                return Unit.a;
                            }
                        }, aVar5), aVar5, 3078, 6);
                        dfw.a aVar12 = dfwVar.b;
                        if (aVar12 instanceof dfw.a.c) {
                            aVar5.N(-447487253);
                            ty0.a(aVar5, j.i(aVar6, 8.0f));
                            a aVar13 = aVar5;
                            ytwVar3 = ytwVar5;
                            mmdVar2 = mmdVar3;
                            f2 = f;
                            lkf0.d(((dfw.a.c) aVar12).a.e(context2).toString(), g3w.h(h.h(j.g(aVar6, 1.0f), 16.0f, 0.0f, 2), "bottom_warning_text"), 0L, null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_M, aVar5), c68.a(R.color.text_danger, aVar5), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar13, 48, 0, 130044);
                            aVar5 = aVar13;
                            aVar5.H();
                        } else {
                            f2 = f;
                            mmdVar2 = mmdVar3;
                            ytwVar3 = ytwVar5;
                            aVar5.N(-446752088);
                            aVar5.H();
                        }
                        ty0.a(aVar5, j.i(aVar6, f2));
                        aVar5.s();
                        if (chwVar5.g || !(aVar12 instanceof dfw.a.C0485a)) {
                            aVar5.N(481766814);
                            aVar5.H();
                        } else {
                            aVar5.N(480910563);
                            Object objY5 = aVar5.y();
                            if (objY5 == c0042a2) {
                                objY5 = new d7i(ytwVar3, 1);
                                aVar5.r(objY5);
                            }
                            d dVarB3 = g.b(aVar6, (Function1) objY5);
                            int i4 = (int) (((jxo) ytwVar4.getValue()).a >> 32);
                            mmd mmdVar4 = mmdVar2;
                            d dVarT = j.t(dVarB3, mmdVar4.u1(i4), mmdVar4.u1((int) (((jxo) ytwVar4.getValue()).a & 4294967295L)));
                            Object objY6 = aVar5.y();
                            if (objY6 == c0042a2) {
                                objY6 = pr7.a(aVar5);
                            }
                            psw pswVar = (psw) objY6;
                            final Function1 function13 = function7;
                            boolean zM = aVar5.M(function13) | aVar5.A(chwVar5);
                            Object objY7 = aVar5.y();
                            if (zM || objY7 == c0042a2) {
                                objY7 = new Function0() { // from class: zgw
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function13.invoke(((dfw.a.C0485a) chwVar5.i.b).a);
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY7);
                            }
                            g75.a(androidx.compose.foundation.d.b(dVarT, pswVar, null, false, null, (Function0) objY7, 28), aVar5, 0);
                            aVar5.H();
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, function3, function4, function5, function6, function7, i) { // from class: ugw
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function1 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    bhw.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
