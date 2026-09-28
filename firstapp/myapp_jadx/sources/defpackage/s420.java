package defpackage;

import android.graphics.Rect;
import androidx.compose.ui.window.PopupLayout;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class s420 extends t420 {
    @Override // defpackage.t420, defpackage.r420
    public final void a(PopupLayout popupLayout, int i, int i2) {
        popupLayout.setSystemGestureExclusionRects(b.l(new Rect(0, 0, i, i2)));
    }
}
