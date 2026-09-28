package defpackage;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.bookingcode.presentation.activity.PreviewCodeActivity;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class jq20 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ PreviewCodeActivity a;

    public jq20(PreviewCodeActivity previewCodeActivity) {
        this.a = previewCodeActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = PreviewCodeActivity.A;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        PreviewCodeActivity previewCodeActivity = this.a;
        previewCodeActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = (int) (((double) displayMetrics.heightPixels) * 0.65d);
        if (previewCodeActivity.f.getHeight() > i2) {
            ScrollView scrollView = (ScrollView) previewCodeActivity.findViewById(R.id.preview_scroll);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scrollView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).height = i2;
            scrollView.setLayoutParams(layoutParams);
        }
        previewCodeActivity.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
