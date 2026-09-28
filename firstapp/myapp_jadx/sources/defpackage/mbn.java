package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mbn {
    public static final mbn a;
    public static final mbn b;
    public static final /* synthetic */ mbn[] c;

    static {
        mbn mbnVar = new mbn("Left", 0);
        a = mbnVar;
        mbn mbnVar2 = new mbn("Right", 1);
        b = mbnVar2;
        c = new mbn[]{mbnVar, mbnVar2};
    }

    public mbn() {
        throw null;
    }

    public static mbn valueOf(String str) {
        return (mbn) Enum.valueOf(mbn.class, str);
    }

    public static mbn[] values() {
        return (mbn[]) c.clone();
    }
}
