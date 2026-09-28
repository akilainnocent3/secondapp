package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sal implements e6h, eq40 {
    public final rwd0 a;
    public int b;
    public qal c;
    public int d = -1;
    public int e = -1;
    public float f = 0.0f;
    public String g;

    public sal(rwd0 rwd0Var) {
        this.a = rwd0Var;
    }

    @Override // defpackage.eq40
    public final ixa a() {
        qal qalVar = this.c;
        if (qalVar != null) {
            return qalVar;
        }
        qal qalVar2 = new qal();
        this.c = qalVar2;
        return qalVar2;
    }

    @Override // defpackage.e6h
    public final void apply() {
        this.c.X(this.b);
        int i = this.d;
        if (i != -1) {
            qal qalVar = this.c;
            if (i <= -1) {
                qalVar.getClass();
                return;
            }
            qalVar.v0 = -1.0f;
            qalVar.w0 = i;
            qalVar.x0 = -1;
            return;
        }
        int i2 = this.e;
        qal qalVar2 = this.c;
        if (i2 != -1) {
            if (i2 <= -1) {
                qalVar2.getClass();
                return;
            }
            qalVar2.v0 = -1.0f;
            qalVar2.w0 = -1;
            qalVar2.x0 = i2;
            return;
        }
        float f = this.f;
        if (f <= -1.0f) {
            qalVar2.getClass();
            return;
        }
        qalVar2.v0 = f;
        qalVar2.w0 = -1;
        qalVar2.x0 = -1;
    }

    @Override // defpackage.eq40
    public final void b(ixa ixaVar) {
        if (ixaVar instanceof qal) {
            this.c = (qal) ixaVar;
        } else {
            this.c = null;
        }
    }

    @Override // defpackage.eq40
    public final e6h c() {
        return null;
    }

    @Override // defpackage.eq40
    public final Object getKey() {
        return this.g;
    }
}
