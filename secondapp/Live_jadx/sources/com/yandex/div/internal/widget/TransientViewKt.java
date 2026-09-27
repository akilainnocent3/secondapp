package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@l View view) {
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        return (view.getParent() instanceof ViewGroup) && isInTransientHierarchy(view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isTransient(@l View view) {
        return (view instanceof TransientView) && ((TransientView) view).isTransient();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@l ViewParent viewParent) {
        return (viewParent instanceof TransientView) && isInTransientHierarchy((View) viewParent);
    }
}
