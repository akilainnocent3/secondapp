package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class yh1 extends zxb {
    public final Context a;
    public final ss7 b;
    public final ss7 c;
    public final String d;

    public yh1(Context context, ss7 ss7Var, ss7 ss7Var2, String str) {
        if (context == null) {
            bmy.a("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (ss7Var == null) {
            bmy.a("Null wallClock");
            throw null;
        }
        this.b = ss7Var;
        if (ss7Var2 == null) {
            bmy.a("Null monotonicClock");
            throw null;
        }
        this.c = ss7Var2;
        if (str != null) {
            this.d = str;
        } else {
            bmy.a("Null backendName");
            throw null;
        }
    }

    @Override // defpackage.zxb
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.zxb
    public final String b() {
        return this.d;
    }

    @Override // defpackage.zxb
    public final ss7 c() {
        return this.c;
    }

    @Override // defpackage.zxb
    public final ss7 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zxb)) {
            return false;
        }
        zxb zxbVar = (zxb) obj;
        return this.a.equals(zxbVar.a()) && this.b.equals(zxbVar.d()) && this.c.equals(zxbVar.c()) && this.d.equals(zxbVar.b());
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return uf80.a(sb, this.d, "}");
    }
}
