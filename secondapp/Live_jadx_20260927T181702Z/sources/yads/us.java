package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f156564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gf f156565b;

    public /* synthetic */ us(Context context) {
        this(new Handler(Looper.getMainLooper()), ws.a(context));
    }

    public us(Handler handler, gf gfVar) {
        this.f156564a = handler;
        this.f156565b = gfVar;
    }
}
