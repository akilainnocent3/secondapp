package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ty7 implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.getClass();
        lop.b(textView, Boolean.FALSE);
        return true;
    }
}
