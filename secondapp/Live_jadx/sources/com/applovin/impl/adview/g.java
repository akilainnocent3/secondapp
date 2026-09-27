package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f26517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26518b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f26517a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f26517a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f26517a.getLayoutParams();
        removeView(this.f26517a);
        e eVarA = e.a(aVar, getContext());
        this.f26517a = eVarA;
        addView(eVarA);
        this.f26517a.setLayoutParams(layoutParams);
        this.f26517a.a(this.f26518b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f26518b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f26517a.setLayoutParams(layoutParams2);
        this.f26517a.a(i10);
    }
}
