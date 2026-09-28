package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AudioCodec {
    private final String name;

    public AudioCodec(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
