package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lyt {
    public static final /* synthetic */ lyt[] a = {new lyt("HOME", 0), new lyt("GAME", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    lyt EF5;

    public lyt() {
        throw null;
    }

    public static lyt valueOf(String str) {
        return (lyt) Enum.valueOf(lyt.class, str);
    }

    public static lyt[] values() {
        return (lyt[]) a.clone();
    }
}
