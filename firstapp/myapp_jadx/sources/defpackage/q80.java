package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public final class q80 extends b21 {
    @Override // defpackage.b21
    public final void e(v6s v6sVar, String str) {
        int iOrdinal = v6sVar.ordinal();
        if (iOrdinal == 0) {
            Log.d("[Koin]", str);
            return;
        }
        if (iOrdinal == 1) {
            Log.i("[Koin]", str);
            return;
        }
        if (iOrdinal == 2) {
            Log.w("[Koin]", str);
        } else if (iOrdinal != 3) {
            Log.e("[Koin]", str);
        } else {
            Log.e("[Koin]", str);
        }
    }
}
