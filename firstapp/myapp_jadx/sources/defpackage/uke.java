package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class uke implements g6i0 {
    public final ScrollView a;
    public final LinearLayout b;
    public final TextView c;
    public final RecyclerView d;
    public final EditText e;
    public final LinearLayout f;

    public uke(ScrollView scrollView, LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, EditText editText, LinearLayout linearLayout2) {
        this.a = scrollView;
        this.b = linearLayout;
        this.c = textView;
        this.d = recyclerView;
        this.e = editText;
        this.f = linearLayout2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
