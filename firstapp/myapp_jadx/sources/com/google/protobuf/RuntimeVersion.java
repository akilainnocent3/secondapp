package com.google.protobuf;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import defpackage.inm;
import defpackage.uf80;
import defpackage.ux5;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeVersion {
    public static final int MAJOR = 4;
    public static final int MINOR = 26;
    public static final int PATCH = 1;
    public static final String SUFFIX = "";
    public static final RuntimeDomain DOMAIN = RuntimeDomain.PUBLIC;
    private static final String VERSION_STRING = versionString(4, 26, 1, "");
    private static final Logger logger = Logger.getLogger(RuntimeVersion.class.getName());

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i2, i3, str, str2);
    }

    private static String versionString(int i, int i2, int i3, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        if (!checkDisabled()) {
            String strVersionString = versionString(i, i2, i3, str);
            if (i >= 0 && i2 >= 0 && i3 >= 0) {
                RuntimeDomain runtimeDomain2 = DOMAIN;
                if (runtimeDomain == runtimeDomain2) {
                    if (i == 4) {
                        if (26 >= i2 && (26 != i2 || 1 >= i3)) {
                            if (str.equals("")) {
                                return;
                            }
                            throw new ProtobufRuntimeVersionException(uf80.a(ux5.a("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Version suffixes must be the same."));
                        }
                        throw new ProtobufRuntimeVersionException(uf80.a(ux5.a("Detected incompatible Protobuf Gencode/Runtime versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, lTGEJfVytU.QiyJ));
                    }
                    throw new ProtobufRuntimeVersionException(uf80.a(ux5.a("Detected mismatched Protobuf Gencode/Runtime major versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Same major version is required."));
                }
                throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
            }
            throw new ProtobufRuntimeVersionException(inm.a("Invalid gencode version: ", strVersionString));
        }
    }
}
