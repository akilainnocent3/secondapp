package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public interface AudioDeviceRenderer {
    AudioFormat getRendererFormat();

    boolean onInitRenderer();

    boolean onStartRendering(AudioDeviceContext audioDeviceContext);

    boolean onStopRendering();
}
