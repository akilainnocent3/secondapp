package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.router.Sender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j9q {

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetDialogKt$LNFeatureMatchQuickBetDialog$1$1", f = "LNFeatureMatchQuickBetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ cuw<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cuw<Boolean> cuwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = cuwVar;
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
            this.a.o0(Boolean.TRUE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetDialogKt$LNFeatureMatchQuickBetDialog$2$1", f = "LNFeatureMatchQuickBetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ cuw<Boolean> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ ytw<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cuw<Boolean> cuwVar, Function0<Unit> function0, ytw<Boolean> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = cuwVar;
            this.b = function0;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.c.getValue().booleanValue()) {
                cuw<Boolean> cuwVar = this.a;
                if (!((Boolean) ((x5a0) cuwVar.b).getValue()).booleanValue() && !((Boolean) ((x5a0) cuwVar.c).getValue()).booleanValue() && cuwVar.n0()) {
                    this.b.invoke();
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetDialogKt$LNFeatureMatchQuickBetDialog$4$1", f = "LNFeatureMatchQuickBetDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<v5b, k9q, v1b<? super Unit>, Object> {
        public /* synthetic */ k9q a;
        public final /* synthetic */ yfx b;
        public final /* synthetic */ azm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yfx yfxVar, azm azmVar, v1b<? super c> v1bVar) {
            super(3, v1bVar);
            this.b = yfxVar;
            this.c = azmVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(v5b v5bVar, k9q k9qVar, v1b<? super Unit> v1bVar) {
            c cVar = new c(this.b, this.c, v1bVar);
            cVar.a = k9qVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            k9q k9qVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(k9qVar, k9q.a.a);
            yfx yfxVar = this.b;
            if (zG) {
                yfxVar.k();
            } else {
                boolean zG2 = Intrinsics.g(k9qVar, k9q.b.a);
                azm azmVar = this.c;
                if (zG2) {
                    yfxVar.k();
                    azmVar.d(wae.DEPOSIT);
                } else {
                    if (!(k9qVar instanceof k9q.c)) {
                        uhc.a();
                        return null;
                    }
                    yfxVar.k();
                    azmVar.i(wae.LUCKY_NUMBER, n5u.c(new l5u.d(((k9q.c) k9qVar).a)), null, Sender.UNKNOWN);
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<c9q, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(c9q c9qVar) {
            c9q c9qVar2 = c9qVar;
            c9qVar2.getClass();
            ((uaq) this.receiver).y1(c9qVar2);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ifx ifxVar, final yfx yfxVar, final azm azmVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object obj;
        int i3;
        Object obj2;
        yfxVar.getClass();
        azmVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-651348888);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(ifxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(yfxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(azmVar) : bVarI.A(azmVar) ? 256 : 128;
        }
        int i4 = i2;
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            final uaq uaqVar = (uaq) p8i0.a(jq40.a(uaq.class), ifxVar, null, cll.a(ifxVar, bVarI), ifxVar.getDefaultViewModelCreationExtras(), bVarI);
            ytw ytwVarC = wyh.c(uaqVar.L, bVarI, 0, 7);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                obj = objY;
                cuw cuwVar = new cuw(Boolean.FALSE);
                bVarI.r(cuwVar);
                obj = cuwVar;
            }
            obj = objY;
            final cuw cuwVar2 = (cuw) obj;
            Object objY2 = bVarI.y();
            Object obj3 = objY2;
            if (objY2 == c0042a) {
                ytw ytwVarB = m.b(Boolean.FALSE);
                bVarI.r(ytwVarB);
                obj3 = ytwVarB;
            }
            final ytw ytwVar = (ytw) obj3;
            Object objY3 = bVarI.y();
            Object obj4 = objY3;
            if (objY3 == c0042a) {
                ytw ytwVarB2 = m.b(Boolean.FALSE);
                bVarI.r(ytwVarB2);
                obj4 = ytwVarB2;
            }
            final ytw ytwVar2 = (ytw) obj4;
            boolean zA = bVarI.A(uaqVar);
            Object objY4 = bVarI.y();
            Object obj5 = objY4;
            if (zA || objY4 == c0042a) {
                Function0 function0 = new Function0() { // from class: e9q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytw ytwVar3 = ytwVar2;
                        if (!((Boolean) ytwVar3.getValue()).booleanValue()) {
                            ytwVar3.setValue(Boolean.TRUE);
                            uaqVar.y1(c9q.c.a);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function0);
                obj5 = function0;
            }
            Function0 function1 = (Function0) obj5;
            boolean zA2 = bVarI.A(cuwVar2);
            Object objY5 = bVarI.y();
            Object obj6 = objY5;
            if (zA2 || objY5 == c0042a) {
                Function0 function2 = new Function0() { // from class: f9q
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytw ytwVar3 = ytwVar;
                        if (!((Boolean) ytwVar3.getValue()).booleanValue() && !((Boolean) ytwVar2.getValue()).booleanValue()) {
                            ytwVar3.setValue(Boolean.TRUE);
                            cuwVar2.o0(Boolean.FALSE);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function2);
                obj6 = function2;
            }
            Function0 function3 = (Function0) obj6;
            Unit unit = Unit.a;
            boolean zA3 = bVarI.A(cuwVar2);
            Object objY6 = bVarI.y();
            Object obj7 = objY6;
            if (zA3 || objY6 == c0042a) {
                a aVar2 = new a(cuwVar2, null);
                bVarI.r(aVar2);
                obj7 = aVar2;
            }
            xvf.e(bVarI, unit, (Function2) obj7);
            Boolean bool = (Boolean) ytwVar.getValue();
            bool.getClass();
            Object[] objArr = {bool, ((x5a0) cuwVar2.b).getValue(), ((x5a0) cuwVar2.c).getValue(), Boolean.valueOf(cuwVar2.n0())};
            boolean zA4 = bVarI.A(cuwVar2) | bVarI.M(function1);
            Object objY7 = bVarI.y();
            Object obj8 = objY7;
            if (zA4 || objY7 == c0042a) {
                b bVar = new b(cuwVar2, function1, ytwVar, null);
                bVarI.r(bVar);
                obj8 = bVar;
            }
            xvf.h(objArr, (Function2) obj8, bVarI);
            b(0, bVarI);
            boolean zA5 = bVarI.A(uaqVar);
            Object objY8 = bVarI.y();
            if (zA5 || objY8 == c0042a) {
                i3 = 1;
                okb okbVar = new okb(uaqVar, i3);
                bVarI.r(okbVar);
                obj2 = okbVar;
            } else {
                i3 = 1;
                obj2 = objY8;
            }
            zas.b(uaqVar, null, (Function1) obj2, bVarI, 8);
            int i5 = i3;
            ku90<k9q> ku90Var = uaqVar.M;
            boolean zA6 = bVarI.A(yfxVar);
            if ((i4 & 896) != 256 && ((i4 & 512) == 0 || !bVarI.A(azmVar))) {
                i5 = 0;
            }
            int i6 = (zA6 ? 1 : 0) | i5;
            Object objY9 = bVarI.y();
            Object obj9 = objY9;
            if (i6 != 0 || objY9 == c0042a) {
                c cVar = new c(yfxVar, azmVar, null);
                bVarI.r(cVar);
                obj9 = cVar;
            }
            abs.b(ku90Var, null, null, (gaj) obj9, bVarI, 0);
            kaq kaqVar = (kaq) ytwVarC.getValue();
            boolean zA7 = bVarI.A(uaqVar);
            Object objY10 = bVarI.y();
            if (zA7 || objY10 == c0042a) {
                d dVar = new d(1, uaqVar, uaq.class, "handleAction", "handleAction(Lcom/sportybet/feature/luckynumber/featurematch/presentation/quickbet/LNFeatureMatchQuickBetAction;)V", 0);
                bVarI.r(dVar);
                objY10 = dVar;
            }
            jaq.d(kaqVar, cuwVar2, function3, (Function1) ((chp) objY10), bVarI, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g9q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    int iA = qj40.a(i | 1);
                    j9q.a(ifxVar, yfxVar, azmVar, (a) obj10, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar) {
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> i9qVar;
        androidx.compose.runtime.e eVarZ;
        Window window;
        n8j0.g cVar;
        Object obj;
        androidx.compose.runtime.b bVarI = aVar.i(-1463358728);
        if (bVarI.q(i & 1, i != 0)) {
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            ViewParent parent = view.getParent();
            eme emeVar = parent instanceof eme ? (eme) parent : null;
            if (emeVar == null || (window = emeVar.getWindow()) == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    i9qVar = new h9q();
                }
            } else {
                boolean zM = bVarI.M(window);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    window.setLayout(-1, -1);
                    window.setWindowAnimations(0);
                    window.clearFlags(2);
                    window.clearFlags(201326592);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setDimAmount(0.0f);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(0);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.layoutInDisplayCutoutMode = 1;
                        window.setAttributes(attributes);
                    }
                    if (i2 >= 29) {
                        window.setStatusBarContrastEnforced(false);
                        window.setNavigationBarContrastEnforced(false);
                    }
                    z7j0.a(window, false);
                    window.getDecorView().setSystemUiVisibility(1792);
                    qoa0 qoa0Var = new qoa0(view);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 35) {
                        cVar = new n8j0.f(window, qoa0Var);
                    } else if (i3 >= 30) {
                        cVar = new n8j0.d(window, qoa0Var);
                    } else {
                        cVar = i3 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                    }
                    cVar.d(false);
                    cVar.c(false);
                    bVarI.r(window);
                    obj = window;
                } else {
                    obj = objY;
                }
            }
            eVarZ.d = i9qVar;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            i9qVar = new i9q();
            eVarZ.d = i9qVar;
        }
    }

    public static final class e implements jbs {
        @Override // defpackage.jbs
        public final void a() {
        }
    }
}
