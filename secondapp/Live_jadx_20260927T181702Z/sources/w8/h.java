package w8;

import android.net.Uri;
import j8.q;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@q.c
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final Uri f142512a;

    public h(@l Uri updateUri) {
        m0.p(updateUri, "updateUri");
        this.f142512a = updateUri;
    }

    @l
    public final Uri a() {
        return this.f142512a;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return m0.g(this.f142512a, ((h) obj).f142512a);
        }
        return false;
    }

    public int hashCode() {
        return this.f142512a.hashCode();
    }

    @l
    public String toString() {
        return "UpdateSignalsRequest: updateUri=" + this.f142512a;
    }
}
