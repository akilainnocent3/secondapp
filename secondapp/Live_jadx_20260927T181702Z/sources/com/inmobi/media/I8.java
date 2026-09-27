package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class I8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f54834c;

    public I8(J8 impressionTracker) {
        kotlin.jvm.internal.m0.p(impressionTracker, "impressionTracker");
        this.f54832a = I8.class.getSimpleName();
        this.f54833b = new ArrayList();
        this.f54834c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String TAG = this.f54832a;
        kotlin.jvm.internal.m0.o(TAG, "TAG");
        J8 j10 = (J8) this.f54834c.get();
        if (j10 != null) {
            for (Map.Entry entry : j10.f54888b.entrySet()) {
                View view = (View) entry.getKey();
                H8 h10 = (H8) entry.getValue();
                String TAG2 = this.f54832a;
                kotlin.jvm.internal.m0.o(TAG2, "TAG");
                Objects.toString(h10);
                if (SystemClock.uptimeMillis() - h10.f54774d >= h10.f54773c) {
                    String TAG3 = this.f54832a;
                    kotlin.jvm.internal.m0.o(TAG3, "TAG");
                    C3885o7 c3885o7 = j10.f54894h;
                    c3885o7.getClass();
                    if (view instanceof GestureDetectorOnGestureListenerC3594ci) {
                        InterfaceC3837m9 interfaceC3837m9 = c3885o7.f57192a.f57416f;
                        if (interfaceC3837m9 != null) {
                            ((C3862n9) interfaceC3837m9).a("HtmlAdTracker", "fireImpression");
                        }
                        ((GestureDetectorOnGestureListenerC3594ci) view).u();
                    }
                    this.f54833b.add(view);
                }
            }
            Iterator it = this.f54833b.iterator();
            while (it.hasNext()) {
                j10.a((View) it.next());
            }
            this.f54833b.clear();
            if (j10.f54888b.isEmpty() || j10.f54891e.hasMessages(0)) {
                return;
            }
            j10.f54891e.postDelayed(j10.f54892f, j10.f54893g);
        }
    }
}
