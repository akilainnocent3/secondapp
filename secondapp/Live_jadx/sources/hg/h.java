package hg;

import java.util.Collections;
import java.util.List;
import xf.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class h implements z<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f88328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88329c;

    public h(String str, List<String> list, boolean z10) {
        this.f88327a = str;
        this.f88328b = Collections.unmodifiableList(list);
        this.f88329c = z10;
    }
}
