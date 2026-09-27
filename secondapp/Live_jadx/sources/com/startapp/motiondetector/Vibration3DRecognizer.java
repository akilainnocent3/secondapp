package com.startapp.motiondetector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final VibrationRecognizer f73974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final VibrationRecognizer f73975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final VibrationRecognizer f73976z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.f73974x = vibrationRecognizer;
        this.f73975y = vibrationRecognizer2;
        this.f73976z = vibrationRecognizer3;
    }

    public void add(long j10, double d10, double d11, double d12) {
        this.f73974x.add(j10, d10);
        this.f73975y.add(j10, d11);
        this.f73976z.add(j10, d12);
        double amplitude = this.f73974x.getAmplitude();
        double amplitude2 = this.f73975y.getAmplitude();
        double amplitude3 = this.f73976z.getAmplitude();
        double d13 = amplitude + amplitude2 + amplitude3;
        if (d13 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.f73974x.getFrequency() * amplitude) / d13) + ((this.f73975y.getFrequency() * amplitude2) / d13) + ((this.f73976z.getFrequency() * amplitude3) / d13);
        this.amplitude = d13 / 3.0d;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f73974x.reset();
        this.f73975y.reset();
        this.f73976z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}
