package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wsv {
    public static final wsv a;
    public static final wsv b;
    public static final /* synthetic */ wsv[] c;

    static {
        wsv wsvVar = new wsv("NewMission", 0);
        a = wsvVar;
        wsv wsvVar2 = new wsv("MissionComplete", 1);
        b = wsvVar2;
        c = new wsv[]{wsvVar, wsvVar2};
    }

    public wsv() {
        throw null;
    }

    public static wsv valueOf(String str) {
        return (wsv) Enum.valueOf(wsv.class, str);
    }

    public static wsv[] values() {
        return (wsv[]) c.clone();
    }
}
