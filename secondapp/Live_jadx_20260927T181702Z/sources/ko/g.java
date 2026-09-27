package ko;

import a9.w;
import a9.x0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@w(tableName = "event_table")
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @x0(autoGenerate = true)
    public final int f102681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f102683c;

    public g(int i10, int i11, @oy.l String eventName) {
        m0.p(eventName, "eventName");
        this.f102681a = i10;
        this.f102682b = i11;
        this.f102683c = eventName;
    }

    public static /* synthetic */ g e(g gVar, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = gVar.f102681a;
        }
        if ((i12 & 2) != 0) {
            i11 = gVar.f102682b;
        }
        if ((i12 & 4) != 0) {
            str = gVar.f102683c;
        }
        return gVar.d(i10, i11, str);
    }

    public final int a() {
        return this.f102681a;
    }

    public final int b() {
        return this.f102682b;
    }

    @oy.l
    public final String c() {
        return this.f102683c;
    }

    @oy.l
    public final g d(int i10, int i11, @oy.l String eventName) {
        m0.p(eventName, "eventName");
        return new g(i10, i11, eventName);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f102681a == gVar.f102681a && this.f102682b == gVar.f102682b && m0.g(this.f102683c, gVar.f102683c);
    }

    public final int f() {
        return this.f102682b;
    }

    @oy.l
    public final String g() {
        return this.f102683c;
    }

    public final int h() {
        return this.f102681a;
    }

    public int hashCode() {
        return (((this.f102681a * 31) + this.f102682b) * 31) + this.f102683c.hashCode();
    }

    @oy.l
    public String toString() {
        return "FavEventEntity(id=" + this.f102681a + ", eventCode=" + this.f102682b + ", eventName=" + this.f102683c + gi.j.f86771d;
    }

    public /* synthetic */ g(int i10, int i11, String str, int i12, x xVar) {
        this((i12 & 1) != 0 ? 0 : i10, i11, str);
    }
}
