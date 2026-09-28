package com.sporty.android.core.model.luckywheel;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000fj\u0010\b\u0010\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011j\u0010\b\u0012\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013j\u0010\b\u0014\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015Ê\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/luckywheel/LuckyWheelColor;", "", AnalyticsParam.EVENT_PATH, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "BLACK", "Lcom/google/gson/annotations/SerializedName;", "value", "black", "RED", "red", "GREEN", "green", "YELLOW", "yellow", "BLUE", "blue", "WHITE", "white", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LuckyWheelColor {
    BLACK("https://s.sporty.net/common/main/res/39030d6ef3679123ff5a2bc6d7aa8041.png"),
    RED("https://s.sporty.net/common/main/res/86be3d6cf29ef69155a9e5f5d6cfcdfd.png"),
    GREEN("https://s.sporty.net/common/main/res/da1ee5cf3311942366270893ec4ebd4c.png"),
    YELLOW("https://s.sporty.net/common/main/res/7fca13b3ba578db45a04461fd93fd31a.png"),
    BLUE("https://s.sporty.net/common/main/res/5437c1c5c99e696e48ed45d2366bf7d7.png"),
    WHITE("https://s.sporty.net/common/main/res/324613a3026a00f5044c040b92c85aa4.png");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String path;

    LuckyWheelColor(String str) {
        this.path = str;
    }

    public static tag<LuckyWheelColor> getEntries() {
        return $ENTRIES;
    }

    public final String getPath() {
        return this.path;
    }
}
