package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.country.ChangeRegionActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lxgu;", "Lm12;", "Lk9j;", "Lj9j;", "<init>", "()V", "Lthu;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xgu extends hwl implements k9j, j9j {
    public final q8i0 B;
    public rx40 C;
    public v5 D;
    public com.sporty.android.platform.features.newotp.util.a E;
    public final String F;

    public static final /* synthetic */ class a extends pf implements Function2<us40, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(us40 us40Var, v1b<? super Unit> v1bVar) {
            us40 us40Var2 = us40Var;
            xgu xguVar = (xgu) this.a;
            if (us40Var2 instanceof us40.b) {
                xguVar.requireActivity().finish();
            } else if (us40Var2 instanceof us40.a) {
                yrh0.s(xguVar.requireContext(), ChangeRegionActivity.z1(xguVar.requireContext()), true);
            } else {
                if (us40Var2 instanceof us40.c) {
                    androidx.fragment.app.e eVarRequireActivity = xguVar.requireActivity();
                    eVarRequireActivity.getClass();
                    s9 s9Var = new s9();
                    s9Var.setArguments(vj5.a(new Pair("mobile", ((us40.c) us40Var2).a)));
                    Unit unit = Unit.a;
                    wc.e(eVarRequireActivity, s9Var, null);
                } else if (us40Var2 instanceof us40.d) {
                    com.sporty.android.platform.features.newotp.util.a aVar = xguVar.E;
                    if (aVar == null) {
                        Intrinsics.n("otpModuleFactory");
                        throw null;
                    }
                    us40.d dVar = (us40.d) us40Var2;
                    OtpModule otpModuleC = com.sporty.android.platform.features.newotp.util.a.c(aVar, dVar.b, dVar.a);
                    androidx.fragment.app.e eVarRequireActivity2 = xguVar.requireActivity();
                    eVarRequireActivity2.getClass();
                    vqx vqxVar = new vqx();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key - module", otpModuleC);
                    vqxVar.setArguments(bundle);
                    wc.e(eVarRequireActivity2, vqxVar, "NewOtpSelectorFragment");
                } else {
                    if (!(us40Var2 instanceof us40.e)) {
                        xguVar.getClass();
                        uhc.a();
                        return null;
                    }
                    v5 v5Var = xguVar.D;
                    if (v5Var == null) {
                        Intrinsics.n("accRegistrationHelper");
                        throw null;
                    }
                    androidx.fragment.app.e eVarRequireActivity3 = xguVar.requireActivity();
                    us40.e eVar = (us40.e) us40Var2;
                    v5Var.f((BaseAccountAuthenticatorActivity) (eVarRequireActivity3 instanceof BaseAccountAuthenticatorActivity ? eVarRequireActivity3 : null), eVar.b, eVar.a);
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<vs40, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(vs40 vs40Var) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            ijf0 ijf0Var;
            String str;
            Object value5;
            ijf0 ijf0Var2;
            String str2;
            Regex regex;
            List listC;
            Object value6;
            Object value7;
            Object value8;
            vs40 vs40Var2 = vs40Var;
            vs40Var2.getClass();
            phu phuVar = (phu) this.receiver;
            ku90<us40> ku90Var = phuVar.v;
            wwd0 wwd0Var = phuVar.y;
            if (vs40Var2.equals(vs40.a.a)) {
                ku90Var.a(us40.a.a);
            } else if (vs40Var2.equals(vs40.b.a)) {
                ku90Var.a(us40.b.a);
            } else if (vs40Var2 instanceof vs40.j) {
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, thu.a((thu) value8, ((vs40.j) vs40Var2).a, null, null, null, null, null, null, null, null, null, null, 65527)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.k) {
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, thu.a((thu) value7, null, ((vs40.k) vs40Var2).a, null, null, null, null, null, null, null, null, null, 65519)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.i) {
                do {
                    value6 = wwd0Var.getValue();
                } while (!wwd0Var.g(value6, thu.a((thu) value6, null, null, null, null, ((vs40.i) vs40Var2).a, null, null, null, null, null, null, 65407)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.m) {
                do {
                    value5 = wwd0Var.getValue();
                    ijf0Var2 = ((vs40.m) vs40Var2).a;
                    buh0 buh0Var = phuVar.f;
                    str2 = ijf0Var2.a.b;
                    regex = rhu.j;
                    listC = kotlin.collections.a.c(new px40.a(phuVar.a.l()));
                    buh0Var.getClass();
                } while (!wwd0Var.g(value5, thu.a((thu) value5, null, null, null, null, null, ijf0Var2, buh0.a(str2, regex, listC), null, null, null, null, 64767)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.l) {
                do {
                    value4 = wwd0Var.getValue();
                    ijf0Var = ((vs40.l) vs40Var2).a;
                    le50 le50Var = phuVar.e;
                    str = ijf0Var.a.b;
                    le50Var.getClass();
                } while (!wwd0Var.g(value4, thu.a((thu) value4, null, null, null, null, null, null, null, ijf0Var, le50.a(str), null, null, 58367)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.h) {
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, thu.a((thu) value3, null, null, null, ((vs40.h) vs40Var2).a, null, null, null, null, null, null, null, 65471)));
                phuVar.x1();
            } else if (vs40Var2 instanceof vs40.g) {
                phuVar.b.d(wae.TERMS_AND_CONDITIONS);
            } else if (vs40Var2 instanceof vs40.f) {
                ku90Var.a(new us40.c(((thu) phuVar.z.a.getValue()).i.a.b));
            } else if (vs40Var2 instanceof vs40.c) {
                if (phuVar.i.isConnected()) {
                    ej5.c(o8i0.d(phuVar), null, null, new nhu(phuVar, null), 3);
                } else {
                    do {
                        value2 = wwd0Var.getValue();
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var.g(value2, thu.a((thu) value2, null, null, null, null, null, null, null, null, null, null, new sx40.a(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again)), 32767)));
                }
            } else if (vs40Var2 instanceof vs40.e) {
                ej5.c(o8i0.d(phuVar), null, null, new ohu(phuVar, null), 3);
            } else {
                if (!(vs40Var2 instanceof vs40.d)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, null, sx40.b.a, 32767)));
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return xgu.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? xgu.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public xgu() {
        this.z = false;
        this.A = false;
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.B = new q8i0(jq40.a(phu.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.F = "MZAccountRegisterFragment";
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getE() {
        return this.F;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s9s lifecycle = getLifecycle();
        rx40 rx40Var = this.C;
        if (rx40Var != null) {
            lifecycle.a(rx40Var);
        } else {
            Intrinsics.n("registrationStartedHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((phu) this.B.getValue()).w, new a(2, this, xgu.class, "performAction", "performAction(Lcom/sportybet/android/account/registration/RegisterAccountAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(10548970, new Function2() { // from class: vgu
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final xgu xguVar = this.a;
                    or0.a(null, false, false, null, pp8.b(-1192056831, new Function2() { // from class: wgu
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var = xguVar.B;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                thu thuVar = (thu) n95.b(((phu) q8i0Var.getValue()).z, aVar2).getValue();
                                phu phuVar = (phu) q8i0Var.getValue();
                                boolean zA = aVar2.A(phuVar);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new xgu.b(1, phuVar, phu.class, "handleEvent", "handleEvent(Lcom/sportybet/android/account/registration/RegisterAccountEvent;)V", 0);
                                    aVar2.r(objY);
                                }
                                mhu.a(thuVar, (Function1) ((chp) objY), aVar2, 8);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        s9s lifecycle = getLifecycle();
        rx40 rx40Var = this.C;
        if (rx40Var != null) {
            lifecycle.d(rx40Var);
        } else {
            Intrinsics.n("registrationStartedHelper");
            throw null;
        }
    }
}
