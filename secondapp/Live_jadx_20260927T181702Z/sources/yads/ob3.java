package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ob3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f153427c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f153428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f153429b;

    public /* synthetic */ ob3(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f153428a.post(new Runnable() { // from class: yads.i74
            @Override // java.lang.Runnable
            public final void run() {
                ob3.a(this.f150463b);
            }
        });
    }

    public static final void a(ob3 ob3Var) {
        Toast.makeText(ob3Var.f153429b, f153427c, 1).show();
    }

    public ob3(Context context, Handler handler) {
        this.f153428a = handler;
        this.f153429b = context.getApplicationContext();
    }
}
