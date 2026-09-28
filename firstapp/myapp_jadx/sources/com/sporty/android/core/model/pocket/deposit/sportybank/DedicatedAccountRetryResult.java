package com.sporty.android.core.model.pocket.deposit.sportybank;

import com.twilio.voice.EventKeys;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult;", "", "<init>", "()V", "Success", "NeedBVN", "Failed", "FetchFailed", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$Failed;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$FetchFailed;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$NeedBVN;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$Success;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class DedicatedAccountRetryResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$Failed;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult;", EventKeys.ERROR_MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failed extends DedicatedAccountRetryResult {
        private final String message;

        public Failed(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.message;
            }
            return failed.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Failed copy(String message) {
            return new Failed(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.g(this.message, ((Failed) other).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return tug.a("Failed(message=", this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$FetchFailed;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FetchFailed extends DedicatedAccountRetryResult {
        public static final FetchFailed INSTANCE = new FetchFailed();

        private FetchFailed() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FetchFailed);
        }

        public int hashCode() {
            return 1539331026;
        }

        public String toString() {
            return "FetchFailed";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$NeedBVN;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NeedBVN extends DedicatedAccountRetryResult {
        public static final NeedBVN INSTANCE = new NeedBVN();

        private NeedBVN() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof NeedBVN);
        }

        public int hashCode() {
            return -1424408609;
        }

        public String toString() {
            return "NeedBVN";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult$Success;", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountRetryResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success extends DedicatedAccountRetryResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -825633346;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ DedicatedAccountRetryResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DedicatedAccountRetryResult() {
    }
}
