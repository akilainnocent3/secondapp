package androidx.leanback.widget;

import android.view.KeyEvent;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface t0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean a(EditText editText, int i10, KeyEvent keyEvent);
    }

    void setImeKeyListener(a aVar);
}
