package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveVideoError extends InneractiveError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Error f44594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f44595b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private String errorString;
        private boolean isFatal;

        Error(String str, boolean z10) {
            this.errorString = str;
            this.isFatal = z10;
        }

        public String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f44594a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.f44595b == null) {
            return this.f44594a.getErrorString();
        }
        return this.f44594a.getErrorString() + ": " + this.f44595b;
    }

    public Throwable getCause() {
        return this.f44595b;
    }

    public Error getPlayerError() {
        return this.f44594a;
    }

    public InneractiveVideoError(Error error, Throwable th2) {
        this(error);
        this.f44595b = th2;
    }
}
