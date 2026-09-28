package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class CallMessage {
    private final String content;
    private final String contentType;
    private final String messageType;
    private String voiceEventSid;

    public static class Builder {
        private String content;
        private String contentType;
        private String messageType;

        public Builder(String str) {
            Preconditions.checkNotNull(str, "messageType must not be null");
            Preconditions.checkArgument(str.length() > 0, "messageType must not be empty");
            this.messageType = str;
            this.contentType = Constants.APP_JSON_PAYLOAD_TYPE;
            this.content = "";
        }

        public CallMessage build() {
            return new CallMessage(this.messageType, this.contentType, this.content);
        }

        public Builder content(String str) {
            Preconditions.checkNotNull(str, "content must not be null");
            this.content = str;
            return this;
        }

        public Builder contentType(String str) {
            Preconditions.checkNotNull(str, "contentType must not be null");
            this.contentType = str;
            return this;
        }
    }

    private CallMessage(String str, String str2, String str3, String str4) {
        this.messageType = str;
        this.contentType = str2;
        this.content = str3;
        this.voiceEventSid = str4;
    }

    public String getContent() {
        return this.content;
    }

    public String getMessageContentType() {
        return this.contentType;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getVoiceEventSID() {
        return this.voiceEventSid;
    }

    public /* synthetic */ CallMessage(String str, String str2, String str3) {
        this(str, str2, str3, "");
    }
}
