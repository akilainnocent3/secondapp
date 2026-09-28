package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xhs {
    public static final /* synthetic */ int a = 0;

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            mae0.a(whs.b(i, i2, "index: ", ", size: "));
        }
    }

    public static final void b(int i, int i2) {
        if (i < 0 || i > i2) {
            mae0.a(whs.b(i, i2, "index: ", ", size: "));
        }
    }

    public static final void c(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            ks40.a(i3, dy5.a("fromIndex: ", i, i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            hb5.a(whs.b(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
