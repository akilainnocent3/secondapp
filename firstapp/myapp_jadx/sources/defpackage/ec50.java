package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.SelfExclusion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lec50;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ltvz;", "state", "password-entry"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ec50 extends r1m {
    public final q8i0 f;
    public yuz i;

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class a extends pf implements Function2<xuz, v1b<? super Unit>, Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xuz xuzVar, v1b<? super Unit> v1bVar) {
            xuz xuzVar2 = xuzVar;
            ec50 ec50Var = (ec50) this.a;
            if (xuzVar2 instanceof xuz.a) {
                ec50Var.requireActivity().getOnBackPressedDispatcher().d();
            } else if (xuzVar2 instanceof xuz.b) {
                ec50Var.requireActivity().finish();
            } else {
                if (xuzVar2 instanceof xuz.f) {
                    yuz yuzVar = ec50Var.i;
                    if (yuzVar == null) {
                        Intrinsics.n("host");
                        throw null;
                    }
                    androidx.fragment.app.e eVarRequireActivity = ec50Var.requireActivity();
                    eVarRequireActivity.getClass();
                    xuz.f fVar = (xuz.f) xuzVar2;
                    String str = fVar.a;
                    OTPCompleteResult oTPCompleteResult = fVar.b;
                    String str2 = fVar.c;
                    boolean z = fVar.d;
                    uqm uqmVar = yuzVar.d;
                    str.getClass();
                    oTPCompleteResult.getClass();
                    str2.getClass();
                    if (!StringsKt.U(str2)) {
                        yuzVar.e.a(new gd50(str2), k00.a, k00.c, k00.b);
                    }
                    irm irmVar = eVarRequireActivity instanceof irm ? (irm) eVarRequireActivity : null;
                    if (!StringsKt.U(oTPCompleteResult.getAccessToken()) && !StringsKt.U(oTPCompleteResult.getRefreshToken()) && !StringsKt.U(oTPCompleteResult.getUserId()) && (irmVar != null || z)) {
                        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
                        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
                        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
                        dq7 dq7VarA = jq40.a(i7n.class);
                        String strI = dq7VarA.i();
                        if (strI == null) {
                            hb5.a("Local and anonymous classes can not be ViewModels");
                            return null;
                        }
                        ((i7n) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).b = true;
                        String userId = oTPCompleteResult.getUserId();
                        String accessToken = oTPCompleteResult.getAccessToken();
                        String refreshToken = oTPCompleteResult.getRefreshToken();
                        SelfExclusion selfExclusion = oTPCompleteResult.getSelfExclusion();
                        uqmVar.saveToken(irmVar, new vqm(str, userId, accessToken, refreshToken, selfExclusion != null ? Long.valueOf(selfExclusion.getEndDate()) : null, (String) null, Integer.valueOf(oTPCompleteResult.getUserCert()), (String) null, (String) null, (String) null, (String) null, 0L, 8096));
                        uqmVar.setLanguage(oTPCompleteResult.getLanguage());
                    }
                    eVarRequireActivity.finish();
                } else {
                    ec50Var.getClass();
                    if (!(xuzVar2 instanceof xuz.d) && !(xuzVar2 instanceof xuz.c) && !(xuzVar2 instanceof xuz.e)) {
                        uhc.a();
                        return null;
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<vuz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(vuz vuzVar) {
            Object value;
            Object value2;
            tvz tvzVarA;
            Object value3;
            vuz vuzVar2 = vuzVar;
            vuzVar2.getClass();
            rd50 rd50Var = (rd50) this.receiver;
            ku90<xuz> ku90Var = rd50Var.e;
            wwd0 wwd0Var = rd50Var.c;
            if (vuzVar2 instanceof vuz.g) {
                ijf0 ijf0Var = ((vuz.g) vuzVar2).a;
                nk0 nk0Var = ijf0Var.a;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, tvz.a((tvz) value3, ijf0Var, null, nk0Var.b.length() > 0 ? rd50Var.b.a(nk0Var.b) : n1a0.c, false, xce0.b.a, "", null, false, 202)));
            } else if (vuzVar2 instanceof vuz.f) {
                ijf0 ijf0Var2 = ((vuz.f) vuzVar2).a;
                do {
                    value2 = wwd0Var.getValue();
                    tvzVarA = tvz.a((tvz) value2, null, ijf0Var2, null, false, null, "", null, false, 221);
                } while (!wwd0Var.g(value2, tvz.a(tvzVarA, null, null, null, ijf0Var2.a.b.length() > 0 && !tvzVarA.b(), null, null, null, false, 247)));
            } else if (vuzVar2 instanceof vuz.d) {
                String str = rd50Var.v;
                String str2 = rd50Var.i;
                tvz tvzVar = (tvz) wwd0Var.getValue();
                if (tvzVar.c()) {
                    if (StringsKt.U(str2) || StringsKt.U(str)) {
                        itf0.a aVar = itf0.a;
                        aVar.q("ResetPasswordVM");
                        aVar.d("Aborting reset: mobile blank=" + StringsKt.U(str2) + ", token blank=" + StringsKt.U(str), new Object[0]);
                    } else {
                        ej5.c(o8i0.d(rd50Var), null, null, new qd50(rd50Var, uel.c(tvzVar.a.a.b), null), 3);
                    }
                }
            } else if (vuzVar2 instanceof vuz.a) {
                ku90Var.a(xuz.a.a);
            } else if (vuzVar2 instanceof vuz.b) {
                ku90Var.a(xuz.b.a);
            } else if (!(vuzVar2 instanceof vuz.c)) {
                if (!(vuzVar2 instanceof vuz.e)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, null, null, null, false, 127)));
                id50 id50Var = rd50Var.z;
                rd50Var.z = null;
                if (id50Var != null) {
                    id50Var.invoke();
                }
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
            return ec50.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ec50.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ec50() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.f = new q8i0(jq40.a(rd50.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        final boolean z = arguments != null ? arguments.getBoolean("isSkippable", false) : false;
        g1i g1iVar = new g1i(((rd50) this.f.getValue()).f, new a(2, this, ec50.class, "consumeEffect", "consumeEffect(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryEffect;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1400653278, new Function2() { // from class: ac50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ec50 ec50Var = this.a;
                    final boolean z2 = z;
                    o0z.a(null, null, null, null, null, pp8.b(1606742675, new Function2() { // from class: bc50
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var = ec50Var.f;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tvz tvzVar = (tvz) wyh.c(((rd50) q8i0Var.getValue()).d, aVar2, 0, 7).getValue();
                                fvz fvzVar = new fvz(false, z2, false);
                                rd50 rd50Var = (rd50) q8i0Var.getValue();
                                boolean zA = aVar2.A(rd50Var);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    ec50.b bVar = new ec50.b(1, rd50Var, rd50.class, "handleAction", "handleAction(Lcom/sportybet/feature/passwordentry/impl/presentation/PasswordEntryAction;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                svz.c(tvzVar, fvzVar, (Function1) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
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
