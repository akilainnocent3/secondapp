package defpackage;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class otb implements ttb.a {
    @Override // ttb.a
    public final Object a(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        bmy.a("Null libraryName");
                        return null;
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null arch");
                        return null;
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        bmy.a("Null buildId");
                        return null;
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null && strNextString3 != null) {
            return new ah1(strNextString, strNextString2, strNextString3);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" arch");
        }
        if (strNextString2 == null) {
            sb.append(" libraryName");
        }
        if (strNextString3 == null) {
            sb.append(" buildId");
        }
        ib5.a(ltb.a(sb, "Missing required properties:"));
        return null;
    }
}
