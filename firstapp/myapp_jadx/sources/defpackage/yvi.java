package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;

/* JADX INFO: loaded from: classes5.dex */
public final class yvi implements g6i0 {
    public final ConstraintLayout a;
    public final ActionBar b;
    public final RecyclerView c;
    public final CommonButton d;
    public final u4p e;
    public final Button f;
    public final ImageView i;
    public final Group v;
    public final ConstraintLayout w;
    public final TextView y;
    public final TextView z;

    public yvi(ConstraintLayout constraintLayout, ActionBar actionBar, RecyclerView recyclerView, CommonButton commonButton, u4p u4pVar, Button button, ImageView imageView, Group group, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = actionBar;
        this.c = recyclerView;
        this.d = commonButton;
        this.e = u4pVar;
        this.f = button;
        this.i = imageView;
        this.v = group;
        this.w = constraintLayout2;
        this.y = textView;
        this.z = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
