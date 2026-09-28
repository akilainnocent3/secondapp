package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class wjy {
    public static final wjy a;
    public static final wjy b;
    public static final /* synthetic */ wjy[] c;

    static {
        wjy wjyVar = new wjy("HOME_SCREEN", 0);
        a = wjyVar;
        wjy wjyVar2 = new wjy("SETTINGS_SCREEN", 1);
        b = wjyVar2;
        c = new wjy[]{wjyVar, wjyVar2};
    }

    public wjy() {
        throw null;
    }

    public static wjy valueOf(String str) {
        return (wjy) Enum.valueOf(wjy.class, str);
    }

    public static wjy[] values() {
        return (wjy[]) c.clone();
    }
}
