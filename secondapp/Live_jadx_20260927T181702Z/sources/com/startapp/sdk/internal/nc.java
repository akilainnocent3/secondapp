package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class nc extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f75252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f75253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f75254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f75255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f75256e;

    public nc(String str, MotionMetadata motionMetadata, int i10, double d10, long j10) {
        super(str);
        this.f75254c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f75255d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f75256e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f75253b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d10, j10);
        this.f75252a = new LinkedBlockingDeque(i10);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f75252a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f75252a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f75253b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(jCurrentTimeMillis, j10, fArr[0], fArr[1], fArr[2]);
                this.f75254c.set(Double.doubleToRawLongBits(this.f75253b.getTravelProbability()));
                this.f75255d.set(Double.doubleToRawLongBits(this.f75253b.getTravelProbabilityMaximumValue()));
                this.f75256e.set(this.f75253b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th2) {
                d9.a(th2);
                return;
            }
        }
    }
}
