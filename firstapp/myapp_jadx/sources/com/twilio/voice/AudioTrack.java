package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
abstract class AudioTrack implements Track {
    private boolean isEnabled;
    private final String name;

    public AudioTrack(boolean z, String str) {
        this.isEnabled = z;
        this.name = str;
    }

    @Override // com.twilio.voice.Track
    public String getName() {
        return this.name;
    }

    @Override // com.twilio.voice.Track
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }
}
