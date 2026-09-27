package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mh1 f157968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f157969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f157970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f157971d;

    public /* synthetic */ xr0() {
        this(new mh1(), new Handler(Looper.getMainLooper()));
    }

    public xr0(mh1 mh1Var, Handler handler) {
        this.f157968a = mh1Var;
        this.f157969b = handler;
        this.f157970c = new LinkedHashMap();
    }
}
