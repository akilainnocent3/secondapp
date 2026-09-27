package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum We {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f60279b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60284a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nSessionHistoryConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionHistoryConfiguration.kt\ncom/ironsource/services/sessionhistory/modes/SessionHistoryConfigurationMode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @oy.l
        public final We a(int i10) {
            for (We we2 : We.values()) {
                if (we2.f60284a == i10) {
                    if (we2 == null) {
                        return We.CurrentlyLoadedAds;
                    }
                    return we2;
                }
            }
            we2 = null;
            if (we2 == null) {
                return We.CurrentlyLoadedAds;
            }
            return we2;
        }

        private a() {
        }
    }

    We(int i10) {
        this.f60284a = i10;
    }

    public final int b() {
        return this.f60284a;
    }
}
