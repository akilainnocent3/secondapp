package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ey0 {
    public static final /* synthetic */ ey0[] a = {new ey0("ARTICLE", 0), new ey0("VIDEO", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ey0 EF5;

    public static ey0 valueOf(String str) {
        return (ey0) Enum.valueOf(ey0.class, str);
    }

    public static ey0[] values() {
        return (ey0[]) a.clone();
    }
}
