package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f149052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f149053d;

    public fc2(String str, long j10, ArrayList arrayList, List list) {
        this.f149050a = str;
        this.f149051b = j10;
        this.f149052c = Collections.unmodifiableList(arrayList);
        this.f149053d = Collections.unmodifiableList(list);
    }
}
