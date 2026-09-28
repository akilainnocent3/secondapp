package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ym80 {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "UNDEFINED_SEVERITY_NUMBER";
            case 2:
                return "TRACE";
            case 3:
                return "TRACE2";
            case 4:
                return "TRACE3";
            case 5:
                return "TRACE4";
            case 6:
                return "DEBUG";
            case 7:
                return "DEBUG2";
            case 8:
                return "DEBUG3";
            case 9:
                return "DEBUG4";
            case 10:
                return "INFO";
            case 11:
                return "INFO2";
            case 12:
                return "INFO3";
            case 13:
                return "INFO4";
            case 14:
                return "WARN";
            case 15:
                return "WARN2";
            case 16:
                return "WARN3";
            case 17:
                return "WARN4";
            case 18:
                return "ERROR";
            case 19:
                return "ERROR2";
            case 20:
                return "ERROR3";
            case 21:
                return "ERROR4";
            case 22:
                return "FATAL";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "FATAL2";
            case 24:
                return "FATAL3";
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                return "FATAL4";
            default:
                return "null";
        }
    }
}
