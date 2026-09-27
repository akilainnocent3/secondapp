package u4;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public class p1 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f138754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138755c;

    public p1(@Nullable String str, @Nullable Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f138754b = z10;
        this.f138755c = i10;
    }

    public static p1 a(@Nullable String str, @Nullable Throwable th2) {
        return new p1(str, th2, true, 1);
    }

    public static p1 b(@Nullable String str, @Nullable Throwable th2) {
        return new p1(str, th2, true, 0);
    }

    public static p1 c(@Nullable String str, @Nullable Throwable th2) {
        return new p1(str, th2, true, 4);
    }

    public static p1 d(@Nullable String str, @Nullable Throwable th2) {
        return new p1(str, th2, true, 8);
    }

    public static p1 e(@Nullable String str, @Nullable Throwable th2) {
        return new p1(str, th2, false, 4);
    }

    public static p1 f(@Nullable String str) {
        return new p1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f138754b);
        sb2.append(", dataType=");
        sb2.append(this.f138755c);
        sb2.append("}");
        return sb2.toString();
    }
}
