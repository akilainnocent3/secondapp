package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tx5;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/book/domain/entity/MarketGroup;", "", AnalyticsParam.EVENT_PARAM_ID, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "displayName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MarketGroup {
    public static final int $stable = 0;
    private final String id;
    private final String name;

    public MarketGroup(String str, String str2) {
        str.getClass();
        this.id = str;
        this.name = str2;
    }

    public static /* synthetic */ MarketGroup copy$default(MarketGroup marketGroup, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketGroup.id;
        }
        if ((i & 2) != 0) {
            str2 = marketGroup.name;
        }
        return marketGroup.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final MarketGroup copy(String id, String name) {
        id.getClass();
        return new MarketGroup(id, name);
    }

    public final String displayName() {
        String strValueOf;
        String str = this.name;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                if (str.length() <= 0) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                char cCharAt = str.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.US;
                    locale.getClass();
                    strValueOf = CharsKt.c(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                sb.append(str.substring(1));
                return sb.toString();
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketGroup)) {
            return false;
        }
        MarketGroup marketGroup = (MarketGroup) other;
        return Intrinsics.g(this.id, marketGroup.id) && Intrinsics.g(this.name, marketGroup.name);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return tx5.a("MarketGroup(id=", this.id, ", name=", this.name, ")");
    }
}
