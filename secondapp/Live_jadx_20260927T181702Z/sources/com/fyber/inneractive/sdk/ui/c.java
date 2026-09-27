package com.fyber.inneractive.sdk.ui;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f47825a;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f47825a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f47825a;
        fyberAdIdentifierLocal.f47803q = this.f47825a.f47800n.getWidth() + fyberAdIdentifierLocal.f47800n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f47825a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal2.f47821k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal2.f47803q *= -1.0f;
        }
        fyberAdIdentifierLocal2.f47800n.setTranslationX(fyberAdIdentifierLocal2.f47803q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal3 = this.f47825a;
        if (fyberAdIdentifierLocal3.f47801o) {
            fyberAdIdentifierLocal3.a();
        }
    }
}
