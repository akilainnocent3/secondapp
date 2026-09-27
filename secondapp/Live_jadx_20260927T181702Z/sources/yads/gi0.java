package yads;

import com.yandex.div.DivDataTag;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f149620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f149621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f149622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mq.m7 f149623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivDataTag f149624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f149625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf0 f149626h;

    public gi0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, mq.m7 m7Var, DivDataTag divDataTag, Set set, yf0 yf0Var) {
        this.f149619a = str;
        this.f149620b = jSONObject;
        this.f149621c = jSONObject2;
        this.f149622d = list;
        this.f149623e = m7Var;
        this.f149624f = divDataTag;
        this.f149625g = set;
        this.f149626h = yf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi0)) {
            return false;
        }
        gi0 gi0Var = (gi0) obj;
        return kotlin.jvm.internal.m0.g(this.f149619a, gi0Var.f149619a) && kotlin.jvm.internal.m0.g(this.f149620b, gi0Var.f149620b) && kotlin.jvm.internal.m0.g(this.f149621c, gi0Var.f149621c) && kotlin.jvm.internal.m0.g(this.f149622d, gi0Var.f149622d) && kotlin.jvm.internal.m0.g(this.f149623e, gi0Var.f149623e) && kotlin.jvm.internal.m0.g(this.f149624f, gi0Var.f149624f) && kotlin.jvm.internal.m0.g(this.f149625g, gi0Var.f149625g) && kotlin.jvm.internal.m0.g(this.f149626h, gi0Var.f149626h);
    }

    public final int hashCode() {
        int iHashCode = (this.f149620b.hashCode() + (this.f149619a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f149621c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.f149622d;
        return this.f149626h.hashCode() + ((this.f149625g.hashCode() + ((this.f149624f.hashCode() + ((this.f149623e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f149619a + ", card=" + this.f149620b + ", templates=" + this.f149621c + ", images=" + this.f149622d + ", divData=" + this.f149623e + ", divDataTag=" + this.f149624f + ", divAssets=" + this.f149625g + ", designAnalytics=" + this.f149626h + gi.j.f86771d;
    }
}
