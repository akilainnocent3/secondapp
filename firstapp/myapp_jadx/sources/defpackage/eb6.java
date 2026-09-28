package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb6 implements v4i {
    public static final eb6 a = new eb6();
    public static Boolean b;

    @Override // defpackage.v4i
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.v4i
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw w20.a("canFocus is read before it is written");
    }
}
