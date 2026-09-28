package defpackage;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rtb implements ttb.a {
    @Override // ttb.a
    public final Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        List listB = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listB != null) {
                    return new oh1(strNextString, iNextInt, listB);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" name");
                }
                if ((b & 1) == 0) {
                    sb.append(" importance");
                }
                if (listB == null) {
                    sb.append(" frames");
                }
                ib5.a(ltb.a(sb, "Missing required properties:"));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listB = ttb.b(jsonReader, new ntb());
                    if (listB == null) {
                        bmy.a("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null name");
                        return null;
                    }
                    break;
                    break;
                case "importance":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
