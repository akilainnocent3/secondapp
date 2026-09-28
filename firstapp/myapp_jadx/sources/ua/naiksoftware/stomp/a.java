package ua.naiksoftware.stomp;

import android.util.Log;
import defpackage.f1e0;
import defpackage.pse;
import defpackage.qm70;
import defpackage.wm70;
import java.util.concurrent.TimeUnit;
import ua.naiksoftware.stomp.a;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public qm70 a;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public transient long f = 0;
    public transient pse g;
    public transient pse h;
    public final InterfaceC1169a i;
    public final b j;

    /* JADX INFO: renamed from: ua.naiksoftware.stomp.a$a, reason: collision with other inner class name */
    public interface InterfaceC1169a {
        void a();
    }

    public interface b {
        void a();
    }

    public a(b bVar, InterfaceC1169a interfaceC1169a) {
        this.i = interfaceC1169a;
        this.j = bVar;
    }

    public final void a() {
        this.f = System.currentTimeMillis();
        Log.d("a", "Aborted last check because server sent heart-beat on time ('" + this.f + "'). So well-behaved :)");
        pse pseVar = this.h;
        if (pseVar != null) {
            pseVar.dispose();
        }
        d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean b(f1e0 f1e0Var) {
        String str = f1e0Var.a;
        str.getClass();
        switch (str) {
            case "CONNECTED":
                String strB = f1e0Var.b("heart-beat");
                if (strB != null) {
                    String[] strArrSplit = strB.split(",");
                    int i = this.e;
                    if (i > 0) {
                        this.c = Math.max(i, Integer.parseInt(strArrSplit[1]));
                    }
                    int i2 = this.d;
                    if (i2 > 0) {
                        this.b = Math.max(i2, Integer.parseInt(strArrSplit[0]));
                    }
                }
                int i3 = this.c;
                if (i3 > 0 || this.b > 0) {
                    this.a = wm70.c;
                    if (i3 > 0) {
                        Log.d("a", "Client will send heart-beat every " + this.c + " ms");
                        c();
                    }
                    if (this.b > 0) {
                        Log.d("a", "Client will listen to server heart-beat every " + this.b + " ms");
                        d();
                        this.f = System.currentTimeMillis();
                    }
                }
                return true;
            case "SEND":
                pse pseVar = this.g;
                if (pseVar != null) {
                    pseVar.dispose();
                }
                c();
                return true;
            case "UNKNOWN":
                if ("\n".equals(f1e0Var.c)) {
                    Log.d("a", "<<< PONG");
                    a();
                    return false;
                }
                return true;
            case "MESSAGE":
                a();
                return true;
            default:
                return true;
        }
    }

    public final void c() {
        if (this.c <= 0 || this.a == null) {
            return;
        }
        Log.d("a", "Scheduling client heart-beat to be sent in " + this.c + " ms");
        this.g = this.a.d(new Runnable() { // from class: sil
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.a;
                aVar.j.a();
                Log.d("a", "PING >>>");
                aVar.c();
            }
        }, (long) this.c, TimeUnit.MILLISECONDS);
    }

    public final void d() {
        if (this.b <= 0 || this.a == null) {
            return;
        }
        Log.d("a", "Scheduling server heart-beat to be checked in " + this.b + " ms and now is '" + System.currentTimeMillis() + "'");
        this.h = this.a.d(new Runnable() { // from class: til
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = this.a;
                if (aVar.b > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (aVar.f >= jCurrentTimeMillis - ((long) (aVar.b * 3))) {
                        Log.d("a", "We were checking and server sent heart-beat on time. So well-behaved :)");
                        aVar.f = System.currentTimeMillis();
                    } else {
                        StringBuilder sb = new StringBuilder("It's a sad day ;( Server didn't send heart-beat on time. Last received at '");
                        sb.append(aVar.f);
                        Log.d("a", zug.a(jCurrentTimeMillis, "' and now is '", "'", sb));
                        aVar.i.a();
                    }
                }
            }
        }, (long) this.b, TimeUnit.MILLISECONDS);
    }

    public final void e() {
        pse pseVar = this.g;
        if (pseVar != null) {
            pseVar.dispose();
        }
        pse pseVar2 = this.h;
        if (pseVar2 != null) {
            pseVar2.dispose();
        }
        this.f = 0L;
    }
}
