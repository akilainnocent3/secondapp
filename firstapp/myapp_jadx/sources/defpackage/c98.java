package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class c98 extends s2 {
    public final r88 a;
    public final whd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c98(ViewGroup viewGroup, r88 r88Var) {
        super(viewGroup, R.layout.spr_highlight_loading);
        r88Var.getClass();
        this.a = r88Var;
        View view = this.itemView;
        if (view == null) {
            bmy.a("rootView");
            throw null;
        }
        LoadingView loadingView = (LoadingView) view;
        this.b = new whd0(loadingView, loadingView);
        ViewGroup.LayoutParams layoutParams = loadingView.getProgressView().getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = loadingView.getContext();
        context.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = zch0.b(context.getResources(), 32);
        Context context2 = loadingView.getContext();
        context2.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = zch0.b(context2.getResources(), 720);
        layoutParams2.t = 0;
        layoutParams2.v = 0;
        layoutParams2.i = 0;
        layoutParams2.l = 0;
        loadingView.getEmptyView().setTextColor(-16777216);
        loadingView.getErrorView().getTitle().setTextColor(-16777216);
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: b98
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c98 c98Var = this.a;
                r88 r88Var2 = c98Var.a;
                int bindingAdapterPosition = c98Var.getBindingAdapterPosition();
                s88 s88Var = r88Var2.a;
                s88Var.D = 0;
                s88Var.j(bindingAdapterPosition);
                s88Var.m(0);
            }
        });
    }

    @Override // defpackage.s2
    public final void a(int i) {
        int i2 = this.a.a.D;
        whd0 whd0Var = this.b;
        if (i2 == 0) {
            whd0Var.b.K();
        } else {
            if (i2 != 2) {
                return;
            }
            LoadingView loadingView = whd0Var.b;
            Context context = whd0Var.a.getContext();
            context.getClass();
            loadingView.J(sn5.b(context, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
        }
    }

    @Override // defpackage.s2
    public final void b() {
    }
}
