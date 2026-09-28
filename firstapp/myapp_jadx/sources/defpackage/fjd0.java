package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.prematch.widget.PreMatchFiltersContainer;
import com.sportybet.plugin.realsports.widget.PreMatchSpinnerTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class fjd0 implements g6i0 {
    public final PreMatchFiltersContainer a;
    public final PreMatchSpinnerTextView b;
    public final PreMatchSpinnerTextView c;
    public final PreMatchSpinnerTextView d;
    public final PreMatchSpinnerTextView e;

    public fjd0(PreMatchFiltersContainer preMatchFiltersContainer, PreMatchSpinnerTextView preMatchSpinnerTextView, PreMatchSpinnerTextView preMatchSpinnerTextView2, PreMatchSpinnerTextView preMatchSpinnerTextView3, PreMatchSpinnerTextView preMatchSpinnerTextView4) {
        this.a = preMatchFiltersContainer;
        this.b = preMatchSpinnerTextView;
        this.c = preMatchSpinnerTextView2;
        this.d = preMatchSpinnerTextView3;
        this.e = preMatchSpinnerTextView4;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
