package com.startapp.motiondetector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class HighPassFilter implements SignalProcessor, Valuable {
    private final double newPart;
    private final double oldPart;
    private double result;

    public HighPassFilter(double d10) {
        double d11 = d10 + 1.0d;
        this.oldPart = d10 / d11;
        this.newPart = 1.0d / d11;
    }

    public void add(double d10) {
        this.result = (this.oldPart * this.result) + (d10 * this.newPart);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.result;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.result = 0.0d;
    }
}
