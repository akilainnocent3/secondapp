package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class ob2 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153426c;

    public ob2(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f153425b = z10;
        this.f153426c = i10;
    }

    public static ob2 a(String str) {
        return new ob2(str, null, true, 1);
    }

    public static ob2 b(String str) {
        return new ob2(str, null, false, 1);
    }
}
