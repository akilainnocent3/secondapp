package j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f99291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f99292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f99293i;

    public e(String str) {
        super(str, new h.a(""));
        this.f99291g = Integer.MIN_VALUE;
        this.f99292h = Integer.MIN_VALUE;
        this.f99293i = Float.NaN;
    }

    public int g() {
        return this.f99292h;
    }

    public float h() {
        return this.f99293i;
    }

    public int i() {
        return this.f99291g;
    }

    public void j(int i10) {
        this.f99292h = i10;
        this.f99304d.put("end", String.valueOf(i10));
    }

    public void k(float f10) {
        this.f99293i = f10;
        this.f99304d.put("percent", String.valueOf(f10));
    }

    public void l(int i10) {
        this.f99291g = i10;
        this.f99304d.put("start", String.valueOf(i10));
    }
}
