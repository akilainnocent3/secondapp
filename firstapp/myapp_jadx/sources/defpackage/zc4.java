package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zc4 {
    public final int a;
    public final CharSequence b;

    public zc4(int i, CharSequence charSequence) {
        this.a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zc4)) {
            return false;
        }
        zc4 zc4Var = (zc4) obj;
        if (this.a != zc4Var.a) {
            return false;
        }
        CharSequence charSequence = zc4Var.b;
        CharSequence charSequence2 = this.b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
