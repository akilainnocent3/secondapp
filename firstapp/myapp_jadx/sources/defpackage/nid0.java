package defpackage;

import android.view.View;
import android.widget.TextView;
import com.sportybet.android.multimaker.presentation.widget.view.MultiMakerOddsHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public final class nid0 implements g6i0 {
    public final MultiMakerOddsHeaderView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public nid0(MultiMakerOddsHeaderView multiMakerOddsHeaderView, TextView textView, TextView textView2, TextView textView3) {
        this.a = multiMakerOddsHeaderView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
