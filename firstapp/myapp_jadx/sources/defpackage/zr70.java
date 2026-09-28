package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zr70 {
    public static final zr70 b;
    public final tcn<Integer> a;

    public static final class a {
        public tcn<Integer> a;
    }

    static {
        a aVar = new a();
        aVar.a = tcn.j(2, 1, 5);
        b = new zr70(aVar);
    }

    public zr70(a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zr70) && this.a.equals(((zr70) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool);
    }
}
