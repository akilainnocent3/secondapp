package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public interface j {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(@NonNull e eVar, boolean z10);

        boolean b(@NonNull e eVar);
    }

    void a(e eVar, boolean z10);

    boolean b(e eVar, h hVar);

    Parcelable c();

    void d(boolean z10);

    boolean e();

    boolean f(e eVar, h hVar);

    void g(Context context, e eVar);

    int getId();

    void h(a aVar);

    void i(Parcelable parcelable);

    boolean j(m mVar);

    k l(ViewGroup viewGroup);
}
