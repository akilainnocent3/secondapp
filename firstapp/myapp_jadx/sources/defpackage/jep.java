package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jep implements Closeable {
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;

    public static final class a {
        public final String[] a;
        public final t2z b;

        public a(String[] strArr, t2z t2zVar) {
            this.a = strArr;
            this.b = t2zVar;
        }

        public static a a(String... strArr) {
            try {
                rl5[] rl5VarArr = new rl5[strArr.length];
                lb5 lb5Var = new lb5();
                for (int i = 0; i < strArr.length; i++) {
                    ifp.c0(lb5Var, strArr[i]);
                    lb5Var.readByte();
                    rl5VarArr[i] = lb5Var.B0(lb5Var.b);
                }
                String[] strArr2 = (String[]) strArr.clone();
                int i2 = t2z.d;
                return new a(strArr2, t2z.a.b(rl5VarArr));
            } catch (IOException e) {
                jb5.a(e);
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    public abstract int F();

    public abstract void G();

    public abstract String H();

    public abstract b J();

    public final void P(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new lcp("Nesting too deep at ".concat(m()));
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

    public final void a0(String str) throws fdp {
        StringBuilder sbB = mq0.b(str, " at path ");
        sbB.append(m());
        throw new fdp(sbB.toString());
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract void l();

    public final String m() {
        return lep.b(this.a, this.b, this.c, this.d);
    }

    public abstract boolean o();

    public abstract double u();
}
