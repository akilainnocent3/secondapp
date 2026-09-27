package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class F8 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f58949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private a f58950b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(@oy.l pg pgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(@oy.l Context context) {
        super(context);
        kotlin.jvm.internal.m0.p(context, "context");
        this.f58949a = "ISNNativeAdContainer";
    }

    private final pg a() {
        return new pg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @oy.m
    public final a getListener$mediationsdk_release() {
        return this.f58950b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@oy.l View changedView, int i10) {
        kotlin.jvm.internal.m0.p(changedView, "changedView");
        Logger.i(this.f58949a, "onVisibilityChanged: " + i10);
        a aVar = this.f58950b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(this.f58949a, "onWindowVisibilityChanged: " + i10);
        a aVar = this.f58950b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(@oy.m a aVar) {
        this.f58950b = aVar;
    }
}
