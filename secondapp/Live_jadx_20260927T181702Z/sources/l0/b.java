package l0;

import java.util.HashMap;
import java.util.HashSet;
import n0.o;
import n0.w;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements w {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f103235m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f103236n = "alpha";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f103237o = "elevation";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f103238p = "rotationZ";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f103239q = "rotationX";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f103240r = "transitionPathRotate";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f103241s = "scaleX";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f103242t = "scaleY";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f103243u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f103244v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f103245w = "CUSTOM";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f103246x = "visibility";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f103247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f103248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f103249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f103250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap<String, k0.b> f103251l;

    public b() {
        int i10 = f103235m;
        this.f103247h = i10;
        this.f103248i = i10;
        this.f103249j = null;
    }

    @Override // n0.w
    public boolean a(int i10, int i11) {
        if (i10 != 100) {
            return false;
        }
        this.f103247h = i11;
        return true;
    }

    @Override // n0.w
    public boolean b(int i10, float f10) {
        return false;
    }

    @Override // n0.w
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // n0.w
    public boolean d(int i10, String str) {
        if (i10 != 101) {
            return false;
        }
        this.f103249j = str;
        return true;
    }

    public abstract void f(HashMap<String, o> map);

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f103247h = bVar.f103247h;
        this.f103248i = bVar.f103248i;
        this.f103249j = bVar.f103249j;
        this.f103250k = bVar.f103250k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f103247h;
    }

    public boolean k(String str) {
        String str2 = this.f103249j;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i10, float f10) {
        this.f103251l.put(str, new k0.b(str, i10, f10));
    }

    public void m(String str, int i10, int i11) {
        this.f103251l.put(str, new k0.b(str, i10, i11));
    }

    public void n(String str, int i10, String str2) {
        this.f103251l.put(str, new k0.b(str, i10, str2));
    }

    public void o(String str, int i10, boolean z10) {
        this.f103251l.put(str, new k0.b(str, i10, z10));
    }

    public void p(int i10) {
        this.f103247h = i10;
    }

    public b r(int i10) {
        this.f103248i = i10;
        return this;
    }

    public boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public void q(HashMap<String, Integer> map) {
    }
}
