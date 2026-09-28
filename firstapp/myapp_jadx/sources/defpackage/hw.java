package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class hw implements ss60 {
    public static final hw a;
    public static final /* synthetic */ hw[] b;

    static {
        hw hwVar = new hw("INSTANCE", 0);
        a = hwVar;
        b = new hw[]{hwVar};
    }

    public hw() {
        throw null;
    }

    public static hw valueOf(String str) {
        return (hw) Enum.valueOf(hw.class, str);
    }

    public static hw[] values() {
        return (hw[]) b.clone();
    }

    @Override // defpackage.ss60
    public final String a() {
        return "AlwaysOffSampler";
    }

    @Override // defpackage.ss60
    public final ti1 b(m0b m0bVar, String str, String str2, wqa0 wqa0Var, m21 m21Var, List<sfs> list) {
        return ti1.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
