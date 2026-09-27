package sg.bigo.ads.common.view.a;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import k.w;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final float f133617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final float f133618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final float f133619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final float f133620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Rect f133621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f133622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final int f133623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final float f133624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final float f133625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final float f133626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Drawable f133627n;

    public b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 1291845632, 0, 0.0f);
    }

    public final void a(Rect rect) {
        Rect rect2 = this.f133621h;
        if (rect2 == null) {
            rect2 = new Rect();
        }
        rect.left = rect2.left;
        rect.top = rect2.top;
        rect.right = rect2.right;
        rect.bottom = rect2.bottom;
    }

    public final int b() {
        return this.f133622i;
    }

    @w(from = 0.0d, to = 25.0d)
    public final float c() {
        return this.f133625l;
    }

    public final float d() {
        return this.f133626m;
    }

    @Nullable
    public final Drawable e() {
        return this.f133627n;
    }

    public b(float f10, float f11, float f12, float f13, int i10, int i11, float f14) {
        this(f10, f11, f12, f13, null, i10, i11, f14, null);
    }

    public final void a(float[] fArr) {
        float f10 = this.f133617d;
        fArr[0] = f10;
        fArr[1] = f10;
        float f11 = this.f133618e;
        fArr[2] = f11;
        fArr[3] = f11;
        float f12 = this.f133619f;
        fArr[4] = f12;
        fArr[5] = f12;
        float f13 = this.f133620g;
        fArr[6] = f13;
        fArr[7] = f13;
    }

    public b(float f10, float f11, float f12, float f13, @Nullable Rect rect, int i10, int i11, float f14, @Nullable boolean[] zArr) {
        this.f133617d = f10;
        this.f133618e = f11;
        this.f133619f = f12;
        this.f133620g = f13;
        this.f133621h = rect;
        this.f133622i = i10;
        this.f133623j = i11;
        this.f133624k = f14;
        this.f133625l = Math.max(0.0f, Math.min(25.0f, 23.0f));
        this.f133626m = 4.0f;
        this.f133627n = (i11 == 0 || f14 <= 0.0f) ? null : sg.bigo.ads.common.utils.d.a(f10, f11, f12, f13, i11, f14, zArr);
    }
}
