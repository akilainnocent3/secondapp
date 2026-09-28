package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class apk0 implements ipk0 {
    @Override // defpackage.ipk0
    public final ipk0 a() {
        return ipk0.p;
    }

    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof apk0;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return "null";
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return null;
    }
}
