package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak0 f147225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f147226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final im3 f147227c;

    public bk0(ak0 ak0Var, Drawable drawable, im3 im3Var) {
        this.f147225a = ak0Var;
        this.f147226b = drawable;
        this.f147227c = im3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return kotlin.jvm.internal.m0.g(this.f147225a, bk0Var.f147225a) && kotlin.jvm.internal.m0.g(this.f147226b, bk0Var.f147226b) && kotlin.jvm.internal.m0.g(this.f147227c, bk0Var.f147227c);
    }

    public final int hashCode() {
        int iHashCode = this.f147225a.hashCode() * 31;
        Drawable drawable = this.f147226b;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        im3 im3Var = this.f147227c;
        return iHashCode2 + (im3Var != null ? im3Var.hashCode() : 0);
    }

    public final String toString() {
        return "BatchedResponse(request=" + this.f147225a + ", drawable=" + this.f147226b + ", error=" + this.f147227c + gi.j.f86771d;
    }
}
