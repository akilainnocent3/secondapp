package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fqc {
    public static void a(zpc zpcVar) {
        if (zpcVar != null) {
            try {
                zpcVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
