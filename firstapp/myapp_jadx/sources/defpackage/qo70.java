package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qo70 implements h8n.i {
    public final h8n.i a;
    public final Object b = new Object();
    public boolean c;
    public h8n.j d;

    public qo70(h8n.i iVar) {
        this.a = iVar;
    }

    @Override // h8n.i
    public final void a(long j, h8n.j jVar) {
        jVar.getClass();
        synchronized (this.b) {
            this.c = true;
            this.d = jVar;
            Unit unit = Unit.a;
        }
        h8n.i iVar = this.a;
        if (iVar != null) {
            iVar.a(j, new h8n.j() { // from class: po70
                @Override // h8n.j
                public final void a() {
                    qo70 qo70Var = this.a;
                    synchronized (qo70Var.b) {
                        try {
                            if (qo70Var.d == null) {
                                pgt.i("ScreenFlashWrapper", "apply: pendingListener is null!");
                            }
                            qo70Var.c();
                            Unit unit2 = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        } else {
            pgt.c("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    h8n.i iVar = this.a;
                    if (iVar != null) {
                        iVar.clear();
                    } else {
                        pgt.c("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    pgt.i("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                h8n.j jVar = this.d;
                if (jVar != null) {
                    jVar.a();
                }
                this.d = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h8n.i
    public final void clear() {
        b();
    }
}
