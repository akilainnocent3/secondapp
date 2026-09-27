package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4282ff {
    LoadSuccess(0),
    ShowSuccess(1),
    ShowFailed(2),
    Destroyed(3),
    LoadRequest(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61825a;

    EnumC4282ff(int i10) {
        this.f61825a = i10;
    }

    public final int b() {
        return this.f61825a;
    }
}
