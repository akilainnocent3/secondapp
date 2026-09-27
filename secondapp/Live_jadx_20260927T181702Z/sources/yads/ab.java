package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f146726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146728c;

    public ab(String str, String str2, boolean z10) {
        this.f146726a = z10;
        this.f146727b = str;
        this.f146728c = str2;
    }

    public final String a() {
        return this.f146728c;
    }

    public final String b() {
        return this.f146727b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.f146726a == abVar.f146726a && kotlin.jvm.internal.m0.g(this.f146727b, abVar.f146727b) && kotlin.jvm.internal.m0.g(this.f146728c, abVar.f146728c);
    }

    public final int hashCode() {
        return this.f146728c.hashCode() + k4.a(this.f146727b, g8.a.a(this.f146726a) * 31, 31);
    }

    public final String toString() {
        return "AdTuneInfo(shouldShow=" + this.f146726a + ", token=" + this.f146727b + ", advertiserInfo=" + this.f146728c + gi.j.f86771d;
    }
}
