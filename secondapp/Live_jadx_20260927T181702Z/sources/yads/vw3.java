package yads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vw3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f157112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f157113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AudioManager f157114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ov3 f157115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jx3 f157116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f157117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f157118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f157119h;

    public vw3(Handler handler, Context context, ov3 ov3Var, jx3 jx3Var) {
        super(handler);
        this.f157117f = new AtomicReference(Float.valueOf(-1.0f));
        this.f157118g = new AtomicBoolean(false);
        this.f157119h = Executors.newSingleThreadExecutor();
        this.f157112a = handler;
        this.f157113b = context;
        this.f157114c = (AudioManager) context.getSystemService("audio");
        this.f157115d = ov3Var;
        this.f157116e = jx3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        if (this.f157118g.getAndSet(true)) {
            return;
        }
        this.f157119h.submit(new qw3(this));
    }
}
