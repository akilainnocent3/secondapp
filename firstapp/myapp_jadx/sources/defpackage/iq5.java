package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Liq5;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lskh0;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iq5 extends qnl {
    public final q8i0 f;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a extends pf implements Function2<rkh0, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(rkh0 rkh0Var, v1b<? super Unit> v1bVar) {
            rkh0 rkh0Var2 = rkh0Var;
            iq5 iq5Var = (iq5) this.a;
            iq5Var.getClass();
            if (Intrinsics.g(rkh0Var2, rkh0.a.a)) {
                iq5Var.getParentFragmentManager().Y();
            } else if (rkh0Var2 instanceof rkh0.b) {
                iq5Var.getParentFragmentManager().Z(1, "NewOtpSelectorFragment");
                OtpModule<OtpData.Register> otpModule = ((rkh0.b) rkh0Var2).a;
                vqx vqxVar = new vqx();
                Bundle bundle = new Bundle();
                bundle.putParcelable("key - module", otpModule);
                vqxVar.setArguments(bundle);
                androidx.fragment.app.e eVarRequireActivity = iq5Var.requireActivity();
                eVarRequireActivity.getClass();
                wc.e(eVarRequireActivity, vqxVar, vqxVar.A);
            } else {
                if (!(rkh0Var2 instanceof rkh0.c)) {
                    uhc.a();
                    return null;
                }
                rkh0.c cVar = (rkh0.c) rkh0Var2;
                iq5Var.getParentFragmentManager().m0("key - otp result", vj5.a(new Pair("key - otp data", new OtpData.Register(cVar.a, (String) null, new OTPResult.Success(cVar.b), (RegisterRevampConfig) null, 22))));
                iq5Var.getParentFragmentManager().Z(1, "NewOtpSelectorFragment");
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b extends saj implements Function1<ijf0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ijf0 ijf0Var) {
            Object value;
            ijf0 ijf0Var2 = ijf0Var;
            ijf0Var2.getClass();
            oq5 oq5Var = (oq5) this.receiver;
            oq5Var.getClass();
            nk0 nk0Var = ijf0Var2.a;
            wwd0 wwd0Var = oq5Var.v;
            if (((skh0) wwd0Var.getValue()).g != uxs.LOADING) {
                ResourceUiText resourceUiTextY1 = oq5Var.y1(nk0Var.b);
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, skh0.a((skh0) value, ijf0Var2, resourceUiTextY1, null, (StringsKt.U(nk0Var.b) || resourceUiTextY1 != null) ? uxs.DISABLE : uxs.ENABLE, 39)));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object value;
            Object value2;
            oq5 oq5Var = (oq5) this.receiver;
            wwd0 wwd0Var = oq5Var.v;
            if (((skh0) wwd0Var.getValue()).g != uxs.LOADING) {
                String str = ((skh0) wwd0Var.getValue()).d.a.b;
                ResourceUiText resourceUiTextY1 = oq5Var.y1(str);
                if (resourceUiTextY1 != null || StringsKt.U(str)) {
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, skh0.a((skh0) value, null, resourceUiTextY1, null, uxs.DISABLE, 47)));
                } else if (oq5Var.b.isConnected()) {
                    nm5.a aVar = oq5Var.e.a;
                    if (aVar == null) {
                        StringUiText stringUiText = vch0.a;
                        oq5Var.x1(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip));
                    } else {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, skh0.a((skh0) value2, null, null, null, uxs.LOADING, 63)));
                        kzh.d(new g1i(ct40.a(oq5Var.d, aVar.a, str, aVar.c, ts40.m0.a, null, null, null, null, 240), new nq5(oq5Var, aVar, null)), o8i0.d(oq5Var));
                    }
                } else {
                    StringUiText stringUiText2 = vch0.a;
                    oq5Var.x1(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again));
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oq5 oq5Var = (oq5) this.receiver;
            oq5Var.i.a(ts40.l0.a, k00.d);
            oq5Var.y.a(rkh0.a.a);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object value;
            wwd0 wwd0Var = ((oq5) this.receiver).v;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, skh0.a((skh0) value, null, null, null, null, 95)));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f extends qlr implements Function0<Fragment> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return iq5.this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class g extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class h extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class i extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class j extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? iq5.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public iq5() {
        ttr ttrVarA = hwr.a(a1s.c, new g(new f()));
        this.f = new q8i0(jq40.a(oq5.class), new h(ttrVarA), new j(ttrVarA), new i(ttrVarA));
    }

    public final oq5 m0() {
        return (oq5) this.f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(m0().z, new a(2, this, iq5.class, "performEffect", sgwpmp.UiVLGNbbCIitEan, 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1359246779, new Function2() { // from class: gq5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final iq5 iq5Var = this.a;
                    or0.a(null, false, false, null, pp8.b(-638107620, new Function2() { // from class: hq5
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                iq5 iq5Var2 = iq5Var;
                                skh0 skh0Var = (skh0) wyh.c(iq5Var2.m0().w, aVar2, 0, 7).getValue();
                                oq5 oq5VarM0 = iq5Var2.m0();
                                boolean zA = aVar2.A(oq5VarM0);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    iq5.b bVar = new iq5.b(1, oq5VarM0, oq5.class, "onPhoneNumberChanged", "onPhoneNumberChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                oq5 oq5VarM1 = iq5Var2.m0();
                                boolean zA2 = aVar2.A(oq5VarM1);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    iq5.c cVar = new iq5.c(0, oq5VarM1, oq5.class, "onConfirm", "onConfirm()V", 0);
                                    aVar2.r(cVar);
                                    objY2 = cVar;
                                }
                                Function0 function0 = (Function0) ((chp) objY2);
                                oq5 oq5VarM2 = iq5Var2.m0();
                                boolean zA3 = aVar2.A(oq5VarM2);
                                Object objY3 = aVar2.y();
                                if (zA3 || objY3 == c0042a) {
                                    iq5.d dVar = new iq5.d(0, oq5VarM2, oq5.class, "onDismiss", "onDismiss()V", 0);
                                    aVar2.r(dVar);
                                    objY3 = dVar;
                                }
                                Function0 function2 = (Function0) ((chp) objY3);
                                oq5 oq5VarM3 = iq5Var2.m0();
                                boolean zA4 = aVar2.A(oq5VarM3);
                                Object objY4 = aVar2.y();
                                if (zA4 || objY4 == c0042a) {
                                    iq5.e eVar = new iq5.e(0, oq5VarM3, oq5.class, "onErrorDialogDismissed", "onErrorDialogDismissed()V", 0);
                                    aVar2.r(eVar);
                                    objY4 = eVar;
                                }
                                qkh0.a(skh0Var, function1, function0, function2, (Function0) ((chp) objY4), aVar2, 0);
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
}
