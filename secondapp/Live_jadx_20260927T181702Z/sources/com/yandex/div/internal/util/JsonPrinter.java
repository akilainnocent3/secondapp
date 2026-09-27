package com.yandex.div.internal.util;

import java.util.Iterator;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class JsonPrinter {

    @l
    private static final Companion Companion = new Companion(null);

    @l
    private static final String ELLIPSIS = "...";
    private final int indentSpaces;
    private final int nestingLimit;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public JsonPrinter(int i10, int i11) {
        this.indentSpaces = i10;
        this.nestingLimit = i11;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    private final JSONObject deepCopy(JSONObject jSONObject, int i10) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                if (i10 == 0) {
                    objOpt = ELLIPSIS;
                } else {
                    objOpt = deepCopy((JSONObject) objOpt, i10 - 1);
                }
            } else if (objOpt instanceof JSONArray) {
                if (i10 == 0) {
                    objOpt = ELLIPSIS;
                } else {
                    objOpt = deepCopy((JSONArray) objOpt, i10 - 1);
                }
            }
            jSONObject2.put(next, objOpt);
        }
        return jSONObject2;
    }

    @l
    public final String print(@l JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectDeepCopy = deepCopy(jSONObject, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONObjectDeepCopy.toString() : jSONObjectDeepCopy.toString(i10);
    }

    @l
    public final String print(@l JSONArray jSONArray) throws JSONException {
        JSONArray jSONArrayDeepCopy = deepCopy(jSONArray, this.nestingLimit);
        int i10 = this.indentSpaces;
        return i10 == 0 ? jSONArrayDeepCopy.toString() : jSONArrayDeepCopy.toString(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private final JSONArray deepCopy(JSONArray jSONArray, int i10) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object objOpt = jSONArray.opt(i11);
            if (objOpt instanceof JSONObject) {
                if (i10 == 0) {
                    objOpt = ELLIPSIS;
                } else {
                    objOpt = deepCopy((JSONObject) objOpt, i10 - 1);
                }
            } else if (objOpt instanceof JSONArray) {
                if (i10 == 0) {
                    objOpt = ELLIPSIS;
                } else {
                    objOpt = deepCopy((JSONArray) objOpt, i10 - 1);
                }
            }
            jSONArray2.put(objOpt);
        }
        return jSONArray2;
    }
}
