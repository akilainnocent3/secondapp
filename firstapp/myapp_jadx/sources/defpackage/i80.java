package defpackage;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class i80 {
    public static int[] a(qkf0 qkf0Var, RectF rectF, int i, final d90 d90Var) {
        return qkf0Var.f.getRangeForRect(rectF, i == 1 ? new hm0(new nuj0(qkf0Var.f.getText(), qkf0Var.j())) : new GraphemeClusterSegmentFinder(qkf0Var.f.getText(), qkf0Var.a), new Layout.TextInclusionStrategy() { // from class: h80
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) d90Var.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }
}
