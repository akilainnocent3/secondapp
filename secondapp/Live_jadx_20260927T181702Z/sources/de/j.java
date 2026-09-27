package de;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f78959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f78960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f78961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f78962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f78963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f78964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f78965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f78966i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f78967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f78968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f78969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f78970d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f78971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f78972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f78973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public w f78974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f78975i;

        @Override // de.t.a
        public t a() {
            String str = "";
            if (this.f78967a == null) {
                str = " eventTimeMs";
            }
            if (this.f78970d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f78973g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f78967a.longValue(), this.f78968b, this.f78969c, this.f78970d.longValue(), this.f78971e, this.f78972f, this.f78973g.longValue(), this.f78974h, this.f78975i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // de.t.a
        public t.a b(@Nullable p pVar) {
            this.f78969c = pVar;
            return this;
        }

        @Override // de.t.a
        public t.a c(@Nullable Integer num) {
            this.f78968b = num;
            return this;
        }

        @Override // de.t.a
        public t.a d(long j10) {
            this.f78967a = Long.valueOf(j10);
            return this;
        }

        @Override // de.t.a
        public t.a e(long j10) {
            this.f78970d = Long.valueOf(j10);
            return this;
        }

        @Override // de.t.a
        public t.a f(@Nullable q qVar) {
            this.f78975i = qVar;
            return this;
        }

        @Override // de.t.a
        public t.a g(@Nullable w wVar) {
            this.f78974h = wVar;
            return this;
        }

        @Override // de.t.a
        public t.a h(@Nullable byte[] bArr) {
            this.f78971e = bArr;
            return this;
        }

        @Override // de.t.a
        public t.a i(@Nullable String str) {
            this.f78972f = str;
            return this;
        }

        @Override // de.t.a
        public t.a j(long j10) {
            this.f78973g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // de.t
    @Nullable
    public p b() {
        return this.f78960c;
    }

    @Override // de.t
    @Nullable
    public Integer c() {
        return this.f78959b;
    }

    @Override // de.t
    public long d() {
        return this.f78958a;
    }

    @Override // de.t
    public long e() {
        return this.f78961d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f78958a == tVar.d() && ((num = this.f78959b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f78960c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f78961d == tVar.e()) {
                if (Arrays.equals(this.f78962e, tVar instanceof j ? ((j) tVar).f78962e : tVar.h()) && ((str = this.f78963f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f78964g == tVar.j() && ((wVar = this.f78965h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f78966i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // de.t
    @Nullable
    public q f() {
        return this.f78966i;
    }

    @Override // de.t
    @Nullable
    public w g() {
        return this.f78965h;
    }

    @Override // de.t
    @Nullable
    public byte[] h() {
        return this.f78962e;
    }

    public int hashCode() {
        long j10 = this.f78958a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f78959b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f78960c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f78961d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f78962e)) * 1000003;
        String str = this.f78963f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f78964g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f78965h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f78966i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // de.t
    @Nullable
    public String i() {
        return this.f78963f;
    }

    @Override // de.t
    public long j() {
        return this.f78964g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f78958a + ", eventCode=" + this.f78959b + ", complianceData=" + this.f78960c + ", eventUptimeMs=" + this.f78961d + ", sourceExtension=" + Arrays.toString(this.f78962e) + ", sourceExtensionJsonProto3=" + this.f78963f + ", timezoneOffsetSeconds=" + this.f78964g + ", networkConnectionInfo=" + this.f78965h + ", experimentIds=" + this.f78966i + "}";
    }

    public j(long j10, @Nullable Integer num, @Nullable p pVar, long j11, @Nullable byte[] bArr, @Nullable String str, long j12, @Nullable w wVar, @Nullable q qVar) {
        this.f78958a = j10;
        this.f78959b = num;
        this.f78960c = pVar;
        this.f78961d = j11;
        this.f78962e = bArr;
        this.f78963f = str;
        this.f78964g = j12;
        this.f78965h = wVar;
        this.f78966i = qVar;
    }
}
