package com.twilio.voice;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.twilio.voice.CallInvite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class CallInvite implements Parcelable {
    private final String bridgeToken;
    final Map<String, String> callInviteMessage;
    private final Call.Listener callListenerProxy;
    private final String callSid;
    private CallerInfo callerInfo;
    final Map<String, String> customParameters;
    Call.EventListener eventListenerProxy;
    private final String from;
    private final String messageSid;
    private final String stirStatus;
    private final String to;
    private static final Logger logger = Logger.getLogger(InternalCall.class);
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.twilio.voice.CallInvite.3
        @Override // android.os.Parcelable.Creator
        public CallInvite createFromParcel(Parcel parcel) {
            return new CallInvite(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public CallInvite[] newArray(int i) {
            return new CallInvite[i];
        }
    };

    private CallInvite(Parcel parcel) {
        this.callListenerProxy = new Call.Listener() { // from class: com.twilio.voice.CallInvite.1
            @Override // com.twilio.voice.Call.Listener
            public void onCallQualityWarningsChanged(Call call, Set<Call.CallQualityWarning> set, Set<Call.CallQualityWarning> set2) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnectFailure(Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnected(Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onDisconnected(Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnected(Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnecting(Call call, CallException callException) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onRinging(Call call) {
            }
        };
        this.eventListenerProxy = new Call.EventListener() { // from class: com.twilio.voice.CallInvite.2
            @Override // com.twilio.voice.Call.EventListener
            public void onEvent(Map<String, Pair<String, Class>> map) {
            }

            @Override // com.twilio.voice.Call.EventListener
            public void onMetric(Map<String, Pair<String, Class>> map) {
            }
        };
        String[] strArr = new String[6];
        parcel.readStringArray(strArr);
        this.from = strArr[0];
        this.to = strArr[1];
        this.callSid = strArr[2];
        this.bridgeToken = strArr[3];
        this.messageSid = strArr[4];
        String str = strArr[5];
        this.stirStatus = str;
        this.callerInfo = new CallerInfo(str);
        int i = parcel.readInt();
        this.callInviteMessage = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.callInviteMessage.put(parcel.readString(), parcel.readString());
        }
        int i3 = parcel.readInt();
        this.customParameters = new HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.customParameters.put(parcel.readString(), parcel.readString());
        }
    }

    public static CallInvite create(Map<String, String> map) {
        return new CallInvite(map);
    }

    public static boolean isValid(Context context, Map<String, String> map) throws Throwable {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(map, "data must not be null");
        Pair<String[], String[]> pairMapToArrays = Utils.mapToArrays(map);
        Voice.loadLibrary(context);
        return nativeIsValid((String[]) pairMapToArrays.first, (String[]) pairMapToArrays.second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$accept$0(Call call, Call.Listener listener) {
        logger.d("Attempted to accept CallInvite that was previously accepted,rejected, or cancelled.");
        call.state = Call.State.DISCONNECTED;
        listener.onConnectFailure(call, CallException.CallCancelledException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reject$1(Call call, Call.Listener listener) {
        logger.d("Attempted to reject CallInvite that was previously accepted,rejected, or cancelled.");
        call.state = Call.State.DISCONNECTED;
        listener.onConnectFailure(call, CallException.CallCancelledException);
    }

    private static native boolean nativeIsValid(String[] strArr, String[] strArr2);

    public synchronized Call accept(Context context, AcceptOptions acceptOptions, final Call.Listener listener, Call.EventListener eventListener) {
        final Call call;
        try {
            Preconditions.checkNotNull(context, "context must not be null");
            Preconditions.checkNotNull(acceptOptions, "acceptOptions must not be null");
            Preconditions.checkNotNull(listener, "listener must not be null");
            if (!Utils.isAudioPermissionGranted(context)) {
                throw new SecurityException(oLsIjJCWb.gcKDtLBCxWiKm);
            }
            call = new Call(context.getApplicationContext(), this, listener);
            CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
            if (callInviteProxy != null) {
                callInviteProxy.setTempCallSid(call.tempCallSid);
                AcceptOptions.Builder builder = new AcceptOptions.Builder(this, false);
                if (acceptOptions.getIceOptions() != null) {
                    builder.iceOptions(acceptOptions.getIceOptions());
                }
                if (acceptOptions.getPreferredAudioCodecs() != null) {
                    builder.preferAudioCodecs(acceptOptions.getPreferredAudioCodecs());
                }
                builder.enableDscp(acceptOptions.enableDscp);
                builder.enableIceGatheringOnAnyAddressPorts(acceptOptions.enableIceGatheringOnAnyAddressPorts);
                builder.audioTracks(Collections.singletonList(LocalAudioTrack.create(context, true, acceptOptions.getAudioOptions())));
                builder.callMessageListener(acceptOptions.getCallMessageListener());
                builder.audioOptions(acceptOptions.getAudioOptions());
                AcceptOptions acceptOptionsBuild = builder.build();
                callInviteProxy.setCall(call);
                callInviteProxy.setEventListener(eventListener);
                call.accept(acceptOptionsBuild, callInviteProxy.nativeCallInviteProxy);
                callInviteProxy.release(this.callSid);
            } else {
                Utils.createHandler().post(new Runnable() { // from class: yu5
                    @Override // java.lang.Runnable
                    public final void run() {
                        CallInvite.lambda$accept$0(call, listener);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return call;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CallInvite) {
            CallInvite callInvite = (CallInvite) obj;
            if (getFrom().equals(callInvite.getFrom()) && getTo().equals(callInvite.getTo()) && getCallSid().equals(callInvite.getCallSid())) {
                return true;
            }
        }
        return false;
    }

    public String getBridgeToken() {
        return this.bridgeToken;
    }

    public String getCallSid() {
        return this.callSid;
    }

    public CallerInfo getCallerInfo() {
        return this.callerInfo;
    }

    public Map<String, String> getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    public String getMessageSid() {
        return this.messageSid;
    }

    public String getTo() {
        return this.to;
    }

    public void reject(Context context, final Call.Listener listener, Call.EventListener eventListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(context, "listener must not be null");
        Preconditions.checkNotNull(context, "eventListener must not be null");
        final Call call = new Call(context.getApplicationContext(), this, listener);
        CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
        if (callInviteProxy == null) {
            Utils.createHandler().post(new Runnable() { // from class: zu5
                @Override // java.lang.Runnable
                public final void run() {
                    CallInvite.lambda$reject$1(call, listener);
                }
            });
            return;
        }
        AcceptOptions acceptOptionsBuild = new AcceptOptions.Builder(this, true).build();
        callInviteProxy.setEventListener(eventListener);
        call.reject(acceptOptionsBuild, callInviteProxy);
        callInviteProxy.release(this.callSid);
    }

    public String sendMessage(CallMessage callMessage) {
        CallInviteProxy callInviteProxy = Voice.callInviteProxyMap.get(this.callSid);
        if (callInviteProxy != null) {
            return callInviteProxy.sendMessage(callMessage);
        }
        logger.d("Attempted to accept CallInvite that was previously accepted,rejected, or cancelled.");
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{this.from, this.to, this.callSid, this.bridgeToken, this.messageSid, this.stirStatus});
        parcel.writeInt(this.callInviteMessage.size());
        for (Map.Entry<String, String> entry : this.callInviteMessage.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Map<String, String> map = this.customParameters;
        if (map != null) {
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry2 : this.customParameters.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
    }

    public static boolean isValid(Context context, Bundle bundle) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        return isValid(context, Utils.bundleToMap(bundle));
    }

    public synchronized void reject(Context context) {
        reject(context, this.callListenerProxy, this.eventListenerProxy);
    }

    private CallInvite(Map<String, String> map) {
        this.callListenerProxy = new Call.Listener() { // from class: com.twilio.voice.CallInvite.1
            @Override // com.twilio.voice.Call.Listener
            public void onCallQualityWarningsChanged(Call call, Set<Call.CallQualityWarning> set, Set<Call.CallQualityWarning> set2) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnectFailure(Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onConnected(Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onDisconnected(Call call, CallException callException) {
                call.release();
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnected(Call call) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onReconnecting(Call call, CallException callException) {
            }

            @Override // com.twilio.voice.Call.Listener
            public void onRinging(Call call) {
            }
        };
        this.eventListenerProxy = new Call.EventListener() { // from class: com.twilio.voice.CallInvite.2
            @Override // com.twilio.voice.Call.EventListener
            public void onEvent(Map<String, Pair<String, Class>> map2) {
            }

            @Override // com.twilio.voice.Call.EventListener
            public void onMetric(Map<String, Pair<String, Class>> map2) {
            }
        };
        this.from = map.get(VoiceConstants.FROM);
        this.to = map.get(TEFcJcMqR.nth);
        this.callSid = map.get(VoiceConstants.CALL_SID);
        this.bridgeToken = map.get(VoiceConstants.BRIDGE_TOKEN);
        this.messageSid = map.get(VoiceConstants.MESSAGE_SID);
        String str = map.get(VoiceConstants.STIR_STATUS);
        this.stirStatus = str;
        this.callerInfo = new CallerInfo(str);
        HashMap map2 = new HashMap();
        this.customParameters = map2;
        String str2 = map.get(VoiceConstants.CUSTOM_PARAMS);
        if (str2 != null) {
            Utils.parseCustomParams(str2, map2);
        }
        this.callInviteMessage = map;
    }

    public /* synthetic */ CallInvite(Parcel parcel, int i) {
        this(parcel);
    }

    public synchronized Call accept(Context context, Call.Listener listener) {
        return accept(context, new AcceptOptions.Builder().build(), listener);
    }

    public synchronized Call accept(Context context, AcceptOptions acceptOptions, Call.Listener listener) {
        return accept(context, acceptOptions, listener, this.eventListenerProxy);
    }
}
