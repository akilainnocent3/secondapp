package com.twilio.voice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AcceptOptions extends CallOptions {
    private final Map<String, String> callInviteMessage;

    private AcceptOptions(Builder builder) {
        List<LocalAudioTrack> list = builder.audioTracks;
        this.audioTracks = list == null ? new ArrayList<>() : list;
        this.iceOptions = builder.iceOptions;
        this.enableDscp = builder.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = builder.enableIceGatheringOnAnyAddressPorts;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        this.callInviteMessage = builder.callInvite == null ? new HashMap<>() : builder.callInvite.callInviteMessage;
        this.platformInfo = new PlatformInfo();
        this.callMessageListener = builder.callMessageListener;
        AudioOptions audioOptions = builder.audioOptions;
        this.audioOptions = audioOptions == null ? new AudioOptions.Builder().build() : audioOptions;
    }

    private long createNativeAcceptOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        return nativeCreate(getLocalAudioTracksArray(), this.iceOptions, this.enableDscp, this.enableIceGatheringOnAnyAddressPorts, getAudioCodecsArray(), this.platformInfo);
    }

    private native long nativeCreate(LocalAudioTrack[] localAudioTrackArr, IceOptions iceOptions, boolean z, boolean z2, AudioCodec[] audioCodecArr, PlatformInfo platformInfo);

    public static class Builder extends CallOptions.Builder {
        private final CallInvite callInvite;

        public Builder(CallInvite callInvite, boolean z) {
            Preconditions.checkNotNull(callInvite);
            this.callInvite = callInvite;
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

        public AcceptOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            return new AcceptOptions(this, 0);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder callMessageListener(Call.CallMessageListener callMessageListener) {
            return (Builder) super.callMessageListener(callMessageListener);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        public Builder iceOptions(IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            super.iceOptions(iceOptions);
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

        public Builder() {
            this.callInvite = null;
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

    private AcceptOptions() {
        this.callInviteMessage = null;
    }

    public /* synthetic */ AcceptOptions(Builder builder, int i) {
        this(builder);
    }
}
