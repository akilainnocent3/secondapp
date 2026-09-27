package com.startapp.motiondetector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final HighPassFilter f73966x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final HighPassFilter f73967y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final HighPassFilter f73968z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.f73966x = highPassFilter;
        this.f73967y = highPassFilter2;
        this.f73968z = highPassFilter3;
    }

    public void add(double d10, double d11, double d12) {
        this.f73966x.add(d10);
        this.f73967y.add(d11);
        this.f73968z.add(d12);
        this.magnitude = Math.sqrt((this.f73966x.getValue() * this.f73966x.getValue()) + (this.f73967y.getValue() * this.f73967y.getValue()) + (this.f73968z.getValue() * this.f73968z.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.f73966x;
    }

    public HighPassFilter getY() {
        return this.f73967y;
    }

    public HighPassFilter getZ() {
        return this.f73968z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f73966x.reset();
        this.f73967y.reset();
        this.f73968z.reset();
        this.magnitude = 0.0d;
    }
}
