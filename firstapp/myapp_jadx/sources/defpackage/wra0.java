package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class wra0 implements sra0 {
    public static final wra0 a;
    public static final /* synthetic */ wra0[] b;

    static {
        wra0 wra0Var = new wra0("INSTANCE", 0);
        a = wra0Var;
        b = new wra0[]{wra0Var};
    }

    public wra0() {
        throw null;
    }

    public static wra0 valueOf(String str) {
        return (wra0) Enum.valueOf(wra0.class, str);
    }

    public static wra0[] values() {
        return (wra0[]) b.clone();
    }

    @Override // defpackage.sra0
    public final boolean b(m0b m0bVar, wqa0 wqa0Var) {
        return false;
    }

    @Override // defpackage.sra0
    public final m0b a(m0b m0bVar, wqa0 wqa0Var, oqa0 oqa0Var) {
        return m0bVar;
    }
}
