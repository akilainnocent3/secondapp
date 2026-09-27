package com.vungle.ads.fpd;

import kotlin.jvm.internal.x;
import ms.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum AgeRange {
    AGE_18_20(1, new l(18, 20)),
    AGE_21_30(2, new l(21, 30)),
    AGE_31_40(3, new l(31, 40)),
    AGE_41_50(4, new l(41, 50)),
    AGE_51_60(5, new l(51, 60)),
    AGE_61_70(6, new l(61, 70)),
    AGE_71_75(7, new l(71, 75)),
    OTHERS(0, new l(Integer.MIN_VALUE, Integer.MAX_VALUE));


    @oy.l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f76433id;

    @oy.l
    private final l range;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x0024 A[RETURN] */
        @oy.l
        public final AgeRange fromAge$vungle_ads_release(int i10) {
            for (AgeRange ageRange : AgeRange.values()) {
                l range = ageRange.getRange();
                int iF = range.f();
                if (i10 <= range.g() && iF <= i10) {
                    if (ageRange == null) {
                        return AgeRange.OTHERS;
                    }
                    return ageRange;
                }
            }
            ageRange = null;
            if (ageRange == null) {
                return AgeRange.OTHERS;
            }
            return ageRange;
        }

        private Companion() {
        }
    }

    AgeRange(int i10, l lVar) {
        this.f76433id = i10;
        this.range = lVar;
    }

    public final int getId() {
        return this.f76433id;
    }

    @oy.l
    public final l getRange() {
        return this.range;
    }
}
