package nc;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f116439a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        Animation a(Context context);
    }

    public k(a aVar) {
        this.f116439a = aVar;
    }

    @Override // nc.f
    public boolean a(R r10, f.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f116439a.a(view.getContext()));
        return false;
    }
}
