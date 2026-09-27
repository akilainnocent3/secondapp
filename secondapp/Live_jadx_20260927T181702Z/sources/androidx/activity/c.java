package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.t0(34)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f6064a = new c();

    @oy.l
    @k.t
    public final BackEvent a(float f10, float f11, float f12, int i10) {
        return new BackEvent(f10, f11, f12, i10);
    }

    @k.t
    public final float b(@oy.l BackEvent backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    @k.t
    public final int c(@oy.l BackEvent backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    @k.t
    public final float d(@oy.l BackEvent backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    @k.t
    public final float e(@oy.l BackEvent backEvent) {
        kotlin.jvm.internal.m0.p(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
