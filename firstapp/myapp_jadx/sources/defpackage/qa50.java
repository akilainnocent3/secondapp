package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class qa50<T> implements Runnable {
    public y8i a;
    public z8i b;
    public Handler c;

    public class a implements Runnable {
        public final /* synthetic */ z8i a;
        public final /* synthetic */ Object b;

        public a(z8i z8iVar, Object obj) {
            this.a = z8iVar;
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.a.accept(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.a.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.c.post(new a(this.b, objCall));
    }
}
