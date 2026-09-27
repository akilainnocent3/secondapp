package com.startapp.sdk.ads.external.config;

import androidx.annotation.Keep;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.si;
import cs.b;
import cv.i0;
import cv.k0;
import cv.p0;
import fr.n1;
import fr.r0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@s1({"SMAP\nAdUnitConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdUnitConfig.kt\ncom/startapp/sdk/ads/external/config/AdUnitConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n295#2,2:50\n*S KotlinDebug\n*F\n+ 1 AdUnitConfig.kt\ncom/startapp/sdk/ads/external/config/AdUnitConfig\n*L\n23#1:50,2\n*E\n"})
public final class AdUnitConfig implements Serializable {

    @l
    private static final String BID_PRICE_PREFIX = "bp";

    @l
    public static final e0 Companion = new e0();
    private static final long serialVersionUID = 6500875630965723979L;

    @m
    private String sioPrice;

    @l
    private String network = "gam";

    @l
    private String adUnitId = "";

    @l
    @TypeInfo(type = HashMap.class)
    private Map<String, ? extends List<String>> keyValues = n1.z();

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.g(b.i(AdUnitConfig.class), b.i(obj.getClass()))) {
            AdUnitConfig adUnitConfig = (AdUnitConfig) obj;
            if (m0.g(this.adUnitId, adUnitConfig.adUnitId) && m0.g(this.network, adUnitConfig.network) && si.a((Object) this.sioPrice, (Object) adUnitConfig.sioPrice) && si.a(this.keyValues, adUnitConfig.keyValues)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @m
    public final String getBp() {
        Object next;
        List list;
        Iterator<T> it = this.keyValues.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!k0.J2((String) ((Map.Entry) next).getKey(), BID_PRICE_PREFIX, false, 2, null));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) r0.L2(list);
    }

    @l
    public final Map<String, List<String>> getKeyValues() {
        return this.keyValues;
    }

    @l
    public final String getNetwork() {
        return this.network;
    }

    @m
    public final String getSioPrice() {
        return this.sioPrice;
    }

    public int hashCode() {
        Object[] objArr = {this.adUnitId, this.keyValues, this.sioPrice, this.network};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isValid() {
        String str = this.sioPrice;
        boolean z10 = (str != null ? i0.Z0(str) : null) != null;
        String bp2 = getBp();
        return z10 & ((bp2 != null ? i0.Z0(bp2) : null) != null) & (!p0.O3(this.adUnitId));
    }

    public final void setAdUnitId(@l String str) {
        m0.p(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setKeyValues(@l Map<String, ? extends List<String>> map) {
        m0.p(map, "<set-?>");
        this.keyValues = map;
    }

    public final void setNetwork(@l String str) {
        m0.p(str, "<set-?>");
        this.network = str;
    }

    public final void setSioPrice(@m String str) {
        this.sioPrice = str;
    }
}
