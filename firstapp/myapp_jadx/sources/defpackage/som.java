package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class som extends IOException {
    public som(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
