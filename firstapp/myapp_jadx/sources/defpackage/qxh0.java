package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CommonTitleBar;
import com.sportybet.android.widget.LoadingView;

/* JADX INFO: loaded from: classes5.dex */
public final class qxh0 implements g6i0 {
    public final ConstraintLayout a;
    public final CommonTitleBar b;
    public final TextView c;
    public final Group d;
    public final ImageView e;
    public final LoadingView f;
    public final RecyclerView i;

    public qxh0(ConstraintLayout constraintLayout, CommonTitleBar commonTitleBar, TextView textView, Group group, ImageView imageView, LoadingView loadingView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = commonTitleBar;
        this.c = textView;
        this.d = group;
        this.e = imageView;
        this.f = loadingView;
        this.i = recyclerView;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
