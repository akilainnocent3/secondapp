package kotlin;

import cs.g;
import dr.g0;
import dr.l1;
import kj.e;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.1")
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;

    @l
    public static final a Companion = new a(null);

    @l
    @g
    public static final KotlinVersion CURRENT = g0.a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    public KotlinVersion(int i10, int i11, int i12) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.version = versionOf(i10, i11, i12);
    }

    private final int versionOf(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + e.f102543c + i11 + e.f102543c + i12).toString());
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i10, int i11) {
        int i12 = this.major;
        if (i12 <= i10) {
            return i12 == i10 && this.minor >= i11;
        }
        return true;
    }

    @l
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append(e.f102543c);
        sb2.append(this.minor);
        sb2.append(e.f102543c);
        sb2.append(this.patch);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@l KotlinVersion other) {
        m0.p(other, "other");
        return this.version - other.version;
    }

    public KotlinVersion(int i10, int i11) {
        this(i10, i11, 0);
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.major;
        if (i13 > i10) {
            return true;
        }
        if (i13 != i10) {
            return false;
        }
        int i14 = this.minor;
        if (i14 <= i11) {
            return i14 == i11 && this.patch >= i12;
        }
        return true;
    }
}
