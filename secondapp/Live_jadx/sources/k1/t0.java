package k1;

import android.graphics.Matrix;
import android.graphics.Shader;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static final void a(@oy.l Shader shader, @oy.l ds.l<? super Matrix, w2> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
