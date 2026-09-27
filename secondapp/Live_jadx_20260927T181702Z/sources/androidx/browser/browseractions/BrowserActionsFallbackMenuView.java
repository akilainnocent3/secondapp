package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import k.y0;
import x.a;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7504c;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7503b = getResources().getDimensionPixelOffset(a.b.f143966b);
        this.f7504c = getResources().getDimensionPixelOffset(a.b.f143965a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f7503b * 2), this.f7504c), 1073741824), i11);
    }
}
