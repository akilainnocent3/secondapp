package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class shp {
    public static final /* synthetic */ shp[] a = {new shp("PUBLIC", 0), new shp("PROTECTED", 1), new shp("INTERNAL", 2), new shp("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    shp EF5;

    public shp() {
        throw null;
    }

    public static shp valueOf(String str) {
        return (shp) Enum.valueOf(shp.class, str);
    }

    public static shp[] values() {
        return (shp[]) a.clone();
    }
}
