package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class g9h implements g6i0 {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final TextView c;
    public final View d;
    public final View e;
    public final View f;
    public final View i;

    public g9h(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, FloatingActionButton floatingActionButton, TextView textView, TextView textView2) {
        this.b = constraintLayout;
        this.d = appCompatButton;
        this.e = appCompatButton2;
        this.f = floatingActionButton;
        this.c = textView;
        this.i = textView2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public g9h(ConstraintLayout constraintLayout, ImageView imageView, ClearEditText clearEditText, TextView textView, ConstraintLayout constraintLayout2, ProgressButton progressButton) {
        this.b = constraintLayout;
        this.e = imageView;
        this.f = clearEditText;
        this.c = textView;
        this.d = constraintLayout2;
        this.i = progressButton;
    }
}
