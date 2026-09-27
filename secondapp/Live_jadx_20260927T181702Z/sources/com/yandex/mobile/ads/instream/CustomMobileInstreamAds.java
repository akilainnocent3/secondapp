package com.yandex.mobile.ads.instream;

import androidx.annotation.NonNull;
import java.util.Set;
import k.j0;
import yads.ma1;
import yads.na1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@j0
final class CustomMobileInstreamAds {
    public static void setControlsEnabled(boolean z10) {
        Object obj = na1.f152959e;
        ma1.a().f152961a = z10;
    }

    public static void setDiscardAdGroupOnSkip(boolean z10) {
        Object obj = na1.f152959e;
        ma1.a().f152962b = z10;
    }

    public static void setNonSkippableAdBreakTypes(@NonNull Set<String> set) {
        Object obj = na1.f152959e;
        ma1.a().f152964d = set;
    }
}
