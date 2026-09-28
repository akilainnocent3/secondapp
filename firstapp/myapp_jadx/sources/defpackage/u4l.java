package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collection;
import java.util.Collections;
import sl0.d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u4l<O extends sl0.d> {
    public final Context a;
    public final String b;
    public final sl0 c;
    public final sl0.d d;
    public final qn0 e;
    public final Looper f;
    public final int g;
    public final ogk0 h;
    public final om0 i;
    public final y4l j;

    public static class a {
        public static final a c = new a(new om0(), Looper.getMainLooper());
        public final om0 a;
        public final Looper b;

        public a(om0 om0Var, Looper looper) {
            this.a = om0Var;
            this.b = looper;
        }
    }

    public u4l() {
        throw null;
    }

    public final hs7.a a() {
        GoogleSignInAccount googleSignInAccountG;
        GoogleSignInAccount googleSignInAccountG2;
        hs7.a aVar = new hs7.a();
        sl0.d dVar = this.d;
        boolean z = dVar instanceof sl0.d.b;
        Account account = null;
        if (z && (googleSignInAccountG2 = ((sl0.d.b) dVar).G()) != null) {
            String str = googleSignInAccountG2.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else if (dVar instanceof sl0.d.a) {
            account = ((sl0.d.a) dVar).getAccount();
        }
        aVar.a = account;
        Collection collectionG0 = (!z || (googleSignInAccountG = ((sl0.d.b) dVar).G()) == null) ? Collections.EMPTY_SET : googleSignInAccountG.G0();
        tx0 tx0Var = aVar.b;
        if (tx0Var == null) {
            tx0Var = new tx0(0);
            aVar.b = tx0Var;
        }
        tx0Var.addAll(collectionG0);
        Context context = this.a;
        aVar.d = context.getClass().getName();
        aVar.c = context.getPackageName();
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    public final Task<Boolean> b(yis.a<?> aVar, int i) {
        hm20.i(aVar, "Listener key cannot be null.");
        y4l y4lVar = this.j;
        y4lVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        y4lVar.f(taskCompletionSource, i, this);
        bhk0 bhk0Var = new bhk0(new kik0(aVar, taskCompletionSource), y4lVar.w.get(), this);
        ljk0 ljk0Var = y4lVar.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(13, bhk0Var));
        return taskCompletionSource.getTask();
    }

    public final Task c(int i, jhk0 jhk0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        y4l y4lVar = this.j;
        y4lVar.getClass();
        y4lVar.f(taskCompletionSource, jhk0Var.c, this);
        bhk0 bhk0Var = new bhk0(new eik0(i, jhk0Var, taskCompletionSource, this.i), y4lVar.w.get(), this);
        ljk0 ljk0Var = y4lVar.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(4, bhk0Var));
        return taskCompletionSource.getTask();
    }

    public u4l(Context context, fq0 fq0Var, sl0 sl0Var, sl0.d dVar, a aVar) {
        String attributionTag;
        hm20.i(context, "Null context is not permitted.");
        hm20.i(sl0Var, "Api must not be null.");
        hm20.i(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        hm20.i(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            attributionTag = context.getAttributionTag();
        } else {
            attributionTag = null;
        }
        this.b = attributionTag;
        this.c = sl0Var;
        this.d = dVar;
        this.f = aVar.b;
        qn0 qn0Var = new qn0(sl0Var, dVar, attributionTag);
        this.e = qn0Var;
        this.h = new ogk0(this);
        y4l y4lVarG = y4l.g(applicationContext);
        this.j = y4lVarG;
        this.g = y4lVarG.v.getAndIncrement();
        this.i = aVar.a;
        if (fq0Var != null && Looper.myLooper() == Looper.getMainLooper()) {
            dbs fragment = x9s.getFragment((Activity) fq0Var);
            ufk0 ufk0Var = (ufk0) fragment.q(ufk0.class, llGRV.iMclz);
            ufk0Var = ufk0Var == null ? new ufk0(fragment, y4lVarG, v4l.d) : ufk0Var;
            ufk0Var.e.add(qn0Var);
            y4lVarG.a(ufk0Var);
        }
        ljk0 ljk0Var = y4lVarG.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(7, this));
    }
}
