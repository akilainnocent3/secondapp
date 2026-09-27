package yads;

import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f157771e = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dialog f157772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final um0 f157773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa2 f157774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f157775d;

    public xc(Dialog dialog, kd kdVar, um0 um0Var, oa2 oa2Var, Handler handler) {
        this.f157772a = dialog;
        this.f157773b = um0Var;
        this.f157774c = oa2Var;
        this.f157775d = handler;
    }
}
