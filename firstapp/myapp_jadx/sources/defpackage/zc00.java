package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sportybet.feature.payment.impl.deposit.presentation.model.PendingRequestParam;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lzc00;", "Lcom/google/android/material/bottomsheet/c;", "Lfe00;", "<init>", "()V", "Lbd00;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zc00 extends hzl implements fe00 {
    public ge00 A;
    public final q8i0 f;
    public com.sporty.android.common.uievent.e i;
    public azm v;
    public d900 w;
    public ComposeView y;
    public final ee<String> z;

    public static final /* synthetic */ class a extends saj implements Function1<ac00, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ac00 ac00Var) {
            String str;
            ac00 ac00Var2 = ac00Var;
            ac00Var2.getClass();
            hd00 hd00Var = (hd00) this.receiver;
            ku90<cd00> ku90Var = hd00Var.i;
            String str2 = null;
            if (ac00Var2.equals(ac00.c.a)) {
                PendingRequestParam pendingRequestParam = hd00Var.b;
                if (pendingRequestParam != null && (str = pendingRequestParam.a) != null && !StringsKt.U(str)) {
                    str2 = str;
                }
                ku90Var.a(new cd00.b(str2));
            } else if (ac00Var2.equals(ac00.b.a)) {
                ej5.c(o8i0.d(hd00Var), null, null, new gd00(hd00Var, null), 3);
            } else {
                if (!ac00Var2.equals(ac00.a.a)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(cd00.a.a);
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
            return zc00.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zc00.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public zc00() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.f = new q8i0(jq40.a(hd00.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ee<String> eeVarRegisterForActivityResult = registerForActivityResult(new be(), new ud() { // from class: vc00
            @Override // defpackage.ud
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ge00 ge00Var = this.a.A;
                if (ge00Var != null) {
                    ge00Var.a(bool.booleanValue());
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.z = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.z;
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.A = ge00Var;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeViewA = mla.a(contextRequireContext, new op8(1692688272, new lm3(this, 2), true));
        this.y = composeViewA;
        return composeViewA;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.sporty.android.common.uievent.e eVar = this.i;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hd00 hd00Var = (hd00) this.f.getValue();
        jvd0 jvd0Var = hd00Var.w;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        hd00Var.w = ej5.c(o8i0.d(hd00Var), null, null, new ed00(hd00Var, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        Dialog dialog2 = getDialog();
        com.google.android.material.bottomsheet.b bVar = dialog2 instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog2 : null;
        if (bVar != null && (viewFindViewById = bVar.findViewById(com.sportybet.android.gp.tz.R.id.design_bottom_sheet)) != null) {
            viewFindViewById.setBackgroundResource(R.color.transparent);
        }
        q8i0 q8i0Var = this.f;
        g1i g1iVar = new g1i(((hd00) q8i0Var.getValue()).f, new xc00(this, null));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        s9s.b bVar2 = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar2);
        g1i g1iVar2 = new g1i(((hd00) q8i0Var.getValue()).v, new yc00(this, null));
        s9s lifecycle2 = getViewLifecycleOwner().getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar2);
    }
}
