package e0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(17)
public class a extends c {

    /* JADX INFO: renamed from: e0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0781a implements g.a {
        public C0781a() {
        }

        @Override // e0.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    @Override // e0.c, e0.e
    public void j() {
        g.f79759s = new C0781a();
    }
}
