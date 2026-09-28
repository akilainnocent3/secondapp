package com.twilio.voice;

import android.os.Handler;
import defpackage.vga;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
class HttpsRegistrar {
    static final String DEFAULT_REGISTRATION_FAILED_MESSAGE = "Registration failed";
    static final String DEFAULT_UNREGISTRATION_FAILED_MESSAGE = "Unregistration failed";
    static final String JSON_CODE_KEY = "code";
    static final String JSON_MESSAGE_KEY = "message";
    private static final String REGISTRATION_ID_LOCATION = "Location";

    private HttpsRegistrar() {
    }

    private static void handleException(final Boolean bool, final Exception exc, HttpsURLConnection httpsURLConnection, Handler handler, final RegistrarListener registrarListener) {
        final String str = bool.booleanValue() ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
        if (httpsURLConnection == null) {
            handler.post(new Runnable() { // from class: com.twilio.voice.w
                @Override // java.lang.Runnable
                public final void run() {
                    HttpsRegistrar.lambda$handleException$9(registrarListener, str, exc);
                }
            });
            return;
        }
        try {
            JSONObject jSONObjectProcessJSONError = processJSONError(httpsURLConnection.getErrorStream());
            final int i = jSONObjectProcessJSONError.getInt("code");
            final String string = jSONObjectProcessJSONError.getString("message");
            handler.post(new Runnable() { // from class: com.twilio.voice.u
                @Override // java.lang.Runnable
                public final void run() {
                    HttpsRegistrar.lambda$handleException$7(registrarListener, bool, i, string);
                }
            });
        } catch (Exception unused) {
            handler.post(new Runnable() { // from class: com.twilio.voice.v
                @Override // java.lang.Runnable
                public final void run() {
                    HttpsRegistrar.lambda$handleException$8(registrarListener, str, exc);
                }
            });
        }
    }

    private static RegistrationException handleHttpAuthErrorCode(boolean z, int i, String str) {
        String strA = vga.a(i, " : ", str);
        if (i != 20151 && i != 20157 && i != 20403 && i != 51007) {
            switch (i) {
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN /* 20101 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_HEADER /* 20102 */:
                case VoiceException.EXCEPTION_INVALID_ISSUER_SUBJECT /* 20103 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_EXPIRY /* 20104 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_NOT_VALID_YET /* 20105 */:
                case VoiceException.EXCEPTION_INVALID_ACCESS_TOKEN_GRANT /* 20106 */:
                case VoiceException.EXCEPTION_INVALID_SIGNATURE /* 20107 */:
                    break;
                default:
                    return !z ? new RegistrationException(i, DEFAULT_REGISTRATION_FAILED_MESSAGE, strA) : new RegistrationException(i, DEFAULT_UNREGISTRATION_FAILED_MESSAGE, strA);
            }
        }
        return new RegistrationException(i, str, strA);
    }

    public static RegistrationException handleHttpErrorCode(boolean z, int i, int i2, String str, String str2) {
        String str3 = z ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
        String str4 = String.valueOf(i2) + " : " + str;
        if (i == 400) {
            VoiceException voiceException = VoiceException.BadRequestException;
            return new RegistrationException(voiceException.getErrorCode(), voiceException.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException.getExplanation());
        }
        if (i == 401) {
            return handleHttpAuthErrorCode(z, i2, str);
        }
        if (i == 403) {
            VoiceException voiceException2 = VoiceException.ForbiddenException;
            return new RegistrationException(voiceException2.getErrorCode(), voiceException2.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException2.getExplanation());
        }
        if (i == 404) {
            VoiceException voiceException3 = VoiceException.NotFoundException;
            return new RegistrationException(voiceException3.getErrorCode(), voiceException3.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException3.getExplanation());
        }
        if (i == 408) {
            VoiceException voiceException4 = VoiceException.RequestTimeoutException;
            return new RegistrationException(voiceException4.getErrorCode(), voiceException4.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException4.getExplanation());
        }
        if (i == 409) {
            RegistrationException registrationException = RegistrationException.ConflictException;
            return new RegistrationException(registrationException.getErrorCode(), registrationException.getMessage(), str != null ? vga.a(i2, " : ", str) : registrationException.getExplanation());
        }
        if (i == 426) {
            RegistrationException registrationException2 = RegistrationException.UpgradeRequiredException;
            return new RegistrationException(registrationException2.getErrorCode(), registrationException2.getMessage(), str != null ? vga.a(i2, " : ", str) : registrationException2.getExplanation());
        }
        if (i == 429) {
            RegistrationException registrationException3 = RegistrationException.TooManyRequestException;
            return new RegistrationException(registrationException3.getErrorCode(), registrationException3.getMessage(), str != null ? vga.a(i2, " : ", str) : registrationException3.getExplanation());
        }
        if (i == 500) {
            VoiceException voiceException5 = VoiceException.InternalServerErrorException;
            return new RegistrationException(voiceException5.getErrorCode(), voiceException5.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException5.getExplanation());
        }
        switch (i) {
            case 502:
                VoiceException voiceException6 = VoiceException.BadGatewayException;
                return new RegistrationException(voiceException6.getErrorCode(), voiceException6.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException6.getExplanation());
            case 503:
                VoiceException voiceException7 = VoiceException.ServiceUnavailableException;
                return new RegistrationException(voiceException7.getErrorCode(), voiceException7.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException7.getExplanation());
            case 504:
                VoiceException voiceException8 = VoiceException.GatewayTimeoutException;
                return new RegistrationException(voiceException8.getErrorCode(), voiceException8.getMessage(), str != null ? vga.a(i2, " : ", str) : voiceException8.getExplanation());
            default:
                if (i2 == 0) {
                    str4 = String.valueOf(i) + " : " + str2;
                }
                return new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str3, str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleException$7(RegistrarListener registrarListener, Boolean bool, int i, String str) {
        registrarListener.onError(handleHttpAuthErrorCode(bool.booleanValue(), i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleException$8(RegistrarListener registrarListener, String str, Exception exc) {
        registrarListener.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str, exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleException$9(RegistrarListener registrarListener, String str, Exception exc) {
        registrarListener.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str, exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$1(RegistrarListener registrarListener, String str) {
        registrarListener.onError(new RegistrationException(RegistrationException.EXCEPTION_REGISTRATION_ERROR, str, "Registration Location is null"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$register$3(String str, String str2, String str3, String str4, boolean z, Handler handler, final RegistrarListener registrarListener) {
        String str5 = DEFAULT_REGISTRATION_FAILED_MESSAGE;
        try {
            try {
                HttpsURLConnection httpsURLConnectionCreate = VoiceURLConnection.create(str, str2, VoiceURLConnection.METHOD_TYPE_POST);
                httpsURLConnectionCreate.addRequestProperty("X-Twilio-Request-Id", str3);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnectionCreate.getOutputStream());
                outputStreamWriter.write(str4);
                outputStreamWriter.close();
                int responseCode = httpsURLConnectionCreate.getResponseCode();
                String responseMessage = httpsURLConnectionCreate.getResponseMessage();
                if (responseCode == 201) {
                    final String headerField = httpsURLConnectionCreate.getHeaderField(REGISTRATION_ID_LOCATION);
                    if (headerField != null) {
                        if (!z) {
                            publishRegistrationSuccessfulEvent(str, str3, EventGroupType.REGISTRATION_EVENT_GROUP);
                        }
                        handler.post(new Runnable() { // from class: com.twilio.voice.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                registrarListener.onSuccess(headerField);
                            }
                        });
                    } else {
                        final String str6 = z ? DEFAULT_UNREGISTRATION_FAILED_MESSAGE : DEFAULT_REGISTRATION_FAILED_MESSAGE;
                        publishError(z, str, str3, responseCode, responseMessage);
                        handler.post(new Runnable() { // from class: com.twilio.voice.z
                            @Override // java.lang.Runnable
                            public final void run() {
                                HttpsRegistrar.lambda$register$1(registrarListener, str6);
                            }
                        });
                    }
                } else {
                    JSONObject jSONObjectProcessJSONError = processJSONError(httpsURLConnectionCreate.getErrorStream());
                    final RegistrationException registrationExceptionHandleHttpErrorCode = handleHttpErrorCode(z, responseCode, jSONObjectProcessJSONError.getInt("code"), jSONObjectProcessJSONError.getString("message"), responseMessage);
                    publishError(z, str, str3, registrationExceptionHandleHttpErrorCode.getErrorCode(), registrationExceptionHandleHttpErrorCode.getMessage() + " : " + registrationExceptionHandleHttpErrorCode.getExplanation());
                    handler.post(new Runnable() { // from class: com.twilio.voice.a0
                        @Override // java.lang.Runnable
                        public final void run() {
                            registrarListener.onError(registrationExceptionHandleHttpErrorCode);
                        }
                    });
                }
                VoiceURLConnection.release(httpsURLConnectionCreate);
            } catch (Exception e) {
                handleException(Boolean.valueOf(z), e, null, handler, registrarListener);
                if (z) {
                    str5 = DEFAULT_UNREGISTRATION_FAILED_MESSAGE;
                }
                publishError(z, str, str3, RegistrationException.EXCEPTION_REGISTRATION_ERROR, str5 + " : " + e.getMessage());
                VoiceURLConnection.release(null);
            }
        } catch (Throwable th) {
            VoiceURLConnection.release(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unregister$6(String str, String str2, String str3, Handler handler, final RegistrarListener registrarListener) {
        try {
            try {
                HttpsURLConnection httpsURLConnectionCreate = VoiceURLConnection.create(str, str2, VoiceURLConnection.METHOD_TYPE_DELETE);
                httpsURLConnectionCreate.addRequestProperty("X-Twilio-Request-Id", str3);
                httpsURLConnectionCreate.connect();
                int responseCode = httpsURLConnectionCreate.getResponseCode();
                String responseMessage = httpsURLConnectionCreate.getResponseMessage();
                if (responseCode == 200 || responseCode == 204) {
                    publishRegistrationSuccessfulEvent(str, str3, "unregistration");
                    handler.post(new Runnable() { // from class: com.twilio.voice.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            registrarListener.onSuccess(null);
                        }
                    });
                } else {
                    JSONObject jSONObjectProcessJSONError = processJSONError(httpsURLConnectionCreate.getErrorStream());
                    final RegistrationException registrationExceptionHandleHttpErrorCode = handleHttpErrorCode(true, responseCode, jSONObjectProcessJSONError.getInt("code"), jSONObjectProcessJSONError.getString("message"), responseMessage);
                    publishRegistrationErrorEvent(str, str3, "unregistration-error", registrationExceptionHandleHttpErrorCode.getErrorCode(), registrationExceptionHandleHttpErrorCode.getMessage() + " : " + registrationExceptionHandleHttpErrorCode.getExplanation());
                    handler.post(new Runnable() { // from class: com.twilio.voice.c0
                        @Override // java.lang.Runnable
                        public final void run() {
                            registrarListener.onError(registrationExceptionHandleHttpErrorCode);
                        }
                    });
                }
                VoiceURLConnection.release(httpsURLConnectionCreate);
            } catch (Exception e) {
                handleException(Boolean.TRUE, e, null, handler, registrarListener);
                publishError(true, str, str3, RegistrationException.EXCEPTION_REGISTRATION_ERROR, "Unregistration failed : " + e.getMessage());
                VoiceURLConnection.release(null);
            }
        } catch (Throwable th) {
            VoiceURLConnection.release(null);
            throw th;
        }
    }

    private static JSONObject processJSONError(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            bufferedReader.close();
        }
        return new JSONObject(sb.toString());
    }

    private static void publishError(boolean z, String str, String str2, int i, String str3) {
        if (z) {
            publishRegistrationErrorEvent(str, str2, "unregistration-registration-error", i, str3);
        } else {
            publishRegistrationErrorEvent(str, str2, "registration-error", i, str3);
        }
    }

    private static void publishRegistrationErrorEvent(String str, String str2, String str3, int i, String str4) {
        EventPublisher eventPublisher = new EventPublisher(Constants.getClientSdkProductName(), str);
        try {
            JSONObject payload = new EventPayload.Builder().productName(Constants.getClientSdkProductName()).requestId(str2).errorCode(Long.valueOf(i)).errorMessage(str4).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).build().getPayload();
            Constants.SeverityLevel severityLevel = Constants.SeverityLevel.ERROR;
            eventPublisher.publish(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, eventPublisher.createEvent(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, payload));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void publishRegistrationSuccessfulEvent(String str, String str2, String str3) {
        EventPublisher eventPublisher = new EventPublisher(Constants.getClientSdkProductName(), str);
        try {
            JSONObject payload = new EventPayload.Builder().productName(Constants.getClientSdkProductName()).requestId(str2).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).build().getPayload();
            Constants.SeverityLevel severityLevel = Constants.SeverityLevel.INFO;
            eventPublisher.publish(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, eventPublisher.createEvent(severityLevel, EventGroupType.REGISTRATION_EVENT_GROUP, str3, payload));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void register(final String str, final String str2, final String str3, final boolean z, final RegistrarListener registrarListener) {
        final String strGenerateGUID = SidUtil.generateGUID("RQ", str);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        final Handler handlerCreateHandler = Utils.createHandler();
        executorServiceNewCachedThreadPool.execute(new Runnable() { // from class: com.twilio.voice.x
            @Override // java.lang.Runnable
            public final void run() {
                HttpsRegistrar.lambda$register$3(str, str3, strGenerateGUID, str2, z, handlerCreateHandler, registrarListener);
            }
        });
    }

    public static void unregister(final String str, final String str2, final RegistrarListener registrarListener) {
        final String strGenerateGUID = SidUtil.generateGUID("RQ", str);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        final Handler handlerCreateHandler = Utils.createHandler();
        executorServiceNewCachedThreadPool.execute(new Runnable() { // from class: com.twilio.voice.d0
            @Override // java.lang.Runnable
            public final void run() {
                HttpsRegistrar.lambda$unregister$6(str, str2, strGenerateGUID, handlerCreateHandler, registrarListener);
            }
        });
    }

    public static void register(String str, String str2, String str3, RegistrarListener registrarListener) {
        register(str, str2, str3, false, registrarListener);
    }
}
