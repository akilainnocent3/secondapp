package za;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f160939d = "\r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f160941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f160942c;

    public h(String str, float f10, float f11) {
        this.f160940a = str;
        this.f160942c = f11;
        this.f160941b = f10;
    }

    public float a() {
        return this.f160942c;
    }

    public String b() {
        return this.f160940a;
    }

    public float c() {
        return this.f160941b;
    }

    public boolean d(String str) {
        if (this.f160940a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f160940a.endsWith(f160939d)) {
            String str2 = this.f160940a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
