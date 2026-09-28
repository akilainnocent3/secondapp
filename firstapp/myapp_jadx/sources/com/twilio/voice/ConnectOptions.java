package com.twilio.voice;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ConnectOptions extends CallOptions {
    private final String accessToken;
    private Call.EventListener eventListener;
    private final Map<String, String> params;

    private ConnectOptions(Builder builder) {
        this.accessToken = builder.accessToken;
        List<LocalAudioTrack> list = builder.audioTracks;
        this.audioTracks = list == null ? new ArrayList<>() : list;
        this.iceOptions = builder.iceOptions;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        this.params = builder.params == null ? new HashMap<>() : builder.params;
        this.platformInfo = new PlatformInfo();
        this.eventListener = builder.eventListener;
        this.enableDscp = builder.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = builder.enableIceGatheringOnAnyAddressPorts;
        this.callMessageListener = builder.callMessageListener;
        AudioOptions audioOptions = builder.audioOptions;
        this.audioOptions = audioOptions == null ? new AudioOptions.Builder().build() : audioOptions;
    }

    private long createNativeConnectOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        Pair<String[], String[]> pairMapToArrays = Utils.mapToArrays(this.params);
        return nativeCreate(this.accessToken, (String[]) pairMapToArrays.first, (String[]) pairMapToArrays.second, getLocalAudioTracksArray(), this.iceOptions, this.enableDscp, this.enableIceGatheringOnAnyAddressPorts, getAudioCodecsArray(), this.platformInfo);
    }

    private native long nativeCreate(String str, String[] strArr, String[] strArr2, LocalAudioTrack[] localAudioTrackArr, IceOptions iceOptions, boolean z, boolean z2, AudioCodec[] audioCodecArr, PlatformInfo platformInfo);

    public String getAccessToken() {
        return this.accessToken;
    }

    public Call.EventListener getEventListener() {
        return this.eventListener;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public static class Builder extends CallOptions.Builder {
        private final String accessToken;
        private Map<String, String> params;

        public Builder(String str) {
            Preconditions.checkNotNull(str, "accessToken must not be null");
            this.accessToken = str;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder audioOptions(AudioOptions audioOptions) {
            Preconditions.checkNotNull(audioOptions, "audioOptions must not be null.");
            super.audioOptions(audioOptions);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder audioTracks(List<LocalAudioTrack> list) {
            Preconditions.checkNotNull(list, "audioTracks must not be null");
            super.audioTracks(list);
            return this;
        }

        public ConnectOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            Map<String, String> map = this.params;
            int i = 0;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    boolean z = true;
                    Preconditions.checkState(entry.getKey() != null, "params entry key should not be null");
                    if (entry.getValue() == null) {
                        z = false;
                    }
                    Preconditions.checkState(z, "params entry value should not be null");
                }
            }
            return new ConnectOptions(this, i);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder callMessageListener(Call.CallMessageListener callMessageListener) {
            return (Builder) super.callMessageListener(callMessageListener);
        }

        public Builder eventListener(Call.EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder iceOptions(IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            super.iceOptions(iceOptions);
            return this;
        }

        public Builder params(Map<String, String> map) {
            Preconditions.checkNotNull(map, "params must not be null");
            this.params = map;
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder preferAudioCodecs(List<AudioCodec> list) {
            Preconditions.checkNotNull(list, "preferredAudioCodecs must not be null");
            CallOptions.checkAudioCodecs(list);
            super.preferAudioCodecs(list);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder enableDscp(boolean z) {
            super.enableDscp(z);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder enableIceGatheringOnAnyAddressPorts(boolean z) {
            super.enableIceGatheringOnAnyAddressPorts(z);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public /* bridge */ /* synthetic */ CallOptions.Builder audioTracks(List list) {
            return audioTracks((List<LocalAudioTrack>) list);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public /* bridge */ /* synthetic */ CallOptions.Builder preferAudioCodecs(List list) {
            return preferAudioCodecs((List<AudioCodec>) list);
        }
    }

    private ConnectOptions() {
        this.accessToken = "";
        this.params = new HashMap();
    }

    public /* synthetic */ ConnectOptions(Builder builder, int i) {
        this(builder);
    }
}
