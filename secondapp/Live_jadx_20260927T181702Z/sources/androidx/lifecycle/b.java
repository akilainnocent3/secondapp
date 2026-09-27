package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final Application f13295d;

    public b(@oy.l Application application) {
        kotlin.jvm.internal.m0.p(application, "application");
        this.f13295d = application;
    }

    @oy.l
    public <T extends Application> T h() {
        T t10 = (T) this.f13295d;
        kotlin.jvm.internal.m0.n(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
