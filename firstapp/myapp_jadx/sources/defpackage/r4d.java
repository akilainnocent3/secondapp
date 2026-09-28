package defpackage;

import com.sportygames.crash.models.header.snc.OdQr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r4d {
    public static final r4d a;
    public static final r4d b;
    public static final r4d c;
    public static final /* synthetic */ r4d[] d;

    public r4d() {
        throw null;
    }

    public static r4d valueOf(String str) {
        return (r4d) Enum.valueOf(r4d.class, str);
    }

    public static r4d[] values() {
        return (r4d[]) d.clone();
    }

    static {
        r4d r4dVar = new r4d(OdQr.luHJBMnkWryg, 0);
        a = r4dVar;
        r4d r4dVar2 = new r4d("PREFER_RGB_565", 1);
        b = r4dVar2;
        d = new r4d[]{r4dVar, r4dVar2};
        c = r4dVar;
    }
}
