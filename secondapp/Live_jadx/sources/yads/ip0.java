package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ip0 {
    public static kp0 a() {
        kp0 kp0Var;
        kp0 kp0Var2 = kp0.f151652c;
        if (kp0Var2 != null) {
            return kp0Var2;
        }
        synchronized (kp0.f151651b) {
            kp0Var = kp0.f151652c;
            if (kp0Var == null) {
                kp0Var = new kp0();
                kp0.f151652c = kp0Var;
            }
        }
        return kp0Var;
    }
}
