package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z9s implements hbs, qz5 {
    public final ibs b;
    public final v36 c;
    public final Object a = new Object();
    public boolean d = false;
    public e6s e = null;

    public z9s(ibs ibsVar, v36 v36Var) {
        this.b = ibsVar;
        this.c = v36Var;
        if (ibsVar.getLifecycle().b().compareTo(s9s.b.d) >= 0) {
            v36Var.q();
        } else {
            v36Var.t();
        }
        ibsVar.getLifecycle().a(this);
    }

    @Override // defpackage.qz5
    public final l26 a() {
        return this.c.a.b;
    }

    public final void d(final e6s e6sVar) {
        synchronized (this.a) {
            try {
                e6s e6sVar2 = this.e;
                if (e6sVar2 == null) {
                    this.e = e6sVar;
                } else {
                    e6sVar2.getClass();
                    ArrayList arrayList = new ArrayList(this.e.e);
                    arrayList.addAll(e6sVar.e);
                    this.e = new e6s(e6sVar.a, arrayList);
                }
                synchronized (this.c.z) {
                }
                v36 v36Var = this.c;
                List<c26> list = e6sVar.a;
                synchronized (v36Var.z) {
                    v36Var.v = list;
                }
                synchronized (this.c.z) {
                }
                v36 v36Var2 = this.c;
                Range<Integer> range = e6sVar.b;
                synchronized (v36Var2.z) {
                    v36Var2.w = range;
                }
                m26 m26Var = (m26) a();
                m26Var.getClass();
                final kg50 kg50VarA = kg50.a.a(m26Var, e6sVar);
                e6sVar.g.execute(new Runnable() { // from class: y9s
                    @Override // java.lang.Runnable
                    public final void run() {
                        HashSet hashSet = new HashSet();
                        kg50 kg50Var = kg50VarA;
                        if (kg50Var != null) {
                            hashSet.addAll(kg50Var.a);
                        }
                        e6sVar.f.getClass();
                    }
                });
                this.c.d(e6sVar.e, kg50VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ibs j() {
        ibs ibsVar;
        synchronized (this.a) {
            ibsVar = this.b;
        }
        return ibsVar;
    }

    public final List<pnh0> k() {
        List<pnh0> listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.x());
        }
        return listUnmodifiableList;
    }

    @hoy(s9s.a.ON_DESTROY)
    public void onDestroy(ibs ibsVar) {
        synchronized (this.a) {
            v36 v36Var = this.c;
            v36Var.C((ArrayList) v36Var.x());
        }
    }

    @hoy(s9s.a.ON_PAUSE)
    public void onPause(ibs ibsVar) {
        this.c.a.g(false);
    }

    @hoy(s9s.a.ON_RESUME)
    public void onResume(ibs ibsVar) {
        this.c.a.g(true);
    }

    @hoy(s9s.a.ON_START)
    public void onStart(ibs ibsVar) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @hoy(s9s.a.ON_STOP)
    public void onStop(ibs ibsVar) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (this.b.getLifecycle().b().compareTo(s9s.b.d) >= 0) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
