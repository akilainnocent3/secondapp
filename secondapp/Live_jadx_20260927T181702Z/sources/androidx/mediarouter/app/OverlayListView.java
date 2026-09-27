package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f17679b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BitmapDrawable f17680a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Rect f17682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f17683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Rect f17685f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17686g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f17689j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f17690k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f17691l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC0132a f17692m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f17681b = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f17687h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f17688i = 1.0f;

        /* JADX INFO: renamed from: androidx.mediarouter.app.OverlayListView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface InterfaceC0132a {
            void a();
        }

        public a(@Nullable BitmapDrawable bitmapDrawable, @Nullable Rect rect) {
            this.f17680a = bitmapDrawable;
            this.f17685f = rect;
            this.f17682c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f17680a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f17681b * 255.0f));
                this.f17680a.setBounds(this.f17682c);
            }
        }

        @Nullable
        public BitmapDrawable a() {
            return this.f17680a;
        }

        public boolean b() {
            return this.f17690k;
        }

        @NonNull
        public a c(float f10, float f11) {
            this.f17687h = f10;
            this.f17688i = f11;
            return this;
        }

        @NonNull
        public a d(@Nullable InterfaceC0132a interfaceC0132a) {
            this.f17692m = interfaceC0132a;
            return this;
        }

        @NonNull
        public a e(long j10) {
            this.f17684e = j10;
            return this;
        }

        @NonNull
        public a f(@Nullable Interpolator interpolator) {
            this.f17683d = interpolator;
            return this;
        }

        @NonNull
        public a g(int i10) {
            this.f17686g = i10;
            return this;
        }

        public void h(long j10) {
            this.f17689j = j10;
            this.f17690k = true;
        }

        public void i() {
            this.f17690k = true;
            this.f17691l = true;
            InterfaceC0132a interfaceC0132a = this.f17692m;
            if (interfaceC0132a != null) {
                interfaceC0132a.a();
            }
        }

        public boolean j(long j10) {
            if (this.f17691l) {
                return false;
            }
            float fMax = this.f17690k ? Math.max(0.0f, Math.min(1.0f, (j10 - this.f17689j) / this.f17684e)) : 0.0f;
            Interpolator interpolator = this.f17683d;
            float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
            int i10 = (int) (this.f17686g * interpolation);
            Rect rect = this.f17682c;
            Rect rect2 = this.f17685f;
            rect.top = rect2.top + i10;
            rect.bottom = rect2.bottom + i10;
            float f10 = this.f17687h;
            float f11 = f10 + ((this.f17688i - f10) * interpolation);
            this.f17681b = f11;
            BitmapDrawable bitmapDrawable = this.f17680a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f11 * 255.0f));
                this.f17680a.setBounds(this.f17682c);
            }
            if (this.f17690k && fMax >= 1.0f) {
                this.f17691l = true;
                InterfaceC0132a interfaceC0132a = this.f17692m;
                if (interfaceC0132a != null) {
                    interfaceC0132a.a();
                }
            }
            return !this.f17691l;
        }
    }

    public OverlayListView(Context context) {
        super(context);
        this.f17679b = new ArrayList();
    }

    public void a(a aVar) {
        this.f17679b.add(aVar);
    }

    public void b() {
        for (a aVar : this.f17679b) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        Iterator<a> it = this.f17679b.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17679b.size() > 0) {
            Iterator<a> it = this.f17679b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable bitmapDrawableA = next.a();
                if (bitmapDrawableA != null) {
                    bitmapDrawableA.draw(canvas);
                }
                if (!next.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17679b = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17679b = new ArrayList();
    }
}
