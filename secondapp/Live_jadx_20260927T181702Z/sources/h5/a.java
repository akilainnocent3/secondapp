package h5;

import java.util.Collections;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f87657g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f87658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f87660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f87661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<e> f87662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f87663f;

    public a(long j10, int i10, List<j> list, List<e> list2, List<e> list3, List<e> list4) {
        this.f87658a = j10;
        this.f87659b = i10;
        this.f87660c = Collections.unmodifiableList(list);
        this.f87661d = Collections.unmodifiableList(list2);
        this.f87662e = Collections.unmodifiableList(list3);
        this.f87663f = Collections.unmodifiableList(list4);
    }
}
