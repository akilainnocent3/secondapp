package p2;

import android.widget.TabHost;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class c0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements TabHost.OnTabChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TabHost.OnTabChangeListener f120324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.databinding.o f120325c;

        public a(TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
            this.f120324b = onTabChangeListener;
            this.f120325c = oVar;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f120324b;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f120325c.a();
        }
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static int a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static String b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void c(TabHost tabHost, int i10) {
        if (tabHost.getCurrentTab() != i10) {
            tabHost.setCurrentTab(i10);
        }
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, oVar));
        }
    }
}
