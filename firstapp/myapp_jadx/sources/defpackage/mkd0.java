package defpackage;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes4.dex */
public final class mkd0 {
    public static final boolean a;
    public static final x8h0 b;
    public static final x8h0 c;
    public static final x8h0 d;

    public class a extends DefaultDateTypeAdapter.a<Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final java.util.Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends DefaultDateTypeAdapter.a<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final java.util.Date a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (!z) {
            b = null;
            c = null;
            d = null;
        } else {
            new a(Date.class);
            new b(Timestamp.class);
            b = SqlDateTypeAdapter.b;
            c = SqlTimeTypeAdapter.b;
            d = SqlTimestampTypeAdapter.b;
        }
    }
}
