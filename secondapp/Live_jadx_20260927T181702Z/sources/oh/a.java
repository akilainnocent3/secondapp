package oh;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: oh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC1115a {
        void a(@NonNull Canvas canvas);
    }

    public static int a(@NonNull Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public static int b(@NonNull Canvas canvas, @Nullable RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }
}
