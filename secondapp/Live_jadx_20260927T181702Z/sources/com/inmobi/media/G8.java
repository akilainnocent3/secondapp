package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class G8 implements Pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J8 f54704a;

    public G8(J8 j10) {
        this.f54704a = j10;
    }

    @Override // com.inmobi.media.Pn
    public final void a(ArrayList visibleViews, ArrayList invisibleViews) {
        kotlin.jvm.internal.m0.p(visibleViews, "visibleViews");
        kotlin.jvm.internal.m0.p(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            H8 h10 = (H8) this.f54704a.f54887a.get(view);
            if (h10 == null) {
                this.f54704a.a(view);
            } else {
                H8 h11 = (H8) this.f54704a.f54888b.get(view);
                if (!kotlin.jvm.internal.m0.g(h10.f54771a, h11 != null ? h11.f54771a : null)) {
                    h10.f54774d = SystemClock.uptimeMillis();
                    this.f54704a.f54888b.put(view, h10);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f54704a.f54888b.remove((View) it2.next());
        }
        J8 j10 = this.f54704a;
        if (j10.f54891e.hasMessages(0)) {
            return;
        }
        j10.f54891e.postDelayed(j10.f54892f, j10.f54893g);
    }
}
