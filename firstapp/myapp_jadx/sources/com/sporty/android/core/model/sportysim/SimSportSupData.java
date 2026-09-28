package com.sporty.android.core.model.sportysim;

import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/sportysim/SimSportSupData;", "", "sportId", "", "name", "preMatchMarkets", "", "liveMarkets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getName", "getPreMatchMarkets", "()Ljava/util/List;", "supportMarkets", "getLiveMarkets", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SimSportSupData {

    @SerializedName("liveMarkets")
    private final List<String> liveMarkets;

    @SerializedName("name")
    private final String name;

    @SerializedName("supportMarkets")
    private final List<String> preMatchMarkets;

    @SerializedName("sportId")
    private final String sportId;

    public SimSportSupData(String str, String str2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? m2g.a : list, (i & 8) != 0 ? m2g.a : list2);
    }

    public final List<String> getLiveMarkets() {
        return this.liveMarkets;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getPreMatchMarkets() {
        return this.preMatchMarkets;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public SimSportSupData(String str, String str2, List<String> list, List<String> list2) {
        str.getClass();
        this.sportId = str;
        this.name = str2;
        this.preMatchMarkets = list;
        this.liveMarkets = list2;
    }

    public SimSportSupData() {
        this(null, null, null, null, 15, null);
    }
}
