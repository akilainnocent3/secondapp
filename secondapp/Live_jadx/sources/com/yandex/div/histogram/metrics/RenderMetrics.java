package com.yandex.div.histogram.metrics;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RenderMetrics {
    private long bindingMs;
    private long drawMs;
    private long layoutMs;
    private long measureMs;
    private long rebindingMs;

    public final void addDraw(long j10) {
        this.drawMs += j10;
    }

    public final void addLayout(long j10) {
        this.layoutMs += j10;
    }

    public final void addMeasure(long j10) {
        this.measureMs += j10;
    }

    public final void binding(long j10) {
        this.bindingMs = j10;
    }

    public final long getBindingMs() {
        return this.bindingMs;
    }

    public final long getDrawMs() {
        return this.drawMs;
    }

    public final long getLayoutMs() {
        return this.layoutMs;
    }

    public final long getMeasureMs() {
        return this.measureMs;
    }

    public final long getRebindingMs() {
        return this.rebindingMs;
    }

    public final long getTotalMs() {
        return Math.max(this.bindingMs, this.rebindingMs) + this.measureMs + this.layoutMs + this.drawMs;
    }

    public final void rebinding(long j10) {
        this.rebindingMs = j10;
    }

    public final void reset() {
        this.measureMs = 0L;
        this.layoutMs = 0L;
        this.drawMs = 0L;
        this.bindingMs = 0L;
        this.rebindingMs = 0L;
    }
}
