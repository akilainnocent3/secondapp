package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class fm5 implements Cloneable {
    public final char[] a;
    public long b = -1;
    public long c = Long.MAX_VALUE;
    public dm5 d;

    public fm5(char[] cArr) {
        this.a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public fm5 clone() {
        try {
            return (fm5) super.clone();
        } catch (CloneNotSupportedException unused) {
            x01.a();
            return null;
        }
    }

    public final String b() {
        String str = new String(this.a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public float c() {
        if (this instanceof hm5) {
            return ((hm5) this).c();
        }
        return Float.NaN;
    }

    public int d() {
        if (this instanceof hm5) {
            return ((hm5) this).d();
        }
        return 0;
    }

    public final String e() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm5)) {
            return false;
        }
        fm5 fm5Var = (fm5) obj;
        if (this.b == fm5Var.b && this.c == fm5Var.c && Arrays.equals(this.a, fm5Var.a)) {
            return Objects.equals(this.d, fm5Var.d);
        }
        return false;
    }

    public final void f(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        dm5 dm5Var = this.d;
        if (dm5Var != null) {
            dm5Var.h(this);
        }
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        dm5 dm5Var = this.d;
        return (i2 + (dm5Var != null ? dm5Var.hashCode() : 0)) * 31;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.b);
            sb.append("-");
            return nrz.a(this.c, ")", sb);
        }
        String strSubstring = new String(this.a).substring((int) this.b, ((int) this.c) + 1);
        StringBuilder sb2 = new StringBuilder(e());
        sb2.append(" (");
        sb2.append(this.b);
        sb2.append(" : ");
        em5.a(this.c, ") <<", strSubstring, sb2);
        sb2.append(">>");
        return sb2.toString();
    }
}
