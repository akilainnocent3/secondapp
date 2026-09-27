package nc;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f116438a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f116438a = aVar;
    }

    @Override // nc.f
    public boolean a(R r10, f.a aVar) {
        if (aVar.getView() == null) {
            return false;
        }
        this.f116438a.a(aVar.getView());
        return false;
    }
}
