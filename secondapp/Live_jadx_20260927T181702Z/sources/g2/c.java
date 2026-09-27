package g2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: g2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0839c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f85844b;

        public AccessibilityManagerAccessibilityStateChangeListenerC0839c(@NonNull a aVar) {
            this.f85844b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0839c) {
                return this.f85844b.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0839c) obj).f85844b);
            }
            return false;
        }

        public int hashCode() {
            return this.f85844b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            this.f85844b.onAccessibilityStateChanged(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class d {
        @k.t
        public static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f85845a;

        public f(@NonNull e eVar) {
            this.f85845a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f85845a.equals(((f) obj).f85845a);
            }
            return false;
        }

        public int hashCode() {
            return this.f85845a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f85845a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0839c(aVar));
    }

    public static boolean b(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean e(@NonNull AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.a(accessibilityManager);
        }
        return true;
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean g(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0839c(aVar));
    }

    public static boolean h(@NonNull AccessibilityManager accessibilityManager, @NonNull e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
