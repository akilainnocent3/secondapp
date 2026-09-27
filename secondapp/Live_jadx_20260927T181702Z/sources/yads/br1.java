package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class br1 {

    @oy.l
    public static final xq1 Companion = new xq1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zv.j[] f147309e = {null, null, null, new dw.f(yq1.f158455a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f147313d;

    public /* synthetic */ br1(int i10, String str, String str2, String str3, List list) {
        if (15 != (i10 & 15)) {
            dw.g2.b(i10, 15, wq1.f157478a.getDescriptor());
        }
        this.f147310a = str;
        this.f147311b = str2;
        this.f147312c = str3;
        this.f147313d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br1)) {
            return false;
        }
        br1 br1Var = (br1) obj;
        return kotlin.jvm.internal.m0.g(this.f147310a, br1Var.f147310a) && kotlin.jvm.internal.m0.g(this.f147311b, br1Var.f147311b) && kotlin.jvm.internal.m0.g(this.f147312c, br1Var.f147312c) && kotlin.jvm.internal.m0.g(this.f147313d, br1Var.f147313d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f147311b, this.f147310a.hashCode() * 31, 31);
        String str = this.f147312c;
        return this.f147313d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MediationNetworkData(name=" + this.f147310a + ", id=" + this.f147311b + ", version=" + this.f147312c + ", adapters=" + this.f147313d + gi.j.f86771d;
    }

    public br1(String str, String str2, String str3, ArrayList arrayList) {
        this.f147310a = str;
        this.f147311b = str2;
        this.f147312c = str3;
        this.f147313d = arrayList;
    }
}
