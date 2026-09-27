package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4626z9 implements InterfaceC4372kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Db f64566a;

    /* JADX INFO: renamed from: com.ironsource.z9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64567a = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C4622z5.f64557a.b("Load task config is null");
        }
    }

    public C4626z9(@oy.m Db db2) {
        this.f64566a = db2;
    }

    @Override // com.ironsource.InterfaceC4372kg
    public /* synthetic */ void a(boolean z10, ds.a aVar) {
        ml.a(this, z10, aVar);
    }

    @Override // com.ironsource.InterfaceC4372kg
    public void a() {
        a(this.f64566a != null, a.f64567a);
    }
}
