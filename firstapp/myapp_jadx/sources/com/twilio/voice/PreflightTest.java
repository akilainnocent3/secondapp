package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class PreflightTest {
    private static final Logger logger = Logger.getLogger(PreflightTest.class);
    private final long nativeHandle;
    private final PreflightListenerProxy proxyObserver;
    final String tempCallSid;
    private final ThreadUtils.ThreadChecker threadChecker;

    public interface Listener {
        void onPreflightCompleted(PreflightTest preflightTest, JSONObject jSONObject);

        void onPreflightConnected(PreflightTest preflightTest);

        void onPreflightFailed(PreflightTest preflightTest, CallException callException);

        void onPreflightSample(PreflightTest preflightTest, JSONObject jSONObject);

        void onPreflightWarning(PreflightTest preflightTest, Set<Call.CallQualityWarning> set, Set<Call.CallQualityWarning> set2);
    }

    public enum State {
        CONNECTING,
        CONNECTED,
        COMPLETED,
        FAILED
    }

    public PreflightTest(Context context, PreflightOptions preflightOptions, Listener listener) {
        String str = "TSID" + UUID.randomUUID();
        this.tempCallSid = str;
        Handler handlerCreateHandler = Utils.createHandler();
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(preflightOptions, "preflightOptions must not be null");
        Preconditions.checkNotNull(listener, "PreflightTest.Listener must not be null");
        this.threadChecker = new ThreadUtils.ThreadChecker(Thread.currentThread());
        PreflightListenerProxy preflightListenerProxy = new PreflightListenerProxy(context.getApplicationContext(), this, listener, handlerCreateHandler);
        this.proxyObserver = preflightListenerProxy;
        EventListenerProxy eventListenerProxy = new EventListenerProxy(str, true, preflightOptions.getEventListener(), handlerCreateHandler, new EventPublisher(context, Constants.getClientSdkProductName(), preflightOptions.getAccessToken()));
        eventListenerProxy.publishLoggerEvent();
        this.nativeHandle = nativeConstruct(preflightOptions.getAccessToken(), preflightListenerProxy.getMediaFactory().getNativeMediaFactoryHandle(), preflightOptions.getIceOptions(), preflightOptions.getAudioCodecsArray(), preflightListenerProxy, eventListenerProxy);
    }

    private static native long nativeConstruct(String str, long j, IceOptions iceOptions, AudioCodec[] audioCodecArr, PreflightListenerProxy preflightListenerProxy, EventListenerProxy eventListenerProxy);

    private static native String nativeGetCallSid(long j);

    private static native long nativeGetEndTime(long j);

    private static native String nativeGetLatestSample(long j);

    private static native String nativeGetReport(long j);

    private static native long nativeGetStartTime(long j);

    private static native int nativeGetState(long j);

    private static native void nativeRelease(long j);

    private static native void nativeStop(long j);

    public void finalize() throws Throwable {
        nativeRelease(this.nativeHandle);
        super.finalize();
    }

    public String getCallSid() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetCallSid(this.nativeHandle);
    }

    public long getEndTime() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetEndTime(this.nativeHandle);
    }

    public JSONObject getLatestSample() {
        this.threadChecker.checkIsOnValidThread();
        try {
            return new JSONObject(nativeGetLatestSample(this.nativeHandle));
        } catch (JSONException e) {
            logger.e(e + " " + e.getMessage());
            return new JSONObject();
        }
    }

    public JSONObject getReport() {
        this.threadChecker.checkIsOnValidThread();
        try {
            return new JSONObject(nativeGetReport(this.nativeHandle));
        } catch (JSONException e) {
            logger.e(e + " " + e.getMessage());
            return new JSONObject();
        }
    }

    public long getStartTime() {
        this.threadChecker.checkIsOnValidThread();
        return nativeGetStartTime(this.nativeHandle);
    }

    public State getState() {
        this.threadChecker.checkIsOnValidThread();
        return State.values()[nativeGetState(this.nativeHandle)];
    }

    public void stop() {
        this.threadChecker.checkIsOnValidThread();
        nativeStop(this.nativeHandle);
    }
}
