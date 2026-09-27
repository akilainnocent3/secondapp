package yads;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wo3 {
    public static Rect a(View view) {
        Rect rect = new Rect();
        try {
            view.getWindowVisibleDisplayFrame(rect);
        } catch (NullPointerException unused) {
        }
        int[] iArr = {i, i};
        view.getRootView().getLocationOnScreen(iArr);
        int i10 = -iArr[0];
        int i11 = -iArr[1];
        rect.offset(i10, i11);
        return rect;
    }
}
