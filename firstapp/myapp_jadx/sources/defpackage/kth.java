package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kth implements lzi {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    @Override // defpackage.lzi
    public final void a(e eVar) {
        if (!this.b && this.a.add(eVar)) {
            View decorView = eVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new jth(this, decorView));
        }
    }
}
