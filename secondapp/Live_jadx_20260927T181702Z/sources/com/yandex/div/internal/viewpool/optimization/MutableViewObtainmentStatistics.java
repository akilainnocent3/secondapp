package com.yandex.div.internal.viewpool.optimization;

import dr.w2;
import kotlin.jvm.internal.m0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class MutableViewObtainmentStatistics extends PerformanceDependentSession.ViewObtainmentStatistics {
    private int currentSuccessiveBlocked;
    private int maxSuccessiveBlocked;

    @m
    private Integer minUnused;

    public MutableViewObtainmentStatistics() {
        super(null);
    }

    public final void clear() {
        synchronized (this) {
            setMaxSuccessiveBlocked(0);
            this.currentSuccessiveBlocked = 0;
            setMinUnused(0);
            w2 w2Var = w2.f79517a;
        }
    }

    @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession.ViewObtainmentStatistics
    public int getMaxSuccessiveBlocked() {
        return this.maxSuccessiveBlocked;
    }

    @Override // com.yandex.div.internal.viewpool.optimization.PerformanceDependentSession.ViewObtainmentStatistics
    @m
    public Integer getMinUnused() {
        return this.minUnused;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x000f, B:14:0x0034, B:9:0x0017, B:11:0x0020, B:13:0x002d), top: B:19:0x0001 }] */
    public final void report(int i10, boolean z10) {
        synchronized (this) {
            try {
                if (z10) {
                    int i11 = this.currentSuccessiveBlocked + 1;
                    this.currentSuccessiveBlocked = i11;
                    if (i11 > getMaxSuccessiveBlocked()) {
                        setMaxSuccessiveBlocked(this.currentSuccessiveBlocked);
                    }
                } else {
                    this.currentSuccessiveBlocked = 0;
                    if (getMinUnused() != null) {
                        Integer minUnused = getMinUnused();
                        m0.m(minUnused);
                        if (i10 < minUnused.intValue()) {
                            setMinUnused(Integer.valueOf(i10));
                        }
                    } else {
                        setMinUnused(Integer.valueOf(i10));
                    }
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setMaxSuccessiveBlocked(int i10) {
        this.maxSuccessiveBlocked = i10;
    }

    public void setMinUnused(@m Integer num) {
        this.minUnused = num;
    }
}
