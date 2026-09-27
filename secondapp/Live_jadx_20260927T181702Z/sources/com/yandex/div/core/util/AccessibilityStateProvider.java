package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.yandex.div.core.dagger.DivScope;
import com.yandex.div.core.dagger.ExperimentFlag;
import com.yandex.div.core.experiments.Experiment;
import cr.a;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@DivScope
public final class AccessibilityStateProvider {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final void evaluateTouchModeEnabled(@l Context context) {
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            setTouchExplorationEnabled(accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE);
        }

        @m
        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(@m Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }

        private Companion() {
        }
    }

    @a
    public AccessibilityStateProvider(@ExperimentFlag(experiment = Experiment.ACCESSIBILITY_ENABLED) boolean z10) {
        this.a11yConfigurationEnabled = z10;
    }

    public final boolean getA11yConfigurationEnabled() {
        return this.a11yConfigurationEnabled;
    }

    public final boolean isAccessibilityEnabled(@l Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            m0.m(bool);
            return bool.booleanValue();
        }
        Companion.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchExplorationEnabled;
        m0.m(bool2);
        return bool2.booleanValue();
    }
}
