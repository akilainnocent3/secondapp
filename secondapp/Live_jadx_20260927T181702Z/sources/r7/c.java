package r7;

import a9.y2;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f123692b = "timestamp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123693c = "playbackState";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f123694d = "contentPosition";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f123695e = "contentDuration";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f123696f = "extras";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123697g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123698h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f123699i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f123700j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f123701k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f123702l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f123703m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f123704n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f123705o = "android.media.status.extra.HTTP_STATUS_CODE";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f123706p = "android.media.status.extra.HTTP_RESPONSE_HEADERS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f123707a;

    public c(Bundle bundle) {
        this.f123707a = bundle;
    }

    @Nullable
    public static c b(@Nullable Bundle bundle) {
        if (bundle != null) {
            return new c(bundle);
        }
        return null;
    }

    public static String h(int i10) {
        switch (i10) {
            case 0:
                return "pending";
            case 1:
                return C4235d4.i.f61413f0;
            case 2:
                return C4235d4.i.f61411e0;
            case 3:
                return "buffering";
            case 4:
                return "finished";
            case 5:
                return "canceled";
            case 6:
                return y2.f4411p;
            case 7:
                return "error";
            default:
                return Integer.toString(i10);
        }
    }

    @NonNull
    public Bundle a() {
        return this.f123707a;
    }

    public long c() {
        return this.f123707a.getLong(f123695e, -1L);
    }

    public long d() {
        return this.f123707a.getLong(f123694d, -1L);
    }

    @Nullable
    public Bundle e() {
        return this.f123707a.getBundle("extras");
    }

    public int f() {
        return this.f123707a.getInt(f123693c, 7);
    }

    public long g() {
        return this.f123707a.getLong("timestamp");
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MediaItemStatus{ ");
        sb2.append("timestamp=");
        e2.p0.e(SystemClock.elapsedRealtime() - g(), sb2);
        sb2.append(" ms ago");
        sb2.append(", playbackState=");
        sb2.append(h(f()));
        sb2.append(", contentPosition=");
        sb2.append(d());
        sb2.append(", contentDuration=");
        sb2.append(c());
        sb2.append(", extras=");
        sb2.append(e());
        sb2.append(" }");
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f123708a;

        public a(int i10) {
            this.f123708a = new Bundle();
            f(SystemClock.elapsedRealtime());
            e(i10);
        }

        @NonNull
        public c a() {
            return new c(this.f123708a);
        }

        @NonNull
        public a b(long j10) {
            this.f123708a.putLong(c.f123695e, j10);
            return this;
        }

        @NonNull
        public a c(long j10) {
            this.f123708a.putLong(c.f123694d, j10);
            return this;
        }

        @NonNull
        public a d(@Nullable Bundle bundle) {
            if (bundle == null) {
                this.f123708a.putBundle("extras", null);
                return this;
            }
            this.f123708a.putBundle("extras", new Bundle(bundle));
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f123708a.putInt(c.f123693c, i10);
            return this;
        }

        @NonNull
        public a f(long j10) {
            this.f123708a.putLong("timestamp", j10);
            return this;
        }

        public a(@NonNull c cVar) {
            if (cVar != null) {
                this.f123708a = new Bundle(cVar.f123707a);
                return;
            }
            throw new IllegalArgumentException("status must not be null");
        }
    }
}
