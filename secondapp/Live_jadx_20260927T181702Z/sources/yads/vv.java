package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vv extends IOException {
    public vv(int i10) {
        super("Illegal clipping: ".concat(a(i10)));
    }

    public static String a(int i10) {
        if (i10 == 0) {
            return "invalid period count";
        }
        if (i10 != 1) {
            return i10 != 2 ? "unknown" : "start exceeds end";
        }
        return "not seekable to start";
    }
}
