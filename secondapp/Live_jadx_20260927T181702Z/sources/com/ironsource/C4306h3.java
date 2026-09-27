package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4306h3 extends AbstractC4535u3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4306h3(int i10, @oy.l String placementName, boolean z10, @oy.m C4316hd c4316hd) {
        super(i10, placementName, z10, c4316hd);
        kotlin.jvm.internal.m0.p(placementName, "placementName");
    }

    @Override // com.ironsource.AbstractC4535u3
    @oy.l
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
