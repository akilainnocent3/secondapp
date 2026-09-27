package re;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class d4 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f125405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125406c;

    public d4(@Nullable String str, @Nullable Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f125405b = z10;
        this.f125406c = i10;
    }

    public static d4 a(@Nullable String str, @Nullable Throwable th2) {
        return new d4(str, th2, true, 1);
    }

    public static d4 b(@Nullable String str, @Nullable Throwable th2) {
        return new d4(str, th2, true, 0);
    }

    public static d4 c(@Nullable String str, @Nullable Throwable th2) {
        return new d4(str, th2, true, 4);
    }

    public static d4 d(@Nullable String str, @Nullable Throwable th2) {
        return new d4(str, th2, false, 4);
    }

    public static d4 e(@Nullable String str) {
        return new d4(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f125405b + ", dataType=" + this.f125406c + "}";
    }
}
