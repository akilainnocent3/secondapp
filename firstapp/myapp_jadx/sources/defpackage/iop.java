package defpackage;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class iop implements TextView.OnEditorActionListener {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ iop(Function1 function1, EditText editText) {
        this.a = function1;
        this.b = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.a.invoke(this.b.getText().toString());
        return false;
    }
}
