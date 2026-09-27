package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f158681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f158682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f158683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f158684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f158685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f158686f;

    public zb(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f158681a = i10;
        this.f158682b = i11;
        this.f158683c = Collections.unmodifiableList(arrayList);
        this.f158684d = Collections.unmodifiableList(list);
        this.f158685e = Collections.unmodifiableList(list2);
        this.f158686f = Collections.unmodifiableList(list3);
    }
}
