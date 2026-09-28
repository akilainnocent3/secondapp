package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lci80;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ltvz;", "state", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ci80 extends s2m {
    public final q8i0 f;
    public yuz i;
    public azm v;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a extends pf implements Function2<xuz, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xuz xuzVar, v1b<? super Unit> v1bVar) {
            xuz xuzVar2 = xuzVar;
            ci80 ci80Var = (ci80) this.a;
            if (xuzVar2 instanceof xuz.a) {
                ci80Var.requireActivity().getOnBackPressedDispatcher().d();
            } else if (xuzVar2 instanceof xuz.b) {
                ci80Var.requireActivity().finish();
            } else {
                if (xuzVar2 instanceof xuz.d) {
                    azm azmVar = ci80Var.v;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azm.c(azmVar, ((xuz.d) xuzVar2).a, null, null, 6);
                } else if (xuzVar2 instanceof xuz.c) {
                    yuz yuzVar = ci80Var.i;
                    if (yuzVar == null) {
                        Intrinsics.n("host");
                        throw null;
                    }
                    androidx.fragment.app.e eVarRequireActivity = ci80Var.requireActivity();
                    eVarRequireActivity.getClass();
                    String str = ((xuz.c) xuzVar2).a;
                    str.getClass();
                    OtpModule otpModuleC = com.sporty.android.platform.features.newotp.util.a.c(yuzVar.a, str, yuzVar.b.P());
                    vqx vqxVar = new vqx();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("key - module", otpModuleC);
                    vqxVar.setArguments(bundle);
                    FragmentManager supportFragmentManager = eVarRequireActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    aVar.f(android.R.id.content, vqxVar, "NewOtpSelectorFragment");
                    aVar.c("NewOtpSelectorFragment");
                    aVar.k(true, true);
                } else if (xuzVar2 instanceof xuz.e) {
                    yuz yuzVar2 = ci80Var.i;
                    if (yuzVar2 == null) {
                        Intrinsics.n("host");
                        throw null;
                    }
                    androidx.fragment.app.e eVarRequireActivity2 = ci80Var.requireActivity();
                    eVarRequireActivity2.getClass();
                    xuz.e eVar = (xuz.e) xuzVar2;
                    String str2 = eVar.a;
                    OTPCompleteResult oTPCompleteResult = eVar.b;
                    str2.getClass();
                    oTPCompleteResult.getClass();
                    BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity = eVarRequireActivity2 instanceof BaseAccountAuthenticatorActivity ? (BaseAccountAuthenticatorActivity) eVarRequireActivity2 : null;
                    if (baseAccountAuthenticatorActivity != null) {
                        yuzVar2.c.b(baseAccountAuthenticatorActivity, oTPCompleteResult, str2);
                    }
                } else {
                    ci80Var.getClass();
                    if (!(xuzVar2 instanceof xuz.f)) {
                        uhc.a();
                        return null;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final /* synthetic */ class b extends saj implements Function1<vuz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(vuz vuzVar) {
            Object value;
            tvz tvzVarA;
            Object value2;
            vuz vuzVar2 = vuzVar;
            vuzVar2.getClass();
            ii80 ii80Var = (ii80) this.receiver;
            ku90<xuz> ku90Var = ii80Var.i;
            wwd0 wwd0Var = ii80Var.e;
            if (vuzVar2 instanceof vuz.g) {
                ijf0 ijf0Var = ((vuz.g) vuzVar2).a;
                nk0 nk0Var = ijf0Var.a;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, tvz.a((tvz) value2, ijf0Var, null, nk0Var.b.length() > 0 ? ii80Var.d.a(nk0Var.b) : n1a0.c, false, xce0.b.a, "", null, false, 202)));
            } else if (vuzVar2 instanceof vuz.f) {
                ijf0 ijf0Var2 = ((vuz.f) vuzVar2).a;
                do {
                    value = wwd0Var.getValue();
                    tvzVarA = tvz.a((tvz) value, null, ijf0Var2, null, false, null, "", null, false, 221);
                } while (!wwd0Var.g(value, tvz.a(tvzVarA, null, null, null, ijf0Var2.a.b.length() > 0 && !tvzVarA.b(), null, null, null, false, 247)));
            } else if (vuzVar2 instanceof vuz.d) {
                tvz tvzVar = (tvz) wwd0Var.getValue();
                if (tvzVar.c()) {
                    if (StringsKt.U(ii80Var.w)) {
                        itf0.a aVar = itf0.a;
                        aVar.q("SetPasswordVM");
                        aVar.d("Aborting preRegister: phone number is blank", new Object[0]);
                    } else {
                        String strC = tvzVar.a.a.b;
                        if (!ii80Var.b.W()) {
                            strC = uel.c(strC);
                        }
                        ej5.c(o8i0.d(ii80Var), null, null, new gi80(ii80Var, strC, null), 3);
                    }
                }
            } else if (vuzVar2 instanceof vuz.a) {
                ku90Var.a(xuz.a.a);
            } else if (vuzVar2 instanceof vuz.b) {
                ku90Var.a(xuz.b.a);
            } else if (vuzVar2 instanceof vuz.c) {
                ku90Var.a(new xuz.d(ii80Var.c.h("m", "help#", lobGSRIlnSGJY.UZChdrzcjM, "terms-and-conditions")));
            } else if (!(vuzVar2 instanceof vuz.e)) {
                uhc.a();
                return null;
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
            return ci80.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ci80.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ci80() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(ii80.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((ii80) this.f.getValue()).v, new a(2, this, ci80.class, "consumeEffect", "consumeEffect(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryEffect;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1703569922, new xh80(this), true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        requireActivity().getWindow().setSoftInputMode(32);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setSoftInputMode(16);
    }
}
