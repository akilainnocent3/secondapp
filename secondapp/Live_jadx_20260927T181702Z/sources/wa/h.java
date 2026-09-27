package wa;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<bb.o, Path>> f142580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a<Integer, Integer>> f142581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<bb.i> f142582c;

    public h(List<bb.i> list) {
        this.f142582c = list;
        this.f142580a = new ArrayList(list.size());
        this.f142581b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f142580a.add(list.get(i10).b().f());
            this.f142581b.add(list.get(i10).c().f());
        }
    }

    public List<a<bb.o, Path>> a() {
        return this.f142580a;
    }

    public List<bb.i> b() {
        return this.f142582c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f142581b;
    }
}
