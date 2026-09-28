package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Guideline;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgyd;", "Lg02;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gyd extends upl {
    public lvi f0;
    public final q8i0 g0;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return gyd.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return gyd.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return gyd.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public gyd() {
        super(0);
        this.g0 = new q8i0(jq40.a(iyd.class), new a(), new c(), new b());
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        lvi lviVar = this.f0;
        if (lviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = lviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        return null;
    }

    @Override // defpackage.s62
    public final k72 J0() {
        return (iyd) this.g0.getValue();
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        Context context = getContext();
        if (context != null) {
            lvi lviVar = this.f0;
            if (lviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lviVar.c.setImageResource(r0b.d(context) ? R.drawable.ic_kuda_full_dark : R.drawable.ic_kuda_full_light);
            lvi lviVar2 = this.f0;
            if (lviVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            lviVar2.y.setText(sn5.b(context, R.string.common_payment_providers__ng_deposit_with_kuda_sub_title__NG, new Object[0]));
            lvi lviVar3 = this.f0;
            if (lviVar3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView = lviVar3.e;
            j7g j7gVar = new j7g();
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content1__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__kuda_bank_app_or_website__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 13));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content3__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content4__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 13));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content5__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content6__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 13));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content7__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content8__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 13));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content9__NG, new Object[0]), sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content10__NG, new Object[0])}, new boolean[]{false, false}, zch0.b(context.getResources(), 13));
            j7gVar.a("\n");
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content11__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 13));
            j7gVar.m(new String[]{sn5.b(context, R.string.common_payment_providers__deposit_kuda_bank_app_content12__NG, new Object[0])}, new boolean[]{false}, zch0.b(context.getResources(), 13));
            appCompatTextView.setText(j7gVar);
        }
    }

    @Override // defpackage.g02
    public final m02 P0() {
        return (iyd) this.g0.getValue();
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
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.b;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_direct_bank_dedicated, viewGroup, false);
        int i = R.id.anti_interaction_mask;
        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
        if (frameLayout != null) {
            i = R.id.brand_logo_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.brand_logo_image_view, viewInflate);
            if (appCompatImageView != null) {
                i = R.id.description_list_view;
                SimpleDescriptionListView simpleDescriptionListView = (SimpleDescriptionListView) h5e.a(R.id.description_list_view, viewInflate);
                if (simpleDescriptionListView != null) {
                    i = R.id.details_text_view;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.details_text_view, viewInflate);
                    if (appCompatTextView != null) {
                        i = R.id.guideline_begin;
                        if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                            i = R.id.guideline_end;
                            if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                i = R.id.hint_view;
                                HintView hintView = (HintView) h5e.a(R.id.hint_view, viewInflate);
                                if (hintView != null) {
                                    i = R.id.init_failed_mask;
                                    LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                    if (loadingViewNew != null) {
                                        i = R.id.init_mask;
                                        ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                        if (composeView != null) {
                                            i = R.id.loading_mask;
                                            LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                            if (loadingViewNew2 != null) {
                                                i = R.id.title_text_view;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.title_text_view, viewInflate);
                                                if (appCompatTextView2 != null) {
                                                    FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                    this.f0 = new lvi(frameLayout2, frameLayout, appCompatImageView, simpleDescriptionListView, appCompatTextView, hintView, loadingViewNew, composeView, loadingViewNew2, appCompatTextView2);
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
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
    public final SimpleDescriptionListView t0() {
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.d;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.i;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.v;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.w;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final HintView D0() {
        lvi lviVar = this.f0;
        if (lviVar != null) {
            return lviVar.f;
        }
        Intrinsics.n(siPCzPFw.kaQN);
        throw null;
    }
}
