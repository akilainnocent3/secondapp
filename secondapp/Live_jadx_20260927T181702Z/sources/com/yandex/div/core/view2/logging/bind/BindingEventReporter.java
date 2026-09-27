package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.animations.DivComparatorReporter;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.RebindTask;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface BindingEventReporter extends DivComparatorReporter, ComplexRebindReporter, SimpleRebindReporter, ForceRebindReporter {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final BindingEventReporter STUB = new BindingEventReporter() { // from class: com.yandex.div.core.view2.logging.bind.BindingEventReporter$Companion$STUB$1
            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentChildCount() {
                com.yandex.div.core.view2.animations.a.a(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentClasses() {
                com.yandex.div.core.view2.animations.a.b(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentCustomTypes() {
                com.yandex.div.core.view2.animations.a.c(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentIdsWithTransition() {
                com.yandex.div.core.view2.animations.a.d(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentOverlap() {
                com.yandex.div.core.view2.animations.a.e(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonDifferentWrap() {
                com.yandex.div.core.view2.animations.a.f(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonNoOldData() {
                com.yandex.div.core.view2.animations.a.g(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonNoState() {
                com.yandex.div.core.view2.animations.a.h(this);
            }

            @Override // com.yandex.div.core.view2.animations.DivComparatorReporter
            public /* synthetic */ void onComparisonSuccess() {
                com.yandex.div.core.view2.animations.a.i(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindFatalNoState() {
                com.yandex.div.core.view2.reuse.a.a(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNoDivInState() {
                com.yandex.div.core.view2.reuse.a.b(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNoExistingParent() {
                com.yandex.div.core.view2.reuse.a.c(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindNothingToBind() {
                com.yandex.div.core.view2.reuse.a.d(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindSuccess() {
                com.yandex.div.core.view2.reuse.a.e(this);
            }

            @Override // com.yandex.div.core.view2.reuse.ComplexRebindReporter
            public /* synthetic */ void onComplexRebindUnsupportedElementException(RebindTask.UnsupportedElementException unsupportedElementException) {
                com.yandex.div.core.view2.reuse.a.f(this, unsupportedElementException);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onFirstBindingCompleted() {
                a.a(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onForceRebindFatalNoState() {
                a.b(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.ForceRebindReporter
            public /* synthetic */ void onForceRebindSuccess() {
                a.c(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindException(Exception exc) {
                b.a(this, exc);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindFatalNoState() {
                b.b(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindNoChild() {
                b.c(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.SimpleRebindReporter
            public /* synthetic */ void onSimpleRebindSuccess() {
                b.d(this);
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalNoData() {
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalNoState() {
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalSameData() {
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onStateUpdateCompleted() {
            }
        };

        private Companion() {
        }

        @l
        public final BindingEventReporter getSTUB() {
            return STUB;
        }
    }

    void onBindingFatalNoData();

    void onBindingFatalNoState();

    void onBindingFatalSameData();

    void onStateUpdateCompleted();
}
