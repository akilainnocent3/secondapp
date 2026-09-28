package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes.dex */
public final class mh4 {
    public final int a;
    public final String b;
    public final mh4 c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public boolean m;
    public float h = 1.0f;
    public float i = 1.0f;
    public a l = a.a;
    public final i58 n = new i58(0.61f, 0.61f, 0.61f, 1.0f);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a[] d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a(AnalyticsParam.DATA_NORMAL, 0);
            a = aVar;
            a aVar2 = new a("onlyTranslation", 1);
            b = aVar2;
            a aVar3 = new a("noRotationOrReflection", 2);
            a aVar4 = new a("noScale", 3);
            c = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4, new a("noScaleOrReflection", 4)};
            d = values();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public mh4(int i, String str, mh4 mh4Var) {
        if (i < 0) {
            hb5.a("index must be >= 0.");
            throw null;
        }
        if (str == null) {
            hb5.a("name cannot be null.");
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
