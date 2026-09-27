package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la f147465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f147467d;

    public c00(String str, la laVar, String str2, List list) {
        this.f147464a = str;
        this.f147465b = laVar;
        this.f147466c = str2;
        this.f147467d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) obj;
        return kotlin.jvm.internal.m0.g(this.f147464a, c00Var.f147464a) && kotlin.jvm.internal.m0.g(this.f147465b, c00Var.f147465b) && kotlin.jvm.internal.m0.g(this.f147466c, c00Var.f147466c) && kotlin.jvm.internal.m0.g(this.f147467d, c00Var.f147467d);
    }

    public final int hashCode() {
        int iHashCode = this.f147464a.hashCode() * 31;
        la laVar = this.f147465b;
        int iHashCode2 = (iHashCode + (laVar == null ? 0 : laVar.hashCode())) * 31;
        String str = this.f147466c;
        return this.f147467d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CoreAdInfo(adUnitId=" + this.f147464a + ", adSize=" + this.f147465b + ", data=" + this.f147466c + ", creatives=" + this.f147467d + gi.j.f86771d;
    }
}
