package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.widget.NavigationBarLoadingView;

/* JADX INFO: loaded from: classes7.dex */
public final class cgd0 implements g6i0 {
    public final LinearLayout a;
    public final ImageButton b;
    public final NavigationBarLoadingView c;
    public final RecyclerView d;

    public cgd0(LinearLayout linearLayout, ImageButton imageButton, NavigationBarLoadingView navigationBarLoadingView, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = imageButton;
        this.c = navigationBarLoadingView;
        this.d = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
