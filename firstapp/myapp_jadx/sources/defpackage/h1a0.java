package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h1a0 {
    public final int a;
    public final String b;
    public final mh4 c;
    public final i58 d = new i58(1.0f, 1.0f, 1.0f, 1.0f);
    public i58 e;
    public String f;
    public ef4 g;

    public h1a0(int i, String str, mh4 mh4Var) {
        if (i < 0) {
            hb5.a("index must be >= 0.");
            throw null;
        }
        if (str == null) {
            hb5.a("name cannot be null.");
            throw null;
        }
        if (mh4Var == null) {
            hb5.a("boneData cannot be null.");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = mh4Var;
    }

    public final String toString() {
        return this.b;
    }
}
