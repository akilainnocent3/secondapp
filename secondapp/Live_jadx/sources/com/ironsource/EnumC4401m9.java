package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.m9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC4401m9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f62357b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62361a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nInlineStoreService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineStoreService.kt\ncom/unity3d/ironsourceads/internal/services/InlineStoreStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,245:1\n1#2:246\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @oy.l
        public final EnumC4401m9 a(int i10) {
            for (EnumC4401m9 enumC4401m9 : EnumC4401m9.values()) {
                if (enumC4401m9.b() == i10) {
                    if (enumC4401m9 == null) {
                        return EnumC4401m9.APP_ACTIVITY;
                    }
                    return enumC4401m9;
                }
            }
            enumC4401m9 = null;
            if (enumC4401m9 == null) {
                return EnumC4401m9.APP_ACTIVITY;
            }
            return enumC4401m9;
        }

        private a() {
        }
    }

    EnumC4401m9(int i10) {
        this.f62361a = i10;
    }

    public final int b() {
        return this.f62361a;
    }
}
