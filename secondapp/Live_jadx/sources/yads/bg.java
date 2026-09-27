package yads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147179b;

    public bg(cg cgVar, JSONObject jSONObject) {
        this.f147178a = cgVar.a();
        this.f147179b = jSONObject.toString();
    }

    public final String a() {
        return this.f147178a;
    }

    public final String b() {
        return this.f147179b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return kotlin.jvm.internal.m0.g(bgVar.f147178a, this.f147178a) && kotlin.jvm.internal.m0.g(bgVar.f147179b, this.f147179b);
    }

    public final int hashCode() {
        return this.f147179b.hashCode() + (this.f147178a.hashCode() * 31);
    }
}
