package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes8.dex */
public final class m760<R> implements tu5<R, Object> {
    public final Type a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public m760(Type type, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = type;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    @Override // defpackage.tu5
    public final Type a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    @Override // defpackage.tu5
    public final Object b(su5<R> su5Var) {
        ucy kh4Var;
        ucy vu5Var = new vu5(su5Var);
        if (!this.b) {
            if (this.c) {
                kh4Var = new kh4(vu5Var);
            }
            if (this.d) {
                return vu5Var.i(qt1.a);
            }
            if (this.e) {
                return new cey(vu5Var);
            }
            if (this.f) {
                return new bey();
            }
            if (this.g) {
                return new ody(vu5Var);
            }
            return vu5Var;
        }
        kh4Var = new vj50(vu5Var);
        vu5Var = kh4Var;
        if (this.d) {
            return vu5Var.i(qt1.a);
        }
        if (this.e) {
            return new cey(vu5Var);
        }
        if (this.f) {
            return new bey();
        }
        if (this.g) {
            return new ody(vu5Var);
        }
        return vu5Var;
    }
}
