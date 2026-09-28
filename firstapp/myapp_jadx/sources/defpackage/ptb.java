package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ptb implements ttb.a {
    @Override // ttb.a
    public final Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    bmy.a("Null filename");
                    return null;
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    bmy.a("Null contents");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && bArrDecode != null) {
            return new dh1(strNextString, bArrDecode);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" filename");
        }
        if (bArrDecode == null) {
            sb.append(" contents");
        }
        ib5.a(ltb.a(sb, "Missing required properties:"));
        return null;
    }
}
