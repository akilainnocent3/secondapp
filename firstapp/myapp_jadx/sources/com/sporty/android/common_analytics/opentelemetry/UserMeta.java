package com.sporty.android.common_analytics.opentelemetry;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.ux5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003JC\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/common_analytics/opentelemetry/UserMeta;", "", "email", "", AnalyticsParam.EVENT_PARAM_ID, "username", "attributes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getEmail", "()Ljava/lang/String;", "getId", "getUsername", "getAttributes", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserMeta {
    private final Map<String, Object> attributes;
    private final String email;
    private final String id;
    private final String username;

    public /* synthetic */ UserMeta(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMeta copy$default(UserMeta userMeta, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userMeta.email;
        }
        if ((i & 2) != 0) {
            str2 = userMeta.id;
        }
        if ((i & 4) != 0) {
            str3 = userMeta.username;
        }
        if ((i & 8) != 0) {
            map = userMeta.attributes;
        }
        return userMeta.copy(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final Map<String, Object> component4() {
        return this.attributes;
    }

    public final UserMeta copy(String email, String id, String username, Map<String, ? extends Object> attributes) {
        id.getClass();
        return new UserMeta(email, id, username, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMeta)) {
            return false;
        }
        UserMeta userMeta = (UserMeta) other;
        return Intrinsics.g(this.email, userMeta.email) && Intrinsics.g(this.id, userMeta.id) && Intrinsics.g(this.username, userMeta.username) && Intrinsics.g(this.attributes, userMeta.attributes);
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.email;
        int iA = gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.id);
        String str2 = this.username;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.attributes;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.id;
        String str3 = this.username;
        Map<String, Object> map = this.attributes;
        StringBuilder sbA = ux5.a("UserMeta(email=", str, ", id=", str2, ", username=");
        sbA.append(str3);
        sbA.append(", attributes=");
        sbA.append(map);
        sbA.append(")");
        return sbA.toString();
    }

    public UserMeta(String str, String str2, String str3, Map<String, ? extends Object> map) {
        str2.getClass();
        this.email = str;
        this.id = str2;
        this.username = str3;
        this.attributes = map;
    }
}
