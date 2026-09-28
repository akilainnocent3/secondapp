package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import defpackage.bmy;
import defpackage.tug;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class EventPublisher {
    private String accessToken;
    private Context context;
    List<Integer> errorCodeList;
    private EventPublisherStatus eventPublisherStatus;
    private String homeRegion;
    private Map<EventPublisherListener, Handler> listenerMap;
    private String publisherName;
    private EventPublisherEventListener publisherPublishEventListener;
    int result;
    String twilioProdSdkEventGatewayURL;
    String twilioProdSdkMetricsGatewayURL;
    private static final Logger logger = Logger.getLogger(EventPublisher.class);
    private static final String TAG = "EventPublisher";

    public interface EventPublisherEventListener {
        void onEventPublished(Constants.SeverityLevel severityLevel, String str, String str2);

        void onMetricEventPublished(MetricEvent metricEvent);
    }

    public interface EventPublisherListener {
        void onError(VoiceException voiceException);
    }

    public class EventPublisherStatus {
        private String explanation;
        private volatile boolean invalidatePublishing = false;
        private int errorCode = 0;
        private String responseMessage = "";

        public EventPublisherStatus() {
        }

        public int getErrorCode() {
            return this.errorCode;
        }

        public String getExplanation() {
            return this.explanation;
        }

        public String getResponseMessage() {
            return this.responseMessage;
        }

        public void invalidatePublishing(boolean z) {
            this.invalidatePublishing = z;
        }

        public boolean isPublishingInvalidated() {
            return this.invalidatePublishing;
        }

        public void setErrorDetails(int i, String str, String str2) {
            this.errorCode = i;
            this.responseMessage = str;
            this.explanation = str2;
        }
    }

    public EventPublisher(Context context, String str, String str2) {
        this.listenerMap = new HashMap();
        this.result = 0;
        this.eventPublisherStatus = new EventPublisherStatus();
        this.errorCodeList = Arrays.asList(403);
        if (str2 == null) {
            bmy.a("accessToken must not be null.");
            throw null;
        }
        if (str == null) {
            bmy.a("publisherName must not be null.");
            throw null;
        }
        this.context = context;
        this.accessToken = str2;
        this.publisherName = str;
        this.twilioProdSdkMetricsGatewayURL = Constants.getKeyKibanaMetricsHostUrl();
        this.twilioProdSdkEventGatewayURL = Constants.getKeyKibanaEventGatewayHostUrl();
        try {
            this.homeRegion = new AccessTokenParser(str2).getHomeRegion();
        } catch (AccessTokenParseException e) {
            e.printStackTrace();
        }
        String str3 = this.homeRegion;
        if (str3 != null) {
            updateServiceHostUrlsWithHomeRegion(str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public /* synthetic */ Object lambda$publish$0(String str, String str2) throws Throwable {
        HttpsURLConnection httpsURLConnectionCreate;
        ?? r2 = 0;
        if (this.eventPublisherStatus.isPublishingInvalidated()) {
            notifyListeners(this.result, this.eventPublisherStatus.getResponseMessage(), this.eventPublisherStatus.getExplanation());
        } else {
            Logger logger2 = logger;
            logger2.d("Start publishing events to : " + str + "\n" + str2);
            try {
                try {
                    httpsURLConnectionCreate = VoiceURLConnection.create(this.accessToken, str, VoiceURLConnection.METHOD_TYPE_POST);
                    try {
                        httpsURLConnectionCreate.setRequestProperty("Content-Encoding", "gzip");
                        httpsURLConnectionCreate.setRequestProperty("Accept-Encoding", "gzip");
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpsURLConnectionCreate.getOutputStream());
                        gZIPOutputStream.write(str2.getBytes());
                        gZIPOutputStream.close();
                        this.result = httpsURLConnectionCreate.getResponseCode();
                        String responseMessage = httpsURLConnectionCreate.getResponseMessage();
                        int i = this.result;
                        if (i == 200) {
                            logger2.d("Response: " + this.result + " - " + responseMessage);
                        } else {
                            if (this.errorCodeList.contains(Integer.valueOf(i))) {
                                logger2.e(String.format(Locale.getDefault(), "Invalidating further publishing : %d - %s", Integer.valueOf(this.result), responseMessage));
                                this.eventPublisherStatus.invalidatePublishing(true);
                            }
                            char[] cArr = new char[1024];
                            StringBuilder sb = new StringBuilder();
                            InputStreamReader inputStreamReader = new InputStreamReader(new GZIPInputStream(httpsURLConnectionCreate.getErrorStream()), StandardCharsets.UTF_8);
                            while (true) {
                                int i2 = inputStreamReader.read(cArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                sb.append(cArr, 0, i2);
                            }
                            String str3 = String.format(Locale.getDefault(), "%d-%s-%s", Integer.valueOf(this.result), responseMessage, sb.toString());
                            logger.d("Response: " + str3);
                            this.eventPublisherStatus.setErrorDetails(this.result, responseMessage, str3);
                            notifyListeners(this.result, responseMessage, str3);
                        }
                    } catch (Exception e) {
                        e = e;
                        logger.e(e.toString());
                    }
                } catch (Throwable th) {
                    th = th;
                    r2 = str;
                    VoiceURLConnection.release(r2);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                httpsURLConnectionCreate = null;
            } catch (Throwable th2) {
                th = th2;
                VoiceURLConnection.release(r2);
                throw th;
            }
            VoiceURLConnection.release(httpsURLConnectionCreate);
        }
        return null;
    }

    private void notifyListeners(int i, String str, String str2) {
        EventPublisher eventPublisher;
        final int i2;
        final String str3;
        final String str4;
        for (Map.Entry<EventPublisherListener, Handler> entry : this.listenerMap.entrySet()) {
            final EventPublisherListener key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                eventPublisher = this;
                i2 = i;
                str3 = str;
                str4 = str2;
                value.post(new Runnable() { // from class: com.twilio.voice.EventPublisher.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EventPublisherListener eventPublisherListener = key;
                        if (eventPublisherListener != null) {
                            eventPublisherListener.onError(new VoiceException(i2, str3, str4) { // from class: com.twilio.voice.EventPublisher.1.1
                            });
                        }
                    }
                });
            } else {
                eventPublisher = this;
                i2 = i;
                str3 = str;
                str4 = str2;
            }
            this = eventPublisher;
            i = i2;
            str = str3;
            str2 = str4;
        }
    }

    private void updateServiceHostUrlsWithHomeRegion(String str) {
        this.twilioProdSdkMetricsGatewayURL = tug.a("https://eventgw.", str, ".twilio.com/v4/EndpointMetrics");
        this.twilioProdSdkEventGatewayURL = tug.a("https://eventgw.", str, ".twilio.com/v4/EndpointEvents");
    }

    public void addEventPublisherEventListener(EventPublisherEventListener eventPublisherEventListener) {
        this.publisherPublishEventListener = eventPublisherEventListener;
    }

    public void addListener(EventPublisherListener eventPublisherListener) {
        this.listenerMap.put(eventPublisherListener, Utils.createHandler());
    }

    public Event createEvent(Constants.SeverityLevel severityLevel, String str, String str2, JSONObject jSONObject) {
        return new Event.Builder().productName(this.publisherName).eventName(str2).groupName(str).level(severityLevel).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).payLoad(jSONObject).build();
    }

    public MetricEvent createMetricEvent(String str, String str2, JSONArray jSONArray) {
        return new MetricEvent.Builder().productName(this.publisherName).eventName(str2).groupName(str).level(Constants.SeverityLevel.INFO).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).payLoad(jSONArray).build();
    }

    public void publish(Constants.SeverityLevel severityLevel, String str, String str2, Event event) {
        if (this.publisherPublishEventListener != null && !this.eventPublisherStatus.isPublishingInvalidated()) {
            this.publisherPublishEventListener.onEventPublished(severityLevel, str, str2);
        }
        publish(event.toJSONObject(this.context).toString(), this.twilioProdSdkEventGatewayURL);
    }

    public void publishMetrics(MetricEvent metricEvent) {
        if (metricEvent != null) {
            publish(metricEvent.toJSONObject(this.context).toString(), this.twilioProdSdkMetricsGatewayURL);
            EventPublisherEventListener eventPublisherEventListener = this.publisherPublishEventListener;
            if (eventPublisherEventListener != null) {
                eventPublisherEventListener.onMetricEventPublished(metricEvent);
            }
        }
    }

    public void removeListener(EventPublisherListener eventPublisherListener) {
        this.listenerMap.remove(eventPublisherListener);
    }

    private void publish(final String str, final String str2) {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        executorServiceNewCachedThreadPool.submit(new Callable() { // from class: com.twilio.voice.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.lambda$publish$0(str2, str);
            }
        });
        executorServiceNewCachedThreadPool.shutdown();
    }

    public EventPublisher(String str, String str2) {
        this(null, str, str2);
    }
}
