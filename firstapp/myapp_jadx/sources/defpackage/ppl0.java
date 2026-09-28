package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class ppl0 extends z2l0 {
    public final wgl0 a;
    public final TaskCompletionSource b;
    public final /* synthetic */ zql0 c;
    public final /* synthetic */ zql0 d;

    public ppl0(zql0 zql0Var, TaskCompletionSource taskCompletionSource, String str) {
        this.d = zql0Var;
        wgl0 wgl0Var = new wgl0("OnRequestInstallCallback");
        this.c = zql0Var;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.a = wgl0Var;
        this.b = taskCompletionSource;
    }
}
