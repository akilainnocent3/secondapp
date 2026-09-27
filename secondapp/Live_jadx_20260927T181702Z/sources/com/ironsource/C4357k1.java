package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4357k1 implements InterfaceC4375l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f62173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f62174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private final IronSource.a f62175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f62176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f62177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f62178f;

    /* JADX INFO: renamed from: com.ironsource.k1$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f62179a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f62180b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f62181c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f62182d = 1;

        private a() {
        }
    }

    public C4357k1(@oy.l String version, @oy.l String instanceId, @oy.l IronSource.a adFormat, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.m0.p(version, "version");
        kotlin.jvm.internal.m0.p(instanceId, "instanceId");
        kotlin.jvm.internal.m0.p(adFormat, "adFormat");
        this.f62173a = version;
        this.f62174b = instanceId;
        this.f62175c = adFormat;
        this.f62176d = z10;
        this.f62177e = z11;
        this.f62178f = z12;
    }

    @Override // com.ironsource.InterfaceC4375l1
    @oy.l
    public ArrayList<InterfaceC4413n1> a() {
        ArrayList<InterfaceC4413n1> arrayList = new ArrayList<>();
        arrayList.add(new C4393m1.v(this.f62173a));
        arrayList.add(new C4393m1.x(this.f62174b));
        arrayList.add(new C4393m1.a(this.f62175c));
        if (this.f62176d) {
            arrayList.add(new C4393m1.p(1));
        }
        if (this.f62177e) {
            arrayList.add(new C4393m1.e(1));
        }
        if (this.f62178f) {
            arrayList.add(new C4393m1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C4357k1(String str, String str2, IronSource.a aVar, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }
}
