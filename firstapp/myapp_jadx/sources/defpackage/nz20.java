package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nz20 {
    public static final /* synthetic */ nz20[] a = {new nz20("None", 0), new nz20("Top", 1), new nz20("Bottom", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    nz20 EF5;

    public nz20() {
        throw null;
    }

    public static nz20 valueOf(String str) {
        return (nz20) Enum.valueOf(nz20.class, str);
    }

    public static nz20[] values() {
        return (nz20[]) a.clone();
    }
}
