package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i0o {
    public static final i0o a;
    public static final i0o b;
    public static final i0o c;
    public static final /* synthetic */ i0o[] d;
    public static final /* synthetic */ uag e;

    static {
        i0o i0oVar = new i0o("GOLD", 0);
        a = i0oVar;
        i0o i0oVar2 = new i0o("SILVER", 1);
        b = i0oVar2;
        i0o i0oVar3 = new i0o("BRONZE", 2);
        c = i0oVar3;
        i0o[] i0oVarArr = {i0oVar, i0oVar2, i0oVar3};
        d = i0oVarArr;
        e = new uag(i0oVarArr);
    }

    public i0o() {
        throw null;
    }

    public static i0o valueOf(String str) {
        return (i0o) Enum.valueOf(i0o.class, str);
    }

    public static i0o[] values() {
        return (i0o[]) d.clone();
    }
}
