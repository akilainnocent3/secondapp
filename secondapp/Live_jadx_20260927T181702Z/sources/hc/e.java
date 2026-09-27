package hc;

import androidx.annotation.NonNull;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e extends fc.j<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // vb.v
    public void a() {
        ((c) this.f83890b).stop();
        ((c) this.f83890b).o();
    }

    @Override // vb.v
    @NonNull
    public Class<c> b() {
        return c.class;
    }

    @Override // vb.v
    public int getSize() {
        return ((c) this.f83890b).l();
    }

    @Override // fc.j, vb.r
    public void initialize() {
        ((c) this.f83890b).g().prepareToDraw();
    }
}
