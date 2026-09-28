package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ig40 {

    public static final class a implements Function0<Unit> {
        public final /* synthetic */ Function1<String, Unit> a;
        public final /* synthetic */ zf40 b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super String, Unit> function1, zf40 zf40Var) {
            this.a = function1;
            this.b = zf40Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.invoke(this.b.b);
            return Unit.a;
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
        public final /* synthetic */ List c;

        public c(List list, Function1 function1, List list2) {
            this.a = list;
            this.b = function1;
            this.c = list2;
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
                zf40 zf40Var = (zf40) this.a.get(iIntValue);
                aVar2.N(566838797);
                Function1 function1 = this.b;
                boolean zM = aVar2.M(function1) | aVar2.A(zf40Var);
                Object objY = aVar2.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new a(function1, zf40Var);
                    aVar2.r(objY);
                }
                ig40.b(zf40Var, (Function0) objY, aVar2, 0);
                if (Intrinsics.g(zf40Var, CollectionsKt.b0(this.c))) {
                    aVar2.N(567239533);
                    aVar2.H();
                } else {
                    aVar2.N(567079573);
                    ute.b(null, 1.0f, c68.a(R.color.line_type1_primary, aVar2), aVar2, 48, 1);
                    aVar2.H();
                }
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.compose.RecentAccountsBottomSheetKt$RecentAccountsBottomSheet$1$1", f = "RecentAccountsBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ yf40 a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ ytw<Boolean> c;
        public final /* synthetic */ j590 d;

        @c0d(c = "com.sportybet.android.globalpay.stp.spei.withdraw.compose.RecentAccountsBottomSheetKt$RecentAccountsBottomSheet$1$1$1", f = "RecentAccountsBottomSheet.kt", l = {65}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ j590 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j590 j590Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = j590Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
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
                    this.a = 1;
                    if (this.b.d(this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(yf40 yf40Var, v5b v5bVar, ytw<Boolean> ytwVar, j590 j590Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.a = yf40Var;
            this.b = v5bVar;
            this.c = ytwVar;
            this.d = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = this.a.a;
            final ytw<Boolean> ytwVar = this.c;
            if (z) {
                ytwVar.setValue(Boolean.TRUE);
            } else {
                final j590 j590Var = this.d;
                ej5.c(this.b, null, null, new a(j590Var, null), 3).invokeOnCompletion(new Function1() { // from class: jg40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        if (!j590Var.e()) {
                            ytwVar.setValue(Boolean.FALSE);
                        }
                        return Unit.a;
                    }
                });
            }
            return Unit.a;
        }
    }

    public static final void a(final int i, final yf40 yf40Var, androidx.compose.runtime.a aVar, final Function0 function0, final Function1 function1) {
        androidx.compose.runtime.b bVarI = aVar.i(-1060278625);
        int i2 = (bVarI.A(yf40Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            long jA = c68.a(R.color.bg_primary_d_base, bVarI);
            zk40.a aVar2 = zk40.a;
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(androidx.compose.foundation.a.b(aVar3, jA, aVar2), 16.0f, 0.0f, 2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            int i3 = i2 >> 3;
            f(function0, bVarI, i3 & 14);
            ty0.a(bVarI, j.i(aVar3, 16.0f));
            c(yf40Var.b, function1, bVarI, i3 & 112);
            ty0.a(bVarI, j.r(aVar3, 16.0f));
            e(0, bVarI);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, yf40Var, function0, function1) { // from class: cg40
                public final /* synthetic */ yf40 a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = yf40Var;
                    this.b = function0;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ig40.a(qj40.a(9), this.a, (a) obj, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final zf40 zf40Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(2146335491);
        int i2 = (bVarI.M(zf40Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(h.f(g3w.i(aVar2, function0), 16.0f), 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (zf40Var.a) {
                bVarI.N(-324511732);
                h6n.b(erz.a(R.drawable.ic_check, 0, bVarI), null, j.i(aVar2, 20.0f), c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
                bVarI.X(false);
            } else {
                bVarI.N(-324233569);
                g75.a(j.r(aVar2, 20.0f), bVarI, 6);
                bVarI.X(false);
            }
            ty0.a(bVarI, j.r(aVar2, 8.0f));
            lkf0.d(zf40Var.c, null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: hg40
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ig40.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final List<zf40> list, final Function1<? super String, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1218269412);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(list) : bVarI.A(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d dVarG = j.g(androidx.compose.foundation.a.b(ls7.a(androidx.compose.ui.d.a.b, j060.c(8.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a), 1.0f);
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(list))) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: fg40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        List list2 = list;
                        szrVar.d(list2.size(), null, new ig40.b(list2), new op8(802480018, new ig40.c(list2, function1, list2), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            aur.a(dVarG, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gg40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ig40.c(list, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final int i, final yf40 yf40Var, androidx.compose.runtime.a aVar, final Function0 function0, final Function1 function1) {
        final Function0 function2;
        androidx.compose.runtime.b bVar;
        ytw ytwVar;
        yf40Var.getClass();
        function1.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1517641187);
        int i2 = i | (bVarI.A(yf40Var) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Boolean boolValueOf = Boolean.valueOf(yf40Var.a);
            if ((i2 & 14) != 4 && !bVarI.A(yf40Var)) {
                z = false;
            }
            boolean zA = bVarI.A(v5bVar) | z | bVarI.M(j590VarG);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                ytwVar = ytwVar2;
                d dVar = new d(yf40Var, v5bVar, ytwVar, j590VarG, null);
                bVarI.r(dVar);
                objY3 = dVar;
            } else {
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(-1071371757);
                function2 = function0;
                v1w.a(function2, null, j590VarG, 0.0f, false, j060.c(8.0f), c68.a(R.color.bg_primary_d_base, bVarI), 0L, 0L, kl9.a, null, null, pp8.b(-1347176822, new gaj() { // from class: ag40
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            ig40.a(8, yf40Var, aVar2, function0, function1);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, (i2 >> 6) & 14, 3078, 7066);
                bVar = bVarI;
                bVar.X(false);
            } else {
                function2 = function0;
                bVar = bVarI;
                bVar.N(-1070560673);
                bVar.X(false);
            }
        } else {
            function2 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, yf40Var, function2, function1) { // from class: bg40
                public final /* synthetic */ yf40 a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = yf40Var;
                    this.b = function1;
                    this.c = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ig40.d(qj40.a(9), this.a, (a) obj, this.c, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-963138204);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(erz.a(R.drawable.spr_ic_prematch_lock, 0, bVarI), null, j.r(aVar2, 18.0f), c68.a(R.color.text_secondary, bVarI), bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.component_sporty_bank__secured_by, new Object[0], bVarI).concat(cb40.a(R.string.app_name, new Object[0], bVarI)), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new eg40();
        }
    }

    public static final void f(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1006600648);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, aVar2);
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
            lkf0.d(cb40.a(R.string.page_payment__recent_accounts_title, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_B, bVarI), bVarI, 0, 0, 131066);
            bVarI = bVarI;
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            h6n.b(erz.a(R.drawable.ic_cancel, 0, bVarI), null, androidx.compose.foundation.d.d(j.r(aVar2, 16.0f), false, null, null, function0, 15), c68.a(R.color.icon_secondary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dg40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    ig40.f(function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
