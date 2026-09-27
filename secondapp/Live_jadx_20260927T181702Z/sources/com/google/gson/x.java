package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import gm.e0;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f52585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f52586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f52587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f52588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f52589f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final enum a extends x {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.y
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f52585b = aVar;
        x xVar = new x("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.x.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.y
            public Number a(JsonReader jsonReader) throws IOException {
                return new gm.b0(jsonReader.nextString());
            }
        };
        f52586c = xVar;
        x xVar2 = new x("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.x.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.y
            public Number a(JsonReader jsonReader) throws n, IOException {
                String strNextString = jsonReader.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return b(strNextString, jsonReader);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return b(strNextString, jsonReader);
                }
            }

            public final Number b(String str, JsonReader jsonReader) throws IOException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e10);
                }
            }
        };
        f52587d = xVar2;
        x xVar3 = new x("BIG_DECIMAL", 3) { // from class: com.google.gson.x.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.y
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return e0.b(strNextString);
                } catch (NumberFormatException e10) {
                    throw new n("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e10);
                }
            }
        };
        f52588e = xVar3;
        f52589f = new x[]{aVar, xVar, xVar2, xVar3};
    }

    public x(String str, int i10) {
        super(str, i10);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f52589f.clone();
    }

    public /* synthetic */ x(String str, int i10, a aVar) {
        this(str, i10);
    }
}
