package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.e;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class vvi<H> extends evi {
    public final e a;
    public final Context b;
    public final Handler c;
    public final lwi d;

    public vvi(e eVar) {
        Handler handler = new Handler();
        this.a = eVar;
        this.b = eVar;
        this.c = handler;
        this.d = new lwi();
    }

    public abstract void d(PrintWriter printWriter, String[] strArr);

    public abstract e e();

    public abstract LayoutInflater f();

    public abstract boolean g(String str);

    public abstract void h();
}
