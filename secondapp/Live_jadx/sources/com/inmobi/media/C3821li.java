package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.li, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3821li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56939a;

    public C3821li(int i10) {
        this.f56939a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3821li) && this.f56939a == ((C3821li) obj).f56939a;
    }

    public final int hashCode() {
        return this.f56939a;
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f56939a + gi.j.f86771d;
    }
}
