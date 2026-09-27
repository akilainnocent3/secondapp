package yads;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f154456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f154457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ds.l f154458c;

    public qf0(Intent intent, sf0 sf0Var, tf0 tf0Var) {
        this.f154456a = intent;
        this.f154457b = sf0Var;
        this.f154458c = tf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf0)) {
            return false;
        }
        qf0 qf0Var = (qf0) obj;
        return kotlin.jvm.internal.m0.g(this.f154456a, qf0Var.f154456a) && kotlin.jvm.internal.m0.g(this.f154457b, qf0Var.f154457b) && kotlin.jvm.internal.m0.g(this.f154458c, qf0Var.f154458c);
    }

    public final int hashCode() {
        return this.f154458c.hashCode() + ((this.f154457b.hashCode() + (this.f154456a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.f154456a + ", onLaunchSucceed=" + this.f154457b + ", onLaunchFailed=" + this.f154458c + gi.j.f86771d;
    }
}
