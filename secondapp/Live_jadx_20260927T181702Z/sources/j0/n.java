package j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f99386a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99388c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99387b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f99389d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f99390e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f99391f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f99392g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f99393h = a.CARTESIAN;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public n(String str, int i10) {
        this.f99386a = null;
        this.f99388c = 0;
        this.f99386a = str;
        this.f99388c = i10;
    }

    public int g() {
        return this.f99388c;
    }

    public float h() {
        return this.f99390e;
    }

    public float i() {
        return this.f99389d;
    }

    public float j() {
        return this.f99391f;
    }

    public float k() {
        return this.f99392g;
    }

    public a l() {
        return this.f99393h;
    }

    public String m() {
        return this.f99386a;
    }

    public String n() {
        return this.f99387b;
    }

    public void o(int i10) {
        this.f99388c = i10;
    }

    public void p(float f10) {
        this.f99390e = f10;
    }

    public void q(float f10) {
        this.f99389d = f10;
    }

    public void r(float f10) {
        this.f99391f = f10;
    }

    public void s(float f10) {
        this.f99392g = f10;
    }

    public void t(a aVar) {
        this.f99393h = aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        c(sb2, "target", this.f99386a);
        sb2.append("frame:");
        sb2.append(this.f99388c);
        sb2.append(",\n");
        if (this.f99393h != null) {
            sb2.append("type:'");
            sb2.append(this.f99393h);
            sb2.append("',\n");
        }
        c(sb2, "easing", this.f99387b);
        a(sb2, "percentX", this.f99391f);
        a(sb2, "percentY", this.f99392g);
        a(sb2, "percentWidth", this.f99389d);
        a(sb2, "percentHeight", this.f99390e);
        sb2.append("},\n");
        return sb2.toString();
    }

    public void u(String str) {
        this.f99386a = str;
    }

    public void v(String str) {
        this.f99387b = str;
    }
}
