package com.cleveradssolutions.adapters.dtexchange;

import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41988a;

        static {
            int[] iArr = new int[InneractiveErrorCode.values().length];
            try {
                iArr[InneractiveErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InneractiveErrorCode.CONNECTION_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InneractiveErrorCode.CONNECTION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InneractiveErrorCode.LOAD_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InneractiveErrorCode.IN_FLIGHT_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InneractiveErrorCode.UNKNOWN_APP_ID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InneractiveErrorCode.INVALID_INPUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InneractiveErrorCode.SPOT_DISABLED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InneractiveErrorCode.UNSUPPORTED_SPOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InneractiveErrorCode.SDK_NOT_INITIALIZED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f41988a = iArr;
        }
    }

    public static final wc.b a(InneractiveErrorCode inneractiveErrorCode) {
        wc.b bVar;
        String str;
        switch (inneractiveErrorCode == null ? -1 : a.f41988a[inneractiveErrorCode.ordinal()]) {
            case -1:
            case 1:
                bVar = wc.b.f142696c;
                str = "NO_FILL";
                break;
            case 0:
            default:
                return new wc.b(0, inneractiveErrorCode.toString());
            case 2:
            case 3:
            case 4:
            case 5:
                bVar = wc.b.f142698e;
                str = "NO_CONNECTION";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return new wc.b(10, inneractiveErrorCode.toString());
            case 12:
            case 13:
                bVar = wc.b.f142700g;
                str = "NOT_INITIALIZED";
                break;
        }
        m0.o(bVar, str);
        return bVar;
    }

    public static final void b(com.cleveradssolutions.mediation.core.a aVar, ImpressionData data) {
        m0.p(aVar, "<this>");
        m0.p(data, "data");
        String creativeId = data.getCreativeId();
        if (creativeId != null) {
            aVar.setCreativeId(creativeId);
        }
        if (data.getPricing() != null && m0.g(data.getPricing().getCurrency(), "USD")) {
            aVar.setRevenuePrecision(3);
            aVar.setCostPerMille(data.getPricing().getValue() * 1000.0d);
        }
        com.cleveradssolutions.mediation.api.b listener = aVar.getListener();
        if (listener != null) {
            listener.w(aVar);
        }
    }
}
