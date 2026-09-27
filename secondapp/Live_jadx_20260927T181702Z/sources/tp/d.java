package tp;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class d<T> implements a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.unity3d.scar.adapter.common.a f137121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g<T> f137122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f137123c;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // tp.a
    public void a(String str, String str2, T t10) {
        this.f137123c.a(str, str2);
        g<T> gVar = this.f137122b;
        if (gVar != null) {
            gVar.b(str, t10);
        }
        this.f137121a.b();
    }

    @Override // tp.a
    public void onFailure(String str) {
        this.f137123c.d(str);
        this.f137121a.b();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g<T> gVar, f fVar) {
        this.f137121a = aVar;
        this.f137122b = gVar;
        this.f137123c = fVar;
    }
}
