package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public enum fg2 {
    f149106c(InstreamAdBreakType.PREROLL),
    f149107d(InstreamAdBreakType.MIDROLL),
    f149108e(InstreamAdBreakType.POSTROLL),
    f149109f("standalone");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149111b;

    fg2(String str) {
        this.f149111b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f149111b;
    }
}
