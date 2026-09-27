package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public abstract class k {
    @NonNull
    public List<k> a() {
        return Collections.EMPTY_LIST;
    }

    public abstract String b(int i10);

    public abstract ViewDataBinding c(l lVar, View view, int i10);

    public abstract ViewDataBinding d(l lVar, View[] viewArr, int i10);

    public abstract int e(String str);
}
