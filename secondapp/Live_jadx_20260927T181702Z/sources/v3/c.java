package v3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f139951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f139952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f139953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f139954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorFilter f139955e;

    public c(b bVar, float f10, float f11) {
        this.f139951a = bVar;
        f10 = f10 > 1.0f ? 1.0f : f10;
        f10 = f10 < 0.0f ? 0.0f : f10;
        f11 = f11 > 1.0f ? 1.0f : f11;
        float f12 = f11 >= 0.0f ? f11 : 0.0f;
        this.f139952b = f10;
        this.f139953c = f12;
        this.f139954d = new Paint();
    }

    public static c b(b bVar, float f10, float f11) {
        return new c(bVar, f10, f11);
    }

    public static c c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(s3.a.n.f129001l0);
        int color = typedArrayObtainStyledAttributes.getColor(s3.a.n.W0, context.getResources().getColor(s3.a.d.Z));
        float fraction = typedArrayObtainStyledAttributes.getFraction(s3.a.n.U0, 1, 1, context.getResources().getFraction(s3.a.g.f128689i, 1, 0));
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(s3.a.n.V0, 1, 1, context.getResources().getFraction(s3.a.g.f128690j, 1, 1));
        typedArrayObtainStyledAttributes.recycle();
        return new c(b.a(color), fraction, fraction2);
    }

    public void a(View view) {
        if (this.f139955e != null) {
            view.setLayerType(2, this.f139954d);
        } else {
            view.setLayerType(0, null);
        }
        view.invalidate();
    }

    public ColorFilter d() {
        return this.f139955e;
    }

    public Paint e() {
        return this.f139954d;
    }

    public void f(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        b bVar = this.f139951a;
        float f11 = this.f139953c;
        ColorFilter colorFilterB = bVar.b(f11 + (f10 * (this.f139952b - f11)));
        this.f139955e = colorFilterB;
        this.f139954d.setColorFilter(colorFilterB);
    }
}
