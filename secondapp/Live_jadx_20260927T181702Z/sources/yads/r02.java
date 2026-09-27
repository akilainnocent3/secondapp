package yads;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r02 implements d51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s02 f154703a;

    public r02(s02 s02Var) {
        this.f154703a = s02Var;
    }

    @Override // yads.d51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.d51
    public final void a(Map map) {
        this.f154703a.f155213b.f152461b.putAll(map);
        this.f154703a.f155214c.a();
        Iterator it = this.f154703a.f155218g.iterator();
        while (it.hasNext()) {
            ((b10) it.next()).onFinishLoadingImages();
        }
    }
}
