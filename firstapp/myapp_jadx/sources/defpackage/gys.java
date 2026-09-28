package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;

/* JADX INFO: loaded from: classes.dex */
public final class gys {
    public static final p060[] d = {hcv.d(hcv.g, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.f, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.c, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.b, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.d, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.e, new RectF(-1.0f, -1.0f, 1.0f, 1.0f)), hcv.d(hcv.a, new RectF(-1.0f, -1.0f, 1.0f, 1.0f))};
    public static final g5w[] e = new g5w[7];
    public final LoadingIndicatorSpec a;
    public final Path b = new Path();
    public final Matrix c = new Matrix();

    /* JADX INFO: loaded from: classes4.dex */
    public static class a {
        public int a;
        public float b;
        public float c;
    }

    static {
        int i = 0;
        while (true) {
            p060[] p060VarArr = d;
            if (i >= p060VarArr.length) {
                return;
            }
            int i2 = i + 1;
            e[i] = new g5w(p060VarArr[i], p060VarArr[i2 % p060VarArr.length]);
            i = i2;
        }
    }

    public gys(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.a = loadingIndicatorSpec;
    }
}
