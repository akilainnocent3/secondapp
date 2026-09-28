package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class iw implements ss60 {
    public static final iw a;
    public static final /* synthetic */ iw[] b;

    static {
        iw iwVar = new iw("INSTANCE", 0);
        a = iwVar;
        b = new iw[]{iwVar};
    }

    public iw() {
        throw null;
    }

    public static iw valueOf(String str) {
        return (iw) Enum.valueOf(iw.class, str);
    }

    public static iw[] values() {
        return (iw[]) b.clone();
    }

    @Override // defpackage.ss60
    public final String a() {
        return "AlwaysOnSampler";
    }

    @Override // defpackage.ss60
    public final ti1 b(m0b m0bVar, String str, String str2, wqa0 wqa0Var, m21 m21Var, List<sfs> list) {
        return ti1.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
