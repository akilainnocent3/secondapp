package com.fyber.inneractive.sdk.interfaces;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface e {
    void destroy();

    void disableCloseButton();

    void dismissAd(boolean z10);

    View getCloseButton();

    ViewGroup getLayout();

    boolean isCloseButtonDisplay();

    void secondEndCardWasDisplayed();

    void setActivityOrientation(boolean z10, Orientation orientation);

    void showCloseButton(boolean z10, int i10, int i11);

    void showCloseCountdown();

    void updateCloseCountdown(int i10);

    boolean wasDismissedByUser();
}
