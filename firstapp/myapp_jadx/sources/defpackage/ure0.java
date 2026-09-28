package defpackage;

import defpackage.gre0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ure0<Animation extends gre0> {
    public final Animation a;
    public final boolean b;
    public final g0f0 c;

    public ure0(Animation animation, boolean z, g0f0 g0f0Var) {
        animation.getClass();
        g0f0Var.getClass();
        this.a = animation;
        this.b = z;
        this.c = g0f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ure0)) {
            return false;
        }
        ure0 ure0Var = (ure0) obj;
        return Intrinsics.g(this.a, ure0Var.a) && this.b == ure0Var.b && Intrinsics.g(this.c, ure0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TGAnimationEvent(animation=" + this.a + ", isInfinity=" + this.b + ", skin=" + this.c + ')';
    }

    public /* synthetic */ ure0(gre0 gre0Var, boolean z) {
        this(gre0Var, z, g0f0.a.a);
    }
}
