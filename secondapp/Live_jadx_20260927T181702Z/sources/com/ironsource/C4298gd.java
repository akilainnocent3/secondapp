package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4298gd extends AbstractC4535u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    private String f61891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61892f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4298gd(int i10, @oy.l String placementName, boolean z10, @oy.l String rewardName, int i11, @oy.m C4316hd c4316hd) {
        super(i10, placementName, z10, c4316hd);
        kotlin.jvm.internal.m0.p(placementName, "placementName");
        kotlin.jvm.internal.m0.p(rewardName, "rewardName");
        this.f61892f = i11;
        this.f61891e = rewardName;
    }

    public final int e() {
        return this.f61892f;
    }

    @oy.l
    public final String f() {
        return this.f61891e;
    }

    @Override // com.ironsource.AbstractC4535u3
    @oy.l
    public String toString() {
        return super.toString() + ", reward name: " + this.f61891e + " , amount: " + this.f61892f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4298gd(@oy.l AbstractC4535u3 placement) {
        super(placement.b(), placement.c(), placement.d(), placement.a());
        kotlin.jvm.internal.m0.p(placement, "placement");
        this.f61891e = "";
    }
}
