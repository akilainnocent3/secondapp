package com.chartboost.sdk.events;

import com.unity3d.services.core.network.core.OkHttp3Client;
import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ChartboostError extends Exception {

    @m
    private final Throwable cause;

    @l
    private final String causeDescription;

    @l
    private final String code;

    @l
    private final String constant;

    @l
    private final String message;

    @l
    private final String resolution;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface CBError {
        @l
        Exception getException();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Connectivity extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Internal extends Connectivity {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = internal.throwable;
                }
                return internal.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Internal copy(@m String str, @m Throwable th2) {
                return new Internal(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) obj;
                return m0.g(this.customCause, internal.customCause) && m0.g(this.throwable, internal.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Internal(@m String str, @m Throwable th2) {
                super("CB_205", "CB_CONNECTIVITY_INTERNAL_ERROR", OkHttp3Client.MSG_CONNECTION_FAILED, "An internal error happened when making a network request. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NetworkError extends Connectivity {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ NetworkError(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ NetworkError copy$default(NetworkError networkError, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = networkError.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = networkError.throwable;
                }
                return networkError.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final NetworkError copy(@m String str, @m Throwable th2) {
                return new NetworkError(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetworkError)) {
                    return false;
                }
                NetworkError networkError = (NetworkError) obj;
                return m0.g(this.customCause, networkError.customCause) && m0.g(this.throwable, networkError.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public NetworkError(@m String str, @m Throwable th2) {
                super("CB_202", "CB_CONNECTIVITY_NETWORK_ERROR", "Network request failed.", "A networking error has occurred. " + (str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoInternet extends Connectivity {

            @l
            public static final NoInternet INSTANCE = new NoInternet();

            private NoInternet() {
                super("CB_201", "CB_CONNECTIVITY_NO_INTERNET", "Network request failed.", "No Internet connectivity was available.", "Ensure there is Internet connectivity and try again.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoInternet);
            }

            public int hashCode() {
                return 1867194601;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class ServerError extends Connectivity {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ ServerError(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ ServerError copy$default(ServerError serverError, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = serverError.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = serverError.throwable;
                }
                return serverError.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final ServerError copy(@m String str, @m Throwable th2) {
                return new ServerError(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServerError)) {
                    return false;
                }
                ServerError serverError = (ServerError) obj;
                return m0.g(this.customCause, serverError.customCause) && m0.g(this.throwable, serverError.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public ServerError(@m String str, @m Throwable th2) {
                super("CB_203", "CB_CONNECTIVITY_SERVER_ERROR", "Network request failed.", "Network request failed due to a server error. " + (str == null ? "" : str), "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TimedOut extends Connectivity {

            @l
            public static final TimedOut INSTANCE = new TimedOut();

            private TimedOut() {
                super("CB_204", "CB_CONNECTIVITY_TIMED_OUT", "Network request failed.", "Network request timed out.", "Typically this error should resolve itself. If the error persists, contact Chartboost Support and share a copy of your network traffic logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof TimedOut);
            }

            public int hashCode() {
                return -396325090;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Connectivity {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_200", "CB_CONNECTIVITY_UNKNOWN_ERROR", "Network request failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        public /* synthetic */ Connectivity(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Connectivity(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Initialization extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Disabled extends Initialization {

            @l
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_101", "CB_INITIALIZATION_DISABLED", "Initialization has failed.", "Initialization has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public int hashCode() {
                return 2053037114;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Internal extends Initialization {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = internal.throwable;
                }
                return internal.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Internal copy(@m String str, @m Throwable th2) {
                return new Internal(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) obj;
                return m0.g(this.customCause, internal.customCause) && m0.g(this.throwable, internal.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Internal(@m String str, @m Throwable th2) {
                super("CB_105", "CB_INITIALIZATION_INTERNAL_ERROR", "Initialization has failed.", "An internal error happened during initialization. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidConfiguration extends Initialization {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ InvalidConfiguration(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidConfiguration copy$default(InvalidConfiguration invalidConfiguration, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidConfiguration.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = invalidConfiguration.throwable;
                }
                return invalidConfiguration.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final InvalidConfiguration copy(@m String str, @m Throwable th2) {
                return new InvalidConfiguration(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidConfiguration)) {
                    return false;
                }
                InvalidConfiguration invalidConfiguration = (InvalidConfiguration) obj;
                return m0.g(this.customCause, invalidConfiguration.customCause) && m0.g(this.throwable, invalidConfiguration.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidConfiguration(@m String str, @m Throwable th2) {
                super("CB_104", "CB_INITIALIZATION_INVALID_CONFIGURATION", "Initialization has failed.", "Invalid/malformed app configuration received from the ad server. " + (str == null ? "" : str), "If this problem persists, reach out to the Chartboost Support for further assistance. Forward us a copy of Chartboost network traffic.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidCredentials extends Initialization {

            @l
            public static final InvalidCredentials INSTANCE = new InvalidCredentials();

            private InvalidCredentials() {
                super("CB_102", "CB_INITIALIZATION_INVALID_CREDENTIALS", "Initialization has failed.", "Invalid/empty credentials were supplied.", "Double check that the supplied information is correct.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof InvalidCredentials);
            }

            public int hashCode() {
                return 1005114563;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoContext extends Initialization {

            @l
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_103", "CB_INITIALIZATION_NO_CONTEXT", "Initialization has failed.", "No Context supplied.", "Ensure that a Context is provided at initialization.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoContext);
            }

            public int hashCode() {
                return 953518768;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class OsVersionNotSupported extends Initialization {

            @l
            public static final OsVersionNotSupported INSTANCE = new OsVersionNotSupported();

            private OsVersionNotSupported() {
                super("CB_106", "CB_INITIALIZATION_OS_VERSION_NOT_SUPPORTED", "Initialization has failed.", "Ad serving for the operating system version is not supported.", "N/A", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof OsVersionNotSupported);
            }

            public int hashCode() {
                return -847782255;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class PermissionsNotSet extends Initialization {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ PermissionsNotSet(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ PermissionsNotSet copy$default(PermissionsNotSet permissionsNotSet, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = permissionsNotSet.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = permissionsNotSet.throwable;
                }
                return permissionsNotSet.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final PermissionsNotSet copy(@m String str, @m Throwable th2) {
                return new PermissionsNotSet(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PermissionsNotSet)) {
                    return false;
                }
                PermissionsNotSet permissionsNotSet = (PermissionsNotSet) obj;
                return m0.g(this.customCause, permissionsNotSet.customCause) && m0.g(this.throwable, permissionsNotSet.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public PermissionsNotSet(@m String str, @m Throwable th2) {
                super("CB_107", "CB_INITIALIZATION_PERMISSIONS_NOT_SET", "Initialization has failed.", "App is missing declared permissions in the Android manifest. " + (str == null ? "" : str), "Check your console logs for more details.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Initialization {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_100", "CB_INITIALIZATION_UNKNOWN_ERROR", "Initialization has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        public /* synthetic */ Initialization(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Initialization(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Load extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AlreadyLoaded extends Load {

            @l
            public static final AlreadyLoaded INSTANCE = new AlreadyLoaded();

            private AlreadyLoaded() {
                super("CB_304", "CB_LOAD_ALREADY_LOADED", "Ad load has failed.", "Ad is already loaded.", "Show the ad before loading another.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof AlreadyLoaded);
            }

            public int hashCode() {
                return 320533829;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AssetUnavailable extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            @m
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th2, int i10, x xVar) {
                this(str, str2, (i10 & 4) != 0 ? null : th2);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i10 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i10 & 4) != 0) {
                    th2 = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th2);
            }

            @m
            public final String component1() {
                return this.url;
            }

            @m
            public final String component2() {
                return this.customCause;
            }

            @m
            public final Throwable component3() {
                return this.throwable;
            }

            @l
            public final AssetUnavailable copy(@m String str, @m String str2, @m Throwable th2) {
                return new AssetUnavailable(str, str2, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) obj;
                return m0.g(this.url, assetUnavailable.url) && m0.g(this.customCause, assetUnavailable.customCause) && m0.g(this.throwable, assetUnavailable.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @m
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th2 = this.throwable;
                return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
            }

            public AssetUnavailable(@m String str, @m String str2, @m Throwable th2) {
                super("CB_320", "CB_LOAD_ASSET_UNAVAILABLE", "Ad load has failed.", "Asset is unavailable. URL: " + (str == null ? "unknown" : str) + ". Details: " + (str2 == null ? "" : str2), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Disabled extends Load {

            @l
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_301", "CB_LOAD_DISABLED", "Ad load has failed.", "Ad loading has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public int hashCode() {
                return 607244980;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Internal extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = internal.throwable;
                }
                return internal.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Internal copy(@m String str, @m Throwable th2) {
                return new Internal(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) obj;
                return m0.g(this.customCause, internal.customCause) && m0.g(this.throwable, internal.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Internal(@m String str, @m Throwable th2) {
                super("CB_311", "CB_LOAD_INTERNAL_ERROR", "Ad load has failed.", "An internal error happened during ad load. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidAdm extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ InvalidAdm(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidAdm copy$default(InvalidAdm invalidAdm, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidAdm.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = invalidAdm.throwable;
                }
                return invalidAdm.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final InvalidAdm copy(@m String str, @m Throwable th2) {
                return new InvalidAdm(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidAdm)) {
                    return false;
                }
                InvalidAdm invalidAdm = (InvalidAdm) obj;
                return m0.g(this.customCause, invalidAdm.customCause) && m0.g(this.throwable, invalidAdm.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidAdm(@m String str, @m Throwable th2) {
                super("CB_310", "CB_LOAD_INVALID_ADM", "Ad load has failed.", "Ad markup string is invalid or empty. " + (str == null ? "" : str), "Contact Chartboost Support or the mediator's support and provide a copy of your network traffic logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidAssetUrl extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            @m
            private final String url;

            public /* synthetic */ InvalidAssetUrl(String str, String str2, Throwable th2, int i10, x xVar) {
                this(str, str2, (i10 & 4) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidAssetUrl copy$default(InvalidAssetUrl invalidAssetUrl, String str, String str2, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidAssetUrl.url;
                }
                if ((i10 & 2) != 0) {
                    str2 = invalidAssetUrl.customCause;
                }
                if ((i10 & 4) != 0) {
                    th2 = invalidAssetUrl.throwable;
                }
                return invalidAssetUrl.copy(str, str2, th2);
            }

            @m
            public final String component1() {
                return this.url;
            }

            @m
            public final String component2() {
                return this.customCause;
            }

            @m
            public final Throwable component3() {
                return this.throwable;
            }

            @l
            public final InvalidAssetUrl copy(@m String str, @m String str2, @m Throwable th2) {
                return new InvalidAssetUrl(str, str2, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidAssetUrl)) {
                    return false;
                }
                InvalidAssetUrl invalidAssetUrl = (InvalidAssetUrl) obj;
                return m0.g(this.url, invalidAssetUrl.url) && m0.g(this.customCause, invalidAssetUrl.customCause) && m0.g(this.throwable, invalidAssetUrl.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @m
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th2 = this.throwable;
                return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidAssetUrl(@m String str, @m String str2, @m Throwable th2) {
                super("CB_318", "CB_LOAD_INVALID_ASSET_URL", "Ad load has failed.", "Invalid asset URL: " + (str == null ? "unknown" : str) + ". " + (str2 == null ? "" : str2), "N/A", th2, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidHtml extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ InvalidHtml(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidHtml copy$default(InvalidHtml invalidHtml, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidHtml.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = invalidHtml.throwable;
                }
                return invalidHtml.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final InvalidHtml copy(@m String str, @m Throwable th2) {
                return new InvalidHtml(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidHtml)) {
                    return false;
                }
                InvalidHtml invalidHtml = (InvalidHtml) obj;
                return m0.g(this.customCause, invalidHtml.customCause) && m0.g(this.throwable, invalidHtml.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidHtml(@m String str, @m Throwable th2) {
                super("CB_315", "CB_LOAD_INVALID_HTML", "Ad load has failed.", "Invalid HTML document or snippet. " + (str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidPlacement extends Load {

            @l
            public static final InvalidPlacement INSTANCE = new InvalidPlacement();

            private InvalidPlacement() {
                super("CB_305", "CB_LOAD_INVALID_PLACEMENT", "Ad load has failed.", "Placement is invalid or empty.", "Ensure the Chartboost Monetization placement matches the value entered into the dashboard.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof InvalidPlacement);
            }

            public int hashCode() {
                return 648505062;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidRequest extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ InvalidRequest(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidRequest copy$default(InvalidRequest invalidRequest, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidRequest.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = invalidRequest.throwable;
                }
                return invalidRequest.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final InvalidRequest copy(@m String str, @m Throwable th2) {
                return new InvalidRequest(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidRequest)) {
                    return false;
                }
                InvalidRequest invalidRequest = (InvalidRequest) obj;
                return m0.g(this.customCause, invalidRequest.customCause) && m0.g(this.throwable, invalidRequest.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidRequest(@m String str, @m Throwable th2) {
                super("CB_308", "CB_LOAD_INVALID_REQUEST", "Ad load has failed.", "Ad request was invalid/malformed. " + (str == null ? "" : str), "Contact Chartboost Support and provide a copy of your network traffic logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidResponse extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ InvalidResponse(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidResponse copy$default(InvalidResponse invalidResponse, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidResponse.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = invalidResponse.throwable;
                }
                return invalidResponse.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final InvalidResponse copy(@m String str, @m Throwable th2) {
                return new InvalidResponse(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidResponse)) {
                    return false;
                }
                InvalidResponse invalidResponse = (InvalidResponse) obj;
                return m0.g(this.customCause, invalidResponse.customCause) && m0.g(this.throwable, invalidResponse.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidResponse(@m String str, @m Throwable th2) {
                super("CB_309", "CB_LOAD_INVALID_RESPONSE", "Ad load has failed.", "Ad response was invalid/malformed and could not be parsed. " + (str == null ? "" : str), "Contact Chartboost Support and provide a copy of your network traffic logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class LoadInProgress extends Load {

            @l
            public static final LoadInProgress INSTANCE = new LoadInProgress();

            private LoadInProgress() {
                super("CB_303", "CB_LOAD_IN_PROGRESS", "Ad load has failed.", "Ad load already in progress.", "Wait until the current ad load is done before loading another ad.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof LoadInProgress);
            }

            public int hashCode() {
                return -739965392;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoAd extends Load {

            @l
            public static final NoAd INSTANCE = new NoAd();

            private NoAd() {
                super("CB_313", "CB_LOAD_NO_AD", "Ad load has failed.", "No ad available.", "Try again. If the problem persists, verify dashboard settings in the Chartboost Monetization dashboard.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoAd);
            }

            public int hashCode() {
                return 1451499004;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoContext extends Load {

            @l
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_306", "CB_LOAD_NO_CONTEXT", "Ad load has failed.", "No Activity provided to load the ad.", "Ensure that a valid Context is provided when loading ads.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoContext);
            }

            public int hashCode() {
                return -916364426;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoMraidJs extends Load {

            @l
            public static final NoMraidJs INSTANCE = new NoMraidJs();

            private NoMraidJs() {
                super("CB_314", "CB_LOAD_NO_MRAID_JS", "Ad load has failed.", "Required MRAID JavaScript file is missing from the SDK bundle.", "Verify that the Chartboost Monetization integration is correct. If the issue persists, contact Chartboost Support.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoMraidJs);
            }

            public int hashCode() {
                return -557710617;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoStorage extends Load {

            @l
            public static final NoStorage INSTANCE = new NoStorage();

            private NoStorage() {
                super("CB_312", "CB_LOAD_NO_STORAGE", "Ad load has failed.", "Insufficient storage to load the ad.", "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your console logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoStorage);
            }

            public int hashCode() {
                return 542797890;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NotInitialized extends Load {

            @l
            public static final NotInitialized INSTANCE = new NotInitialized();

            private NotInitialized() {
                super("CB_302", "CB_LOAD_NOT_INITIALIZED", "Ad load has failed.", "SDK initialization not started or still in progress.", "Ensure the Chartboost Monetization SDK has completed initialization before loading ads.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NotInitialized);
            }

            public int hashCode() {
                return -2031534023;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class RateLimited extends Load {

            @l
            public static final RateLimited INSTANCE = new RateLimited();

            private RateLimited() {
                super("CB_307", "CB_LOAD_RATE_LIMITED", "Ad load has failed.", "Too many ad requests have been made over a short amount of time.", "Avoid continually making ad requests in a short amount of time. Implementing an exponential backoff strategy will mitigate this issue.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof RateLimited);
            }

            public int hashCode() {
                return 662913378;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TimedOut extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ TimedOut(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ TimedOut copy$default(TimedOut timedOut, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = timedOut.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = timedOut.throwable;
                }
                return timedOut.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final TimedOut copy(@m String str, @m Throwable th2) {
                return new TimedOut(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TimedOut)) {
                    return false;
                }
                TimedOut timedOut = (TimedOut) obj;
                return m0.g(this.customCause, timedOut.customCause) && m0.g(this.throwable, timedOut.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public TimedOut(@m String str, @m Throwable th2) {
                super("CB_322", "CB_LOAD_TIMED_OUT", "Ad load has failed.", "Operation has timed out. " + (str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_300", "CB_LOAD_UNKNOWN_ERROR", "Ad load has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class UnsupportedCodec extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ UnsupportedCodec(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ UnsupportedCodec copy$default(UnsupportedCodec unsupportedCodec, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unsupportedCodec.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unsupportedCodec.throwable;
                }
                return unsupportedCodec.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final UnsupportedCodec copy(@m String str, @m Throwable th2) {
                return new UnsupportedCodec(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UnsupportedCodec)) {
                    return false;
                }
                UnsupportedCodec unsupportedCodec = (UnsupportedCodec) obj;
                return m0.g(this.customCause, unsupportedCodec.customCause) && m0.g(this.throwable, unsupportedCodec.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public UnsupportedCodec(@m String str, @m Throwable th2) {
                super("CB_321", "CB_LOAD_UNSUPPORTED_CODEC", "Ad load has failed.", "Video codec is unsupported. " + (str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class VastError extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ VastError(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ VastError copy$default(VastError vastError, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = vastError.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = vastError.throwable;
                }
                return vastError.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final VastError copy(@m String str, @m Throwable th2) {
                return new VastError(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VastError)) {
                    return false;
                }
                VastError vastError = (VastError) obj;
                return m0.g(this.customCause, vastError.customCause) && m0.g(this.throwable, vastError.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public VastError(@m String str, @m Throwable th2) {
                super("CB_319", "CB_LOAD_VAST_ERROR", "Ad load has failed.", "VAST error. " + (str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class WebViewCrashed extends Load {

            @l
            public static final WebViewCrashed INSTANCE = new WebViewCrashed();

            private WebViewCrashed() {
                super("CB_317", "CB_LOAD_WEBVIEW_CRASHED", "Ad load has failed.", "The WebView process crashed and its process was killed by the system.", "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof WebViewCrashed);
            }

            public int hashCode() {
                return -1894253979;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class WebViewFailed extends Load {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ WebViewFailed(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ WebViewFailed copy$default(WebViewFailed webViewFailed, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = webViewFailed.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = webViewFailed.throwable;
                }
                return webViewFailed.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final WebViewFailed copy(@m String str, @m Throwable th2) {
                return new WebViewFailed(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WebViewFailed)) {
                    return false;
                }
                WebViewFailed webViewFailed = (WebViewFailed) obj;
                return m0.g(this.customCause, webViewFailed.customCause) && m0.g(this.throwable, webViewFailed.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public WebViewFailed(@m String str, @m Throwable th2) {
                super("CB_316", "CB_LOAD_WEBVIEW_FAILED", "Ad load has failed.", "The WebView failed to load the creative. " + (str == null ? "" : str), "Try again. Typically, this issue should resolve itself. If the issue persists, contact Chartboost Support and provide a copy of your network and console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        public /* synthetic */ Load(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Load(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Other extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Other {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_900", "CB_OTHER_UNKNOWN_ERROR", "An internal error has occurred.", str == null ? "An unknown internal error has occurred." : str, "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        public /* synthetic */ Other(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Other(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Render extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AssetUnavailable extends Render {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            @m
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th2, int i10, x xVar) {
                this(str, str2, (i10 & 4) != 0 ? null : th2);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i10 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i10 & 4) != 0) {
                    th2 = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th2);
            }

            @m
            public final String component1() {
                return this.url;
            }

            @m
            public final String component2() {
                return this.customCause;
            }

            @m
            public final Throwable component3() {
                return this.throwable;
            }

            @l
            public final AssetUnavailable copy(@m String str, @m String str2, @m Throwable th2) {
                return new AssetUnavailable(str, str2, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) obj;
                return m0.g(this.url, assetUnavailable.url) && m0.g(this.customCause, assetUnavailable.customCause) && m0.g(this.throwable, assetUnavailable.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @m
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th2 = this.throwable;
                return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
            }

            public AssetUnavailable(@m String str, @m String str2, @m Throwable th2) {
                super("CB_503", "CB_RENDER_ASSET_UNAVAILABLE", "Ad rendering has failed.", "Asset is unavailable. URL: " + (str == null ? "unknown" : str) + ". Details: " + (str2 == null ? "" : str2), "N/A", th2, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Internal extends Render {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Internal(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = internal.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = internal.throwable;
                }
                return internal.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Internal copy(@m String str, @m Throwable th2) {
                return new Internal(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) obj;
                return m0.g(this.customCause, internal.customCause) && m0.g(this.throwable, internal.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Internal(@m String str, @m Throwable th2) {
                super("CB_504", "CB_RENDER_INTERNAL_ERROR", "Ad rendering has failed.", "An internal error happened during ad render. " + (str == null ? "" : str), "Check your console logs for more details. If this error persists, contact Chartboost Support and provide a copy of your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class InvalidClickthroughUrl extends Render {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            @m
            private final String url;

            public /* synthetic */ InvalidClickthroughUrl(String str, String str2, Throwable th2, int i10, x xVar) {
                this(str, str2, (i10 & 4) != 0 ? null : th2);
            }

            public static /* synthetic */ InvalidClickthroughUrl copy$default(InvalidClickthroughUrl invalidClickthroughUrl, String str, String str2, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = invalidClickthroughUrl.url;
                }
                if ((i10 & 2) != 0) {
                    str2 = invalidClickthroughUrl.customCause;
                }
                if ((i10 & 4) != 0) {
                    th2 = invalidClickthroughUrl.throwable;
                }
                return invalidClickthroughUrl.copy(str, str2, th2);
            }

            @m
            public final String component1() {
                return this.url;
            }

            @m
            public final String component2() {
                return this.customCause;
            }

            @m
            public final Throwable component3() {
                return this.throwable;
            }

            @l
            public final InvalidClickthroughUrl copy(@m String str, @m String str2, @m Throwable th2) {
                return new InvalidClickthroughUrl(str, str2, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvalidClickthroughUrl)) {
                    return false;
                }
                InvalidClickthroughUrl invalidClickthroughUrl = (InvalidClickthroughUrl) obj;
                return m0.g(this.url, invalidClickthroughUrl.url) && m0.g(this.customCause, invalidClickthroughUrl.customCause) && m0.g(this.throwable, invalidClickthroughUrl.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @m
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th2 = this.throwable;
                return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
            }

            public InvalidClickthroughUrl(@m String str, @m String str2, @m Throwable th2) {
                super("CB_502", "CB_RENDER_INVALID_CLICKTHROUGH_URL", "Clickthrough has failed.", "Invalid or unrecognized clickthrough. URL: " + (str == null ? "unknown" : str) + ". Details: " + (str2 == null ? "" : str2), "N/A", th2, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class MissingSkanParameters extends Render {

            @l
            public static final MissingSkanParameters INSTANCE = new MissingSkanParameters();

            private MissingSkanParameters() {
                super("CB_507", "CB_RENDER_MISSING_SKAN_PARAMETERS", "Ad rendering has failed.", "SKAN attribution parameters are missing for the store product view controller.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof MissingSkanParameters);
            }

            public int hashCode() {
                return 287695565;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Render {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_500", "CB_RENDER_UNKNOWN_ERROR", "Ad rendering has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class VideoPlaybackError extends Render {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ VideoPlaybackError(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ VideoPlaybackError copy$default(VideoPlaybackError videoPlaybackError, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = videoPlaybackError.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = videoPlaybackError.throwable;
                }
                return videoPlaybackError.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final VideoPlaybackError copy(@m String str, @m Throwable th2) {
                return new VideoPlaybackError(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VideoPlaybackError)) {
                    return false;
                }
                VideoPlaybackError videoPlaybackError = (VideoPlaybackError) obj;
                return m0.g(this.customCause, videoPlaybackError.customCause) && m0.g(this.throwable, videoPlaybackError.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public VideoPlaybackError(@m String str, @m Throwable th2) {
                super("CB_501", "CB_RENDER_VIDEO_PLAYBACK_ERROR", "Ad rendering has failed.", "There was an error with the video player. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class WebViewMraidUnload extends Render {

            @l
            public static final WebViewMraidUnload INSTANCE = new WebViewMraidUnload();

            private WebViewMraidUnload() {
                super("CB_505", "CB_RENDER_WEBVIEW_MRAID_UNLOAD", "Ad rendering has failed.", "MRAID requested unloading the ad.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof WebViewMraidUnload);
            }

            public int hashCode() {
                return 886330629;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class WebViewTerminated extends Render {

            @l
            public static final WebViewTerminated INSTANCE = new WebViewTerminated();

            private WebViewTerminated() {
                super("CB_506", "CB_RENDER_WEBVIEW_TERMINATED", "Ad rendering has failed.", "Web content process terminated.", "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof WebViewTerminated);
            }

            public int hashCode() {
                return -756667756;
            }
        }

        public /* synthetic */ Render(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Render(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Show extends ChartboostError {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AdExpired extends Show {

            @l
            public static final AdExpired INSTANCE = new AdExpired();

            private AdExpired() {
                super("CB_402", "CB_SHOW_AD_EXPIRED", "Ad show has failed.", "Ad has expired.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof AdExpired);
            }

            public int hashCode() {
                return 1688594849;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AdInvalidated extends Show {

            @l
            public static final AdInvalidated INSTANCE = new AdInvalidated();

            private AdInvalidated() {
                super("CB_403", "CB_SHOW_AD_INVALIDATED", "Ad show has failed.", "Ad has been invalidated.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof AdInvalidated);
            }

            public int hashCode() {
                return 860330757;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class AssetUnavailable extends Show {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            @m
            private final String url;

            public /* synthetic */ AssetUnavailable(String str, String str2, Throwable th2, int i10, x xVar) {
                this(str, str2, (i10 & 4) != 0 ? null : th2);
            }

            public static /* synthetic */ AssetUnavailable copy$default(AssetUnavailable assetUnavailable, String str, String str2, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = assetUnavailable.url;
                }
                if ((i10 & 2) != 0) {
                    str2 = assetUnavailable.customCause;
                }
                if ((i10 & 4) != 0) {
                    th2 = assetUnavailable.throwable;
                }
                return assetUnavailable.copy(str, str2, th2);
            }

            @m
            public final String component1() {
                return this.url;
            }

            @m
            public final String component2() {
                return this.customCause;
            }

            @m
            public final Throwable component3() {
                return this.throwable;
            }

            @l
            public final AssetUnavailable copy(@m String str, @m String str2, @m Throwable th2) {
                return new AssetUnavailable(str, str2, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AssetUnavailable)) {
                    return false;
                }
                AssetUnavailable assetUnavailable = (AssetUnavailable) obj;
                return m0.g(this.url, assetUnavailable.url) && m0.g(this.customCause, assetUnavailable.customCause) && m0.g(this.throwable, assetUnavailable.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @m
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.customCause;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                Throwable th2 = this.throwable;
                return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
            }

            public AssetUnavailable(@m String str, @m String str2, @m Throwable th2) {
                super("CB_407", "CB_SHOW_ASSET_UNAVAILABLE", "Ad show has failed.", "Asset is unavailable. URL: " + (str == null ? "unknown" : str) + ". Details: " + (str2 == null ? "" : str2), "N/A", th2, null);
                this.url = str;
                this.customCause = str2;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Disabled extends Show {

            @l
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("CB_408", "CB_SHOW_DISABLED", "Ad show has failed.", "Ad showing has been disabled by the server.", "Update to a newer Chartboost Monetization SDK version or contact Chartboost Support for assistance.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof Disabled);
            }

            public int hashCode() {
                return -1176459651;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class FullscreenAlreadyShowing extends Show {

            @l
            public static final FullscreenAlreadyShowing INSTANCE = new FullscreenAlreadyShowing();

            private FullscreenAlreadyShowing() {
                super("CB_405", "CB_SHOW_FULLSCREEN_ALREADY_SHOWING", "Ad show has failed.", "A fullscreen ad is already showing.", "Dismiss the fullscreen ad before presenting another one.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof FullscreenAlreadyShowing);
            }

            public int hashCode() {
                return 1980416745;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoAd extends Show {

            @l
            public static final NoAd INSTANCE = new NoAd();

            private NoAd() {
                super("CB_401", "CB_SHOW_NO_AD", "Ad show has failed.", "No loaded ad to show.", "Try loading another ad and ensure it is ready before it's shown.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoAd);
            }

            public int hashCode() {
                return -1841414587;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NoContext extends Show {

            @l
            public static final NoContext INSTANCE = new NoContext();

            private NoContext() {
                super("CB_404", "CB_SHOW_NO_CONTEXT", "Ad show has failed.", "No Activity provided to show the ad.", "Ensure that a valid Context is provided when showing ads.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NoContext);
            }

            public int hashCode() {
                return -376633139;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class NotInitialized extends Show {

            @l
            public static final NotInitialized INSTANCE = new NotInitialized();

            private NotInitialized() {
                super("CB_409", "CB_SHOW_NOT_INITIALIZED", "Ad show has failed.", "SDK initialization not started or still in progress.", "Ensure the Chartboost Monetization SDK has completed initialization before showing ads.", null, null);
            }

            public boolean equals(@m Object obj) {
                return this == obj || (obj instanceof NotInitialized);
            }

            public int hashCode() {
                return -307078846;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class TimedOut extends Show {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ TimedOut(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ TimedOut copy$default(TimedOut timedOut, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = timedOut.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = timedOut.throwable;
                }
                return timedOut.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final TimedOut copy(@m String str, @m Throwable th2) {
                return new TimedOut(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TimedOut)) {
                    return false;
                }
                TimedOut timedOut = (TimedOut) obj;
                return m0.g(this.customCause, timedOut.customCause) && m0.g(this.throwable, timedOut.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public TimedOut(@m String str, @m Throwable th2) {
                super("CB_406", "CB_SHOW_TIMED_OUT", "Ad show has failed.", "Operation has timed out. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Unknown extends Show {

            @m
            private final String customCause;

            @m
            private final Throwable throwable;

            public /* synthetic */ Unknown(String str, Throwable th2, int i10, x xVar) {
                this(str, (i10 & 2) != 0 ? null : th2);
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, Throwable th2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unknown.customCause;
                }
                if ((i10 & 2) != 0) {
                    th2 = unknown.throwable;
                }
                return unknown.copy(str, th2);
            }

            @m
            public final String component1() {
                return this.customCause;
            }

            @m
            public final Throwable component2() {
                return this.throwable;
            }

            @l
            public final Unknown copy(@m String str, @m Throwable th2) {
                return new Unknown(str, th2);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj;
                return m0.g(this.customCause, unknown.customCause) && m0.g(this.throwable, unknown.throwable);
            }

            @m
            public final String getCustomCause() {
                return this.customCause;
            }

            @m
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                String str = this.customCause;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.throwable;
                return iHashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public Unknown(@m String str, @m Throwable th2) {
                super("CB_400", "CB_SHOW_UNKNOWN_ERROR", "Ad show has failed.", "An unknown error has occurred. " + (str == null ? "" : str), "Try again. If the problem persists, contact Chartboost Support and provide your console logs.", th2, null);
                this.customCause = str;
                this.throwable = th2;
            }
        }

        public /* synthetic */ Show(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
            this(str, str2, str3, str4, str5, th2);
        }

        private Show(String str, String str2, String str3, String str4, String str5, Throwable th2) {
            super(str, str2, str3, str4, str5, th2, null);
        }
    }

    public /* synthetic */ ChartboostError(String str, String str2, String str3, String str4, String str5, Throwable th2, x xVar) {
        this(str, str2, str3, str4, str5, th2);
    }

    @Override // java.lang.Throwable
    @m
    public Throwable getCause() {
        return this.cause;
    }

    @l
    public final String getCauseDescription() {
        return this.causeDescription;
    }

    @l
    public final String getCode() {
        return this.code;
    }

    @l
    public final String getConstant() {
        return this.constant;
    }

    @Override // java.lang.Throwable
    @l
    public String getMessage() {
        return this.message;
    }

    @l
    public final String getResolution() {
        return this.resolution;
    }

    @Override // java.lang.Throwable
    @l
    public final String toString() {
        return "ChartboostError(code='" + this.code + "', constant='" + this.constant + "', message='" + getMessage() + "', causeDescription='" + this.causeDescription + "', resolution='" + this.resolution + "', cause=" + getCause() + j.f86771d;
    }

    private ChartboostError(String str, String str2, String str3, String str4, String str5, Throwable th2) {
        super(str3, th2);
        this.code = str;
        this.constant = str2;
        this.message = str3;
        this.causeDescription = str4;
        this.resolution = str5;
        this.cause = th2;
    }
}
