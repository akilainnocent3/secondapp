package ea;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@da.d
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final List<Activity> f80595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80596b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@oy.l List<? extends Activity> activities, boolean z10) {
        m0.p(activities, "activities");
        this.f80595a = activities;
        this.f80596b = z10;
    }

    public final boolean a(@oy.l Activity activity) {
        m0.p(activity, "activity");
        return this.f80595a.contains(activity);
    }

    @oy.l
    public final List<Activity> b() {
        return this.f80595a;
    }

    public final boolean c() {
        return this.f80596b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return (m0.g(this.f80595a, bVar.f80595a) || this.f80596b == bVar.f80596b) ? false : true;
    }

    public int hashCode() {
        return ((this.f80596b ? 1 : 0) * 31) + this.f80595a.hashCode();
    }

    @oy.l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityStack{");
        sb2.append(m0.C("activities=", b()));
        sb2.append("isEmpty=" + this.f80596b + fw.b.f85383j);
        String string = sb2.toString();
        m0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ b(List list, boolean z10, int i10, x xVar) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
