package z4;

import android.database.SQLException;
import java.io.IOException;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a extends IOException {
    public a(SQLException sQLException) {
        super(sQLException);
    }

    public a(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
