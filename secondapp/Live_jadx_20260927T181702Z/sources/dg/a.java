package dg;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f79096g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f79099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f79100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f79101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f79102f;

    public a(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f79097a = j10;
        this.f79098b = i10;
        this.f79099c = Collections.unmodifiableList(list);
        this.f79100d = Collections.unmodifiableList(list2);
        this.f79101e = Collections.unmodifiableList(list3);
        this.f79102f = Collections.unmodifiableList(list4);
    }
}
