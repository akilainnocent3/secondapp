package jg;

import android.net.Uri;
import androidx.annotation.Nullable;
import cj.v6;
import cj.x6;
import eh.o1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f100097m = "0";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f100098n = "control";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f100099o = "fmtp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f100100p = "length";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f100101q = "range";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f100102r = "rtpmap";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f100103s = "tool";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f100104t = "type";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6<String, String> f100105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v6<jg.b> f100106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f100108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f100109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f100110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Uri f100111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f100112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f100113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f100114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f100115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f100116l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f100117a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v6.a<jg.b> f100118b = new v6.a<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f100119c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f100120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f100121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f100122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Uri f100123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f100124h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public String f100125i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f100126j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public String f100127k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public String f100128l;

        @qj.a
        public b m(String str, String str2) {
            this.f100117a.put(str, str2);
            return this;
        }

        @qj.a
        public b n(jg.b bVar) {
            this.f100118b.g(bVar);
            return this;
        }

        public a0 o() {
            return new a0(this);
        }

        @qj.a
        public b p(int i10) {
            this.f100119c = i10;
            return this;
        }

        @qj.a
        public b q(String str) {
            this.f100124h = str;
            return this;
        }

        @qj.a
        public b r(String str) {
            this.f100127k = str;
            return this;
        }

        @qj.a
        public b s(String str) {
            this.f100125i = str;
            return this;
        }

        @qj.a
        public b t(String str) {
            this.f100121e = str;
            return this;
        }

        @qj.a
        public b u(String str) {
            this.f100128l = str;
            return this;
        }

        @qj.a
        public b v(String str) {
            this.f100126j = str;
            return this;
        }

        @qj.a
        public b w(String str) {
            this.f100120d = str;
            return this;
        }

        @qj.a
        public b x(String str) {
            this.f100122f = str;
            return this;
        }

        @qj.a
        public b y(Uri uri) {
            this.f100123g = uri;
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f100110f == a0Var.f100110f && this.f100105a.equals(a0Var.f100105a) && this.f100106b.equals(a0Var.f100106b) && o1.g(this.f100108d, a0Var.f100108d) && o1.g(this.f100107c, a0Var.f100107c) && o1.g(this.f100109e, a0Var.f100109e) && o1.g(this.f100116l, a0Var.f100116l) && o1.g(this.f100111g, a0Var.f100111g) && o1.g(this.f100114j, a0Var.f100114j) && o1.g(this.f100115k, a0Var.f100115k) && o1.g(this.f100112h, a0Var.f100112h) && o1.g(this.f100113i, a0Var.f100113i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((217 + this.f100105a.hashCode()) * 31) + this.f100106b.hashCode()) * 31;
        String str = this.f100108d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f100107c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f100109e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f100110f) * 31;
        String str4 = this.f100116l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f100111g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f100114j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f100115k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f100112h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f100113i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public a0(b bVar) {
        this.f100105a = x6.m(bVar.f100117a);
        this.f100106b = bVar.f100118b.e();
        this.f100107c = (String) o1.o(bVar.f100120d);
        this.f100108d = (String) o1.o(bVar.f100121e);
        this.f100109e = (String) o1.o(bVar.f100122f);
        this.f100111g = bVar.f100123g;
        this.f100112h = bVar.f100124h;
        this.f100110f = bVar.f100119c;
        this.f100113i = bVar.f100125i;
        this.f100114j = bVar.f100127k;
        this.f100115k = bVar.f100128l;
        this.f100116l = bVar.f100126j;
    }
}
