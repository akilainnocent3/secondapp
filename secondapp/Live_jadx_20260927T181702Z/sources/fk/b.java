package fk;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik.f0 f84722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f84724c;

    public b(ik.f0 f0Var, String str, File file) {
        if (f0Var == null) {
            throw new NullPointerException("Null report");
        }
        this.f84722a = f0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f84723b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f84724c = file;
    }

    @Override // fk.f0
    public ik.f0 b() {
        return this.f84722a;
    }

    @Override // fk.f0
    public File c() {
        return this.f84724c;
    }

    @Override // fk.f0
    public String d() {
        return this.f84723b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f84722a.equals(f0Var.b()) && this.f84723b.equals(f0Var.d()) && this.f84724c.equals(f0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f84722a.hashCode() ^ 1000003) * 1000003) ^ this.f84723b.hashCode()) * 1000003) ^ this.f84724c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f84722a + ", sessionId=" + this.f84723b + ", reportFile=" + this.f84724c + "}";
    }
}
