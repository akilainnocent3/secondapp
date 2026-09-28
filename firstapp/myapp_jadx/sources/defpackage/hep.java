package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class hep implements Closeable {
    public static final String[] e = new String[128];
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a {
        public final String[] a;
        public final t2z b;

        public a(String[] strArr, t2z t2zVar) {
            this.a = strArr;
            this.b = t2zVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        public static a a(String... strArr) {
            String str;
            try {
                rl5[] rl5VarArr = new rl5[strArr.length];
                lb5 lb5Var = new lb5();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = hep.e;
                    lb5Var.d0(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    lb5Var.u0(i2, i3, str2);
                                }
                                lb5Var.z0(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                lb5Var.u0(i2, i3, str2);
                            }
                            lb5Var.z0(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        lb5Var.u0(i2, length, str2);
                    }
                    lb5Var.d0(34);
                    lb5Var.readByte();
                    rl5VarArr[i] = lb5Var.B0(lb5Var.b);
                }
                String[] strArr3 = (String[]) strArr.clone();
                int i4 = t2z.d;
                return new a(strArr3, t2z.a.b(rl5VarArr));
            } catch (IOException e) {
                jb5.a(e);
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes8.dex */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b i;
        public static final b v;
        public static final b w;
        public static final b y;
        public static final /* synthetic */ b[] z;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            a = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            b = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            c = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            d = bVar4;
            b bVar5 = new b("NAME", 4);
            e = bVar5;
            b bVar6 = new b("STRING", 5);
            f = bVar6;
            b bVar7 = new b("NUMBER", 6);
            i = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            v = bVar8;
            b bVar9 = new b("NULL", 8);
            w = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            y = bVar10;
            z = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) z.clone();
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double F();

    public abstract int G();

    public abstract String H();

    public abstract b J();

    public final void P(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new mcp("Nesting too deep at ".concat(m()));
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int V(a aVar);

    public abstract void Y();

    public abstract void Z();

    public final void a0(String str) throws hdp {
        StringBuilder sbB = mq0.b(str, " at path ");
        sbB.append(m());
        throw new hdp(sbB.toString());
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract void l();

    public final String m() {
        int i = this.a;
        int[] iArr = this.b;
        String[] strArr = this.c;
        int[] iArr2 = this.d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean o();

    public abstract boolean u();
}
