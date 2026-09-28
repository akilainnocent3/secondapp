package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;

/* JADX INFO: loaded from: classes.dex */
public final class kts implements g6i0 {
    public final LiveTogglesContainer a;
    public final TextView b;
    public final LinearLayout c;
    public final TextView d;
    public final AppCompatCheckBox e;
    public final Space f;

    public kts(LiveTogglesContainer liveTogglesContainer, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, AppCompatCheckBox appCompatCheckBox, Space space) {
        this.a = liveTogglesContainer;
        this.b = textView;
        this.c = linearLayout2;
        this.d = textView2;
        this.e = appCompatCheckBox;
        this.f = space;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
