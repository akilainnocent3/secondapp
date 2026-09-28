package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.widget.PanImageContainer;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class efm extends RecyclerView.s {
    public final /* synthetic */ dfm a;

    public efm(dfm dfmVar) {
        this.a = dfmVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        List<String> list = dfm.v2;
        final dfm dfmVar = this.a;
        final int iA = f7f.a(48.0f, dfmVar.requireContext());
        if (i2 > 0 && dfmVar.d1.getAlpha() != 0.0f && !dfmVar.i2) {
            dfmVar.i2 = true;
            dfmVar.d1.animate().setDuration(150L).alpha(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wem
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    List<String> list2 = dfm.v2;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    dfm dfmVar2 = dfmVar;
                    ViewGroup.LayoutParams layoutParams = dfmVar2.d1.getLayoutParams();
                    layoutParams.height = (int) ((1.0f - animatedFraction) * iA);
                    dfmVar2.d1.setLayoutParams(layoutParams);
                }
            }).withEndAction(new Runnable() { // from class: xem
                @Override // java.lang.Runnable
                public final void run() {
                    List<String> list2 = dfm.v2;
                    dfmVar.i2 = false;
                }
            });
        } else if (i2 <= 0 && dfmVar.d1.getAlpha() != 1.0f && !dfmVar.i2) {
            dfmVar.i2 = true;
            dfmVar.d1.animate().setDuration(150L).alpha(1.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yem
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    List<String> list2 = dfm.v2;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    dfm dfmVar2 = dfmVar;
                    ViewGroup.LayoutParams layoutParams = dfmVar2.d1.getLayoutParams();
                    layoutParams.height = (int) (iA * animatedFraction);
                    dfmVar2.d1.setLayoutParams(layoutParams);
                }
            }).withEndAction(new Runnable() { // from class: zem
                @Override // java.lang.Runnable
                public final void run() {
                    List<String> list2 = dfm.v2;
                    dfmVar.i2 = false;
                }
            });
        }
        if (i2 == 0) {
            dfmVar.i1.postInvalidateDelayed(100L);
        }
        dfm.f fVar = dfmVar.u0;
        PanImageContainer panImageContainer = dfmVar.t0;
        if (panImageContainer != null) {
            panImageContainer.setAlpha(0.5f);
            dfmVar.t0.removeCallbacks(fVar);
            dfmVar.t0.postDelayed(fVar, 500L);
        }
        dfmVar.o0();
    }
}
