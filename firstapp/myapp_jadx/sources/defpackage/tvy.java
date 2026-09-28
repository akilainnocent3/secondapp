package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class tvy {
    public static final /* synthetic */ int a = 0;

    public static final boolean a(uvy uvyVar, String str, String str2) {
        if (str != null && str2 != null && uvyVar != null) {
            boolean zEquals = str.equals("sr:sport:1");
            boolean z = (uvyVar.a && uvyVar.b) || (uvyVar.c && uvyVar.d);
            boolean z2 = str2.equals("1") || str2.equals("60200") || str2.equals("1") || str2.equals("60100");
            if (zEquals && z && z2) {
                return true;
            }
        }
        return false;
    }
}
