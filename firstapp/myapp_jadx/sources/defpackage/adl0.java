package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class adl0 extends pdl0 {
    @Override // defpackage.pdl0
    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (abl0.b.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (abl0.c.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String string = obj.toString();
        String str2 = this.b;
        Log.e("PhenotypeFlag", kwi.a(new StringBuilder(str2.length() + 28 + string.length()), "Invalid boolean value for ", str2, ": ", string));
        return null;
    }
}
