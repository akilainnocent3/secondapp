package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class v4p implements g6i0 {
    public final RelativeLayout a;
    public final TextView b;
    public final View c;

    public v4p(RelativeLayout relativeLayout, TextView textView, View view) {
        this.a = relativeLayout;
        this.b = textView;
        this.c = view;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
