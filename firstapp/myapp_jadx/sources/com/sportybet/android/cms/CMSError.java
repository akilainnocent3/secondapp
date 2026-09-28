package com.sportybet.android.cms;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000bÊ\u0001\u0002\b\rÊ\u0001\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/sportybet/android/cms/CMSError;", "", "cause", "", "<init>", "(Ljava/lang/String;)V", "StringArgNotMatch", "LocalStringError", "ResourceNotFound", "Lcom/sportybet/android/cms/CMSError$LocalStringError;", "Lcom/sportybet/android/cms/CMSError$ResourceNotFound;", "Lcom/sportybet/android/cms/CMSError$StringArgNotMatch;", "common-ui", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CMSError extends Throwable {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\u0002\b\u0007Ê\u0001\f\b\b\u0012\b\b\t\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/cms/CMSError$LocalStringError;", "Lcom/sportybet/android/cms/CMSError;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "common-ui", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LocalStringError extends CMSError {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalStringError(Throwable th) {
            super("Local string error: " + th, null);
            th.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\u0002\b\u0007Ê\u0001\f\b\b\u0012\b\b\t\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/cms/CMSError$ResourceNotFound;", "Lcom/sportybet/android/cms/CMSError;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "common-ui", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ResourceNotFound extends CMSError {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceNotFound(Throwable th) {
            super("Resource not found: " + th, null);
            th.getClass();
        }
    }

    public /* synthetic */ CMSError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private CMSError(String str) {
        super(str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\tÊ\u0001\f\b\n\u0012\b\b\u000b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/sportybet/android/cms/CMSError$StringArgNotMatch;", "Lcom/sportybet/android/cms/CMSError;", "version", "", "<init>", "(J)V", "getVersion", "()J", "common-ui", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class StringArgNotMatch extends CMSError {
        public static final int $stable = 8;
        private final long version;

        public /* synthetic */ StringArgNotMatch(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? -1L : j);
        }

        public final long getVersion() {
            return this.version;
        }

        public StringArgNotMatch(long j) {
            super("Argument not match", null);
            this.version = j;
        }

        public StringArgNotMatch() {
            this(0L, 1, null);
        }
    }
}
