package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zrk0 implements Runnable {
    public final /* synthetic */ x9s a;
    public final /* synthetic */ String b;
    public final /* synthetic */ avk0 c;

    public zrk0(avk0 avk0Var, x9s x9sVar, String str) {
        this.a = x9sVar;
        this.b = str;
        this.c = avk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        avk0 avk0Var = this.c;
        int i = avk0Var.b;
        x9s x9sVar = this.a;
        if (i > 0) {
            Bundle bundle = avk0Var.c;
            x9sVar.onCreate(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (avk0Var.b >= 2) {
            x9sVar.onStart();
        }
        if (avk0Var.b >= 3) {
            x9sVar.onResume();
        }
        if (avk0Var.b >= 4) {
            x9sVar.onStop();
        }
        if (avk0Var.b >= 5) {
            x9sVar.onDestroy();
        }
    }
}
