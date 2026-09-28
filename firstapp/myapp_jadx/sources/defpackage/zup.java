package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zup {
    public static final zup a;
    public static final zup b;
    public static final /* synthetic */ zup[] c;

    static {
        zup zupVar = new zup("NORMAL", 0);
        a = zupVar;
        zup zupVar2 = new zup("MULTIPLY", 1);
        b = zupVar2;
        c = new zup[]{zupVar, zupVar2, new zup("SCREEN", 2), new zup("OVERLAY", 3), new zup("DARKEN", 4), new zup("LIGHTEN", 5), new zup("COLOR_DODGE", 6), new zup("COLOR_BURN", 7), new zup("HARD_LIGHT", 8), new zup("SOFT_LIGHT", 9), new zup("DIFFERENCE", 10), new zup("EXCLUSION", 11), new zup("HUE", 12), new zup("SATURATION", 13), new zup("COLOR", 14), new zup("LUMINOSITY", 15), new zup("ADD", 16), new zup("HARD_MIX", 17)};
    }

    public zup() {
        throw null;
    }

    public static zup valueOf(String str) {
        return (zup) Enum.valueOf(zup.class, str);
    }

    public static zup[] values() {
        return (zup[]) c.clone();
    }
}
