package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qjm {
    public final qkf0 a;
    public int b = -1;
    public float c;

    public qjm(qkf0 qkf0Var) {
        this.a = qkf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 1;
        qkf0 qkf0Var = this.a;
        if (z) {
            int iB = he4.b(qkf0Var.f, i, z);
            int lineStart = qkf0Var.f.getLineStart(iB);
            int iF = qkf0Var.f(iB);
            if (i == lineStart || i == iF) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.b == i4) {
            return this.c;
        }
        float fH = z3 ? qkf0Var.h(i, z) : qkf0Var.i(i, z);
        if (z2) {
            this.b = i4;
            this.c = fH;
        }
        return fH;
    }
}
