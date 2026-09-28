package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j7v {
    public static final j7v a;
    public static final j7v b;
    public static final /* synthetic */ j7v[] c;

    static {
        j7v j7vVar = new j7v("GOAL", 0);
        a = j7vVar;
        j7v j7vVar2 = new j7v("NO_GOAL", 1);
        b = j7vVar2;
        c = new j7v[]{j7vVar, j7vVar2};
    }

    public j7v() {
        throw null;
    }

    public static j7v valueOf(String str) {
        return (j7v) Enum.valueOf(j7v.class, str);
    }

    public static j7v[] values() {
        return (j7v[]) c.clone();
    }
}
