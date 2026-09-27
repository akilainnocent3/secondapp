package va;

import android.graphics.Path;
import gb.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<v> f140494a = new ArrayList();

    public void a(v vVar) {
        this.f140494a.add(vVar);
    }

    public void b(Path path) {
        for (int size = this.f140494a.size() - 1; size >= 0; size--) {
            z.b(path, this.f140494a.get(size));
        }
    }
}
