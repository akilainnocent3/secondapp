package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class cf implements g6i0 {
    public final LinearLayout a;
    public final ImageButton b;
    public final ProgressButton c;
    public final RecyclerView d;
    public final ClearEditText e;
    public final Group f;

    public cf(LinearLayout linearLayout, ImageButton imageButton, ProgressButton progressButton, RecyclerView recyclerView, ClearEditText clearEditText, Group group) {
        this.a = linearLayout;
        this.b = imageButton;
        this.c = progressButton;
        this.d = recyclerView;
        this.e = clearEditText;
        this.f = group;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
