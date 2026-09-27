package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public interface k {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        boolean c();

        void d(boolean z10, char c10);

        void e(h hVar, int i10);

        boolean f();

        h getItemData();

        void setCheckable(boolean z10);

        void setChecked(boolean z10);

        void setEnabled(boolean z10);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    void a(e eVar);

    int getWindowAnimations();
}
