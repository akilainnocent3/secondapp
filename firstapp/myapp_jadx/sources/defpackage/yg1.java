package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class yg1 extends ztb {
    public final xg1 a;
    public final String b;
    public final File c;

    public yg1(xg1 xg1Var, String str, File file) {
        this.a = xg1Var;
        if (str == null) {
            bmy.a("Null sessionId");
            throw null;
        }
        this.b = str;
        if (file != null) {
            this.c = file;
        } else {
            bmy.a("Null reportFile");
            throw null;
        }
    }

    @Override // defpackage.ztb
    public final ktb a() {
        return this.a;
    }

    @Override // defpackage.ztb
    public final File b() {
        return this.c;
    }

    @Override // defpackage.ztb
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ztb)) {
            return false;
        }
        ztb ztbVar = (ztb) obj;
        return this.a.equals(ztbVar.a()) && this.b.equals(ztbVar.c()) && this.c.equals(ztbVar.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
