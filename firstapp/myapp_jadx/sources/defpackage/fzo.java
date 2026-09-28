package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fzo {
    public static final fzo A;
    public static final fzo B;
    public static final fzo C;
    public static final fzo D;
    public static final fzo E;
    public static final fzo F;
    public static final fzo G;
    public static final fzo H;
    public static final fzo I;
    public static final fzo J;
    public static final fzo K;
    public static final /* synthetic */ fzo[] L;
    public static final fzo a;
    public static final fzo b;
    public static final fzo c;
    public static final fzo d;
    public static final fzo e;
    public static final fzo f;
    public static final fzo i;
    public static final fzo v;
    public static final fzo w;
    public static final fzo y;
    public static final fzo z;

    static {
        fzo fzoVar = new fzo("INT", 0);
        a = fzoVar;
        fzo fzoVar2 = new fzo("INT_NULLABLE", 1);
        b = fzoVar2;
        fzo fzoVar3 = new fzo("BOOL", 2);
        c = fzoVar3;
        fzo fzoVar4 = new fzo("BOOL_NULLABLE", 3);
        d = fzoVar4;
        fzo fzoVar5 = new fzo("DOUBLE", 4);
        e = fzoVar5;
        fzo fzoVar6 = new fzo("DOUBLE_NULLABLE", 5);
        f = fzoVar6;
        fzo fzoVar7 = new fzo("FLOAT", 6);
        i = fzoVar7;
        fzo fzoVar8 = new fzo("FLOAT_NULLABLE", 7);
        v = fzoVar8;
        fzo fzoVar9 = new fzo("LONG", 8);
        w = fzoVar9;
        fzo fzoVar10 = new fzo("LONG_NULLABLE", 9);
        y = fzoVar10;
        fzo fzoVar11 = new fzo("STRING", 10);
        z = fzoVar11;
        fzo fzoVar12 = new fzo("STRING_NULLABLE", 11);
        A = fzoVar12;
        fzo fzoVar13 = new fzo("INT_ARRAY", 12);
        B = fzoVar13;
        fzo fzoVar14 = new fzo("BOOL_ARRAY", 13);
        C = fzoVar14;
        fzo fzoVar15 = new fzo("DOUBLE_ARRAY", 14);
        D = fzoVar15;
        fzo fzoVar16 = new fzo("FLOAT_ARRAY", 15);
        E = fzoVar16;
        fzo fzoVar17 = new fzo("LONG_ARRAY", 16);
        F = fzoVar17;
        fzo fzoVar18 = new fzo("ARRAY", 17);
        G = fzoVar18;
        fzo fzoVar19 = new fzo("LIST", 18);
        H = fzoVar19;
        fzo fzoVar20 = new fzo("ENUM", 19);
        I = fzoVar20;
        fzo fzoVar21 = new fzo("ENUM_NULLABLE", 20);
        J = fzoVar21;
        fzo fzoVar22 = new fzo("UNKNOWN", 21);
        K = fzoVar22;
        L = new fzo[]{fzoVar, fzoVar2, fzoVar3, fzoVar4, fzoVar5, fzoVar6, fzoVar7, fzoVar8, fzoVar9, fzoVar10, fzoVar11, fzoVar12, fzoVar13, fzoVar14, fzoVar15, fzoVar16, fzoVar17, fzoVar18, fzoVar19, fzoVar20, fzoVar21, fzoVar22};
    }

    public fzo() {
        throw null;
    }

    public static fzo valueOf(String str) {
        return (fzo) Enum.valueOf(fzo.class, str);
    }

    public static fzo[] values() {
        return (fzo[]) L.clone();
    }
}
