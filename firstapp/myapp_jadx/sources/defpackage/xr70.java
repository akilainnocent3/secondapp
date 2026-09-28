package defpackage;

import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
public final class xr70 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ ScrollingTabContainerView b;

    public xr70(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.b = scrollingTabContainerView;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        int left = view.getLeft();
        ScrollingTabContainerView scrollingTabContainerView = this.b;
        scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
        scrollingTabContainerView.a = null;
    }
}
