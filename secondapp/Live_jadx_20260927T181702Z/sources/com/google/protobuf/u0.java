package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public final class u0 {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f52592id;
    private final java.lang.reflect.Field valueField;

    public u0(int id2, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f52592id = id2;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f52592id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
