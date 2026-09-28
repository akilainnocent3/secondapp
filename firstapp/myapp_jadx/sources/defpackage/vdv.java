package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vdv {
    public static final vdv a;
    public static final vdv b;
    public static final /* synthetic */ vdv[] c;

    static {
        vdv vdvVar = new vdv("LoyaltyBanner", 0);
        a = vdvVar;
        vdv vdvVar2 = new vdv("LoyaltyTierProgressbar", 1);
        b = vdvVar2;
        c = new vdv[]{vdvVar, vdvVar2};
    }

    public vdv() {
        throw null;
    }

    public static vdv valueOf(String str) {
        return (vdv) Enum.valueOf(vdv.class, str);
    }

    public static vdv[] values() {
        return (vdv[]) c.clone();
    }
}
