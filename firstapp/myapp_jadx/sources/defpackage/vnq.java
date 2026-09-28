package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vnq {

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyOnboardingKt$LNLobbyOnboarding$1$1", f = "LNLobbyOnboarding.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibs b;
        public final /* synthetic */ ku90<Unit> c;
        public final /* synthetic */ zpz d;
        public final /* synthetic */ uf00<rny> e;
        public final /* synthetic */ Function0<Unit> f;

        /* JADX INFO: renamed from: vnq$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyOnboardingKt$LNLobbyOnboarding$1$1$1", f = "LNLobbyOnboarding.kt", l = {112}, m = "invokeSuspend", v = 2)
        public static final class C1218a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ ku90<Unit> c;
            public final /* synthetic */ zpz d;
            public final /* synthetic */ uf00<rny> e;
            public final /* synthetic */ Function0<Unit> f;

            /* JADX INFO: renamed from: vnq$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyOnboardingKt$LNLobbyOnboarding$1$1$1$1", f = "LNLobbyOnboarding.kt", l = {114}, m = "invokeSuspend", v = 2)
            public static final class C1219a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
                public Integer a;
                public int b;
                public final /* synthetic */ zpz c;
                public final /* synthetic */ v5b d;
                public final /* synthetic */ uf00<rny> e;
                public final /* synthetic */ Function0<Unit> f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1219a(zpz zpzVar, v5b v5bVar, uf00<rny> uf00Var, Function0<Unit> function0, v1b<? super C1219a> v1bVar) {
                    super(2, v1bVar);
                    this.c = zpzVar;
                    this.d = v5bVar;
                    this.e = uf00Var;
                    this.f = function0;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1219a(this.c, this.d, this.e, this.f, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                    return ((C1219a) create(unit, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Integer num;
                    y5b y5bVar = y5b.a;
                    int i = this.b;
                    Integer num2 = null;
                    if (i == 0) {
                        uj50.b(obj);
                        zpz zpzVar = this.c;
                        Integer num3 = new Integer(zpzVar.k() + 1);
                        int iIntValue = num3.intValue();
                        if (iIntValue >= 0 && iIntValue < this.e.size()) {
                            num2 = num3;
                        }
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            this.a = num2;
                            this.b = 1;
                            if (zpzVar.f(iIntValue2, yi0.d(0.0f, 0.0f, null, 7), this) == y5bVar) {
                                return y5bVar;
                            }
                            num = num2;
                        } else {
                            this.f.invoke();
                        }
                        return Unit.a;
                    }
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = this.a;
                    uj50.b(obj);
                    s75.a(num.intValue());
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1218a(ku90<Unit> ku90Var, zpz zpzVar, uf00<rny> uf00Var, Function0<Unit> function0, v1b<? super C1218a> v1bVar) {
                super(2, v1bVar);
                this.c = ku90Var;
                this.d = zpzVar;
                this.e = uf00Var;
                this.f = function0;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1218a c1218a = new C1218a(this.c, this.d, this.e, this.f, v1bVar);
                c1218a.b = obj;
                return c1218a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1218a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C1219a c1219a = new C1219a(this.d, v5bVar, this.e, this.f, null);
                    this.b = null;
                    this.a = 1;
                    if (kzh.b(this.c, c1219a, this) == y5bVar) {
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
        public a(ibs ibsVar, ku90<Unit> ku90Var, zpz zpzVar, uf00<rny> uf00Var, Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ibsVar;
            this.c = ku90Var;
            this.d = zpzVar;
            this.e = uf00Var;
            this.f = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
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
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C1218a c1218a = new C1218a(this.c, this.d, this.e, this.f, null);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c1218a, this) == y5bVar) {
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

    public static final void a(zpz zpzVar, final qcn qcnVar, androidx.compose.runtime.a aVar, final int i) {
        final zpz zpzVar2 = zpzVar;
        b bVarI = aVar.i(-668744451);
        int i2 = i | (bVarI.M(zpzVar2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(cb40.a(R.string.page_lucky_numbers__live_stream_guide, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).d, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            dpz.a(0.0f, 0, ((i2 >> 3) & 14) | 48, 16380, null, pp8.b(88671220, new iaj() { // from class: unq
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    a aVar4 = (a) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((opz) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                    }
                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        rny rnyVar = (rny) CollectionsKt.V(iIntValue, qcnVar);
                        if (rnyVar == null) {
                            aVar4.N(199482479);
                            aVar4.H();
                        } else {
                            aVar4.N(199482480);
                            ResourceUiText resourceUiText = rnyVar.a.a;
                            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                            vnq.f(resourceUiText.g((Context) aVar4.O(qyd0Var)), rnyVar.b.g((Context) aVar4.O(qyd0Var)), rnyVar.c, aVar4, 0);
                            aVar4.H();
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, null, null, zpzVar, null, null, bVarI, j.i(j.g(aVar2, 1.0f), 331.0f), null, false);
            zpzVar2 = zpzVar;
            g(qcnVar.size(), zpzVar2, null, 0.0f, 0.0f, 0L, 0L, bVarI, i2 & 112);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qcnVar, i) { // from class: mnq
                public final /* synthetic */ qcn b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(391);
                    vnq.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(2006498870);
        if (bVarI.q(i & 1, i != 0)) {
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            boolean zA = bVarI.A(view);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new snq(view, 0);
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tnq();
        }
    }

    public static final Unit c(View view) {
        Window window;
        n8j0.g cVar;
        ViewParent parent = view.getParent();
        eme emeVar = parent instanceof eme ? (eme) parent : null;
        if (emeVar != null && (window = emeVar.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.clearFlags(2);
            window.clearFlags(201326592);
            window.addFlags(Integer.MIN_VALUE);
            window.setDimAmount(0.0f);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            z7j0.a(window, false);
            window.getDecorView().setSystemUiVisibility(1792);
            qoa0 qoa0Var = new qoa0(view);
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.d(false);
            cVar.c(false);
        }
        return Unit.a;
    }

    public static final void d(final Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        function0.getClass();
        b bVarI = aVar.i(289140436);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            b(0, bVarI);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fD = r8j0.c(q8j0.a.a(bVarI).f, bVarI).d();
            float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                b6u b6uVar = b6u.i;
                StringUiText stringUiText = vch0.a;
                objY = a4h.a(new rny(b6uVar, new ResourceUiText(R.string.page_lucky_numbers__onboarding_live_stream_1_text), new j7f((((long) Float.floatToRawIntBits(55.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(193.0f)) << 32))), new rny(b6u.v, new ResourceUiText(R.string.page_lucky_numbers__onboarding_live_stream_2_text), new j7f((((long) Float.floatToRawIntBits(213.0f)) << 32) | (((long) Float.floatToRawIntBits(49.0f)) & 4294967295L))), new rny(b6u.w, new ResourceUiText(R.string.page_lucky_numbers__onboarding_live_stream_3_text), null));
                bVarI.r(objY);
            }
            uf00 uf00Var = (uf00) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new pnq();
                bVarI.r(objY2);
            }
            ved vedVarB = eqz.b(0, (Function0) objY2, bVarI, 384, 3);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new ku90();
                bVarI.r(objY3);
            }
            ku90 ku90Var = (ku90) objY3;
            ibs ibsVar = (ibs) bVarI.O(ndt.a);
            int i3 = i2 & 14;
            boolean zA = (i3 == 4) | bVarI.A(ibsVar) | bVarI.A(ku90Var) | bVarI.M(vedVarB);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                a aVar2 = new a(ibsVar, ku90Var, vedVarB, uf00Var, function0, null);
                bVarI.r(aVar2);
                objY4 = aVar2;
            }
            xvf.g(ku90Var, ibsVar, (Function2) objY4, bVarI);
            d.a aVar3 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.75f, j58.b), zk40.a);
            boolean zA2 = bVarI.A(ku90Var);
            Object objY5 = bVarI.y();
            if (zA2 || objY5 == c0042a) {
                objY5 = new qnq(ku90Var, 0);
                bVarI.r(objY5);
            }
            d dVarF = g3w.f(dVarB, true, (Function0) objY5);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            d dVarJ = h.j(j.e(aVar3, 1.0f), 0.0f, fD, 0.0f, fA, 5);
            aiv aivVarC2 = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            a(vedVarB, uf00Var, bVarI, 390);
            bVarI.X(true);
            d dVarR = j.r(h.j(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.c), 0.0f, fD + 12.0f, ((cjb0) bVarI.O(ejb0.a)).d, 0.0f, 9), 24.0f);
            mjm mjmVar = zxo.a;
            d dVarN = dVarR.n(MinimumInteractiveModifier.b);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY6;
            qyd0 qyd0Var = oib0.a;
            xt50 xt50VarA = ut50.a(20.0f, ((lib0) bVarI.O(qyd0Var)).a0, false);
            boolean z = i3 == 4;
            Object objY7 = bVarI.y();
            if (z || objY7 == c0042a) {
                objY7 = new Function0() { // from class: rnq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY7);
            }
            h6n.b(erz.a(R.drawable.ic_cancel, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, androidx.compose.foundation.d.b(dVarN, pswVar, xt50VarA, false, null, mla.d((Function0) objY7, bVarI, 0), 28), ((lib0) bVarI.O(qyd0Var)).a0, bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new na3(i, function0);
        }
    }

    public static final void e(d dVar, final String str, final j7f j7fVar, androidx.compose.runtime.a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(-1340831666);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        int i3 = i2 | (bVarI.M(j7fVar) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarT = j.t(aVar2, 240.0f, 154.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarT);
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
            mw90.a(str, "image", j.e(aVar2, 1.0f), null, null, null, null, bVarI, ((i3 >> 3) & 14) | 432, 2040);
            if (j7fVar != null) {
                long j = j7fVar.a;
                bVarI.N(1162142164);
                dVar2 = aVar2;
                mw90.a(b6u.f.a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), "hand", j.t(g.c(aVar2, j7f.c(j), j7f.d(j)), 64.0f, 80.0f), null, null, null, null, bVarI, 48, 2040);
                bVarI.X(false);
            } else {
                dVar2 = aVar2;
                bVarI.N(1162423086);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: onq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    vnq.e(dVar2, str, j7fVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final String str, final String str2, final j7f j7fVar, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(2146816334);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(j7fVar) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            e(null, str, j7fVar, bVarI, ((i2 << 3) & 112) | (i2 & 896));
            lkf0.d(str2, j.w(h.j(aVar2, 0.0f, 22.0f, 0.0f, 0.0f, 13), 240.0f), ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).o, bVarI, ((i2 >> 3) & 14) | 48, 0, 130040);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, j7fVar, i) { // from class: nnq
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ j7f c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vnq.f(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0105  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135 A[LOOP:0: B:44:0x0131->B:46:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x014a A[EDGE_INSN: B:53:0x014a->B:47:0x014a BREAK  A[LOOP:0: B:44:0x0131->B:46:0x0135], SYNTHETIC] */
    public static final void g(final int i, final zpz zpzVar, d dVar, float f, float f2, long j, long j2, androidx.compose.runtime.a aVar, final int i2) {
        final d dVar2;
        final float f3;
        final float f4;
        final long j3;
        final long j4;
        float f5;
        long j5;
        d dVar3;
        long j6;
        float f6;
        mmd mmdVar;
        int iHashCode;
        int i3;
        zk40.a aVar2;
        b bVarI = aVar.i(396826041);
        int i4 = i2 | (bVarI.d(i) ? 4 : 2) | (bVarI.M(zpzVar) ? 32 : 16) | 617856;
        if (bVarI.q(i4 & 1, (599187 & i4) != 599186)) {
            bVarI.A0();
            int i5 = i2 & 1;
            d.a aVar3 = d.a.b;
            if (i5 == 0 || bVarI.h0()) {
                qyd0 qyd0Var = oib0.a;
                long j7 = ((lib0) bVarI.O(qyd0Var)).x0;
                f5 = 8.0f;
                j5 = ((lib0) bVarI.O(qyd0Var)).r0;
                dVar3 = aVar3;
                j6 = j7;
                f6 = 8.0f;
            } else {
                bVarI.G();
                dVar3 = dVar;
                f5 = f;
                f6 = f2;
                j6 = j;
                j5 = j2;
            }
            bVarI.Y();
            mmd mmdVar2 = (mmd) bVarI.O(kna.h);
            float f7 = f5 + f6;
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar3);
            yka.k.getClass();
            d dVar4 = dVar3;
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            long j8 = j6;
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar5 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar5);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                mmdVar = mmdVar2;
            } else {
                mmdVar = mmdVar2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d160 d160VarA = b160.a(new kw0.i(f6, true, new hw0()), ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, aVar3);
                bVarI.D();
                float f8 = f6;
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar5);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                bVarI.N(-51645812);
                i3 = 0;
                while (true) {
                    aVar2 = zk40.a;
                    if (i3 < i) {
                        break;
                    }
                    g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(aVar3, f5), j060.a), j5, aVar2), bVarI, 0);
                    i3++;
                }
                bVarI.X(false);
                bVarI.X(true);
                mmd mmdVar3 = mmdVar;
                g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(g.d(aVar3, mmdVar3.v1(mmdVar3.C1(f7) * (zpzVar.l() + zpzVar.k())), 0.0f, 2), f5), j060.a), j8, aVar2), bVarI, 0);
                bVarI.X(true);
                f4 = f8;
                f3 = f5;
                j3 = j8;
                j4 = j5;
                dVar2 = dVar4;
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d160 d160VarA2 = b160.a(new kw0.i(f6, true, new hw0()), ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar3);
            bVarI.D();
            float f9 = f6;
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            bVarI.N(-51645812);
            i3 = 0;
            while (true) {
                aVar2 = zk40.a;
                if (i3 < i) {
                    break;
                    break;
                } else {
                    g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(aVar3, f5), j060.a), j5, aVar2), bVarI, 0);
                    i3++;
                }
            }
            bVarI.X(false);
            bVarI.X(true);
            mmd mmdVar4 = mmdVar;
            g75.a(androidx.compose.foundation.a.b(ls7.a(j.r(g.d(aVar3, mmdVar4.v1(mmdVar4.C1(f7) * (zpzVar.l() + zpzVar.k())), 0.0f, 2), f5), j060.a), j8, aVar2), bVarI, 0);
            bVarI.X(true);
            f4 = f9;
            f3 = f5;
            j3 = j8;
            j4 = j5;
            dVar2 = dVar4;
        } else {
            bVarI.G();
            dVar2 = dVar;
            f3 = f;
            f4 = f2;
            j3 = j;
            j4 = j2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, zpzVar, dVar2, f3, f4, j3, j4, i2) { // from class: lnq
                public final /* synthetic */ int a;
                public final /* synthetic */ zpz b;
                public final /* synthetic */ d c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vnq.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
