package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class s30 {
    public static void a(p30 p30Var) {
        if (p30Var != null) {
            try {
                p30Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
