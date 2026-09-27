package ae;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4849a;

    public e(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f4849a = str;
    }

    public static e b(@NonNull String str) {
        return new e(str);
    }

    public String a() {
        return this.f4849a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f4849a.equals(((e) obj).f4849a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4849a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f4849a + "\"}";
    }
}
