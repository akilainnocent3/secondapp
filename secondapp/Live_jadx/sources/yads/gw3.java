package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gw3 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xv3 f149809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw3 f149810b;

    public gw3(fw3 fw3Var) {
        this.f149810b = fw3Var;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        xv3 xv3Var = this.f149809a;
        if (xv3Var != null) {
            mw3 mw3Var = (mw3) xv3Var;
            mw3Var.f152711c = null;
            mw3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
