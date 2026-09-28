package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class qsb {
    public final Context a;
    public final toc b;
    public final coy c;
    public final long d;
    public vsb e;
    public vsb f;
    public esb g;
    public final x6n h;
    public final xkh i;
    public final b00 j;
    public final c00 k;
    public final wrb l;
    public final gtb m;
    public final f650 n;
    public final mub o;

    public qsb(yoh yohVar, x6n x6nVar, gtb gtbVar, toc tocVar, b00 b00Var, c00 c00Var, xkh xkhVar, wrb wrbVar, f650 f650Var, mub mubVar) {
        this.b = tocVar;
        yohVar.a();
        this.a = yohVar.a;
        this.h = x6nVar;
        this.m = gtbVar;
        this.j = b00Var;
        this.k = c00Var;
        this.i = xkhVar;
        this.l = wrbVar;
        this.n = f650Var;
        this.o = mubVar;
        this.d = System.currentTimeMillis();
        this.c = new coy();
    }

    public final void a(fk80 fk80Var) {
        mub.a();
        mub.a();
        this.e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.a(new w95() { // from class: osb
                    @Override // defpackage.w95
                    public final void a(String str) {
                        qsb qsbVar = this.a;
                        qsbVar.getClass();
                        qsbVar.o.a.a(new lsb(qsbVar, System.currentTimeMillis() - qsbVar.d, str));
                    }
                });
                this.g.g();
                if (!fk80Var.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.c(fk80Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(fk80Var.h.get().getTask());
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(final fk80 fk80Var) {
        Future<?> futureSubmit = this.o.a.a.submit(new Runnable() { // from class: nsb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(fk80Var);
            }
        });
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        mub.a();
        try {
            vsb vsbVar = this.e;
            xkh xkhVar = vsbVar.b;
            if (new File(xkhVar.c, vsbVar.a).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
