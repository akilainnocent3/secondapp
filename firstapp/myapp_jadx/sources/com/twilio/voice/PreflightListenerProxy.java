package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import defpackage.z9l;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class PreflightListenerProxy {
    private static final Logger logger = Logger.getLogger(PreflightListenerProxy.class);
    private final Handler handler;
    private MediaFactory mediaFactory;
    private final long nativeHandle = nativeConstruct();
    private final PreflightTest.Listener observer;
    private final PreflightTest preflightTest;

    public PreflightListenerProxy(Context context, PreflightTest preflightTest, PreflightTest.Listener listener, Handler handler) {
        this.preflightTest = preflightTest;
        this.mediaFactory = MediaFactory.instance(this, context);
        this.observer = listener;
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightCompleted$1(JSONObject jSONObject) {
        this.observer.onPreflightCompleted(this.preflightTest, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightCompleted$2() {
        this.observer.onPreflightSample(this.preflightTest, new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightConnected$0() {
        this.observer.onPreflightConnected(this.preflightTest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightFailed$3(CallException callException) {
        this.observer.onPreflightFailed(this.preflightTest, callException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightSample$5(JSONObject jSONObject) {
        this.observer.onPreflightSample(this.preflightTest, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightSample$6() {
        this.observer.onPreflightSample(this.preflightTest, new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preflightWarning$4(Call.CallQualityWarning[] callQualityWarningArr, Call.CallQualityWarning[] callQualityWarningArr2) {
        PreflightTest.Listener listener = this.observer;
        PreflightTest preflightTest = this.preflightTest;
        HashSet hashSet = new HashSet(callQualityWarningArr.length);
        for (Call.CallQualityWarning callQualityWarning : callQualityWarningArr) {
            Objects.requireNonNull(callQualityWarning);
            if (!hashSet.add(callQualityWarning)) {
                z9l.a(callQualityWarning, "duplicate element: ");
                return;
            }
        }
        Set<Call.CallQualityWarning> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet(callQualityWarningArr2.length);
        for (Call.CallQualityWarning callQualityWarning2 : callQualityWarningArr2) {
            Objects.requireNonNull(callQualityWarning2);
            if (!hashSet2.add(callQualityWarning2)) {
                z9l.a(callQualityWarning2, "duplicate element: ");
                return;
            }
        }
        listener.onPreflightWarning(preflightTest, setUnmodifiableSet, Collections.unmodifiableSet(hashSet2));
    }

    private native long nativeConstruct();

    private native void nativeRelease(long j);

    private void releaseMediaFactory() {
        MediaFactory mediaFactory = this.mediaFactory;
        if (mediaFactory != null) {
            mediaFactory.release(this);
            this.mediaFactory = null;
        }
    }

    public void finalize() throws Throwable {
        releaseMediaFactory();
        nativeRelease(this.nativeHandle);
        super.finalize();
    }

    public MediaFactory getMediaFactory() {
        return this.mediaFactory;
    }

    public void preflightCompleted(String str) {
        releaseMediaFactory();
        try {
            final JSONObject jSONObject = new JSONObject(str);
            this.handler.post(new Runnable() { // from class: com.twilio.voice.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$preflightCompleted$1(jSONObject);
                }
            });
        } catch (JSONException e) {
            logger.e(e + " " + e.getMessage());
            this.handler.post(new Runnable() { // from class: com.twilio.voice.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$preflightCompleted$2();
                }
            });
        }
    }

    public void preflightConnected() {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.k0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$preflightConnected$0();
            }
        });
    }

    public void preflightFailed(final CallException callException) {
        releaseMediaFactory();
        this.handler.post(new Runnable() { // from class: com.twilio.voice.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$preflightFailed$3(callException);
            }
        });
    }

    public void preflightSample(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            this.handler.post(new Runnable() { // from class: com.twilio.voice.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$preflightSample$5(jSONObject);
                }
            });
        } catch (JSONException e) {
            logger.e(e + " " + e.getMessage());
            this.handler.post(new Runnable() { // from class: com.twilio.voice.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$preflightSample$6();
                }
            });
        }
    }

    public void preflightWarning(final Call.CallQualityWarning[] callQualityWarningArr, final Call.CallQualityWarning[] callQualityWarningArr2) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$preflightWarning$4(callQualityWarningArr, callQualityWarningArr2);
            }
        });
    }
}
