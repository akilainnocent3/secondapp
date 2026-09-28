package com.twilio.voice;

import defpackage.inm;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class PreflightOptions {
    private final String accessToken;
    private final IceOptions iceOptions;
    private final Call.EventListener insightsListener;
    private final List<AudioCodec> preferredAudioCodecs;

    public static class Builder {
        String accessToken;
        IceOptions iceOptions;
        Call.EventListener insightsListener;
        List<AudioCodec> preferredAudioCodecs;

        public Builder(String str) {
            Preconditions.checkNotNull(str, "accessToken must not be null");
            this.accessToken = str;
        }

        public PreflightOptions build() {
            return new PreflightOptions(this, 0);
        }

        public Builder eventListener(Call.EventListener eventListener) {
            this.insightsListener = eventListener;
            return this;
        }

        public Builder iceOptions(IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            this.iceOptions = iceOptions;
            return this;
        }

        public Builder preferAudioCodecs(List<AudioCodec> list) {
            Preconditions.checkNotNull(list, "preferredAudioCodecs must not be null");
            PreflightOptions.checkAudioCodecs(list);
            this.preferredAudioCodecs = list;
            return this;
        }
    }

    private PreflightOptions(Builder builder) {
        this.accessToken = builder.accessToken;
        this.iceOptions = builder.iceOptions;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        this.insightsListener = builder.insightsListener;
    }

    public static void checkAudioCodecs(List<AudioCodec> list) {
        for (AudioCodec audioCodec : list) {
            Preconditions.checkNotNull(audioCodec);
            Preconditions.checkArgument(Constants.SUPPORTED_CODECS.contains(audioCodec.getClass()), inm.a("Unsupported audio codec ", audioCodec.getName()));
        }
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public AudioCodec[] getAudioCodecsArray() {
        AudioCodec[] audioCodecArr = new AudioCodec[0];
        List<AudioCodec> list = this.preferredAudioCodecs;
        if (list == null || list.isEmpty()) {
            return audioCodecArr;
        }
        return (AudioCodec[]) this.preferredAudioCodecs.toArray(new AudioCodec[this.preferredAudioCodecs.size()]);
    }

    public Call.EventListener getEventListener() {
        return this.insightsListener;
    }

    public IceOptions getIceOptions() {
        return this.iceOptions;
    }

    public List<AudioCodec> getPreferredAudioCodecs() {
        return this.preferredAudioCodecs;
    }

    public /* synthetic */ PreflightOptions(Builder builder, int i) {
        this(builder);
    }
}
