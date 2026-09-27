package fb;

import fx.l;
import fx.m;
import fx.n;
import fx.o;
import fx.r0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f83799h = new String[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f83801c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f83802d = new String[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f83803e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f83805g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f83806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f83807b;

        public a(String[] strArr, r0 r0Var) {
            this.f83806a = strArr;
            this.f83807b = r0Var;
        }

        public static a a(String... strArr) {
            try {
                o[] oVarArr = new o[strArr.length];
                l lVar = new l();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.H(lVar, strArr[i10]);
                    lVar.readByte();
                    oVarArr[i10] = lVar.readByteString();
                }
                return new a((String[]) strArr.clone(), r0.j(oVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f83799h[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f83799h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void H(m mVar, String str) throws IOException {
        String str2;
        String[] strArr = f83799h;
        mVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        mVar.writeUtf8(str, i10, i11);
                    }
                    mVar.writeUtf8(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    mVar.writeUtf8(str, i10, i11);
                }
                mVar.writeUtf8(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            mVar.writeUtf8(str, i10, length);
        }
        mVar.writeByte(34);
    }

    public static c t(n nVar) {
        return new e(nVar);
    }

    public final void D(int i10) {
        int i11 = this.f83800b;
        int[] iArr = this.f83801c;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new fb.a("Nesting too deep at " + getPath());
            }
            this.f83801c = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f83802d;
            this.f83802d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f83803e;
            this.f83803e = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f83801c;
        int i12 = this.f83800b;
        this.f83800b = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int E(a aVar) throws IOException;

    public abstract void F() throws IOException;

    public abstract void G() throws IOException;

    public final fb.b I(String str) throws fb.b {
        throw new fb.b(str + " at path " + getPath());
    }

    public abstract void d() throws IOException;

    public final String getPath() {
        return d.a(this.f83800b, this.f83801c, this.f83802d, this.f83803e);
    }

    public abstract void h() throws IOException;

    public abstract void k() throws IOException;

    public abstract void l() throws IOException;

    public abstract boolean m() throws IOException;

    public abstract boolean n() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract String q() throws IOException;

    public abstract String r() throws IOException;

    public abstract b y() throws IOException;
}
