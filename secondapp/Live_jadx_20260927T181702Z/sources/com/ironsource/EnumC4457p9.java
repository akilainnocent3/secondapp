package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4457p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f63311b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63316a;

    /* JADX INFO: renamed from: com.ironsource.p9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nInstanceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceType.kt\ncom/unity3d/ironsourceads/internal/load/InstanceType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @oy.l
        public final EnumC4457p9 a(int i10) {
            for (EnumC4457p9 enumC4457p9 : EnumC4457p9.values()) {
                if (enumC4457p9.f63316a == i10) {
                    if (enumC4457p9 == null) {
                        return EnumC4457p9.NotSupported;
                    }
                    return enumC4457p9;
                }
            }
            enumC4457p9 = null;
            if (enumC4457p9 == null) {
                return EnumC4457p9.NotSupported;
            }
            return enumC4457p9;
        }

        private a() {
        }
    }

    EnumC4457p9(int i10) {
        this.f63316a = i10;
    }

    public final int b() {
        return this.f63316a;
    }

    public final boolean b(@oy.l EnumC4457p9 instanceType) {
        kotlin.jvm.internal.m0.p(instanceType, "instanceType");
        return instanceType.b() == this.f63316a;
    }
}
