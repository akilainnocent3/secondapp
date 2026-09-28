package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sch {
    public static final sch a;
    public static final sch b;
    public static final /* synthetic */ sch[] c;

    static {
        sch schVar = new sch("EndlessPager", 0);
        a = schVar;
        sch schVar2 = new sch("List", 1);
        b = schVar2;
        c = new sch[]{schVar, schVar2, new sch("Spin", 2)};
    }

    public sch() {
        throw null;
    }

    public static sch valueOf(String str) {
        return (sch) Enum.valueOf(sch.class, str);
    }

    public static sch[] values() {
        return (sch[]) c.clone();
    }
}
