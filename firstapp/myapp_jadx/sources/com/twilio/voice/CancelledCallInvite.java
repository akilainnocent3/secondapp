package com.twilio.voice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class CancelledCallInvite implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.twilio.voice.CancelledCallInvite.1
        @Override // android.os.Parcelable.Creator
        public CancelledCallInvite createFromParcel(Parcel parcel) {
            return new CancelledCallInvite(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public CancelledCallInvite[] newArray(int i) {
            return new CancelledCallInvite[i];
        }
    };
    private final String callSid;
    final Map<String, String> cancelledCallInviteMessage;
    final Map<String, String> customParameters;
    private final String from;
    private final String to;

    private CancelledCallInvite(Parcel parcel) {
        String[] strArr = new String[3];
        parcel.readStringArray(strArr);
        this.from = strArr[0];
        this.to = strArr[1];
        this.callSid = strArr[2];
        int i = parcel.readInt();
        this.cancelledCallInviteMessage = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.cancelledCallInviteMessage.put(parcel.readString(), parcel.readString());
        }
        int i3 = parcel.readInt();
        this.customParameters = new HashMap(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.customParameters.put(parcel.readString(), parcel.readString());
        }
    }

    public static CancelledCallInvite create(Map<String, String> map) {
        return new CancelledCallInvite(map);
    }

    public static boolean isValid(Map<String, String> map) {
        String str = map.get(VoiceConstants.VOICE_TWI_MESSAGE_TYPE);
        return (str == null || !str.equals(VoiceConstants.MESSAGE_TYPE_CANCEL) || map.get(VoiceConstants.CALL_SID) == null || map.get(VoiceConstants.TO) == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CancelledCallInvite) {
            CancelledCallInvite cancelledCallInvite = (CancelledCallInvite) obj;
            if (getFrom().equals(cancelledCallInvite.getFrom()) && getTo().equals(cancelledCallInvite.getTo()) && getCallSid().equals(cancelledCallInvite.getCallSid())) {
                return true;
            }
        }
        return false;
    }

    public String getCallSid() {
        return this.callSid;
    }

    public Map<String, String> getCustomParameters() {
        return this.customParameters;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{this.from, this.to, this.callSid});
        parcel.writeInt(this.cancelledCallInviteMessage.size());
        for (Map.Entry<String, String> entry : this.cancelledCallInviteMessage.entrySet()) {
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

    private CancelledCallInvite(Map<String, String> map) {
        this.from = map.get(VoiceConstants.FROM);
        this.to = map.get(VoiceConstants.TO);
        this.callSid = map.get(VoiceConstants.CALL_SID);
        HashMap map2 = new HashMap();
        this.customParameters = map2;
        String str = map.get(VoiceConstants.CUSTOM_PARAMS);
        if (str != null) {
            Utils.parseCustomParams(str, map2);
        }
        this.cancelledCallInviteMessage = map;
    }

    public /* synthetic */ CancelledCallInvite(Parcel parcel, int i) {
        this(parcel);
    }
}
