package h5;

import androidx.annotation.Nullable;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87664e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f87665f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87666g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87670d;

    public b(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87669c == bVar.f87669c && this.f87670d == bVar.f87670d && Objects.equals(this.f87667a, bVar.f87667a) && Objects.equals(this.f87668b, bVar.f87668b);
    }

    public int hashCode() {
        return Objects.hash(this.f87667a, this.f87668b, Integer.valueOf(this.f87669c), Integer.valueOf(this.f87670d));
    }

    public b(String str, String str2, int i10, int i11) {
        this.f87667a = str;
        this.f87668b = str2;
        this.f87669c = i10;
        this.f87670d = i11;
    }
}
