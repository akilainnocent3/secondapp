package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class w2 {
    public static f3 a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -318297696) {
                if (iHashCode != 757909789) {
                    if (iHashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                        return f3.f148950c;
                    }
                } else if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    return f3.f148951d;
                }
            } else if (str.equals(InstreamAdBreakType.PREROLL)) {
                return f3.f148949b;
            }
        }
        return f3.f148952e;
    }
}
