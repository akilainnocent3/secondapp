package defpackage;

import j$.time.Duration;
import java.io.IOException;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes8.dex */
public final class hk1 {
    public static final hk1 e;
    public final Duration b;
    public final Duration c;
    public final int a = 5;
    public final double d = 1.5d;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        if (durationOfSeconds == null) {
            bmy.a("Null initialBackoff");
            return;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(5L);
        if (durationOfSeconds2 == null) {
            bmy.a("Null maxBackoff");
            return;
        }
        hk1 hk1Var = new hk1(durationOfSeconds, durationOfSeconds2);
        int i = hk1Var.a;
        r910.a("maxAttempts must be greater than 1 and less than 6", i > 1 && i < 6);
        r910.a("initialBackoff must be greater than 0", hk1Var.b.toNanos() > 0);
        r910.a("maxBackoff must be greater than 0", hk1Var.c.toNanos() > 0);
        r910.a("backoffMultiplier must be greater than 0", hk1Var.d > 0.0d);
        e = hk1Var;
    }

    public hk1(Duration duration, Duration duration2) {
        this.b = duration;
        this.c = duration2;
    }

    public final double a() {
        return this.d;
    }

    public final Duration b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final Duration d() {
        return this.c;
    }

    public final Predicate<IOException> e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hk1)) {
            return false;
        }
        hk1 hk1Var = (hk1) obj;
        return this.a == hk1Var.c() && this.b.equals(hk1Var.b()) && this.c.equals(hk1Var.d()) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(hk1Var.a()) && hk1Var.e() == null;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        double d = this.d;
        return (((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "RetryPolicy{maxAttempts=" + this.a + ", initialBackoff=" + this.b + ", maxBackoff=" + this.c + ", backoffMultiplier=" + this.d + ", retryExceptionPredicate=null}";
    }
}
