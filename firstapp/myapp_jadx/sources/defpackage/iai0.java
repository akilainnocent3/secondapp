package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class iai0 {
    public static void a(View view) {
        try {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q("ViewUtils");
            aVar.f(e, "Child view fails to remove itself from parent ", new Object[0]);
        }
    }
}
