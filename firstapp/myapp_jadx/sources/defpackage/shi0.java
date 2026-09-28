package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class shi0 {

    @c0d(c = "com.sportybet.android.virtual.presentation.component.VirtualLobbyGameContentKt$VirtualBroadcastInfos$1$1", f = "VirtualLobbyGameContent.kt", l = {235}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ qcn<ggi0> b;
        public final /* synthetic */ osw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qcn<ggi0> qcnVar, osw oswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = qcnVar;
            this.c = oswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b.a aVar = b.b;
                long jH = c.h(4, rgf.SECONDS);
                this.a = 1;
                if (hkd.c(jH, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            osw oswVar = this.c;
            oswVar.k((oswVar.D() + 1) % this.b.size());
            return Unit.a;
        }
    }

    public static final void a(qcn<ggi0> qcnVar, final Function1<? super Integer, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final qcn<ggi0> qcnVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1816851712);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(qcnVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            Integer numValueOf = Integer.valueOf(oswVar.D());
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new a(qcnVar, oswVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            dVarG.getClass();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new r2w();
                bVarI.r(objY3);
            }
            d dVarH = g3w.h(j.i(androidx.compose.ui.layout.j.a(dVarG, (gaj) objY3), 32.0f), "virtual_lobby_big_win_banner");
            boolean z2 = (i2 & 112) == 32;
            Object objY4 = bVarI.y();
            if (z2 || objY4 == c0042a) {
                objY4 = new Function0() { // from class: nhi0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(Integer.valueOf(oswVar.D()));
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            d dVarF = g3w.f(dVarH, true, (Function0) objY4);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarF);
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
            h9n.a(erz.a(R.drawable.bg_iv_big_win, 0, bVarI), null, j.e(aVar2, 1.0f), null, d0b.a.g, 0.0f, null, bVarI, 25008, 104);
            d dVarJ = h.j(j.e(aVar2, 1.0f), 16.0f, 0.0f, 12.0f, 0.0f, 10);
            d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.ic_iv_big_win, 0, bVarI), "image description", null, null, d0b.a.f, 0.0f, null, bVarI, 24624, 108);
            d dVarJ2 = h.j(new LayoutWeightElement(1.0f, true), 4.0f, 0.0f, 10.0f, 0.0f, 10);
            aiv aivVarC2 = g75.c(ht.a.d, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            Integer numValueOf2 = Integer.valueOf(oswVar.D());
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new ohi0();
                bVarI.r(objY5);
            }
            qcnVar2 = qcnVar;
            androidx.compose.animation.a.b(numValueOf2, null, (Function1) objY5, null, "text_animation", null, pp8.b(883708986, new iaj() { // from class: phi0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    a aVar4 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((pf0) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        d dVarH2 = g3w.h(d.a.b, "virtual_lobby_big_win_banner_text");
                        ggi0 ggi0Var = (ggi0) qcnVar2.get(iIntValue);
                        String strA = cb40.a(R.string.wap_home__vphone_won, new Object[]{ggi0Var.a}, aVar4);
                        String strA2 = cb40.a(R.string.common_functions__in_vwhere, new Object[]{ggi0Var.c}, aVar4);
                        ora0 ora0Var = new ora0(c68.a(R.color.text_type2_primary, aVar4), d2l.f(12), t9i.F, (n9i) null, (o9i) null, f8i.b, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65496);
                        nk0.b bVar2 = new nk0.b((Object) null);
                        bVar2.g(strA);
                        int iL = bVar2.l(ora0Var);
                        try {
                            bVar2.g(" " + ggi0Var.b + " ");
                            Unit unit = Unit.a;
                            bVar2.i(iL);
                            bVar2.g(strA2.concat("."));
                            lkf0.e(bVar2.m(), dVarH2, 0L, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 2, false, 1, 0, null, null, imf0.b(mla.l(R.style.B2_M, aVar4), c68.a(R.color.text_type2_primary, aVar4), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), aVar4, 48, 24960, 240636);
                        } catch (Throwable th) {
                            bVar2.i(iL);
                            throw th;
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1597824, 42);
            bVarI.X(true);
            lkf0.d(cb40.a(R.string.common_functions__play, new Object[0], bVarI), g3w.h(aVar2, "virtual_lobby_big_win_banner_button"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(mla.l(R.style.B2_B, bVarI), c68.a(R.color.bg_brand_sub_highlight_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVarI, 48, 0, 131068);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            qcnVar2 = qcnVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qhi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    shi0.a(qcnVar2, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final aii0 aii0Var, final boolean z, final Function0<Unit> function0, final Function1<? super Integer, Unit> function1, final Function1<? super chi0, Unit> function2, final Function1<? super fgi0, Unit> function3, final Function0<Unit> function4, androidx.compose.runtime.a aVar, final int i) {
        boolean z2;
        yka.a.C1350a c1350a;
        aii0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(488650107);
        int i2 = i | (bVarI.M(aii0Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function4) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
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
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarE2 = j.e(op70.c(aVar2, op70.a(bVarI), 14), 1.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarJ = h.j(androidx.compose.foundation.a.b(dVarE2, ((lib0) bVarI.O(qyd0Var)).b1, zk40.a), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            c(aii0Var.c, aii0Var.f, aii0Var.d, aii0Var.e, function0, function1, bVarI, (i2 << 6) & 516096);
            qmi0.b(aii0Var.a, function3, bVarI, (i2 >> 12) & 112);
            ihi0.c(aii0Var.b, function2, bVarI, (i2 >> 9) & 112);
            bVarI.X(true);
            if (z) {
                bVarI.N(946422410);
                n54 n54Var2 = ht.a.i;
                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                d dVarV = j.v(h.j(dVar2.b(aVar2, n54Var2), 0.0f, 0.0f, 16.0f, 12.0f, 3), 97.0f, 82.0f, 0.0f, 12);
                boolean z3 = (i2 & 3670016) == 1048576;
                Object objY = bVarI.y();
                if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new ghe(function4, 3);
                    bVarI.r(objY);
                }
                d dVarF = g3w.f(dVarV, true, (Function0) objY);
                aiv aivVarC2 = g75.c(n54Var, false);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarF);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    c1350a = c1350a2;
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    c1350a = c1350a2;
                }
                hlh0.a(bVarI, dVarC3, cVar);
                yka.a.C1350a c1350a3 = c1350a;
                mmt.a(i350.c(new pnt.f("https://s.sporty.net/cms/B_and_G_football_animation_2b83b83843.json"), bVarI, 6).getValue(), dVar2.b(aVar2, ht.a.b), false, false, Reader.READ_DONE, null, bVarI, 1572864, 0, 4194236);
                d dVarB = androidx.compose.foundation.a.b(j.y(j.i(d35.a(dVar2.b(aVar2, ht.a.h), 2.0f, ((lib0) bVarI.O(qyd0Var)).p0, j060.c(100.0f)), 33.0f), 97.0f, 0.0f, 2), c68.a(R.color.virtual_build_and_go, bVarI), j060.c(100.0f));
                aiv aivVarC3 = g75.c(ht.a.e, false);
                int iHashCode4 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar);
                hlh0.a(bVarI, ne00VarS4, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a3);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                mw90.a(cb40.a(R.string.page_virtuals_lobby__build_and_go_logo, new Object[0], bVarI), null, j.i(h.h(aVar2, 12.0f, 0.0f, 2), 15.0f), null, null, null, null, bVarI, 432, 2040);
                bVarI = bVarI;
                z2 = true;
                f30.a(bVarI, true, true, false);
            } else {
                z2 = true;
                bVarI.N(948197377);
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, function1, function2, function3, function4, i) { // from class: khi0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    shi0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final qcn<ggi0> qcnVar, final String str, final boolean z, final boolean z2, Function0<Unit> function0, final Function1<? super Integer, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z3;
        boolean z4;
        final Function0<Unit> function2 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(271343097);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(qcnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            int i3 = i2;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (qcnVar.isEmpty()) {
                bVarI.N(1455149683);
                bVarI.X(false);
            } else {
                bVarI.N(1454988235);
                a(qcnVar, function1, bVarI, (i3 & 14) | ((i3 >> 12) & 112));
                bVarI.X(false);
            }
            d dVarG2 = j.g(aVar2, 1.0f);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            d dVarN = yy.a(bVarI, dVarC2, cVar, 1.0f, false).n(new VerticalAlignElement(bVar2));
            qyd0 qyd0Var = oib0.a;
            lkf0.d(str, dVarN, ((lib0) bVarI.O(qyd0Var)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).k, bVarI, (i3 >> 3) & 14, 0, 131064);
            bVarI = bVarI;
            if (z) {
                bVarI.N(-393866633);
                d160 d160VarA2 = b160.a(jVar, ht.a.j, bVarI, 0);
                int iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                crz crzVarA = erz.a(R.drawable.question_mark, 0, bVarI);
                String strA = cb40.a(R.string.common_helps__how_to_play, new Object[0], bVarI);
                d dVarH = g3w.h(androidx.compose.ui.platform.d.a(h.j(new VerticalAlignElement(bVar2), 8.0f, 0.0f, 0.0f, 0.0f, 14), "virtual_lobby_get_start_entry"), "virtual_lobby_get_start");
                Object objY = bVarI.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = new lhi0();
                    bVarI.r(objY);
                }
                d dVarB = xa80.b(dVarH, false, (Function1) objY);
                boolean z5 = (i3 & 57344) == 16384;
                Object objY2 = bVarI.y();
                if (z5 || objY2 == c0042a) {
                    function2 = function0;
                    z4 = true;
                    objY2 = new l8a(function2, 1);
                    bVarI.r(objY2);
                } else {
                    function2 = function0;
                    z4 = true;
                }
                h9n.a(crzVarA, strA, g3w.f(dVarB, z4, (Function0) objY2), null, d0b.a.f, 0.0f, null, bVarI, 24576, 104);
                if (z2) {
                    bVarI.N(1529443718);
                    g75.a(androidx.compose.foundation.a.b(j.r(h.j(aVar2, 1.0f, 0.0f, 0.0f, 0.0f, 14), 8.0f), ((lib0) bVarI.O(qyd0Var)).E, j060.a), bVarI, 0);
                    bVarI.X(false);
                } else {
                    bVarI.N(1529853104);
                    bVarI.X(false);
                }
                z3 = true;
                bVarI.X(true);
                bVarI.X(false);
            } else {
                function2 = function0;
                z3 = true;
                bVarI.N(-392644241);
                bVarI.X(false);
            }
            bVarI.X(z3);
            bVarI.X(z3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mhi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    shi0.c(qcnVar, str, z, z2, function2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
