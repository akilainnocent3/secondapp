package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public final class v7u<T> implements su5<T> {
    public final su5<T> a;
    public final String b;
    public final rdd0 c;

    public static final class a implements gv5<T> {
        public final /* synthetic */ v7u<T> a;
        public final /* synthetic */ long b;
        public final /* synthetic */ gv5<T> c;

        public a(v7u<T> v7uVar, long j, gv5<T> gv5Var) {
            this.a = v7uVar;
            this.b = j;
            this.c = gv5Var;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<T> su5Var, Throwable th) {
            th.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            v7u<T> v7uVar = this.a;
            v7uVar.a(jElapsedRealtime, false);
            this.c.onFailure(v7uVar, th);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<T> su5Var, bi50<T> bi50Var) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            boolean zA = y7u.a(bi50Var);
            v7u<T> v7uVar = this.a;
            v7uVar.a(jElapsedRealtime, zA);
            this.c.onResponse(v7uVar, bi50Var);
        }
    }

    public v7u(su5<T> su5Var, String str, rdd0 rdd0Var) {
        su5Var.getClass();
        rdd0Var.getClass();
        this.a = su5Var;
        this.b = str;
        this.c = rdd0Var;
    }

    @Override // defpackage.su5
    public final void G(gv5<T> gv5Var) {
        gv5Var.getClass();
        this.a.G(new a(this, SystemClock.elapsedRealtime(), gv5Var));
    }

    public final void a(long j, boolean z) {
        try {
            zi50.a aVar = zi50.b;
            djr.a(this.c, new cjr.a(j, this.b, z));
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    @Override // defpackage.su5
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.su5
    public final su5<T> clone() {
        return new v7u(this.a.clone(), this.b, this.c);
    }

    @Override // defpackage.su5
    public final bi50<T> execute() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bi50<T> bi50VarExecute = this.a.execute();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            bi50VarExecute.getClass();
            a(jElapsedRealtime2, y7u.a(bi50VarExecute));
            return bi50VarExecute;
        } catch (Throwable th) {
            a(SystemClock.elapsedRealtime() - jElapsedRealtime, false);
            throw th;
        }
    }

    @Override // defpackage.su5
    public final boolean isCanceled() {
        return this.a.isCanceled();
    }

    @Override // defpackage.su5
    public final Request request() {
        Request request = this.a.request();
        request.getClass();
        return request;
    }
}
