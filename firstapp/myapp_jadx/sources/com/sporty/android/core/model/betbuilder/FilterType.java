package com.sporty.android.core.model.betbuilder;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\nj\u0010\b\u000b\u0012\f\b\t\u0012\b\b\u0002\u0012\u0004\b\b(\f¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/betbuilder/FilterType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TOURNAMENT", "Lcom/google/gson/annotations/SerializedName;", "tournament", "SPORT", "sport", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum FilterType {
    TOURNAMENT("tournament"),
    SPORT("sport");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String value;

    FilterType(String str) {
        this.value = str;
    }

    public static tag<FilterType> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
