package no;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final c f117520a = new c(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements t7.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public final String f117521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final String f117522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public final String f117523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f117524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f117525e;

        public a() {
            this(null, null, null, 0L, 15, null);
        }

        public static /* synthetic */ a g(a aVar, String str, String str2, String str3, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f117521a;
            }
            if ((i10 & 2) != 0) {
                str2 = aVar.f117522b;
            }
            if ((i10 & 4) != 0) {
                str3 = aVar.f117523c;
            }
            if ((i10 & 8) != 0) {
                j10 = aVar.f117524d;
            }
            String str4 = str3;
            return aVar.f(str, str2, str4, j10);
        }

        @Override // t7.y
        public int a() {
            return this.f117525e;
        }

        @oy.m
        public final String b() {
            return this.f117521a;
        }

        @oy.m
        public final String c() {
            return this.f117522b;
        }

        @oy.m
        public final String d() {
            return this.f117523c;
        }

        public final long e() {
            return this.f117524d;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f117521a, aVar.f117521a) && kotlin.jvm.internal.m0.g(this.f117522b, aVar.f117522b) && kotlin.jvm.internal.m0.g(this.f117523c, aVar.f117523c) && this.f117524d == aVar.f117524d;
        }

        @oy.l
        public final a f(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            return new a(str, str2, str3, j10);
        }

        @oy.m
        public final String h() {
            return this.f117521a;
        }

        public int hashCode() {
            String str = this.f117521a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f117522b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f117523c;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + f0.p.a(this.f117524d);
        }

        public final long i() {
            return this.f117524d;
        }

        @Override // t7.y
        @oy.l
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putString("baseURL", this.f117521a);
            bundle.putString("linkAppend", this.f117522b);
            bundle.putString("channleType", this.f117523c);
            bundle.putLong("channel_time", this.f117524d);
            return bundle;
        }

        @oy.m
        public final String k() {
            return this.f117523c;
        }

        @oy.m
        public final String l() {
            return this.f117522b;
        }

        @oy.l
        public String toString() {
            return "ActionChannelToPlayer2(baseURL=" + this.f117521a + ", linkAppend=" + this.f117522b + ", channleType=" + this.f117523c + ", channelTime=" + this.f117524d + gi.j.f86771d;
        }

        public a(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            this.f117521a = str;
            this.f117522b = str2;
            this.f117523c = str3;
            this.f117524d = j10;
            this.f117525e = com.sports.live.football.tv.a.g.f73272f;
        }

        public /* synthetic */ a(String str, String str2, String str3, long j10, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? "abc" : str, (i10 & 2) != 0 ? "abc" : str2, (i10 & 4) != 0 ? "abc" : str3, (i10 & 8) != 0 ? 0L : j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements t7.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        public final String f117526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final String f117527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public final String f117528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f117529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f117530e;

        public b() {
            this(null, null, null, 0L, 15, null);
        }

        public static /* synthetic */ b g(b bVar, String str, String str2, String str3, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f117526a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f117527b;
            }
            if ((i10 & 4) != 0) {
                str3 = bVar.f117528c;
            }
            if ((i10 & 8) != 0) {
                j10 = bVar.f117529d;
            }
            String str4 = str3;
            return bVar.f(str, str2, str4, j10);
        }

        @Override // t7.y
        public int a() {
            return this.f117530e;
        }

        @oy.m
        public final String b() {
            return this.f117526a;
        }

        @oy.m
        public final String c() {
            return this.f117527b;
        }

        @oy.m
        public final String d() {
            return this.f117528c;
        }

        public final long e() {
            return this.f117529d;
        }

        public boolean equals(@oy.m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.m0.g(this.f117526a, bVar.f117526a) && kotlin.jvm.internal.m0.g(this.f117527b, bVar.f117527b) && kotlin.jvm.internal.m0.g(this.f117528c, bVar.f117528c) && this.f117529d == bVar.f117529d;
        }

        @oy.l
        public final b f(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            return new b(str, str2, str3, j10);
        }

        @oy.m
        public final String h() {
            return this.f117526a;
        }

        public int hashCode() {
            String str = this.f117526a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f117527b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f117528c;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + f0.p.a(this.f117529d);
        }

        public final long i() {
            return this.f117529d;
        }

        @Override // t7.y
        @oy.l
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putString("baseURL", this.f117526a);
            bundle.putString("linkAppend", this.f117527b);
            bundle.putString("channleType", this.f117528c);
            bundle.putLong("channel_time", this.f117529d);
            return bundle;
        }

        @oy.m
        public final String k() {
            return this.f117528c;
        }

        @oy.m
        public final String l() {
            return this.f117527b;
        }

        @oy.l
        public String toString() {
            return "ActionChannelToPlayer(baseURL=" + this.f117526a + ", linkAppend=" + this.f117527b + ", channleType=" + this.f117528c + ", channelTime=" + this.f117529d + gi.j.f86771d;
        }

        public b(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            this.f117526a = str;
            this.f117527b = str2;
            this.f117528c = str3;
            this.f117529d = j10;
            this.f117530e = com.sports.live.football.tv.a.g.f73265e;
        }

        public /* synthetic */ b(String str, String str2, String str3, long j10, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? "abc" : str, (i10 & 2) != 0 ? "abc" : str2, (i10 & 4) != 0 ? "abc" : str3, (i10 & 8) != 0 ? 0L : j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ t7.y b(c cVar, String str, String str2, String str3, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "abc";
            }
            if ((i10 & 2) != 0) {
                str2 = "abc";
            }
            if ((i10 & 4) != 0) {
                str3 = "abc";
            }
            if ((i10 & 8) != 0) {
                j10 = 0;
            }
            return cVar.a(str, str2, str3, j10);
        }

        public static /* synthetic */ t7.y d(c cVar, String str, String str2, String str3, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "abc";
            }
            if ((i10 & 2) != 0) {
                str2 = "abc";
            }
            if ((i10 & 4) != 0) {
                str3 = "abc";
            }
            if ((i10 & 8) != 0) {
                j10 = 0;
            }
            return cVar.c(str, str2, str3, j10);
        }

        @oy.l
        public final t7.y a(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            return new b(str, str2, str3, j10);
        }

        @oy.l
        public final t7.y c(@oy.m String str, @oy.m String str2, @oy.m String str3, long j10) {
            return new a(str, str2, str3, j10);
        }

        public c() {
        }
    }
}
