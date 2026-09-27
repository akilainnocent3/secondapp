package d1;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class a {
        @k.t
        public static <T> T a(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    @NonNull
    public static View a(@NonNull Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i10);
        }
        View viewFindViewById = dialog.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
