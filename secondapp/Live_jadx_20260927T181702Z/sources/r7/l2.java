package r7;

import a9.y2;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f123999b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f124000c = "sessionState";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f124001d = "queuePaused";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f124002e = "extras";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f124003f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f124004g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f124005h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f124006a;

    public l2(Bundle bundle) {
        this.f124006a = bundle;
    }

    @Nullable
    public static l2 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new l2(bundle);
        }
        return null;
    }

    public static String g(int i10) {
        if (i10 == 0) {
            return AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
        }
        if (i10 != 1) {
            return i10 != 2 ? Integer.toString(i10) : y2.f4411p;
        }
        return C4235d4.i.f61415g0;
    }

    @NonNull
    public Bundle a() {
        return this.f124006a;
    }

    @Nullable
    public Bundle c() {
        return this.f124006a.getBundle("extras");
    }

    public int d() {
        return this.f124006a.getInt(f124000c, 2);
    }

    public long e() {
        return this.f124006a.getLong("timestamp");
    }

    public boolean f() {
        return this.f124006a.getBoolean(f124001d);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaSessionStatus{ ");
        sb2.append("timestamp=");
        e2.p0.e(SystemClock.elapsedRealtime() - e(), sb2);
        sb2.append(" ms ago");
        sb2.append(", sessionState=");
        sb2.append(g(d()));
        sb2.append(", queuePaused=");
        sb2.append(f());
        sb2.append(", extras=");
        sb2.append(c());
        sb2.append(" }");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f124007a;

        public a(int i10) {
            this.f124007a = new Bundle();
            e(SystemClock.elapsedRealtime());
            d(i10);
        }

        @NonNull
        public l2 a() {
            return new l2(this.f124007a);
        }

        @NonNull
        public a b(@Nullable Bundle bundle) {
            if (bundle == null) {
                this.f124007a.putBundle("extras", null);
                return this;
            }
            this.f124007a.putBundle("extras", new Bundle(bundle));
            return this;
        }

        @NonNull
        public a c(boolean z10) {
            this.f124007a.putBoolean(l2.f124001d, z10);
            return this;
        }

        @NonNull
        public a d(int i10) {
            this.f124007a.putInt(l2.f124000c, i10);
            return this;
        }

        @NonNull
        public a e(long j10) {
            this.f124007a.putLong("timestamp", j10);
            return this;
        }

        public a(@NonNull l2 l2Var) {
            if (l2Var != null) {
                this.f124007a = new Bundle(l2Var.f124006a);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
