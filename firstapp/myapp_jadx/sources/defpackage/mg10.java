package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mg10 {
    public static final /* synthetic */ mg10[] a = {new mg10("Alpha", 0), new mg10("Intensity", 1), new mg10("LuminanceAlpha", 2), new mg10("RGB565", 3), new mg10("RGBA4444", 4), new mg10("RGB888", 5), new mg10("RGBA8888", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    mg10 EF5;

    public mg10() {
        throw null;
    }

    public static mg10 valueOf(String str) {
        return (mg10) Enum.valueOf(mg10.class, str);
    }

    public static mg10[] values() {
        return (mg10[]) a.clone();
    }
}
