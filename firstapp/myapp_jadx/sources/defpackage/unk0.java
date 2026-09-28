package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class unk0 implements ipk0 {
    public final boolean a;

    public unk0(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.ipk0
    public final ipk0 a() {
        return new unk0(Boolean.valueOf(this.a));
    }

    @Override // defpackage.ipk0
    public final ipk0 c(String str, g3l0 g3l0Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new ypk0(Boolean.toString(z));
        }
        hb5.a(v70.b(Boolean.toString(z), ".", str, " is not a function."));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unk0) && this.a == ((unk0) obj).a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.ipk0
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.ipk0
    public final Double zzd() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.ipk0
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.ipk0
    public final Iterator zzf() {
        return null;
    }
}
