package o0;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i extends c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static c A(char[] cArr) {
        return new i(cArr);
    }

    @NonNull
    public static i B(@NonNull String str) {
        i iVar = new i(str.toCharArray());
        iVar.x(0L);
        iVar.v(str.length() - 1);
        return iVar;
    }

    @Override // o0.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && f().equals(((i) obj).f())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // o0.c
    public int hashCode() {
        return super.hashCode();
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        sb2.append("'");
        sb2.append(f());
        sb2.append("'");
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        return "'" + f() + "'";
    }
}
