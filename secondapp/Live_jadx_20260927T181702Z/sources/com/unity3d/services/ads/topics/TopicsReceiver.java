package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oy.l;
import x8.d0;
import x8.j;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nTopicsReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicsReceiver.kt\ncom/unity3d/services/ads/topics/TopicsReceiver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1855#2,2:37\n*S KotlinDebug\n*F\n+ 1 TopicsReceiver.kt\ncom/unity3d/services/ads/topics/TopicsReceiver\n*L\n17#1:37,2\n*E\n"})
@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsReceiver implements OutcomeReceiver {

    @l
    private final IEventSender eventSender;

    public TopicsReceiver(@l IEventSender eventSender) {
        m0.p(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @l
    public final JSONObject formatTopic(@l Topic topic) throws JSONException {
        m0.p(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(d0.a(obj));
    }

    public void onError(@l Exception error) {
        m0.p(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(@l GetTopicsResponse result) {
        m0.p(result, "result");
        JSONArray jSONArray = new JSONArray();
        List topics = result.getTopics();
        m0.o(topics, "result.topics");
        Iterator it = topics.iterator();
        while (it.hasNext()) {
            Topic it2 = j.a(it.next());
            m0.o(it2, "it");
            jSONArray.put(formatTopic(it2));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String string = jSONArray.toString();
        m0.o(string, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, string);
    }
}
