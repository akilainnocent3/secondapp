package com.twilio.voice;

import android.content.Context;
import defpackage.bmy;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class MetricEvent extends EventMetadata {
    private JSONArray payload;

    public static class Builder {
        private String callSid;
        private String eventName;
        private String groupName;
        private Constants.SeverityLevel level;
        private JSONArray payload;
        private String payloadType;
        private String productName;

        public MetricEvent build() {
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
                return new MetricEvent(this, 0);
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

        public Builder payLoad(JSONArray jSONArray) {
            this.payload = jSONArray;
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

    private MetricEvent(Builder builder) {
        this.productName = builder.productName;
        this.level = builder.level;
        this.groupName = builder.groupName;
        this.eventName = builder.eventName;
        this.callSid = builder.callSid;
        this.payloadType = builder.payloadType;
        this.payload = builder.payload;
    }

    public void addStatsToPayload(JSONObject jSONObject) {
        JSONArray jSONArray = this.payload;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            this.payload = jSONArray;
        }
        jSONArray.put(jSONObject);
    }

    public JSONArray getPayload() {
        return this.payload;
    }

    public void setPayload(JSONArray jSONArray) {
        this.payload = jSONArray;
    }

    public JSONObject toJSONObject(Context context) throws JSONException {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        this.timeStamp = simpleDateFormat.format(new Date());
        JSONObject jSONObjectJsonEnvelopePreparation = jsonEnvelopePreparation(this.productName, "metrics-sample", EventGroupType.CALL_QUALITY_STATS_GROUP);
        jSONObjectJsonEnvelopePreparation.put(PublisherMetadata.PUBLISHER_META_DATA, jsonPublisherMetadataPreparation(context));
        jSONObjectJsonEnvelopePreparation.put(EventKeys.PAYLOAD, this.payload);
        return jSONObjectJsonEnvelopePreparation;
    }

    public /* synthetic */ MetricEvent(Builder builder, int i) {
        this(builder);
    }
}
