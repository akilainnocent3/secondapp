package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import com.yandex.div.core.annotations.PublicApi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface HistogramBridge {
    void recordBooleanHistogram(@NonNull String str, boolean z10);

    void recordCountHistogram(@NonNull String str, int i10, int i11, int i12, int i13);

    void recordEnumeratedHistogram(@NonNull String str, int i10, int i11);

    void recordLinearCountHistogram(@NonNull String str, int i10, int i11, int i12, int i13);

    void recordSparseSlowlyHistogram(@NonNull String str, int i10);

    void recordTimeHistogram(@NonNull String str, long j10, long j11, long j12, @NonNull TimeUnit timeUnit, int i10);
}
