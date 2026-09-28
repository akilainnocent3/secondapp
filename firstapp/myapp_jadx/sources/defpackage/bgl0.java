package defpackage;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class bgl0 {
    public final Object a;
    public final int b;

    public bgl0(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bgl0)) {
            return false;
        }
        bgl0 bgl0Var = (bgl0) obj;
        return this.a == bgl0Var.a && this.b == bgl0Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
