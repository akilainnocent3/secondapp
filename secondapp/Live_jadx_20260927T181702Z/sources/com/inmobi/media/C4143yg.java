package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4143yg extends Tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58201a;

    public C4143yg(int i10) {
        this.f58201a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4143yg) && this.f58201a == ((C4143yg) obj).f58201a;
    }

    public final int hashCode() {
        return this.f58201a;
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f58201a + gi.j.f86771d;
    }
}
