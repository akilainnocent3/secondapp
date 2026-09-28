package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ddp extends w8h0<tcp> {
    public static final ddp a = new ddp();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private ddp() {
    }

    public static tcp a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = a.a[jsonToken.ordinal()];
        if (i == 3) {
            return new cep(jsonReader.nextString());
        }
        if (i == 4) {
            return new cep(new rtr(jsonReader.nextString()));
        }
        if (i == 5) {
            return new cep(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.nextNull();
            return tdp.a;
        }
        rcp.a(jsonToken, "Unexpected token: ");
        return null;
    }

    public static tcp b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = a.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new bcp();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new xdp();
    }

    public static void c(tcp tcpVar, JsonWriter jsonWriter) {
        if (tcpVar == null || (tcpVar instanceof tdp)) {
            jsonWriter.nullValue();
            return;
        }
        if (tcpVar instanceof cep) {
            cep cepVarE = tcpVar.e();
            Serializable serializable = cepVarE.a;
            if (serializable instanceof Number) {
                jsonWriter.value(cepVarE.j());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.value(cepVarE.a());
                return;
            } else {
                jsonWriter.value(cepVarE.f());
                return;
            }
        }
        if (tcpVar instanceof bcp) {
            jsonWriter.beginArray();
            ArrayList<tcp> arrayList = tcpVar.c().a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                tcp tcpVar2 = arrayList.get(i);
                i++;
                c(tcpVar2, jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!(tcpVar instanceof xdp)) {
            hoc.a(tcpVar.getClass(), "Couldn't write ");
            return;
        }
        jsonWriter.beginObject();
        Iterator it = ((hgs.b) tcpVar.d().a.entrySet()).iterator();
        while (((hgs.d) it).hasNext()) {
            Map.Entry entryA = ((hgs.b.a) it).a();
            jsonWriter.name((String) entryA.getKey());
            c((tcp) entryA.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    @Override // defpackage.w8h0
    public final tcp read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof yep) {
            yep yepVar = (yep) jsonReader;
            JsonToken jsonTokenPeek = yepVar.peek();
            if (jsonTokenPeek == JsonToken.NAME || jsonTokenPeek == JsonToken.END_ARRAY || jsonTokenPeek == JsonToken.END_OBJECT || jsonTokenPeek == JsonToken.END_DOCUMENT) {
                lx5.b(jsonTokenPeek, "Unexpected ", " when reading a JsonElement.");
                return null;
            }
            tcp tcpVar = (tcp) yepVar.l();
            yepVar.skipValue();
            return tcpVar;
        }
        JsonToken jsonTokenPeek2 = jsonReader.peek();
        tcp tcpVarB = b(jsonReader, jsonTokenPeek2);
        if (tcpVarB == null) {
            return a(jsonReader, jsonTokenPeek2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = tcpVarB instanceof xdp ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek3 = jsonReader.peek();
                tcp tcpVarB2 = b(jsonReader, jsonTokenPeek3);
                boolean z = tcpVarB2 != null;
                if (tcpVarB2 == null) {
                    tcpVarB2 = a(jsonReader, jsonTokenPeek3);
                }
                if (tcpVarB instanceof bcp) {
                    ((bcp) tcpVarB).h(tcpVarB2);
                } else {
                    ((xdp) tcpVarB).h(strNextName, tcpVarB2);
                }
                if (z) {
                    arrayDeque.addLast(tcpVarB);
                    tcpVarB = tcpVarB2;
                }
            } else {
                if (tcpVarB instanceof bcp) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return tcpVarB;
                }
                tcpVarB = (tcp) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.w8h0
    public final /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, tcp tcpVar) {
        c(tcpVar, jsonWriter);
    }
}
