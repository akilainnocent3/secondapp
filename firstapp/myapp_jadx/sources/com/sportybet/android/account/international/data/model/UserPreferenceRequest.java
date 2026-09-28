package com.sportybet.android.account.international.data.model;

import com.google.gson.annotations.SerializedName;
import defpackage.om2;
import defpackage.pe4;
import defpackage.tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u0004\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u0004\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest;", "", "key", "Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Key;", "value", "", "<init>", "(Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Key;Ljava/lang/String;)V", "getKey", "()Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Key;", "Lcom/google/gson/annotations/SerializedName;", "userPrefKey", "getValue", "()Ljava/lang/String;", "userPrefValue", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Key", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserPreferenceRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("userPrefKey")
    private final Key key;

    @SerializedName("userPrefValue")
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Companion;", "", "<init>", "()V", "fromKeyName", "Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Key;", "keyName", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Key fromKeyName(String keyName) {
            Key next;
            keyName.getClass();
            Iterator<Key> it = Key.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.g(next.getKeyName(), keyName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sportybet/android/account/international/data/model/UserPreferenceRequest$Key;", "", "keyName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "MARKETING_PROMOTIONS", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Key {
        MARKETING_PROMOTIONS("marketingPromotionsOptIn");

        private static final /* synthetic */ tag $ENTRIES = om2.a(values());
        private final String keyName;

        Key(String str) {
            this.keyName = str;
        }

        public static tag<Key> getEntries() {
            return $ENTRIES;
        }

        public final String getKeyName() {
            return this.keyName;
        }
    }

    public UserPreferenceRequest(Key key, String str) {
        key.getClass();
        str.getClass();
        this.key = key;
        this.value = str;
    }

    public static /* synthetic */ UserPreferenceRequest copy$default(UserPreferenceRequest userPreferenceRequest, Key key, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            key = userPreferenceRequest.key;
        }
        if ((i & 2) != 0) {
            str = userPreferenceRequest.value;
        }
        return userPreferenceRequest.copy(key, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Key getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final UserPreferenceRequest copy(Key key, String value) {
        key.getClass();
        value.getClass();
        return new UserPreferenceRequest(key, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserPreferenceRequest)) {
            return false;
        }
        UserPreferenceRequest userPreferenceRequest = (UserPreferenceRequest) other;
        return this.key == userPreferenceRequest.key && Intrinsics.g(this.value, userPreferenceRequest.value);
    }

    public final Key getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    public final List<Pair<String, String>> toFormUrlEncodedMap(int index) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(pe4.b(index, "userPreferences[", "].userPrefKey"), this.key.getKeyName()));
        arrayList.add(new Pair(pe4.b(index, "userPreferences[", "].userPrefValue"), this.value));
        return arrayList;
    }

    public String toString() {
        return "UserPreferenceRequest(key=" + this.key + ", value=" + this.value + ")";
    }
}
