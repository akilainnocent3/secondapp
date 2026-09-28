package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class gqy {
    public static final /* synthetic */ gqy[] a = {new gqy("OLD", 0), new gqy("NEW", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    gqy EF5;

    public static gqy valueOf(String str) {
        return (gqy) Enum.valueOf(gqy.class, str);
    }

    public static gqy[] values() {
        return (gqy[]) a.clone();
    }
}
