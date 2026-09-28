package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class pyf0 implements qyf0 {
    public static final a a;
    public static final b b;
    public static final /* synthetic */ pyf0[] c;

    public final enum a extends pyf0 {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // defpackage.qyf0
        public final Number a(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    public final enum b extends pyf0 {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // defpackage.qyf0
        public final Number a(JsonReader jsonReader) {
            return new rtr(jsonReader.nextString());
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b bVar = new b();
        b = bVar;
        c = new pyf0[]{aVar, bVar, new pyf0() { // from class: pyf0.c
            public static Double b(JsonReader jsonReader, String str) throws MalformedJsonException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e) {
                    StringBuilder sbA = he.a("Cannot parse ", str, "; at path ");
                    sbA.append(jsonReader.getPreviousPath());
                    throw new zdp(sbA.toString(), e);
                }
            }

            @Override // defpackage.qyf0
            public final Number a(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return b(jsonReader, strNextString);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return b(jsonReader, strNextString);
                }
            }
        }, new pyf0() { // from class: pyf0.d
            @Override // defpackage.qyf0
            public final Number a(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return u5y.e(strNextString);
                } catch (NumberFormatException e) {
                    StringBuilder sbA = he.a("Cannot parse ", strNextString, "; at path ");
                    sbA.append(jsonReader.getPreviousPath());
                    throw new zdp(sbA.toString(), e);
                }
            }
        }};
    }

    public pyf0() {
        throw null;
    }

    public static pyf0 valueOf(String str) {
        return (pyf0) Enum.valueOf(pyf0.class, str);
    }

    public static pyf0[] values() {
        return (pyf0[]) c.clone();
    }
}
