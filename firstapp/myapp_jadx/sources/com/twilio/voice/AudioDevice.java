package com.twilio.voice;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public interface AudioDevice extends AudioDeviceCapturer, AudioDeviceRenderer {
    static void audioDeviceExecuteWorkerBlock(AudioDeviceContext audioDeviceContext, Runnable runnable) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(runnable, "runnable must not be null");
        ((AudioDeviceProxy) audioDeviceContext).executeWorkerBlock(runnable);
    }

    static void audioDeviceFormatChanged(AudioDeviceContext audioDeviceContext) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        ((AudioDeviceProxy) audioDeviceContext).formatChanged();
    }

    static void audioDeviceReadRenderData(AudioDeviceContext audioDeviceContext, ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer, "runnable must not be null");
        ((AudioDeviceProxy) audioDeviceContext).readRenderData(byteBuffer);
    }

    static void audioDeviceWriteCaptureData(AudioDeviceContext audioDeviceContext, ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer, "audioSample must not be null");
        ((AudioDeviceProxy) audioDeviceContext).writeCaptureData(byteBuffer);
    }
}
