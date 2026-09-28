package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class y8i implements Callable<a9i.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public y8i(String str, Context context, List list, int i) {
        this.a = str;
        this.b = context;
        this.c = list;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final a9i.a call() {
        try {
            return a9i.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new a9i.a(-3);
        }
    }
}
