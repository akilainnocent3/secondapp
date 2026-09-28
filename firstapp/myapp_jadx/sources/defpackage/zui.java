package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.widgets.SpecificCountryMobileEditText;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes4.dex */
public final class zui implements g6i0 {
    public final FrameLayout a;
    public final ProgressButton b;
    public final AppCompatImageView c;
    public final View d;
    public final TextView e;
    public final AppCompatImageView f;
    public final SpecificCountryMobileEditText i;
    public final ScrollView v;
    public final ComposeView w;
    public final LinearLayout y;

    public zui(FrameLayout frameLayout, ProgressButton progressButton, AppCompatImageView appCompatImageView, View view, TextView textView, AppCompatImageView appCompatImageView2, SpecificCountryMobileEditText specificCountryMobileEditText, ScrollView scrollView, ComposeView composeView, LinearLayout linearLayout) {
        this.a = frameLayout;
        this.b = progressButton;
        this.c = appCompatImageView;
        this.d = view;
        this.e = textView;
        this.f = appCompatImageView2;
        this.i = specificCountryMobileEditText;
        this.v = scrollView;
        this.w = composeView;
        this.y = linearLayout;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
