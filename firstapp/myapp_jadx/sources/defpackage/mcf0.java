package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class mcf0 implements sl0.d {
    public static final mcf0 b = new mcf0(null);
    public final String a;

    public /* synthetic */ mcf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mcf0) {
            return scy.a(this.a, ((mcf0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
