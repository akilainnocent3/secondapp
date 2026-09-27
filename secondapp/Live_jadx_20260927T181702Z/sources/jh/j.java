package jh;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f100490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f100491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TimeInterpolator f100492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f100494e;

    public j(long j10, long j11) {
        this.f100492c = null;
        this.f100493d = 0;
        this.f100494e = 1;
        this.f100490a = j10;
        this.f100491b = j11;
    }

    @NonNull
    public static j b(@NonNull ValueAnimator valueAnimator) {
        j jVar = new j(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        jVar.f100493d = valueAnimator.getRepeatCount();
        jVar.f100494e = valueAnimator.getRepeatMode();
        return jVar;
    }

    public static TimeInterpolator f(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return b.f100475b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return b.f100476c;
        }
        return interpolator instanceof DecelerateInterpolator ? b.f100477d : interpolator;
    }

    public void a(@NonNull Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f100490a;
    }

    public long d() {
        return this.f100491b;
    }

    @Nullable
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f100492c;
        return timeInterpolator != null ? timeInterpolator : b.f100475b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (c() == jVar.c() && d() == jVar.d() && g() == jVar.g() && h() == jVar.h()) {
            return e().getClass().equals(jVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f100493d;
    }

    public int h() {
        return this.f100494e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + fw.b.f85382i + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public j(long j10, long j11, @NonNull TimeInterpolator timeInterpolator) {
        this.f100493d = 0;
        this.f100494e = 1;
        this.f100490a = j10;
        this.f100491b = j11;
        this.f100492c = timeInterpolator;
    }
}
