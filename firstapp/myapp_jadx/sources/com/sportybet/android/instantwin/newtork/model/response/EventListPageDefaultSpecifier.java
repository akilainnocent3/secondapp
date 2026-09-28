package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR%\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006$"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/EventListPageDefaultSpecifier;", "", "ou", "", "hd", "ou_incl_ot", "hou_incl_ot", "aou_incl_ot", "wnou_incl_ot", "hd_incl_ot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOu", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getHd", "getOu_incl_ot", "getHou_incl_ot", "getAou_incl_ot", "getWnou_incl_ot", "getHd_incl_ot", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventListPageDefaultSpecifier {
    public static final int $stable = 0;

    @SerializedName("aou_incl_ot")
    private final String aou_incl_ot;

    @SerializedName("hd")
    private final String hd;

    @SerializedName("hd_incl_ot")
    private final String hd_incl_ot;

    @SerializedName("hou_incl_ot")
    private final String hou_incl_ot;

    @SerializedName("ou")
    private final String ou;

    @SerializedName("ou_incl_ot")
    private final String ou_incl_ot;

    @SerializedName("wnou_incl_ot")
    private final String wnou_incl_ot;

    public /* synthetic */ EventListPageDefaultSpecifier(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static /* synthetic */ EventListPageDefaultSpecifier copy$default(EventListPageDefaultSpecifier eventListPageDefaultSpecifier, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventListPageDefaultSpecifier.ou;
        }
        if ((i & 2) != 0) {
            str2 = eventListPageDefaultSpecifier.hd;
        }
        if ((i & 4) != 0) {
            str3 = eventListPageDefaultSpecifier.ou_incl_ot;
        }
        if ((i & 8) != 0) {
            str4 = eventListPageDefaultSpecifier.hou_incl_ot;
        }
        if ((i & 16) != 0) {
            str5 = eventListPageDefaultSpecifier.aou_incl_ot;
        }
        if ((i & 32) != 0) {
            str6 = eventListPageDefaultSpecifier.wnou_incl_ot;
        }
        if ((i & 64) != 0) {
            str7 = eventListPageDefaultSpecifier.hd_incl_ot;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return eventListPageDefaultSpecifier.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOu() {
        return this.ou;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHd() {
        return this.hd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOu_incl_ot() {
        return this.ou_incl_ot;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHou_incl_ot() {
        return this.hou_incl_ot;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAou_incl_ot() {
        return this.aou_incl_ot;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWnou_incl_ot() {
        return this.wnou_incl_ot;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHd_incl_ot() {
        return this.hd_incl_ot;
    }

    public final EventListPageDefaultSpecifier copy(String ou, String hd, String ou_incl_ot, String hou_incl_ot, String aou_incl_ot, String wnou_incl_ot, String hd_incl_ot) {
        qn4.b(ou, hd, ou_incl_ot, hou_incl_ot, aou_incl_ot);
        wnou_incl_ot.getClass();
        hd_incl_ot.getClass();
        return new EventListPageDefaultSpecifier(ou, hd, ou_incl_ot, hou_incl_ot, aou_incl_ot, wnou_incl_ot, hd_incl_ot);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventListPageDefaultSpecifier)) {
            return false;
        }
        EventListPageDefaultSpecifier eventListPageDefaultSpecifier = (EventListPageDefaultSpecifier) other;
        return Intrinsics.g(this.ou, eventListPageDefaultSpecifier.ou) && Intrinsics.g(this.hd, eventListPageDefaultSpecifier.hd) && Intrinsics.g(this.ou_incl_ot, eventListPageDefaultSpecifier.ou_incl_ot) && Intrinsics.g(this.hou_incl_ot, eventListPageDefaultSpecifier.hou_incl_ot) && Intrinsics.g(this.aou_incl_ot, eventListPageDefaultSpecifier.aou_incl_ot) && Intrinsics.g(this.wnou_incl_ot, eventListPageDefaultSpecifier.wnou_incl_ot) && Intrinsics.g(this.hd_incl_ot, eventListPageDefaultSpecifier.hd_incl_ot);
    }

    public final String getAou_incl_ot() {
        return this.aou_incl_ot;
    }

    public final String getHd() {
        return this.hd;
    }

    public final String getHd_incl_ot() {
        return this.hd_incl_ot;
    }

    public final String getHou_incl_ot() {
        return this.hou_incl_ot;
    }

    public final String getOu() {
        return this.ou;
    }

    public final String getOu_incl_ot() {
        return this.ou_incl_ot;
    }

    public final String getWnou_incl_ot() {
        return this.wnou_incl_ot;
    }

    public int hashCode() {
        return this.hd_incl_ot.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.ou.hashCode() * 31, 31, this.hd), 31, this.ou_incl_ot), 31, this.hou_incl_ot), 31, this.aou_incl_ot), 31, this.wnou_incl_ot);
    }

    public String toString() {
        String str = this.ou;
        String str2 = this.hd;
        String str3 = this.ou_incl_ot;
        String str4 = this.hou_incl_ot;
        String str5 = this.aou_incl_ot;
        String str6 = this.wnou_incl_ot;
        String str7 = this.hd_incl_ot;
        StringBuilder sbA = ux5.a("EventListPageDefaultSpecifier(ou=", str, ", hd=", str2, ", ou_incl_ot=");
        hxa.c(sbA, str3, ", hou_incl_ot=", str4, ", aou_incl_ot=");
        hxa.c(sbA, str5, ", wnou_incl_ot=", str6, ", hd_incl_ot=");
        return uf80.a(sbA, str7, ")");
    }

    public EventListPageDefaultSpecifier(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.ou = str;
        this.hd = str2;
        this.ou_incl_ot = str3;
        this.hou_incl_ot = str4;
        this.aou_incl_ot = str5;
        this.wnou_incl_ot = str6;
        this.hd_incl_ot = str7;
    }

    public EventListPageDefaultSpecifier() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
