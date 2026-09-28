package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class od implements g6i0 {
    public final ConstraintLayout a;
    public final LoadingView b;
    public final AppCompatImageView c;
    public final ConstraintLayout d;
    public final AppCompatTextView e;
    public final RecyclerView f;

    public od(ConstraintLayout constraintLayout, LoadingView loadingView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = loadingView;
        this.c = appCompatImageView;
        this.d = constraintLayout2;
        this.e = appCompatTextView;
        this.f = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
