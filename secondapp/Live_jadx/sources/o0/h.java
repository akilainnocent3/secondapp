package o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class h extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f118601d;

    public h(String str, c cVar) {
        super(str);
        this.f118599b = str;
        if (cVar != null) {
            this.f118601d = cVar.p();
            this.f118600c = cVar.n();
        } else {
            this.f118601d = "unknown";
            this.f118600c = 0;
        }
    }

    public String d() {
        return this.f118599b + " (" + this.f118601d + " at line " + this.f118600c + gi.j.f86771d;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + d();
    }
}
