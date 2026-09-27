package x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.l;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d extends AppCompatButton {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f144033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f144034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f144035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewOutlineProvider f144036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RectF f144037i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = d.this.getWidth();
            int height = d.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * d.this.f144033e) / 2.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, d.this.getWidth(), d.this.getHeight(), d.this.f144034f);
        }
    }

    public d(Context context) {
        super(context);
        this.f144033e = 0.0f;
        this.f144034f = Float.NaN;
        c(context, null);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.c.Y8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == l.c.f8631j9) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == l.c.f8648k9) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f144034f;
    }

    public float getRoundPercent() {
        return this.f144033e;
    }

    @t0(21)
    public void setRound(float f10) {
        if (Float.isNaN(f10)) {
            this.f144034f = f10;
            float f11 = this.f144033e;
            this.f144033e = -1.0f;
            setRoundPercent(f11);
            return;
        }
        boolean z10 = this.f144034f != f10;
        this.f144034f = f10;
        if (f10 != 0.0f) {
            if (this.f144035g == null) {
                this.f144035g = new Path();
            }
            if (this.f144037i == null) {
                this.f144037i = new RectF();
            }
            if (this.f144036h == null) {
                b bVar = new b();
                this.f144036h = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f144037i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f144035g.reset();
            Path path = this.f144035g;
            RectF rectF = this.f144037i;
            float f12 = this.f144034f;
            path.addRoundRect(rectF, f12, f12, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    @t0(21)
    public void setRoundPercent(float f10) {
        boolean z10 = this.f144033e != f10;
        this.f144033e = f10;
        if (f10 != 0.0f) {
            if (this.f144035g == null) {
                this.f144035g = new Path();
            }
            if (this.f144037i == null) {
                this.f144037i = new RectF();
            }
            if (this.f144036h == null) {
                a aVar = new a();
                this.f144036h = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f144033e) / 2.0f;
            this.f144037i.set(0.0f, 0.0f, width, height);
            this.f144035g.reset();
            this.f144035g.addRoundRect(this.f144037i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z10) {
            invalidateOutline();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f144033e = 0.0f;
        this.f144034f = Float.NaN;
        c(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f144033e = 0.0f;
        this.f144034f = Float.NaN;
        c(context, attributeSet);
    }
}
