package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.plugin.realsports.betsucc.presentation.fragment.BetSuccessfulPageFragment;

/* JADX INFO: loaded from: classes7.dex */
public final class mc3 extends ViewPager2.g {
    public final /* synthetic */ BetSuccessfulPageFragment a;

    public mc3(BetSuccessfulPageFragment betSuccessfulPageFragment) {
        this.a = betSuccessfulPageFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(float f, int i, int i2) {
        if (i2 != 0) {
            return;
        }
        BetSuccessfulPageFragment betSuccessfulPageFragment = this.a;
        if (betSuccessfulPageFragment.W.getItemCount() <= 1) {
            return;
        }
        if (i == 0) {
            betSuccessfulPageFragment.H.a0.setCurrentItem(betSuccessfulPageFragment.W.getItemCount() - 2, false);
        } else if (i == betSuccessfulPageFragment.W.getItemCount() - 1) {
            betSuccessfulPageFragment.H.a0.setCurrentItem(1, false);
        }
    }
}
