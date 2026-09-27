package com.yandex.div.evaluable;

import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import l3.a;
import mg.b;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME(a.U),
    COLOR("Color"),
    URL(b.f.A),
    DICT("Dict"),
    ARRAY("Array");


    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final String typeName;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @o
        public final /* synthetic */ <T> EvaluableType of(T t10) {
            if (t10 instanceof Long) {
                return EvaluableType.INTEGER;
            }
            if (t10 instanceof Double) {
                return EvaluableType.NUMBER;
            }
            if (t10 instanceof Boolean) {
                return EvaluableType.BOOLEAN;
            }
            if (t10 instanceof String) {
                return EvaluableType.STRING;
            }
            if (t10 instanceof DateTime) {
                return EvaluableType.DATETIME;
            }
            if (t10 instanceof Color) {
                return EvaluableType.COLOR;
            }
            if (t10 instanceof Url) {
                return EvaluableType.URL;
            }
            if (t10 instanceof JSONObject) {
                return EvaluableType.DICT;
            }
            if (t10 instanceof JSONArray) {
                return EvaluableType.ARRAY;
            }
            if (t10 == null) {
                throw new EvaluableException("Unable to find type for null", null, 2, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to find type for ");
            m0.m(t10);
            sb2.append(t10.getClass().getName());
            throw new EvaluableException(sb2.toString(), null, 2, null);
        }

        private Companion() {
        }
    }

    EvaluableType(String str) {
        this.typeName = str;
    }

    @l
    public final String getTypeName$div_evaluable() {
        return this.typeName;
    }

    @Override // java.lang.Enum
    @l
    public String toString() {
        return this.typeName;
    }
}
