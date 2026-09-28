package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.esotericsoftware.spine.android.b;
import com.sportygames.newcms.c;
import com.sportygames.piggybash.presentation.component.StableFrameSpineView;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xav {

    @c0d(c = "com.sportygames.piggybash.presentation.screens.MatchmakingScreenKt$MatchmakingScreen$1$1", f = "MatchmakingScreen.kt", l = {82}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ osw b;
        public final /* synthetic */ ytw c;
        public final /* synthetic */ com.sportygames.newcms.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(osw oswVar, ytw ytwVar, com.sportygames.newcms.b bVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = oswVar;
            this.c = ytwVar;
            this.d = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (this.b.D() == 0) {
                    return Unit.a;
                }
                this.a = 1;
                if (hkd.b(1100L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((Boolean) this.c.getValue()).booleanValue()) {
                this.d.c(lu00.b2.W1);
            }
            return Unit.a;
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ yp40 a;
        public final /* synthetic */ yp40 b;
        public final /* synthetic */ dq40<StableFrameSpineView> c;
        public final /* synthetic */ dq40<com.esotericsoftware.spine.android.b> d;
        public final /* synthetic */ ytw e;

        public b(ytw ytwVar, yp40 yp40Var, yp40 yp40Var2, dq40 dq40Var, dq40 dq40Var2) {
            this.a = yp40Var;
            this.b = yp40Var2;
            this.c = dq40Var;
            this.d = dq40Var2;
            this.e = ytwVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getClass();
            xav.d(this.e, this.a, this.b, this.c, this.d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getClass();
        }
    }

    public static final void a(final iav iavVar, final yav yavVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        yavVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(615707719);
        int i2 = (bVarI.M(iavVar) ? 4 : 2) | i | (bVarI.M(yavVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            com.sportygames.newcms.b bVar = (com.sportygames.newcms.b) bVarI.O(c.a);
            ytw ytwVarC = m.c(Boolean.valueOf(z), bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            final osw oswVar = (osw) objY;
            Integer numValueOf = Integer.valueOf(oswVar.D());
            boolean zM = bVarI.M(ytwVarC) | bVarI.A(bVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new a(oswVar, ytwVarC, bVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY2);
            if (iavVar == null) {
                bVarI.N(-1255914472);
            } else {
                bVarI.N(-1255914471);
                q75.a(j.e(d.a.b, 1.0f), null, false, pp8.b(715286446, new gaj() { // from class: vav
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float fA;
                        yka.a.C1350a c1350a;
                        r75 r75Var = (r75) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r75Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            float fE = r75Var.e();
                            float fD = r75Var.d();
                            iav iavVar2 = iavVar;
                            String strE = xav.e(iavVar2.c, aVar2);
                            d.a aVar3 = d.a.b;
                            mw90.a(strE, "Matchmaking Screen Background", j.e(aVar3, 1.0f), null, null, d0b.a.a, null, aVar2, 1573296, 1976);
                            oav.a(0, aVar2);
                            float f = fD / fE;
                            d dVarB = r75Var.b(0.5625f < f ? j.w(j.c(aVar3, 1.0f), 0.5625f * fE) : j.i(j.g(aVar3, 1.0f), fD * 1.7777778f), ht.a.e);
                            if (0.5625f < f) {
                                aVar2.N(594367039);
                                fA = i7f.a(fE, aVar2);
                                aVar2.H();
                            } else {
                                aVar2.N(594408703);
                                fA = i7f.a(1.7777778f * fD, aVar2);
                                aVar2.H();
                            }
                            float f2 = fA;
                            Object objY3 = aVar2.y();
                            if (objY3 == a.C0041a.a) {
                                objY3 = new w7c(oswVar, 1);
                                aVar2.r(objY3);
                            }
                            xav.c(dVarB, iavVar2, f2, (Function0) objY3, aVar2, 3072);
                            d dVarE = j.e(aVar3, 1.0f);
                            i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = androidx.compose.ui.c.c(aVar2, dVarE);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a2);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            float f3 = 0.08f * fE;
                            ty0.a(aVar2, j.i(aVar3, f3));
                            yav yavVar2 = yavVar;
                            gwh.d(yavVar2.a, yavVar2.b, fD, fE, null, aVar2, 0);
                            ty0.a(aVar2, j.i(aVar3, 0.025f * fE));
                            sq10.a(yavVar2.c, yavVar2.d, fD, fE, null, aVar2, 0);
                            ty0.a(aVar2, new LayoutWeightElement(1.0f, true));
                            d dVarG = j.g(aVar3, 1.0f);
                            n54 n54Var = ht.a.a;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = androidx.compose.ui.c.c(aVar2, dVarG);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                c1350a = c1350a2;
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            } else {
                                c1350a = c1350a2;
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            yka.a.C1350a c1350a3 = c1350a;
                            int i3 = yavVar2.e;
                            int i4 = yavVar2.f;
                            d dVarG2 = j.g(aVar3, 0.62f);
                            n54 n54Var2 = ht.a.h;
                            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                            a060.a(dVar2.b(dVarG2, n54Var2), false, i3, i4, fE, aVar2, 0, 2);
                            d dVarJ = h.j(dVar2.b(aVar3, ht.a.i), 0.0f, 0.0f, fD * 0.033f, 0.0f, 11);
                            aiv aivVarC2 = g75.c(n54Var, false);
                            int iHashCode3 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO3 = aVar2.o();
                            d dVarC3 = androidx.compose.ui.c.c(aVar2, dVarJ);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar2);
                            hlh0.a(aVar2, ne00VarO3, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar2, iHashCode3, c1350a3);
                            }
                            hlh0.a(aVar2, dVarC3, cVar);
                            cqh0.a(yavVar2.g, fD, fE, aVar2, 0);
                            aVar2.s();
                            aVar2.s();
                            rj30.b(h.h(wtc.b(aVar3, fE * 0.03f, aVar2, aVar3, 1.0f), 0.089f * fD, 0.0f, 2), aVar2, 0);
                            ty0.a(aVar2, j.i(aVar3, f3));
                            aVar2.s();
                            xav.b(xav.f(r75Var.b(aVar3, n54Var), fD, fE, -0.21429512f, -0.0134010315f, 0.04463433f), aVar2, 0);
                            xav.b(xav.f(r75Var.b(aVar3, n54Var), fD, fE, 0.20732082f, -0.027470399f, 0.06993272f), aVar2, 0);
                            xav.b(xav.f(r75Var.b(aVar3, n54Var), fD, fE, -0.17262438f, 0.027702332f, 0.103244334f), aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 3078, 6);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(yavVar, z, i) { // from class: wav
                public final /* synthetic */ yav b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xav.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, androidx.compose.runtime.a aVar, int i) {
        d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(1318897495);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            dVar2 = dVar;
            mw90.a(c.c(lu00.b2.n1, new String[0], bVarI), null, dVar2, null, null, d0b.a.b, null, bVarI, ((i2 << 6) & 896) | 1572912, 1976);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z7c(dVar2, i);
        }
    }

    public static final void c(d dVar, final iav iavVar, final float f, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(-1630124563);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(iavVar) ? 32 : 16) | (bVarI.c(f) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final ytw ytwVarC = m.c(function0, bVarI);
            int i3 = i2 & 112;
            boolean zM = bVarI.M(ytwVarC) | (i3 == 32);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new Function1() { // from class: pav
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r6v0, types: [T, com.esotericsoftware.spine.android.b] */
                    /* JADX WARN: Type inference failed for: r6v1, types: [T, android.view.View, com.esotericsoftware.spine.android.SpineView, com.sportygames.piggybash.presentation.component.StableFrameSpineView, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        final dq40 dq40Var = new dq40();
                        final dq40 dq40Var2 = new dq40();
                        final yp40 yp40Var = new yp40();
                        final yp40 yp40Var2 = new yp40();
                        final ytw ytwVar = ytwVarC;
                        dq40Var2.a = new b(new hcb0() { // from class: sav
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                final yp40 yp40Var3 = yp40Var;
                                yp40Var3.a = true;
                                final dq40 dq40Var3 = dq40Var;
                                T t = dq40Var3.a;
                                if (t == 0) {
                                    Intrinsics.n("spineView");
                                    throw null;
                                }
                                final ytw ytwVar2 = ytwVar;
                                final yp40 yp40Var4 = yp40Var2;
                                final dq40 dq40Var4 = dq40Var2;
                                ((StableFrameSpineView) t).post(new Runnable() { // from class: uav
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xav.d(ytwVar2, yp40Var4, yp40Var3, dq40Var3, dq40Var4);
                                    }
                                });
                            }
                        });
                        T t = dq40Var2.a;
                        if (t == 0) {
                            Intrinsics.n("spineController");
                            throw null;
                        }
                        ?? stableFrameSpineView = new StableFrameSpineView(context, (b) t);
                        iav iavVar2 = iavVar;
                        if (iavVar2.c == ap20.b) {
                            stableFrameSpineView.setBoundsProvider(new gyg());
                        }
                        stableFrameSpineView.addOnAttachStateChangeListener(new xav.b(ytwVar, yp40Var2, yp40Var, dq40Var, dq40Var2));
                        stableFrameSpineView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tav
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                xav.d(ytwVar, yp40Var2, yp40Var, dq40Var, dq40Var2);
                            }
                        });
                        stableFrameSpineView.b(new File(iavVar2.a), new File(iavVar2.b));
                        dq40Var.a = stableFrameSpineView;
                        return stableFrameSpineView;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean z = (i3 == 32) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function1() { // from class: qav
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        StableFrameSpineView stableFrameSpineView = (StableFrameSpineView) obj;
                        stableFrameSpineView.getClass();
                        if (iavVar.c != ap20.b) {
                            stableFrameSpineView.setTranslationY((-f) / 4.5f);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            dVar2 = dVar;
            androidx.compose.ui.viewinterop.b.a(function1, dVar2, (Function1) objY2, bVarI, (i2 << 3) & 112, 0);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final d dVar3 = dVar2;
            eVarZ.d = new Function2(iavVar, f, function0, i) { // from class: rav
                public final /* synthetic */ iav b;
                public final /* synthetic */ float c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    xav.c(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(ytw ytwVar, yp40 yp40Var, yp40 yp40Var2, dq40 dq40Var, dq40 dq40Var2) {
        if (yp40Var.a || !yp40Var2.a) {
            return;
        }
        T t = dq40Var.a;
        if (t == 0) {
            Intrinsics.n("spineView");
            throw null;
        }
        if (((StableFrameSpineView) t).isAttachedToWindow()) {
            T t2 = dq40Var.a;
            if (t2 == 0) {
                Intrinsics.n("spineView");
                throw null;
            }
            if (((StableFrameSpineView) t2).isLaidOut()) {
                yp40Var.a = true;
                T t3 = dq40Var2.a;
                if (t3 == 0) {
                    Intrinsics.n("spineController");
                    throw null;
                }
                ((com.esotericsoftware.spine.android.b) t3).a().m(0, "Loading- coin fill only", false);
                ((Function0) ytwVar.getValue()).invoke();
            }
        }
    }

    public static final String e(ap20 ap20Var, androidx.compose.runtime.a aVar) {
        ap20Var.getClass();
        int iOrdinal = ap20Var.ordinal();
        if (iOrdinal == 0) {
            aVar.N(-973331503);
            String strC = c.c(lu00.b2.Z, new String[0], aVar);
            aVar.H();
            return strC;
        }
        if (iOrdinal == 1) {
            aVar.N(-973334445);
            String strC2 = c.c(lu00.b2.Y, new String[0], aVar);
            aVar.H();
            return strC2;
        }
        if (iOrdinal == 2) {
            aVar.N(-973328590);
            String strC3 = c.c(lu00.b2.a0, new String[0], aVar);
            aVar.H();
            return strC3;
        }
        if (iOrdinal != 3) {
            throw rg.a(-973335836, aVar);
        }
        aVar.N(-973325550);
        String strC4 = c.c(lu00.b2.b0, new String[0], aVar);
        aVar.H();
        return strC4;
    }

    public static final d f(d dVar, float f, float f2, float f3, float f4, float f5) {
        float f6 = f5 * f;
        float f7 = (f3 + 0.5f) * f;
        float f8 = f6 / 2.0f;
        return j.r(g.c(dVar, f7 - f8, ((f4 + 0.1375f) * f2) - f8), f6);
    }
}
