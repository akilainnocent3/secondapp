package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
class GuidedActionItemContainer extends h1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12089f;

    public GuidedActionItemContainer(Context context) {
        this(context, null);
    }

    public void c(boolean z10) {
        this.f12089f = z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        if (this.f12089f || !c3.a(this, view)) {
            return super.focusSearch(view, i10);
        }
        View viewFocusSearch = super.focusSearch(view, i10);
        if (c3.a(this, viewFocusSearch)) {
            return viewFocusSearch;
        }
        return null;
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12089f = true;
    }
}
