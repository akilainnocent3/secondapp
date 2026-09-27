package androidx.leanback.widget;

import android.content.Context;
import android.os.Bundle;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class q0 extends j0 {
    public String P;
    public long Q;
    public long R = Long.MIN_VALUE;
    public long S = Long.MAX_VALUE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends b<a> {
        public a(Context context) {
            super(context);
        }

        public q0 O() {
            q0 q0Var = new q0();
            J(q0Var);
            return q0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b<B extends b> extends j0.b<B> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f12910r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f12911s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f12912t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f12913u;

        public b(Context context) {
            super(context);
            this.f12912t = Long.MIN_VALUE;
            this.f12913u = Long.MAX_VALUE;
            this.f12911s = Calendar.getInstance().getTimeInMillis();
            u(true);
        }

        public final void J(q0 q0Var) {
            super.a(q0Var);
            q0Var.P = this.f12910r;
            q0Var.Q = this.f12911s;
            long j10 = this.f12912t;
            long j11 = this.f12913u;
            if (j10 > j11) {
                throw new IllegalArgumentException("MinDate cannot be larger than MaxDate");
            }
            q0Var.R = j10;
            q0Var.S = j11;
        }

        public B K(long j10) {
            this.f12911s = j10;
            return this;
        }

        public B L(String str) {
            this.f12910r = str;
            return this;
        }

        public B M(long j10) {
            this.f12913u = j10;
            return this;
        }

        public B N(long j10) {
            this.f12912t = j10;
            return this;
        }
    }

    @Override // androidx.leanback.widget.j0
    public void N(Bundle bundle, String str) {
        d0(bundle.getLong(str, Z()));
    }

    @Override // androidx.leanback.widget.j0
    public void O(Bundle bundle, String str) {
        bundle.putLong(str, Z());
    }

    public long Z() {
        return this.Q;
    }

    public String a0() {
        return this.P;
    }

    public long b0() {
        return this.S;
    }

    public long c0() {
        return this.R;
    }

    public void d0(long j10) {
        this.Q = j10;
    }
}
