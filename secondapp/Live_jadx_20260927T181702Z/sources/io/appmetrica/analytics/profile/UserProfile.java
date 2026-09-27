package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC5056fo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f98998a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f98999a;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC5056fo> userProfileUpdate) {
            this.f98999a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f98999a, 0);
        }

        private Builder() {
            this.f98999a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i10) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC5056fo>> getUserProfileUpdates() {
        return this.f98998a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f98998a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
