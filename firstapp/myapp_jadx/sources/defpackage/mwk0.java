package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class mwk0 implements pfl0 {
    public final /* synthetic */ p1l0 a;

    public mwk0(p1l0 p1l0Var) {
        this.a = p1l0Var;
    }

    @Override // defpackage.pfl0
    public final void a(String str, String str2, Bundle bundle) {
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new g0l0(p1l0Var, str, str2, bundle, true));
    }

    @Override // defpackage.pfl0
    public final void b(Bundle bundle) {
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new mxk0(p1l0Var, bundle));
    }

    @Override // defpackage.pfl0
    public final void c(String str) {
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new jyk0(p1l0Var, str));
    }

    @Override // defpackage.pfl0
    public final void d(String str) {
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new gyk0(p1l0Var, str));
    }

    @Override // defpackage.pfl0
    public final int e(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.pfl0
    public final Map f(String str, String str2, boolean z) {
        return this.a.a(str, str2, z);
    }

    @Override // defpackage.pfl0
    public final void g(String str, String str2, Bundle bundle) {
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new pxk0(p1l0Var, str, str2, bundle));
    }

    @Override // defpackage.pfl0
    public final List h(String str, String str2) {
        return this.a.f(str, str2);
    }

    @Override // defpackage.pfl0
    public final String zzh() {
        qvk0 qvk0Var = new qvk0();
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new uyk0(p1l0Var, qvk0Var));
        return qvk0Var.b(500L);
    }

    @Override // defpackage.pfl0
    public final String zzi() {
        qvk0 qvk0Var = new qvk0();
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new nzk0(p1l0Var, qvk0Var));
        return qvk0Var.b(500L);
    }

    @Override // defpackage.pfl0
    public final String zzj() {
        qvk0 qvk0Var = new qvk0();
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new syk0(p1l0Var, qvk0Var));
        return qvk0Var.b(50L);
    }

    @Override // defpackage.pfl0
    public final String zzk() {
        qvk0 qvk0Var = new qvk0();
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new ryk0(p1l0Var, qvk0Var));
        return qvk0Var.b(500L);
    }

    @Override // defpackage.pfl0
    public final long zzl() {
        qvk0 qvk0Var = new qvk0();
        p1l0 p1l0Var = this.a;
        p1l0Var.c(new tyk0(p1l0Var, qvk0Var));
        Long l = (Long) qvk0.Z(qvk0Var.d(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = p1l0Var.d + 1;
        p1l0Var.d = i;
        return jNextLong + ((long) i);
    }
}
