package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class kea0 {
    public static final uf00<d9a0> a;
    public static final uf00<d9a0> b;

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ uda0 a;
        public final /* synthetic */ List b;

        public a(uda0 uda0Var, List list) {
            this.a = uda0Var;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ Function2 c;

        public c(List list, Function1 function1, Function2 function2) {
            this.a = list;
            this.b = function1;
            this.c = function2;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                d9a0 d9a0Var = (d9a0) this.a.get(iIntValue);
                aVar2.N(-303162506);
                iba0.a(new umz(16.0f, 8.0f, 16.0f, 8.0f), d9a0Var.a, d9a0Var.b, d9a0Var.c, d9a0Var.d, d9a0Var.g, d9a0Var.e, d9a0Var.f, this.b, this.c, aVar2, 6);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class d implements Function1<Integer, Object> {
        public final /* synthetic */ wda0 a;
        public final /* synthetic */ List b;

        public d(wda0 wda0Var, List list) {
            this.a = wda0Var;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            return this.a.invoke(this.b.get(num.intValue()));
        }
    }

    public static final class e implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public e(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class f implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ Function2 c;

        public f(List list, Function1 function1, Function2 function2) {
            this.a = list;
            this.b = function1;
            this.c = function2;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                d9a0 d9a0Var = (d9a0) this.a.get(iIntValue);
                aVar2.N(225704415);
                iba0.a(new umz(16.0f, 8.0f, 16.0f, 8.0f), d9a0Var.a, d9a0Var.b, d9a0Var.c, d9a0Var.d, d9a0Var.g, d9a0Var.e, d9a0Var.f, this.b, this.c, aVar2, 6);
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    static {
        dja0 dja0Var = dja0.b;
        y7i.c cVar = y7i.c.a;
        d9a0 d9a0Var = new d9a0("yal en 1981", "", false, false, dja0Var, cVar, null, null, 1984);
        d9a0 d9a0Var2 = new d9a0("bbgun888", "", false, false, dja0Var, cVar, null, null, 1984);
        y7i.a aVar = y7i.a.a;
        a = a4h.a(d9a0Var, d9a0Var2, new d9a0("funjourney", "", false, true, dja0Var, aVar, null, null, 1984));
        b = a4h.a(new d9a0("nicklee", "", false, false, dja0Var, cVar, null, null, 1984), new d9a0("oolomn", "", false, false, dja0Var, cVar, null, null, 1984), new d9a0("angushill", "", false, true, dja0Var, aVar, 129, null, 1920));
    }

    public static final void a(final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1912165597);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.ic_no_data, 0, bVarI), "empty", null, c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 4);
            ty0.a(bVarI, j.i(androidx.compose.ui.d.a.b, 8.0f));
            lkf0.d(cb40.a(R.string.wap_search__search_no_result, new Object[0], bVarI), null, c68.a(R.color.text_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_R, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fea0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    kea0.a(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final h0s<d9a0> h0sVar, final Function2<? super String, ? super y7i, Unit> function2, final Function1<? super String, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        h0sVar.getClass();
        function2.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(513699081);
        int i2 = (bVarI.A(h0sVar) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || bVarI.A(h0sVar)) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: gea0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final h0s h0sVar2 = h0sVar;
                        int iC = h0sVar2.c();
                        androidx.paging.compose.a aVar2 = new androidx.paging.compose.a(h0sVar2, new xda0());
                        tbo tboVar = new tbo(1);
                        final Function1 function3 = function1;
                        final Function2 function4 = function2;
                        szrVar.d(iC, aVar2, tboVar, new op8(-1044033625, new iaj() { // from class: yda0
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar3.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    d9a0 d9a0Var = (d9a0) h0sVar2.b(iIntValue);
                                    if (d9a0Var == null) {
                                        aVar3.N(1347491430);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(1347491431);
                                        iba0.a(new umz(16.0f, 8.0f, 16.0f, 8.0f), d9a0Var.a, d9a0Var.b, d9a0Var.c, d9a0Var.d, d9a0Var.g, d9a0Var.e, d9a0Var.f, function3, function4, aVar3, 6);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                        if (h0sVar2.d().c instanceof hxs.b) {
                            szr.h(szrVar, null, uq9.a, 3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 511);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function1, i) { // from class: qda0
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    kea0.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        Function0<Unit> function1;
        int i4;
        androidx.compose.runtime.b bVar;
        final Function0<Unit> function2;
        androidx.compose.runtime.b bVarI = aVar.i(-1151790009);
        int i5 = (bVarI.d(i) ? 4 : 2) | i2;
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            function1 = function0;
        } else {
            function1 = function0;
            i4 = i5 | (bVarI.A(function1) ? 32 : 16);
        }
        int i7 = i4;
        if (bVarI.q(i7 & 1, (i7 & 19) != 18)) {
            Function0<Unit> function3 = i6 != 0 ? null : function1;
            androidx.compose.ui.d dVarH = g3w.h(h.g(androidx.compose.ui.d.a.b, 16.0f, 12.0f), "section_header_row");
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            androidx.compose.ui.d dVarH2 = g3w.h(yy.a(bVarI, dVarC, yka.a.d, 1.0f, true), "section_header_title");
            String strA = cb40.a(i, new Object[0], bVarI);
            long jA = c68.a(R.color.text_primary, bVarI);
            imf0 imf0VarL = mla.l(R.style.B1_B, bVarI);
            function2 = function3;
            lkf0.d(strA, dVarH2, jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, 0, 0, 131064);
            bVar = bVarI;
            if (function2 == null) {
                bVar.N(1834237662);
                bVar.X(false);
            } else {
                bVar.N(1834237663);
                boolean z = (i7 & 112) == 32;
                Object objY = bVar.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new m2j(function2, 1);
                    bVar.r(objY);
                }
                ddd0.b(null, false, null, null, null, 0.0f, false, null, null, (Function0) objY, uq9.b, null, uq9.c, bVar, 0, 390, 2559);
                bVar = bVar;
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
            function2 = function1;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function2, i2, i3) { // from class: zda0
                public final /* synthetic */ int a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ int c;

                {
                    this.c = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kea0.c(this.a, this.b, (a) obj, iA, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final mea0 mea0Var, final h0s<d9a0> h0sVar, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function0<Unit> function2, final Function2<? super String, ? super y7i, Unit> function3, final Function1<? super xia0, Unit> function4, final Function1<? super String, Unit> function5, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final Function2<? super String, ? super y7i, Unit> function6;
        final Function1<? super String, Unit> function7;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-767255644);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(mea0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            function6 = function3;
            i2 |= bVarI.A(function6) ? 131072 : 65536;
        } else {
            function6 = function3;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            function7 = function5;
            i2 |= bVarI.A(function7) ? 8388608 : 4194304;
        } else {
            function7 = function5;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            bVar = bVarI;
            hy60.a(null, pp8.b(-110392224, new Function2() { // from class: cea0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        m080.b(cb40.a(R.string.personal_page__search_for_players, new Object[0], aVar2), 0L, erz.a(R.drawable.ic_action_bar_back, 0, aVar2), function0, function1, function2, aVar2, 6);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, 0, c68.a(R.color.bg_secondary_d_base, bVarI), c68.a(R.color.bg_secondary_d_base, bVarI), null, pp8.b(-2104910155, new gaj() { // from class: dea0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2;
                    tmz tmzVar = (tmz) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar4 = d.a.b;
                        d dVarE = h.e(j.e(aVar4, 1.0f), tmzVar);
                        aiv aivVarC = g75.c(ht.a.a, false);
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
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        mea0 mea0Var2 = mea0Var;
                        boolean z = mea0Var2.e;
                        String str = mea0Var2.d;
                        n54 n54Var = ht.a.e;
                        androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
                        if (z) {
                            aVar3.N(-770674631);
                            aVar2 = aVar3;
                            q330.a(dVar.b(aVar4, n54Var), 0L, 0.0f, 0L, 0, 0.0f, aVar2, 0, 62);
                            aVar2.H();
                        } else {
                            aVar2 = aVar3;
                            h0s h0sVar2 = h0sVar;
                            if (h0sVar2.c() == 0 && (h0sVar2.d().a instanceof hxs.c) && str.length() >= 3) {
                                aVar2.N(-770429421);
                                kea0.a(dVar.b(aVar4, n54Var), aVar2, 0);
                                aVar2.H();
                            } else {
                                int length = str.length();
                                Function2 function8 = function6;
                                Function1 function9 = function7;
                                if (length >= 3) {
                                    aVar2.N(-770291347);
                                    kea0.b(h0sVar2, function8, function9, aVar2, 8);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-770045176);
                                    kea0.f(mea0Var2.a, mea0Var2.b, function8, function9, function4, aVar2, 0);
                                    aVar2.H();
                                }
                            }
                        }
                        aVar2.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 805306416, 317);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eea0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kea0.d(mea0Var, h0sVar, function0, function1, function2, function3, function4, function5, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(rea0 rea0Var, final Function0 function0, final Function1 function1, final Function1 function2, androidx.compose.runtime.a aVar, final int i) {
        final rea0 rea0Var2;
        int i2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1874941202);
        int i3 = i | 2 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    rea0Var2 = (rea0) p8i0.a(jq40.a(rea0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-15);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-15);
                rea0Var2 = rea0Var;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            h0s h0sVarA = k0s.a(rea0Var2.w, bVarI);
            ytw ytwVarC = wyh.c(rea0Var2.b, bVarI, 0, 7);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(rea0Var2) | bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new hea0(rea0Var2, context, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            mea0 mea0Var = (mea0) ytwVarC.getValue();
            boolean zA2 = bVarI.A(rea0Var2);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new iea0(1, rea0Var2, rea0.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0);
                bVarI.r(objY3);
            }
            chp chpVar = (chp) objY3;
            boolean zA3 = bVarI.A(rea0Var2);
            Object objY4 = bVarI.y();
            if (zA3 || objY4 == c0042a) {
                objY4 = new jea0(0, rea0Var2, rea0.class, "onSearchClicked", "onSearchClicked()V", 0);
                bVarI.r(objY4);
            }
            Function1 function3 = (Function1) chpVar;
            Function0 function4 = (Function0) ((chp) objY4);
            boolean zA4 = bVarI.A(rea0Var2);
            Object objY5 = bVarI.y();
            if (zA4 || objY5 == c0042a) {
                objY5 = new Function2() { // from class: aea0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str = (String) obj;
                        str.getClass();
                        ((y7i) obj2).getClass();
                        rea0 rea0Var3 = rea0Var2;
                        rea0Var3.y1(new oea0(rea0Var3, str, null));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            Function2 function5 = (Function2) objY5;
            int i4 = 64 | ((i2 << 3) & 896);
            int i5 = i2 << 12;
            int i6 = i4 | (i5 & 3670016) | (i5 & 29360128);
            rea0 rea0Var3 = rea0Var2;
            d(mea0Var, h0sVarA, function0, function3, function4, function5, function1, function2, bVarI, i6);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(325108842);
                String strA = cb40.a(R.string.personal_page__max_following_reached_title, new Object[0], bVarI);
                String strA2 = cb40.a(R.string.personal_page__max_following_reached_text, new Object[0], bVarI);
                Object objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = new fx50(ytwVar, 1);
                    bVarI.r(objY6);
                }
                rea0Var = rea0Var3;
                nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY6, null, bVarI, 0, 384, 12281);
                bVarI.X(false);
            } else {
                rea0Var = rea0Var3;
                bVarI.N(325422128);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        final rea0 rea0Var4 = rea0Var;
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: bea0
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kea0.e(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final List<d9a0> list, final List<d9a0> list2, final Function2<? super String, ? super y7i, Unit> function2, final Function1<? super String, Unit> function1, final Function1<? super xia0, Unit> function3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1645853403);
        int i2 = i | (bVarI.M(list) ? 4 : 2) | (bVarI.M(list2) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function3) ? 16384 : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 14) == 4) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                Function1 function4 = new Function1() { // from class: rda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        List list3 = list;
                        boolean zIsEmpty = list3.isEmpty();
                        final Function1 function5 = function3;
                        Function1 function6 = function1;
                        Function2 function7 = function2;
                        if (!zIsEmpty) {
                            szr.h(szrVar, null, new op8(892407819, new gaj() { // from class: tda0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        Function1 function8 = function5;
                                        boolean zM = aVar2.M(function8);
                                        Object objY2 = aVar2.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new p3j(function8, 2);
                                            aVar2.r(objY2);
                                        }
                                        kea0.c(R.string.personal_page__suggested_follow_accounts, (Function0) objY2, aVar2, 0, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                            szrVar.d(list3.size(), new kea0.a(new uda0(), list3), new kea0.b(list3), new op8(802480018, new kea0.c(list3, function6, function7), true));
                        }
                        List list4 = list2;
                        if (!list4.isEmpty()) {
                            szr.h(szrVar, null, new op8(-1330018110, new gaj() { // from class: vda0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        Function1 function8 = function5;
                                        boolean zM = aVar2.M(function8);
                                        Object objY2 = aVar2.y();
                                        if (zM || objY2 == a.C0041a.a) {
                                            objY2 = new ybo(1, function8);
                                            aVar2.r(objY2);
                                        }
                                        kea0.c(R.string.personal_page__high_win_players, (Function0) objY2, aVar2, 0, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 3);
                            szrVar.d(list4.size(), new kea0.d(new wda0(), list4), new kea0.e(list4), new op8(802480018, new kea0.f(list4, function6, function7), true));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function4);
                objY = function4;
            }
            aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 511);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, list2, function2, function1, function3, i) { // from class: sda0
                public final /* synthetic */ List a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kea0.f(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
