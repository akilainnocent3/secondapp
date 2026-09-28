package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.LoadingLayout;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk12;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class k12 extends aml {
    public uqm f;
    public i5s i;
    public LoadingLayout v;
    public final Handler w = new Handler(Looper.getMainLooper());

    public final void m0() {
        final LoadingLayout loadingLayout;
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (loadingLayout = (LoadingLayout) viewGroup.findViewById(R.id.common_loading_layout)) == null) {
            return;
        }
        this.w.postDelayed(new Runnable() { // from class: j12
            @Override // java.lang.Runnable
            public final void run() {
                loadingLayout.setVisibility(4);
            }
        }, 50L);
    }

    public final synchronized void n0(int i) {
        this.w.removeCallbacksAndMessages(null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        if (this.v == null) {
            View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.iwqk_layout_loading, viewGroup, false);
            viewInflate.getClass();
            LoadingLayout loadingLayout = (LoadingLayout) viewInflate;
            this.v = loadingLayout;
            viewGroup.addView(loadingLayout);
        }
        LoadingLayout loadingLayout2 = this.v;
        if (loadingLayout2 != null) {
            LoadingLayout loadingLayout3 = loadingLayout2.getVisibility() != 0 ? loadingLayout2 : null;
            if (loadingLayout3 != null) {
                ProgressBar progressBar = (ProgressBar) loadingLayout3.findViewById(R.id.lottie_view);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                progressBar.setAnimation(alphaAnimation);
                loadingLayout3.setVisibility(0);
            }
        }
    }
}
