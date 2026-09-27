package m5;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import cj.v6;
import cj.x6;
import cj.z7;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class f extends j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f106295x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f106296y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f106297z = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f106298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f106299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f106300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f106301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f106302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f106303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f106304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f106305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f106306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f106307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f106308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f106309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f106310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DrmInitData f106311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<g> f106312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<d> f106313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<Uri, C1002f> f106314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f106315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f106316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v6<c> f106317w;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {
        public static final String A = "JUMP";
        public static final String B = "POINT";
        public static final String C = "RANGE";
        public static final String D = "HIGHLIGHT";
        public static final String E = "PRIMARY";

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final String f106325u = "PRE";

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final String f106326v = "POST";

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final String f106327w = "ONCE";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final String f106328x = "IN";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final String f106329y = "OUT";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final String f106330z = "SKIP";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Uri f106332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Uri f106333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f106334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f106335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f106336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f106337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f106338h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f106339i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f106340j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f106341k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final v6<String> f106342l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final v6<String> f106343m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final v6<b> f106344n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f106345o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final String f106346p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f106347q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final long f106348r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final long f106349s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public final String f106350t;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f106351a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Uri f106353c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Uri f106354d;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f106360j;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public Boolean f106365o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public String f106366p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public String f106367q;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            @Nullable
            public String f106370t;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Map<String, b> f106352b = new HashMap();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f106355e = -9223372036854775807L;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f106356f = -9223372036854775807L;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public long f106357g = -9223372036854775807L;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public long f106358h = -9223372036854775807L;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public List<String> f106359i = new ArrayList();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public long f106361k = -9223372036854775807L;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public long f106362l = -9223372036854775807L;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public List<String> f106363m = new ArrayList();

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public List<String> f106364n = new ArrayList();

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public long f106368r = -9223372036854775807L;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public long f106369s = -9223372036854775807L;

            public a(String str) {
                this.f106351a = str;
            }

            @Nullable
            public c a() {
                Uri uri = this.f106354d;
                if ((uri != null || this.f106353c == null) && (uri == null || this.f106353c != null)) {
                    return null;
                }
                long j10 = this.f106355e;
                if (j10 == -9223372036854775807L) {
                    return null;
                }
                String str = this.f106351a;
                Uri uri2 = this.f106353c;
                long j11 = this.f106356f;
                long j12 = this.f106357g;
                long j13 = this.f106358h;
                List<String> list = this.f106359i;
                boolean z10 = this.f106360j;
                long j14 = this.f106361k;
                long j15 = this.f106362l;
                List<String> list2 = this.f106363m;
                List<String> list3 = this.f106364n;
                ArrayList arrayList = new ArrayList(this.f106352b.values());
                Boolean bool = this.f106365o;
                boolean z11 = bool == null || bool.booleanValue();
                String str2 = this.f106366p;
                if (str2 == null) {
                    str2 = c.B;
                }
                String str3 = str2;
                String str4 = this.f106367q;
                if (str4 == null) {
                    str4 = c.D;
                }
                return new c(str, uri2, uri, j10, j11, j12, j13, list, z10, j14, j15, list2, list3, arrayList, z11, str3, str4, this.f106368r, this.f106369s, this.f106370t);
            }

            @qj.a
            public a b(@Nullable Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f106354d;
                if (uri2 != null) {
                    l0.y(uri2.equals(uri), "Can't change assetListUri from %s to %s", this.f106354d, uri);
                }
                this.f106354d = uri;
                return this;
            }

            @qj.a
            public a c(@Nullable Uri uri) {
                if (uri == null) {
                    return this;
                }
                Uri uri2 = this.f106353c;
                if (uri2 != null) {
                    l0.y(uri2.equals(uri), "Can't change assetUri from %s to %s", this.f106353c, uri);
                }
                this.f106353c = uri;
                return this;
            }

            @qj.a
            public a d(List<b> list) {
                if (!list.isEmpty()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        b bVar = list.get(i10);
                        String str = bVar.f106321a;
                        b bVar2 = this.f106352b.get(str);
                        if (bVar2 != null) {
                            l0.B(bVar2.equals(bVar), "Can't change %s from %s %s to %s %s", str, bVar2.f106324d, Double.valueOf(bVar2.f106323c), bVar.f106324d, Double.valueOf(bVar.f106323c));
                        }
                        this.f106352b.put(str, bVar);
                    }
                }
                return this;
            }

            @qj.a
            public a e(@Nullable Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.f106365o;
                if (bool2 != null) {
                    l0.y(bool2.equals(bool), "Can't change contentMayVary from %s to %s", this.f106365o, bool);
                }
                this.f106365o = bool;
                return this;
            }

            @qj.a
            public a f(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f106359i.isEmpty()) {
                    l0.e(this.f106359i.equals(list), "Can't change cue from " + m5.h.a(", ", this.f106359i) + " to " + m5.h.a(", ", list));
                }
                this.f106359i = list;
                return this;
            }

            @qj.a
            public a g(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106357g;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change durationUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106357g = j11;
                return this;
            }

            @qj.a
            public a h(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106356f;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change endDateUnixUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106356f = j11;
                return this;
            }

            @qj.a
            public a i(boolean z10) {
                if (!z10) {
                    return this;
                }
                this.f106360j = true;
                return this;
            }

            @qj.a
            public a j(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106358h;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change plannedDurationUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106358h = j11;
                return this;
            }

            @qj.a
            public a k(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106362l;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change playoutLimitUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106362l = j11;
                return this;
            }

            @qj.a
            public a l(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f106364n.isEmpty()) {
                    l0.e(this.f106364n.equals(list), "Can't change restrictions from " + m5.h.a(", ", this.f106364n) + " to " + m5.h.a(", ", list));
                }
                this.f106364n = list;
                return this;
            }

            @qj.a
            public a m(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106361k;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change resumeOffsetUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106361k = j11;
                return this;
            }

            @qj.a
            public a n(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106369s;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change skipControlDurationUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106369s = j11;
                return this;
            }

            @qj.a
            public a o(@Nullable String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f106370t;
                if (str2 != null) {
                    l0.y(str2.equals(str), "Can't change skipControlLabelId from %s to %s", this.f106370t, str);
                }
                this.f106370t = str;
                return this;
            }

            @qj.a
            public a p(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106368r;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change skipControlOffsetUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106368r = j11;
                return this;
            }

            @qj.a
            public a q(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f106363m.isEmpty()) {
                    l0.e(this.f106363m.equals(list), "Can't change snapTypes from " + m5.h.a(", ", this.f106363m) + " to " + m5.h.a(", ", list));
                }
                this.f106363m = list;
                return this;
            }

            @qj.a
            public a r(long j10) {
                long j11;
                if (j10 == -9223372036854775807L) {
                    return this;
                }
                long j12 = this.f106355e;
                if (j12 != -9223372036854775807L) {
                    j11 = j10;
                    l0.s(j12 == j10, "Can't change startDateUnixUs from %s to %s", j12, j11);
                } else {
                    j11 = j10;
                }
                this.f106355e = j11;
                return this;
            }

            @qj.a
            public a s(@Nullable String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f106366p;
                if (str2 != null) {
                    l0.y(str2.equals(str), "Can't change timelineOccupies from %s to %s", this.f106366p, str);
                }
                this.f106366p = str;
                return this;
            }

            @qj.a
            public a t(@Nullable String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.f106367q;
                if (str2 != null) {
                    l0.y(str2.equals(str), "Can't change timelineStyle from %s to %s", this.f106367q, str);
                }
                this.f106367q = str;
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        /* JADX INFO: renamed from: m5.f$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1000c {
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface d {
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface e {
        }

        /* JADX INFO: renamed from: m5.f$c$f, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1001f {
        }

        public c(String str, @Nullable Uri uri, @Nullable Uri uri2, long j10, long j11, long j12, long j13, List<String> list, boolean z10, long j14, long j15, List<String> list2, List<String> list3, List<b> list4, boolean z11, String str2, String str3, long j16, long j17, @Nullable String str4) {
            l0.d((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f106331a = str;
            this.f106332b = uri;
            this.f106333c = uri2;
            this.f106334d = j10;
            this.f106335e = j11;
            this.f106336f = j12;
            this.f106337g = j13;
            this.f106338h = list;
            this.f106339i = z10;
            this.f106340j = j14;
            this.f106341k = j15;
            this.f106342l = v6.u(list2);
            this.f106343m = v6.u(list3);
            this.f106344n = v6.R(new Comparator() { // from class: m5.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((f.b) obj).f106321a.compareTo(((f.b) obj2).f106321a);
                }
            }, list4);
            this.f106345o = z11;
            this.f106346p = str2;
            this.f106347q = str3;
            this.f106348r = j16;
            this.f106349s = j17;
            this.f106350t = str4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f106334d == cVar.f106334d && this.f106335e == cVar.f106335e && this.f106336f == cVar.f106336f && this.f106337g == cVar.f106337g && this.f106339i == cVar.f106339i && this.f106340j == cVar.f106340j && this.f106341k == cVar.f106341k && this.f106345o == cVar.f106345o && this.f106348r == cVar.f106348r && this.f106349s == cVar.f106349s && Objects.equals(this.f106331a, cVar.f106331a) && Objects.equals(this.f106332b, cVar.f106332b) && Objects.equals(this.f106333c, cVar.f106333c) && Objects.equals(this.f106338h, cVar.f106338h) && Objects.equals(this.f106342l, cVar.f106342l) && Objects.equals(this.f106343m, cVar.f106343m) && Objects.equals(this.f106344n, cVar.f106344n) && Objects.equals(this.f106346p, cVar.f106346p) && Objects.equals(this.f106347q, cVar.f106347q) && Objects.equals(this.f106350t, cVar.f106350t);
        }

        public int hashCode() {
            return Objects.hash(this.f106331a, this.f106332b, this.f106333c, Long.valueOf(this.f106334d), Long.valueOf(this.f106335e), Long.valueOf(this.f106336f), Long.valueOf(this.f106337g), this.f106338h, Boolean.valueOf(this.f106339i), Long.valueOf(this.f106340j), Long.valueOf(this.f106341k), this.f106342l, this.f106343m, this.f106344n, Boolean.valueOf(this.f106345o), this.f106346p, this.f106347q, Long.valueOf(this.f106348r), Long.valueOf(this.f106349s), this.f106350t);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f106371m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f106372n;

        public d(String str, @Nullable g gVar, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, gVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f106371m = z11;
            this.f106372n = z12;
        }

        public d b(long j10, int i10) {
            return new d(this.f106378b, this.f106379c, this.f106380d, i10, j10, this.f106383g, this.f106384h, this.f106385i, this.f106386j, this.f106387k, this.f106388l, this.f106371m, this.f106372n);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: renamed from: m5.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1002f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f106373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f106374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f106375c;

        public C1002f(Uri uri, long j10, int i10) {
            this.f106373a = uri;
            this.f106374b = j10;
            this.f106375c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final g f106379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f106380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f106381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f106382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final DrmInitData f106383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f106384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f106385i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f106386j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f106387k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f106388l;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f106382f > l10.longValue()) {
                return 1;
            }
            return this.f106382f < l10.longValue() ? -1 : 0;
        }

        public h(String str, @Nullable g gVar, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10) {
            this.f106378b = str;
            this.f106379c = gVar;
            this.f106380d = j10;
            this.f106381e = i10;
            this.f106382f = j11;
            this.f106383g = drmInitData;
            this.f106384h = str2;
            this.f106385i = str3;
            this.f106386j = j12;
            this.f106387k = j13;
            this.f106388l = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f106389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f106391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f106392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f106393e;

        public i(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f106389a = j10;
            this.f106390b = z10;
            this.f106391c = j11;
            this.f106392d = j12;
            this.f106393e = z11;
        }
    }

    public f(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, @Nullable DrmInitData drmInitData, List<g> list2, List<d> list3, i iVar, Map<Uri, C1002f> map, List<c> list4) {
        super(str, list, z12);
        this.f106298d = i10;
        this.f106302h = j11;
        this.f106301g = z10;
        this.f106303i = z11;
        this.f106304j = i11;
        this.f106305k = j12;
        this.f106306l = i12;
        this.f106307m = j13;
        this.f106308n = j14;
        this.f106309o = z13;
        this.f106310p = z14;
        this.f106311q = drmInitData;
        this.f106312r = v6.u(list2);
        this.f106313s = v6.u(list3);
        this.f106314t = x6.m(map);
        this.f106317w = v6.u(list4);
        if (!list3.isEmpty()) {
            d dVar = (d) z7.w(list3);
            this.f106315u = dVar.f106382f + dVar.f106380d;
        } else if (list2.isEmpty()) {
            this.f106315u = 0L;
        } else {
            g gVar = (g) z7.w(list2);
            this.f106315u = gVar.f106382f + gVar.f106380d;
        }
        this.f106299e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f106315u, j10) : Math.max(0L, this.f106315u + j10) : -9223372036854775807L;
        this.f106300f = j10 >= 0;
        this.f106316v = iVar;
    }

    public f b(long j10, int i10) {
        return new f(this.f106298d, this.f106421a, this.f106422b, this.f106299e, this.f106301g, j10, true, i10, this.f106305k, this.f106306l, this.f106307m, this.f106308n, this.f106423c, this.f106309o, this.f106310p, this.f106311q, this.f106312r, this.f106313s, this.f106316v, this.f106314t, this.f106317w);
    }

    public f c() {
        return this.f106309o ? this : new f(this.f106298d, this.f106421a, this.f106422b, this.f106299e, this.f106301g, this.f106302h, this.f106303i, this.f106304j, this.f106305k, this.f106306l, this.f106307m, this.f106308n, this.f106423c, true, this.f106310p, this.f106311q, this.f106312r, this.f106313s, this.f106316v, this.f106314t, this.f106317w);
    }

    public long d() {
        return this.f106302h + this.f106315u;
    }

    public boolean e(@Nullable f fVar) {
        if (fVar != null) {
            long j10 = this.f106305k;
            long j11 = fVar.f106305k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f106312r.size() - fVar.f106312r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f106313s.size();
                int size3 = fVar.f106313s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f106309o || fVar.f106309o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f106376m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<d> f106377n;

        public g(String str, long j10, long j11, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, v6.z());
        }

        public g b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f106377n.size(); i11++) {
                d dVar = this.f106377n.get(i11);
                arrayList.add(dVar.b(j11, i10));
                j11 += dVar.f106380d;
            }
            return new g(this.f106378b, this.f106379c, this.f106376m, this.f106380d, i10, j10, this.f106383g, this.f106384h, this.f106385i, this.f106386j, this.f106387k, this.f106388l, arrayList);
        }

        public g(String str, @Nullable g gVar, String str2, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j12, long j13, boolean z10, List<d> list) {
            super(str, gVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f106376m = str2;
            this.f106377n = v6.u(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f106318e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f106319f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f106320g = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f106322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f106323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f106324d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(String str, double d10) {
            this.f106321a = str;
            this.f106322b = 2;
            this.f106323c = d10;
            this.f106324d = null;
        }

        public double c() {
            l0.g0(this.f106322b == 2);
            return this.f106323c;
        }

        public String d() {
            l0.g0(this.f106322b != 2);
            return (String) l0.E(this.f106324d);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f106322b == bVar.f106322b && Double.compare(this.f106323c, bVar.f106323c) == 0 && Objects.equals(this.f106321a, bVar.f106321a) && Objects.equals(this.f106324d, bVar.f106324d);
        }

        public int hashCode() {
            return Objects.hash(this.f106321a, Integer.valueOf(this.f106322b), Double.valueOf(this.f106323c), this.f106324d);
        }

        public b(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            l0.g0(z10);
            this.f106321a = str;
            this.f106322b = i10;
            this.f106324d = str2;
            this.f106323c = 0.0d;
        }
    }

    @Override // q5.z
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f copy(List<StreamKey> list) {
        return this;
    }
}
