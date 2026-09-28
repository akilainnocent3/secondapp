package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.results.ResultsClearEditText;
import com.sportybet.plugin.realsports.results.ResultsLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class egd0 implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final ResultsClearEditText c;
    public final TextView d;
    public final ImageButton e;
    public final ResultsLoadingView f;
    public final RecyclerView i;
    public final RelativeLayout v;

    public egd0(RelativeLayout relativeLayout, TextView textView, ResultsClearEditText resultsClearEditText, TextView textView2, ImageButton imageButton, ResultsLoadingView resultsLoadingView, RecyclerView recyclerView, RelativeLayout relativeLayout2) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = resultsClearEditText;
        this.d = textView2;
        this.e = imageButton;
        this.f = resultsLoadingView;
        this.i = recyclerView;
        this.v = relativeLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
