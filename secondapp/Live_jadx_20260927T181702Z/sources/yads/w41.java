package yads;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class w41 {
    public static boolean a(u41 u41Var, Map map) {
        Bitmap bitmap = (Bitmap) map.get(u41Var.f156268c);
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !u41Var.f156271f;
    }
}
