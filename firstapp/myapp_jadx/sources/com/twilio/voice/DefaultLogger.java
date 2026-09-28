package com.twilio.voice;

import android.util.Log;
import defpackage.mq0;
import defpackage.uf80;

/* JADX INFO: loaded from: classes8.dex */
class DefaultLogger implements LoggerInterface {

    /* JADX INFO: renamed from: com.twilio.voice.DefaultLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogLevel;
        static final /* synthetic */ int[] $SwitchMap$com$twilio$voice$LogModule;

        static {
            int[] iArr = new int[LogModule.values().length];
            $SwitchMap$com$twilio$voice$LogModule = iArr;
            try {
                iArr[LogModule.CORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.SIGNALING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.WEBRTC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogModule[LogModule.PLATFORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LogLevel.values().length];
            $SwitchMap$com$twilio$voice$LogLevel = iArr2;
            try {
                iArr2[LogLevel.FATAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.TRACE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$twilio$voice$LogLevel[LogLevel.OFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private String convertModuleToString(LogModule logModule) {
        String str = new String();
        int i = AnonymousClass1.$SwitchMap$com$twilio$voice$LogModule[logModule.ordinal()];
        if (i == 1) {
            return "Core";
        }
        if (i == 2) {
            return "Signaling";
        }
        if (i != 3) {
            return i != 4 ? str : "Platform";
        }
        return "WebRTC";
    }

    @Override // com.twilio.voice.LoggerInterface
    public void log(LogParameters logParameters) {
        String str;
        Preconditions.checkNotNull(logParameters, "LogParameters object must not be null");
        String strA = uf80.a(new StringBuilder("["), convertModuleToString(logParameters.module), "] ");
        if (logParameters.tag.isEmpty()) {
            str = "Twilio";
        } else {
            str = "Twilio:" + logParameters.tag;
        }
        String string = strA + logParameters.message;
        if (logParameters.tr != null) {
            StringBuilder sbB = mq0.b(string, "\n");
            sbB.append(Log.getStackTraceString(logParameters.tr));
            string = sbB.toString();
        }
        switch (AnonymousClass1.$SwitchMap$com$twilio$voice$LogLevel[logParameters.level.ordinal()]) {
            case 1:
            case 2:
                Log.e(str, string);
                break;
            case 3:
                Log.w(str, string);
                break;
            case 4:
                Log.i(str, string);
                break;
            case 5:
                Log.d(str, string);
                break;
            case 6:
            case 7:
                Log.v(str, string);
                break;
        }
    }
}
