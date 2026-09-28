package com.twilio.voice;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class IceOptions {
    private final Set<IceServer> iceServers;
    private final IceTransportPolicy iceTransportPolicy;

    public static class Builder {
        private Set<IceServer> iceServers;
        private IceTransportPolicy iceTransportPolicy = IceTransportPolicy.ALL;

        public IceOptions build() {
            return new IceOptions(this, 0);
        }

        public Builder iceServers(Set<IceServer> set) {
            Preconditions.checkNotNull(set, "iceServers must not be null");
            this.iceServers = set;
            return this;
        }

        public Builder iceTransportPolicy(IceTransportPolicy iceTransportPolicy) {
            Preconditions.checkNotNull(iceTransportPolicy, "iceTransportPolicy must not be null");
            this.iceTransportPolicy = iceTransportPolicy;
            return this;
        }
    }

    private IceOptions(Builder builder) {
        this.iceServers = builder.iceServers != null ? builder.iceServers : new HashSet<>();
        this.iceTransportPolicy = builder.iceTransportPolicy;
    }

    public Set<IceServer> getIceServers() {
        return this.iceServers;
    }

    public IceServer[] getIceServersArray() {
        IceServer[] iceServerArr = new IceServer[0];
        if (this.iceServers.isEmpty()) {
            return iceServerArr;
        }
        Set<IceServer> set = this.iceServers;
        return (IceServer[]) set.toArray(new IceServer[set.size()]);
    }

    public IceTransportPolicy getIceTransportPolicy() {
        return this.iceTransportPolicy;
    }

    public /* synthetic */ IceOptions(Builder builder, int i) {
        this(builder);
    }
}
