package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(Ad ad2);

    @Benchmark
    void onAdLoaded(Ad ad2);

    @Benchmark
    void onError(Ad ad2, AdError adError);

    @Benchmark
    void onLoggingImpression(Ad ad2);
}
