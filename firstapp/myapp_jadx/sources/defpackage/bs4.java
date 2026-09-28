package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class bs4 {

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.BonusUnlockedBottomSheetKt$BonusUnlockedBottomSheet$1$1$1", f = "BonusUnlockedBottomSheet.kt", l = {55}, m = "invokeSuspend", v = 2)
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

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.BonusUnlockedBottomSheetKt$BonusUnlockedBottomSheet$2$1$1", f = "BonusUnlockedBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(2, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.DEPOSIT_BUTTON_SHOWN);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.BonusUnlockedBottomSheetKt$BonusUnlockedBottomSheet$2$2$1$1$1", f = "BonusUnlockedBottomSheet.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j590 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j590 j590Var, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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

    public static final void a(final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVar;
        int i2;
        androidx.compose.runtime.b bVarA = v2g.a(function0, function1, aVar, -116567327);
        int i3 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i3 & 1, (i3 & 19) != 18)) {
            final j590 j590VarG = v1w.g(true, null, bVarA, 6, 2);
            Object objY = bVarA.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(e.a, bVarA);
                bVarA.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            i060 i060VarE = j060.e(10.0f, 10.0f, 0.0f, 0.0f, 12);
            boolean zA = bVarA.A(v5bVar) | bVarA.M(j590VarG) | ((i3 & 112) == 32);
            Object objY2 = bVarA.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function0() { // from class: xr4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ej5.c(v5bVar, null, null, new bs4.a(j590VarG, null), 3);
                        function1.invoke();
                        return Unit.a;
                    }
                };
                bVarA.r(objY2);
            }
            op8 op8VarB = pp8.b(-841027005, new gaj() { // from class: yr4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Unit unit = Unit.a;
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY3 == c0042a2) {
                            objY3 = new bs4.b(2, null);
                            aVar2.r(objY3);
                        }
                        xvf.e(aVar2, unit, (Function2) objY3);
                        Context context = (Context) aVar2.O(AndroidCompositionLocals_androidKt.b);
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a2) {
                            objY4 = m.b(r0b.d(context) ? LxHElgWAiSeM.shoLRrtoziDwLQc : "https://s.sporty.net/cms/ic_success_with_ripple_light_44a8ed6e67.png");
                            aVar2.r(objY4);
                        }
                        ytw ytwVar = (ytw) objY4;
                        long jA = c68.a(R.color.background_type1_secondary, aVar2);
                        zk40.a aVar3 = zk40.a;
                        d.a aVar4 = d.a.b;
                        d dVarF = h.f(androidx.compose.foundation.a.b(aVar4, jA, aVar3), 32.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        mw90.a((String) ytwVar.getValue(), "Successful Icon", j.r(aVar4, 80.0f), null, null, null, null, aVar2, 432, 2040);
                        lkf0.d(cb40.a(R.string.page_payment__bonus_unlocked, new Object[0], aVar2), h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 48, 0, 130040);
                        lkf0.d(cb40.a(R.string.page_payment__welcome_bonus_claimed_message, new Object[0], aVar2), h.h(h.j(aVar4, 0.0f, 16.0f, 0.0f, 28.0f, 5), 20.0f, 0.0f, 2), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 48, 0, 130040);
                        mw90.a("https://s.sporty.net/cms/img_welcome_bonus_fcaf47887e.png", "Bonus image", h.h(j.v(j.g(aVar4, 1.0f), 0.0f, 182.0f, 0.0f, 13), 32.0f, 0.0f, 2), null, null, d0b.a.d, null, aVar2, 1573302, 1976);
                        d dVarG = j.g(aVar4, 1.0f);
                        final v5b v5bVar2 = v5bVar;
                        boolean zA2 = aVar2.A(v5bVar2);
                        final j590 j590Var = j590VarG;
                        boolean zM = zA2 | aVar2.M(j590Var);
                        final Function0 function2 = function0;
                        boolean zM2 = zM | aVar2.M(function2);
                        final Function0 function3 = function1;
                        boolean zM3 = zM2 | aVar2.M(function3);
                        Object objY5 = aVar2.y();
                        if (zM3 || objY5 == c0042a2) {
                            objY5 = new Function0() { // from class: as4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ej5.c(v5bVar2, null, null, new bs4.c(j590Var, null), 3);
                                    function2.invoke();
                                    function3.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY5);
                        }
                        xya.b(dVarG, false, null, null, null, 0.0f, null, (Function0) objY5, gt8.a, aVar2, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA);
            bVar = bVarA;
            i2 = 0;
            v1w.a((Function0) objY2, null, j590VarG, 0.0f, false, i060VarE, 0L, 0L, 0L, null, null, null, op8VarB, bVar, 0, 3078, 7130);
        } else {
            bVar = bVarA;
            i2 = 0;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new zr4(function0, function1, i, i2);
        }
    }
}
