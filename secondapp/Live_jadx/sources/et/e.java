package et;

import java.io.Serializable;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final a f81619d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    public static final e f81620e = new e(-1, -1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81622c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @l
        public final e a() {
            return e.f81620e;
        }

        public a() {
        }
    }

    public e(int i10, int i11) {
        this.f81621b = i10;
        this.f81622c = i11;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f81621b == eVar.f81621b && this.f81622c == eVar.f81622c;
    }

    public int hashCode() {
        return (this.f81621b * 31) + this.f81622c;
    }

    @l
    public String toString() {
        return "Position(line=" + this.f81621b + ", column=" + this.f81622c + ')';
    }
}
