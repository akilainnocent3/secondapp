package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lijj0;", "Lj82;", "<init>", "()V", "", "Laoe0$a;", "banks", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ijj0 extends u7m {
    public final q8i0 a0;
    public final q8i0 b0;
    public xyi c0;
    public final q8i0 d0;

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ijj0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ijj0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ijj0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ijj0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ijj0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ijj0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ijj0.this;
        }
    }

    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
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

    public static final class k extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ijj0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ijj0() {
        super(R.layout.fragment_withdraw_bank_v2);
        this.Y = false;
        this.Z = false;
        this.a0 = new q8i0(jq40.a(mjj0.class), new a(), new c(), new b());
        this.b0 = new q8i0(jq40.a(au7.class), new d(), new f(), new e());
        ttr ttrVarA = hwr.a(a1s.c, new h(new g()));
        this.d0 = new q8i0(jq40.a(gme0.class), new i(ttrVarA), new k(ttrVarA), new j(ttrVarA));
    }

    @Override // defpackage.s62
    public final HintView D0() {
        return null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        xyi xyiVar = this.c0;
        if (xyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = xyiVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        return null;
    }

    @Override // defpackage.j82, defpackage.s62
    public final void L0() {
        super.L0();
        xyi xyiVar = this.c0;
        if (xyiVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(xyiVar.d);
        i();
        xyi xyiVar2 = this.c0;
        if (xyiVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = xyiVar2.f;
        op8 op8Var = new op8(968114295, new Function2() { // from class: sij0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1489649422, new b2u(this.a, mr10.c(new vkx[0], aVar)), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true);
        composeView.setViewCompositionStrategy(u6i0.b.a);
        composeView.setContent(op8Var);
    }

    @Override // defpackage.j82
    public final TextView O0() {
        return null;
    }

    @Override // defpackage.j82
    public final TextView P0() {
        return null;
    }

    @Override // defpackage.j82
    public final TextView Q0() {
        return null;
    }

    @Override // defpackage.j82
    public final View R0() {
        return null;
    }

    @Override // defpackage.j82
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final mjj0 P0() {
        return (mjj0) this.a0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        xyi xyiVar = this.c0;
        if (xyiVar != null) {
            return xyiVar.b;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_withdraw_bank_v2, viewGroup, false);
        int i2 = R.id.anti_interaction_mask;
        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
        if (frameLayout != null) {
            i2 = R.id.img_icon;
            if (((ImageView) h5e.a(R.id.img_icon, viewInflate)) != null) {
                i2 = R.id.init_failed_mask;
                LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                if (loadingViewNew != null) {
                    i2 = R.id.init_mask;
                    ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                    if (composeView != null) {
                        i2 = R.id.loading_mask;
                        LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                        if (loadingViewNew2 != null) {
                            i2 = R.id.main_container;
                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.main_container, viewInflate);
                            if (composeView2 != null) {
                                i2 = R.id.protection_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.protection_container, viewInflate);
                                if (constraintLayout != null) {
                                    i2 = R.id.tv_dialog_description;
                                    if (((TextView) h5e.a(R.id.tv_dialog_description, viewInflate)) != null) {
                                        i2 = R.id.tv_dialog_title;
                                        if (((TextView) h5e.a(R.id.tv_dialog_title, viewInflate)) != null) {
                                            this.c0 = new xyi((FrameLayout) viewInflate, frameLayout, loadingViewNew, composeView, loadingViewNew2, composeView2, constraintLayout);
                                            ((au7) this.b0.getValue()).x1(j6c.WITHDRAW);
                                            xyi xyiVar = this.c0;
                                            if (xyiVar == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            FrameLayout frameLayout2 = xyiVar.a;
                                            frameLayout2.getClass();
                                            return frameLayout2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final AspectRatioImageView r0() {
        return null;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        return null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        xyi xyiVar = this.c0;
        if (xyiVar != null) {
            return xyiVar.c;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        xyi xyiVar = this.c0;
        if (xyiVar != null) {
            return xyiVar.d;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        xyi xyiVar = this.c0;
        if (xyiVar != null) {
            return xyiVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
