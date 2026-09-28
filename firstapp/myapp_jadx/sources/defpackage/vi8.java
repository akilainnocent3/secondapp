package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vi8 {
    public static final fnb0 a(int i, float f) {
        float f2 = i / f;
        fnb0 fnb0Var = new fnb0(0.64f, 50.0f, 5.5f, 6.0f, 0.5f, 0.5f, 0.25f, 1.35f, 50);
        if (f2 >= 2.1f) {
            return fnb0.a(fnb0Var, 0.63f, 150.0f, 0.0f, 150, 6.8f, 0.235f, 1.4f, 68);
        }
        if (f2 >= 2.05f) {
            return fnb0.a(fnb0Var, 0.64f, 150.0f, 0.0f, 100, 6.8f, 0.235f, 1.4f, 68);
        }
        if (f2 >= 2.03f) {
            return fnb0.a(fnb0Var, 0.64f, 150.0f, 5.5f, 150, 6.8f, 0.235f, 1.4f, 64);
        }
        if (f2 >= 2.0f) {
            return fnb0.a(fnb0Var, 0.64f, 150.0f, 5.5f, 100, 6.8f, 0.235f, 1.4f, 64);
        }
        if (f2 >= 1.95f) {
            return fnb0.a(fnb0Var, 0.63f, 100.0f, 5.0f, 100, 6.45f, 0.24f, 1.35f, 64);
        }
        if (f2 >= 1.7f) {
            return fnb0.a(fnb0Var, 0.64f, 50.0f, 5.5f, 50, 6.1f, 0.23f, 1.43f, 32);
        }
        if (f2 >= 1.64f) {
            return fnb0.a(fnb0Var, 0.64f, 50.0f, 5.0f, 0, 5.7f, 0.23f, 1.5f, 40);
        }
        return f2 >= 1.5f ? fnb0.a(fnb0Var, 0.64f, 50.0f, 4.5f, 20, 5.7f, 0.24f, 1.4f, 32) : fnb0Var;
    }
}
