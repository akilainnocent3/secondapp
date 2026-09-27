package yads;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f147306b;

    public bq0(int i10, RectF rectF) {
        this.f147305a = i10;
        this.f147306b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq0)) {
            return false;
        }
        bq0 bq0Var = (bq0) obj;
        return this.f147305a == bq0Var.f147305a && kotlin.jvm.internal.m0.g(this.f147306b, bq0Var.f147306b);
    }

    public final int hashCode() {
        int i10 = this.f147305a * 31;
        RectF rectF = this.f147306b;
        return i10 + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f147305a + ", visibleRectangle=" + this.f147306b + gi.j.f86771d;
    }
}
