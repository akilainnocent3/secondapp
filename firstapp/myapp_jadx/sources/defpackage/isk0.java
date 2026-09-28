package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class isk0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzbe f;

    public isk0(k8l0 k8l0Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        hm20.e(str2);
        hm20.e(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.b(y4l0.k(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    y4l0 y4l0Var2 = k8l0Var.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.f.a("Param name can't be null");
                    it.remove();
                } else {
                    yol0 yol0Var = k8l0Var.i;
                    k8l0.k(yol0Var);
                    Object objN = yol0Var.n(bundle2.get(next), next);
                    if (objN == null) {
                        y4l0 y4l0Var3 = k8l0Var.f;
                        k8l0.m(y4l0Var3);
                        y4l0Var3.i.b(k8l0Var.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        yol0 yol0Var2 = k8l0Var.i;
                        k8l0.k(yol0Var2);
                        yol0Var2.v(bundle2, next, objN);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f = zzbeVar;
    }

    public final isk0 a(k8l0 k8l0Var, long j) {
        return new isk0(k8l0Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String string = this.f.a.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        hxa.c(sb, "Event{appId='", str, "', name='", str2);
        return pr0.a(sb, "', params=", string, "}");
    }

    public isk0(k8l0 k8l0Var, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        hm20.e(str2);
        hm20.e(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.c(y4l0.k(str2), "Event created with reverse previous/current timestamps. appId, name", y4l0.k(str3));
        }
        this.f = zzbeVar;
    }
}
