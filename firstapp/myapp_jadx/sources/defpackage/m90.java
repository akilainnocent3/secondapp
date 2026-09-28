package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class m90 {
    public static final j90 a() {
        return new j90(new Path());
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction c(bxz.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        uhc.a();
        return null;
    }
}
