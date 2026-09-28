package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult;", "", "<init>", "()V", "Success", "Failure", "FetchFailure", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$Failure;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$FetchFailure;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$Success;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class DedicatedAccountDeleteResult {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$FetchFailure;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FetchFailure extends DedicatedAccountDeleteResult {
        public static final FetchFailure INSTANCE = new FetchFailure();

        private FetchFailure() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FetchFailure);
        }

        public int hashCode() {
            return -1272516870;
        }

        public String toString() {
            return "FetchFailure";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$Success;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success extends DedicatedAccountDeleteResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -1059086279;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ DedicatedAccountDeleteResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DedicatedAccountDeleteResult() {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult$Failure;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountDeleteResult;", "throwable", "", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "getThrowable", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failure extends DedicatedAccountDeleteResult {
        private final String message;
        private final Throwable throwable;

        public Failure(Throwable th, String str) {
            super(null);
            this.throwable = th;
            this.message = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            if ((i & 2) != 0) {
                str = failure.message;
            }
            return failure.copy(th, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Failure copy(Throwable throwable, String message) {
            return new Failure(throwable, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.g(this.throwable, failure.throwable) && Intrinsics.g(this.message, failure.message);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            Throwable th = this.throwable;
            int iHashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.message;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ", message=" + this.message + ")";
        }

        public /* synthetic */ Failure(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th, str);
        }
    }
}
