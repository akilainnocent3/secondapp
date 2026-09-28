package com.sportygames.compose.lobbyv2.models;

import defpackage.gbh0;
import defpackage.rcn;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001#B5\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006$"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/UIState;", "T", "", "Lgbh0;", "uiStatus", "data", "Lrcn;", "", "additionalInfo", "<init>", "(Lgbh0;Ljava/lang/Object;Lrcn;)V", "component1", "()Lgbh0;", "component2", "()Ljava/lang/Object;", "component3", "()Lrcn;", "copy", "(Lgbh0;Ljava/lang/Object;Lrcn;)Lcom/sportygames/compose/lobbyv2/models/UIState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgbh0;", "getUiStatus", "Ljava/lang/Object;", "getData", "Lrcn;", "getAdditionalInfo", "Companion", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UIState<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final rcn<String, String> additionalInfo;
    private final T data;
    private final gbh0 uiStatus;

    /* JADX INFO: renamed from: com.sportygames.compose.lobbyv2.models.UIState$a, reason: from kotlin metadata */
    public static final class Companion {
        public static UIState a(Companion companion) {
            companion.getClass();
            return new UIState(gbh0.d, null, null, 2, null);
        }

        public static UIState b() {
            return new UIState(null, null, null, 7, null);
        }

        public static UIState c(Object obj) {
            return new UIState(gbh0.c, obj, null, 4, null);
        }

        public static UIState d() {
            return new UIState(gbh0.b, null, null, 6, null);
        }
    }

    public /* synthetic */ UIState(gbh0 gbh0Var, Object obj, rcn rcnVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? gbh0.a : gbh0Var, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : rcnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UIState copy$default(UIState uIState, gbh0 gbh0Var, Object obj, rcn rcnVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            gbh0Var = uIState.uiStatus;
        }
        if ((i & 2) != 0) {
            obj = uIState.data;
        }
        if ((i & 4) != 0) {
            rcnVar = uIState.additionalInfo;
        }
        return uIState.copy(gbh0Var, obj, rcnVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final gbh0 getUiStatus() {
        return this.uiStatus;
    }

    public final T component2() {
        return this.data;
    }

    public final rcn<String, String> component3() {
        return this.additionalInfo;
    }

    public final UIState<T> copy(gbh0 uiStatus, T data, rcn<String, String> additionalInfo) {
        uiStatus.getClass();
        return new UIState<>(uiStatus, data, additionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UIState)) {
            return false;
        }
        UIState uIState = (UIState) other;
        return this.uiStatus == uIState.uiStatus && Intrinsics.g(this.data, uIState.data) && Intrinsics.g(this.additionalInfo, uIState.additionalInfo);
    }

    public final rcn<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final T getData() {
        return this.data;
    }

    public final gbh0 getUiStatus() {
        return this.uiStatus;
    }

    public int hashCode() {
        int iHashCode = this.uiStatus.hashCode() * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        rcn<String, String> rcnVar = this.additionalInfo;
        return iHashCode2 + (rcnVar != null ? rcnVar.hashCode() : 0);
    }

    public String toString() {
        return "UIState(uiStatus=" + this.uiStatus + ", data=" + this.data + ", additionalInfo=" + this.additionalInfo + ")";
    }

    public UIState(gbh0 gbh0Var, T t, rcn<String, String> rcnVar) {
        gbh0Var.getClass();
        this.uiStatus = gbh0Var;
        this.data = t;
        this.additionalInfo = rcnVar;
    }

    public UIState() {
        this(null, null, null, 7, null);
    }
}
