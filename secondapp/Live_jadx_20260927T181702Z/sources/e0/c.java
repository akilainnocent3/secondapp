package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f79744a = new RectF();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements g.a {
        public a() {
        }

        @Override // e0.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            float f11 = 2.0f * f10;
            float fWidth = (rectF.width() - f11) - 1.0f;
            float fHeight = (rectF.height() - f11) - 1.0f;
            if (f10 >= 1.0f) {
                float f12 = f10 + 0.5f;
                float f13 = -f12;
                c.this.f79744a.set(f13, f13, f12, f12);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f12, rectF.top + f12);
                canvas.drawArc(c.this.f79744a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f79744a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f79744a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(c.this.f79744a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f14 = (rectF.left + f12) - 1.0f;
                float f15 = rectF.top;
                canvas.drawRect(f14, f15, (rectF.right - f12) + 1.0f, f15 + f12, paint);
                float f16 = (rectF.left + f12) - 1.0f;
                float f17 = rectF.bottom;
                canvas.drawRect(f16, f17 - f12, (rectF.right - f12) + 1.0f, f17, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f10, rectF.right, rectF.bottom - f10, paint);
        }
    }

    @Override // e0.e
    public void a(d dVar, float f10) {
        q(dVar).r(f10);
    }

    @Override // e0.e
    public void b(d dVar) {
        Rect rect = new Rect();
        q(dVar).h(rect);
        dVar.c((int) Math.ceil(d(dVar)), (int) Math.ceil(l(dVar)));
        dVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // e0.e
    public void c(d dVar, float f10) {
        q(dVar).p(f10);
        b(dVar);
    }

    @Override // e0.e
    public float d(d dVar) {
        return q(dVar).k();
    }

    @Override // e0.e
    public void f(d dVar, float f10) {
        q(dVar).q(f10);
        b(dVar);
    }

    @Override // e0.e
    public void g(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        g gVarP = p(context, colorStateList, f10, f11, f12);
        gVarP.m(dVar.f());
        dVar.d(gVarP);
        b(dVar);
    }

    @Override // e0.e
    public ColorStateList h(d dVar) {
        return q(dVar).f();
    }

    @Override // e0.e
    public float i(d dVar) {
        return q(dVar).g();
    }

    @Override // e0.e
    public void j() {
        g.f79759s = new a();
    }

    @Override // e0.e
    public float k(d dVar) {
        return q(dVar).l();
    }

    @Override // e0.e
    public float l(d dVar) {
        return q(dVar).j();
    }

    @Override // e0.e
    public void m(d dVar) {
        q(dVar).m(dVar.f());
        b(dVar);
    }

    @Override // e0.e
    public float n(d dVar) {
        return q(dVar).i();
    }

    @Override // e0.e
    public void o(d dVar, @Nullable ColorStateList colorStateList) {
        q(dVar).o(colorStateList);
    }

    public final g p(Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        return new g(context.getResources(), colorStateList, f10, f11, f12);
    }

    public final g q(d dVar) {
        return (g) dVar.e();
    }

    @Override // e0.e
    public void e(d dVar) {
    }
}
