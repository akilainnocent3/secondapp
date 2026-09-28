package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes7.dex */
public final class tke {
    public static final Window a(a aVar) {
        ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
        if (parent != null) {
            eme emeVar = parent instanceof eme ? (eme) parent : null;
            if (emeVar != null) {
                return emeVar.getWindow();
            }
        }
        return null;
    }
}
