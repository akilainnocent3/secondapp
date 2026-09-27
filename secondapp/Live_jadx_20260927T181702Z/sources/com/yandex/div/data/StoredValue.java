package com.yandex.div.data;

import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import dr.o0;
import f0.i;
import f0.p;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class StoredValue {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ArrayStoredValue extends StoredValue {

        @l
        private final String name;

        @l
        private final JSONArray value;

        public ArrayStoredValue(@l String str, @l JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.value = jSONArray;
        }

        public static /* synthetic */ ArrayStoredValue copy$default(ArrayStoredValue arrayStoredValue, String str, JSONArray jSONArray, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = arrayStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                jSONArray = arrayStoredValue.value;
            }
            return arrayStoredValue.copy(str, jSONArray);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        public final JSONArray component2() {
            return this.value;
        }

        @l
        public final ArrayStoredValue copy(@l String str, @l JSONArray jSONArray) {
            return new ArrayStoredValue(str, jSONArray);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArrayStoredValue)) {
                return false;
            }
            ArrayStoredValue arrayStoredValue = (ArrayStoredValue) obj;
            return m0.g(this.name, arrayStoredValue.name) && m0.g(this.value, arrayStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public final JSONArray getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @l
        public String toString() {
            return "ArrayStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class BooleanStoredValue extends StoredValue {

        @l
        private final String name;
        private final boolean value;

        public BooleanStoredValue(@l String str, boolean z10) {
            super(null);
            this.name = str;
            this.value = z10;
        }

        public static /* synthetic */ BooleanStoredValue copy$default(BooleanStoredValue booleanStoredValue, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = booleanStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                z10 = booleanStoredValue.value;
            }
            return booleanStoredValue.copy(str, z10);
        }

        @l
        public final String component1() {
            return this.name;
        }

        public final boolean component2() {
            return this.value;
        }

        @l
        public final BooleanStoredValue copy(@l String str, boolean z10) {
            return new BooleanStoredValue(str, z10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BooleanStoredValue)) {
                return false;
            }
            BooleanStoredValue booleanStoredValue = (BooleanStoredValue) obj;
            return m0.g(this.name, booleanStoredValue.name) && this.value == booleanStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        public final boolean getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            boolean z10 = this.value;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return iHashCode + r10;
        }

        @l
        public String toString() {
            return "BooleanStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ColorStoredValue extends StoredValue {

        @l
        private final String name;
        private final int value;

        public /* synthetic */ ColorStoredValue(String str, int i10, x xVar) {
            this(str, i10);
        }

        /* JADX INFO: renamed from: copy-IC13cx8$default, reason: not valid java name */
        public static /* synthetic */ ColorStoredValue m3273copyIC13cx8$default(ColorStoredValue colorStoredValue, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = colorStoredValue.name;
            }
            if ((i11 & 2) != 0) {
                i10 = colorStoredValue.value;
            }
            return colorStoredValue.m3275copyIC13cx8(str, i10);
        }

        @l
        public final String component1() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2-WpymAT4, reason: not valid java name */
        public final int m3274component2WpymAT4() {
            return this.value;
        }

        @l
        /* JADX INFO: renamed from: copy-IC13cx8, reason: not valid java name */
        public final ColorStoredValue m3275copyIC13cx8(@l String str, int i10) {
            return new ColorStoredValue(str, i10, null);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorStoredValue)) {
                return false;
            }
            ColorStoredValue colorStoredValue = (ColorStoredValue) obj;
            return m0.g(this.name, colorStoredValue.name) && Color.m3344equalsimpl0(this.value, colorStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: getValue-WpymAT4, reason: not valid java name */
        public final int m3276getValueWpymAT4() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Color.m3346hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return "ColorStoredValue(name=" + this.name + ", value=" + ((Object) Color.m3348toStringimpl(this.value)) + ')';
        }

        private ColorStoredValue(String str, int i10) {
            super(null);
            this.name = str;
            this.value = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DictStoredValue extends StoredValue {

        @l
        private final String name;

        @l
        private final JSONObject value;

        public DictStoredValue(@l String str, @l JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.value = jSONObject;
        }

        public static /* synthetic */ DictStoredValue copy$default(DictStoredValue dictStoredValue, String str, JSONObject jSONObject, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dictStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                jSONObject = dictStoredValue.value;
            }
            return dictStoredValue.copy(str, jSONObject);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        public final JSONObject component2() {
            return this.value;
        }

        @l
        public final DictStoredValue copy(@l String str, @l JSONObject jSONObject) {
            return new DictStoredValue(str, jSONObject);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictStoredValue)) {
                return false;
            }
            DictStoredValue dictStoredValue = (DictStoredValue) obj;
            return m0.g(this.name, dictStoredValue.name) && m0.g(this.value, dictStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public final JSONObject getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @l
        public String toString() {
            return "DictStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DoubleStoredValue extends StoredValue {

        @l
        private final String name;
        private final double value;

        public DoubleStoredValue(@l String str, double d10) {
            super(null);
            this.name = str;
            this.value = d10;
        }

        public static /* synthetic */ DoubleStoredValue copy$default(DoubleStoredValue doubleStoredValue, String str, double d10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = doubleStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                d10 = doubleStoredValue.value;
            }
            return doubleStoredValue.copy(str, d10);
        }

        @l
        public final String component1() {
            return this.name;
        }

        public final double component2() {
            return this.value;
        }

        @l
        public final DoubleStoredValue copy(@l String str, double d10) {
            return new DoubleStoredValue(str, d10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DoubleStoredValue)) {
                return false;
            }
            DoubleStoredValue doubleStoredValue = (DoubleStoredValue) obj;
            return m0.g(this.name, doubleStoredValue.name) && Double.compare(this.value, doubleStoredValue.value) == 0;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        public final double getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + i.a(this.value);
        }

        @l
        public String toString() {
            return "DoubleStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class IntegerStoredValue extends StoredValue {

        @l
        private final String name;
        private final long value;

        public IntegerStoredValue(@l String str, long j10) {
            super(null);
            this.name = str;
            this.value = j10;
        }

        public static /* synthetic */ IntegerStoredValue copy$default(IntegerStoredValue integerStoredValue, String str, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = integerStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                j10 = integerStoredValue.value;
            }
            return integerStoredValue.copy(str, j10);
        }

        @l
        public final String component1() {
            return this.name;
        }

        public final long component2() {
            return this.value;
        }

        @l
        public final IntegerStoredValue copy(@l String str, long j10) {
            return new IntegerStoredValue(str, j10);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntegerStoredValue)) {
                return false;
            }
            IntegerStoredValue integerStoredValue = (IntegerStoredValue) obj;
            return m0.g(this.name, integerStoredValue.name) && this.value == integerStoredValue.value;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + p.a(this.value);
        }

        @l
        public String toString() {
            return "IntegerStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class StringStoredValue extends StoredValue {

        @l
        private final String name;

        @l
        private final String value;

        public StringStoredValue(@l String str, @l String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }

        public static /* synthetic */ StringStoredValue copy$default(StringStoredValue stringStoredValue, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = stringStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                str2 = stringStoredValue.value;
            }
            return stringStoredValue.copy(str, str2);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        public final String component2() {
            return this.value;
        }

        @l
        public final StringStoredValue copy(@l String str, @l String str2) {
            return new StringStoredValue(str, str2);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringStoredValue)) {
                return false;
            }
            StringStoredValue stringStoredValue = (StringStoredValue) obj;
            return m0.g(this.name, stringStoredValue.name) && m0.g(this.value, stringStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.value.hashCode();
        }

        @l
        public String toString() {
            return "StringStoredValue(name=" + this.name + ", value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Type {
        STRING("string"),
        INTEGER("integer"),
        BOOLEAN("boolean"),
        NUMBER("number"),
        COLOR("color"),
        URL("url"),
        ARRAY("array"),
        DICT("dict");


        @l
        public static final Converter Converter = new Converter(null);

        @l
        private final String value;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Converter {
            public /* synthetic */ Converter(x xVar) {
                this();
            }

            @m
            public final Type fromString(@l String str) {
                Type type = Type.STRING;
                if (m0.g(str, type.value)) {
                    return type;
                }
                Type type2 = Type.INTEGER;
                if (m0.g(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.BOOLEAN;
                if (m0.g(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.NUMBER;
                if (m0.g(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.COLOR;
                if (m0.g(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.URL;
                if (m0.g(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.ARRAY;
                if (m0.g(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.DICT;
                if (m0.g(str, type8.value)) {
                    return type8;
                }
                return null;
            }

            @l
            public final String toString(@l Type type) {
                return type.value;
            }

            private Converter() {
            }
        }

        Type(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class UrlStoredValue extends StoredValue {

        @l
        private final String name;

        @l
        private final String value;

        public /* synthetic */ UrlStoredValue(String str, String str2, x xVar) {
            this(str, str2);
        }

        /* JADX INFO: renamed from: copy-rmspukQ$default, reason: not valid java name */
        public static /* synthetic */ UrlStoredValue m3277copyrmspukQ$default(UrlStoredValue urlStoredValue, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = urlStoredValue.name;
            }
            if ((i10 & 2) != 0) {
                str2 = urlStoredValue.value;
            }
            return urlStoredValue.m3279copyrmspukQ(str, str2);
        }

        @l
        public final String component1() {
            return this.name;
        }

        @l
        /* JADX INFO: renamed from: component2-OXPJC6E, reason: not valid java name */
        public final String m3278component2OXPJC6E() {
            return this.value;
        }

        @l
        /* JADX INFO: renamed from: copy-rmspukQ, reason: not valid java name */
        public final UrlStoredValue m3279copyrmspukQ(@l String str, @l String str2) {
            return new UrlStoredValue(str, str2, null);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UrlStoredValue)) {
                return false;
            }
            UrlStoredValue urlStoredValue = (UrlStoredValue) obj;
            return m0.g(this.name, urlStoredValue.name) && Url.m3356equalsimpl0(this.value, urlStoredValue.value);
        }

        @Override // com.yandex.div.data.StoredValue
        @l
        public String getName() {
            return this.name;
        }

        @l
        /* JADX INFO: renamed from: getValue-OXPJC6E, reason: not valid java name */
        public final String m3280getValueOXPJC6E() {
            return this.value;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Url.m3357hashCodeimpl(this.value);
        }

        @l
        public String toString() {
            return "UrlStoredValue(name=" + this.name + ", value=" + ((Object) Url.m3358toStringimpl(this.value)) + ')';
        }

        private UrlStoredValue(String str, String str2) {
            super(null);
            this.name = str;
            this.value = str2;
        }
    }

    public /* synthetic */ StoredValue(x xVar) {
        this();
    }

    @l
    public abstract String getName();

    @l
    public final Type getType() {
        if (this instanceof StringStoredValue) {
            return Type.STRING;
        }
        if (this instanceof IntegerStoredValue) {
            return Type.INTEGER;
        }
        if (this instanceof BooleanStoredValue) {
            return Type.BOOLEAN;
        }
        if (this instanceof DoubleStoredValue) {
            return Type.NUMBER;
        }
        if (this instanceof ColorStoredValue) {
            return Type.COLOR;
        }
        if (this instanceof UrlStoredValue) {
            return Type.URL;
        }
        if (this instanceof ArrayStoredValue) {
            return Type.ARRAY;
        }
        if (this instanceof DictStoredValue) {
            return Type.DICT;
        }
        throw new o0();
    }

    @l
    public final Object getValue() {
        if (this instanceof StringStoredValue) {
            return ((StringStoredValue) this).getValue();
        }
        if (this instanceof IntegerStoredValue) {
            return Long.valueOf(((IntegerStoredValue) this).getValue());
        }
        if (this instanceof BooleanStoredValue) {
            return Boolean.valueOf(((BooleanStoredValue) this).getValue());
        }
        if (this instanceof DoubleStoredValue) {
            return Double.valueOf(((DoubleStoredValue) this).getValue());
        }
        if (this instanceof ColorStoredValue) {
            return Color.m3341boximpl(((ColorStoredValue) this).m3276getValueWpymAT4());
        }
        if (this instanceof UrlStoredValue) {
            return Url.m3353boximpl(((UrlStoredValue) this).m3280getValueOXPJC6E());
        }
        if (this instanceof ArrayStoredValue) {
            return ((ArrayStoredValue) this).getValue();
        }
        if (this instanceof DictStoredValue) {
            return ((DictStoredValue) this).getValue();
        }
        throw new o0();
    }

    private StoredValue() {
    }
}
