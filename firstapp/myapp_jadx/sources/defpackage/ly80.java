package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ly80 implements a0b {
    public final String a;
    public final be0 b;
    public final ArrayList c;
    public final ae0 d;
    public final de0 e;
    public final be0 f;
    public final a g;
    public final b h;
    public final float i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("BUTT", 0);
            a = aVar;
            b = new a[]{aVar, new a("ROUND", 1), new a("UNKNOWN", 2)};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final /* synthetic */ b[] b;

        static {
            b bVar = new b("MITER", 0);
            a = bVar;
            b = new b[]{bVar, new b("ROUND", 1), new b("BEVEL", 2)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) b.clone();
        }
    }

    public ly80(String str, be0 be0Var, ArrayList arrayList, ae0 ae0Var, de0 de0Var, be0 be0Var2, a aVar, b bVar, float f, boolean z) {
        this.a = str;
        this.b = be0Var;
        this.c = arrayList;
        this.d = ae0Var;
        this.e = de0Var;
        this.f = be0Var2;
        this.g = aVar;
        this.h = bVar;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new zae0(iotVar, w12Var, this);
    }
}
