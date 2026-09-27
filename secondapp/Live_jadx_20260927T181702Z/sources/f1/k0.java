package f1;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@oy.l SharedPreferences sharedPreferences, boolean z10, @oy.l ds.l<? super SharedPreferences.Editor, w2> lVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        lVar.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z10, ds.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        lVar.invoke(editorEdit);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
