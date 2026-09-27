package ni;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public abstract class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public p f116875c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f116873a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f116874b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f116876d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f116877e = new Path();

    @NonNull
    public static u a(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 33 ? new x(view) : new w(view);
    }

    public abstract void b(@NonNull View view);

    public boolean c() {
        return this.f116873a;
    }

    public final boolean d() {
        RectF rectF = this.f116876d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void e(@NonNull Canvas canvas, @NonNull oh.a.InterfaceC1115a interfaceC1115a) {
        if (!j() || this.f116877e.isEmpty()) {
            interfaceC1115a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f116877e);
        interfaceC1115a.a(canvas);
        canvas.restore();
    }

    public void f(@NonNull View view, @NonNull RectF rectF) {
        this.f116876d = rectF;
        k();
        b(view);
    }

    public void g(@NonNull View view, @NonNull p pVar) {
        this.f116875c = pVar;
        k();
        b(view);
    }

    public void h(@NonNull View view, boolean z10) {
        if (z10 != this.f116873a) {
            this.f116873a = z10;
            b(view);
        }
    }

    public void i(@NonNull View view, boolean z10) {
        this.f116874b = z10;
        b(view);
    }

    public abstract boolean j();

    public final void k() {
        if (!d() || this.f116875c == null) {
            return;
        }
        q.k().d(this.f116875c, 1.0f, this.f116876d, this.f116877e);
    }
}
