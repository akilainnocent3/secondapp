package com.yandex.div.internal.util;

import androidx.activity.k0;
import dr.w2;
import ds.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class JsonUtilsKt {
    @l
    public static final <R> List<R> asList(@l JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (!k0.a(obj)) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T> void forEach(JSONObject jSONObject, p<? super String, ? super T, w2> pVar) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            m0.y(3, "T");
            if (k0.a(obj)) {
                pVar.invoke(next, obj);
            }
        }
    }

    public static final /* synthetic */ <T> void forEachNullable(JSONObject jSONObject, p<? super String, ? super T, w2> pVar) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            m0.y(3, "T?");
            if (k0.a(objOpt)) {
                pVar.invoke(next, objOpt);
            }
        }
    }

    @l
    public static final String getStringOrEmpty(@l JSONObject jSONObject, @l String str) {
        Object objOpt = jSONObject.opt(str);
        return objOpt instanceof String ? (String) objOpt : "";
    }

    @m
    public static final String getStringOrNull(@l JSONObject jSONObject, @l String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }

    public static final boolean isEmpty(@l JSONObject jSONObject) {
        return jSONObject.length() == 0;
    }

    @l
    public static final <R> List<R> map(@l JSONArray jSONArray, @l ds.l<Object, ? extends R> lVar) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(lVar.invoke(jSONArray.get(i10)));
        }
        return arrayList;
    }

    @l
    public static final <R> List<R> mapIndexedNotNull(@l JSONArray jSONArray, @l p<? super Integer, Object, ? extends R> pVar) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            R rInvoke = pVar.invoke(Integer.valueOf(i10), jSONArray.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @l
    public static final <R> List<R> mapNotNull(@l JSONArray jSONArray, @l ds.l<Object, ? extends R> lVar) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            R rInvoke = lVar.invoke(jSONArray.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @l
    public static final String summary(@l JSONObject jSONObject, int i10) {
        return new JsonPrinter(i10, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONObject, i10);
    }

    public static final boolean isEmpty(@l JSONArray jSONArray) {
        return jSONArray.length() == 0;
    }

    @l
    public static final String summary(@l JSONArray jSONArray, int i10) {
        return new JsonPrinter(i10, 1).print(jSONArray);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONArray, i10);
    }

    public static final /* synthetic */ <T> void forEach(JSONArray jSONArray, p<? super Integer, ? super T, w2> pVar) throws JSONException {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            m0.y(3, "T");
            if (k0.a(obj)) {
                pVar.invoke(Integer.valueOf(i10), obj);
            }
        }
    }

    public static final /* synthetic */ <T> void forEachNullable(JSONArray jSONArray, p<? super Integer, ? super T, w2> pVar) {
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objOpt = jSONArray.opt(i10);
            m0.y(3, "T?");
            if (k0.a(objOpt)) {
                pVar.invoke(Integer.valueOf(i10), objOpt);
            }
        }
    }
}
