package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class x1f0 {
    public static final ArrayList a(TabLayout tabLayout) {
        tabLayout.getClass();
        ArrayList arrayList = new ArrayList();
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            arrayList.add(tabLayout.k(i));
        }
        return CollectionsKt.R(arrayList);
    }
}
