package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gr5 implements zpc {
    public final br5 a;
    public final zpc b;
    public final laf0 c;
    public final zpc d;
    public final boolean e = false;
    public final boolean f = false;
    public final boolean g = false;
    public Uri h;
    public gqc i;
    public gqc j;
    public zpc k;
    public long l;
    public long m;
    public long n;
    public xr5 o;
    public boolean p;
    public boolean q;
    public long r;

    public static final class a implements zpc.a {
        public br5 a;
        public final ujh.a b = new ujh.a();
        public zpc.a c;

        @Override // zpc.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gr5 a() {
            zpc.a aVar = this.c;
            zpc zpcVarA = aVar != null ? aVar.a() : null;
            br5 br5Var = this.a;
            br5Var.getClass();
            return new gr5(br5Var, zpcVarA, this.b.a(), zpcVarA != null ? new fr5(br5Var) : null);
        }
    }

    public gr5(br5 br5Var, zpc zpcVar, zpc zpcVar2, fr5 fr5Var) {
        this.a = br5Var;
        this.b = zpcVar2;
        if (zpcVar != null) {
            this.d = zpcVar;
            this.c = fr5Var != null ? new laf0(zpcVar, fr5Var) : null;
        } else {
            this.d = ki10.a;
            this.c = null;
        }
    }

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) {
        long j;
        br5 br5Var = this.a;
        try {
            String string = gqcVar.h;
            if (string == null) {
                string = gqcVar.a.toString();
            }
            long j2 = gqcVar.f;
            long j3 = gqcVar.g;
            gqc.a aVarA = gqcVar.a();
            aVarA.h = string;
            gqc gqcVarA = aVarA.a();
            this.i = gqcVarA;
            Uri uri = gqcVarA.a;
            byte[] bArr = br5Var.b(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.h = uri;
            this.m = j2;
            long jA = -1;
            boolean z = (this.f && this.p) || (this.g && j3 == -1);
            this.q = z;
            if (z) {
                this.n = -1L;
                j = -1;
            } else {
                j = -1;
                jA = xza.a(br5Var.b(string));
                this.n = jA;
                if (jA != -1) {
                    jA -= j2;
                    this.n = jA;
                    if (jA < 0) {
                        throw new dqc(2008);
                    }
                }
            }
            if (j3 != j) {
                jA = jA == j ? j3 : Math.min(jA, j3);
                this.n = jA;
            }
            if (jA > 0 || jA == j) {
                o(gqcVarA, false);
            }
            return j3 != j ? j3 : this.n;
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof br5.a)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // defpackage.zpc
    public final void close() {
        this.i = null;
        this.h = null;
        this.m = 0L;
        try {
            n();
        } catch (Throwable th) {
            if (this.k == this.b || (th instanceof br5.a)) {
                this.p = true;
            }
            throw th;
        }
    }

    @Override // defpackage.zpc
    public final Map<String, List<String>> d() {
        return !(this.k == this.b) ? this.d.d() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
        mrg0Var.getClass();
        this.b.g(mrg0Var);
        this.d.g(mrg0Var);
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        br5 br5Var = this.a;
        zpc zpcVar = this.k;
        if (zpcVar == null) {
            return;
        }
        try {
            zpcVar.close();
        } finally {
            this.j = null;
            this.k = null;
            xr5 xr5Var = this.o;
            if (xr5Var != null) {
                br5Var.c(xr5Var);
                this.o = null;
            }
        }
    }

    public final void o(gqc gqcVar, boolean z) throws InterruptedIOException {
        qj90 qj90VarH;
        laf0 laf0Var;
        String str;
        long j;
        gqc gqcVarA;
        zpc zpcVar;
        String str2 = gqcVar.h;
        String str3 = jrh0.a;
        boolean z2 = this.q;
        br5 br5Var = this.a;
        if (z2) {
            qj90VarH = null;
        } else {
            long j2 = this.m;
            if (this.e) {
                try {
                    qj90VarH = br5Var.h(j2, str2, this.n);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                qj90VarH = br5Var.d(j2, str2, this.n);
            }
        }
        laf0 laf0Var2 = this.c;
        zpc zpcVar2 = this.b;
        zpc zpcVar3 = this.d;
        if (qj90VarH == null) {
            gqc.a aVarA = gqcVar.a();
            aVarA.f = this.m;
            aVarA.g = this.n;
            gqcVarA = aVarA.a();
            laf0Var = laf0Var2;
            str = str2;
            zpcVar = zpcVar3;
            j = -1;
        } else {
            long jMin = qj90VarH.c;
            if (qj90VarH.d) {
                Uri uriFromFile = Uri.fromFile(qj90VarH.e);
                long j3 = qj90VarH.b;
                j = -1;
                long j4 = this.m - j3;
                long jMin2 = jMin - j4;
                laf0Var = laf0Var2;
                str = str2;
                long j5 = this.n;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
                gqc.a aVarA2 = gqcVar.a();
                aVarA2.a = uriFromFile;
                aVarA2.b = j3;
                aVarA2.f = j4;
                aVarA2.g = jMin2;
                gqcVarA = aVarA2.a();
                zpcVar = zpcVar2;
            } else {
                laf0Var = laf0Var2;
                str = str2;
                j = -1;
                long j6 = this.n;
                if (jMin == -1) {
                    jMin = j6;
                } else if (j6 != -1) {
                    jMin = Math.min(jMin, j6);
                }
                gqc.a aVarA3 = gqcVar.a();
                aVarA3.f = this.m;
                aVarA3.g = jMin;
                gqcVarA = aVarA3.a();
                if (laf0Var != null) {
                    zpcVar = laf0Var;
                } else {
                    br5Var.c(qj90VarH);
                    zpcVar = zpcVar3;
                    qj90VarH = null;
                }
            }
        }
        this.r = (this.q || zpcVar != zpcVar3) ? Long.MAX_VALUE : this.m + 102400;
        if (z) {
            ly0.f(this.k == zpcVar3);
            if (zpcVar == zpcVar3) {
                return;
            }
            try {
                n();
            } catch (Throwable th) {
                if (!qj90VarH.d) {
                    br5Var.c(qj90VarH);
                }
                throw th;
            }
        }
        if (qj90VarH != null && !qj90VarH.d) {
            this.o = qj90VarH;
        }
        this.k = zpcVar;
        this.j = gqcVarA;
        this.l = 0L;
        long jA = zpcVar.a(gqcVarA);
        yza yzaVar = new yza();
        if (gqcVarA.g == j && jA != j) {
            this.n = jA;
            yzaVar.a(Long.valueOf(this.m + jA), "exo_len");
        }
        if (!(this.k == zpcVar2)) {
            Uri uri = zpcVar.getUri();
            this.h = uri;
            Uri uri2 = !gqcVar.a.equals(uri) ? this.h : null;
            if (uri2 == null) {
                yzaVar.b.add("exo_redir");
                yzaVar.a.remove("exo_redir");
            } else {
                yzaVar.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.k == laf0Var) {
            br5Var.i(str, yzaVar);
        }
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        zpc zpcVar = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            return -1;
        }
        gqc gqcVar = this.i;
        gqcVar.getClass();
        gqc gqcVar2 = this.j;
        gqcVar2.getClass();
        try {
            if (this.m >= this.r) {
                o(gqcVar, true);
            }
            zpc zpcVar2 = this.k;
            zpcVar2.getClass();
            int i4 = zpcVar2.read(bArr, i, i2);
            zpc zpcVar3 = this.k;
            if (i4 != -1) {
                long j2 = i4;
                this.m += j2;
                this.l += j2;
                long j3 = this.n;
                if (j3 == -1) {
                    return i4;
                }
                this.n = j3 - j2;
                return i4;
            }
            if (!(zpcVar3 == zpcVar)) {
                j = -1;
                long j4 = gqcVar2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.l < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = gqcVar.h;
                String str2 = jrh0.a;
                this.n = 0L;
                if (!(zpcVar3 == this.c)) {
                    return i3;
                }
                yza yzaVar = new yza();
                yzaVar.a(Long.valueOf(this.m), "exo_len");
                this.a.i(str, yzaVar);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.n;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            n();
            o(gqcVar, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.k == zpcVar || (th instanceof br5.a)) {
                this.p = true;
            }
            throw th;
        }
    }
}
