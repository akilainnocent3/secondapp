package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4918af extends AbstractC5549zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f96947d = new Ze("LOCATION_TRACKING_ENABLED", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f96948e = new Ze("PREF_KEY_OFFSET", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f96949f = new Ze("UNCHECKED_TIME", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f96950g = new Ze("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f96951h = new Ze("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f96952i = new Ze("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f96953j = new Ze("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f96954k = new Ze("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f96955l = new Ze("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f96956m = new Ze("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f96957n = new Ze("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f96958o = new Ze("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f96959p = new Ze("SATELLITE_CLIDS_CHECKED", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f96960q = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f96961r = new Ze("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f96962s = new Ze("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C4918af(Ia ia2) {
        super(ia2);
    }

    public final long a(int i10) {
        return this.f96838a.getLong(f96948e.f96878b, i10);
    }

    public final boolean b(boolean z10) {
        return this.f96838a.getBoolean(f96949f.f96878b, z10);
    }

    public final C4918af c(boolean z10) {
        return (C4918af) b(f96950g.f96878b, z10);
    }

    public final C4918af d(long j10) {
        return (C4918af) b(f96948e.f96878b, j10);
    }

    public final boolean e() {
        return this.f96838a.getBoolean(f96947d.f96878b, false);
    }

    public final void f(boolean z10) {
        b(f96947d.f96878b, z10).b();
    }

    public final C4918af g() {
        return (C4918af) b(f96959p.f96878b, true);
    }

    public final C4918af h() {
        return (C4918af) b(f96958o.f96878b, true);
    }

    public final boolean i() {
        return this.f96838a.getBoolean(f96958o.f96878b, false);
    }

    public final boolean j() {
        return this.f96838a.getBoolean(f96959p.f96878b, false);
    }

    public final long a(long j10) {
        return this.f96838a.getLong(f96951h.f96878b, j10);
    }

    public final C4918af b(long j10) {
        return (C4918af) b(f96951h.f96878b, j10);
    }

    public final C4918af c(long j10) {
        return (C4918af) b(f96961r.f96878b, j10);
    }

    public final C4918af d(boolean z10) {
        return (C4918af) b(f96949f.f96878b, z10);
    }

    public final void e(boolean z10) {
        b(f96962s.f96878b, z10).b();
    }

    public final long f() {
        return this.f96838a.getLong(f96961r.f96878b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f96838a.getString(f96960q.f96878b, null);
    }

    public final C4918af b(@NonNull Ud ud2, int i10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f96952i;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f96954k;
        } else {
            ze2 = f96953j;
        }
        return ze2 != null ? (C4918af) b(ze2.f96878b, i10) : this;
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f96838a.a();
    }

    @Nullable
    public final Boolean d() {
        Ze ze2 = f96950g;
        if (!this.f96838a.a(ze2.f96878b)) {
            return null;
        }
        return Boolean.valueOf(this.f96838a.getBoolean(ze2.f96878b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5549zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f96878b;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f96960q.f96878b, str).b();
    }

    public final boolean a(boolean z10) {
        return this.f96838a.getBoolean(f96962s.f96878b, z10);
    }

    public final C4918af b(@NonNull Ud ud2, long j10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f96955l;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f96957n;
        } else {
            ze2 = f96956m;
        }
        return ze2 != null ? (C4918af) b(ze2.f96878b, j10) : this;
    }

    public final int a(@NonNull Ud ud2, int i10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f96952i;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f96954k;
        } else {
            ze2 = f96953j;
        }
        if (ze2 == null) {
            return i10;
        }
        return this.f96838a.getInt(ze2.f96878b, i10);
    }

    public final long a(@NonNull Ud ud2, long j10) {
        Ze ze2;
        int iOrdinal = ud2.ordinal();
        if (iOrdinal == 0) {
            ze2 = f96955l;
        } else if (iOrdinal != 1) {
            ze2 = iOrdinal != 2 ? null : f96957n;
        } else {
            ze2 = f96956m;
        }
        if (ze2 == null) {
            return j10;
        }
        return this.f96838a.getLong(ze2.f96878b, j10);
    }
}
