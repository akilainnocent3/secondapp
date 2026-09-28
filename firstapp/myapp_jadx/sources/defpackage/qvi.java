package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.PasswordEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes5.dex */
public final class qvi implements g6i0 {
    public final ProgressButton A;
    public final ClearEditText B;
    public final PasswordEditText C;
    public final TextView D;
    public final TextView E;
    public final ScrollView a;
    public final ComposeView b;
    public final ImageButton c;
    public final ComposeView d;
    public final TextView e;
    public final ImageButton f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public qvi(ScrollView scrollView, ComposeView composeView, ImageButton imageButton, ComposeView composeView2, TextView textView, ImageButton imageButton2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ProgressButton progressButton, ClearEditText clearEditText, PasswordEditText passwordEditText, TextView textView7, TextView textView8) {
        this.a = scrollView;
        this.b = composeView;
        this.c = imageButton;
        this.d = composeView2;
        this.e = textView;
        this.f = imageButton2;
        this.i = textView2;
        this.v = textView3;
        this.w = textView4;
        this.y = textView5;
        this.z = textView6;
        this.A = progressButton;
        this.B = clearEditText;
        this.C = passwordEditText;
        this.D = textView7;
        this.E = textView8;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
