package com.twilio.voice;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import defpackage.a140;
import defpackage.fp0;
import defpackage.hb5;
import defpackage.he;
import defpackage.tug;
import defpackage.uf80;
import defpackage.vqv;
import defpackage.z040;
import defpackage.zkh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Voice {
    static AudioDevice audioDevice;
    static final Map<String, CallInviteProxy> callInviteProxyMap;
    static Pair<String, String> callSidBridgeTokenPair;
    static final Set<Call> calls;
    private static final LogLevel defaultLogLevel;
    static String edge;
    static boolean enableInsights;
    static boolean isLibraryLoaded;
    static LogLevel level;
    static LoggerInterface logger;
    static Constants.LoggerType loggerType;
    private static long nativeLoggerHandle;
    static String region;
    static final Set<Call> rejects;
    static AtomicInteger networkChangedCount = new AtomicInteger(0);
    static Map<LogModule, LogLevel> moduleLogLevel = new EnumMap(LogModule.class);

    /* JADX INFO: renamed from: com.twilio.voice.Voice$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$twilio$voice$LogLevel = iArr;
            try {
                iArr[LogLevel.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum NetworkChangeEvent {
        CONNECTION_LOST,
        CONNECTION_CHANGED
    }

    public enum RegistrationChannel {
        FCM,
        GCM;

        @Override // java.lang.Enum
        public String toString() {
            return name().toLowerCase();
        }
    }

    static {
        LogLevel logLevel = LogLevel.ERROR;
        defaultLogLevel = logLevel;
        level = logLevel;
        logger = new DefaultLogger();
        loggerType = Constants.LoggerType.DEFAULT;
        enableInsights = true;
        region = Constants.GLOBAL_LOW_LATENCY_REGION;
        edge = Constants.EDGE_ROAMING;
        isLibraryLoaded = false;
        calls = new HashSet();
        callInviteProxyMap = new HashMap();
        rejects = new HashSet();
    }

    private static void callNativeHandleMessage(final Context context, final Map<String, String> map, final MessageListener messageListener, final Call.EventListener eventListener, final Call.CallMessageListener callMessageListener) throws Throwable {
        loadLibrary(context);
        final Handler handlerCreateHandler = Utils.createHandler();
        handlerCreateHandler.post(new Runnable() { // from class: com.twilio.voice.Voice.1
            @Override // java.lang.Runnable
            public void run() {
                CallInvite callInviteCreate = CallInvite.create(map);
                CancelledCallInvite cancelledCallInviteCreate = CancelledCallInvite.create(map);
                if (callInviteCreate.getBridgeToken() != null) {
                    Voice.callSidBridgeTokenPair = Pair.create(callInviteCreate.getCallSid(), callInviteCreate.getBridgeToken());
                }
                Pair<String[], String[]> pairMapToArrays = Utils.mapToArrays(map);
                MediaFactory mediaFactoryInstance = MediaFactory.instance(this, context.getApplicationContext());
                CallInviteProxy callInviteProxy = new CallInviteProxy(context.getApplicationContext(), handlerCreateHandler, messageListener, eventListener, callInviteCreate);
                Voice.nativeHandleMessage((String[]) pairMapToArrays.first, (String[]) pairMapToArrays.second, callInviteCreate, cancelledCallInviteCreate, new CallMessageListenerProxy(callInviteProxy.getPublisher(), callMessageListener), callInviteProxy, mediaFactoryInstance.getNativeMediaFactoryHandle());
                mediaFactoryInstance.release(this);
            }
        });
    }

    public static Call connect(Context context, ConnectOptions connectOptions, Call.Listener listener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(connectOptions, "connectOptions must not be null");
        Preconditions.checkNotNull(listener, "listener must not be null");
        if (!Utils.isAudioPermissionGranted(context)) {
            throw new SecurityException("Requires the RECORD_AUDIO permission");
        }
        ConnectOptions.Builder builder = new ConnectOptions.Builder(connectOptions.getAccessToken());
        builder.params(connectOptions.getParams());
        if (connectOptions.getIceOptions() != null) {
            builder.iceOptions(connectOptions.getIceOptions());
        }
        if (connectOptions.getPreferredAudioCodecs() != null) {
            builder.preferAudioCodecs(connectOptions.getPreferredAudioCodecs());
        }
        builder.enableDscp(connectOptions.enableDscp);
        builder.enableIceGatheringOnAnyAddressPorts(connectOptions.enableIceGatheringOnAnyAddressPorts);
        builder.audioTracks(Collections.singletonList(LocalAudioTrack.create(context, true, connectOptions.getAudioOptions())));
        builder.eventListener(connectOptions.getEventListener());
        builder.callMessageListener(connectOptions.getCallMessageListener());
        builder.audioOptions(connectOptions.getAudioOptions());
        ConnectOptions connectOptionsBuild = builder.build();
        Call call = new Call(context.getApplicationContext(), connectOptionsBuild.getAccessToken(), listener);
        call.connect(connectOptionsBuild);
        return call;
    }

    public static void enableInsights(boolean z) {
        if (isLibraryLoaded) {
            nativeEnableInsights(z);
        }
        enableInsights = z;
    }

    public static AudioDevice getAudioDevice() {
        AudioDevice audioDevice2 = audioDevice;
        if (audioDevice2 != null) {
            return audioDevice2;
        }
        DefaultAudioDevice defaultAudioDevice = new DefaultAudioDevice();
        audioDevice = defaultAudioDevice;
        return defaultAudioDevice;
    }

    public static String getEdge() {
        return edge;
    }

    public static LogLevel getLogLevel() {
        return level;
    }

    public static synchronized LoggerInterface getLogger() {
        return logger;
    }

    public static LogLevel getModuleLogLevel(LogModule logModule) {
        return moduleLogLevel.containsKey(logModule) ? moduleLogLevel.get(logModule) : defaultLogLevel;
    }

    @Deprecated
    public static String getRegion() {
        return region;
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static synchronized boolean handleMessage(Context context, Map<String, String> map, MessageListener messageListener, Call.EventListener eventListener, Call.CallMessageListener callMessageListener) {
        boolean zIsValid;
        try {
            Preconditions.checkNotNull(context, "context must not be null");
            Preconditions.checkNotNull(map, "data must not be null");
            Preconditions.checkNotNull(messageListener, "messageListener must not be null");
            zIsValid = CallInvite.isValid(context, map);
            if (zIsValid || (CancelledCallInvite.isValid(map) && isInsightsEnabled())) {
                callNativeHandleMessage(context, map, messageListener, eventListener, callMessageListener);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zIsValid;
    }

    public static boolean isInsightsEnabled() {
        return enableInsights;
    }

    public static void loadLibrary(Context context) throws Throwable {
        String[] strArrC;
        boolean z;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (isLibraryLoaded) {
            return;
        }
        a140 a140Var = new a140();
        if (context == null) {
            hb5.a("Given context is null");
            return;
        }
        a140.b("Beginning load of %s...", BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
        HashSet hashSet = a140Var.a;
        boolean z2 = true;
        if (hashSet.contains(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY)) {
            a140.b("%s already loaded previously!", BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
        } else {
            fp0.a aVar = null;
            try {
                System.loadLibrary(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
                hashSet.add(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
                a140.b("%s (%s) was loaded normally!", BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY, null);
            } catch (UnsatisfiedLinkError e) {
                a140.b("Loading the library normally failed: %s", Log.getStackTraceString(e));
                a140.b("%s (%s) was not loaded normally, re-linking...", BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY, null);
                File fileA = a140Var.a(context);
                if (fileA.exists()) {
                    z = z2;
                    break;
                }
                File dir = context.getDir("lib", 0);
                File fileA2 = a140Var.a(context);
                File[] fileArrListFiles = dir.listFiles(new z040(System.mapLibraryName(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileA2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str = Build.CPU_ABI2;
                    strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                }
                String strMapLibraryName = System.mapLibraryName(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
                try {
                    fp0.a aVarB = fp0.b(context, strArr, strMapLibraryName);
                    try {
                        if (aVarB == null) {
                            try {
                                strArrC = fp0.c(context, strMapLibraryName);
                            } catch (Exception e2) {
                                strArrC = new String[]{e2.toString()};
                            }
                            StringBuilder sbA = he.a("Could not find '", strMapLibraryName, "'. Looked for: ");
                            sbA.append(Arrays.toString(strArr));
                            sbA.append(", but only found: ");
                            throw new vqv(uf80.a(sbA, Arrays.toString(strArrC), "."));
                        }
                        ZipFile zipFile = aVarB.a;
                        int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (i >= 5) {
                                z = z2;
                                try {
                                    zipFile.close();
                                    break;
                                } catch (IOException unused) {
                                    break;
                                }
                            }
                            a140.b("Found %s! Extracting...", strMapLibraryName);
                            try {
                                if (fileA.exists() || fileA.createNewFile()) {
                                    try {
                                        inputStream2 = zipFile.getInputStream(aVarB.b);
                                        try {
                                            fileOutputStream2 = new FileOutputStream(fileA);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                while (true) {
                                                    int i3 = inputStream2.read(bArr);
                                                    if (i3 == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream2.write(bArr, 0, i3);
                                                    j += (long) i3;
                                                    z2 = z2;
                                                }
                                                fileOutputStream2.flush();
                                                fileOutputStream2.getFD().sync();
                                                if (j == fileA.length()) {
                                                    fp0.a(inputStream2);
                                                    fp0.a(fileOutputStream2);
                                                    fileA.setReadable(z2, false);
                                                    fileA.setExecutable(z2, false);
                                                    fileA.setWritable(z2);
                                                    try {
                                                        zipFile.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                    z = z2;
                                                    break;
                                                }
                                                fp0.a(inputStream2);
                                                fp0.a(fileOutputStream2);
                                            } catch (FileNotFoundException unused3) {
                                                z2 = z2;
                                                fp0.a(inputStream2);
                                                fp0.a(fileOutputStream2);
                                                i = i2;
                                                z2 = z2;
                                            } catch (IOException unused4) {
                                                z2 = z2;
                                                fp0.a(inputStream2);
                                                fp0.a(fileOutputStream2);
                                                i = i2;
                                                z2 = z2;
                                            } catch (Throwable th) {
                                                th = th;
                                                inputStream = inputStream2;
                                                fileOutputStream = fileOutputStream2;
                                                fp0.a(inputStream);
                                                fp0.a(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            fileOutputStream2 = null;
                                            fp0.a(inputStream2);
                                            fp0.a(fileOutputStream2);
                                            i = i2;
                                            z2 = z2;
                                        } catch (IOException unused6) {
                                            fileOutputStream2 = null;
                                            fp0.a(inputStream2);
                                            fp0.a(fileOutputStream2);
                                            i = i2;
                                            z2 = z2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = inputStream2;
                                            fileOutputStream = null;
                                            fp0.a(inputStream);
                                            fp0.a(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused7) {
                                        inputStream2 = null;
                                    } catch (IOException unused8) {
                                        inputStream2 = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = null;
                                    }
                                }
                            } catch (IOException unused9) {
                            }
                            z2 = z2;
                            i = i2;
                            z2 = z2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        aVar = aVarB;
                        if (aVar != null) {
                            try {
                                aVar.a.close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                System.load(fileA.getAbsolutePath());
                hashSet.add(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY);
                a140.b("%s (%s) was re-linked!", BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY, null);
            }
        }
        z = true;
        isLibraryLoaded = z;
        setLogger(getLogger());
        setLogLevel(level);
        if (!edge.equals(Constants.EDGE_ROAMING)) {
            nativeSetEdge(edge);
        }
        if (!region.equals(Constants.GLOBAL_LOW_LATENCY_REGION)) {
            nativeSetRegion(region);
        }
        enableInsights(enableInsights);
        for (LogModule logModule : moduleLogLevel.keySet()) {
            setModuleLogLevel(logModule, moduleLogLevel.get(logModule));
        }
    }

    private static native void nativeEnableInsights(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nativeHandleMessage(String[] strArr, String[] strArr2, CallInvite callInvite, CancelledCallInvite cancelledCallInvite, Call.CallMessageListener callMessageListener, CallInviteProxy callInviteProxy, long j);

    private static native void nativeReleaseLogger(long j);

    private static native void nativeSetEdge(String str);

    private static native long nativeSetLogger(LoggerInterface loggerInterface);

    private static native void nativeSetModuleLevel(int i, int i2);

    private static native void nativeSetRegion(String str);

    public static void onNetworkChanged(NetworkChangeEvent networkChangeEvent) {
        networkChangedCount.incrementAndGet();
        Iterator<Call> it = calls.iterator();
        while (it.hasNext()) {
            it.next().networkChange(networkChangeEvent);
        }
        Iterator<CallInviteProxy> it2 = callInviteProxyMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().networkChange(networkChangeEvent);
        }
    }

    public static void register(String str, RegistrationChannel registrationChannel, String str2, RegistrationListener registrationListener) {
        Preconditions.checkNotNull(str, "accessToken must not be null");
        Preconditions.checkNotNull(registrationChannel, "registrationChannel must not be null");
        Preconditions.checkNotNull(str2, "registrationToken must not be null");
        Preconditions.checkNotNull(registrationListener, "listener must not be null");
        new Registrar(str, registrationChannel.toString(), str2).register(registrationListener);
    }

    public static PreflightTest runPreflight(Context context, PreflightOptions preflightOptions, PreflightTest.Listener listener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(preflightOptions, "preflightOptions must not be null");
        Preconditions.checkNotNull(listener, "listener must not be null");
        return new PreflightTest(context, preflightOptions, listener);
    }

    public static void setAudioDevice(AudioDevice audioDevice2) {
        Preconditions.checkNotNull(audioDevice2, "audioDevice must not be null");
        if (calls.isEmpty()) {
            audioDevice = audioDevice2;
        } else {
            zkh.a("Changing the audio device during a call is not allowed");
        }
    }

    public static void setEdge(String str) {
        Preconditions.checkNotNull(str, "edge must not be null");
        Preconditions.checkArgument(region.equals(Constants.GLOBAL_LOW_LATENCY_REGION), tug.a("Non default region value ", getRegion(), " has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to."));
        if (isLibraryLoaded) {
            nativeSetEdge(str);
        }
        edge = str;
    }

    public static void setLogLevel(LogLevel logLevel) {
        setSDKLogLevel(logLevel);
        if (isLibraryLoaded) {
            nativeSetModuleLevel(LogModule.CORE.ordinal(), logLevel.ordinal());
        }
        level = logLevel;
    }

    public static synchronized void setLogger(LoggerInterface loggerInterface) {
        try {
            Preconditions.checkNotNull(loggerInterface, "Logger must not be null");
            if (isLibraryLoaded) {
                long j = nativeLoggerHandle;
                if (j != 0) {
                    nativeReleaseLogger(j);
                    nativeLoggerHandle = 0L;
                }
                nativeLoggerHandle = nativeSetLogger(loggerInterface);
            }
            logger = loggerInterface;
            loggerType = loggerInterface instanceof DefaultLogger ? Constants.LoggerType.DEFAULT : Constants.LoggerType.CUSTOM;
            Iterator<Call> it = calls.iterator();
            while (it.hasNext()) {
                it.next().publishLoggerEventToInsights();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setModuleLogLevel(LogModule logModule, LogLevel logLevel) {
        if (logModule == LogModule.PLATFORM) {
            setSDKLogLevel(logLevel);
        }
        if (isLibraryLoaded) {
            nativeSetModuleLevel(logModule.ordinal(), logLevel.ordinal());
        }
        moduleLogLevel.put(logModule, logLevel);
    }

    @Deprecated
    public static void setRegion(String str) {
        Preconditions.checkNotNull(str, "region must not be null");
        Preconditions.checkArgument(edge.equals(Constants.EDGE_ROAMING), tug.a("Non default edge value ", getEdge(), " has already been specified. Please use Voice.edge or Voice.region to specify the Twilio Region that the SDK connects to."));
        if (isLibraryLoaded) {
            nativeSetRegion(str);
        }
        region = str;
    }

    private static void setSDKLogLevel(LogLevel logLevel) {
        switch (AnonymousClass2.$SwitchMap$com$twilio$voice$LogLevel[logLevel.ordinal()]) {
            case 1:
                Logger.setLogLevel(7);
                break;
            case 2:
                Logger.setLogLevel(6);
                break;
            case 3:
                Logger.setLogLevel(5);
                break;
            case 4:
                Logger.setLogLevel(4);
                break;
            case 5:
                Logger.setLogLevel(3);
                break;
            case 6:
                Logger.setLogLevel(2);
                break;
            case 7:
                Logger.setLogLevel(2);
                break;
            default:
                Logger.setLogLevel(7);
                break;
        }
    }

    public static void unregister(String str, RegistrationChannel registrationChannel, String str2, UnregistrationListener unregistrationListener) {
        Preconditions.checkNotNull(str, "accessToken must not be null");
        Preconditions.checkNotNull(registrationChannel, "registrationChannel must not be null");
        Preconditions.checkNotNull(str2, "registrationToken must not be null");
        Preconditions.checkNotNull(unregistrationListener, "listener must not be null");
        new Registrar(str, registrationChannel.toString(), str2).unregister(unregistrationListener);
    }

    public static PreflightTest runPreflight(Context context, String str, PreflightTest.Listener listener) {
        return runPreflight(context, new PreflightOptions.Builder(str).build(), listener);
    }

    public static synchronized boolean handleMessage(Context context, Map<String, String> map, MessageListener messageListener, Call.CallMessageListener callMessageListener) {
        return handleMessage(context, map, messageListener, null, callMessageListener);
    }

    public static boolean handleMessage(Context context, Bundle bundle, MessageListener messageListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        Preconditions.checkNotNull(messageListener, "listener must not be null");
        return handleMessage(context, Utils.bundleToMap(bundle), messageListener, (Call.CallMessageListener) null);
    }

    public static boolean handleMessage(Context context, Bundle bundle, MessageListener messageListener, Call.CallMessageListener callMessageListener) {
        Preconditions.checkNotNull(context, "context must not be null");
        Preconditions.checkNotNull(bundle, "data must not be null");
        Preconditions.checkNotNull(messageListener, "listener must not be null");
        return handleMessage(context, Utils.bundleToMap(bundle), messageListener, callMessageListener);
    }

    public static synchronized boolean handleMessage(Context context, Map<String, String> map, MessageListener messageListener) {
        return handleMessage(context, map, messageListener, null, null);
    }

    public static Call connect(Context context, String str, Call.Listener listener) {
        return connect(context, new ConnectOptions.Builder(str).build(), listener);
    }
}
