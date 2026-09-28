package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class af80 {
    public final kbs a;
    public final Handler b = new Handler();
    public a c;

    public static final class a implements Runnable {
        public final kbs a;
        public final s9s.a b;
        public boolean c;

        public a(kbs kbsVar, s9s.a aVar) {
            aVar.getClass();
            this.a = kbsVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c) {
                return;
            }
            this.a.g(this.b);
            this.c = true;
        }
    }

    public af80(pbs pbsVar) {
        this.a = new kbs(pbsVar, true);
    }

    public final void a(s9s.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        this.b.postAtFrontOfQueue(aVar3);
    }
}
