package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h5i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        rtw<View, Rect> rtwVar = i5i.d;
        Rect rectD = rtwVar.d(view);
        rectD.getClass();
        Rect rect = rectD;
        Rect rectD2 = rtwVar.d(view2);
        rectD2.getClass();
        Rect rect2 = rectD2;
        int i = rect.left - rect2.left;
        return i == 0 ? (rect.right - rect2.right) * i5i.c : i * i5i.c;
    }
}
