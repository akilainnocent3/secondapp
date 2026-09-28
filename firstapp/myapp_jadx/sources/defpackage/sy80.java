package defpackage;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class sy80 extends ry80 {
    public boolean f = false;
    public float g = 0.0f;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            sy80 sy80Var = sy80.this;
            if (sy80Var.c == null || sy80Var.d.isEmpty()) {
                return;
            }
            RectF rectF = sy80Var.d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, sy80Var.g);
        }
    }

    public sy80(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // defpackage.ry80
    public final void a(FrameLayout frameLayout) {
        rx80 rx80Var;
        rx80 rx80Var2;
        RectF rectF;
        rx80 rx80Var3 = this.c;
        this.g = (rx80Var3 == null || (rectF = this.d) == null) ? 0.0f : rx80Var3.f.a(rectF);
        boolean z = false;
        if ((this.d.isEmpty() || (rx80Var2 = this.c) == null) ? false : rx80Var2.g(this.d)) {
            z = true;
        } else if (!this.d.isEmpty() && (rx80Var = this.c) != null && this.b && !rx80Var.g(this.d)) {
            rx80 rx80Var4 = this.c;
            if ((rx80Var4.a instanceof k060) && (rx80Var4.b instanceof k060) && (rx80Var4.d instanceof k060) && (rx80Var4.c instanceof k060)) {
                float fA = rx80Var4.e.a(this.d);
                float fA2 = this.c.f.a(this.d);
                float fA3 = this.c.h.a(this.d);
                float fA4 = this.c.g.a(this.d);
                if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                    RectF rectF2 = this.d;
                    rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.g = fA2;
                } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                    RectF rectF3 = this.d;
                    rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                    this.g = fA3;
                } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                    RectF rectF4 = this.d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                    this.g = fA;
                } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                    RectF rectF5 = this.d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                    this.g = fA;
                }
                z = true;
            }
        }
        this.f = z;
        frameLayout.setClipToOutline(!b());
        if (b()) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // defpackage.ry80
    public final boolean b() {
        return !this.f || this.a;
    }
}
