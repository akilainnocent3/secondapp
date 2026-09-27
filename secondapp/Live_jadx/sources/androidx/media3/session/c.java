package androidx.media3.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Uri f14722g = Uri.parse("content://androidx.car.app.connection");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14723h = "CarConnectionState";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14724i = "androidx.car.app.connection.action.CAR_CONNECTION_UPDATED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f14726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f14727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f14728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f14729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f14730f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Executor executor = c.this.f14727c;
            final c cVar = c.this;
            executor.execute(new Runnable() { // from class: androidx.media3.session.d
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.h();
                }
            });
        }
    }

    public c(Context context, Runnable runnable) {
        this.f14725a = context.getApplicationContext();
        this.f14726b = runnable;
        Executor executorA = x4.c.a();
        this.f14727c = executorA;
        this.f14728d = new b();
        this.f14729e = new AtomicBoolean();
        this.f14730f = new AtomicBoolean();
        executorA.execute(new Runnable() { // from class: androidx.media3.session.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f14662b);
            }
        });
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.getClass();
        IntentFilter intentFilter = new IntentFilter(f14724i);
        if (Build.VERSION.SDK_INT >= 33) {
            cVar.f14725a.registerReceiver(cVar.f14728d, intentFilter, 2);
        } else {
            cVar.f14725a.registerReceiver(cVar.f14728d, intentFilter);
        }
        cVar.h();
    }

    public boolean e() {
        return this.f14729e.get();
    }

    public final boolean f() {
        try {
            Cursor cursorQuery = this.f14725a.getContentResolver().query(f14722g, new String[]{f14723h}, null, null, null);
            if (cursorQuery == null) {
                if (cursorQuery != null) {
                }
                return false;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex(f14723h);
                if (columnIndex != -1 && cursorQuery.moveToNext()) {
                    boolean z10 = cursorQuery.getInt(columnIndex) != 0;
                    cursorQuery.close();
                    return z10;
                }
            } catch (Throwable th2) {
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
            return false;
            cursorQuery.close();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void g() {
        if (this.f14730f.getAndSet(true)) {
            return;
        }
        this.f14727c.execute(new Runnable() { // from class: androidx.media3.session.a
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = this.f14518b;
                cVar.f14725a.unregisterReceiver(cVar.f14728d);
            }
        });
    }

    public final void h() {
        boolean z10 = this.f14729e.get();
        boolean zF = f();
        this.f14729e.set(zF);
        if (z10 == zF || this.f14730f.get()) {
            return;
        }
        this.f14726b.run();
    }
}
