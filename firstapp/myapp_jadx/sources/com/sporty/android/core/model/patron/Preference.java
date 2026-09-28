package com.sporty.android.core.model.patron;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0015¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/patron/Preference;", "", "userPrefKey", "", "userPrefValue", "", "<init>", "(Ljava/lang/String;Z)V", "getUserPrefKey", "()Ljava/lang/String;", "getUserPrefValue", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Preference {
    private final String userPrefKey;
    private final boolean userPrefValue;

    public Preference(String str, boolean z) {
        str.getClass();
        this.userPrefKey = str;
        this.userPrefValue = z;
    }

    public static /* synthetic */ Preference copy$default(Preference preference, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preference.userPrefKey;
        }
        if ((i & 2) != 0) {
            z = preference.userPrefValue;
        }
        return preference.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserPrefKey() {
        return this.userPrefKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUserPrefValue() {
        return this.userPrefValue;
    }

    public final Preference copy(String userPrefKey, boolean userPrefValue) {
        userPrefKey.getClass();
        return new Preference(userPrefKey, userPrefValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) other;
        return Intrinsics.g(this.userPrefKey, preference.userPrefKey) && this.userPrefValue == preference.userPrefValue;
    }

    public final String getUserPrefKey() {
        return this.userPrefKey;
    }

    public final boolean getUserPrefValue() {
        return this.userPrefValue;
    }

    public int hashCode() {
        return Boolean.hashCode(this.userPrefValue) + (this.userPrefKey.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("Preference(userPrefKey=", this.userPrefKey, ", userPrefValue=", ")", this.userPrefValue);
    }
}
