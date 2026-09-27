package com.yandex.div.histogram;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class HistogramRecorder {

    @NonNull
    private final HistogramBridge mBridge;

    public HistogramRecorder(@NonNull HistogramBridge histogramBridge) {
        this.mBridge = histogramBridge;
    }

    public void recordBooleanHistogram(@NonNull String str, boolean z10) {
        this.mBridge.recordBooleanHistogram(str, z10);
    }

    public void recordCount100Histogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 100, 50);
    }

    public void recordCount100KHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 100000, 50);
    }

    public void recordCount10KHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 10000, 50);
    }

    public void recordCount1KHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 1000, 50);
    }

    public void recordCount1MHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 1000000, 50);
    }

    public void recordCustomCountHistogram(@NonNull String str, int i10, int i11, int i12, int i13) {
        this.mBridge.recordCountHistogram(str, i10, i11, i12, i13);
    }

    public void recordCustomTimeHistogram(@NonNull String str, long j10, long j11, long j12, @NonNull TimeUnit timeUnit, int i10) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j10), timeUnit.toMillis(j11), timeUnit.toMillis(j12), TimeUnit.MILLISECONDS, i10);
    }

    public void recordEnumeratedHistogram(@NonNull String str, int i10, int i11) {
        this.mBridge.recordEnumeratedHistogram(str, i10, i11);
    }

    public void recordLargeMemoryMbHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 64000, 100);
    }

    public void recordLinearCountHistogram(@NonNull String str, int i10, int i11, int i12, int i13) {
        this.mBridge.recordLinearCountHistogram(str, i10, i11, i12, i13);
    }

    public void recordLongTimeHistogram(@NonNull String str, long j10, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j10), 1L, 3600000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordMediumTimeHistogram(@NonNull String str, long j10, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j10), 1L, 180000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordMemoryKbHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1000, 500000, 50);
    }

    public void recordMemoryMbHistogram(@NonNull String str, int i10) {
        this.mBridge.recordCountHistogram(str, i10, 1, 1000, 50);
    }

    public void recordPercentageHistogram(@NonNull String str, int i10) {
        this.mBridge.recordLinearCountHistogram(str, i10, 1, 101, 102);
    }

    public void recordShortTimeHistogram(@NonNull String str, long j10, @NonNull TimeUnit timeUnit) {
        this.mBridge.recordTimeHistogram(str, timeUnit.toMillis(j10), 1L, 10000L, TimeUnit.MILLISECONDS, 50);
    }

    public void recordSparseSlowlyHistogram(@NonNull String str, int i10) {
        this.mBridge.recordSparseSlowlyHistogram(str, i10);
    }
}
