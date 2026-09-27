package nc;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d implements f<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116429b;

    public d(int i10, boolean z10) {
        this.f116428a = i10;
        this.f116429b = z10;
    }

    @Override // nc.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable drawableA = aVar.a();
        if (drawableA == null) {
            drawableA = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableA, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f116429b);
        transitionDrawable.startTransition(this.f116428a);
        aVar.b(transitionDrawable);
        return true;
    }
}
