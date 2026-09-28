package defpackage;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xed implements mfe0 {
    @Override // defpackage.mfe0
    public final Object get() {
        byte[] bArr = new byte[12];
        yed.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }
}
