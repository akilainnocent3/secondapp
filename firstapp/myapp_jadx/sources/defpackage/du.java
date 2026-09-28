package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class du {
    public static final i060 a = j060.c(4.0f);

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object value;
            iu iuVar = (iu) this.receiver;
            wwd0 wwd0Var = iuVar.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, new eu(0)));
            wwd0 wwd0Var2 = iuVar.d;
            Boolean bool = Boolean.TRUE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool);
            ej5.c(o8i0.d(iuVar), null, null, new gu(iuVar, null), 3);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object value;
            iu iuVar = (iu) this.receiver;
            wwd0 wwd0Var = iuVar.e;
            eu euVar = (eu) wwd0Var.getValue();
            if (!((Boolean) iuVar.d.getValue()).booleanValue() && !euVar.b && euVar.c.c) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, eu.a((eu) value, null, true, null, 5)));
                ej5.c(o8i0.d(iuVar), null, null, new hu(iuVar, euVar, null), 3);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.dedicatedteampage.article.ui.screen.AllNewsScreenKt$AllNewsScreenContent$1$1", f = "AllNewsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ twd0<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, twd0<Boolean> twd0Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.a = function0;
            this.b = twd0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            i060 i060Var = du.a;
            if (this.b.getValue().booleanValue()) {
                this.a.invoke();
            }
            return Unit.a;
        }
    }

    public static final class d implements Function0<Unit> {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ ahh b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super String, Unit> function1, ahh ahhVar) {
            this.a = function1;
            this.b = ahhVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(this.b.a);
            return Unit.a;
        }
    }

    public static final class e implements Function0<Unit> {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ ahh b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super String, Unit> function1, ahh ahhVar) {
            this.a = function1;
            this.b = ahhVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(this.b.a);
            return Unit.a;
        }
    }

    public static final class f implements Function1<Integer, Object> {
        public final /* synthetic */ bu a;
        public final /* synthetic */ List b;

        public f(bu buVar, List list) {
            this.a = buVar;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.a.invoke(Integer.valueOf(iIntValue), this.b.get(iIntValue));
        }
    }

    public static final class g implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public g(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class h implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ uf00 d;

        public h(List list, Function1 function1, String str, uf00 uf00Var) {
            this.a = list;
            this.b = function1;
            this.c = str;
            this.d = uf00Var;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            androidx.compose.runtime.a aVar2;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar3 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar3.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar3.d(iIntValue) ? 32 : 16;
            }
            if (aVar3.q(i & 1, (i & 147) != 146)) {
                ahh ahhVar = (ahh) this.a.get(iIntValue);
                aVar3.N(-1005483160);
                String str = this.c;
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                Function1 function1 = this.b;
                if (iIntValue == 0) {
                    aVar3.N(-1005467599);
                    String str2 = ahhVar.b;
                    aVar2 = aVar3;
                    String str3 = ahhVar.c;
                    String strA = vch0.a(ahhVar.d, aVar2);
                    String str4 = ahhVar.e;
                    boolean zM = aVar2.M(function1) | aVar2.A(ahhVar);
                    Object objY = aVar2.y();
                    if (zM || objY == c0042a) {
                        objY = new d(function1, ahhVar);
                        aVar2.r(objY);
                    }
                    i3i0.b(null, str2, strA, (Function0) objY, str3, str, str4, aVar2, 0);
                    aVar2.H();
                } else {
                    aVar3.N(-1005049223);
                    String str5 = ahhVar.b;
                    String str6 = ahhVar.c;
                    String strA2 = vch0.a(ahhVar.d, aVar3);
                    String str7 = ahhVar.e;
                    boolean zM2 = aVar3.M(function1) | aVar3.A(ahhVar);
                    Object objY2 = aVar3.y();
                    if (zM2 || objY2 == c0042a) {
                        objY2 = new e(function1, ahhVar);
                        aVar3.r(objY2);
                    }
                    i3i0.c(null, str5, strA2, (Function0) objY2, str6, str, str7, false, aVar3, 0, 129);
                    aVar2 = aVar3;
                    aVar2.H();
                }
                if (iIntValue < kotlin.collections.b.j(this.d)) {
                    aVar2.N(-1004626910);
                    ute.b(null, 0.0f, ((lib0) aVar2.O(oib0.a)).A, aVar2, 0, 3);
                    aVar2.H();
                } else {
                    aVar2.N(-1004550991);
                    aVar2.H();
                }
                aVar2.H();
            } else {
                aVar3.G();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Function1<? super String, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        boolean z;
        boolean z2;
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2146006503);
        int i2 = (bVarI.A(function1) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            iu iuVar = (iu) p8i0.a(jq40.a(iu.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(iuVar.f, bVarI, 0, 7);
            long j = ((lib0) bVarI.O(oib0.a)).i0;
            zk40.a aVar2 = zk40.a;
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(androidx.compose.foundation.layout.h.h(androidx.compose.foundation.a.b(aVar3, j, aVar2), 16.0f, 0.0f, 2), 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            z95.a(null, a4h.a(new x95(cb40.a(R.string.dedicated_team_pages__all_news, new Object[0], bVarI))), null, bVarI, 0, 5);
            bVarI = bVarI;
            ty0.a(bVarI, j.i(aVar3, ((cjb0) bVarI.O(ejb0.a)).d));
            fu fuVar = (fu) ytwVarC.getValue();
            if (Intrinsics.g(fuVar, fu.c.a)) {
                bVarI.N(-1581749920);
                c(0, bVarI);
                bVarI.X(false);
                z2 = true;
            } else {
                boolean z3 = fuVar instanceof fu.b;
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (z3) {
                    bVarI.N(-1581642071);
                    androidx.compose.ui.d dVarE2 = j.e(aVar3, 1.0f);
                    i78 i78VarA2 = g78.a(kw0.e, ht.a.n, bVarI, 54);
                    int iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarE2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA2, bVar);
                    hlh0.a(bVarI, ne00VarS2, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    cdg.a(0, 1, bVarI, null);
                    ty0.a(bVarI, j.i(aVar3, 16.0f));
                    String strA = cb40.a(R.string.common_functions__retry, new Object[0], bVarI);
                    alb0 alb0Var = g9z.c;
                    boolean zA = bVarI.A(iuVar);
                    Object objY = bVarI.y();
                    if (zA || objY == c0042a) {
                        a aVar5 = new a(0, iuVar, iu.class, "onRetryButtonClick", "onRetryButtonClick()V", 0);
                        bVarI.r(aVar5);
                        objY = aVar5;
                    }
                    vuc0.b(null, false, null, alb0Var, null, strA, null, null, null, null, (Function0) ((chp) objY), bVarI, 0, 0, 983);
                    bVarI = bVarI;
                    bVarI.X(true);
                    bVarI.X(false);
                    z2 = true;
                } else {
                    if (!(fuVar instanceof fu.a)) {
                        throw igf0.a(bVarI, 1057353633, false);
                    }
                    bVarI.N(-1580961125);
                    fu.a aVar6 = (fu.a) fuVar;
                    if (aVar6.a.isEmpty()) {
                        bVarI.N(-1580927242);
                        f(0, bVarI);
                        bVarI.X(false);
                        z2 = true;
                        z = false;
                    } else {
                        bVarI.N(-1580852966);
                        uf00<ahh> uf00Var = aVar6.a;
                        boolean z4 = aVar6.b;
                        boolean z5 = aVar6.c;
                        boolean zA2 = bVarI.A(iuVar);
                        Object objY2 = bVarI.y();
                        if (zA2 || objY2 == c0042a) {
                            b bVar2 = new b(0, iuVar, iu.class, "onLoadMore", "onLoadMore()V", 0);
                            bVarI.r(bVar2);
                            objY2 = bVar2;
                        }
                        z = false;
                        z2 = true;
                        b(uf00Var, z4, z5, function1, (Function0) ((chp) objY2), bVarI, (i2 << 9) & 7168);
                        bVarI.X(false);
                    }
                    bVarI.X(z);
                }
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function1) { // from class: ut
                public final /* synthetic */ Function1 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    du.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final uf00<ahh> uf00Var, final boolean z, final boolean z2, final Function1<? super String, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z3;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-390935997);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(uf00Var) : bVarI.A(uf00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= bVarI.b(z3) ? 256 : 128;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? 16384 : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final String strA = cb40.a(R.string.common_sports__football, new Object[0], bVarI);
            final zzr zzrVarA = e0s.a(0, 3, bVarI);
            final ytw ytwVarC = m.c(Boolean.valueOf(z3), bVarI);
            final ytw ytwVarC2 = m.c(Boolean.valueOf(z), bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = a6a0.b(new Function0() { // from class: xt
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        zzr zzrVar = zzrVarA;
                        zyr zyrVar = (zyr) CollectionsKt.d0(zzrVar.j().k());
                        boolean z4 = false;
                        int index = zyrVar != null ? zyrVar.getIndex() : 0;
                        int i3 = zzrVar.j().i();
                        if (((Boolean) ytwVarC.getValue()).booleanValue() && !((Boolean) ytwVarC2.getValue()).booleanValue() && index >= i3 - 3) {
                            z4 = true;
                        }
                        return Boolean.valueOf(z4);
                    }
                });
                bVarI.r(objY);
            }
            twd0 twd0Var = (twd0) objY;
            Boolean bool = (Boolean) twd0Var.getValue();
            bool.getClass();
            boolean z4 = (57344 & i2) == 16384;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new c(function0, twd0Var, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, bool, (Function2) objY2);
            androidx.compose.ui.d dVarE = j.e(androidx.compose.foundation.a.b(androidx.compose.ui.d.a.b, ((lib0) bVarI.O(oib0.a)).i0, zk40.a), 1.0f);
            boolean zM = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(uf00Var))) | ((i2 & 7168) == 2048) | bVarI.M(strA) | ((i2 & 112) == 32);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new Function1() { // from class: yt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        bu buVar = new bu(0);
                        uf00 uf00Var2 = uf00Var;
                        szrVar.d(uf00Var2.size(), new du.f(buVar, uf00Var2), new du.g(uf00Var2), new op8(2039820996, new du.h(uf00Var2, function1, strA, uf00Var2), true));
                        if (z) {
                            szr.h(szrVar, null, cq8.a, 3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            bVar = bVarI;
            aur.a(dVarE, zzrVarA, null, false, null, null, null, false, null, (Function1) objY3, bVar, 0, 508);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    du.b(uf00Var, z, z2, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1291968245);
        if (bVarI.q(i & 1, i != 0)) {
            hfs hfsVarA = m590.a(null, bVarI, 3);
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
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
            e(hfsVarA, bVarI, 0);
            ute.b(null, 0.0f, ((lib0) bVarI.O(oib0.a)).A, bVarI, 0, 3);
            bVarI.N(2031317153);
            for (int i2 = 0; i2 < 4; i2++) {
                d(hfsVarA, bVarI, 0);
                if (i2 < 3) {
                    bVarI.N(-859635624);
                    ute.b(null, 0.0f, ((lib0) bVarI.O(oib0.a)).A, bVarI, 0, 3);
                    bVarI.X(false);
                } else {
                    bVarI.N(-859559705);
                    bVarI.X(false);
                }
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vt();
        }
    }

    public static final void d(final hfs hfsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-43718672);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, layoutWeightElementA);
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
            androidx.compose.ui.d dVarI = j.i(j.g(aVar2, 1.0f), 14.0f);
            i060 i060Var = a;
            g75.a(androidx.compose.foundation.a.a(dVarI, hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, 6.0f, bVarI, aVar2, 0.7f), 14.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, 6.0f, bVarI, aVar2, 0.85f), 12.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 12.0f));
            g75.a(androidx.compose.foundation.a.a(j.i(j.w(aVar2, 80.0f), 10.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.t(aVar2, 90.0f, 76.0f), j060.c(4.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: cu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    du.d(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final hfs hfsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-1391579055);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.i(j.g(aVar2, 1.0f), 200.0f), j060.c(8.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
            androidx.compose.ui.d dVarI = j.i(hib0.a(aVar2, 12.0f, bVarI, aVar2, 0.9f), 14.0f);
            i060 i060Var = a;
            g75.a(androidx.compose.foundation.a.a(dVarI, hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, 6.0f, bVarI, aVar2, 0.6f), 14.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, 6.0f, bVarI, aVar2, 0.75f), 12.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            g75.a(androidx.compose.foundation.a.a(j.i(j.w(aVar2, 100.0f), 10.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: au
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    du.e(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1581457683);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.h.h(dVarE, 0.0f, ((cjb0) bVarI.O(qyd0Var)).g, 1);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            h9n.a(erz.a(R.drawable.no_events_available, 0, bVarI), null, j.r(aVar2, 180.0f), null, null, 0.0f, null, bVarI, 432, 120);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).e));
            String strA = cb40.a(R.string.dedicated_team_pages__no_news_title, new Object[0], bVarI);
            qyd0 qyd0Var2 = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var2)).i;
            qyd0 qyd0Var3 = oib0.a;
            lkf0.d(strA, null, ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).d));
            lkf0.d(cb40.a(R.string.dedicated_team_pages__no_news_subtitle, new Object[0], bVarI), androidx.compose.foundation.layout.h.h(aVar2, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2), ((lib0) bVarI.O(qyd0Var3)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).o, bVarI, 0, 0, 130040);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new wt();
        }
    }
}
