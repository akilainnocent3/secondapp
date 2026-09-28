package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kwp {

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberDialogKt$LNAddNumberDialog$1$1", f = "LNAddNumberDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ nwp a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nwp nwpVar, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = nwpVar;
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.x1(new pvp.d((lk50) this.b.getValue()));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberDialogKt$LNAddNumberDialog$2$1", f = "LNAddNumberDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<v5b, lwp, v1b<? super Unit>, Object> {
        public /* synthetic */ lwp a;
        public final /* synthetic */ Function1<nvp, Unit> b;
        public final /* synthetic */ gcr c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ v5b e;
        public final /* synthetic */ ytw<Boolean> f;
        public final /* synthetic */ j590 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super nvp, Unit> function1, gcr gcrVar, Context context, v5b v5bVar, ytw<Boolean> ytwVar, j590 j590Var, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.b = function1;
            this.c = gcrVar;
            this.d = context;
            this.e = v5bVar;
            this.f = ytwVar;
            this.i = j590Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, lwp lwpVar, v1b<? super Unit> v1bVar) {
            ytw<Boolean> ytwVar = this.f;
            j590 j590Var = this.i;
            b bVar = new b(this.b, this.c, this.d, this.e, ytwVar, j590Var, v1bVar);
            bVar.a = lwpVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lwp lwpVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lwpVar instanceof lwp.a) {
                nvp.f fVar = ((lwp.a) lwpVar).a;
                kwp.e(this.e, this.f, this.i, this.b, fVar);
            } else if (lwpVar instanceof lwp.c) {
                this.c.z1(new ecr.b(((lwp.c) lwpVar).a));
            } else {
                if (!(lwpVar instanceof lwp.b)) {
                    uhc.a();
                    return null;
                }
                ResourceUiText resourceUiText = ((lwp.b) lwpVar).a;
                Context context = this.d;
                Toast.makeText(context, resourceUiText.g(context), 0).show();
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<pvp, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pvp pvpVar) {
            pvp pvpVar2 = pvpVar;
            pvpVar2.getClass();
            ((nwp) this.receiver).x1(pvpVar2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.addnumber.LNAddNumberDialogKt$LNAddNumberDialog$dismissWithAnimation$1", f = "LNAddNumberDialog.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j590 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j590 j590Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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

    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-254548971);
        int i2 = 1;
        if (bVarI.q(i & 1, i != 0)) {
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zA = bVarI.A(view);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cbb(view, i2);
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new fwp();
        }
    }

    public static final void b(f8r f8rVar, String str, Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        qyd0 qyd0Var;
        long j;
        boolean z;
        long j2;
        boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(1623341036);
        int i2 = i | (bVarI.M(f8rVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            qyd0 qyd0Var2 = ejb0.a;
            float f = ((cjb0) bVarI.O(qyd0Var2)).g;
            float f2 = ((cjb0) bVarI.O(qyd0Var2)).e;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(j.k(v8j0.b(h.g(aVar2, f, f2)), 40.0f, 0.0f, 2), 1.0f);
            f8r.a aVar3 = f8r.a.a;
            if (Intrinsics.g(f8rVar, aVar3)) {
                bVarI.N(957622134);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).s0;
                bVarI.X(false);
            } else {
                if (!Intrinsics.g(f8rVar, f8r.b.a) && !Intrinsics.g(f8rVar, f8r.c.a)) {
                    throw igf0.a(bVarI, 957620056, false);
                }
                bVarI.N(957625122);
                qyd0Var = oib0.a;
                j = ((lib0) bVarI.O(qyd0Var)).x0;
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarA = ls7.a(androidx.compose.foundation.a.b(dVarG, j, zk40.a), j060.c(2.0f));
            if (Intrinsics.g(f8rVar, aVar3) || Intrinsics.g(f8rVar, f8r.c.a)) {
                z = false;
            } else {
                if (!Intrinsics.g(f8rVar, f8r.b.a)) {
                    uhc.a();
                    return;
                }
                z = true;
            }
            int i3 = i2 >> 3;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.d.d(dVarA, z, null, null, mla.d(function0, bVarI, i3 & 112), 14);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            if (Intrinsics.g(f8rVar, aVar3) || Intrinsics.g(f8rVar, f8r.b.a)) {
                bVarI.N(124093910);
                androidx.compose.ui.d dVarH = h.h(aVar2, ((cjb0) bVarI.O(qyd0Var2)).e, 0.0f, 2);
                imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).g;
                if (Intrinsics.g(f8rVar, aVar3)) {
                    bVarI.N(-1381462152);
                    j2 = ((lib0) bVarI.O(qyd0Var)).d;
                    bVarI.X(false);
                } else {
                    if (!Intrinsics.g(f8rVar, f8r.b.a)) {
                        throw igf0.a(bVarI, -1381464377, false);
                    }
                    bVarI.N(-1381459656);
                    j2 = ((lib0) bVarI.O(qyd0Var)).o;
                    bVarI.X(false);
                }
                lkf0.d(str, dVarH, j2, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVarI, i3 & 14, 0, 130040);
                bVarI = bVarI;
                bVarI.X(false);
                z2 = true;
            } else {
                if (!Intrinsics.g(f8rVar, f8r.c.a)) {
                    throw igf0.a(bVarI, -1381473144, false);
                }
                bVarI.N(-1381454213);
                z2 = true;
                q330.a(j.r(aVar2, 16.25f), ((lib0) bVarI.O(qyd0Var)).a0, 1.88f, 0L, 0, 0.0f, bVarI, 390, 56);
                bVarI.X(false);
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new awp(f8rVar, str, function0, i);
        }
    }

    public static final void c(final mwp mwpVar, final j590 j590Var, final Function0<Unit> function0, final Function1<? super pvp, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-1305406576);
        int i2 = i | (bVarI.M(mwpVar) ? 4 : 2) | (bVarI.M(j590Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            a(0, bVarI);
            bVar = bVarI;
            v1w.a(function0, h.j(v8j0.c(androidx.compose.ui.d.a.b), 0.0f, 24.0f, 0.0f, 0.0f, 13), j590Var, 0.0f, false, j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12), ((lib0) bVarI.O(oib0.a)).i0, 0L, j58.c(0.75f, j58.b), m89.a, new qvp(), null, pp8.b(-1622031890, new gaj() { // from class: zvp
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        kwp.a(0, aVar2);
                        t5q.a(0, aVar2);
                        kwp.h(mwpVar, function0, function1, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 6) & 14) | 805306368 | ((i2 << 3) & 896), 3078, 4504);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j590Var, function0, function1, i) { // from class: dwp
                public final /* synthetic */ j590 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kwp.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(gcr gcrVar, final Function1<? super nvp, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        final Function1<? super nvp, Unit> function2;
        boolean z;
        boolean z2;
        v5b v5bVar;
        j590 j590Var;
        final gcr gcrVar2 = gcrVar;
        gcrVar2.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1529810862);
        int i2 = (bVarI.A(gcrVar2) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            nwp nwpVar = (nwp) p8i0.a(jq40.a(nwp.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            ytw ytwVarC = wyh.c(gcrVar2.y, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(nwpVar.C, bVarI, 0, 7);
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(kotlin.coroutines.e.a, bVarI);
                bVarI.r(objY);
            }
            v5b v5bVar2 = (v5b) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar = (ytw) objY2;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            lk50 lk50Var = (lk50) ytwVarC.getValue();
            boolean zA = bVarI.A(nwpVar) | bVarI.M(ytwVarC);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new a(nwpVar, ytwVarC, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, lk50Var, (Function2) objY3);
            ku90<lwp> ku90Var = nwpVar.B;
            int i3 = i2 & 112;
            boolean zA2 = ((i2 & 14) == 4 || bVarI.A(gcrVar2)) | bVarI.A(v5bVar2) | bVarI.M(j590VarG) | (i3 == 32) | bVarI.A(context);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                z = true;
                z2 = false;
                v5bVar = v5bVar2;
                b bVar = new b(function1, gcrVar2, context, v5bVar, ytwVar, j590VarG, null);
                j590Var = j590VarG;
                bVarI.r(bVar);
                objY4 = bVar;
            } else {
                j590Var = j590VarG;
                v5bVar = v5bVar2;
                z = true;
                z2 = false;
            }
            final j590 j590Var2 = j590Var;
            final v5b v5bVar3 = v5bVar;
            bVarI = bVarI;
            abs.b(ku90Var, null, null, (gaj) objY4, bVarI, 0);
            mwp mwpVar = (mwp) ytwVarC2.getValue();
            boolean zA3 = bVarI.A(v5bVar3) | bVarI.M(j590Var2);
            if (i3 != 32) {
                z = z2;
            }
            boolean z3 = zA3 | z;
            Object objY5 = bVarI.y();
            if (z3 || objY5 == c0042a) {
                objY5 = new Function0() { // from class: bwp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        kwp.e(v5bVar3, ytwVar, j590Var2, function1, new nvp.f(3, (uf00) null));
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            Function0 function0 = (Function0) objY5;
            boolean zA4 = bVarI.A(nwpVar);
            Object objY6 = bVarI.y();
            if (zA4 || objY6 == c0042a) {
                objY6 = new c(1, nwpVar, nwp.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/placebet/presentation/mynumbers/addnumber/LNAddNumberAction;)V", 0);
                bVarI.r(objY6);
            }
            c(mwpVar, j590Var2, function0, (Function1) ((chp) objY6), bVarI, 0);
        } else {
            function2 = function1;
            gcrVar2 = gcrVar2;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, i) { // from class: cwp
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    kwp.d(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(v5b v5bVar, ytw<Boolean> ytwVar, final j590 j590Var, final Function1<? super nvp, Unit> function1, final nvp.f fVar) {
        if (ytwVar.getValue().booleanValue()) {
            return;
        }
        ytwVar.setValue(Boolean.TRUE);
        ej5.c(v5bVar, null, null, new d(j590Var, null), 3).invokeOnCompletion(new Function1() { // from class: ewp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                if (!j590Var.e()) {
                    function1.invoke(fVar);
                }
                return Unit.a;
            }
        });
    }

    public static final void f(mwp.a aVar, final Function1<? super pvp, Unit> function1, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        final Function1<? super pvp, Unit> function2;
        final mwp.a aVar3 = aVar;
        androidx.compose.runtime.b bVarI = aVar2.i(-1674084347);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(aVar3) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qyd0 qyd0Var = ejb0.a;
            float f = ((cjb0) bVarI.O(qyd0Var)).e;
            androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarJ = h.j(aVar4, 0.0f, f, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
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
            androidx.compose.ui.d dVarH = h.h(aVar4, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2);
            ijf0 ijf0Var = aVar3.b;
            int i3 = i2;
            String strA = cb40.a(R.string.page_payment__name, new Object[0], bVarI);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new Function1() { // from class: uvp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var2 = (ijf0) obj;
                        ijf0Var2.getClass();
                        function1.invoke(new pvp.g(ijf0Var2));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            jr7.a(dVarH, ijf0Var, null, false, null, false, null, strA, null, null, null, 0, null, null, (Function1) objY, bVarI, 0, 0, 16252);
            androidx.compose.ui.d dVarG = j.g(h.h(h.j(aVar4, 0.0f, ((cjb0) bVarI.O(qyd0Var)).c, 0.0f, 0.0f, 13), ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2), 1.0f);
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).c, true, new hw0()), ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.ui.d dVarR = j.r(h.f(aVar4, 1.0f), 12.0f);
            crz crzVarA = erz.a(R.drawable.ic_me_play_info, 0, bVarI);
            qyd0 qyd0Var2 = oib0.a;
            h6n.b(crzVarA, "info", dVarR, ((lib0) bVarI.O(qyd0Var2)).P, bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__max_characters_hint, new Object[]{64}, bVarI), new LayoutWeightElement(1.0f, true), ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, 0, 0, 131064);
            bVarI = bVarI;
            bVarI.X(true);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            aVar3 = aVar;
            f8r f8rVar = aVar3.c;
            String strA2 = cb40.a(R.string.common_functions__save, new Object[0], bVarI);
            boolean z2 = i4 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                function2 = function1;
                objY2 = new Function0() { // from class: vvp
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(pvp.c.a);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                function2 = function1;
            }
            b(f8rVar, strA2, (Function0) objY2, bVarI, 0);
            bVarI.X(true);
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wvp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    kwp.f(aVar3, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final mwp.b bVar, final Function1<? super pvp, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-1775055035);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
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
            qyd0 qyd0Var = ejb0.a;
            androidx.compose.ui.d dVarC2 = op70.c(zqu.a(1.0f, h.j(aVar2, ((cjb0) bVarI.O(qyd0Var)).g, ((cjb0) bVarI.O(qyd0Var)).e, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 8), true), op70.a(bVarI), 14);
            boolean z = bVar.b;
            boolean z2 = bVar.c;
            qcn<kxq> qcnVar = bVar.d;
            n1a0 n1a0Var = n1a0.c;
            int i5 = i2 & 112;
            boolean z3 = i5 == 32;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z3 || objY == c0042a) {
                objY = new Function1() { // from class: rvp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        zxq zxqVar = (zxq) obj;
                        zxqVar.getClass();
                        function1.invoke(new pvp.h(zxqVar));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            boolean z4 = i5 == 32;
            Object objY2 = bVarI.y();
            if (z4 || objY2 == c0042a) {
                objY2 = new w87(function1, i4);
                bVarI.r(objY2);
            }
            Function1 function3 = (Function1) objY2;
            boolean z5 = i5 == 32;
            Object objY3 = bVarI.y();
            if (z5 || objY3 == c0042a) {
                objY3 = new x87(function1, 2);
                bVarI.r(objY3);
            }
            r6q.d(dVarC2, z2, z, qcnVar, n1a0Var, function2, function3, (Function1) objY3, bVarI, 24576);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 1.0f), ((lib0) bVarI.O(oib0.a)).A, zk40.a), bVarI, 0);
            f8r f8rVar = bVar.e;
            UiText uiText = bVar.f;
            uiText.getClass();
            String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
            boolean z6 = i5 == 32;
            Object objY4 = bVarI.y();
            if (z6 || objY4 == c0042a) {
                i3 = 0;
                objY4 = new svp(function1, 0);
                bVarI.r(objY4);
            } else {
                i3 = 0;
            }
            b(f8rVar, strG, (Function0) objY4, bVarI, i3);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tvp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    kwp.g(bVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final mwp mwpVar, final Function0<Unit> function0, final Function1<? super pvp, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1630993610);
        int i2 = (bVarI.M(mwpVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
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
            androidx.compose.ui.d dVarH = h.h(aVar2, ((cjb0) bVarI.O(ejb0.a)).g, 0.0f, 2);
            UiText title = mwpVar.getTitle();
            title.getClass();
            i((i2 << 3) & 896, bVarI, dVarH, title.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), function0);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new gwp(i3);
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new hwp(0);
                bVarI.r(objY2);
            }
            androidx.compose.animation.a.b(mwpVar, null, function2, null, "PageTransition", (Function1) objY2, pp8.b(-482091118, new iwp(function1, i3), bVarI), bVarI, (i2 & 14) | 1794432, 10);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jwp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    kwp.h(mwpVar, function0, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final String str, Function0 function0) {
        int i2;
        final Function0 function1 = function0;
        androidx.compose.runtime.b bVarI = aVar.i(-1060882760);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            hlh0.a(bVarI, dVarC, yka.a.d);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).d;
            qyd0 qyd0Var = oib0.a;
            int i3 = i2 >> 3;
            lkf0.d(str, layoutWeightElement, ((lib0) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, i3 & 14, 0, 131064);
            bVarI = bVarI;
            androidx.compose.ui.d dVarR = j.r(androidx.compose.ui.d.a.b, 16.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            function1 = function0;
            h6n.b(erz.a(R.drawable.close_icon, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, androidx.compose.foundation.d.b(dVarR, (psw) objY, ut50.b(16.0f, 4, 0L, false), false, null, mla.d(function1, bVarI, i3 & 112), 28), ((lib0) bVarI.O(qyd0Var)).P, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xvp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kwp.i(qj40.a(i | 1), (a) obj, dVar, str, function1);
                    return Unit.a;
                }
            };
        }
    }
}
