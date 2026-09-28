package com.twilio.voice;

import android.content.Context;
import defpackage.bmy;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class Event extends EventMetadata {
    private JSONObject payload;

    public static class Builder {
        private String eventName;
        private String groupName;
        private Constants.SeverityLevel level;
        private JSONObject payload;
        private String payloadType;
        private String productName;
        private String timeStamp;
        private long timestampMS;

        public Builder() {
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            Date date = new Date();
            this.timeStamp = simpleDateFormat.format(date);
            this.timestampMS = date.getTime();
        }

        public Event build() {
            if (this.productName == null) {
                bmy.a("productName must not be null");
                return null;
            }
            if (this.level == null) {
                bmy.a("level must not be null");
                return null;
            }
            if (this.groupName == null) {
                bmy.a("groupName must not be null");
                return null;
            }
            if (this.eventName == null) {
                bmy.a("eventName must not be null");
                return null;
            }
            if (this.payloadType != null) {
                return new Event(this, 0);
            }
            bmy.a("payloadType must not be null");
            return null;
        }

        public Builder eventName(String str) {
            this.eventName = str;
            return this;
        }

        public Builder groupName(String str) {
            this.groupName = str;
            return this;
        }

        public Builder level(Constants.SeverityLevel severityLevel) {
            this.level = severityLevel;
            return this;
        }

        public Builder payLoad(JSONObject jSONObject) {
            this.payload = jSONObject;
            return this;
        }

        public Builder payLoadType(String str) {
            this.payloadType = str;
            return this;
        }

        public Builder productName(String str) {
            this.productName = str;
            return this;
        }
    }

    private Event(Builder builder) {
        this.productName = builder.productName;
        this.level = builder.level;
        this.groupName = builder.groupName;
        this.eventName = builder.eventName;
        this.payload = builder.payload;
        this.payloadType = builder.payloadType;
        this.timeStamp = builder.timeStamp;
        this.timestampMS = builder.timestampMS;
    }

    public JSONObject getPayload() {
        return this.payload;
    }

    public JSONObject toJSONObject(Context context) throws JSONException {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        this.timeStamp = simpleDateFormat.format(new Date());
        JSONObject jSONObjectJsonEnvelopePreparation = jsonEnvelopePreparation(this.productName, this.eventName, this.groupName);
        jSONObjectJsonEnvelopePreparation.put(PublisherMetadata.PUBLISHER_META_DATA, jsonPublisherMetadataPreparation(context));
        jSONObjectJsonEnvelopePreparation.put(EventKeys.PAYLOAD_TYPE, this.payloadType);
        jSONObjectJsonEnvelopePreparation.put(EventKeys.PAYLOAD, this.payload);
        return jSONObjectJsonEnvelopePreparation;
    }

    public /* synthetic */ Event(Builder builder, int i) {
        this(builder);
    }
}
