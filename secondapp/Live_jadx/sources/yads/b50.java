package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f147067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f147068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f147069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a50 f147070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f147071h;

    public b50(String str, String str2, boolean z10, String str3, String str4, String str5, a50 a50Var, ArrayList arrayList) {
        this.f147064a = str;
        this.f147065b = str2;
        this.f147066c = z10;
        this.f147067d = str3;
        this.f147068e = str4;
        this.f147069f = str5;
        this.f147070g = a50Var;
        this.f147071h = arrayList;
    }

    public final a50 a() {
        return this.f147070g;
    }

    public final String b() {
        return this.f147067d;
    }

    public final String c() {
        return this.f147068e;
    }

    public final String d() {
        return this.f147065b;
    }

    public final String e() {
        return this.f147064a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return kotlin.jvm.internal.m0.g(this.f147064a, b50Var.f147064a) && kotlin.jvm.internal.m0.g(this.f147065b, b50Var.f147065b) && this.f147066c == b50Var.f147066c && kotlin.jvm.internal.m0.g(this.f147067d, b50Var.f147067d) && kotlin.jvm.internal.m0.g(this.f147068e, b50Var.f147068e) && kotlin.jvm.internal.m0.g(this.f147069f, b50Var.f147069f) && kotlin.jvm.internal.m0.g(this.f147070g, b50Var.f147070g) && kotlin.jvm.internal.m0.g(this.f147071h, b50Var.f147071h);
    }

    public final String f() {
        return this.f147069f;
    }

    public final int hashCode() {
        int iHashCode = this.f147064a.hashCode() * 31;
        String str = this.f147065b;
        int iA = (g8.a.a(this.f147066c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f147067d;
        int iHashCode2 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f147068e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f147069f;
        int iHashCode4 = (this.f147070g.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        List list = this.f147071h;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAdapterData(name=" + this.f147064a + ", logoUrl=" + this.f147065b + ", adapterIntegrationStatus=" + this.f147066c + ", adapterVersion=" + this.f147067d + ", latestAdapterVersion=" + this.f147068e + ", sdkVersion=" + this.f147069f + ", adapterStatus=" + this.f147070g + ", formats=" + this.f147071h + gi.j.f86771d;
    }
}
