package com.yandex.div.core.view2.logging.patch;

import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.bind.a;
import com.yandex.div.core.view2.logging.bind.b;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface PatchEventReporter extends SimpleRebindReporter {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final PatchEventReporter STUB = new PatchEventReporter() { // from class: com.yandex.div.core.view2.logging.patch.PatchEventReporter$Companion$STUB$1
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

            @Override // com.yandex.div.core.view2.logging.patch.PatchEventReporter
            public void onPatchNoState() {
            }

            @Override // com.yandex.div.core.view2.logging.patch.PatchEventReporter
            public void onPatchSuccess() {
            }
        };

        private Companion() {
        }

        @l
        public final PatchEventReporter getSTUB() {
            return STUB;
        }
    }

    void onPatchNoState();

    void onPatchSuccess();
}
