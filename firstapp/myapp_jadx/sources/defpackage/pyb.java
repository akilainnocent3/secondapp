package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pyb {
    public static final /* synthetic */ int a = 0;

    public static final void a(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            zkn.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        zkn.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
