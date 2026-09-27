package o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f118602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f118603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public char[] f118604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public char[] f118605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public char[] f118606m;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public j(char[] cArr) {
        super(cArr);
        this.f118602i = 0;
        this.f118603j = a.UNKNOWN;
        this.f118604k = "true".toCharArray();
        this.f118605l = "false".toCharArray();
        this.f118606m = fw.b.f85379f.toCharArray();
    }

    public static c A(char[] cArr) {
        return new j(cArr);
    }

    public boolean B() throws h {
        a aVar = this.f118603j;
        if (aVar == a.TRUE) {
            return true;
        }
        if (aVar == a.FALSE) {
            return false;
        }
        throw new h("this token is not a boolean: <" + f() + ">", this);
    }

    public a C() {
        return this.f118603j;
    }

    public boolean D() throws h {
        if (this.f118603j == a.NULL) {
            return true;
        }
        throw new h("this token is not a null: <" + f() + ">", this);
    }

    public boolean E(char c10, long j10) {
        int iOrdinal = this.f118603j.ordinal();
        boolean z10 = false;
        if (iOrdinal == 0) {
            char[] cArr = this.f118604k;
            int i10 = this.f118602i;
            if (cArr[i10] == c10) {
                this.f118603j = a.TRUE;
            } else if (this.f118605l[i10] == c10) {
                this.f118603j = a.FALSE;
            } else if (this.f118606m[i10] == c10) {
                this.f118603j = a.NULL;
            }
            z10 = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.f118604k;
            int i11 = this.f118602i;
            z10 = cArr2[i11] == c10;
            if (z10 && i11 + 1 == cArr2.length) {
                v(j10);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.f118605l;
            int i12 = this.f118602i;
            z10 = cArr3[i12] == c10;
            if (z10 && i12 + 1 == cArr3.length) {
                v(j10);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.f118606m;
            int i13 = this.f118602i;
            z10 = cArr4[i13] == c10;
            if (z10 && i13 + 1 == cArr4.length) {
                v(j10);
            }
        }
        this.f118602i++;
        return z10;
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        sb2.append(f());
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        if (!g.f118587d) {
            return f();
        }
        return "<" + f() + ">";
    }
}
