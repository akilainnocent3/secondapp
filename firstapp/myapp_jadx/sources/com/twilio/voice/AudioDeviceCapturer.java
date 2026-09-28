package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public interface AudioDeviceCapturer {
    AudioFormat getCapturerFormat();

    boolean onInitCapturer();

    boolean onStartCapturing(AudioDeviceContext audioDeviceContext);

    boolean onStopCapturing();
}
