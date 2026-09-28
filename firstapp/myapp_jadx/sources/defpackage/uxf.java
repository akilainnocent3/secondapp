package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Luxf;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "Ldyf;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uxf extends qql implements k9j {
    public EmailChangeFlowArgs A;
    public azm f;
    public f8d0 i;
    public final q8i0 v;
    public final q8i0 w;
    public ee<String> y;
    public ee<OtpModule<OtpData.EmailChange>> z;

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return uxf.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return uxf.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return uxf.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<Fragment> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return uxf.this;
        }
    }

    public static final class e extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.a = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
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

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? uxf.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public uxf() {
        ttr ttrVarA = hwr.a(a1s.c, new e(new d()));
        this.v = new q8i0(jq40.a(gyf.class), new f(ttrVarA), new h(ttrVarA), new g(ttrVarA));
        this.w = new q8i0(jq40.a(au7.class), new a(), new c(), new b());
    }

    public final gyf m0() {
        return (gyf) this.v.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        yfx yfxVarA;
        EmailChangeFlowArgs emailChangeFlowArgs;
        pxf pxfVar;
        super.onCreate(bundle);
        try {
            yfxVarA = isAdded() ? NavHostFragment.a.a(this) : null;
        } catch (IllegalStateException e2) {
            itf0.a.f(e2, "Failed to find NavController", new Object[0]);
        }
        if (yfxVarA == null || (pxfVar = (pxf) mfx.a(yfxVarA.b(jq40.a(pxf.class)), jq40.a(pxf.class))) == null || (emailChangeFlowArgs = pxfVar.a) == null) {
            emailChangeFlowArgs = new EmailChangeFlowArgs(0);
        }
        this.A = emailChangeFlowArgs;
        f8d0 f8d0Var = this.i;
        if (f8d0Var == null) {
            Intrinsics.n("sportyPinCoordinator");
            throw null;
        }
        ee<String> eeVarRegisterForActivityResult = registerForActivityResult(f8d0Var.a(), new ud() { // from class: qxf
            @Override // defpackage.ud
            public final void a(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return;
                }
                uxf uxfVar = this.a;
                EmailChangeFlowArgs emailChangeFlowArgs2 = uxfVar.A;
                if (emailChangeFlowArgs2 == null) {
                    Intrinsics.n("args");
                    throw null;
                }
                if (emailChangeFlowArgs2.d) {
                    gyf gyfVarM0 = uxfVar.m0();
                    gyfVarM0.i.a(new wxf.c(new EmailChangeVerifyIdentityArgs(str, gyfVarM0.d.c)));
                } else if (!emailChangeFlowArgs2.c) {
                    uxfVar.m0().i.a(new wxf.a(str));
                } else {
                    gyf gyfVarM1 = uxfVar.m0();
                    ej5.c(o8i0.d(gyfVarM1), null, null, new fyf(gyfVarM1, str, null), 3);
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.y = eeVarRegisterForActivityResult;
        this.z = com.sporty.android.platform.features.newotp.agent.b.b(this, new ec2(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(966370181, new Function2() { // from class: rxf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                int i2 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uxf uxfVar = this.a;
                    uf00<UiText> uf00Var = ((dyf) wyh.c(uxfVar.m0().f, aVar, 0, 7).getValue()).a;
                    boolean zA = aVar.A(uxfVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new dd7(uxfVar, i2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(uxfVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new ed7(uxfVar, i2);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(uxfVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new sxf(uxfVar, i);
                        aVar.r(objY3);
                    }
                    cyf.a(uf00Var, function0, function1, (Function0) objY3, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        gyf gyfVarM0 = m0();
        ej5.c(o8i0.d(gyfVarM0), null, null, new eyf(gyfVarM0, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        t340 t340Var = m0().v;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new txf(viewLifecycleOwner, t340Var, null, this), 3);
        ((au7) this.w.getValue()).x1(j6c.ChangeVerifiedEmail);
    }
}
