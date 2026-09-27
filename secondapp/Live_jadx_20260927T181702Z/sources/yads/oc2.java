package yads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class oc2 extends kotlin.jvm.internal.o0 implements ds.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f153439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc2(Set set) {
        super(1);
        this.f153439b = set;
    }

    @Override // ds.l
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f153439b.contains(((u5) obj).f156276a));
    }
}
