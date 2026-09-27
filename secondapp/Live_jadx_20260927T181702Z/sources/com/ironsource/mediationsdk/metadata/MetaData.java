package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f62737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f62738c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f62736a = str;
        this.f62737b = list;
        this.f62738c = list2;
    }

    public String getMetaDataKey() {
        return this.f62736a;
    }

    public List<String> getMetaDataValue() {
        return this.f62737b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f62738c;
    }

    public MetaData(String str, List<String> list) {
        this.f62736a = str;
        this.f62737b = list;
        this.f62738c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f62738c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
