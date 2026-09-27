package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class g91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149483a;

    public g91(List list) {
        this.f149483a = list;
    }

    public final oi a(String str) {
        List list = this.f149483a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (kotlin.jvm.internal.m0.g(((oi) obj2).f153501a, str)) {
                obj = obj2;
                break;
            }
        }
        return (oi) obj;
    }
}
