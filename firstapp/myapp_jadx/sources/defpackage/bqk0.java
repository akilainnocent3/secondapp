package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bqk0 implements ipk0 {
    @Override // defpackage.ipk0
    public final ipk0 a() {
        return ipk0.o;
    }

    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof bqk0;
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return "undefined";
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
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
