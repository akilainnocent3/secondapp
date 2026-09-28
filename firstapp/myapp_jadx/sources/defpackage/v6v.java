package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class v6v {
    public static final v6v a;
    public static final v6v b;
    public static final /* synthetic */ v6v[] c;

    static {
        v6v v6vVar = new v6v("FIRST", 0);
        a = v6vVar;
        v6v v6vVar2 = new v6v("SECOND", 1);
        b = v6vVar2;
        c = new v6v[]{v6vVar, v6vVar2};
    }

    public v6v() {
        throw null;
    }

    public static v6v valueOf(String str) {
        return (v6v) Enum.valueOf(v6v.class, str);
    }

    public static v6v[] values() {
        return (v6v[]) c.clone();
    }
}
