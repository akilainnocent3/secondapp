package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
class GuidedStepRootLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11131c;

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11130b = false;
        this.f11131c = false;
    }

    public void a(boolean z10) {
        this.f11131c = z10;
    }

    public void b(boolean z10) {
        this.f11130b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0027 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r4.f11130b != false) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r5, int r6) {
        /*
            r4 = this;
            android.view.View r0 = super.focusSearch(r5, r6)
            r1 = 66
            r2 = 17
            if (r6 == r2) goto Lc
            if (r6 != r1) goto L28
        Lc:
            boolean r3 = androidx.leanback.widget.c3.a(r4, r0)
            if (r3 == 0) goto L13
            goto L28
        L13:
            int r3 = r4.getLayoutDirection()
            if (r3 != 0) goto L1c
            if (r6 != r2) goto L23
            goto L1e
        L1c:
            if (r6 != r1) goto L23
        L1e:
            boolean r6 = r4.f11130b
            if (r6 != 0) goto L28
            goto L27
        L23:
            boolean r6 = r4.f11131c
            if (r6 != 0) goto L28
        L27:
            return r5
        L28:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.app.GuidedStepRootLayout.focusSearch(android.view.View, int):android.view.View");
    }

    public GuidedStepRootLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11130b = false;
        this.f11131c = false;
    }
}
