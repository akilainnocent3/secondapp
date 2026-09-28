package defpackage;

import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class qc0 {
    public static final Shader.TileMode a(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            return Build.VERSION.SDK_INT >= 31 ? gtf0.a() : Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }
}
