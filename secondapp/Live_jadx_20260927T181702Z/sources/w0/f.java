package w0;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f141737f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f141738g = "alpha";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f141739h = "elevation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f141740i = "rotation";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f141741j = "rotationX";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f141742k = "rotationY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f141743l = "transformPivotX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f141744m = "transformPivotY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f141745n = "transitionPathRotate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f141746o = "scaleX";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f141747p = "scaleY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f141748q = "wavePeriod";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f141749r = "waveOffset";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f141750s = "wavePhase";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f141751t = "waveVariesBy";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f141752u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f141753v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f141754w = "translationZ";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f141755x = "progress";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f141756y = "CUSTOM";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f141757z = "curveFit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f141760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f141761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.b> f141762e;

    public f() {
        int i10 = f141737f;
        this.f141758a = i10;
        this.f141759b = i10;
        this.f141760c = null;
    }

    public abstract void a(HashMap<String, v0.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f fVar) {
        this.f141758a = fVar.f141758a;
        this.f141759b = fVar.f141759b;
        this.f141760c = fVar.f141760c;
        this.f141761d = fVar.f141761d;
        this.f141762e = fVar.f141762e;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public int e() {
        return this.f141758a;
    }

    public abstract void f(Context context, AttributeSet attributeSet);

    public boolean g(String str) {
        String str2 = this.f141760c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void h(int i10) {
        this.f141758a = i10;
    }

    public abstract void j(String str, Object obj);

    public f k(int i10) {
        this.f141759b = i10;
        return this;
    }

    public boolean l(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float m(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int n(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void i(HashMap<String, Integer> map) {
    }
}
