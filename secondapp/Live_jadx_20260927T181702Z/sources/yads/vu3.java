package yads;

import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vu3 implements VideoAdExtensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f157098a;

    public vu3(List list) {
        this.f157098a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vu3) && kotlin.jvm.internal.m0.g(this.f157098a, ((vu3) obj).f157098a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
    public final String get(String str) {
        Object next;
        Iterator it = this.f157098a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m0.g(((hq0) next).f150220a, str));
        hq0 hq0Var = (hq0) next;
        if (hq0Var != null) {
            return hq0Var.f150221b;
        }
        return null;
    }

    public final int hashCode() {
        return this.f157098a.hashCode();
    }

    public final String toString() {
        return "YandexVideoAdExtensions(extensions=" + this.f157098a + gi.j.f86771d;
    }
}
