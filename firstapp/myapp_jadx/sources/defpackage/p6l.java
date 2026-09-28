package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p6l {
    public static final p6l a;
    public static final p6l b;
    public static final /* synthetic */ p6l[] c;

    public p6l() {
        throw null;
    }

    public static p6l valueOf(String str) {
        return (p6l) Enum.valueOf(p6l.class, str);
    }

    public static p6l[] values() {
        return (p6l[]) c.clone();
    }

    static {
        p6l p6lVar = new p6l(llGRV.IBU, 0);
        a = p6lVar;
        p6l p6lVar2 = new p6l("RADIAL", 1);
        b = p6lVar2;
        c = new p6l[]{p6lVar, p6lVar2};
    }
}
