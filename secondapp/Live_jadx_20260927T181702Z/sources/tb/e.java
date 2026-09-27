package tb;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends IOException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f136427c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136428d = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136429b;

    public e(int i10) {
        this("Http request failed", i10);
    }

    public int d() {
        return this.f136429b;
    }

    @Deprecated
    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i10) {
        this(str, i10, null);
    }

    public e(String str, int i10, @Nullable Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.f136429b = i10;
    }
}
