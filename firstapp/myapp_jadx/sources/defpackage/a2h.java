package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a2h {
    public static final a2h a;
    public static final a2h b;
    public static final a2h c;
    public static final a2h d;
    public static final a2h e;
    public static final a2h f;
    public static final a2h i;
    public static final a2h v;
    public static final a2h w;
    public static final /* synthetic */ a2h[] y;

    static {
        a2h a2hVar = new a2h("STRING", 0);
        a = a2hVar;
        a2h a2hVar2 = new a2h("BOOLEAN", 1);
        b = a2hVar2;
        a2h a2hVar3 = new a2h("LONG", 2);
        c = a2hVar3;
        a2h a2hVar4 = new a2h("DOUBLE", 3);
        d = a2hVar4;
        a2h a2hVar5 = new a2h("STRING_ARRAY", 4);
        e = a2hVar5;
        a2h a2hVar6 = new a2h("BOOLEAN_ARRAY", 5);
        f = a2hVar6;
        a2h a2hVar7 = new a2h("LONG_ARRAY", 6);
        i = a2hVar7;
        a2h a2hVar8 = new a2h("DOUBLE_ARRAY", 7);
        v = a2hVar8;
        a2h a2hVar9 = new a2h("EXTENDED_ATTRIBUTES", 8);
        a2h a2hVar10 = new a2h("VALUE", 9);
        w = a2hVar10;
        y = new a2h[]{a2hVar, a2hVar2, a2hVar3, a2hVar4, a2hVar5, a2hVar6, a2hVar7, a2hVar8, a2hVar9, a2hVar10};
    }

    public a2h() {
        throw null;
    }

    public static a2h valueOf(String str) {
        return (a2h) Enum.valueOf(a2h.class, str);
    }

    public static a2h[] values() {
        return (a2h[]) y.clone();
    }
}
