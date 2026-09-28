package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class DefaultAudioDevice implements AudioDevice {
    private boolean useHardwareAcousticEchoCanceler = true;
    private boolean useHardwareNoiseSuppressor = true;

    @Override // com.twilio.voice.AudioDeviceCapturer
    public AudioFormat getCapturerFormat() {
        return null;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public AudioFormat getRendererFormat() {
        return null;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onInitCapturer() {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onInitRenderer() {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStartCapturing(AudioDeviceContext audioDeviceContext) {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStartRendering(AudioDeviceContext audioDeviceContext) {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStopCapturing() {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStopRendering() {
        return false;
    }

    public void setUseHardwareAcousticEchoCanceler(boolean z) {
        this.useHardwareAcousticEchoCanceler = z;
    }

    public void setUseHardwareNoiseSuppressor(boolean z) {
        this.useHardwareNoiseSuppressor = z;
    }

    public boolean useHardwareAcousticEchoCanceler() {
        return this.useHardwareAcousticEchoCanceler;
    }

    public boolean useHardwareNoiseSuppressor() {
        return this.useHardwareNoiseSuppressor;
    }
}
