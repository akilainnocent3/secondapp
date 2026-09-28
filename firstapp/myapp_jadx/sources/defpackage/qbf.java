package defpackage;

import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes4.dex */
public interface qbf {
    static d c(qbf qbfVar, d dVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return qbfVar.a(dVar, z, new obf(3, null), new pbf(3, null));
    }

    d a(d dVar, boolean z, obf obfVar, pbf pbfVar);

    d b(psw pswVar, mbf mbfVar, nbf nbfVar);
}
