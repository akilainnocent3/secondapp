package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f147621b;

    public c80(List list, List list2) {
        this.f147620a = list;
        this.f147621b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return kotlin.jvm.internal.m0.g(this.f147620a, c80Var.f147620a) && kotlin.jvm.internal.m0.g(this.f147621b, c80Var.f147621b);
    }

    public final int hashCode() {
        return this.f147621b.hashCode() + (this.f147620a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f147620a + ", networkLogs=" + this.f147621b + gi.j.f86771d;
    }
}
