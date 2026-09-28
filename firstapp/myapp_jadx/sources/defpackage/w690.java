package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w690 {
    public static final /* synthetic */ w690[] a = {new w690("Large", 0), new w690("Normal", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    w690 EF5;

    public static w690 valueOf(String str) {
        return (w690) Enum.valueOf(w690.class, str);
    }

    public static w690[] values() {
        return (w690[]) a.clone();
    }
}
