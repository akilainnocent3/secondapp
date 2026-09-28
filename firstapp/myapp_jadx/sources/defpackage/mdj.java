package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lmdj;", "Lm12;", "Lk9j;", "Lj9j;", "<init>", "()V", "Lawz;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mdj extends grl implements k9j, j9j {
    public final String B;
    public final q8i0 C;
    public com.sporty.android.platform.features.newotp.util.a D;
    public psm E;
    public v5 F;

    public static final /* synthetic */ class a extends pf implements Function2<ycj, v1b<? super Unit>, Object> {
        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ycj ycjVar, v1b<? super Unit> v1bVar) {
            sx20 sx20VarF;
            ycj ycjVar2 = ycjVar;
            mdj mdjVar = (mdj) this.a;
            mdjVar.getClass();
            if (ycjVar2 instanceof ycj.a) {
                mdjVar.requireActivity().getOnBackPressedDispatcher().d();
            } else if (ycjVar2 instanceof ycj.b) {
                mdjVar.requireActivity().finish();
            } else if (ycjVar2 instanceof ycj.d) {
                Bundle bundle = new Bundle();
                bundle.putString("title", mdjVar.getString(R.string.common_helps__t_and_c));
                sh8.c().c(((ycj.d) ycjVar2).a, bundle);
            } else if (ycjVar2 instanceof ycj.e) {
                androidx.fragment.app.e activity = mdjVar.getActivity();
                if (activity == null) {
                    sx20VarF = sx20.a.a;
                } else {
                    if (!(activity instanceof BaseAccountAuthenticatorActivity)) {
                        activity = null;
                    }
                    BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity = (BaseAccountAuthenticatorActivity) activity;
                    if (baseAccountAuthenticatorActivity != null) {
                        v5 v5Var = mdjVar.F;
                        if (v5Var == null) {
                            Intrinsics.n("accRegistrationHelper");
                            throw null;
                        }
                        ycj.e eVar = (ycj.e) ycjVar2;
                        sx20VarF = v5Var.f(baseAccountAuthenticatorActivity, eVar.b, eVar.a);
                    } else {
                        sx20VarF = sx20.a.a;
                    }
                }
                if (sx20VarF instanceof sx20.a) {
                    ((ycj.e) ycjVar2).c.invoke(Boolean.FALSE);
                } else {
                    if (!(sx20VarF instanceof sx20.b)) {
                        uhc.a();
                        return null;
                    }
                    if (((sx20.b) sx20VarF).a) {
                        mdjVar.requireActivity().finish();
                    }
                    ((ycj.e) ycjVar2).c.invoke(Boolean.TRUE);
                }
            } else {
                if (!(ycjVar2 instanceof ycj.c)) {
                    uhc.a();
                    return null;
                }
                com.sporty.android.platform.features.newotp.util.a aVar = mdjVar.D;
                if (aVar == null) {
                    Intrinsics.n("otpModuleFactory");
                    throw null;
                }
                String str = ((ycj.c) ycjVar2).a;
                psm psmVar = mdjVar.E;
                if (psmVar == null) {
                    Intrinsics.n("countryManager");
                    throw null;
                }
                OtpModule otpModuleC = com.sporty.android.platform.features.newotp.util.a.c(aVar, str, psmVar.P());
                vqx vqxVar = new vqx();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("key - module", otpModuleC);
                vqxVar.setArguments(bundle2);
                FragmentManager supportFragmentManager = mdjVar.requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                String str2 = vqxVar.A;
                aVar2.f(android.R.id.content, vqxVar, str2);
                aVar2.c(str2);
                aVar2.k(true, true);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<zcj, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(zcj zcjVar) {
            zcj zcjVar2 = zcjVar;
            zcjVar2.getClass();
            eej eejVar = (eej) this.receiver;
            rdd0 rdd0Var = eejVar.f;
            ku90<ycj> ku90Var = eejVar.y;
            if (zcjVar2 instanceof zcj.e) {
                awz awzVarX1 = eejVar.x1();
                ijf0 ijf0Var = ((zcj.e) zcjVar2).a;
                nk0 nk0Var = ijf0Var.a;
                eejVar.z1(awz.a(awzVarX1, ijf0Var, nk0Var.b.length() > 0 ? eejVar.i.a(nk0Var.b) : n1a0.c, wh80.b.a, null, 8));
            } else if (zcjVar2 instanceof zcj.b) {
                ku90Var.a(ycj.b.a);
            } else if (zcjVar2 instanceof zcj.a) {
                ku90Var.a(ycj.a.a);
            } else if (zcjVar2 instanceof zcj.c) {
                ku90Var.a(new ycj.d(bjb0.S("/m/help#/about/terms-and-conditions")));
            } else {
                if (!(zcjVar2 instanceof zcj.d)) {
                    uhc.a();
                    return null;
                }
                rdd0Var.a(new ts40.z("join"), k00.c);
                rdd0Var.a(new ts40.v(0), k00.d);
                kzh.d(new g1i(new xzh(bm50.a(new xdj(eejVar.a.b(eejVar.c.P(), eejVar.A, eejVar.x1().a.a.b, null))), new ydj(2, null)), new zdj(eejVar, null)), o8i0.d(eejVar));
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
            return mdj.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? mdj.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public mdj() {
        this.z = false;
        this.A = false;
        this.B = "GHSetPasswordFragment";
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.C = new q8i0(jq40.a(eej.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.B;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        q8i0 q8i0Var = this.C;
        if (arguments != null && (string = arguments.getString("mobile")) != null) {
            ((eej) q8i0Var.getValue()).A = string;
        }
        g1i g1iVar = new g1i(((eej) q8i0Var.getValue()).z, new a(2, this, mdj.class, "consumeAction", "consumeAction(Lcom/sportybet/android/account/ghaccount/password/GHPasswordAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(2069126990, new Function2() { // from class: kdj
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final mdj mdjVar = this.a;
                    or0.a(null, false, false, null, pp8.b(-24266011, new Function2() { // from class: ldj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var2 = mdjVar.C;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                awz awzVar = (awz) wyh.c(((eej) q8i0Var2.getValue()).v, aVar2, 0, 7).getValue();
                                eej eejVar = (eej) q8i0Var2.getValue();
                                boolean zA = aVar2.A(eejVar);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    mdj.b bVar = new mdj.b(1, eejVar, eej.class, "handleEvent", "handleEvent(Lcom/sportybet/android/account/ghaccount/password/GHPasswordEvent;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                wdj.b(awzVar, (Function1) ((chp) objY), aVar2, 0);
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

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        requireActivity().getWindow().setSoftInputMode(32);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().getWindow().setSoftInputMode(16);
    }
}
