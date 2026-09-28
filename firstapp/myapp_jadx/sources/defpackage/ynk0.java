package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ynk0 implements ipk0 {
    public final ipk0 a;
    public final String b;

    public ynk0(String str) {
        this.a = ipk0.o;
        this.b = str;
    }

    @Override // defpackage.ipk0
    public final ipk0 a() {
        return new ynk0(this.b, this.a.a());
    }

    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ynk0)) {
            return false;
        }
        ynk0 ynk0Var = (ynk0) obj;
        return this.b.equals(ynk0Var.b) && this.a.equals(ynk0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return null;
    }

    public ynk0(String str, ipk0 ipk0Var) {
        this.a = ipk0Var;
        this.b = str;
    }
}
