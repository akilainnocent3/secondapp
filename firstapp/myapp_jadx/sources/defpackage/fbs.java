package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class fbs implements t9s, hbs {
    public final HashSet a = new HashSet();
    public final s9s b;

    public fbs(s9s s9sVar) {
        this.b = s9sVar;
        s9sVar.a(this);
    }

    @Override // defpackage.t9s
    public final void a(gbs gbsVar) {
        this.a.add(gbsVar);
        s9s s9sVar = this.b;
        if (s9sVar.b() == s9s.b.a) {
            gbsVar.onDestroy();
        } else if (s9sVar.b().compareTo(s9s.b.d) >= 0) {
            gbsVar.b();
        } else {
            gbsVar.c();
        }
    }

    @Override // defpackage.t9s
    public final void b(gbs gbsVar) {
        this.a.remove(gbsVar);
    }

    @hoy(s9s.a.ON_DESTROY)
    public void onDestroy(ibs ibsVar) {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((gbs) obj).onDestroy();
        }
        ibsVar.getLifecycle().d(this);
    }

    @hoy(s9s.a.ON_START)
    public void onStart(ibs ibsVar) {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((gbs) obj).b();
        }
    }

    @hoy(s9s.a.ON_STOP)
    public void onStop(ibs ibsVar) {
        ArrayList arrayListE = erh0.e(this.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((gbs) obj).c();
        }
    }
}
