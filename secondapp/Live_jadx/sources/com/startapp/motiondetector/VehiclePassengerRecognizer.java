package com.startapp.motiondetector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class VehiclePassengerRecognizer implements SignalProcessor, Valuable {
    private static final double alphaLa = 0.0d;
    private static final double alphaVa = 0.0d;
    private static final double alphaVf = 0.0d;
    private static final double weightLa = 100.0d;
    private static final double weightSum = 270.0d;
    private static final double weightVa = 70.0d;
    private static final double weightVf = 100.0d;

    /* JADX INFO: renamed from: la, reason: collision with root package name */
    private double f73971la;
    private double probability;

    /* JADX INFO: renamed from: va, reason: collision with root package name */
    private double f73972va;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private double f73973vf;

    public static double laFunciton(double d10) {
        if (d10 < 0.0d) {
            return 0.0d;
        }
        if (d10 < 0.5d) {
            return Math.pow(d10 * 2.0d, 4.0d);
        }
        if (d10 > 5.0d) {
            return Math.exp((5.0d - d10) * 4.0d);
        }
        return 1.0d;
    }

    public static double vaFunciton(double d10) {
        if (d10 < 0.0d) {
            return 0.0d;
        }
        if (d10 < 0.5d) {
            return Math.pow(d10 * 2.0d, 4.0d);
        }
        if (d10 > 2.0d) {
            return Math.exp((2.0d - d10) * 6.0d);
        }
        return 1.0d;
    }

    public static double vfFunction(double d10) {
        return Math.min(Utils.gaussian(d10, 2.0d, 7.0d, 1.0d), 1.0d);
    }

    public void add(double d10, double d11, double d12) {
        this.f73973vf = (this.f73973vf * 0.0d) + (vfFunction(d10) * 1.0d);
        this.f73972va = (this.f73972va * 0.0d) + (vaFunciton(d11) * 1.0d);
        double dLaFunciton = (this.f73971la * 0.0d) + (laFunciton(d12) * 1.0d);
        this.f73971la = dLaFunciton;
        this.probability = ((this.f73973vf * 100.0d) / weightSum) + ((this.f73972va * weightVa) / weightSum) + ((dLaFunciton * 100.0d) / weightSum);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.probability;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f73973vf = 0.0d;
        this.f73972va = 0.0d;
        this.f73971la = 0.0d;
        this.probability = 0.0d;
    }
}
