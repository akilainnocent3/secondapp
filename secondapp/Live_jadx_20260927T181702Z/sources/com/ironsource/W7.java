package com.ironsource;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum W7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f60266b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60271a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nISAdProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ISAdProvider.kt\ncom/unity3d/ironsourceads/internal/configurations/ISAdProvider$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e  */
        /* JADX WARN: Code duplicated, block: B:15:0x0021 A[RETURN] */
        @oy.l
        public final W7 a(@oy.m Integer num) {
            for (W7 w10 : W7.values()) {
                int iB = w10.b();
                if (num != null && iB == num.intValue()) {
                    if (w10 == null) {
                        return W7.UnknownProvider;
                    }
                    return w10;
                }
            }
            w10 = null;
            if (w10 == null) {
                return W7.UnknownProvider;
            }
            return w10;
        }

        private a() {
        }

        @oy.l
        public final W7 a(@oy.l String dynamicDemandSourceId) {
            kotlin.jvm.internal.m0.p(dynamicDemandSourceId, "dynamicDemandSourceId");
            List listO5 = cv.p0.o5(dynamicDemandSourceId, new String[]{lk.e.f104695m}, false, 0, 6, null);
            return listO5.size() < 2 ? W7.UnknownProvider : a(cv.j0.p1((String) listO5.get(1)));
        }
    }

    W7(int i10) {
        this.f60271a = i10;
    }

    public final int b() {
        return this.f60271a;
    }
}
