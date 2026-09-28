package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.country.ChangeRegionActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lv8k0;", "Lm12;", "Lk9j;", "Lj9j;", "<init>", "()V", "Lnak0;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v8k0 extends l8m implements k9j, j9j {
    public azm B;
    public rx40 C;
    public v5 D;
    public final String E;
    public final q8i0 F;

    public static final /* synthetic */ class a extends pf implements Function2<t8k0, v1b<? super Unit>, Object> {
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t8k0 t8k0Var, v1b<? super Unit> v1bVar) {
            t8k0 t8k0Var2 = t8k0Var;
            v8k0 v8k0Var = (v8k0) this.a;
            v8k0Var.getClass();
            if (t8k0Var2 instanceof t8k0.b) {
                v8k0Var.requireActivity().finish();
            } else if (t8k0Var2 instanceof t8k0.a) {
                yrh0.s(v8k0Var.requireContext(), ChangeRegionActivity.z1(v8k0Var.requireActivity()), true);
            } else {
                BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity = null;
                if (t8k0Var2 instanceof t8k0.c) {
                    Bundle bundle = new Bundle();
                    t8k0.c cVar = (t8k0.c) t8k0Var2;
                    bundle.putString("title", cVar.a);
                    azm azmVar = v8k0Var.B;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    Uri uri = Uri.parse(cVar.b);
                    uri.getClass();
                    azmVar.l(uri, bundle);
                } else if (t8k0Var2 instanceof t8k0.d) {
                    FragmentManager supportFragmentManager = v8k0Var.requireActivity().getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    s9 s9Var = new s9();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("mobile", ((t8k0.d) t8k0Var2).a);
                    s9Var.setArguments(bundle2);
                    Unit unit = Unit.a;
                    rvi.c(v8k0Var, supportFragmentManager, s9Var);
                } else if (t8k0Var2 instanceof t8k0.f) {
                    v5 v5Var = v8k0Var.D;
                    if (v5Var == null) {
                        Intrinsics.n("accRegistrationHelper");
                        throw null;
                    }
                    androidx.fragment.app.e activity = v8k0Var.getActivity();
                    if (activity != null) {
                        baseAccountAuthenticatorActivity = (BaseAccountAuthenticatorActivity) (activity instanceof BaseAccountAuthenticatorActivity ? activity : null);
                    }
                    t8k0.f fVar = (t8k0.f) t8k0Var2;
                    v5Var.f(baseAccountAuthenticatorActivity, fVar.b, fVar.a);
                } else {
                    if (!(t8k0Var2 instanceof t8k0.e)) {
                        uhc.a();
                        return null;
                    }
                    FragmentManager supportFragmentManager2 = v8k0Var.requireActivity().getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    y9k0 y9k0Var = new y9k0();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("mobile", ((t8k0.e) t8k0Var2).b);
                    y9k0Var.setArguments(bundle3);
                    Unit unit2 = Unit.a;
                    rvi.c(v8k0Var, supportFragmentManager2, y9k0Var);
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<mak0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(mak0 mak0Var) {
            boolean z;
            mak0 mak0Var2 = mak0Var;
            mak0Var2.getClass();
            j9k0 j9k0Var = (j9k0) this.receiver;
            psm psmVar = j9k0Var.a;
            rdd0 rdd0Var = j9k0Var.d;
            ku90<t8k0> ku90Var = j9k0Var.y;
            if (mak0Var2.equals(mak0.a.a)) {
                ku90Var.a(t8k0.a.a);
            } else if (mak0Var2.equals(mak0.b.a)) {
                ku90Var.a(t8k0.b.a);
            } else if (mak0Var2 instanceof mak0.d) {
                mak0.d dVar = (mak0.d) mak0Var2;
                ku90Var.a(new t8k0.c(dVar.a, dVar.b));
            } else if (mak0Var2 instanceof mak0.f) {
                j9k0Var.A1(nak0.a(j9k0Var.x1(), null, false, ((mak0.f) mak0Var2).a, null, null, null, 3839));
                j9k0Var.C1();
            } else if (mak0Var2.equals(mak0.c.a)) {
                ku90Var.a(new t8k0.d(j9k0Var.x1().f.a.b));
            } else if (mak0Var2 instanceof mak0.g) {
                nak0 nak0VarX1 = j9k0Var.x1();
                awz awzVar = j9k0Var.x1().l;
                ijf0 ijf0Var = ((mak0.g) mak0Var2).a;
                nk0 nk0Var = ijf0Var.a;
                j9k0Var.A1(nak0.a(nak0VarX1, null, false, false, null, null, awz.a(awzVar, ijf0Var, nk0Var.b.length() > 0 ? j9k0Var.f.a(nk0Var.b) : n1a0.c, wh80.b.a, null, 8), 2047));
                j9k0Var.C1();
            } else {
                if (mak0Var2 instanceof mak0.h) {
                    ijf0 ijf0Var2 = ((mak0.h) mak0Var2).a;
                    String str = ijf0Var2.a.b;
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    j9k0Var.A1(nak0.a(j9k0Var.x1(), ijf0.b(ijf0Var2, string, 0L, 6), j9k0Var.z1(string), false, null, sx40.b.a, null, 2975));
                    j9k0Var.C1();
                } else {
                    if (!(mak0Var2 instanceof mak0.e)) {
                        uhc.a();
                        return null;
                    }
                    rdd0Var.a(ts40.p.a, k00.d);
                    String str2 = j9k0Var.x1().f.a.b;
                    if (psmVar.E() && !kotlin.text.c.u(str2, "0", false)) {
                        int iL = psmVar.l();
                        Set<String> set = px40.a;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            Iterator<T> it = set.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (kotlin.text.c.u(str2, (String) it.next(), false)) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        if (str2.length() < iL || (z && str2.length() == iL)) {
                            j9k0Var.A1(nak0.a(j9k0Var.x1(), ijf0.b(j9k0Var.x1().f, "0".concat(str2), 0L, 6), false, false, null, null, null, 4063));
                        }
                    }
                    rdd0Var.a(new ts40.v(0), k00.d);
                    if (j9k0Var.e.isConnected()) {
                        kzh.d(new g1i(new xzh(bm50.a(new g9k0(j9k0Var.b.b(psmVar.P(), j9k0Var.x1().f.a.b, j9k0Var.x1().l.a.a.b, null))), new h9k0(2, null)), new i9k0(j9k0Var, null)), o8i0.d(j9k0Var));
                    } else {
                        nak0 nak0VarX2 = j9k0Var.x1();
                        StringUiText stringUiText = vch0.a;
                        j9k0Var.A1(nak0.a(nak0VarX2, null, false, false, null, new sx40.a(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again)), null, 3071));
                        j9k0Var.C1();
                    }
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
            return v8k0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? v8k0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public v8k0() {
        this.z = false;
        this.A = false;
        this.E = "ZAAccountRegisterFragment";
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.F = new q8i0(jq40.a(j9k0.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getY() {
        return this.E;
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
        g1i g1iVar = new g1i(((j9k0) this.F.getValue()).z, new a(2, this, v8k0.class, "consumeAction", "consumeAction(Lcom/sportybet/android/account/zaaccount/register/ZAAccountRegisterAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1854687294, new rg30(this, 1), true));
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
