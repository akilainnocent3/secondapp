package com.yandex.div.internal.viewpool;

import f0.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ProfilingSession {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long LONG_OPERATION_THRESHOLD_NS = 1000000;

    @l
    private final Accumulator mOverallTimeAccumulator = new Accumulator();

    @l
    private final Accumulator mLongRequestAccumulator = new Accumulator();

    @l
    private final a<String, Accumulator> mBlockedViewAccumulators = new a<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Accumulator {
        private long accumulated;
        private int count;

        public final void add(long j10) {
            this.accumulated += j10;
        }

        public final void addAndIncrement(long j10) {
            add(j10);
            this.count++;
        }

        public final long getAccumulated() {
            return this.accumulated;
        }

        public final long getAvg() {
            int i10 = this.count;
            if (i10 == 0) {
                return 0L;
            }
            return this.accumulated / ((long) i10);
        }

        public final int getCount() {
            return this.count;
        }

        public final void reset() {
            this.accumulated = 0L;
            this.count = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long toMicroseconds(long j10) {
            return j10 / 1000;
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.mOverallTimeAccumulator.reset();
        this.mLongRequestAccumulator.reset();
        Iterator<Map.Entry<String, Accumulator>> it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().reset();
        }
    }

    @l
    public final Map<String, Object> flush() {
        HashMap map = new HashMap();
        map.put("view obtaining - total count", Integer.valueOf(this.mOverallTimeAccumulator.getCount()));
        map.put("view obtaining - total time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mOverallTimeAccumulator.getAccumulated()))));
        for (Map.Entry<String, Accumulator> entry : this.mBlockedViewAccumulators.entrySet()) {
            String key = entry.getKey();
            Accumulator value = entry.getValue();
            if (value.getCount() > 0) {
                map.put("blocking view obtaining for " + key + " - count", Integer.valueOf(value.getCount()));
                map.put("blocking view obtaining for " + key + " - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(value.getAvg()))));
            }
        }
        if (this.mLongRequestAccumulator.getCount() > 0) {
            map.put("long view requests - count", Integer.valueOf(this.mLongRequestAccumulator.getCount()));
            map.put("long view requests - avg time (µs)", Long.valueOf(ProfilingSessionKt.roundRoughly(Companion.toMicroseconds(this.mLongRequestAccumulator.getAvg()))));
        }
        return map;
    }

    public final boolean hasLongEvents() {
        if (this.mLongRequestAccumulator.getCount() > 0) {
            return true;
        }
        Iterator<Map.Entry<String, Accumulator>> it = this.mBlockedViewAccumulators.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final void viewObtainedWithBlock(@l String str, long j10) {
        this.mOverallTimeAccumulator.addAndIncrement(j10);
        a<String, Accumulator> aVar = this.mBlockedViewAccumulators;
        Accumulator accumulator = aVar.get(str);
        if (accumulator == null) {
            accumulator = new Accumulator();
            aVar.put(str, accumulator);
        }
        accumulator.addAndIncrement(j10);
    }

    public final void viewObtainedWithoutBlock(long j10) {
        this.mOverallTimeAccumulator.addAndIncrement(j10);
    }

    public final void viewRequested(long j10) {
        this.mOverallTimeAccumulator.add(j10);
        if (j10 >= 1000000) {
            this.mLongRequestAccumulator.addAndIncrement(j10);
        }
    }
}
