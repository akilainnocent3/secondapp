package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class zi5 implements yi5 {
    public final yi5.b a;
    public final yi5.a b;
    public final yi5.c c;

    public static final class a implements yi5.a {
        public final String a = "null";

        public a(int i) {
        }

        @Override // yi5.a
        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Apis(sportybetPortal=", this.a, ")");
        }
    }

    public static final class b implements yi5.b {
        public final boolean a = true;
        public final boolean b = true;
        public final boolean c = true;

        public b(int i) {
        }

        @Override // yi5.b
        public final boolean a() {
            return false;
        }

        @Override // yi5.b
        public final boolean b() {
            return false;
        }

        @Override // yi5.b
        public final boolean c() {
            return false;
        }

        @Override // yi5.b
        public final boolean d() {
            return false;
        }

        @Override // yi5.b
        public final boolean e() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        @Override // yi5.b
        public final boolean f() {
            return this.b;
        }

        @Override // yi5.b
        public final boolean g() {
            return this.a;
        }

        @Override // yi5.b
        public final boolean h() {
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false), 31, false), 31, false), 31, false), 31, false), 31, false);
        }

        public final String toString() {
            return mq0.a(cwz.a("Features(enableFirebaseCrashlytics=", ", enableFirebaseAnalytics=", ", enableLogs=false, enableCrashReportScreen=false, enableWebViewDebug=false, enableDebugMenu=false, overrideNetworkConfig=false, enableBrSecurityRequirements=false, enableGeoRestriction=", this.a, this.b), this.c, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c implements yi5.c {
        public final xi5 a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final int g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;
        public final String o;

        public c(int i) {
            Object next;
            xi5.a.getClass();
            String upperCase = StringsKt.t0("GOOGLE_PLAY").toString().toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Iterator<T> it = xi5.i.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((xi5) next).name(), upperCase));
            xi5 xi5Var = (xi5) next;
            if (xi5Var == null) {
                hb5.a("Unknown BUILD_CHANNEL value: GOOGLE_PLAY");
                throw null;
            }
            boolean z = xi5Var == xi5.c;
            boolean z2 = xi5Var == xi5.d;
            boolean z3 = xi5Var == xi5.e;
            boolean z4 = xi5Var != xi5.b;
            String str = Build.VERSION.RELEASE;
            str.getClass();
            String str2 = Build.MODEL;
            str2.getClass();
            this.a = xi5Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = "1.82.2";
            this.g = 1082002;
            this.h = "com.sportybet.android.gp.tz";
            this.i = "24908";
            this.j = "tz";
            this.k = "google-play-store";
            this.l = "master";
            this.m = "null";
            this.n = str;
            this.o = str2;
        }

        @Override // yi5.c
        public final String a() {
            return this.f;
        }

        @Override // yi5.c
        public final String b() {
            return this.i;
        }

        @Override // yi5.c
        public final String c() {
            return this.m;
        }

        @Override // yi5.c
        public final String d() {
            return this.n;
        }

        @Override // yi5.c
        public final String e() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && Intrinsics.g(this.f, cVar.f) && this.g == cVar.g && Intrinsics.g(this.h, cVar.h) && Intrinsics.g(this.i, cVar.i) && Intrinsics.g(this.j, cVar.j) && Intrinsics.g(this.k, cVar.k) && Intrinsics.g(this.l, cVar.l) && Intrinsics.g(this.m, cVar.m) && Intrinsics.g(this.n, cVar.n) && Intrinsics.g(this.o, cVar.o);
        }

        @Override // yi5.c
        public final boolean f() {
            return this.e;
        }

        @Override // yi5.c
        public final boolean g() {
            return this.d;
        }

        @Override // yi5.c
        public final int getVersionCode() {
            return this.g;
        }

        @Override // yi5.c
        public final xi5 h() {
            return this.a;
        }

        public final int hashCode() {
            return this.o.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.g, gmf0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
        }

        @Override // yi5.c
        public final boolean i() {
            return false;
        }

        @Override // yi5.c
        public final boolean j() {
            return this.b;
        }

        @Override // yi5.c
        public final boolean k() {
            return this.c;
        }

        @Override // yi5.c
        public final String l() {
            return this.k;
        }

        @Override // yi5.c
        public final String m() {
            return this.o;
        }

        @Override // yi5.c
        public final String n() {
            return this.l;
        }

        @Override // yi5.c
        public final String o() {
            return this.j;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(buildChannel=");
            sb.append(this.a);
            sb.append(", isGooglePlayVersion=");
            sb.append(this.b);
            sb.append(", isHuaweiVersion=");
            nng.a(", isPalmVersion=", ", isStoreVersion=", sb, this.c, this.d);
            mng.a(", isDebugBuild=false, versionName=", this.f, ", versionCode=", sb, this.e);
            f78.b(this.g, ", applicationId=", this.h, ", buildNumber=", sb);
            hxa.c(sb, this.i, ", defaultCountryCode=", this.j, ", downloadSource=");
            hxa.c(sb, this.k, ", gitBranch=", this.l, ", gameSdkVersion=");
            hxa.c(sb, this.m, ", osVersion=", this.n, ", phoneModel=");
            return uf80.a(sb, this.o, ")");
        }
    }

    public zi5(int i) {
        b bVar = new b(0);
        a aVar = new a(0);
        c cVar = new c(0);
        this.a = bVar;
        this.b = aVar;
        this.c = cVar;
    }

    @Override // defpackage.yi5
    public final yi5.b a() {
        return this.a;
    }

    @Override // defpackage.yi5
    public final yi5.c b() {
        return this.c;
    }

    @Override // defpackage.yi5
    public final yi5.a c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi5)) {
            return false;
        }
        zi5 zi5Var = (zi5) obj;
        return Intrinsics.g(this.a, zi5Var.a) && Intrinsics.g(this.b, zi5Var.b) && Intrinsics.g(this.c, zi5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BuildConfigurationImpl(features=" + this.a + ", apis=" + this.b + ", info=" + this.c + ")";
    }
}
