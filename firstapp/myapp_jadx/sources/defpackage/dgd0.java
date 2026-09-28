package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.results.ResultsLoadingView;

/* JADX INFO: loaded from: classes4.dex */
public final class dgd0 implements g6i0 {
    public final TextView A;
    public final RelativeLayout a;
    public final Space b;
    public final ImageButton c;
    public final TextView d;
    public final ImageButton e;
    public final ImageView f;
    public final ImageView i;
    public final TextView v;
    public final ResultsLoadingView w;
    public final RecyclerView y;
    public final ImageButton z;

    public dgd0(RelativeLayout relativeLayout, Space space, ImageButton imageButton, TextView textView, ImageButton imageButton2, ImageView imageView, ImageView imageView2, TextView textView2, ResultsLoadingView resultsLoadingView, RecyclerView recyclerView, ImageButton imageButton3, TextView textView3) {
        this.a = relativeLayout;
        this.b = space;
        this.c = imageButton;
        this.d = textView;
        this.e = imageButton2;
        this.f = imageView;
        this.i = imageView2;
        this.v = textView2;
        this.w = resultsLoadingView;
        this.y = recyclerView;
        this.z = imageButton3;
        this.A = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
