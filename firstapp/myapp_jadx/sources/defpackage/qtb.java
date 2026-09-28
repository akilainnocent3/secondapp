package defpackage;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qtb implements ttb.a {
    @Override // ttb.a
    public final Object a(JsonReader jsonReader) throws IOException {
        th1.a aVar = new th1.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bmy.a("Null parameterKey");
                        return null;
                    }
                    aVar.b = strNextString;
                    break;
                    break;
                case "templateVersion":
                    aVar.d = jsonReader.nextLong();
                    aVar.e = (byte) (aVar.e | 1);
                    break;
                case "rolloutVariant":
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("variantId")) {
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                bmy.a("Null variantId");
                                return null;
                            }
                        } else if (strNextName2.equals("rolloutId")) {
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                bmy.a("Null rolloutId");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString2 != null && strNextString3 != null) {
                        aVar.a = new uh1(strNextString2, strNextString3);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (strNextString2 == null) {
                            sb.append(" rolloutId");
                        }
                        if (strNextString3 == null) {
                            sb.append(" variantId");
                        }
                        ib5.a(ltb.a(sb, "Missing required properties:"));
                        return null;
                    }
                    break;
                case "parameterValue":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        bmy.a("Null parameterValue");
                        return null;
                    }
                    aVar.c = strNextString4;
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }
}
