package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;

/* JADX INFO: loaded from: classes5.dex */
public final class txw implements g6i0 {
    public final QuickAddStakeItem a;
    public final View b;
    public final EditText c;
    public final TextView d;
    public final TextView e;

    public txw(QuickAddStakeItem quickAddStakeItem, View view, TextView textView, EditText editText, TextView textView2, TextView textView3) {
        this.a = quickAddStakeItem;
        this.b = view;
        this.c = editText;
        this.d = textView2;
        this.e = textView3;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
