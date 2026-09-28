package com.twilio.voice;

import android.content.Context;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;

/* JADX INFO: loaded from: classes8.dex */
class LocalAudioTrack extends AudioTrack {
    private static final Logger logger = Logger.getLogger(LocalAudioTrack.class);
    private final MediaFactory mediaFactory;
    private long nativeLocalAudioTrackHandle;
    private final String trackId;

    public LocalAudioTrack(long j, String str, String str2, boolean z, Context context) {
        super(z, str2);
        Preconditions.checkApplicationContext(context, "must create local audio track with application context");
        this.trackId = str;
        this.nativeLocalAudioTrackHandle = j;
        this.mediaFactory = MediaFactory.instance(this, context);
    }

    public static LocalAudioTrack create(Context context, boolean z, AudioOptions audioOptions, String str) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(audioOptions, "audioOptions must not be null.");
        Preconditions.checkState(Utils.permissionGranted(context, "android.permission.RECORD_AUDIO"), "RECORD_AUDIO permission must be granted to create audio track");
        Object obj = new Object();
        MediaFactory mediaFactoryInstance = MediaFactory.instance(obj, context.getApplicationContext());
        LocalAudioTrack localAudioTrackCreateAudioTrack = mediaFactoryInstance.createAudioTrack(context.getApplicationContext(), z, audioOptions, str);
        if (localAudioTrackCreateAudioTrack == null) {
            logger.e("Failed to create local audio track");
        }
        mediaFactoryInstance.release(obj);
        return localAudioTrackCreateAudioTrack;
    }

    private native void nativeEnable(long j, boolean z);

    private native boolean nativeIsEnabled(long j);

    private native void nativeRelease(long j);

    public synchronized void enable(boolean z) {
        try {
            if (isReleased()) {
                logger.e("Cannot enable a local audio track that has been removed");
            } else {
                nativeEnable(this.nativeLocalAudioTrackHandle, z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.twilio.voice.AudioTrack, com.twilio.voice.Track
    public String getName() {
        return super.getName();
    }

    public synchronized long getNativeHandle() {
        return this.nativeLocalAudioTrackHandle;
    }

    public String getTrackId() {
        return this.trackId;
    }

    @Override // com.twilio.voice.AudioTrack, com.twilio.voice.Track
    public synchronized boolean isEnabled() {
        if (isReleased()) {
            logger.w(lTGEJfVytU.AMNOGQqg);
            return false;
        }
        return nativeIsEnabled(this.nativeLocalAudioTrackHandle);
    }

    public boolean isReleased() {
        return this.nativeLocalAudioTrackHandle == 0;
    }

    public synchronized void release() {
        if (!isReleased()) {
            nativeRelease(this.nativeLocalAudioTrackHandle);
            this.nativeLocalAudioTrackHandle = 0L;
            this.mediaFactory.release(this);
        }
    }

    public static LocalAudioTrack create(Context context, boolean z, AudioOptions audioOptions) {
        return create(context, z, audioOptions, null);
    }

    public static LocalAudioTrack create(Context context, boolean z, String str) {
        return create(context, z, new AudioOptions.Builder().build(), str);
    }

    public static LocalAudioTrack create(Context context, boolean z) {
        return create(context, z, new AudioOptions.Builder().build(), null);
    }
}
