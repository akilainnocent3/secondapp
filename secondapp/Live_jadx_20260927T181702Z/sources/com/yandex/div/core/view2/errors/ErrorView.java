package com.yandex.div.core.view2.errors;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.s0;
import com.yandex.div.R;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorView implements Disposable {

    @m
    private ViewGroup counterView;

    @m
    private DetailsViewGroup detailsView;

    @l
    private final ErrorModel errorModel;

    @l
    private final Disposable modelObservation;

    @l
    private final ViewGroup root;
    private final boolean showPermanently;

    @l
    private final DivTypefaceProvider typefaceProvider;

    @m
    private ErrorViewModel viewModel;

    public ErrorView(@l ViewGroup viewGroup, @l ErrorModel errorModel, @l DivTypefaceProvider divTypefaceProvider, boolean z10) {
        this.root = viewGroup;
        this.errorModel = errorModel;
        this.typefaceProvider = divTypefaceProvider;
        this.showPermanently = z10;
        this.modelObservation = errorModel.observeAndGet(new ErrorView$modelObservation$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewModel(ErrorViewModel errorViewModel) {
        updateView(this.viewModel, errorViewModel);
        this.viewModel = errorViewModel;
    }

    private final void tryAddCounterView() {
        if (this.counterView != null) {
            return;
        }
        s0 s0Var = new s0(this.root.getContext());
        s0Var.setBackgroundResource(R.drawable.error_counter_background);
        s0Var.setTextSize(12.0f);
        s0Var.setTextColor(-16777216);
        s0Var.setGravity(17);
        s0Var.setElevation(s0Var.getResources().getDimension(R.dimen.div_shadow_elevation));
        s0Var.setTypeface(this.typefaceProvider.getRegular());
        s0Var.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.core.view2.errors.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ErrorView.tryAddCounterView$lambda$5$lambda$4(this.f76648b, view);
            }
        });
        DisplayMetrics displayMetrics = this.root.getContext().getResources().getDisplayMetrics();
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(24, displayMetrics);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iDpToPx, iDpToPx);
        int iDpToPx2 = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        marginLayoutParams.topMargin = iDpToPx2;
        marginLayoutParams.leftMargin = iDpToPx2;
        marginLayoutParams.rightMargin = iDpToPx2;
        marginLayoutParams.bottomMargin = iDpToPx2;
        FrameContainerLayout frameContainerLayout = new FrameContainerLayout(this.root.getContext(), null, 0, 6, null);
        frameContainerLayout.addView(s0Var, marginLayoutParams);
        this.root.addView(frameContainerLayout, -1, -1);
        this.counterView = frameContainerLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryAddCounterView$lambda$5$lambda$4(ErrorView errorView, View view) {
        errorView.errorModel.onCounterClick(errorView.root.getWidth(), errorView.root.getHeight());
    }

    private final void tryAddDetailsView() {
        if (this.detailsView != null) {
            return;
        }
        DetailsViewGroup detailsViewGroup = new DetailsViewGroup(this.root.getContext(), this.errorModel.getErrorHandler(), new ErrorView$tryAddDetailsView$view$1(this), new ErrorView$tryAddDetailsView$view$2(this));
        this.root.addView(detailsViewGroup, new ViewGroup.LayoutParams(-1, -1));
        this.detailsView = detailsViewGroup;
    }

    private final void updateView(ErrorViewModel errorViewModel, ErrorViewModel errorViewModel2) {
        if (errorViewModel == null || errorViewModel2 == null || errorViewModel.getShowDetails() != errorViewModel2.getShowDetails()) {
            ViewGroup viewGroup = this.counterView;
            if (viewGroup != null) {
                this.root.removeView(viewGroup);
            }
            this.counterView = null;
            DetailsViewGroup detailsViewGroup = this.detailsView;
            if (detailsViewGroup != null) {
                this.root.removeView(detailsViewGroup);
            }
            this.detailsView = null;
        }
        if (errorViewModel2 == null) {
            return;
        }
        if (errorViewModel2.getShowDetails()) {
            tryAddDetailsView();
            DetailsViewGroup detailsViewGroup2 = this.detailsView;
            if (detailsViewGroup2 != null) {
                detailsViewGroup2.setText(errorViewModel2.getDetails());
            }
            DetailsViewGroup detailsViewGroup3 = this.detailsView;
            if (detailsViewGroup3 != null) {
                detailsViewGroup3.updateVariables(this.errorModel.getAllControllers());
                return;
            }
            return;
        }
        if (errorViewModel2.getCounterText().length() <= 0 && !this.showPermanently) {
            ViewGroup viewGroup2 = this.counterView;
            if (viewGroup2 != null) {
                this.root.removeView(viewGroup2);
            }
            this.counterView = null;
        } else {
            tryAddCounterView();
        }
        ViewGroup viewGroup3 = this.counterView;
        View childAt = viewGroup3 != null ? viewGroup3.getChildAt(0) : null;
        s0 s0Var = childAt instanceof s0 ? (s0) childAt : null;
        if (s0Var != null) {
            s0Var.setText(errorViewModel2.getCounterText());
            s0Var.setBackgroundResource(errorViewModel2.getCounterBackground());
        }
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.modelObservation.close();
        this.root.removeView(this.counterView);
        this.root.removeView(this.detailsView);
    }
}
