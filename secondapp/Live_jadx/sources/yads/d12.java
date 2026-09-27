package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f147995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j5 f147996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f147997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f147998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f147999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f148000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final my2 f148001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c7 f148002j;

    public d12(List list, List list2, List list3, j5 j5Var, Map map, List list4, List list5, String str, my2 my2Var, c7 c7Var) {
        this.f147993a = list;
        this.f147994b = list2;
        this.f147995c = list3;
        this.f147996d = j5Var;
        this.f147997e = map;
        this.f147998f = list4;
        this.f147999g = list5;
        this.f148000h = str;
        this.f148001i = my2Var;
        this.f148002j = c7Var;
    }

    public final List a() {
        return this.f147998f;
    }

    public final my2 b() {
        return this.f148001i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d12)) {
            return false;
        }
        d12 d12Var = (d12) obj;
        return kotlin.jvm.internal.m0.g(this.f147993a, d12Var.f147993a) && kotlin.jvm.internal.m0.g(this.f147994b, d12Var.f147994b) && kotlin.jvm.internal.m0.g(this.f147995c, d12Var.f147995c) && kotlin.jvm.internal.m0.g(this.f147996d, d12Var.f147996d) && kotlin.jvm.internal.m0.g(this.f147997e, d12Var.f147997e) && kotlin.jvm.internal.m0.g(this.f147998f, d12Var.f147998f) && kotlin.jvm.internal.m0.g(this.f147999g, d12Var.f147999g) && kotlin.jvm.internal.m0.g(this.f148000h, d12Var.f148000h) && kotlin.jvm.internal.m0.g(this.f148001i, d12Var.f148001i) && kotlin.jvm.internal.m0.g(this.f148002j, d12Var.f148002j);
    }

    public final int hashCode() {
        int iA = eb.a(this.f147995c, eb.a(this.f147994b, this.f147993a.hashCode() * 31, 31), 31);
        j5 j5Var = this.f147996d;
        int iA2 = eb.a(this.f147999g, eb.a(this.f147998f, (this.f147997e.hashCode() + ((iA + (j5Var == null ? 0 : j5Var.f150935b.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f148000h;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        my2 my2Var = this.f148001i;
        int iHashCode2 = (iHashCode + (my2Var == null ? 0 : my2Var.hashCode())) * 31;
        c7 c7Var = this.f148002j;
        return iHashCode2 + (c7Var != null ? c7Var.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f147993a + ", assets=" + this.f147994b + ", renderTrackingUrls=" + this.f147995c + ", impressionData=" + this.f147996d + ", properties=" + this.f147997e + ", divKitDesigns=" + this.f147998f + ", showNotices=" + this.f147999g + ", version=" + this.f148000h + ", settings=" + this.f148001i + ", adPod=" + this.f148002j + gi.j.f86771d;
    }
}
