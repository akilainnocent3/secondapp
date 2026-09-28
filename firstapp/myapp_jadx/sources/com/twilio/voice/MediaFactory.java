package com.twilio.voice;

import android.content.Context;
import androidx.window.layout.oKr.TEFcJcMqR;
import java.util.HashSet;
import java.util.Set;
import tvo.webrtc.audio.AudioDeviceModule;
import tvo.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: loaded from: classes8.dex */
class MediaFactory {
    private static final String RELEASE_MESSAGE_TEMPLATE = "MediaFactory released %s unavailable";
    private static volatile MediaFactory instance;
    private static final Logger logger = Logger.getLogger(MediaFactory.class);
    private static volatile Set<Object> mediaFactoryOwners = new HashSet();
    private AudioDeviceModule audioDeviceModule;
    private AudioDeviceProxy audioDeviceProxy;
    private long nativeMediaFactoryHandle;

    private MediaFactory(Context context, AudioDevice audioDevice) {
        long jNativeCreateWithCustomDevice = nativeCreateWithCustomDevice(context, audioDevice, audioDevice.getCapturerFormat(), audioDevice.getRendererFormat());
        this.nativeMediaFactoryHandle = jNativeCreateWithCustomDevice;
        if (0 == jNativeCreateWithCustomDevice) {
            logger.e("Failed to instance MediaFactory");
        }
    }

    private long defaultAudioDeviceFactory(Context context) {
        DefaultAudioDevice defaultAudioDevice = (DefaultAudioDevice) Voice.getAudioDevice();
        JavaAudioDeviceModule javaAudioDeviceModuleCreateAudioDeviceModule = JavaAudioDeviceModule.builder(context).setUseHardwareNoiseSuppressor(defaultAudioDevice.useHardwareNoiseSuppressor()).setUseHardwareAcousticEchoCanceler(defaultAudioDevice.useHardwareAcousticEchoCanceler()).createAudioDeviceModule();
        this.audioDeviceModule = javaAudioDeviceModuleCreateAudioDeviceModule;
        return javaAudioDeviceModuleCreateAudioDeviceModule.getNativeAudioDeviceModulePointer();
    }

    public static boolean isReleased() {
        boolean z;
        synchronized (MediaFactory.class) {
            z = instance == null;
        }
        return z;
    }

    public static void manualRelease() {
        synchronized (MediaFactory.class) {
            try {
                if (instance != null) {
                    mediaFactoryOwners.clear();
                    instance.release(new Object());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native long nativeCreate(Context context);

    private native LocalAudioTrack nativeCreateAudioTrack(long j, Context context, boolean z, AudioOptions audioOptions, String str);

    private native long nativeCreateWithCustomDevice(Context context, AudioDevice audioDevice, AudioFormat audioFormat, AudioFormat audioFormat2);

    private native void nativeRelease(long j);

    public synchronized LocalAudioTrack createAudioTrack(Context context, boolean z, AudioOptions audioOptions, String str) {
        try {
            try {
                Preconditions.checkNotNull(context, "context must not be null");
                Preconditions.checkNotNull(audioOptions, "audioOptions must not be null");
                Preconditions.checkApplicationContext(context, "must create local audio track with application context");
                Preconditions.checkState(this.nativeMediaFactoryHandle != 0, RELEASE_MESSAGE_TEMPLATE, "createAudioTrack");
                return nativeCreateAudioTrack(this.nativeMediaFactoryHandle, context, z, audioOptions, str);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public long getNativeMediaFactoryHandle() {
        return this.nativeMediaFactoryHandle;
    }

    public void release(Object obj) {
        if (instance != null) {
            synchronized (MediaFactory.class) {
                try {
                    mediaFactoryOwners.remove(obj);
                    if (instance != null && mediaFactoryOwners.isEmpty()) {
                        AudioDeviceModule audioDeviceModule = this.audioDeviceModule;
                        if (audioDeviceModule != null) {
                            audioDeviceModule.release();
                        }
                        AudioDeviceProxy audioDeviceProxy = this.audioDeviceProxy;
                        if (audioDeviceProxy != null) {
                            audioDeviceProxy.release();
                        }
                        this.audioDeviceProxy = null;
                        nativeRelease(this.nativeMediaFactoryHandle);
                        this.nativeMediaFactoryHandle = 0L;
                        instance = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setAudioDeviceProxy(AudioDeviceProxy audioDeviceProxy) {
        this.audioDeviceProxy = audioDeviceProxy;
    }

    public static MediaFactory instance(Object obj, Context context) {
        Preconditions.checkNotNull(obj, "owner must not be null");
        Preconditions.checkNotNull(context, TEFcJcMqR.gQhlbsYOWOFLLc);
        Preconditions.checkApplicationContext(context);
        synchronized (MediaFactory.class) {
            try {
                if (instance == null) {
                    Voice.loadLibrary(context);
                    AudioDevice audioDevice = Voice.getAudioDevice();
                    if (audioDevice instanceof DefaultAudioDevice) {
                        instance = new MediaFactory(context);
                    } else {
                        instance = new MediaFactory(context, audioDevice);
                    }
                }
                mediaFactoryOwners.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    private MediaFactory(Context context) {
        long jNativeCreate = nativeCreate(context);
        this.nativeMediaFactoryHandle = jNativeCreate;
        if (0 == jNativeCreate) {
            logger.e("Failed to instance MediaFactory");
        }
    }
}
