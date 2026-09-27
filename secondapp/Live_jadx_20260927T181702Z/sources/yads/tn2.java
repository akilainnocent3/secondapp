package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f155988a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vn2 f155990c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq f155989b = new dq();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn2 f155991d = new rn2();

    public tn2(dk3 dk3Var, r62 r62Var) {
        this.f155988a = dk3Var;
        this.f155990c = new vn2(dk3Var, r62Var);
    }

    public final void a() {
        e72 e72Var = (e72) this.f155988a.b();
        if (e72Var != null) {
            un2 un2Var = e72Var.f148547c.f152886a;
            vn2 vn2Var = this.f155990c;
            vn2Var.getClass();
            un2Var.setVisibility(4);
            un2Var.f156520a.setOnClickListener(vn2Var.f157021a);
            Bitmap bitmap = e72Var.f148546b.getBitmap();
            if (bitmap != null) {
                this.f155989b.f148316a.execute(new cq(bitmap, new sn2(this, e72Var, un2Var), new Handler(Looper.getMainLooper()), new kq()));
            }
        }
    }
}
