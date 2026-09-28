package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class bj1 {
    public final eqa0 a;
    public int b;
    public final String c;
    public final String d;
    public final String e;
    public final lso f;
    public final mso g;
    public final tm h;

    public bj1(String str, String str2, String str3, lso lsoVar, mso msoVar, tm tmVar) {
        this.a = !a0d.a ? qwx.a : new fld0(Thread.currentThread().getStackTrace());
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = lsoVar;
        this.g = msoVar;
        if (tmVar != null) {
            this.h = tmVar;
        } else {
            bmy.a("Null advice");
            throw null;
        }
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final lso c() {
        return this.f;
    }

    public final String d() {
        return this.e;
    }

    public final mso e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        return b().equalsIgnoreCase(bj1Var.b()) && a().equals(bj1Var.a()) && d().equals(bj1Var.d()) && c().equals(bj1Var.c()) && e().equals(bj1Var.e());
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((b().toLowerCase(Locale.ROOT).hashCode() ^ 1000003) * 1000003) ^ a().hashCode()) * 1000003) ^ d().hashCode()) * 1000003) ^ c().hashCode()) * 1000003) ^ e().hashCode();
        this.b = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "InstrumentDescriptor{name=" + this.c + ", description=" + this.d + ", unit=" + this.e + ", type=" + this.f + ", valueType=" + this.g + ", advice=" + this.h + "}";
    }
}
