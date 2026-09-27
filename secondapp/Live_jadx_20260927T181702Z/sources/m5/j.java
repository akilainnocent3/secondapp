package m5;

import java.util.Collections;
import java.util.List;
import q5.z;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class j implements z<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f106422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f106423c;

    public j(String str, List<String> list, boolean z10) {
        this.f106421a = str;
        this.f106422b = Collections.unmodifiableList(list);
        this.f106423c = z10;
    }
}
