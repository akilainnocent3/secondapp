package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class eft {
    public final cbg a;
    public final SimpleDateFormat b;

    public eft(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
        this.b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
    }
}
