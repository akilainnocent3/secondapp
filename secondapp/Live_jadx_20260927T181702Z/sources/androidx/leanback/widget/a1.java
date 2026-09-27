package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a1 extends androidx.appcompat.app.z {
    @Override // androidx.appcompat.app.z
    public View q(Context context, String str, AttributeSet attributeSet) {
        str.getClass();
        if (str.equals("androidx.leanback.widget.GuidedActionEditText")) {
            return new m0(context, attributeSet);
        }
        return null;
    }
}
