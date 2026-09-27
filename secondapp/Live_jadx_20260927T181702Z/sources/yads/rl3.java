package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rl3 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155020b;

    public rl3(boolean z10) {
        this.f155020b = z10;
    }

    @Override // yads.de1
    public final String a() {
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f155020b)}, 1));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
