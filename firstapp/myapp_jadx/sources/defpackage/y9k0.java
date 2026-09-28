package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Ly9k0;", "Lm12;", "Lk9j;", "Lj9j;", "<init>", "()V", "Lfak0;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y9k0 extends o8m implements k9j, j9j {
    public final String B;
    public final q8i0 C;
    public d0n D;
    public v5 E;

    public static final /* synthetic */ class a extends pf implements Function2<u9k0, v1b<? super Unit>, Object> {
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
        public final Object invoke(u9k0 u9k0Var, v1b<? super Unit> v1bVar) {
            u9k0 u9k0Var2 = u9k0Var;
            y9k0 y9k0Var = (y9k0) this.a;
            if (u9k0Var2 instanceof u9k0.e) {
                UiText uiText = ((u9k0.e) u9k0Var2).a;
                Context contextRequireContext = y9k0Var.requireContext();
                contextRequireContext.getClass();
                uiText.getClass();
                zyf0.c(1, uiText.e(contextRequireContext).toString());
            } else {
                y9k0Var.getClass();
                if (Intrinsics.g(u9k0Var2, u9k0.a.a)) {
                    y9k0Var.requireActivity().getOnBackPressedDispatcher().d();
                } else if (Intrinsics.g(u9k0Var2, u9k0.b.a)) {
                    y9k0Var.requireActivity().finish();
                } else {
                    BaseAccountAuthenticatorActivity baseAccountAuthenticatorActivity = null;
                    if (Intrinsics.g(u9k0Var2, u9k0.d.a)) {
                        d0n d0nVar = y9k0Var.D;
                        if (d0nVar == null) {
                            Intrinsics.n("utils");
                            throw null;
                        }
                        Context contextRequireContext2 = y9k0Var.requireContext();
                        contextRequireContext2.getClass();
                        d0nVar.b(contextRequireContext2, snb0.OTP);
                    } else {
                        if (!(u9k0Var2 instanceof u9k0.c)) {
                            uhc.a();
                            return null;
                        }
                        v5 v5Var = y9k0Var.E;
                        if (v5Var == null) {
                            Intrinsics.n("accRegistrationHelper");
                            throw null;
                        }
                        androidx.fragment.app.e activity = y9k0Var.getActivity();
                        if (activity != null) {
                            baseAccountAuthenticatorActivity = (BaseAccountAuthenticatorActivity) (activity instanceof BaseAccountAuthenticatorActivity ? activity : null);
                        }
                        u9k0.c cVar = (u9k0.c) u9k0Var2;
                        v5Var.f(baseAccountAuthenticatorActivity, cVar.b, cVar.a);
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<v9k0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(v9k0 v9k0Var) {
            v9k0 v9k0Var2 = v9k0Var;
            v9k0Var2.getClass();
            ((gak0) this.receiver).z1(v9k0Var2);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return y9k0.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? y9k0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public y9k0() {
        this.z = false;
        this.A = false;
        this.B = "ZAOTPFragment";
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.C = new q8i0(jq40.a(gak0.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.B;
    }

    public final gak0 n0() {
        return (gak0) this.C.getValue();
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("mobile")) == null) {
            return;
        }
        gak0 gak0VarN0 = n0();
        gak0VarN0.B1(fak0.a(gak0VarN0.y1(), string, null, null, null, 509));
        gak0VarN0.x1(string);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(n0().v, new a(2, this, y9k0.class, "consumeAction", "consumeAction(Lcom/sportybet/android/account/zaaccount/otp/ZAOTPAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(687343052, new Function2() { // from class: w9k0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final y9k0 y9k0Var = this.a;
                    or0.a(null, false, false, null, pp8.b(1927985621, new Function2() { // from class: x9k0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                y9k0 y9k0Var2 = y9k0Var;
                                fak0 fak0Var = (fak0) n95.b(y9k0Var2.n0().w, aVar2).getValue();
                                gak0 gak0VarN0 = y9k0Var2.n0();
                                boolean zA = aVar2.A(gak0VarN0);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new y9k0.b(1, gak0VarN0, gak0.class, "handleEvent", "handleEvent(Lcom/sportybet/android/account/zaaccount/otp/ZAOTPEvent;)V", 0);
                                    aVar2.r(objY);
                                }
                                eak0.a(fak0Var, (Function1) ((chp) objY), aVar2, 8);
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
        n0().z1(v9k0.h.a);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        n0().z1(v9k0.i.a);
    }
}
