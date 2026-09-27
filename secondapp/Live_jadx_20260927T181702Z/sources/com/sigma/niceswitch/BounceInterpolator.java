package com.sigma.niceswitch;

import android.view.animation.Interpolator;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public class BounceInterpolator implements Interpolator {
    private double amplitude;
    private double frequency;

    public BounceInterpolator(double d10, double d11) {
        this.amplitude = d10;
        this.frequency = d11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f10)) / this.amplitude) * (-1.0d) * Math.cos(this.frequency * ((double) f10))) + 1.0d);
    }
}
