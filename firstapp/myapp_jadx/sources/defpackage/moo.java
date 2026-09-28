package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class moo {
    public static final moo a;
    public static final moo b;
    public static final /* synthetic */ moo[] c;

    static {
        moo mooVar = new moo("ONE_UP", 0);
        a = mooVar;
        moo mooVar2 = new moo("TWO_UP", 1);
        b = mooVar2;
        c = new moo[]{mooVar, mooVar2};
    }

    public moo() {
        throw null;
    }

    public static moo valueOf(String str) {
        return (moo) Enum.valueOf(moo.class, str);
    }

    public static moo[] values() {
        return (moo[]) c.clone();
    }
}
