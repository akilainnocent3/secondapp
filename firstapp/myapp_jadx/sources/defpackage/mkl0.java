package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class mkl0 extends vml0 {
    public final HashMap d;
    public final d6l0 e;
    public final d6l0 f;
    public final d6l0 g;
    public final d6l0 h;
    public final d6l0 i;
    public final d6l0 j;

    public mkl0(iol0 iol0Var) {
        super(iol0Var);
        this.d = new HashMap();
        j6l0 j6l0Var = this.a.e;
        k8l0.k(j6l0Var);
        this.e = new d6l0(j6l0Var, "last_delete_stale", 0L);
        j6l0 j6l0Var2 = this.a.e;
        k8l0.k(j6l0Var2);
        this.f = new d6l0(j6l0Var2, "last_delete_stale_batch", 0L);
        j6l0 j6l0Var3 = this.a.e;
        k8l0.k(j6l0Var3);
        this.g = new d6l0(j6l0Var3, "backoff", 0L);
        j6l0 j6l0Var4 = this.a.e;
        k8l0.k(j6l0Var4);
        this.h = new d6l0(j6l0Var4, "last_upload", 0L);
        j6l0 j6l0Var5 = this.a.e;
        k8l0.k(j6l0Var5);
        this.i = new d6l0(j6l0Var5, "last_upload_attempt", 0L);
        j6l0 j6l0Var6 = this.a.e;
        k8l0.k(j6l0Var6);
        this.j = new d6l0(j6l0Var6, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair k(String str) {
        sm.a aVarA;
        kkl0 kkl0Var;
        g();
        k8l0 k8l0Var = this.a;
        xi9 xi9Var = k8l0Var.k;
        wok0 wok0Var = k8l0Var.d;
        xi9Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.d;
        kkl0 kkl0Var2 = (kkl0) map.get(str);
        if (kkl0Var2 != null && jElapsedRealtime < kkl0Var2.c) {
            return new Pair(kkl0Var2.a, Boolean.valueOf(kkl0Var2.b));
        }
        long jN = wok0Var.n(str, v2l0.b) + jElapsedRealtime;
        try {
            try {
                aVarA = sm.a(k8l0Var.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (kkl0Var2 != null && jElapsedRealtime < kkl0Var2.c + wok0Var.n(str, v2l0.c)) {
                    return new Pair(kkl0Var2.a, Boolean.valueOf(kkl0Var2.b));
                }
                aVarA = null;
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.a;
            kkl0Var = str2 != null ? new kkl0(jN, str2, aVarA.b) : new kkl0(jN, "", aVarA.b);
            map.put(str, kkl0Var);
            return new Pair(kkl0Var.a, Boolean.valueOf(kkl0Var.b));
        } catch (Exception e) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.m.b(e, "Unable to get advertising id");
            kkl0Var = new kkl0(jN, "", false);
        }
    }

    @Deprecated
    public final String l(String str, boolean z) {
        g();
        String str2 = z ? (String) k(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestX = yol0.x();
        if (messageDigestX == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestX.digest(str2.getBytes())));
    }

    @Override // defpackage.vml0
    public final void j() {
    }
}
