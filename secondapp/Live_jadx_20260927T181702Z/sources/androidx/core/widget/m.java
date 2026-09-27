package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class m {
    @Deprecated
    public static boolean a(@NonNull ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    @Deprecated
    public static void b(@NonNull ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
