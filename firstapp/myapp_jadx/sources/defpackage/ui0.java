package defpackage;

import defpackage.mj0;

/* JADX INFO: loaded from: classes.dex */
public final class ui0<T, V extends mj0> {
    public final aj0<T, V> a;
    public final ph0 b;

    public ui0(aj0<T, V> aj0Var, ph0 ph0Var) {
        this.a = aj0Var;
        this.b = ph0Var;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
