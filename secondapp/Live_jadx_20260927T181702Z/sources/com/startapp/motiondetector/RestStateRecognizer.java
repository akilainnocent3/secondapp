package com.startapp.motiondetector;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class RestStateRecognizer implements SignalProcessor {
    public static final int STATE_MOTION = 2;
    public static final int STATE_REST = 1;
    public static final int STATE_UNKNOWN = 0;
    private double acceleration;
    private double accelerationMaxSum;
    private final double alphaJerk;
    private final boolean applyCorrection;
    private double brakingAccelerationMin;
    private long brakingTimeBegin;
    private long brakingTimeEnd;
    private long brakingTimeMin;
    private final long decisionMakingIntervalNanos;
    private final long decisionValidnessIntervalNanos;
    private final long delayIntervalNanos;
    private final HighPassFilter3D forward;
    private final HighPassFilter3D gravity;
    private double jerk;
    private final HighPassFilter3D linear;
    private int maxCount;
    private Sample nearestBack;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool;
    private int samplesCount;
    private double scalarLF;
    private long stableTillTimestampNanos;
    private long startTimestampNanos;
    private int state;
    private int steadyCount;
    private long validTimestampNanos;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Sample {
        double acceleration;
        double accelerationMax;
        double accelerationMin;
        int braking;
        int max;
        long maxStartTime;
        double maxStartValue;
        int min;
        long minStartTime;
        double minStartValue;
        Sample next;
        Sample prev;
        int racing;
        int retard;
        int spurt;
        int steady;
        long timestampNanos;

        public void reset() {
            this.timestampNanos = 0L;
            this.acceleration = 0.0d;
            this.accelerationMax = 0.0d;
            this.accelerationMin = 0.0d;
            this.max = 0;
            this.min = 0;
            this.maxStartTime = 0L;
            this.maxStartValue = 0.0d;
            this.minStartTime = 0L;
            this.minStartValue = 0.0d;
            this.spurt = 0;
            this.racing = 0;
            this.steady = 0;
            this.retard = 0;
            this.braking = 0;
            this.next = null;
            this.prev = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class SamplePool {
        Sample head;

        public Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        public void release(Sample sample) {
            sample.next = this.head;
            sample.prev = null;
            this.head = sample;
        }
    }

    public RestStateRecognizer(double d10, boolean z10) {
        this(10.0d, 15.0d, 25.0d, 15.0d, 8.0d, d10, 1.0d, z10);
    }

    private void addSample(Sample sample) {
        this.accelerationMaxSum += sample.accelerationMax;
        this.maxCount += sample.max;
        this.steadyCount += sample.steady;
        this.samplesCount++;
    }

    private boolean isEnoughData() {
        Sample sample;
        Sample sample2;
        if (this.samplesCount <= 1 || (sample = this.oldest) == null || (sample2 = this.newest) == null) {
            return false;
        }
        long j10 = sample.timestampNanos;
        return j10 >= this.startTimestampNanos + this.delayIntervalNanos && sample2.timestampNanos >= j10 + this.decisionMakingIntervalNanos && this.nearestBack != null;
    }

    private boolean isRest() {
        int i10 = this.steadyCount;
        int i11 = this.samplesCount;
        if (i10 != i11) {
            return false;
        }
        return this.maxCount <= 0 || this.accelerationMaxSum / ((double) i11) <= 0.01d;
    }

    private void removeSample(Sample sample) {
        this.accelerationMaxSum -= sample.accelerationMax;
        this.maxCount -= sample.max;
        this.steadyCount -= sample.steady;
        this.samplesCount--;
    }

    private double scalarProduct(Valuable valuable, Valuable valuable2, Valuable valuable3, Valuable valuable4, Valuable valuable5, Valuable valuable6) {
        return (valuable.getValue() * valuable2.getValue()) + (valuable3.getValue() * valuable4.getValue()) + (valuable5.getValue() * valuable6.getValue());
    }

    private double smsq(double d10, double d11, double d12) {
        return (d10 * d10) + (d11 * d11) + (d12 * d12);
    }

    private double srss(Valuable valuable, Valuable valuable2, Valuable valuable3) {
        return Math.sqrt(smsq(valuable.getValue(), valuable2.getValue(), valuable3.getValue()));
    }

    private void updateMinMax() {
        Sample sample;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 == null) {
            return;
        }
        while (true) {
            sample = this.nearestBack;
            if (sample3 == sample || (sample2 = sample3.prev) == null) {
                break;
            }
            double d10 = sample2.accelerationMax;
            double d11 = sample3.accelerationMax;
            if (d10 < d11) {
                sample2.accelerationMax = d11;
            }
            double d12 = sample2.accelerationMin;
            double d13 = sample3.accelerationMin;
            if (d12 > d13) {
                sample2.accelerationMin = d13;
            }
            sample3 = sample2;
        }
        if (sample3 == sample) {
            Sample sample4 = this.newest;
            double d14 = sample4.acceleration;
            Sample sample5 = sample3.next;
            if (d14 == sample5.accelerationMax) {
                sample4.max = 1;
                Sample sample6 = sample4.prev;
                sample4.maxStartTime = sample6.maxStartTime;
                sample4.maxStartValue = sample6.maxStartValue;
            } else {
                sample4.max = 0;
            }
            if (d14 != sample5.accelerationMin) {
                sample4.min = 0;
                return;
            }
            sample4.min = 1;
            Sample sample7 = sample4.prev;
            sample4.minStartTime = sample7.minStartTime;
            sample4.minStartValue = sample7.minStartValue;
        }
    }

    private Sample updateNearest(Sample sample, long j10) {
        Sample sample2 = null;
        while (sample != null && sample.timestampNanos < j10) {
            sample2 = sample;
            sample = sample.next;
        }
        return sample2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    public void add(long j10, double d10, double d11, double d12) {
        double d13;
        double dExp;
        double dPow;
        Sample sample = this.newest;
        if (sample == null || sample.timestampNanos < j10) {
            if (this.startTimestampNanos <= 0) {
                this.startTimestampNanos = j10;
            }
            this.gravity.add(d10, d11, d12);
            double value = d10 - this.gravity.getX().getValue();
            double value2 = d11 - this.gravity.getY().getValue();
            double value3 = d12 - this.gravity.getZ().getValue();
            this.linear.add(value, value2, value3);
            double value4 = this.forward.getX().getValue();
            double value5 = this.forward.getY().getValue();
            double value6 = this.forward.getZ().getValue();
            this.forward.add(value, value2, -Math.abs(value3));
            if (smsq(this.forward.getX().getValue() - value4, this.forward.getY().getValue() - value5, this.forward.getZ().getValue() - value6) > 0.01d) {
                this.validTimestampNanos = this.delayIntervalNanos + j10;
            }
            this.scalarLF = scalarProduct(this.linear.getX(), this.forward.getX(), this.linear.getY(), this.forward.getY(), this.linear.getZ(), this.forward.getZ());
            if (this.applyCorrection) {
                long j11 = this.brakingTimeEnd;
                if (j10 <= j11 || j11 <= 0) {
                    d13 = 1.0E9d;
                    dExp = 1.0d;
                    dPow = 1.0d;
                } else {
                    long j12 = this.brakingTimeMin;
                    if (j11 > j12) {
                        d13 = 1.0E9d;
                        long j13 = this.brakingTimeBegin;
                        if (j12 > j13) {
                            dExp = 1.0d - ((1.0d - Math.exp(this.brakingAccelerationMin / 3.0d)) * Math.exp(-Math.pow(((j10 - j11) / 1.0E9d) / ((j11 - j13) / 1.0E9d), 2.0d)));
                            dPow = Math.pow(dExp, 0.25d);
                        }
                    } else {
                        d13 = 1.0E9d;
                    }
                    dExp = 1.0d;
                    dPow = 1.0d;
                }
            } else {
                d13 = 1.0E9d;
                dExp = 1.0d;
                dPow = 1.0d;
            }
            double d14 = this.acceleration;
            double value7 = Double.compare(this.forward.getValue(), 0.0d) == 0 ? 0.0d : (dExp * this.scalarLF) / this.forward.getValue();
            this.acceleration = value7;
            if (d14 < 0.0d) {
                if (value7 >= 0.0d) {
                    this.brakingTimeEnd = j10;
                } else if (this.brakingAccelerationMin > value7) {
                    this.brakingAccelerationMin = value7;
                    this.brakingTimeMin = j10;
                }
            } else if (value7 < 0.0d) {
                this.brakingTimeBegin = j10;
                this.brakingTimeEnd = 0L;
                this.brakingTimeMin = j10;
                this.brakingAccelerationMin = value7;
            }
            purgeRollingValues(j10);
            Sample sampleAcquire = this.pool.acquire();
            sampleAcquire.timestampNanos = j10;
            sampleAcquire.maxStartTime = j10;
            sampleAcquire.minStartTime = j10;
            double d15 = this.acceleration;
            sampleAcquire.acceleration = d15;
            sampleAcquire.accelerationMax = d15;
            sampleAcquire.accelerationMin = d15;
            sampleAcquire.maxStartValue = d15;
            sampleAcquire.minStartValue = d15;
            Sample sample2 = this.nearestBack;
            if (sample2 == null) {
                sample2 = this.oldest;
            }
            Sample sampleUpdateNearest = updateNearest(sample2, j10 - 100000000);
            this.nearestBack = sampleUpdateNearest;
            if (sampleUpdateNearest != null) {
                long j14 = sampleUpdateNearest.timestampNanos;
                if (j14 < j10) {
                    double d16 = this.alphaJerk;
                    double d17 = ((this.jerk * d16) + (((1.0d - d16) * (this.acceleration - sampleUpdateNearest.acceleration)) / ((j10 - j14) / d13))) * dPow;
                    this.jerk = d17;
                    if (d17 > 2.0d) {
                        sampleAcquire.spurt = 1;
                    } else if (d17 > 0.4d) {
                        sampleAcquire.racing = 1;
                    } else if (d17 < -2.0d) {
                        sampleAcquire.braking = 1;
                    } else if (d17 < -0.4d) {
                        sampleAcquire.retard = 1;
                    } else {
                        sampleAcquire.steady = 1;
                    }
                } else {
                    sampleAcquire.steady = 1;
                }
            } else {
                sampleAcquire.steady = 1;
            }
            Sample sample3 = this.newest;
            if (sample3 != null) {
                sample3.next = sampleAcquire;
            }
            sampleAcquire.prev = sample3;
            this.newest = sampleAcquire;
            if (this.oldest == null) {
                this.oldest = sampleAcquire;
            }
            updateMinMax();
            addSample(sampleAcquire);
            if (!isEnoughData()) {
                this.state = 0;
                this.stableTillTimestampNanos = 0L;
                return;
            }
            if (j10 <= this.validTimestampNanos) {
                this.state = 2;
                this.stableTillTimestampNanos = 0L;
            } else if (j10 > this.stableTillTimestampNanos) {
                int i10 = isRest() ? 1 : 2;
                if (i10 == 1 || this.state == 1) {
                    this.stableTillTimestampNanos = this.decisionValidnessIntervalNanos + j10;
                }
                this.state = i10;
            }
        }
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public double getJerk() {
        return this.jerk;
    }

    public int getState() {
        return this.state;
    }

    public void purgeRollingValues(long j10) {
        Sample sample;
        long j11 = j10 - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.timestampNanos >= j11 || (sample = sample2.next) == null || sample.timestampNanos >= j11) {
                return;
            }
            this.oldest = sample;
            sample.prev = null;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.nearestBack = null;
                this.newest = null;
                this.startTimestampNanos = 0L;
                this.validTimestampNanos = 0L;
                this.stableTillTimestampNanos = 0L;
                this.gravity.reset();
                this.linear.reset();
                this.forward.reset();
                this.scalarLF = 0.0d;
                this.acceleration = 0.0d;
                this.jerk = 0.0d;
                this.accelerationMaxSum = 0.0d;
                this.maxCount = 0;
                this.steadyCount = 0;
                this.samplesCount = 0;
                this.state = 0;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }

    private RestStateRecognizer(double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10) {
        this.pool = new SamplePool();
        this.state = 0;
        this.alphaJerk = d13 / (1.0d + d13);
        this.delayIntervalNanos = (long) (d14 * 1.0E9d);
        this.decisionMakingIntervalNanos = (long) (d15 * 1.0E9d);
        this.decisionValidnessIntervalNanos = (long) (1.0E9d * d16);
        this.applyCorrection = z10;
        this.gravity = new HighPassFilter3D(new HighPassFilter(d10), new HighPassFilter(d10), new HighPassFilter(d10));
        this.linear = new HighPassFilter3D(new HighPassFilter(d11), new HighPassFilter(d11), new HighPassFilter(d11));
        this.forward = new HighPassFilter3D(new HighPassFilter(d12), new HighPassFilter(d12), new HighPassFilter(d12));
    }
}
