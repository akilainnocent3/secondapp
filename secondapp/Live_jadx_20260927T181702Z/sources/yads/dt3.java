package yads;

import com.yandex.mobile.ads.video.playback.model.MediaFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dt3 implements MediaFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia1 f148356a;

    public dt3(ia1 ia1Var) {
        this.f148356a = ia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt3) && kotlin.jvm.internal.m0.g(this.f148356a, ((dt3) obj).f148356a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdHeight() {
        return this.f148356a.f150498d;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final int getAdWidth() {
        return this.f148356a.f150497c;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getApiFramework() {
        return this.f148356a.f150501g;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final Integer getBitrate() {
        return this.f148356a.f150500f;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile
    public final String getMediaType() {
        return this.f148356a.f150499e;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.MediaFile, yads.cf3
    public final String getUrl() {
        return this.f148356a.f150496b;
    }

    public final int hashCode() {
        return this.f148356a.hashCode();
    }

    public final String toString() {
        return "YandexMediaFile(mediaFile=" + this.f148356a + gi.j.f86771d;
    }
}
