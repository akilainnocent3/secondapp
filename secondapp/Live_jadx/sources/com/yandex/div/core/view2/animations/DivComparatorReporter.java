package com.yandex.div.core.view2.animations;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivComparatorReporter {
    void onComparisonDifferentChildCount();

    void onComparisonDifferentClasses();

    void onComparisonDifferentCustomTypes();

    void onComparisonDifferentIdsWithTransition();

    void onComparisonDifferentOverlap();

    void onComparisonDifferentWrap();

    void onComparisonNoOldData();

    void onComparisonNoState();

    void onComparisonSuccess();
}
