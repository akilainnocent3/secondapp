package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.AuthNavigatorImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Ltzf;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "<init>", "()V", "Lnzf;", "state", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tzf extends rql implements k9j {
    public final q8i0 f;
    public azm i;
    public AuthNavigatorImpl v;
    public ee<OtpModule<OtpData.EmailChange>> w;

    public static final /* synthetic */ class a extends saj implements Function1<uwz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(uwz uwzVar) {
            Object value;
            nzf nzfVar;
            Object value2;
            ijf0 ijf0Var;
            Object value3;
            Object value4;
            Object value5;
            uwz uwzVar2 = uwzVar;
            uwzVar2.getClass();
            a0g a0gVar = (a0g) this.receiver;
            a0gVar.getClass();
            wwd0 wwd0Var = a0gVar.i;
            nzf nzfVar2 = (nzf) wwd0Var.getValue();
            if (uwzVar2 instanceof uwz.c) {
                do {
                    value2 = wwd0Var.getValue();
                    ijf0Var = ((uwz.c) uwzVar2).a;
                } while (!wwd0Var.g(value2, nzf.a((nzf) value2, ijf0Var, null, null, null, false, 30)));
                if (ijf0Var.a.b.length() == 0) {
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, nzf.a((nzf) value5, null, null, vch0.a, uxs.DISABLE, false, 19)));
                } else if (ijf0Var.equals(nzfVar2.b) && nzfVar2.f) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, nzf.a((nzf) value4, null, null, null, uxs.DISABLE, false, 23)));
                } else {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, nzf.a((nzf) value3, null, new ijf0((String) null, 0L, 7), vch0.a, uxs.ENABLE, false, 17)));
                }
            } else if (uwzVar2.equals(uwz.a.a)) {
                ej5.c(o8i0.d(a0gVar), null, null, new zzf(a0gVar, null), 3);
            } else if (uwzVar2.equals(uwz.b.a)) {
                ej5.c(o8i0.d(a0gVar), a0gVar.d, null, new yzf(a0gVar, null), 2);
            } else {
                if (!uwzVar2.equals(uwz.d.a)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                    nzfVar = (nzf) value;
                } while (!wwd0Var.g(value, nzf.a(nzfVar, null, null, null, null, !nzfVar.e, 15)));
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return tzf.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? tzf.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public tzf() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.f = new q8i0(jq40.a(a0g.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(457466756, new Function2() { // from class: qzf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                tzf tzfVar = this.a;
                q8i0 q8i0Var = tzfVar.f;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(((a0g) q8i0Var.getValue()).v, aVar, 0, 7);
                    ijf0 ijf0Var = ((nzf) ytwVarC.getValue()).a;
                    uxs uxsVar = ((nzf) ytwVarC.getValue()).d;
                    boolean z = ((nzf) ytwVarC.getValue()).f;
                    boolean z2 = ((nzf) ytwVarC.getValue()).e;
                    UiText uiText = ((nzf) ytwVarC.getValue()).c;
                    a0g a0gVar = (a0g) q8i0Var.getValue();
                    boolean zA = aVar.A(a0gVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        tzf.a aVar2 = new tzf.a(1, a0gVar, a0g.class, "handleAction", "handleAction(Lcom/sporty/android/compose/ui/password/PasswordVerificationAction;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    boolean zA2 = aVar.A(tzfVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new zdb(tzfVar, i);
                        aVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA3 = aVar.A(tzfVar);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new aeb(tzfVar, i);
                        aVar.r(objY3);
                    }
                    xzf.a(ijf0Var, uxsVar, z, uiText, z2, function1, function0, (Function0) objY3, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.w = com.sporty.android.platform.features.newotp.agent.b.b(this, new Function1() { // from class: rzf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OtpData.EmailChange emailChange = (OtpData.EmailChange) obj;
                emailChange.getClass();
                OTPResult<OTPGeneralResult> oTPResult = emailChange.e;
                if (oTPResult instanceof OTPResult.Success) {
                    a0g a0gVar = (a0g) this.a.f.getValue();
                    String token = ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken();
                    token.getClass();
                    a0gVar.w.a(new vzf.a(token));
                }
                return Unit.a;
            }
        });
        t340 t340Var = ((a0g) this.f.getValue()).y;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new szf(viewLifecycleOwner, t340Var, null, this), 3);
    }
}
